grammar BasForCCal;
options {backtrack=true; memoize=true;}
@header{
package BasForCCal;
import java.io.*;
}
@members{
boolean isExtends=false, isImp=false;
int intCount=0;
int methodCount = 0;
boolean isMethodMember = false, isDataMember = false,isClassObject= false;
static String finalExtraction = "";
static BufferedWriter writer;
String methodname = "",descendantname="",search="",search1="";
ArrayList<String> methodcalls = new ArrayList<>();
ArrayList<String> descendants = new ArrayList<>();
ArrayList<String> ancestors = new ArrayList<>();
String key ="", descendantkey="", ancestorkey="";
Map<String,List<String>> map = new HashMap<>();
Map<String,List<String>> descendantmap = new HashMap<>();
static Map<String,List<String>> ancestormap = new HashMap<>();
boolean formalParameter=false;
boolean variableDeclare=false;
boolean isMethodVariable=false;
ArrayList<String> aggregates = new ArrayList<String>();
ArrayList<String> associates = new ArrayList<String>();
HashMap<String, DataMember> dataMembers = new HashMap<String,DataMember>();
String className="";
static HashMap<String, ModelClass> premaint = new HashMap<>();
static HashMap<String, ModelClass> postmaint = new HashMap<>();
HashMap<String, ModelClass> classmodel = new HashMap<String, ModelClass>();
ArrayList<MethodMember> methodnamelist = new ArrayList<>();
String methodName = "", datamem="";
ModelClass m;
DataMember dm ;
MethodMember mm;

public void printData(List<String> str, String tabs)
     	{
     		for(String methodcall : str)
     		{
     			System.out.println(tabs+ " ->"+methodcall);
     			finalExtraction = finalExtraction + tabs +( "\n \t ->"+methodcall);
     			String[] arr = methodcall.split("\\.");
     			if(arr.length!= 0 &&map.containsKey(arr[arr.length - 1]) && methodCount ==0)
     			{
     				methodCount =1;
     				printData(map.get(arr[arr.length - 1]), tabs+"\t");
     			}
     			else if(map.containsKey(methodcall)&& methodCount ==0)
     			{
     				methodCount =1;
     				printData(map.get(methodcall), tabs+"\t");
     			}
     		}
     	}

}
@lexer::header{
package BasForCCal;
}
@lexer::members {
  protected boolean enumIsKeyword = true;
  protected boolean assertIsKeyword = true;
}

// starting point for parsing a java file
/* The annotations are separated out to make parsing faster, but must be associated with
   a packageDeclaration or a typeDeclaration (and not an empty one). */
compilationUnit[String path, boolean flag, boolean isPost]
    :   annotations
        (   packageDeclaration importDeclaration* typeDeclaration*
        |   classOrInterfaceDeclaration typeDeclaration*
        )
    |   {if(flag == true) finalExtraction = ""; }packageDeclaration? importDeclaration* typeDeclaration*

     	{


     	for(Map.Entry<String, List<String>> entry : map.entrySet())
     	{	
     		System.out.println("Method Calls:"+entry.getKey());
     		finalExtraction = finalExtraction + ("\nMethod Calls:"+entry.getKey());
     		for(String methodcall : entry.getValue())
     		{
     			System.out.println("\t"+methodcall);
     			finalExtraction = finalExtraction + ("\n\t"+methodcall);
     			String[] arr = methodcall.split("\\.");
     			if(arr.length!= 0 && map.containsKey(arr[arr.length - 1]))
     			{
     				printData(map.get(arr[arr.length - 1]),"\t");
     			}
     			else if(map.containsKey(methodcall))
     			{
     				printData(map.get(methodcall),"\t");
     			}
     		}
     	}
     	
     	search = "Descendants of" ;
     	int in=0,count=0;
     	StringBuffer str = new StringBuffer(finalExtraction);
     	  while (true) {
           
           in = finalExtraction.indexOf(search, in);
               if (in != -1) {
     	 	for(int i=0; i<finalExtraction.length();i++){
     	 	
           	if(in == i){
           	  
           		String cls = finalExtraction.substring(i + 15, finalExtraction.indexOf(":", i));
           		
            		int ind1 = i+15+cls.length()+1;
          		if(descendantmap.containsKey(cls)){
          		
				str.insert(ind1, descendantmap.get(cls)); 
				
			}
               		finalExtraction = str.toString();
               
            	}
            	}
            	count ++;
                in += search.length();
            	
            	} else {
                	break;
            	}   
        }
          	
     
        try{ 
	        writer= new BufferedWriter(new FileWriter(path)); 
	        finalExtraction = finalExtraction + "/n Aggregates:";
	        for (String agg: aggregates) {
        	     finalExtraction = finalExtraction + "/n"+agg;
        	    }
        	finalExtraction = finalExtraction + "/n Associates:";
	        for (String ass: associates) {
        	     finalExtraction = finalExtraction + "/n"+ass;
        	    }
        	finalExtraction = finalExtraction + "/n /n";
		String[] words = finalExtraction.split("/n");
        	for (String word: words) {
        	     writer.write(word);
        	             	     writer.newLine();
        	    }
        	    
      		writer.close();
      		m.aggregates.addAll(aggregates);
      		m.associates.addAll(associates);
      		map.put(key,methodcalls);
		m.setMethodMember(methodnamelist);
		m.setDataMembers(dataMembers);
		classmodel.put(className, m);
      		if(isPost){
      			postmaint.putAll(classmodel);
      			
      		}else{
      			premaint.putAll(classmodel);
      		}
      		}catch(Exception ex){}}; 
packageDeclaration
    :   'package' qualifiedName ';'
    ;
    
importDeclaration
    :   'import' 'static'? qualifiedName ('.' '*')? ';'
    ;
    
typeDeclaration
    :   classOrInterfaceDeclaration
    |   ';'
    ;
    
classOrInterfaceDeclaration
    :   classOrInterfaceModifiers (classDeclaration | interfaceDeclaration)
    ;
    
classOrInterfaceModifiers
    :   classOrInterfaceModifier*
    ;

classOrInterfaceModifier
    :   annotation   // class or interface
    |   'public' {System.out.println("  public "); finalExtraction = finalExtraction + "\n  public ";}
    |   'protected' {System.out.println("  protected "); finalExtraction = finalExtraction + "\n  protected ";}
    |   'private' {System.out.println("  private "); finalExtraction = finalExtraction + "\n  private ";}
    |   'static' {System.out.print("  static "); finalExtraction = finalExtraction + "  static ";}
    |   'abstract' {System.out.print("  abstract "); finalExtraction = finalExtraction + " abstract ";}
    |   'final' {System.out.print("  final "); finalExtraction = finalExtraction + "  final ";}
    |   'strictfp' {System.out.print("  strictfp "); finalExtraction = finalExtraction + "  strictfp ";}
    ;

modifiers
    :   modifier*
    ;

classDeclaration
    :   normalClassDeclaration
    |   enumDeclaration
    ;
    
normalClassDeclaration
    :   'class' Identifier {System.out.print("Class:"+$Identifier.text); 
    			finalExtraction = finalExtraction + ("Class:"+$Identifier.text);
    			isMethodMember=false; isDataMember=false;isMethodVariable=false;isClassObject = false;
    			m = new ModelClass(); dm = new DataMember(); dataMembers= new HashMap<String,DataMember>();
    			className = $Identifier.text;} typeParameters?
        ('extends' {isExtends=true; descendants = new ArrayList<>(); ancestors = new ArrayList<>();
        descendantname = $Identifier.text; ancestorkey = $Identifier.text;} type)?
        ('implements'{isImp= true;} typeList)?
        { System.out.println("  Descendants of " +$Identifier.text+":");finalExtraction = finalExtraction + ("\n  Descendants of "+$Identifier.text+":");
         if(!isDataMember){isDataMember = true;  System.out.println(" Data Members: ");
        finalExtraction = finalExtraction + ("\n  Data Members: \n");}}classBody
       
    ;
    
typeParameters
    :   '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    :   Identifier ('extends' typeBound)?
    ;
        
typeBound
    :   type ('&' type)*
    ;

enumDeclaration
    :   ENUM Identifier ('implements' typeList)? enumBody
    ;

enumBody
    :   '{' enumConstants? ','? enumBodyDeclarations? '}'
    ;

enumConstants
    :   enumConstant (',' enumConstant)*
    ;
    
enumConstant
    :   annotations? Identifier arguments? classBody?
    ;
    
enumBodyDeclarations
    :   ';' (classBodyDeclaration)*
    ;
    
interfaceDeclaration
    :   normalInterfaceDeclaration
    |   annotationTypeDeclaration
    ;
    
normalInterfaceDeclaration
    :   'interface' Identifier {System.out.println("interface "+$Identifier.text+"\n");
    				finalExtraction = finalExtraction + ("\ninterface "+$Identifier.text+"\n" ); } typeParameters? ('extends' typeList)? interfaceBody
    ;
    
typeList
    :   type (',' type)*
    ;
    
classBody
    :   '{' classBodyDeclaration* '}' 
    ;
    
interfaceBody
    :   '{' interfaceBodyDeclaration* '}'
    ;

classBodyDeclaration
    :   ';'  
    |   'static'? block
    |  {isMethodVariable = false;}  memberDecl
    ;
    
memberDecl 
    :   modifiers genericMethodOrConstructorDecl
    |   memberDeclaration 
    |  { if(!isMethodMember){ isMethodMember = true;  System.out.println(" Method Members: ");  mm.args =""; mm.modifier = "";
    				finalExtraction = finalExtraction + ("\n  Method Members: \n");}}modifiers 'void' Identifier {mm.type="void ";  System.out.print("void "+$Identifier.text); mm.name =$Identifier.text;  if(!key.equals("")){map.put(key,methodcalls); } key = $Identifier.text; methodcalls = new ArrayList<>();
    				finalExtraction = finalExtraction + ("void "+$Identifier.text );} voidMethodDeclaratorRest
    |  { if(!isMethodMember){ isMethodMember = true;  System.out.println(" Method Members: "); mm.args =""; mm.modifier = "";
    				finalExtraction = finalExtraction + ("\n  Method Members: \n");}}modifiers Identifier { mm.name =$Identifier.text; System.out.print($Identifier.text);
    				finalExtraction = finalExtraction + $Identifier.text; } constructorDeclaratorRest
    				    |  { if(!isMethodMember){ isMethodMember = true;  System.out.println(" Method Members: ");
    				finalExtraction = finalExtraction + ("\n  Method Members: \n");}}modifiers interfaceDeclaration
    |  { if(!isMethodMember){ isMethodMember = true;  System.out.println(" Method Members: "); 
    				finalExtraction = finalExtraction + ("\n  Method Members: \n");}}modifiers classDeclaration
    ;
    
memberDeclaration
    :   ({ if(!isMethodMember){ isMethodMember = true;  System.out.println(" Method Members: "); 
    				finalExtraction = finalExtraction + ("\n  Method Members: \n");} mm.args =""; mm.modifier = "";} modifiers type methodDeclaration | modifiers{variableDeclare=true; isClassObject = true;} type fieldDeclaration)
    ;

genericMethodOrConstructorDecl
    :    typeParameters genericMethodOrConstructorRest
    ;
    
genericMethodOrConstructorRest
    :   (type | 'void') Identifier methodDeclaratorRest
    |   Identifier constructorDeclaratorRest
    ;

methodDeclaration
    :   Identifier {System.out.print($Identifier.text); mm.name =$Identifier.text; if(!key.equals("")){map.put(key,methodcalls);} key = $Identifier.text; methodcalls = new ArrayList<>();  finalExtraction = finalExtraction + $Identifier.text ;} methodDeclaratorRest
    ;

fieldDeclaration
    :   variableDeclarators ';'
    ;
        
interfaceBodyDeclaration
    :   modifiers interfaceMemberDecl
    |   ';'
    ;

interfaceMemberDecl
    :   interfaceMethodOrFieldDecl
    |   interfaceGenericMethodDecl
    |   'void' Identifier {System.out.print("void "+$Identifier.text); finalExtraction = finalExtraction + ("void "+$Identifier.text );} voidInterfaceMethodDeclaratorRest
    |   Identifier {System.out.print($Identifier.text); finalExtraction = finalExtraction + ($Identifier.text );} interfaceDeclaration
    |   classDeclaration
    ;
    
interfaceMethodOrFieldDecl
    :  {isClassObject = true;} type Identifier {System.out.print($Identifier.text); finalExtraction = finalExtraction + ($Identifier.text ); } interfaceMethodOrFieldRest
    ;
    
interfaceMethodOrFieldRest
    :   constantDeclaratorsRest ';'
    |   interfaceMethodDeclaratorRest
    ;
    
methodDeclaratorRest
    :   formalParameters ('[' ']')*
        ('throws' qualifiedNameList)?
        (   methodBody
        |   ';'
        )
    ;
    
voidMethodDeclaratorRest
    :   formalParameters ('throws' qualifiedNameList)?
        (   methodBody
        |   ';'
        )
    ;
    
interfaceMethodDeclaratorRest
    :   {formalParameter=true;} formalParameters ('[' ']')* ('throws' qualifiedNameList)? ';'
    ;
    
interfaceGenericMethodDecl
    :   typeParameters (type | 'void') Identifier {System.out.print($Identifier.text); finalExtraction = finalExtraction + ($Identifier.text );}
        interfaceMethodDeclaratorRest
    ;
    
voidInterfaceMethodDeclaratorRest
    :   {formalParameter=true;} formalParameters ('throws' qualifiedNameList)? ';'
    ;
    
constructorDeclaratorRest
    :   {formalParameter=true;} formalParameters ('throws' qualifiedNameList)? constructorBody
    ;

constantDeclarator
    :   Identifier constantDeclaratorRest 
    ;
    
variableDeclarators
    :   variableDeclarator (',' {System.out.print(", "); finalExtraction = finalExtraction + ", " ; } variableDeclarator)* 
    ;

variableDeclarator
    :   Identifier {isClassObject= false;System.out.print($Identifier.text+"\n");finalExtraction = finalExtraction + ($Identifier.text+" " );
    dataMembers.put($Identifier.text,dm); dm= new DataMember(); } variableDeclaratorId ('=' variableInitializer)?
    ;
    
constantDeclaratorsRest
    :   constantDeclaratorRest (',' constantDeclarator)*
    ;

constantDeclaratorRest
    : {isClassObject= false;}  ('[' ']')* '=' variableInitializer
    ;
    
variableDeclaratorId
    :   ('[' ']')* 
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;
        
arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

modifier
    :   annotation
    |   'public' {System.out.print("  public "); finalExtraction = finalExtraction + "  public ";  methodName += "public ";  dm.access= "public ";}
    |   'protected' {System.out.print("  protected "); finalExtraction = finalExtraction + "  protected "; methodName+="protected "; dm.access="protected ";}
    |   'private' {System.out.print("  private "); finalExtraction = finalExtraction + "  private "; methodName+="private ";dm.access="private ";}
    |   'static' {System.out.print("  static "); finalExtraction = finalExtraction + "  static ";  methodName+=" static ";dm.access+=" static ";}
    |   'abstract' {System.out.print("  abstract "); finalExtraction = finalExtraction + " abstract "; methodName+=" abstract ";dm.access+=" abstract ";}
    |   'final' {System.out.print("  final "); finalExtraction = finalExtraction + "  final "; methodName+=" final ";dm.access+=" final ";}
    |   'native' {System.out.print("  native "); finalExtraction = finalExtraction + "  native "; methodName+="native ";dm.access+="native ";}
    |   'synchronized' {System.out.print("  synchronized "); finalExtraction = finalExtraction + "  synchronized "; methodName+="synchronized ";dm.access+="synchronized ";}
    |   'transient' {System.out.print("  transient "); finalExtraction = finalExtraction + "  transient "; methodName+="transient ";dm.access +="transient ";}
    |   'volatile' {System.out.print("  volatile "); finalExtraction = finalExtraction + "  volatile "; methodName+="volatile ";dm.access+="volatile ";}
    |   'strictfp' {System.out.print("  strictfp "); finalExtraction = finalExtraction + "  strictfp "; methodName+=" strictfp ";dm.access+=" strictfp ";}
    ;

    

packageOrTypeName
    :   qualifiedName
    ;

enumConstantName
    :   Identifier
    ;

typeName
    :   qualifiedName
    ;

type
	:	classOrInterfaceType ('[' ']')*
	|	primitiveType ('[' ']')*
	;

classOrInterfaceType
	:	I1=Identifier {if(isExtends){ 
		                      
	                    	ancestors.add($I1.text);
	                        if(ancestormap.containsKey($I1.text)){
	                       		ancestors.addAll(ancestormap.get($I1.text));
	                       		ancestormap.put(ancestorkey,ancestors);
	                       	}else{
	                       		ancestormap.put(ancestorkey,ancestors);
	                       	}
	                       	m.setAncestors($I1.text);
	                       	
	                     
	                       	System.out.println("Ancestor classes:  "+ ancestors); 
	                      	finalExtraction = finalExtraction + "\n  Ancestor classes: "+ancestors;
	                      	isExtends=false;
	                          descendantkey = $I1.text;
	                          if(descendantmap.containsKey(descendantkey)){
	                          	descendantmap.get(descendantkey).add(descendantname);
	                          }else{
	                          	descendants.add(descendantname);
	                          	descendantmap.put(descendantkey,descendants);
	                          }
	                          
	                        } 
	                       else if(isImp){
	                       	  System.out.println("implements "+$I1.text); isExtends=false;
	                       	  isImp=false;
	                       	  finalExtraction = finalExtraction + "\n  implements: "+$I1.text; 
	                       } 
	                       else {
	                       		if(isMethodVariable &&  !isExtends  && !isImp ){
			                       System.out.println("Local variable: ");
			                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
			                       isMethodVariable = false;}
		                       if(!isMethodVariable)
		                       {
			                       if(isClassObject){
						
			                        System.out.print( $I1.text +" ");
			                        finalExtraction = finalExtraction + "    "+$I1.text+" "; 
			                        mm.type= $I1.text;
			                        dm.type = $I1.text;
			                        mm.args+= $I1.text;
			                        isClassObject = false;
			                       }
		                        }
	                        }
	                       if  (!$I1.text.equals("int") && !$I1.text.equals("boolean")&& !$I1.text.equals("char") && !$I1.text.equals("byte")
	                        && !$I1.text.equals("short") && !$I1.text.equals("long") && !$I1.text.equals("float")&&!$I1.text.equals("double")&&!$I1.text.equals("String")){
	                        	if(!aggregates.contains($I1.text)&& !formalParameter && variableDeclare)
	                        		aggregates.add($I1.text); 
	                        	else if(!associates.contains($I1.text)&& isMethodMember && formalParameter){
	                        	   associates.add($I1.text);formalParameter=false;
	                        	}	
	                        }
	                       
	                       }
	         typeArguments? ('.' Identifier typeArguments? )* 
	;

primitiveType
    :   'boolean' {if(isMethodVariable){  System.out.println("Local variable: ");
	                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
	                       isMethodVariable = false; }{System.out.print("boolean "); mm.type="boolean "; mm.args+="boolean "; dm.type="boolean "; finalExtraction = finalExtraction + "boolean ";}}
    |   'char' {if(isMethodVariable){  System.out.println("Local variable: ");
	                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
	                       isMethodVariable = false;}{System.out.print("char "); mm.type="char "; mm.args+="char " ;  dm.type="char "; finalExtraction = finalExtraction + "char ";}}
    |   'byte' {if(isMethodVariable){  System.out.println("Local variable: ");
	                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
	                       isMethodVariable = false;}{System.out.print("byte "); mm.type="byte ";mm.args+="byte " ; dm.type="byte "; finalExtraction = finalExtraction + "byte ";}}
    |   'short' {if(isMethodVariable){  System.out.println("Local variable: ");
	                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
	                       isMethodVariable = false;}{System.out.print("short "); mm.type="short ";mm.args+="short " ; dm.type="short "; finalExtraction = finalExtraction + "short ";}}
    |   'int'  {if(isMethodVariable){  System.out.println("Local variable: ");
	                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
	                       isMethodVariable = false;}{System.out.print("int "); mm.type="int "; mm.args+="int " ; dm.type="int "; intCount++;finalExtraction = finalExtraction + "int ";}}
    |   'long' {if(isMethodVariable){  System.out.println("Local variable: ");
	                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
	                       isMethodVariable = false;}{System.out.print("long "); mm.type="long ";mm.args+="long " ; dm.type="long "; finalExtraction = finalExtraction + "long ";}}
    |   'float' {if(isMethodVariable){  System.out.println("Local variable: ");
	                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
	                       isMethodVariable = false;}{System.out.print("float "); mm.type="float ";mm.args+="float " ; dm.type="float "; finalExtraction = finalExtraction + "float ";}}
    |   'double' {if(isMethodVariable){  System.out.println("Local variable: ");
	                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
	                       isMethodVariable = false;}{System.out.print("double "); mm.type="double ";mm.args+="double " ;dm.type="double "; finalExtraction = finalExtraction + "double ";}}
    ;

variableModifier
    :   'final'  {System.out.print("final "); methodName += "final "; dm.type= "final "; mm.type="final "; mm.args+="final "; finalExtraction = finalExtraction + "final ";}
    |  Identifier annotation //{System.out.print(""+$Identifier.text);}
    ;

typeArguments
    :   '<' typeArgument (',' typeArgument)* '>'
    ;
    
typeArgument
    :   type
    |   '?' (('extends' | 'super') type)?
    ;
    
qualifiedNameList
    :  Identifier qualifiedName (',' qualifiedName)* 
    ;

formalParameters
    :   {System.out.print("("); mm.args += "("; finalExtraction = finalExtraction + "(";}'(' formalParameterDecls? ')' { mm.args += ")"; methodnamelist.add(mm);  mm = new MethodMember(); System.out.println(") \n");finalExtraction = finalExtraction + ") \n";}
    ;
    
formalParameterDecls
    :   {formalParameter = true;isClassObject = true;} variableModifiers type formalParameterDeclsRest
    ;
    
formalParameterDeclsRest
    :  Identifier variableDeclaratorId {System.out.print($Identifier.text);
    finalExtraction = finalExtraction + $Identifier.text;}(',' {System.out.print(",");finalExtraction = finalExtraction + ",";} formalParameterDecls)?  
    |   '...' variableDeclaratorId
    ;
    
methodBody
    :  {if(!isMethodMember){isMethodVariable = true;}isClassObject = true;} block
    ;

constructorBody
    :   '{' explicitConstructorInvocation? blockStatement* '}'
    ;

explicitConstructorInvocation
    :   nonWildcardTypeArguments? ('this' | 'super') arguments ';'
    |   primary '.' nonWildcardTypeArguments? 'super' arguments ';'
    ;


qualifiedName
    :   Identifier ('.' Identifier)*
    ;
    
literal 
    :   integerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   booleanLiteral
    |   'null'
    ;

integerLiteral
    :   HexLiteral
    |   OctalLiteral
    |   DecimalLiteral
    ;

booleanLiteral
    :   'true'
    |   'false'
    ;

// ANNOTATIONS

annotations
    :   annotation+
    ;

annotation
    :   '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
    ;
    
annotationName
    : Identifier ('.' Identifier)*
    ;

elementValuePairs
    :   elementValuePair (',' elementValuePair)*
    ;

elementValuePair
    :  {isClassObject= false;} Identifier '=' elementValue
    ;
    
elementValue
    :   conditionalExpression
    |   annotation
    |   elementValueArrayInitializer
    ;
    
elementValueArrayInitializer
    :   '{' (elementValue (',' elementValue)*)? (',')? '}'
    ;
    
annotationTypeDeclaration
    :   '@' 'interface' Identifier annotationTypeBody
    ;
    
annotationTypeBody
    :   '{' (annotationTypeElementDeclaration)* '}'
    ;
    
annotationTypeElementDeclaration
    :   modifiers annotationTypeElementRest
    ;
    
annotationTypeElementRest
    :   type annotationMethodOrConstantRest ';'
    |   normalClassDeclaration ';'?
    |   normalInterfaceDeclaration ';'?
    |   enumDeclaration ';'?
    |   annotationTypeDeclaration ';'?
    ;
    
annotationMethodOrConstantRest
    :   annotationMethodRest
    |   annotationConstantRest
    ;
    
annotationMethodRest
    :   Identifier '(' ')' defaultValue?
    ;
    
annotationConstantRest
    :   variableDeclarators
    ;
    
defaultValue
    :   'default' elementValue
    ;

// STATEMENTS / BLOCKS

block
    :   '{' blockStatement* '}'
    ;
    
blockStatement
    :  localVariableDeclarationStatement
      | classOrInterfaceDeclaration
      | statement
     
    ;
    
localVariableDeclarationStatement
    :   localVariableDeclaration ';'
    ;

localVariableDeclaration
    :   variableModifiers type variableDeclarators
    ;
    
variableModifiers
    :   variableModifier*
    ;

statement
    : block
    |   ASSERT expression (':' expression)? ';'
    |   'if' parExpression statement (options {k=1;}:'else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'do' statement 'while' parExpression ';'
    |   'try' block
        ( catches 'finally' block
        | catches
        |   'finally' block
        )
    |   'switch' parExpression '{' switchBlockStatementGroups '}'
    |   'synchronized' parExpression block
    |   'return' expression? ';'
    |   'throw' expression ';'
    |   'break' Identifier? ';'
    |   'continue' Identifier? ';'
    |   ';' 
    |   statementExpression ';'
    |   Identifier ':' statement
    ;
    
catches
    :   catchClause (catchClause)*
    ;
    
catchClause
    :   'catch' '(' formalParameter ')' block
    ;

formalParameter
    :   variableModifiers type variableDeclaratorId
    ;
        
switchBlockStatementGroups
    :   (switchBlockStatementGroup)*
    ;
    
/* The change here (switchLabel -> switchLabel+) technically makes this grammar
   ambiguous; but with appropriately greedy parsing it yields the most
   appropriate AST, one in which each group, except possibly the last one, has
   labels and statements. */
switchBlockStatementGroup
    :   switchLabel+ blockStatement*
    ;
    
switchLabel
    :   'case' constantExpression ':'
    |   'case' enumConstantName ':'
    |   'default' ':'
    ;
    
forControl
options {k=3;} // be efficient for common case: for (ID ID : ID) ...
    :   enhancedForControl
    |   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;
    
enhancedForControl
    :   variableModifiers type Identifier ':' expression
    ;

forUpdate
    :   expressionList
    ;

// EXPRESSIONS

parExpression
    :   '(' expression ')'
    ;
    
expressionList
    :   expression (',' expression)*
    ;

statementExpression
    :   expression
    ;
    
constantExpression
    :   expression
    ;
    
expression
    :   conditionalExpression (assignmentOperator expression)?
    ;
    
assignmentOperator
    :   '='
    |   '+='
    |   '-='
    |   '*='
    |   '/='
    |   '&='
    |   '|='
    |   '^='
    |   '%='
    |   ('<' '<' '=')=> t1='<' t2='<' t3='=' 
        { $t1.getLine() == $t2.getLine() &&
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && 
          $t2.getLine() == $t3.getLine() && 
          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() }?
    |   ('>' '>' '>' '=')=> t1='>' t2='>' t3='>' t4='='
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&
          $t2.getLine() == $t3.getLine() && 
          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() &&
          $t3.getLine() == $t4.getLine() && 
          $t3.getCharPositionInLine() + 1 == $t4.getCharPositionInLine() }?
    |   ('>' '>' '=')=> t1='>' t2='>' t3='='
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && 
          $t2.getLine() == $t3.getLine() && 
          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() }?
    ;

conditionalExpression
    :   conditionalOrExpression ( '?' expression ':' expression )?
    ;

conditionalOrExpression
    :   conditionalAndExpression ( '||' conditionalAndExpression )*
    ;

conditionalAndExpression
    :   inclusiveOrExpression ( '&&' inclusiveOrExpression )*
    ;

inclusiveOrExpression
    :   exclusiveOrExpression ( '|' exclusiveOrExpression )*
    ;

exclusiveOrExpression
    :   andExpression ( '^' andExpression )*
    ;

andExpression
    :   equalityExpression ( '&' equalityExpression )*
    ;

equalityExpression
    :   instanceOfExpression ( ('==' | '!=') instanceOfExpression )*
    ;

instanceOfExpression
    :   relationalExpression ('instanceof' type)?
    ;

relationalExpression
    :   shiftExpression ( relationalOp shiftExpression )*
    ;
    
relationalOp
    :   ('<' '=')=> t1='<' t2='=' 
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
    |   ('>' '=')=> t1='>' t2='=' 
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
    |   '<' 
    |   '>' 
    ;

shiftExpression
    :   additiveExpression ( shiftOp additiveExpression )*
    ;

shiftOp
    :   ('<' '<')=> t1='<' t2='<' 
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
    |   ('>' '>' '>')=> t1='>' t2='>' t3='>' 
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&
          $t2.getLine() == $t3.getLine() && 
          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() }?
    |   ('>' '>')=> t1='>' t2='>'
        { $t1.getLine() == $t2.getLine() && 
          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() }?
    ;


additiveExpression
    :   multiplicativeExpression ( ('+' | '-') multiplicativeExpression )*
    ;

multiplicativeExpression
    :   unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
    ;
    
unaryExpression
    :   '+' unaryExpression
    |   '-' unaryExpression
    |   '++' unaryExpression
    |   '--' unaryExpression
    |   unaryExpressionNotPlusMinus
    ;

unaryExpressionNotPlusMinus
    :   '~' unaryExpression
    |   '!' unaryExpression
    |   castExpression
    |   primary selector* ('++'|'--')?
    ;

castExpression
    :  '(' primitiveType ')' unaryExpression
    |  '(' (type | expression) ')' unaryExpressionNotPlusMinus
    ;

primary
    :   parExpression
    |   'this' ('.' Identifier)* identifierSuffix?
    |   'super' superSuffix
    |   literal
    |   'new' creator
    |   Identifier {methodname = $Identifier.text;} trying 
    |   primitiveType ('[' ']')* '.' 'class'
    |   'void' '.' 'class'
    ;
trying	
    :   ('.' Identifier  {isClassObject= true;methodname+= '.'+ $Identifier.text; } )*    identifierSuffix?
    ;	
identifierSuffix
    :    ('[' ']')+ '.' 'class'
    |   ('[' expression ']')+ // can also be matched by selector, but do here
    |   arguments { methodcalls.add(methodname); methodname ="";}
    | 	 '.' 'class'
    |   '.' explicitGenericInvocation
    |   '.' 'this'
    |   '.' 'super' arguments
    |   '.' 'new' innerCreator
    ;

creator
    :   nonWildcardTypeArguments createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :   classOrInterfaceType
    |   primitiveType
    ;
    
innerCreator
    :   nonWildcardTypeArguments Identifier classCreatorRest
    ;

arrayCreatorRest
    :   '['
        (   ']' ('[' ']')* arrayInitializer
        |   expression ']' ('[' expression ']')* ('[' ']')*
        )
    ;

classCreatorRest
    :   arguments classBody?
    ;
    
explicitGenericInvocation
    :   nonWildcardTypeArguments Identifier arguments
    ;
    
nonWildcardTypeArguments
    :   '<' typeList '>'
    ;
    
selector
    :   '.' Identifier arguments?
    |   '.' 'this'
    |   '.' 'super' superSuffix
    |   '.' 'new' innerCreator
    |   '[' expression ']'
    ;
    
superSuffix
    :   arguments
    |   '.' Identifier  {methodname =  $Identifier.text; methodcalls.add(methodname); methodname="";} arguments?
    ;

arguments
    :   '(' expressionList? ')'
    ;

// LEXER

HexLiteral : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? ;

DecimalLiteral : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? ;

OctalLiteral : '0' ('0'..'7')+ IntegerTypeSuffix? ;

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
IntegerTypeSuffix : ('l'|'L') ;

FloatingPointLiteral
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ FloatTypeSuffix
    ;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

CharacterLiteral
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

ENUM:   'enum' {if (!enumIsKeyword) $type=Identifier;}
    ;
    
ASSERT
    :   'assert' {if (!assertIsKeyword) $type=Identifier;}
    ;
    
Identifier 
    :   Letter (Letter|JavaIDDigit)*
    ;

/**I found this char range in JavaCC's grammar, but Letter and Digit overlap.
   Still works, but...
 */
fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;
fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0660'..'\u0669' |
       '\u06f0'..'\u06f9' |
       '\u0966'..'\u096f' |
       '\u09e6'..'\u09ef' |
       '\u0a66'..'\u0a6f' |
       '\u0ae6'..'\u0aef' |
       '\u0b66'..'\u0b6f' |
       '\u0be7'..'\u0bef' |
       '\u0c66'..'\u0c6f' |
       '\u0ce6'..'\u0cef' |
       '\u0d66'..'\u0d6f' |
       '\u0e50'..'\u0e59' |
       '\u0ed0'..'\u0ed9' |
       '\u1040'..'\u1049'
   ;
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;
COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
