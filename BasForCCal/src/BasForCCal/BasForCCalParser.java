// $ANTLR 3.5.1 C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g 2020-10-28 13:29:49

package BasForCCal;
import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class BasForCCalParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSERT", "COMMENT", "CharacterLiteral", 
		"DecimalLiteral", "ENUM", "EscapeSequence", "Exponent", "FloatTypeSuffix", 
		"FloatingPointLiteral", "HexDigit", "HexLiteral", "Identifier", "IntegerTypeSuffix", 
		"JavaIDDigit", "LINE_COMMENT", "Letter", "OctalEscape", "OctalLiteral", 
		"StringLiteral", "UnicodeEscape", "WS", "'!'", "'!='", "'%'", "'%='", 
		"'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", 
		"','", "'-'", "'--'", "'-='", "'.'", "'...'", "'/'", "'/='", "':'", "';'", 
		"'<'", "'='", "'=='", "'>'", "'?'", "'@'", "'['", "']'", "'^'", "'^='", 
		"'abstract'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'extends'", 
		"'false'", "'final'", "'finally'", "'float'", "'for'", "'if'", "'implements'", 
		"'import'", "'instanceof'", "'int'", "'interface'", "'long'", "'native'", 
		"'new'", "'null'", "'package'", "'private'", "'protected'", "'public'", 
		"'return'", "'short'", "'static'", "'strictfp'", "'super'", "'switch'", 
		"'synchronized'", "'this'", "'throw'", "'throws'", "'transient'", "'true'", 
		"'try'", "'void'", "'volatile'", "'while'", "'{'", "'|'", "'|='", "'||'", 
		"'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int ASSERT=4;
	public static final int COMMENT=5;
	public static final int CharacterLiteral=6;
	public static final int DecimalLiteral=7;
	public static final int ENUM=8;
	public static final int EscapeSequence=9;
	public static final int Exponent=10;
	public static final int FloatTypeSuffix=11;
	public static final int FloatingPointLiteral=12;
	public static final int HexDigit=13;
	public static final int HexLiteral=14;
	public static final int Identifier=15;
	public static final int IntegerTypeSuffix=16;
	public static final int JavaIDDigit=17;
	public static final int LINE_COMMENT=18;
	public static final int Letter=19;
	public static final int OctalEscape=20;
	public static final int OctalLiteral=21;
	public static final int StringLiteral=22;
	public static final int UnicodeEscape=23;
	public static final int WS=24;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public BasForCCalParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public BasForCCalParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[407+1];


	}

	@Override public String[] getTokenNames() { return BasForCCalParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g"; }


	boolean isExtends=false, isImp=false;
	int intCount=0;
	boolean isMethodMember = false, isDataMember = false,isClassObject= false;
	static String finalExtraction = "";
	static BufferedWriter writer;
	String methodname = "",descendantname="",search="";
	ArrayList<String> methodcalls = new ArrayList<>();
	ArrayList<String> descendants = new ArrayList<>();
	String key ="", ancestorkey="";
	Map<String,List<String>> map = new HashMap<>();
	Map<String,List<String>> ancestormap = new HashMap<>();
	boolean formalParameter=false;
	boolean variableDeclare=false;
	boolean isMethodVariable=false;
	ArrayList<String> aggregates = new ArrayList<String>();
	ArrayList<String> associates = new ArrayList<String>();

	public void printData(List<String> str, String tabs)
	     	{
	     		for(String methodcall : str)
	     		{
	     			System.out.println(tabs+ " ->"+methodcall);
	     			finalExtraction = finalExtraction + tabs +( "\n \t ->"+methodcall);
	     			String[] arr = methodcall.split("\\.");
	     			if(arr.length!= 0 &&map.containsKey(arr[arr.length - 1]))
	     			{
	     				printData(map.get(arr[arr.length - 1]), tabs+"\t");
	     			}
	     			else if(map.containsKey(methodcall))
	     			{
	     				printData(map.get(methodcall), tabs+"\t");
	     			}
	     		}
	     	}




	// $ANTLR start "compilationUnit"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:55:1: compilationUnit[String path] : ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* );
	public final void compilationUnit(String path) throws RecognitionException {
		int compilationUnit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:56:5: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==54) ) {
				int LA8_1 = input.LA(2);
				if ( (synpred5_BasForCCal()) ) {
					alt8=1;
				}
				else if ( (true) ) {
					alt8=2;
				}

			}
			else if ( (LA8_0==EOF||LA8_0==ENUM||LA8_0==48||LA8_0==59||LA8_0==66||LA8_0==74||LA8_0==80||LA8_0==83||(LA8_0 >= 88 && LA8_0 <= 91)||(LA8_0 >= 94 && LA8_0 <= 95)) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:56:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
					{
					pushFollow(FOLLOW_annotations_in_compilationUnit55);
					annotations();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==88) ) {
						alt4=1;
					}
					else if ( (LA4_0==ENUM||LA4_0==54||LA4_0==59||LA4_0==66||LA4_0==74||LA4_0==83||(LA4_0 >= 89 && LA4_0 <= 91)||(LA4_0 >= 94 && LA4_0 <= 95)) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
							{
							pushFollow(FOLLOW_packageDeclaration_in_compilationUnit69);
							packageDeclaration();
							state._fsp--;
							if (state.failed) return;
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:32: ( importDeclaration )*
							loop1:
							while (true) {
								int alt1=2;
								int LA1_0 = input.LA(1);
								if ( (LA1_0==80) ) {
									alt1=1;
								}

								switch (alt1) {
								case 1 :
									// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:32: importDeclaration
									{
									pushFollow(FOLLOW_importDeclaration_in_compilationUnit71);
									importDeclaration();
									state._fsp--;
									if (state.failed) return;
									}
									break;

								default :
									break loop1;
								}
							}

							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:51: ( typeDeclaration )*
							loop2:
							while (true) {
								int alt2=2;
								int LA2_0 = input.LA(1);
								if ( (LA2_0==ENUM||LA2_0==48||LA2_0==54||LA2_0==59||LA2_0==66||LA2_0==74||LA2_0==83||(LA2_0 >= 89 && LA2_0 <= 91)||(LA2_0 >= 94 && LA2_0 <= 95)) ) {
									alt2=1;
								}

								switch (alt2) {
								case 1 :
									// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:51: typeDeclaration
									{
									pushFollow(FOLLOW_typeDeclaration_in_compilationUnit74);
									typeDeclaration();
									state._fsp--;
									if (state.failed) return;
									}
									break;

								default :
									break loop2;
								}
							}

							}
							break;
						case 2 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:58:13: classOrInterfaceDeclaration ( typeDeclaration )*
							{
							pushFollow(FOLLOW_classOrInterfaceDeclaration_in_compilationUnit89);
							classOrInterfaceDeclaration();
							state._fsp--;
							if (state.failed) return;
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:58:41: ( typeDeclaration )*
							loop3:
							while (true) {
								int alt3=2;
								int LA3_0 = input.LA(1);
								if ( (LA3_0==ENUM||LA3_0==48||LA3_0==54||LA3_0==59||LA3_0==66||LA3_0==74||LA3_0==83||(LA3_0 >= 89 && LA3_0 <= 91)||(LA3_0 >= 94 && LA3_0 <= 95)) ) {
									alt3=1;
								}

								switch (alt3) {
								case 1 :
									// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:58:41: typeDeclaration
									{
									pushFollow(FOLLOW_typeDeclaration_in_compilationUnit91);
									typeDeclaration();
									state._fsp--;
									if (state.failed) return;
									}
									break;

								default :
									break loop3;
								}
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:60:9: ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )*
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:60:9: ( packageDeclaration )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==88) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:60:9: packageDeclaration
							{
							pushFollow(FOLLOW_packageDeclaration_in_compilationUnit112);
							packageDeclaration();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:60:29: ( importDeclaration )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==80) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:60:29: importDeclaration
							{
							pushFollow(FOLLOW_importDeclaration_in_compilationUnit115);
							importDeclaration();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop6;
						}
					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:60:48: ( typeDeclaration )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ENUM||LA7_0==48||LA7_0==54||LA7_0==59||LA7_0==66||LA7_0==74||LA7_0==83||(LA7_0 >= 89 && LA7_0 <= 91)||(LA7_0 >= 94 && LA7_0 <= 95)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:60:48: typeDeclaration
							{
							pushFollow(FOLLOW_typeDeclaration_in_compilationUnit118);
							typeDeclaration();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop7;
						}
					}

					if ( state.backtracking==0 ) {
					map.put(key,methodcalls);
					     	for(Map.Entry<String, List<String>> entry : map.entrySet())
					     	{	
					     		System.out.println("Method Name:"+entry.getKey());
					     		finalExtraction = finalExtraction + ("\nMethod Name:"+entry.getKey());
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
					     	String newString = new String(); 
					     	StringBuffer str = new StringBuffer(finalExtraction);
					     	  while (true) {
					           
					           in = finalExtraction.indexOf(search, in);
					               if (in != -1) {
					     	 	for(int i=0; i<finalExtraction.length();i++){
					     	 	
					           	if(in == i){
					           	  
					           		String cls = finalExtraction.substring(i + 15, finalExtraction.indexOf(":", i));
					           		
					            		int ind1 = i+15+cls.length()+1;
					          		if(ancestormap.containsKey(cls)){
					          		
									str.insert(ind1, ancestormap.get(cls)); 
									
								}else{
									str.insert(ind1, " No Descendants"); 
									
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
							String[] words = finalExtraction.split("/n");
					        	for (String word: words) {
					        	     writer.write(word);
					        	     writer.newLine();
					        	    }
					      		writer.close();
					      		}catch(Exception ex){}}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }

		}
	}
	// $ANTLR end "compilationUnit"



	// $ANTLR start "packageDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:136:1: packageDeclaration : 'package' qualifiedName ';' ;
	public final void packageDeclaration() throws RecognitionException {
		int packageDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:137:5: ( 'package' qualifiedName ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:137:9: 'package' qualifiedName ';'
			{
			match(input,88,FOLLOW_88_in_packageDeclaration142); if (state.failed) return;
			pushFollow(FOLLOW_qualifiedName_in_packageDeclaration144);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			match(input,48,FOLLOW_48_in_packageDeclaration146); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "packageDeclaration"



	// $ANTLR start "importDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:140:1: importDeclaration : 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';' ;
	public final void importDeclaration() throws RecognitionException {
		int importDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:141:5: ( 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:141:9: 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';'
			{
			match(input,80,FOLLOW_80_in_importDeclaration169); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:141:18: ( 'static' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==94) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:141:18: 'static'
					{
					match(input,94,FOLLOW_94_in_importDeclaration171); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_qualifiedName_in_importDeclaration174);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:141:42: ( '.' '*' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==43) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:141:43: '.' '*'
					{
					match(input,43,FOLLOW_43_in_importDeclaration177); if (state.failed) return;
					match(input,34,FOLLOW_34_in_importDeclaration179); if (state.failed) return;
					}
					break;

			}

			match(input,48,FOLLOW_48_in_importDeclaration183); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "importDeclaration"



	// $ANTLR start "typeDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:144:1: typeDeclaration : ( classOrInterfaceDeclaration | ';' );
	public final void typeDeclaration() throws RecognitionException {
		int typeDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:145:5: ( classOrInterfaceDeclaration | ';' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ENUM||LA11_0==54||LA11_0==59||LA11_0==66||LA11_0==74||LA11_0==83||(LA11_0 >= 89 && LA11_0 <= 91)||(LA11_0 >= 94 && LA11_0 <= 95)) ) {
				alt11=1;
			}
			else if ( (LA11_0==48) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:145:9: classOrInterfaceDeclaration
					{
					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration206);
					classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:146:9: ';'
					{
					match(input,48,FOLLOW_48_in_typeDeclaration216); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, typeDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "typeDeclaration"



	// $ANTLR start "classOrInterfaceDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:149:1: classOrInterfaceDeclaration : classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) ;
	public final void classOrInterfaceDeclaration() throws RecognitionException {
		int classOrInterfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:150:5: ( classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:150:9: classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration )
			{
			pushFollow(FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration239);
			classOrInterfaceModifiers();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:150:35: ( classDeclaration | interfaceDeclaration )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ENUM||LA12_0==66) ) {
				alt12=1;
			}
			else if ( (LA12_0==54||LA12_0==83) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:150:36: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration242);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:150:55: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration246);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, classOrInterfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classOrInterfaceDeclaration"



	// $ANTLR start "classOrInterfaceModifiers"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:153:1: classOrInterfaceModifiers : ( classOrInterfaceModifier )* ;
	public final void classOrInterfaceModifiers() throws RecognitionException {
		int classOrInterfaceModifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:154:5: ( ( classOrInterfaceModifier )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:154:9: ( classOrInterfaceModifier )*
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:154:9: ( classOrInterfaceModifier )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==54) ) {
					int LA13_2 = input.LA(2);
					if ( (LA13_2==Identifier) ) {
						alt13=1;
					}

				}
				else if ( (LA13_0==59||LA13_0==74||(LA13_0 >= 89 && LA13_0 <= 91)||(LA13_0 >= 94 && LA13_0 <= 95)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:154:9: classOrInterfaceModifier
					{
					pushFollow(FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers270);
					classOrInterfaceModifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop13;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, classOrInterfaceModifiers_StartIndex); }

		}
	}
	// $ANTLR end "classOrInterfaceModifiers"



	// $ANTLR start "classOrInterfaceModifier"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:157:1: classOrInterfaceModifier : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'strictfp' );
	public final void classOrInterfaceModifier() throws RecognitionException {
		int classOrInterfaceModifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:158:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'strictfp' )
			int alt14=8;
			switch ( input.LA(1) ) {
			case 54:
				{
				alt14=1;
				}
				break;
			case 91:
				{
				alt14=2;
				}
				break;
			case 90:
				{
				alt14=3;
				}
				break;
			case 89:
				{
				alt14=4;
				}
				break;
			case 94:
				{
				alt14=5;
				}
				break;
			case 59:
				{
				alt14=6;
				}
				break;
			case 74:
				{
				alt14=7;
				}
				break;
			case 95:
				{
				alt14=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:158:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_classOrInterfaceModifier290);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:159:9: 'public'
					{
					match(input,91,FOLLOW_91_in_classOrInterfaceModifier303); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  public "); finalExtraction = finalExtraction + "  public ";}
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:160:9: 'protected'
					{
					match(input,90,FOLLOW_90_in_classOrInterfaceModifier315); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  protected "); finalExtraction = finalExtraction + "  protected ";}
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:161:9: 'private'
					{
					match(input,89,FOLLOW_89_in_classOrInterfaceModifier327); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  private "); finalExtraction = finalExtraction + "  private ";}
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:162:9: 'static'
					{
					match(input,94,FOLLOW_94_in_classOrInterfaceModifier339); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  static "); finalExtraction = finalExtraction + "  static ";}
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:163:9: 'abstract'
					{
					match(input,59,FOLLOW_59_in_classOrInterfaceModifier351); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  abstract "); finalExtraction = finalExtraction + " abstract ";}
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:164:9: 'final'
					{
					match(input,74,FOLLOW_74_in_classOrInterfaceModifier363); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  final "); finalExtraction = finalExtraction + "  final ";}
					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:165:9: 'strictfp'
					{
					match(input,95,FOLLOW_95_in_classOrInterfaceModifier375); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  strictfp "); finalExtraction = finalExtraction + "  strictfp ";}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, classOrInterfaceModifier_StartIndex); }

		}
	}
	// $ANTLR end "classOrInterfaceModifier"



	// $ANTLR start "modifiers"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:168:1: modifiers : ( modifier )* ;
	public final void modifiers() throws RecognitionException {
		int modifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:169:5: ( ( modifier )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:169:9: ( modifier )*
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:169:9: ( modifier )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==54) ) {
					int LA15_2 = input.LA(2);
					if ( (LA15_2==Identifier) ) {
						alt15=1;
					}

				}
				else if ( (LA15_0==59||LA15_0==74||LA15_0==85||(LA15_0 >= 89 && LA15_0 <= 91)||(LA15_0 >= 94 && LA15_0 <= 95)||LA15_0==98||LA15_0==102||LA15_0==106) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:169:9: modifier
					{
					pushFollow(FOLLOW_modifier_in_modifiers396);
					modifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, modifiers_StartIndex); }

		}
	}
	// $ANTLR end "modifiers"



	// $ANTLR start "classDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:172:1: classDeclaration : ( normalClassDeclaration | enumDeclaration );
	public final void classDeclaration() throws RecognitionException {
		int classDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:173:5: ( normalClassDeclaration | enumDeclaration )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==66) ) {
				alt16=1;
			}
			else if ( (LA16_0==ENUM) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:173:9: normalClassDeclaration
					{
					pushFollow(FOLLOW_normalClassDeclaration_in_classDeclaration416);
					normalClassDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:174:9: enumDeclaration
					{
					pushFollow(FOLLOW_enumDeclaration_in_classDeclaration426);
					enumDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, classDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classDeclaration"



	// $ANTLR start "normalClassDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:177:1: normalClassDeclaration : 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody ;
	public final void normalClassDeclaration() throws RecognitionException {
		int normalClassDeclaration_StartIndex = input.index();

		Token Identifier1=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:178:5: ( 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:178:9: 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody
			{
			match(input,66,FOLLOW_66_in_normalClassDeclaration449); if (state.failed) return;
			Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_normalClassDeclaration451); if (state.failed) return;
			if ( state.backtracking==0 ) {System.out.print("Class:"+(Identifier1!=null?Identifier1.getText():null)); 
			    			finalExtraction = finalExtraction + ("Class:"+(Identifier1!=null?Identifier1.getText():null));
			    			isMethodMember=false; isDataMember=false;isMethodVariable=false;isClassObject = false;}
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:180:96: ( typeParameters )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==49) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:180:96: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalClassDeclaration455);
					typeParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:181:9: ( 'extends' type )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==72) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:181:10: 'extends' type
					{
					match(input,72,FOLLOW_72_in_normalClassDeclaration467); if (state.failed) return;
					if ( state.backtracking==0 ) {isExtends=true; descendants = new ArrayList<>(); descendantname = (Identifier1!=null?Identifier1.getText():null);}
					pushFollow(FOLLOW_type_in_normalClassDeclaration471);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:182:9: ( 'implements' typeList )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==79) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:182:10: 'implements' typeList
					{
					match(input,79,FOLLOW_79_in_normalClassDeclaration484); if (state.failed) return;
					if ( state.backtracking==0 ) {isImp= true;}
					pushFollow(FOLLOW_typeList_in_normalClassDeclaration487);
					typeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) { System.out.println(" Descendants of " +(Identifier1!=null?Identifier1.getText():null)+":");finalExtraction = finalExtraction + ("\n Descendants of "+(Identifier1!=null?Identifier1.getText():null)+":"); 
			         if(!isDataMember){isDataMember = true;  System.out.println(" Data Members: ");
			        finalExtraction = finalExtraction + ("\n  Data Members: \n");}}
			pushFollow(FOLLOW_classBody_in_normalClassDeclaration500);
			classBody();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, normalClassDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "normalClassDeclaration"



	// $ANTLR start "typeParameters"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:189:1: typeParameters : '<' typeParameter ( ',' typeParameter )* '>' ;
	public final void typeParameters() throws RecognitionException {
		int typeParameters_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:190:5: ( '<' typeParameter ( ',' typeParameter )* '>' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:190:9: '<' typeParameter ( ',' typeParameter )* '>'
			{
			match(input,49,FOLLOW_49_in_typeParameters531); if (state.failed) return;
			pushFollow(FOLLOW_typeParameter_in_typeParameters533);
			typeParameter();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:190:27: ( ',' typeParameter )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==39) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:190:28: ',' typeParameter
					{
					match(input,39,FOLLOW_39_in_typeParameters536); if (state.failed) return;
					pushFollow(FOLLOW_typeParameter_in_typeParameters538);
					typeParameter();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop20;
				}
			}

			match(input,52,FOLLOW_52_in_typeParameters542); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, typeParameters_StartIndex); }

		}
	}
	// $ANTLR end "typeParameters"



	// $ANTLR start "typeParameter"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:193:1: typeParameter : Identifier ( 'extends' typeBound )? ;
	public final void typeParameter() throws RecognitionException {
		int typeParameter_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:194:5: ( Identifier ( 'extends' typeBound )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:194:9: Identifier ( 'extends' typeBound )?
			{
			match(input,Identifier,FOLLOW_Identifier_in_typeParameter561); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:194:20: ( 'extends' typeBound )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==72) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:194:21: 'extends' typeBound
					{
					match(input,72,FOLLOW_72_in_typeParameter564); if (state.failed) return;
					pushFollow(FOLLOW_typeBound_in_typeParameter566);
					typeBound();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, typeParameter_StartIndex); }

		}
	}
	// $ANTLR end "typeParameter"



	// $ANTLR start "typeBound"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:197:1: typeBound : type ( '&' type )* ;
	public final void typeBound() throws RecognitionException {
		int typeBound_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:198:5: ( type ( '&' type )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:198:9: type ( '&' type )*
			{
			pushFollow(FOLLOW_type_in_typeBound595);
			type();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:198:14: ( '&' type )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==30) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:198:15: '&' type
					{
					match(input,30,FOLLOW_30_in_typeBound598); if (state.failed) return;
					pushFollow(FOLLOW_type_in_typeBound600);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, typeBound_StartIndex); }

		}
	}
	// $ANTLR end "typeBound"



	// $ANTLR start "enumDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:201:1: enumDeclaration : ENUM Identifier ( 'implements' typeList )? enumBody ;
	public final void enumDeclaration() throws RecognitionException {
		int enumDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:202:5: ( ENUM Identifier ( 'implements' typeList )? enumBody )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:202:9: ENUM Identifier ( 'implements' typeList )? enumBody
			{
			match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration621); if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_enumDeclaration623); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:202:25: ( 'implements' typeList )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==79) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:202:26: 'implements' typeList
					{
					match(input,79,FOLLOW_79_in_enumDeclaration626); if (state.failed) return;
					pushFollow(FOLLOW_typeList_in_enumDeclaration628);
					typeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_enumBody_in_enumDeclaration632);
			enumBody();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, enumDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "enumDeclaration"



	// $ANTLR start "enumBody"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:205:1: enumBody : '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' ;
	public final void enumBody() throws RecognitionException {
		int enumBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:206:5: ( '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:206:9: '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}'
			{
			match(input,108,FOLLOW_108_in_enumBody651); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:206:13: ( enumConstants )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==Identifier||LA24_0==54) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:206:13: enumConstants
					{
					pushFollow(FOLLOW_enumConstants_in_enumBody653);
					enumConstants();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:206:28: ( ',' )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==39) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:206:28: ','
					{
					match(input,39,FOLLOW_39_in_enumBody656); if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:206:33: ( enumBodyDeclarations )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==48) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:206:33: enumBodyDeclarations
					{
					pushFollow(FOLLOW_enumBodyDeclarations_in_enumBody659);
					enumBodyDeclarations();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,112,FOLLOW_112_in_enumBody662); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, enumBody_StartIndex); }

		}
	}
	// $ANTLR end "enumBody"



	// $ANTLR start "enumConstants"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:209:1: enumConstants : enumConstant ( ',' enumConstant )* ;
	public final void enumConstants() throws RecognitionException {
		int enumConstants_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:210:5: ( enumConstant ( ',' enumConstant )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:210:9: enumConstant ( ',' enumConstant )*
			{
			pushFollow(FOLLOW_enumConstant_in_enumConstants681);
			enumConstant();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:210:22: ( ',' enumConstant )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==39) ) {
					int LA27_1 = input.LA(2);
					if ( (LA27_1==Identifier||LA27_1==54) ) {
						alt27=1;
					}

				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:210:23: ',' enumConstant
					{
					match(input,39,FOLLOW_39_in_enumConstants684); if (state.failed) return;
					pushFollow(FOLLOW_enumConstant_in_enumConstants686);
					enumConstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop27;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, enumConstants_StartIndex); }

		}
	}
	// $ANTLR end "enumConstants"



	// $ANTLR start "enumConstant"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:213:1: enumConstant : ( annotations )? Identifier ( arguments )? ( classBody )? ;
	public final void enumConstant() throws RecognitionException {
		int enumConstant_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:214:5: ( ( annotations )? Identifier ( arguments )? ( classBody )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:214:9: ( annotations )? Identifier ( arguments )? ( classBody )?
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:214:9: ( annotations )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==54) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:214:9: annotations
					{
					pushFollow(FOLLOW_annotations_in_enumConstant711);
					annotations();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,Identifier,FOLLOW_Identifier_in_enumConstant714); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:214:33: ( arguments )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==32) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:214:33: arguments
					{
					pushFollow(FOLLOW_arguments_in_enumConstant716);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:214:44: ( classBody )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==108) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:214:44: classBody
					{
					pushFollow(FOLLOW_classBody_in_enumConstant719);
					classBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, enumConstant_StartIndex); }

		}
	}
	// $ANTLR end "enumConstant"



	// $ANTLR start "enumBodyDeclarations"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:217:1: enumBodyDeclarations : ';' ( classBodyDeclaration )* ;
	public final void enumBodyDeclarations() throws RecognitionException {
		int enumBodyDeclarations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:218:5: ( ';' ( classBodyDeclaration )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:218:9: ';' ( classBodyDeclaration )*
			{
			match(input,48,FOLLOW_48_in_enumBodyDeclarations743); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:218:13: ( classBodyDeclaration )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==ENUM||LA31_0==Identifier||(LA31_0 >= 48 && LA31_0 <= 49)||LA31_0==54||(LA31_0 >= 59 && LA31_0 <= 60)||LA31_0==62||(LA31_0 >= 65 && LA31_0 <= 66)||LA31_0==70||LA31_0==74||LA31_0==76||(LA31_0 >= 82 && LA31_0 <= 85)||(LA31_0 >= 89 && LA31_0 <= 91)||(LA31_0 >= 93 && LA31_0 <= 95)||LA31_0==98||LA31_0==102||(LA31_0 >= 105 && LA31_0 <= 106)||LA31_0==108) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:218:14: classBodyDeclaration
					{
					pushFollow(FOLLOW_classBodyDeclaration_in_enumBodyDeclarations746);
					classBodyDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop31;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, enumBodyDeclarations_StartIndex); }

		}
	}
	// $ANTLR end "enumBodyDeclarations"



	// $ANTLR start "interfaceDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:221:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );
	public final void interfaceDeclaration() throws RecognitionException {
		int interfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:222:5: ( normalInterfaceDeclaration | annotationTypeDeclaration )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==83) ) {
				alt32=1;
			}
			else if ( (LA32_0==54) ) {
				alt32=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:222:9: normalInterfaceDeclaration
					{
					pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration771);
					normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:223:9: annotationTypeDeclaration
					{
					pushFollow(FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration781);
					annotationTypeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, interfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "interfaceDeclaration"



	// $ANTLR start "normalInterfaceDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:226:1: normalInterfaceDeclaration : 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody ;
	public final void normalInterfaceDeclaration() throws RecognitionException {
		int normalInterfaceDeclaration_StartIndex = input.index();

		Token Identifier2=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:227:5: ( 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:227:9: 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody
			{
			match(input,83,FOLLOW_83_in_normalInterfaceDeclaration804); if (state.failed) return;
			Identifier2=(Token)match(input,Identifier,FOLLOW_Identifier_in_normalInterfaceDeclaration806); if (state.failed) return;
			if ( state.backtracking==0 ) {System.out.println("interface "+(Identifier2!=null?Identifier2.getText():null)+"\n");
			    				finalExtraction = finalExtraction + ("\ninterface "+(Identifier2!=null?Identifier2.getText():null)+"\n" ); }
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:228:88: ( typeParameters )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==49) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:228:88: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalInterfaceDeclaration810);
					typeParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:228:104: ( 'extends' typeList )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==72) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:228:105: 'extends' typeList
					{
					match(input,72,FOLLOW_72_in_normalInterfaceDeclaration814); if (state.failed) return;
					pushFollow(FOLLOW_typeList_in_normalInterfaceDeclaration816);
					typeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_interfaceBody_in_normalInterfaceDeclaration820);
			interfaceBody();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, normalInterfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "normalInterfaceDeclaration"



	// $ANTLR start "typeList"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:231:1: typeList : type ( ',' type )* ;
	public final void typeList() throws RecognitionException {
		int typeList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:232:5: ( type ( ',' type )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:232:9: type ( ',' type )*
			{
			pushFollow(FOLLOW_type_in_typeList843);
			type();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:232:14: ( ',' type )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==39) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:232:15: ',' type
					{
					match(input,39,FOLLOW_39_in_typeList846); if (state.failed) return;
					pushFollow(FOLLOW_type_in_typeList848);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop35;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, typeList_StartIndex); }

		}
	}
	// $ANTLR end "typeList"



	// $ANTLR start "classBody"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:235:1: classBody : '{' ( classBodyDeclaration )* '}' ;
	public final void classBody() throws RecognitionException {
		int classBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:236:5: ( '{' ( classBodyDeclaration )* '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:236:9: '{' ( classBodyDeclaration )* '}'
			{
			match(input,108,FOLLOW_108_in_classBody873); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:236:13: ( classBodyDeclaration )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==ENUM||LA36_0==Identifier||(LA36_0 >= 48 && LA36_0 <= 49)||LA36_0==54||(LA36_0 >= 59 && LA36_0 <= 60)||LA36_0==62||(LA36_0 >= 65 && LA36_0 <= 66)||LA36_0==70||LA36_0==74||LA36_0==76||(LA36_0 >= 82 && LA36_0 <= 85)||(LA36_0 >= 89 && LA36_0 <= 91)||(LA36_0 >= 93 && LA36_0 <= 95)||LA36_0==98||LA36_0==102||(LA36_0 >= 105 && LA36_0 <= 106)||LA36_0==108) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:236:13: classBodyDeclaration
					{
					pushFollow(FOLLOW_classBodyDeclaration_in_classBody875);
					classBodyDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop36;
				}
			}

			match(input,112,FOLLOW_112_in_classBody878); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, classBody_StartIndex); }

		}
	}
	// $ANTLR end "classBody"



	// $ANTLR start "interfaceBody"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:239:1: interfaceBody : '{' ( interfaceBodyDeclaration )* '}' ;
	public final void interfaceBody() throws RecognitionException {
		int interfaceBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:240:5: ( '{' ( interfaceBodyDeclaration )* '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:240:9: '{' ( interfaceBodyDeclaration )* '}'
			{
			match(input,108,FOLLOW_108_in_interfaceBody902); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:240:13: ( interfaceBodyDeclaration )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==ENUM||LA37_0==Identifier||(LA37_0 >= 48 && LA37_0 <= 49)||LA37_0==54||(LA37_0 >= 59 && LA37_0 <= 60)||LA37_0==62||(LA37_0 >= 65 && LA37_0 <= 66)||LA37_0==70||LA37_0==74||LA37_0==76||(LA37_0 >= 82 && LA37_0 <= 85)||(LA37_0 >= 89 && LA37_0 <= 91)||(LA37_0 >= 93 && LA37_0 <= 95)||LA37_0==98||LA37_0==102||(LA37_0 >= 105 && LA37_0 <= 106)) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:240:13: interfaceBodyDeclaration
					{
					pushFollow(FOLLOW_interfaceBodyDeclaration_in_interfaceBody904);
					interfaceBodyDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop37;
				}
			}

			match(input,112,FOLLOW_112_in_interfaceBody907); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, interfaceBody_StartIndex); }

		}
	}
	// $ANTLR end "interfaceBody"



	// $ANTLR start "classBodyDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:243:1: classBodyDeclaration : ( ';' | ( 'static' )? block | memberDecl );
	public final void classBodyDeclaration() throws RecognitionException {
		int classBodyDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:244:5: ( ';' | ( 'static' )? block | memberDecl )
			int alt39=3;
			switch ( input.LA(1) ) {
			case 48:
				{
				alt39=1;
				}
				break;
			case 94:
				{
				int LA39_2 = input.LA(2);
				if ( (LA39_2==108) ) {
					alt39=2;
				}
				else if ( (LA39_2==ENUM||LA39_2==Identifier||LA39_2==49||LA39_2==54||(LA39_2 >= 59 && LA39_2 <= 60)||LA39_2==62||(LA39_2 >= 65 && LA39_2 <= 66)||LA39_2==70||LA39_2==74||LA39_2==76||(LA39_2 >= 82 && LA39_2 <= 85)||(LA39_2 >= 89 && LA39_2 <= 91)||(LA39_2 >= 93 && LA39_2 <= 95)||LA39_2==98||LA39_2==102||(LA39_2 >= 105 && LA39_2 <= 106)) ) {
					alt39=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 108:
				{
				alt39=2;
				}
				break;
			case ENUM:
			case Identifier:
			case 49:
			case 54:
			case 59:
			case 60:
			case 62:
			case 65:
			case 66:
			case 70:
			case 74:
			case 76:
			case 82:
			case 83:
			case 84:
			case 85:
			case 89:
			case 90:
			case 91:
			case 93:
			case 95:
			case 98:
			case 102:
			case 105:
			case 106:
				{
				alt39=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:244:9: ';'
					{
					match(input,48,FOLLOW_48_in_classBodyDeclaration926); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:245:9: ( 'static' )? block
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:245:9: ( 'static' )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==94) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:245:9: 'static'
							{
							match(input,94,FOLLOW_94_in_classBodyDeclaration938); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_block_in_classBodyDeclaration941);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:246:8: memberDecl
					{
					if ( state.backtracking==0 ) {isMethodVariable = false;}
					pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration953);
					memberDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, classBodyDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classBodyDeclaration"



	// $ANTLR start "memberDecl"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:249:1: memberDecl : ( modifiers genericMethodOrConstructorDecl | memberDeclaration | modifiers 'void' Identifier voidMethodDeclaratorRest | modifiers Identifier constructorDeclaratorRest | modifiers interfaceDeclaration | modifiers classDeclaration );
	public final void memberDecl() throws RecognitionException {
		int memberDecl_StartIndex = input.index();

		Token Identifier3=null;
		Token Identifier4=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:5: ( modifiers genericMethodOrConstructorDecl | memberDeclaration | modifiers 'void' Identifier voidMethodDeclaratorRest | modifiers Identifier constructorDeclaratorRest | modifiers interfaceDeclaration | modifiers classDeclaration )
			int alt40=6;
			switch ( input.LA(1) ) {
			case 54:
				{
				int LA40_1 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 91:
				{
				int LA40_2 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 90:
				{
				int LA40_3 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 89:
				{
				int LA40_4 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 94:
				{
				int LA40_5 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 59:
				{
				int LA40_6 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 74:
				{
				int LA40_7 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 85:
				{
				int LA40_8 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 98:
				{
				int LA40_9 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 102:
				{
				int LA40_10 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 106:
				{
				int LA40_11 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 95:
				{
				int LA40_12 = input.LA(2);
				if ( (synpred47_BasForCCal()) ) {
					alt40=1;
				}
				else if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred49_BasForCCal()) ) {
					alt40=3;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}
				else if ( (synpred51_BasForCCal()) ) {
					alt40=5;
				}
				else if ( (true) ) {
					alt40=6;
				}

				}
				break;
			case 49:
				{
				alt40=1;
				}
				break;
			case Identifier:
				{
				int LA40_14 = input.LA(2);
				if ( (synpred48_BasForCCal()) ) {
					alt40=2;
				}
				else if ( (synpred50_BasForCCal()) ) {
					alt40=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 60:
			case 62:
			case 65:
			case 70:
			case 76:
			case 82:
			case 84:
			case 93:
				{
				alt40=2;
				}
				break;
			case 105:
				{
				alt40=3;
				}
				break;
			case 83:
				{
				alt40=5;
				}
				break;
			case ENUM:
			case 66:
				{
				alt40=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:9: modifiers genericMethodOrConstructorDecl
					{
					pushFollow(FOLLOW_modifiers_in_memberDecl977);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_genericMethodOrConstructorDecl_in_memberDecl979);
					genericMethodOrConstructorDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:251:9: memberDeclaration
					{
					pushFollow(FOLLOW_memberDeclaration_in_memberDecl989);
					memberDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:252:8: modifiers 'void' Identifier voidMethodDeclaratorRest
					{
					if ( state.backtracking==0 ) { if(!isMethodMember){ isMethodMember = true;  System.out.println(" Method Members: ");
					    				finalExtraction = finalExtraction + ("\n  Method Members: \n");}}
					pushFollow(FOLLOW_modifiers_in_memberDecl1000);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					match(input,105,FOLLOW_105_in_memberDecl1002); if (state.failed) return;
					Identifier3=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl1004); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("void "+(Identifier3!=null?Identifier3.getText():null)); if(!key.equals("")){map.put(key,methodcalls);} key = (Identifier3!=null?Identifier3.getText():null); methodcalls = new ArrayList<>();
					    				finalExtraction = finalExtraction + ("void "+(Identifier3!=null?Identifier3.getText():null) );}
					pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDecl1008);
					voidMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:255:8: modifiers Identifier constructorDeclaratorRest
					{
					if ( state.backtracking==0 ) { if(!isMethodMember){ isMethodMember = true;  System.out.println(" Method Members: ");
					    				finalExtraction = finalExtraction + ("\n  Method Members: \n");}}
					pushFollow(FOLLOW_modifiers_in_memberDecl1018);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					Identifier4=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl1020); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print((Identifier4!=null?Identifier4.getText():null));
					    				finalExtraction = finalExtraction + (Identifier4!=null?Identifier4.getText():null); }
					pushFollow(FOLLOW_constructorDeclaratorRest_in_memberDecl1024);
					constructorDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:258:16: modifiers interfaceDeclaration
					{
					if ( state.backtracking==0 ) { if(!isMethodMember){ isMethodMember = true;  System.out.println(" Method Members: ");
					    				finalExtraction = finalExtraction + ("\n  Method Members: \n");}}
					pushFollow(FOLLOW_modifiers_in_memberDecl1042);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_interfaceDeclaration_in_memberDecl1044);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:260:8: modifiers classDeclaration
					{
					if ( state.backtracking==0 ) { if(!isMethodMember){ isMethodMember = true;  System.out.println(" Method Members: ");
					    				finalExtraction = finalExtraction + ("\n  Method Members: \n");}}
					pushFollow(FOLLOW_modifiers_in_memberDecl1054);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_classDeclaration_in_memberDecl1056);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, memberDecl_StartIndex); }

		}
	}
	// $ANTLR end "memberDecl"



	// $ANTLR start "memberDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:264:1: memberDeclaration : ( modifiers type methodDeclaration | modifiers type fieldDeclaration ) ;
	public final void memberDeclaration() throws RecognitionException {
		int memberDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:265:5: ( ( modifiers type methodDeclaration | modifiers type fieldDeclaration ) )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:265:9: ( modifiers type methodDeclaration | modifiers type fieldDeclaration )
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:265:9: ( modifiers type methodDeclaration | modifiers type fieldDeclaration )
			int alt41=2;
			switch ( input.LA(1) ) {
			case 54:
				{
				int LA41_1 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 91:
				{
				int LA41_2 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 90:
				{
				int LA41_3 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 89:
				{
				int LA41_4 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 94:
				{
				int LA41_5 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 59:
				{
				int LA41_6 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 74:
				{
				int LA41_7 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 85:
				{
				int LA41_8 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 98:
				{
				int LA41_9 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 102:
				{
				int LA41_10 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 106:
				{
				int LA41_11 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 95:
				{
				int LA41_12 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case Identifier:
				{
				int LA41_13 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 60:
				{
				int LA41_14 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 65:
				{
				int LA41_15 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 62:
				{
				int LA41_16 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 93:
				{
				int LA41_17 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 82:
				{
				int LA41_18 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 84:
				{
				int LA41_19 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 76:
				{
				int LA41_20 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			case 70:
				{
				int LA41_21 = input.LA(2);
				if ( (synpred52_BasForCCal()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:265:10: modifiers type methodDeclaration
					{
					if ( state.backtracking==0 ) { if(!isMethodMember){ isMethodMember = true;  System.out.println(" Method Members: ");
					    				finalExtraction = finalExtraction + ("\n  Method Members: \n");}}
					pushFollow(FOLLOW_modifiers_in_memberDeclaration1082);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_type_in_memberDeclaration1084);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration1086);
					methodDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:266:110: modifiers type fieldDeclaration
					{
					pushFollow(FOLLOW_modifiers_in_memberDeclaration1090);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {variableDeclare=true; isClassObject = true;}
					pushFollow(FOLLOW_type_in_memberDeclaration1093);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration1095);
					fieldDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, memberDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "memberDeclaration"



	// $ANTLR start "genericMethodOrConstructorDecl"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:269:1: genericMethodOrConstructorDecl : typeParameters genericMethodOrConstructorRest ;
	public final void genericMethodOrConstructorDecl() throws RecognitionException {
		int genericMethodOrConstructorDecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:270:5: ( typeParameters genericMethodOrConstructorRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:270:9: typeParameters genericMethodOrConstructorRest
			{
			pushFollow(FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1115);
			typeParameters();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1117);
			genericMethodOrConstructorRest();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, genericMethodOrConstructorDecl_StartIndex); }

		}
	}
	// $ANTLR end "genericMethodOrConstructorDecl"



	// $ANTLR start "genericMethodOrConstructorRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:273:1: genericMethodOrConstructorRest : ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest );
	public final void genericMethodOrConstructorRest() throws RecognitionException {
		int genericMethodOrConstructorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:274:5: ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Identifier) ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1==Identifier||LA43_1==43||LA43_1==49||LA43_1==55) ) {
					alt43=1;
				}
				else if ( (LA43_1==32) ) {
					alt43=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA43_0==60||LA43_0==62||LA43_0==65||LA43_0==70||LA43_0==76||LA43_0==82||LA43_0==84||LA43_0==93||LA43_0==105) ) {
				alt43=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:274:9: ( type | 'void' ) Identifier methodDeclaratorRest
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:274:9: ( type | 'void' )
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==Identifier||LA42_0==60||LA42_0==62||LA42_0==65||LA42_0==70||LA42_0==76||LA42_0==82||LA42_0==84||LA42_0==93) ) {
						alt42=1;
					}
					else if ( (LA42_0==105) ) {
						alt42=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 42, 0, input);
						throw nvae;
					}

					switch (alt42) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:274:10: type
							{
							pushFollow(FOLLOW_type_in_genericMethodOrConstructorRest1141);
							type();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:274:17: 'void'
							{
							match(input,105,FOLLOW_105_in_genericMethodOrConstructorRest1145); if (state.failed) return;
							}
							break;

					}

					match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1148); if (state.failed) return;
					pushFollow(FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1150);
					methodDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:275:9: Identifier constructorDeclaratorRest
					{
					match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1160); if (state.failed) return;
					pushFollow(FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1162);
					constructorDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, genericMethodOrConstructorRest_StartIndex); }

		}
	}
	// $ANTLR end "genericMethodOrConstructorRest"



	// $ANTLR start "methodDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:278:1: methodDeclaration : Identifier methodDeclaratorRest ;
	public final void methodDeclaration() throws RecognitionException {
		int methodDeclaration_StartIndex = input.index();

		Token Identifier5=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:279:5: ( Identifier methodDeclaratorRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:279:9: Identifier methodDeclaratorRest
			{
			Identifier5=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1181); if (state.failed) return;
			if ( state.backtracking==0 ) {System.out.print((Identifier5!=null?Identifier5.getText():null));  if(!key.equals("")){map.put(key,methodcalls);} key = (Identifier5!=null?Identifier5.getText():null); methodcalls = new ArrayList<>();  finalExtraction = finalExtraction + (Identifier5!=null?Identifier5.getText():null) ;}
			pushFollow(FOLLOW_methodDeclaratorRest_in_methodDeclaration1185);
			methodDeclaratorRest();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, methodDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "methodDeclaration"



	// $ANTLR start "fieldDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:282:1: fieldDeclaration : variableDeclarators ';' ;
	public final void fieldDeclaration() throws RecognitionException {
		int fieldDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:283:5: ( variableDeclarators ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:283:9: variableDeclarators ';'
			{
			pushFollow(FOLLOW_variableDeclarators_in_fieldDeclaration1204);
			variableDeclarators();
			state._fsp--;
			if (state.failed) return;
			match(input,48,FOLLOW_48_in_fieldDeclaration1206); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, fieldDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "fieldDeclaration"



	// $ANTLR start "interfaceBodyDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:286:1: interfaceBodyDeclaration : ( modifiers interfaceMemberDecl | ';' );
	public final void interfaceBodyDeclaration() throws RecognitionException {
		int interfaceBodyDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:287:5: ( modifiers interfaceMemberDecl | ';' )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==ENUM||LA44_0==Identifier||LA44_0==49||LA44_0==54||(LA44_0 >= 59 && LA44_0 <= 60)||LA44_0==62||(LA44_0 >= 65 && LA44_0 <= 66)||LA44_0==70||LA44_0==74||LA44_0==76||(LA44_0 >= 82 && LA44_0 <= 85)||(LA44_0 >= 89 && LA44_0 <= 91)||(LA44_0 >= 93 && LA44_0 <= 95)||LA44_0==98||LA44_0==102||(LA44_0 >= 105 && LA44_0 <= 106)) ) {
				alt44=1;
			}
			else if ( (LA44_0==48) ) {
				alt44=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:287:9: modifiers interfaceMemberDecl
					{
					pushFollow(FOLLOW_modifiers_in_interfaceBodyDeclaration1233);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1235);
					interfaceMemberDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:288:9: ';'
					{
					match(input,48,FOLLOW_48_in_interfaceBodyDeclaration1245); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, interfaceBodyDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "interfaceBodyDeclaration"



	// $ANTLR start "interfaceMemberDecl"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:291:1: interfaceMemberDecl : ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | Identifier interfaceDeclaration | classDeclaration );
	public final void interfaceMemberDecl() throws RecognitionException {
		int interfaceMemberDecl_StartIndex = input.index();

		Token Identifier6=null;
		Token Identifier7=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:292:5: ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | Identifier interfaceDeclaration | classDeclaration )
			int alt45=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA45_1 = input.LA(2);
				if ( (LA45_1==Identifier||LA45_1==43||LA45_1==49||LA45_1==55) ) {
					alt45=1;
				}
				else if ( (LA45_1==54||LA45_1==83) ) {
					alt45=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 60:
			case 62:
			case 65:
			case 70:
			case 76:
			case 82:
			case 84:
			case 93:
				{
				alt45=1;
				}
				break;
			case 49:
				{
				alt45=2;
				}
				break;
			case 105:
				{
				alt45=3;
				}
				break;
			case ENUM:
			case 66:
				{
				alt45=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:292:9: interfaceMethodOrFieldDecl
					{
					pushFollow(FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1264);
					interfaceMethodOrFieldDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:293:9: interfaceGenericMethodDecl
					{
					pushFollow(FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1274);
					interfaceGenericMethodDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:294:9: 'void' Identifier voidInterfaceMethodDeclaratorRest
					{
					match(input,105,FOLLOW_105_in_interfaceMemberDecl1284); if (state.failed) return;
					Identifier6=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMemberDecl1286); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("void "+(Identifier6!=null?Identifier6.getText():null)); finalExtraction = finalExtraction + ("void "+(Identifier6!=null?Identifier6.getText():null) );}
					pushFollow(FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1290);
					voidInterfaceMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:295:9: Identifier interfaceDeclaration
					{
					Identifier7=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMemberDecl1300); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print((Identifier7!=null?Identifier7.getText():null)); finalExtraction = finalExtraction + ((Identifier7!=null?Identifier7.getText():null) );}
					pushFollow(FOLLOW_interfaceDeclaration_in_interfaceMemberDecl1304);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:296:9: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_interfaceMemberDecl1314);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, interfaceMemberDecl_StartIndex); }

		}
	}
	// $ANTLR end "interfaceMemberDecl"



	// $ANTLR start "interfaceMethodOrFieldDecl"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:299:1: interfaceMethodOrFieldDecl : type Identifier interfaceMethodOrFieldRest ;
	public final void interfaceMethodOrFieldDecl() throws RecognitionException {
		int interfaceMethodOrFieldDecl_StartIndex = input.index();

		Token Identifier8=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:300:5: ( type Identifier interfaceMethodOrFieldRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:300:8: type Identifier interfaceMethodOrFieldRest
			{
			if ( state.backtracking==0 ) {isClassObject = true;}
			pushFollow(FOLLOW_type_in_interfaceMethodOrFieldDecl1338);
			type();
			state._fsp--;
			if (state.failed) return;
			Identifier8=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodOrFieldDecl1340); if (state.failed) return;
			if ( state.backtracking==0 ) {System.out.print((Identifier8!=null?Identifier8.getText():null)); finalExtraction = finalExtraction + ((Identifier8!=null?Identifier8.getText():null) ); }
			pushFollow(FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl1344);
			interfaceMethodOrFieldRest();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, interfaceMethodOrFieldDecl_StartIndex); }

		}
	}
	// $ANTLR end "interfaceMethodOrFieldDecl"



	// $ANTLR start "interfaceMethodOrFieldRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:303:1: interfaceMethodOrFieldRest : ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest );
	public final void interfaceMethodOrFieldRest() throws RecognitionException {
		int interfaceMethodOrFieldRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:304:5: ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==50||LA46_0==55) ) {
				alt46=1;
			}
			else if ( (LA46_0==32) ) {
				alt46=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:304:9: constantDeclaratorsRest ';'
					{
					pushFollow(FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest1367);
					constantDeclaratorsRest();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_interfaceMethodOrFieldRest1369); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:305:9: interfaceMethodDeclaratorRest
					{
					pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest1379);
					interfaceMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, interfaceMethodOrFieldRest_StartIndex); }

		}
	}
	// $ANTLR end "interfaceMethodOrFieldRest"



	// $ANTLR start "methodDeclaratorRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:308:1: methodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
	public final void methodDeclaratorRest() throws RecognitionException {
		int methodDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:309:5: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:309:9: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' )
			{
			pushFollow(FOLLOW_formalParameters_in_methodDeclaratorRest1402);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:309:26: ( '[' ']' )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==55) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:309:27: '[' ']'
					{
					match(input,55,FOLLOW_55_in_methodDeclaratorRest1405); if (state.failed) return;
					match(input,56,FOLLOW_56_in_methodDeclaratorRest1407); if (state.failed) return;
					}
					break;

				default :
					break loop47;
				}
			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:310:9: ( 'throws' qualifiedNameList )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==101) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:310:10: 'throws' qualifiedNameList
					{
					match(input,101,FOLLOW_101_in_methodDeclaratorRest1420); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaratorRest1422);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:311:9: ( methodBody | ';' )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==108) ) {
				alt49=1;
			}
			else if ( (LA49_0==48) ) {
				alt49=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:311:13: methodBody
					{
					pushFollow(FOLLOW_methodBody_in_methodDeclaratorRest1438);
					methodBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:312:13: ';'
					{
					match(input,48,FOLLOW_48_in_methodDeclaratorRest1452); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, methodDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "methodDeclaratorRest"



	// $ANTLR start "voidMethodDeclaratorRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:316:1: voidMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
	public final void voidMethodDeclaratorRest() throws RecognitionException {
		int voidMethodDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:317:5: ( formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:317:9: formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' )
			{
			pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest1485);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:317:26: ( 'throws' qualifiedNameList )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==101) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:317:27: 'throws' qualifiedNameList
					{
					match(input,101,FOLLOW_101_in_voidMethodDeclaratorRest1488); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1490);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:318:9: ( methodBody | ';' )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==108) ) {
				alt51=1;
			}
			else if ( (LA51_0==48) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:318:13: methodBody
					{
					pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest1506);
					methodBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:319:13: ';'
					{
					match(input,48,FOLLOW_48_in_voidMethodDeclaratorRest1520); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, voidMethodDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "voidMethodDeclaratorRest"



	// $ANTLR start "interfaceMethodDeclaratorRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:323:1: interfaceMethodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' ;
	public final void interfaceMethodDeclaratorRest() throws RecognitionException {
		int interfaceMethodDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:324:5: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:324:9: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';'
			{
			if ( state.backtracking==0 ) {formalParameter=true;}
			pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest1555);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:324:50: ( '[' ']' )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==55) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:324:51: '[' ']'
					{
					match(input,55,FOLLOW_55_in_interfaceMethodDeclaratorRest1558); if (state.failed) return;
					match(input,56,FOLLOW_56_in_interfaceMethodDeclaratorRest1560); if (state.failed) return;
					}
					break;

				default :
					break loop52;
				}
			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:324:61: ( 'throws' qualifiedNameList )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==101) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:324:62: 'throws' qualifiedNameList
					{
					match(input,101,FOLLOW_101_in_interfaceMethodDeclaratorRest1565); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest1567);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,48,FOLLOW_48_in_interfaceMethodDeclaratorRest1571); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, interfaceMethodDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "interfaceMethodDeclaratorRest"



	// $ANTLR start "interfaceGenericMethodDecl"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:327:1: interfaceGenericMethodDecl : typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest ;
	public final void interfaceGenericMethodDecl() throws RecognitionException {
		int interfaceGenericMethodDecl_StartIndex = input.index();

		Token Identifier9=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:328:5: ( typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:328:9: typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest
			{
			pushFollow(FOLLOW_typeParameters_in_interfaceGenericMethodDecl1594);
			typeParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:328:24: ( type | 'void' )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==Identifier||LA54_0==60||LA54_0==62||LA54_0==65||LA54_0==70||LA54_0==76||LA54_0==82||LA54_0==84||LA54_0==93) ) {
				alt54=1;
			}
			else if ( (LA54_0==105) ) {
				alt54=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:328:25: type
					{
					pushFollow(FOLLOW_type_in_interfaceGenericMethodDecl1597);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:328:32: 'void'
					{
					match(input,105,FOLLOW_105_in_interfaceGenericMethodDecl1601); if (state.failed) return;
					}
					break;

			}

			Identifier9=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceGenericMethodDecl1604); if (state.failed) return;
			if ( state.backtracking==0 ) {System.out.print((Identifier9!=null?Identifier9.getText():null)); finalExtraction = finalExtraction + ((Identifier9!=null?Identifier9.getText():null) );}
			pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl1616);
			interfaceMethodDeclaratorRest();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, interfaceGenericMethodDecl_StartIndex); }

		}
	}
	// $ANTLR end "interfaceGenericMethodDecl"



	// $ANTLR start "voidInterfaceMethodDeclaratorRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:332:1: voidInterfaceMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ';' ;
	public final void voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		int voidInterfaceMethodDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:333:5: ( formalParameters ( 'throws' qualifiedNameList )? ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:333:9: formalParameters ( 'throws' qualifiedNameList )? ';'
			{
			if ( state.backtracking==0 ) {formalParameter=true;}
			pushFollow(FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest1641);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:333:50: ( 'throws' qualifiedNameList )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==101) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:333:51: 'throws' qualifiedNameList
					{
					match(input,101,FOLLOW_101_in_voidInterfaceMethodDeclaratorRest1644); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest1646);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,48,FOLLOW_48_in_voidInterfaceMethodDeclaratorRest1650); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, voidInterfaceMethodDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "voidInterfaceMethodDeclaratorRest"



	// $ANTLR start "constructorDeclaratorRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:336:1: constructorDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? constructorBody ;
	public final void constructorDeclaratorRest() throws RecognitionException {
		int constructorDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:337:5: ( formalParameters ( 'throws' qualifiedNameList )? constructorBody )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:337:9: formalParameters ( 'throws' qualifiedNameList )? constructorBody
			{
			if ( state.backtracking==0 ) {formalParameter=true;}
			pushFollow(FOLLOW_formalParameters_in_constructorDeclaratorRest1675);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:337:50: ( 'throws' qualifiedNameList )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==101) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:337:51: 'throws' qualifiedNameList
					{
					match(input,101,FOLLOW_101_in_constructorDeclaratorRest1678); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1680);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_constructorBody_in_constructorDeclaratorRest1684);
			constructorBody();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, constructorDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "constructorDeclaratorRest"



	// $ANTLR start "constantDeclarator"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:340:1: constantDeclarator : Identifier constantDeclaratorRest ;
	public final void constantDeclarator() throws RecognitionException {
		int constantDeclarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:341:5: ( Identifier constantDeclaratorRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:341:9: Identifier constantDeclaratorRest
			{
			match(input,Identifier,FOLLOW_Identifier_in_constantDeclarator1703); if (state.failed) return;
			pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclarator1705);
			constantDeclaratorRest();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, constantDeclarator_StartIndex); }

		}
	}
	// $ANTLR end "constantDeclarator"



	// $ANTLR start "variableDeclarators"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:344:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* ;
	public final void variableDeclarators() throws RecognitionException {
		int variableDeclarators_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:345:5: ( variableDeclarator ( ',' variableDeclarator )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:345:9: variableDeclarator ( ',' variableDeclarator )*
			{
			pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1729);
			variableDeclarator();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:345:28: ( ',' variableDeclarator )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==39) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:345:29: ',' variableDeclarator
					{
					match(input,39,FOLLOW_39_in_variableDeclarators1732); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print(", "); finalExtraction = finalExtraction + ", " ;}
					pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1736);
					variableDeclarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop57;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, variableDeclarators_StartIndex); }

		}
	}
	// $ANTLR end "variableDeclarators"



	// $ANTLR start "variableDeclarator"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:348:1: variableDeclarator : Identifier variableDeclaratorId ( '=' variableInitializer )? ;
	public final void variableDeclarator() throws RecognitionException {
		int variableDeclarator_StartIndex = input.index();

		Token Identifier10=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:349:5: ( Identifier variableDeclaratorId ( '=' variableInitializer )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:349:9: Identifier variableDeclaratorId ( '=' variableInitializer )?
			{
			Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclarator1758); if (state.failed) return;
			if ( state.backtracking==0 ) {isClassObject= false;System.out.println((Identifier10!=null?Identifier10.getText():null)+"\n");finalExtraction = finalExtraction + ((Identifier10!=null?Identifier10.getText():null)+"\n" );}
			pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator1762);
			variableDeclaratorId();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:349:169: ( '=' variableInitializer )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==50) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:349:170: '=' variableInitializer
					{
					match(input,50,FOLLOW_50_in_variableDeclarator1766); if (state.failed) return;
					pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1768);
					variableInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, variableDeclarator_StartIndex); }

		}
	}
	// $ANTLR end "variableDeclarator"



	// $ANTLR start "constantDeclaratorsRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:352:1: constantDeclaratorsRest : constantDeclaratorRest ( ',' constantDeclarator )* ;
	public final void constantDeclaratorsRest() throws RecognitionException {
		int constantDeclaratorsRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:353:5: ( constantDeclaratorRest ( ',' constantDeclarator )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:353:9: constantDeclaratorRest ( ',' constantDeclarator )*
			{
			pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1793);
			constantDeclaratorRest();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:353:32: ( ',' constantDeclarator )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==39) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:353:33: ',' constantDeclarator
					{
					match(input,39,FOLLOW_39_in_constantDeclaratorsRest1796); if (state.failed) return;
					pushFollow(FOLLOW_constantDeclarator_in_constantDeclaratorsRest1798);
					constantDeclarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop59;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, constantDeclaratorsRest_StartIndex); }

		}
	}
	// $ANTLR end "constantDeclaratorsRest"



	// $ANTLR start "constantDeclaratorRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:356:1: constantDeclaratorRest : ( '[' ']' )* '=' variableInitializer ;
	public final void constantDeclaratorRest() throws RecognitionException {
		int constantDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:357:5: ( ( '[' ']' )* '=' variableInitializer )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:357:7: ( '[' ']' )* '=' variableInitializer
			{
			if ( state.backtracking==0 ) {isClassObject= false;}
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:357:32: ( '[' ']' )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==55) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:357:33: '[' ']'
					{
					match(input,55,FOLLOW_55_in_constantDeclaratorRest1821); if (state.failed) return;
					match(input,56,FOLLOW_56_in_constantDeclaratorRest1823); if (state.failed) return;
					}
					break;

				default :
					break loop60;
				}
			}

			match(input,50,FOLLOW_50_in_constantDeclaratorRest1827); if (state.failed) return;
			pushFollow(FOLLOW_variableInitializer_in_constantDeclaratorRest1829);
			variableInitializer();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, constantDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "constantDeclaratorRest"



	// $ANTLR start "variableDeclaratorId"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:360:1: variableDeclaratorId : ( '[' ']' )* ;
	public final void variableDeclaratorId() throws RecognitionException {
		int variableDeclaratorId_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:361:5: ( ( '[' ']' )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:361:9: ( '[' ']' )*
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:361:9: ( '[' ']' )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==55) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:361:10: '[' ']'
					{
					match(input,55,FOLLOW_55_in_variableDeclaratorId1853); if (state.failed) return;
					match(input,56,FOLLOW_56_in_variableDeclaratorId1855); if (state.failed) return;
					}
					break;

				default :
					break loop61;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, variableDeclaratorId_StartIndex); }

		}
	}
	// $ANTLR end "variableDeclaratorId"



	// $ANTLR start "variableInitializer"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:364:1: variableInitializer : ( arrayInitializer | expression );
	public final void variableInitializer() throws RecognitionException {
		int variableInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:365:5: ( arrayInitializer | expression )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==108) ) {
				alt62=1;
			}
			else if ( ((LA62_0 >= CharacterLiteral && LA62_0 <= DecimalLiteral)||LA62_0==FloatingPointLiteral||(LA62_0 >= HexLiteral && LA62_0 <= Identifier)||(LA62_0 >= OctalLiteral && LA62_0 <= StringLiteral)||LA62_0==25||LA62_0==32||(LA62_0 >= 36 && LA62_0 <= 37)||(LA62_0 >= 40 && LA62_0 <= 41)||LA62_0==60||LA62_0==62||LA62_0==65||LA62_0==70||LA62_0==73||LA62_0==76||LA62_0==82||LA62_0==84||(LA62_0 >= 86 && LA62_0 <= 87)||LA62_0==93||LA62_0==96||LA62_0==99||LA62_0==103||LA62_0==105||LA62_0==113) ) {
				alt62=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:365:9: arrayInitializer
					{
					pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1877);
					arrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:366:9: expression
					{
					pushFollow(FOLLOW_expression_in_variableInitializer1887);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, variableInitializer_StartIndex); }

		}
	}
	// $ANTLR end "variableInitializer"



	// $ANTLR start "arrayInitializer"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:369:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' ;
	public final void arrayInitializer() throws RecognitionException {
		int arrayInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:370:5: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:370:9: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
			{
			match(input,108,FOLLOW_108_in_arrayInitializer1914); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:370:13: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( ((LA65_0 >= CharacterLiteral && LA65_0 <= DecimalLiteral)||LA65_0==FloatingPointLiteral||(LA65_0 >= HexLiteral && LA65_0 <= Identifier)||(LA65_0 >= OctalLiteral && LA65_0 <= StringLiteral)||LA65_0==25||LA65_0==32||(LA65_0 >= 36 && LA65_0 <= 37)||(LA65_0 >= 40 && LA65_0 <= 41)||LA65_0==60||LA65_0==62||LA65_0==65||LA65_0==70||LA65_0==73||LA65_0==76||LA65_0==82||LA65_0==84||(LA65_0 >= 86 && LA65_0 <= 87)||LA65_0==93||LA65_0==96||LA65_0==99||LA65_0==103||LA65_0==105||LA65_0==108||LA65_0==113) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:370:14: variableInitializer ( ',' variableInitializer )* ( ',' )?
					{
					pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1917);
					variableInitializer();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:370:34: ( ',' variableInitializer )*
					loop63:
					while (true) {
						int alt63=2;
						int LA63_0 = input.LA(1);
						if ( (LA63_0==39) ) {
							int LA63_1 = input.LA(2);
							if ( ((LA63_1 >= CharacterLiteral && LA63_1 <= DecimalLiteral)||LA63_1==FloatingPointLiteral||(LA63_1 >= HexLiteral && LA63_1 <= Identifier)||(LA63_1 >= OctalLiteral && LA63_1 <= StringLiteral)||LA63_1==25||LA63_1==32||(LA63_1 >= 36 && LA63_1 <= 37)||(LA63_1 >= 40 && LA63_1 <= 41)||LA63_1==60||LA63_1==62||LA63_1==65||LA63_1==70||LA63_1==73||LA63_1==76||LA63_1==82||LA63_1==84||(LA63_1 >= 86 && LA63_1 <= 87)||LA63_1==93||LA63_1==96||LA63_1==99||LA63_1==103||LA63_1==105||LA63_1==108||LA63_1==113) ) {
								alt63=1;
							}

						}

						switch (alt63) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:370:35: ',' variableInitializer
							{
							match(input,39,FOLLOW_39_in_arrayInitializer1920); if (state.failed) return;
							pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1922);
							variableInitializer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop63;
						}
					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:370:61: ( ',' )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==39) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:370:62: ','
							{
							match(input,39,FOLLOW_39_in_arrayInitializer1927); if (state.failed) return;
							}
							break;

					}

					}
					break;

			}

			match(input,112,FOLLOW_112_in_arrayInitializer1934); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, arrayInitializer_StartIndex); }

		}
	}
	// $ANTLR end "arrayInitializer"



	// $ANTLR start "modifier"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:373:1: modifier : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' );
	public final void modifier() throws RecognitionException {
		int modifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:374:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )
			int alt66=12;
			switch ( input.LA(1) ) {
			case 54:
				{
				alt66=1;
				}
				break;
			case 91:
				{
				alt66=2;
				}
				break;
			case 90:
				{
				alt66=3;
				}
				break;
			case 89:
				{
				alt66=4;
				}
				break;
			case 94:
				{
				alt66=5;
				}
				break;
			case 59:
				{
				alt66=6;
				}
				break;
			case 74:
				{
				alt66=7;
				}
				break;
			case 85:
				{
				alt66=8;
				}
				break;
			case 98:
				{
				alt66=9;
				}
				break;
			case 102:
				{
				alt66=10;
				}
				break;
			case 106:
				{
				alt66=11;
				}
				break;
			case 95:
				{
				alt66=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:374:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_modifier1953);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:375:9: 'public'
					{
					match(input,91,FOLLOW_91_in_modifier1963); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  public "); finalExtraction = finalExtraction + "  public ";}
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:376:9: 'protected'
					{
					match(input,90,FOLLOW_90_in_modifier1975); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  protected "); finalExtraction = finalExtraction + "  protected ";}
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:377:9: 'private'
					{
					match(input,89,FOLLOW_89_in_modifier1987); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  private "); finalExtraction = finalExtraction + "  private ";}
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:378:9: 'static'
					{
					match(input,94,FOLLOW_94_in_modifier1999); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  static "); finalExtraction = finalExtraction + "  static ";}
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:379:9: 'abstract'
					{
					match(input,59,FOLLOW_59_in_modifier2011); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  abstract "); finalExtraction = finalExtraction + " abstract ";}
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:380:9: 'final'
					{
					match(input,74,FOLLOW_74_in_modifier2023); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  final "); finalExtraction = finalExtraction + "  final ";}
					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:381:9: 'native'
					{
					match(input,85,FOLLOW_85_in_modifier2035); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  native "); finalExtraction = finalExtraction + "  native ";}
					}
					break;
				case 9 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:382:9: 'synchronized'
					{
					match(input,98,FOLLOW_98_in_modifier2047); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  synchronized "); finalExtraction = finalExtraction + "  synchronized ";}
					}
					break;
				case 10 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:383:9: 'transient'
					{
					match(input,102,FOLLOW_102_in_modifier2059); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  transient "); finalExtraction = finalExtraction + "  transient ";}
					}
					break;
				case 11 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:384:9: 'volatile'
					{
					match(input,106,FOLLOW_106_in_modifier2071); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  volatile "); finalExtraction = finalExtraction + "  volatile ";}
					}
					break;
				case 12 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:385:9: 'strictfp'
					{
					match(input,95,FOLLOW_95_in_modifier2083); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("  strictfp "); finalExtraction = finalExtraction + "  strictfp ";}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, modifier_StartIndex); }

		}
	}
	// $ANTLR end "modifier"



	// $ANTLR start "packageOrTypeName"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:388:1: packageOrTypeName : qualifiedName ;
	public final void packageOrTypeName() throws RecognitionException {
		int packageOrTypeName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:389:5: ( qualifiedName )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:389:9: qualifiedName
			{
			pushFollow(FOLLOW_qualifiedName_in_packageOrTypeName2104);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, packageOrTypeName_StartIndex); }

		}
	}
	// $ANTLR end "packageOrTypeName"



	// $ANTLR start "enumConstantName"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:392:1: enumConstantName : Identifier ;
	public final void enumConstantName() throws RecognitionException {
		int enumConstantName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:393:5: ( Identifier )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:393:9: Identifier
			{
			match(input,Identifier,FOLLOW_Identifier_in_enumConstantName2123); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, enumConstantName_StartIndex); }

		}
	}
	// $ANTLR end "enumConstantName"



	// $ANTLR start "typeName"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:396:1: typeName : qualifiedName ;
	public final void typeName() throws RecognitionException {
		int typeName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:397:5: ( qualifiedName )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:397:9: qualifiedName
			{
			pushFollow(FOLLOW_qualifiedName_in_typeName2142);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, typeName_StartIndex); }

		}
	}
	// $ANTLR end "typeName"



	// $ANTLR start "type"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:400:1: type : ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* );
	public final void type() throws RecognitionException {
		int type_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:401:2: ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==Identifier) ) {
				alt69=1;
			}
			else if ( (LA69_0==60||LA69_0==62||LA69_0==65||LA69_0==70||LA69_0==76||LA69_0==82||LA69_0==84||LA69_0==93) ) {
				alt69=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:401:4: classOrInterfaceType ( '[' ']' )*
					{
					pushFollow(FOLLOW_classOrInterfaceType_in_type2156);
					classOrInterfaceType();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:401:25: ( '[' ']' )*
					loop67:
					while (true) {
						int alt67=2;
						int LA67_0 = input.LA(1);
						if ( (LA67_0==55) ) {
							int LA67_2 = input.LA(2);
							if ( (LA67_2==56) ) {
								int LA67_3 = input.LA(3);
								if ( (synpred91_BasForCCal()) ) {
									alt67=1;
								}

							}

						}

						switch (alt67) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:401:26: '[' ']'
							{
							match(input,55,FOLLOW_55_in_type2159); if (state.failed) return;
							match(input,56,FOLLOW_56_in_type2161); if (state.failed) return;
							}
							break;

						default :
							break loop67;
						}
					}

					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:402:4: primitiveType ( '[' ']' )*
					{
					pushFollow(FOLLOW_primitiveType_in_type2168);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:402:18: ( '[' ']' )*
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==55) ) {
							int LA68_2 = input.LA(2);
							if ( (LA68_2==56) ) {
								int LA68_3 = input.LA(3);
								if ( (synpred93_BasForCCal()) ) {
									alt68=1;
								}

							}

						}

						switch (alt68) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:402:19: '[' ']'
							{
							match(input,55,FOLLOW_55_in_type2171); if (state.failed) return;
							match(input,56,FOLLOW_56_in_type2173); if (state.failed) return;
							}
							break;

						default :
							break loop68;
						}
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, type_StartIndex); }

		}
	}
	// $ANTLR end "type"



	// $ANTLR start "classOrInterfaceType"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:405:1: classOrInterfaceType : I1= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* ;
	public final void classOrInterfaceType() throws RecognitionException {
		int classOrInterfaceType_StartIndex = input.index();

		Token I1=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:406:2: (I1= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:406:4: I1= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )*
			{
			I1=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType2188); if (state.failed) return;
			if ( state.backtracking==0 ) {if(isExtends){ 
				                          System.out.println("Ancestor classes:  "+(I1!=null?I1.getText():null)); isExtends=false;
				                          finalExtraction = finalExtraction + "\n  Ancestor classes: "+(I1!=null?I1.getText():null);
				                          ancestorkey = (I1!=null?I1.getText():null);
				                          if(ancestormap.containsKey(ancestorkey)){
				                          	ancestormap.get(ancestorkey).add(descendantname);
				                          }else{
				                          	descendants.add(descendantname);
				                          	ancestormap.put(ancestorkey,descendants);
				                          }
				                        } 
				                       else if(isImp){
				                       	  System.out.println("implements "+(I1!=null?I1.getText():null)); isExtends=false;
				                       	  isImp=false;
				                       	  finalExtraction = finalExtraction + "\n  implements: "+(I1!=null?I1.getText():null); 
				                       } 
				                       else {
				                       		if(isMethodVariable &&  !isExtends  && !isImp ){
						                       System.out.println("Local variable: ");
						                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
						                       isMethodVariable = false;}
					                       if(!isMethodVariable)
					                       {
					                        
						                       if(isClassObject){
						                        System.out.print( (I1!=null?I1.getText():null) +" ");
						                        finalExtraction = finalExtraction + "    "+(I1!=null?I1.getText():null)+" "; 
						                        isClassObject = false;
						                       }
					                        }
				                        }
				                       if  (!(I1!=null?I1.getText():null).equals("int") && !(I1!=null?I1.getText():null).equals("boolean")&& !(I1!=null?I1.getText():null).equals("char") && !(I1!=null?I1.getText():null).equals("byte")
				                        && !(I1!=null?I1.getText():null).equals("short") && !(I1!=null?I1.getText():null).equals("long") && !(I1!=null?I1.getText():null).equals("float")&&!(I1!=null?I1.getText():null).equals("double")&&!(I1!=null?I1.getText():null).equals("String")){
				                        	if(!aggregates.contains((I1!=null?I1.getText():null))&& !formalParameter && variableDeclare)
				                        		aggregates.add((I1!=null?I1.getText():null)); 
				                        	else if(!associates.contains((I1!=null?I1.getText():null))&& isMethodMember && formalParameter){
				                        	   associates.add((I1!=null?I1.getText():null));formalParameter=false;
				                        	}	
				                        }
				                       
				                       }
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:447:11: ( typeArguments )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==49) ) {
				int LA70_1 = input.LA(2);
				if ( (LA70_1==Identifier||LA70_1==53||LA70_1==60||LA70_1==62||LA70_1==65||LA70_1==70||LA70_1==76||LA70_1==82||LA70_1==84||LA70_1==93) ) {
					alt70=1;
				}
			}
			switch (alt70) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:447:11: typeArguments
					{
					pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2202);
					typeArguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:447:26: ( '.' Identifier ( typeArguments )? )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==43) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:447:27: '.' Identifier ( typeArguments )?
					{
					match(input,43,FOLLOW_43_in_classOrInterfaceType2206); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType2208); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:447:42: ( typeArguments )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==49) ) {
						int LA71_1 = input.LA(2);
						if ( (LA71_1==Identifier||LA71_1==53||LA71_1==60||LA71_1==62||LA71_1==65||LA71_1==70||LA71_1==76||LA71_1==82||LA71_1==84||LA71_1==93) ) {
							alt71=1;
						}
					}
					switch (alt71) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:447:42: typeArguments
							{
							pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2210);
							typeArguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

				default :
					break loop72;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, classOrInterfaceType_StartIndex); }

		}
	}
	// $ANTLR end "classOrInterfaceType"



	// $ANTLR start "primitiveType"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:450:1: primitiveType : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
	public final void primitiveType() throws RecognitionException {
		int primitiveType_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:451:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
			int alt73=8;
			switch ( input.LA(1) ) {
			case 60:
				{
				alt73=1;
				}
				break;
			case 65:
				{
				alt73=2;
				}
				break;
			case 62:
				{
				alt73=3;
				}
				break;
			case 93:
				{
				alt73=4;
				}
				break;
			case 82:
				{
				alt73=5;
				}
				break;
			case 84:
				{
				alt73=6;
				}
				break;
			case 76:
				{
				alt73=7;
				}
				break;
			case 70:
				{
				alt73=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:451:9: 'boolean'
					{
					match(input,60,FOLLOW_60_in_primitiveType2231); if (state.failed) return;
					if ( state.backtracking==0 ) {if(isMethodVariable){  System.out.println("Local variable: ");
						                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
						                       isMethodVariable = false; }{System.out.print("boolean "); finalExtraction = finalExtraction + "boolean ";}}
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:454:9: 'char'
					{
					match(input,65,FOLLOW_65_in_primitiveType2243); if (state.failed) return;
					if ( state.backtracking==0 ) {if(isMethodVariable){  System.out.println("Local variable: ");
						                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
						                       isMethodVariable = false;}{System.out.print("char "); finalExtraction = finalExtraction + "char ";}}
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:457:9: 'byte'
					{
					match(input,62,FOLLOW_62_in_primitiveType2255); if (state.failed) return;
					if ( state.backtracking==0 ) {if(isMethodVariable){  System.out.println("Local variable: ");
						                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
						                       isMethodVariable = false;}{System.out.print("byte "); finalExtraction = finalExtraction + "byte ";}}
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:460:9: 'short'
					{
					match(input,93,FOLLOW_93_in_primitiveType2267); if (state.failed) return;
					if ( state.backtracking==0 ) {if(isMethodVariable){  System.out.println("Local variable: ");
						                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
						                       isMethodVariable = false;}{System.out.print("short "); finalExtraction = finalExtraction + "short ";}}
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:463:9: 'int'
					{
					match(input,82,FOLLOW_82_in_primitiveType2279); if (state.failed) return;
					if ( state.backtracking==0 ) {if(isMethodVariable){  System.out.println("Local variable: ");
						                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
						                       isMethodVariable = false;}{System.out.print("int "); intCount++;finalExtraction = finalExtraction + "int ";}}
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:466:9: 'long'
					{
					match(input,84,FOLLOW_84_in_primitiveType2292); if (state.failed) return;
					if ( state.backtracking==0 ) {if(isMethodVariable){  System.out.println("Local variable: ");
						                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
						                       isMethodVariable = false;}{System.out.print("long "); finalExtraction = finalExtraction + "long ";}}
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:469:9: 'float'
					{
					match(input,76,FOLLOW_76_in_primitiveType2304); if (state.failed) return;
					if ( state.backtracking==0 ) {if(isMethodVariable){  System.out.println("Local variable: ");
						                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
						                       isMethodVariable = false;}{System.out.print("float "); finalExtraction = finalExtraction + "float ";}}
					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:472:9: 'double'
					{
					match(input,70,FOLLOW_70_in_primitiveType2316); if (state.failed) return;
					if ( state.backtracking==0 ) {if(isMethodVariable){  System.out.println("Local variable: ");
						                       finalExtraction = finalExtraction + "Local Variables:  \n"; 
						                       isMethodVariable = false;}{System.out.print("double "); finalExtraction = finalExtraction + "double ";}}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, primitiveType_StartIndex); }

		}
	}
	// $ANTLR end "primitiveType"



	// $ANTLR start "variableModifier"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:477:1: variableModifier : ( 'final' | Identifier annotation );
	public final void variableModifier() throws RecognitionException {
		int variableModifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:478:5: ( 'final' | Identifier annotation )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==74) ) {
				alt74=1;
			}
			else if ( (LA74_0==Identifier) ) {
				alt74=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:478:9: 'final'
					{
					match(input,74,FOLLOW_74_in_variableModifier2337); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print("final "); finalExtraction = finalExtraction + "final ";}
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:479:8: Identifier annotation
					{
					match(input,Identifier,FOLLOW_Identifier_in_variableModifier2349); if (state.failed) return;
					pushFollow(FOLLOW_annotation_in_variableModifier2351);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, variableModifier_StartIndex); }

		}
	}
	// $ANTLR end "variableModifier"



	// $ANTLR start "typeArguments"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:482:1: typeArguments : '<' typeArgument ( ',' typeArgument )* '>' ;
	public final void typeArguments() throws RecognitionException {
		int typeArguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:483:5: ( '<' typeArgument ( ',' typeArgument )* '>' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:483:9: '<' typeArgument ( ',' typeArgument )* '>'
			{
			match(input,49,FOLLOW_49_in_typeArguments2371); if (state.failed) return;
			pushFollow(FOLLOW_typeArgument_in_typeArguments2373);
			typeArgument();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:483:26: ( ',' typeArgument )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==39) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:483:27: ',' typeArgument
					{
					match(input,39,FOLLOW_39_in_typeArguments2376); if (state.failed) return;
					pushFollow(FOLLOW_typeArgument_in_typeArguments2378);
					typeArgument();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop75;
				}
			}

			match(input,52,FOLLOW_52_in_typeArguments2382); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, typeArguments_StartIndex); }

		}
	}
	// $ANTLR end "typeArguments"



	// $ANTLR start "typeArgument"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:486:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );
	public final void typeArgument() throws RecognitionException {
		int typeArgument_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:487:5: ( type | '?' ( ( 'extends' | 'super' ) type )? )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==Identifier||LA77_0==60||LA77_0==62||LA77_0==65||LA77_0==70||LA77_0==76||LA77_0==82||LA77_0==84||LA77_0==93) ) {
				alt77=1;
			}
			else if ( (LA77_0==53) ) {
				alt77=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:487:9: type
					{
					pushFollow(FOLLOW_type_in_typeArgument2405);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:488:9: '?' ( ( 'extends' | 'super' ) type )?
					{
					match(input,53,FOLLOW_53_in_typeArgument2415); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:488:13: ( ( 'extends' | 'super' ) type )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==72||LA76_0==96) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:488:14: ( 'extends' | 'super' ) type
							{
							if ( input.LA(1)==72||input.LA(1)==96 ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							pushFollow(FOLLOW_type_in_typeArgument2426);
							type();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, typeArgument_StartIndex); }

		}
	}
	// $ANTLR end "typeArgument"



	// $ANTLR start "qualifiedNameList"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:491:1: qualifiedNameList : Identifier qualifiedName ( ',' qualifiedName )* ;
	public final void qualifiedNameList() throws RecognitionException {
		int qualifiedNameList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:492:5: ( Identifier qualifiedName ( ',' qualifiedName )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:492:8: Identifier qualifiedName ( ',' qualifiedName )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_qualifiedNameList2450); if (state.failed) return;
			pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList2452);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:492:33: ( ',' qualifiedName )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==39) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:492:34: ',' qualifiedName
					{
					match(input,39,FOLLOW_39_in_qualifiedNameList2455); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList2457);
					qualifiedName();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop78;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, qualifiedNameList_StartIndex); }

		}
	}
	// $ANTLR end "qualifiedNameList"



	// $ANTLR start "formalParameters"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:495:1: formalParameters : '(' ( formalParameterDecls )? ')' ;
	public final void formalParameters() throws RecognitionException {
		int formalParameters_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:496:5: ( '(' ( formalParameterDecls )? ')' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:496:9: '(' ( formalParameterDecls )? ')'
			{
			if ( state.backtracking==0 ) {System.out.print("(");finalExtraction = finalExtraction + "(";}
			match(input,32,FOLLOW_32_in_formalParameters2480); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:496:77: ( formalParameterDecls )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==Identifier||LA79_0==60||LA79_0==62||LA79_0==65||LA79_0==70||LA79_0==74||LA79_0==76||LA79_0==82||LA79_0==84||LA79_0==93) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:496:77: formalParameterDecls
					{
					pushFollow(FOLLOW_formalParameterDecls_in_formalParameters2482);
					formalParameterDecls();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,33,FOLLOW_33_in_formalParameters2485); if (state.failed) return;
			if ( state.backtracking==0 ) {System.out.println(") \n");finalExtraction = finalExtraction + ") \n";}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, formalParameters_StartIndex); }

		}
	}
	// $ANTLR end "formalParameters"



	// $ANTLR start "formalParameterDecls"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:499:1: formalParameterDecls : variableModifiers type formalParameterDeclsRest ;
	public final void formalParameterDecls() throws RecognitionException {
		int formalParameterDecls_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:500:5: ( variableModifiers type formalParameterDeclsRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:500:9: variableModifiers type formalParameterDeclsRest
			{
			if ( state.backtracking==0 ) {formalParameter = true;}
			pushFollow(FOLLOW_variableModifiers_in_formalParameterDecls2512);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_formalParameterDecls2514);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_formalParameterDeclsRest_in_formalParameterDecls2516);
			formalParameterDeclsRest();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, formalParameterDecls_StartIndex); }

		}
	}
	// $ANTLR end "formalParameterDecls"



	// $ANTLR start "formalParameterDeclsRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:503:1: formalParameterDeclsRest : ( Identifier variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId );
	public final void formalParameterDeclsRest() throws RecognitionException {
		int formalParameterDeclsRest_StartIndex = input.index();

		Token Identifier11=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:504:5: ( Identifier variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==Identifier) ) {
				alt81=1;
			}
			else if ( (LA81_0==44) ) {
				alt81=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:504:8: Identifier variableDeclaratorId ( ',' formalParameterDecls )?
					{
					Identifier11=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterDeclsRest2538); if (state.failed) return;
					pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2540);
					variableDeclaratorId();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.print((Identifier11!=null?Identifier11.getText():null));
					    finalExtraction = finalExtraction + (Identifier11!=null?Identifier11.getText():null);}
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:505:59: ( ',' formalParameterDecls )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==39) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:505:60: ',' formalParameterDecls
							{
							match(input,39,FOLLOW_39_in_formalParameterDeclsRest2544); if (state.failed) return;
							if ( state.backtracking==0 ) {System.out.print(",");finalExtraction = finalExtraction + ",";}
							pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDeclsRest2548);
							formalParameterDecls();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:506:9: '...' variableDeclaratorId
					{
					match(input,44,FOLLOW_44_in_formalParameterDeclsRest2562); if (state.failed) return;
					pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2564);
					variableDeclaratorId();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, formalParameterDeclsRest_StartIndex); }

		}
	}
	// $ANTLR end "formalParameterDeclsRest"



	// $ANTLR start "methodBody"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:509:1: methodBody : block ;
	public final void methodBody() throws RecognitionException {
		int methodBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:510:5: ( block )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:510:8: block
			{
			if ( state.backtracking==0 ) {if(isMethodMember){isMethodVariable = true;isClassObject = true;}}
			pushFollow(FOLLOW_block_in_methodBody2588);
			block();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, methodBody_StartIndex); }

		}
	}
	// $ANTLR end "methodBody"



	// $ANTLR start "constructorBody"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:513:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' ;
	public final void constructorBody() throws RecognitionException {
		int constructorBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:514:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:514:9: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
			{
			match(input,108,FOLLOW_108_in_constructorBody2607); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:514:13: ( explicitConstructorInvocation )?
			int alt82=2;
			switch ( input.LA(1) ) {
				case 49:
					{
					alt82=1;
					}
					break;
				case 99:
					{
					int LA82_2 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 32:
					{
					int LA82_3 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 96:
					{
					int LA82_4 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case DecimalLiteral:
				case HexLiteral:
				case OctalLiteral:
					{
					int LA82_5 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case FloatingPointLiteral:
					{
					int LA82_6 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case CharacterLiteral:
					{
					int LA82_7 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case StringLiteral:
					{
					int LA82_8 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 73:
				case 103:
					{
					int LA82_9 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 87:
					{
					int LA82_10 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 86:
					{
					int LA82_11 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case Identifier:
					{
					int LA82_12 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 60:
					{
					int LA82_13 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 65:
					{
					int LA82_14 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 62:
					{
					int LA82_15 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 93:
					{
					int LA82_16 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 82:
					{
					int LA82_17 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 84:
					{
					int LA82_18 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 76:
					{
					int LA82_19 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 70:
					{
					int LA82_20 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
				case 105:
					{
					int LA82_21 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt82=1;
					}
					}
					break;
			}
			switch (alt82) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:514:13: explicitConstructorInvocation
					{
					pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody2609);
					explicitConstructorInvocation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:514:44: ( blockStatement )*
			loop83:
			while (true) {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( (LA83_0==ASSERT||(LA83_0 >= CharacterLiteral && LA83_0 <= ENUM)||LA83_0==FloatingPointLiteral||(LA83_0 >= HexLiteral && LA83_0 <= Identifier)||(LA83_0 >= OctalLiteral && LA83_0 <= StringLiteral)||LA83_0==25||LA83_0==32||(LA83_0 >= 36 && LA83_0 <= 37)||(LA83_0 >= 40 && LA83_0 <= 41)||LA83_0==48||LA83_0==54||(LA83_0 >= 59 && LA83_0 <= 62)||(LA83_0 >= 65 && LA83_0 <= 67)||(LA83_0 >= 69 && LA83_0 <= 70)||(LA83_0 >= 73 && LA83_0 <= 74)||(LA83_0 >= 76 && LA83_0 <= 78)||(LA83_0 >= 82 && LA83_0 <= 84)||(LA83_0 >= 86 && LA83_0 <= 87)||(LA83_0 >= 89 && LA83_0 <= 100)||(LA83_0 >= 103 && LA83_0 <= 105)||(LA83_0 >= 107 && LA83_0 <= 108)||LA83_0==113) ) {
					alt83=1;
				}

				switch (alt83) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:514:44: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_constructorBody2612);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop83;
				}
			}

			match(input,112,FOLLOW_112_in_constructorBody2615); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, constructorBody_StartIndex); }

		}
	}
	// $ANTLR end "constructorBody"



	// $ANTLR start "explicitConstructorInvocation"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:517:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' );
	public final void explicitConstructorInvocation() throws RecognitionException {
		int explicitConstructorInvocation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:518:5: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' )
			int alt86=2;
			switch ( input.LA(1) ) {
			case 49:
				{
				alt86=1;
				}
				break;
			case 99:
				{
				int LA86_2 = input.LA(2);
				if ( (synpred117_BasForCCal()) ) {
					alt86=1;
				}
				else if ( (true) ) {
					alt86=2;
				}

				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case Identifier:
			case OctalLiteral:
			case StringLiteral:
			case 32:
			case 60:
			case 62:
			case 65:
			case 70:
			case 73:
			case 76:
			case 82:
			case 84:
			case 86:
			case 87:
			case 93:
			case 103:
			case 105:
				{
				alt86=2;
				}
				break;
			case 96:
				{
				int LA86_4 = input.LA(2);
				if ( (synpred117_BasForCCal()) ) {
					alt86=1;
				}
				else if ( (true) ) {
					alt86=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}
			switch (alt86) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:518:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:518:9: ( nonWildcardTypeArguments )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==49) ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:518:9: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2634);
							nonWildcardTypeArguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( input.LA(1)==96||input.LA(1)==99 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation2645);
					arguments();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_explicitConstructorInvocation2647); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:519:9: primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';'
					{
					pushFollow(FOLLOW_primary_in_explicitConstructorInvocation2657);
					primary();
					state._fsp--;
					if (state.failed) return;
					match(input,43,FOLLOW_43_in_explicitConstructorInvocation2659); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:519:21: ( nonWildcardTypeArguments )?
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==49) ) {
						alt85=1;
					}
					switch (alt85) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:519:21: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2661);
							nonWildcardTypeArguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,96,FOLLOW_96_in_explicitConstructorInvocation2664); if (state.failed) return;
					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation2666);
					arguments();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_explicitConstructorInvocation2668); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, explicitConstructorInvocation_StartIndex); }

		}
	}
	// $ANTLR end "explicitConstructorInvocation"



	// $ANTLR start "qualifiedName"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:523:1: qualifiedName : Identifier ( '.' Identifier )* ;
	public final void qualifiedName() throws RecognitionException {
		int qualifiedName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:524:5: ( Identifier ( '.' Identifier )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:524:9: Identifier ( '.' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_qualifiedName2688); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:524:20: ( '.' Identifier )*
			loop87:
			while (true) {
				int alt87=2;
				int LA87_0 = input.LA(1);
				if ( (LA87_0==43) ) {
					int LA87_2 = input.LA(2);
					if ( (LA87_2==Identifier) ) {
						alt87=1;
					}

				}

				switch (alt87) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:524:21: '.' Identifier
					{
					match(input,43,FOLLOW_43_in_qualifiedName2691); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_qualifiedName2693); if (state.failed) return;
					}
					break;

				default :
					break loop87;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, qualifiedName_StartIndex); }

		}
	}
	// $ANTLR end "qualifiedName"



	// $ANTLR start "literal"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:527:1: literal : ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );
	public final void literal() throws RecognitionException {
		int literal_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:528:5: ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
			int alt88=6;
			switch ( input.LA(1) ) {
			case DecimalLiteral:
			case HexLiteral:
			case OctalLiteral:
				{
				alt88=1;
				}
				break;
			case FloatingPointLiteral:
				{
				alt88=2;
				}
				break;
			case CharacterLiteral:
				{
				alt88=3;
				}
				break;
			case StringLiteral:
				{
				alt88=4;
				}
				break;
			case 73:
			case 103:
				{
				alt88=5;
				}
				break;
			case 87:
				{
				alt88=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}
			switch (alt88) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:528:9: integerLiteral
					{
					pushFollow(FOLLOW_integerLiteral_in_literal2719);
					integerLiteral();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:529:9: FloatingPointLiteral
					{
					match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal2729); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:530:9: CharacterLiteral
					{
					match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal2739); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:531:9: StringLiteral
					{
					match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2749); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:532:9: booleanLiteral
					{
					pushFollow(FOLLOW_booleanLiteral_in_literal2759);
					booleanLiteral();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:533:9: 'null'
					{
					match(input,87,FOLLOW_87_in_literal2769); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, literal_StartIndex); }

		}
	}
	// $ANTLR end "literal"



	// $ANTLR start "integerLiteral"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:536:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
	public final void integerLiteral() throws RecognitionException {
		int integerLiteral_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:537:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:
			{
			if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, integerLiteral_StartIndex); }

		}
	}
	// $ANTLR end "integerLiteral"



	// $ANTLR start "booleanLiteral"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:542:1: booleanLiteral : ( 'true' | 'false' );
	public final void booleanLiteral() throws RecognitionException {
		int booleanLiteral_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:543:5: ( 'true' | 'false' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:
			{
			if ( input.LA(1)==73||input.LA(1)==103 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, booleanLiteral_StartIndex); }

		}
	}
	// $ANTLR end "booleanLiteral"



	// $ANTLR start "annotations"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:549:1: annotations : ( annotation )+ ;
	public final void annotations() throws RecognitionException {
		int annotations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:550:5: ( ( annotation )+ )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:550:9: ( annotation )+
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:550:9: ( annotation )+
			int cnt89=0;
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==54) ) {
					int LA89_2 = input.LA(2);
					if ( (LA89_2==Identifier) ) {
						int LA89_3 = input.LA(3);
						if ( (synpred128_BasForCCal()) ) {
							alt89=1;
						}

					}

				}

				switch (alt89) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:550:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_annotations2858);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt89 >= 1 ) break loop89;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(89, input);
					throw eee;
				}
				cnt89++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, annotations_StartIndex); }

		}
	}
	// $ANTLR end "annotations"



	// $ANTLR start "annotation"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:553:1: annotation : '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )? ;
	public final void annotation() throws RecognitionException {
		int annotation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:554:5: ( '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:554:9: '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
			{
			match(input,54,FOLLOW_54_in_annotation2878); if (state.failed) return;
			pushFollow(FOLLOW_annotationName_in_annotation2880);
			annotationName();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:554:28: ( '(' ( elementValuePairs | elementValue )? ')' )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==32) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:554:30: '(' ( elementValuePairs | elementValue )? ')'
					{
					match(input,32,FOLLOW_32_in_annotation2884); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:554:34: ( elementValuePairs | elementValue )?
					int alt90=3;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==Identifier) ) {
						int LA90_1 = input.LA(2);
						if ( (LA90_1==50) ) {
							alt90=1;
						}
						else if ( ((LA90_1 >= 26 && LA90_1 <= 27)||(LA90_1 >= 29 && LA90_1 <= 30)||(LA90_1 >= 32 && LA90_1 <= 34)||(LA90_1 >= 36 && LA90_1 <= 37)||(LA90_1 >= 40 && LA90_1 <= 41)||LA90_1==43||LA90_1==45||LA90_1==49||(LA90_1 >= 51 && LA90_1 <= 53)||LA90_1==55||LA90_1==57||LA90_1==81||LA90_1==109||LA90_1==111) ) {
							alt90=2;
						}
					}
					else if ( ((LA90_0 >= CharacterLiteral && LA90_0 <= DecimalLiteral)||LA90_0==FloatingPointLiteral||LA90_0==HexLiteral||(LA90_0 >= OctalLiteral && LA90_0 <= StringLiteral)||LA90_0==25||LA90_0==32||(LA90_0 >= 36 && LA90_0 <= 37)||(LA90_0 >= 40 && LA90_0 <= 41)||LA90_0==54||LA90_0==60||LA90_0==62||LA90_0==65||LA90_0==70||LA90_0==73||LA90_0==76||LA90_0==82||LA90_0==84||(LA90_0 >= 86 && LA90_0 <= 87)||LA90_0==93||LA90_0==96||LA90_0==99||LA90_0==103||LA90_0==105||LA90_0==108||LA90_0==113) ) {
						alt90=2;
					}
					switch (alt90) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:554:36: elementValuePairs
							{
							pushFollow(FOLLOW_elementValuePairs_in_annotation2888);
							elementValuePairs();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:554:56: elementValue
							{
							pushFollow(FOLLOW_elementValue_in_annotation2892);
							elementValue();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,33,FOLLOW_33_in_annotation2897); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, annotation_StartIndex); }

		}
	}
	// $ANTLR end "annotation"



	// $ANTLR start "annotationName"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:557:1: annotationName : Identifier ( '.' Identifier )* ;
	public final void annotationName() throws RecognitionException {
		int annotationName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:558:5: ( Identifier ( '.' Identifier )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:558:7: Identifier ( '.' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_annotationName2921); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:558:18: ( '.' Identifier )*
			loop92:
			while (true) {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==43) ) {
					alt92=1;
				}

				switch (alt92) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:558:19: '.' Identifier
					{
					match(input,43,FOLLOW_43_in_annotationName2924); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_annotationName2926); if (state.failed) return;
					}
					break;

				default :
					break loop92;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, annotationName_StartIndex); }

		}
	}
	// $ANTLR end "annotationName"



	// $ANTLR start "elementValuePairs"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:561:1: elementValuePairs : elementValuePair ( ',' elementValuePair )* ;
	public final void elementValuePairs() throws RecognitionException {
		int elementValuePairs_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:562:5: ( elementValuePair ( ',' elementValuePair )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:562:9: elementValuePair ( ',' elementValuePair )*
			{
			pushFollow(FOLLOW_elementValuePair_in_elementValuePairs2947);
			elementValuePair();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:562:26: ( ',' elementValuePair )*
			loop93:
			while (true) {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==39) ) {
					alt93=1;
				}

				switch (alt93) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:562:27: ',' elementValuePair
					{
					match(input,39,FOLLOW_39_in_elementValuePairs2950); if (state.failed) return;
					pushFollow(FOLLOW_elementValuePair_in_elementValuePairs2952);
					elementValuePair();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop93;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, elementValuePairs_StartIndex); }

		}
	}
	// $ANTLR end "elementValuePairs"



	// $ANTLR start "elementValuePair"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:565:1: elementValuePair : Identifier '=' elementValue ;
	public final void elementValuePair() throws RecognitionException {
		int elementValuePair_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:566:5: ( Identifier '=' elementValue )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:566:8: Identifier '=' elementValue
			{
			if ( state.backtracking==0 ) {isClassObject= false;}
			match(input,Identifier,FOLLOW_Identifier_in_elementValuePair2974); if (state.failed) return;
			match(input,50,FOLLOW_50_in_elementValuePair2976); if (state.failed) return;
			pushFollow(FOLLOW_elementValue_in_elementValuePair2978);
			elementValue();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, elementValuePair_StartIndex); }

		}
	}
	// $ANTLR end "elementValuePair"



	// $ANTLR start "elementValue"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:569:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );
	public final void elementValue() throws RecognitionException {
		int elementValue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:570:5: ( conditionalExpression | annotation | elementValueArrayInitializer )
			int alt94=3;
			switch ( input.LA(1) ) {
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case Identifier:
			case OctalLiteral:
			case StringLiteral:
			case 25:
			case 32:
			case 36:
			case 37:
			case 40:
			case 41:
			case 60:
			case 62:
			case 65:
			case 70:
			case 73:
			case 76:
			case 82:
			case 84:
			case 86:
			case 87:
			case 93:
			case 96:
			case 99:
			case 103:
			case 105:
			case 113:
				{
				alt94=1;
				}
				break;
			case 54:
				{
				alt94=2;
				}
				break;
			case 108:
				{
				alt94=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}
			switch (alt94) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:570:9: conditionalExpression
					{
					pushFollow(FOLLOW_conditionalExpression_in_elementValue3001);
					conditionalExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:571:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_elementValue3011);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:572:9: elementValueArrayInitializer
					{
					pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue3021);
					elementValueArrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, elementValue_StartIndex); }

		}
	}
	// $ANTLR end "elementValue"



	// $ANTLR start "elementValueArrayInitializer"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:575:1: elementValueArrayInitializer : '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' ;
	public final void elementValueArrayInitializer() throws RecognitionException {
		int elementValueArrayInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:576:5: ( '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:576:9: '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}'
			{
			match(input,108,FOLLOW_108_in_elementValueArrayInitializer3044); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:576:13: ( elementValue ( ',' elementValue )* )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( ((LA96_0 >= CharacterLiteral && LA96_0 <= DecimalLiteral)||LA96_0==FloatingPointLiteral||(LA96_0 >= HexLiteral && LA96_0 <= Identifier)||(LA96_0 >= OctalLiteral && LA96_0 <= StringLiteral)||LA96_0==25||LA96_0==32||(LA96_0 >= 36 && LA96_0 <= 37)||(LA96_0 >= 40 && LA96_0 <= 41)||LA96_0==54||LA96_0==60||LA96_0==62||LA96_0==65||LA96_0==70||LA96_0==73||LA96_0==76||LA96_0==82||LA96_0==84||(LA96_0 >= 86 && LA96_0 <= 87)||LA96_0==93||LA96_0==96||LA96_0==99||LA96_0==103||LA96_0==105||LA96_0==108||LA96_0==113) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:576:14: elementValue ( ',' elementValue )*
					{
					pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer3047);
					elementValue();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:576:27: ( ',' elementValue )*
					loop95:
					while (true) {
						int alt95=2;
						int LA95_0 = input.LA(1);
						if ( (LA95_0==39) ) {
							int LA95_1 = input.LA(2);
							if ( ((LA95_1 >= CharacterLiteral && LA95_1 <= DecimalLiteral)||LA95_1==FloatingPointLiteral||(LA95_1 >= HexLiteral && LA95_1 <= Identifier)||(LA95_1 >= OctalLiteral && LA95_1 <= StringLiteral)||LA95_1==25||LA95_1==32||(LA95_1 >= 36 && LA95_1 <= 37)||(LA95_1 >= 40 && LA95_1 <= 41)||LA95_1==54||LA95_1==60||LA95_1==62||LA95_1==65||LA95_1==70||LA95_1==73||LA95_1==76||LA95_1==82||LA95_1==84||(LA95_1 >= 86 && LA95_1 <= 87)||LA95_1==93||LA95_1==96||LA95_1==99||LA95_1==103||LA95_1==105||LA95_1==108||LA95_1==113) ) {
								alt95=1;
							}

						}

						switch (alt95) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:576:28: ',' elementValue
							{
							match(input,39,FOLLOW_39_in_elementValueArrayInitializer3050); if (state.failed) return;
							pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer3052);
							elementValue();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop95;
						}
					}

					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:576:49: ( ',' )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==39) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:576:50: ','
					{
					match(input,39,FOLLOW_39_in_elementValueArrayInitializer3059); if (state.failed) return;
					}
					break;

			}

			match(input,112,FOLLOW_112_in_elementValueArrayInitializer3063); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, elementValueArrayInitializer_StartIndex); }

		}
	}
	// $ANTLR end "elementValueArrayInitializer"



	// $ANTLR start "annotationTypeDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:579:1: annotationTypeDeclaration : '@' 'interface' Identifier annotationTypeBody ;
	public final void annotationTypeDeclaration() throws RecognitionException {
		int annotationTypeDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:580:5: ( '@' 'interface' Identifier annotationTypeBody )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:580:9: '@' 'interface' Identifier annotationTypeBody
			{
			match(input,54,FOLLOW_54_in_annotationTypeDeclaration3086); if (state.failed) return;
			match(input,83,FOLLOW_83_in_annotationTypeDeclaration3088); if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_annotationTypeDeclaration3090); if (state.failed) return;
			pushFollow(FOLLOW_annotationTypeBody_in_annotationTypeDeclaration3092);
			annotationTypeBody();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, annotationTypeDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "annotationTypeDeclaration"



	// $ANTLR start "annotationTypeBody"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:583:1: annotationTypeBody : '{' ( annotationTypeElementDeclaration )* '}' ;
	public final void annotationTypeBody() throws RecognitionException {
		int annotationTypeBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:584:5: ( '{' ( annotationTypeElementDeclaration )* '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:584:9: '{' ( annotationTypeElementDeclaration )* '}'
			{
			match(input,108,FOLLOW_108_in_annotationTypeBody3115); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:584:13: ( annotationTypeElementDeclaration )*
			loop98:
			while (true) {
				int alt98=2;
				int LA98_0 = input.LA(1);
				if ( (LA98_0==ENUM||LA98_0==Identifier||LA98_0==49||LA98_0==54||(LA98_0 >= 59 && LA98_0 <= 60)||LA98_0==62||(LA98_0 >= 65 && LA98_0 <= 66)||LA98_0==70||LA98_0==74||LA98_0==76||(LA98_0 >= 82 && LA98_0 <= 85)||(LA98_0 >= 89 && LA98_0 <= 91)||(LA98_0 >= 93 && LA98_0 <= 95)||LA98_0==98||LA98_0==102||(LA98_0 >= 105 && LA98_0 <= 106)) ) {
					alt98=1;
				}

				switch (alt98) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:584:14: annotationTypeElementDeclaration
					{
					pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody3118);
					annotationTypeElementDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop98;
				}
			}

			match(input,112,FOLLOW_112_in_annotationTypeBody3122); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, annotationTypeBody_StartIndex); }

		}
	}
	// $ANTLR end "annotationTypeBody"



	// $ANTLR start "annotationTypeElementDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:587:1: annotationTypeElementDeclaration : modifiers annotationTypeElementRest ;
	public final void annotationTypeElementDeclaration() throws RecognitionException {
		int annotationTypeElementDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:588:5: ( modifiers annotationTypeElementRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:588:9: modifiers annotationTypeElementRest
			{
			pushFollow(FOLLOW_modifiers_in_annotationTypeElementDeclaration3145);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration3147);
			annotationTypeElementRest();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, annotationTypeElementDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "annotationTypeElementDeclaration"



	// $ANTLR start "annotationTypeElementRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:591:1: annotationTypeElementRest : ( type annotationMethodOrConstantRest ';' | normalClassDeclaration ( ';' )? | normalInterfaceDeclaration ( ';' )? | enumDeclaration ( ';' )? | annotationTypeDeclaration ( ';' )? );
	public final void annotationTypeElementRest() throws RecognitionException {
		int annotationTypeElementRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:592:5: ( type annotationMethodOrConstantRest ';' | normalClassDeclaration ( ';' )? | normalInterfaceDeclaration ( ';' )? | enumDeclaration ( ';' )? | annotationTypeDeclaration ( ';' )? )
			int alt103=5;
			switch ( input.LA(1) ) {
			case Identifier:
			case 60:
			case 62:
			case 65:
			case 70:
			case 76:
			case 82:
			case 84:
			case 93:
				{
				alt103=1;
				}
				break;
			case 66:
				{
				alt103=2;
				}
				break;
			case 83:
				{
				alt103=3;
				}
				break;
			case ENUM:
				{
				alt103=4;
				}
				break;
			case 54:
				{
				alt103=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}
			switch (alt103) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:592:9: type annotationMethodOrConstantRest ';'
					{
					pushFollow(FOLLOW_type_in_annotationTypeElementRest3170);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest3172);
					annotationMethodOrConstantRest();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_annotationTypeElementRest3174); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:593:9: normalClassDeclaration ( ';' )?
					{
					pushFollow(FOLLOW_normalClassDeclaration_in_annotationTypeElementRest3184);
					normalClassDeclaration();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:593:32: ( ';' )?
					int alt99=2;
					int LA99_0 = input.LA(1);
					if ( (LA99_0==48) ) {
						alt99=1;
					}
					switch (alt99) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:593:32: ';'
							{
							match(input,48,FOLLOW_48_in_annotationTypeElementRest3186); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:594:9: normalInterfaceDeclaration ( ';' )?
					{
					pushFollow(FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest3197);
					normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:594:36: ( ';' )?
					int alt100=2;
					int LA100_0 = input.LA(1);
					if ( (LA100_0==48) ) {
						alt100=1;
					}
					switch (alt100) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:594:36: ';'
							{
							match(input,48,FOLLOW_48_in_annotationTypeElementRest3199); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:595:9: enumDeclaration ( ';' )?
					{
					pushFollow(FOLLOW_enumDeclaration_in_annotationTypeElementRest3210);
					enumDeclaration();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:595:25: ( ';' )?
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==48) ) {
						alt101=1;
					}
					switch (alt101) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:595:25: ';'
							{
							match(input,48,FOLLOW_48_in_annotationTypeElementRest3212); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:596:9: annotationTypeDeclaration ( ';' )?
					{
					pushFollow(FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest3223);
					annotationTypeDeclaration();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:596:35: ( ';' )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==48) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:596:35: ';'
							{
							match(input,48,FOLLOW_48_in_annotationTypeElementRest3225); if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, annotationTypeElementRest_StartIndex); }

		}
	}
	// $ANTLR end "annotationTypeElementRest"



	// $ANTLR start "annotationMethodOrConstantRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:599:1: annotationMethodOrConstantRest : ( annotationMethodRest | annotationConstantRest );
	public final void annotationMethodOrConstantRest() throws RecognitionException {
		int annotationMethodOrConstantRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:600:5: ( annotationMethodRest | annotationConstantRest )
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==Identifier) ) {
				int LA104_1 = input.LA(2);
				if ( (LA104_1==32) ) {
					alt104=1;
				}
				else if ( (LA104_1==39||LA104_1==48||LA104_1==50||LA104_1==55) ) {
					alt104=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 104, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 104, 0, input);
				throw nvae;
			}

			switch (alt104) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:600:9: annotationMethodRest
					{
					pushFollow(FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest3249);
					annotationMethodRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:601:9: annotationConstantRest
					{
					pushFollow(FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest3259);
					annotationConstantRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, annotationMethodOrConstantRest_StartIndex); }

		}
	}
	// $ANTLR end "annotationMethodOrConstantRest"



	// $ANTLR start "annotationMethodRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:604:1: annotationMethodRest : Identifier '(' ')' ( defaultValue )? ;
	public final void annotationMethodRest() throws RecognitionException {
		int annotationMethodRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:605:5: ( Identifier '(' ')' ( defaultValue )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:605:9: Identifier '(' ')' ( defaultValue )?
			{
			match(input,Identifier,FOLLOW_Identifier_in_annotationMethodRest3282); if (state.failed) return;
			match(input,32,FOLLOW_32_in_annotationMethodRest3284); if (state.failed) return;
			match(input,33,FOLLOW_33_in_annotationMethodRest3286); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:605:28: ( defaultValue )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==68) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:605:28: defaultValue
					{
					pushFollow(FOLLOW_defaultValue_in_annotationMethodRest3288);
					defaultValue();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, annotationMethodRest_StartIndex); }

		}
	}
	// $ANTLR end "annotationMethodRest"



	// $ANTLR start "annotationConstantRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:608:1: annotationConstantRest : variableDeclarators ;
	public final void annotationConstantRest() throws RecognitionException {
		int annotationConstantRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:609:5: ( variableDeclarators )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:609:9: variableDeclarators
			{
			pushFollow(FOLLOW_variableDeclarators_in_annotationConstantRest3312);
			variableDeclarators();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, annotationConstantRest_StartIndex); }

		}
	}
	// $ANTLR end "annotationConstantRest"



	// $ANTLR start "defaultValue"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:612:1: defaultValue : 'default' elementValue ;
	public final void defaultValue() throws RecognitionException {
		int defaultValue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:613:5: ( 'default' elementValue )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:613:9: 'default' elementValue
			{
			match(input,68,FOLLOW_68_in_defaultValue3335); if (state.failed) return;
			pushFollow(FOLLOW_elementValue_in_defaultValue3337);
			elementValue();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, defaultValue_StartIndex); }

		}
	}
	// $ANTLR end "defaultValue"



	// $ANTLR start "block"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:618:1: block : '{' ( blockStatement )* '}' ;
	public final void block() throws RecognitionException {
		int block_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:619:5: ( '{' ( blockStatement )* '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:619:9: '{' ( blockStatement )* '}'
			{
			match(input,108,FOLLOW_108_in_block3358); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:619:13: ( blockStatement )*
			loop106:
			while (true) {
				int alt106=2;
				int LA106_0 = input.LA(1);
				if ( (LA106_0==ASSERT||(LA106_0 >= CharacterLiteral && LA106_0 <= ENUM)||LA106_0==FloatingPointLiteral||(LA106_0 >= HexLiteral && LA106_0 <= Identifier)||(LA106_0 >= OctalLiteral && LA106_0 <= StringLiteral)||LA106_0==25||LA106_0==32||(LA106_0 >= 36 && LA106_0 <= 37)||(LA106_0 >= 40 && LA106_0 <= 41)||LA106_0==48||LA106_0==54||(LA106_0 >= 59 && LA106_0 <= 62)||(LA106_0 >= 65 && LA106_0 <= 67)||(LA106_0 >= 69 && LA106_0 <= 70)||(LA106_0 >= 73 && LA106_0 <= 74)||(LA106_0 >= 76 && LA106_0 <= 78)||(LA106_0 >= 82 && LA106_0 <= 84)||(LA106_0 >= 86 && LA106_0 <= 87)||(LA106_0 >= 89 && LA106_0 <= 100)||(LA106_0 >= 103 && LA106_0 <= 105)||(LA106_0 >= 107 && LA106_0 <= 108)||LA106_0==113) ) {
					alt106=1;
				}

				switch (alt106) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:619:13: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_block3360);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop106;
				}
			}

			match(input,112,FOLLOW_112_in_block3363); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, block_StartIndex); }

		}
	}
	// $ANTLR end "block"



	// $ANTLR start "blockStatement"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:622:1: blockStatement : ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement );
	public final void blockStatement() throws RecognitionException {
		int blockStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:623:5: ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement )
			int alt107=3;
			switch ( input.LA(1) ) {
			case 74:
				{
				int LA107_1 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt107=1;
				}
				else if ( (synpred152_BasForCCal()) ) {
					alt107=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 107, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA107_2 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=3;
				}

				}
				break;
			case 60:
				{
				int LA107_3 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=3;
				}

				}
				break;
			case 65:
				{
				int LA107_4 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=3;
				}

				}
				break;
			case 62:
				{
				int LA107_5 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=3;
				}

				}
				break;
			case 93:
				{
				int LA107_6 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=3;
				}

				}
				break;
			case 82:
				{
				int LA107_7 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=3;
				}

				}
				break;
			case 84:
				{
				int LA107_8 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=3;
				}

				}
				break;
			case 76:
				{
				int LA107_9 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=3;
				}

				}
				break;
			case 70:
				{
				int LA107_10 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt107=1;
				}
				else if ( (true) ) {
					alt107=3;
				}

				}
				break;
			case ENUM:
			case 54:
			case 59:
			case 66:
			case 83:
			case 89:
			case 90:
			case 91:
			case 94:
			case 95:
				{
				alt107=2;
				}
				break;
			case ASSERT:
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case OctalLiteral:
			case StringLiteral:
			case 25:
			case 32:
			case 36:
			case 37:
			case 40:
			case 41:
			case 48:
			case 61:
			case 67:
			case 69:
			case 73:
			case 77:
			case 78:
			case 86:
			case 87:
			case 92:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
			case 103:
			case 104:
			case 105:
			case 107:
			case 108:
			case 113:
				{
				alt107=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:623:8: localVariableDeclarationStatement
					{
					pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement3385);
					localVariableDeclarationStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:624:9: classOrInterfaceDeclaration
					{
					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement3395);
					classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:625:9: statement
					{
					pushFollow(FOLLOW_statement_in_blockStatement3405);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, blockStatement_StartIndex); }

		}
	}
	// $ANTLR end "blockStatement"



	// $ANTLR start "localVariableDeclarationStatement"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:629:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
	public final void localVariableDeclarationStatement() throws RecognitionException {
		int localVariableDeclarationStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:630:5: ( localVariableDeclaration ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:630:9: localVariableDeclaration ';'
			{
			pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement3434);
			localVariableDeclaration();
			state._fsp--;
			if (state.failed) return;
			match(input,48,FOLLOW_48_in_localVariableDeclarationStatement3436); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, localVariableDeclarationStatement_StartIndex); }

		}
	}
	// $ANTLR end "localVariableDeclarationStatement"



	// $ANTLR start "localVariableDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:633:1: localVariableDeclaration : variableModifiers type variableDeclarators ;
	public final void localVariableDeclaration() throws RecognitionException {
		int localVariableDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:634:5: ( variableModifiers type variableDeclarators )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:634:9: variableModifiers type variableDeclarators
			{
			pushFollow(FOLLOW_variableModifiers_in_localVariableDeclaration3455);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_localVariableDeclaration3457);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_variableDeclarators_in_localVariableDeclaration3459);
			variableDeclarators();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, localVariableDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "localVariableDeclaration"



	// $ANTLR start "variableModifiers"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:637:1: variableModifiers : ( variableModifier )* ;
	public final void variableModifiers() throws RecognitionException {
		int variableModifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:638:5: ( ( variableModifier )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:638:9: ( variableModifier )*
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:638:9: ( variableModifier )*
			loop108:
			while (true) {
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==Identifier) ) {
					int LA108_1 = input.LA(2);
					if ( (LA108_1==54) ) {
						alt108=1;
					}

				}
				else if ( (LA108_0==74) ) {
					alt108=1;
				}

				switch (alt108) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:638:9: variableModifier
					{
					pushFollow(FOLLOW_variableModifier_in_variableModifiers3482);
					variableModifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop108;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, variableModifiers_StartIndex); }

		}
	}
	// $ANTLR end "variableModifiers"



	// $ANTLR start "statement"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:641:1: statement : ( block | ASSERT expression ( ':' expression )? ';' | 'if' parExpression statement ( options {k=1; } : 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement );
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:642:5: ( block | ASSERT expression ( ':' expression )? ';' | 'if' parExpression statement ( options {k=1; } : 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement )
			int alt115=16;
			switch ( input.LA(1) ) {
			case 108:
				{
				alt115=1;
				}
				break;
			case ASSERT:
				{
				alt115=2;
				}
				break;
			case 78:
				{
				alt115=3;
				}
				break;
			case 77:
				{
				alt115=4;
				}
				break;
			case 107:
				{
				alt115=5;
				}
				break;
			case 69:
				{
				alt115=6;
				}
				break;
			case 104:
				{
				alt115=7;
				}
				break;
			case 97:
				{
				alt115=8;
				}
				break;
			case 98:
				{
				alt115=9;
				}
				break;
			case 92:
				{
				alt115=10;
				}
				break;
			case 100:
				{
				alt115=11;
				}
				break;
			case 61:
				{
				alt115=12;
				}
				break;
			case 67:
				{
				alt115=13;
				}
				break;
			case 48:
				{
				alt115=14;
				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case OctalLiteral:
			case StringLiteral:
			case 25:
			case 32:
			case 36:
			case 37:
			case 40:
			case 41:
			case 60:
			case 62:
			case 65:
			case 70:
			case 73:
			case 76:
			case 82:
			case 84:
			case 86:
			case 87:
			case 93:
			case 96:
			case 99:
			case 103:
			case 105:
			case 113:
				{
				alt115=15;
				}
				break;
			case Identifier:
				{
				int LA115_16 = input.LA(2);
				if ( (LA115_16==47) ) {
					alt115=16;
				}
				else if ( ((LA115_16 >= 26 && LA115_16 <= 32)||(LA115_16 >= 34 && LA115_16 <= 38)||(LA115_16 >= 40 && LA115_16 <= 43)||(LA115_16 >= 45 && LA115_16 <= 46)||(LA115_16 >= 48 && LA115_16 <= 53)||LA115_16==55||(LA115_16 >= 57 && LA115_16 <= 58)||LA115_16==81||(LA115_16 >= 109 && LA115_16 <= 111)) ) {
					alt115=15;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 115, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 115, 0, input);
				throw nvae;
			}
			switch (alt115) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:642:7: block
					{
					pushFollow(FOLLOW_block_in_statement3500);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:643:9: ASSERT expression ( ':' expression )? ';'
					{
					match(input,ASSERT,FOLLOW_ASSERT_in_statement3510); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_statement3512);
					expression();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:643:27: ( ':' expression )?
					int alt109=2;
					int LA109_0 = input.LA(1);
					if ( (LA109_0==47) ) {
						alt109=1;
					}
					switch (alt109) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:643:28: ':' expression
							{
							match(input,47,FOLLOW_47_in_statement3515); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_statement3517);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_statement3521); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:644:9: 'if' parExpression statement ( options {k=1; } : 'else' statement )?
					{
					match(input,78,FOLLOW_78_in_statement3531); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement3533);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement3535);
					statement();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:644:38: ( options {k=1; } : 'else' statement )?
					int alt110=2;
					int LA110_0 = input.LA(1);
					if ( (LA110_0==71) ) {
						int LA110_1 = input.LA(2);
						if ( (synpred157_BasForCCal()) ) {
							alt110=1;
						}
					}
					switch (alt110) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:644:54: 'else' statement
							{
							match(input,71,FOLLOW_71_in_statement3545); if (state.failed) return;
							pushFollow(FOLLOW_statement_in_statement3547);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:645:9: 'for' '(' forControl ')' statement
					{
					match(input,77,FOLLOW_77_in_statement3559); if (state.failed) return;
					match(input,32,FOLLOW_32_in_statement3561); if (state.failed) return;
					pushFollow(FOLLOW_forControl_in_statement3563);
					forControl();
					state._fsp--;
					if (state.failed) return;
					match(input,33,FOLLOW_33_in_statement3565); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement3567);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:646:9: 'while' parExpression statement
					{
					match(input,107,FOLLOW_107_in_statement3577); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement3579);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement3581);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:647:9: 'do' statement 'while' parExpression ';'
					{
					match(input,69,FOLLOW_69_in_statement3591); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement3593);
					statement();
					state._fsp--;
					if (state.failed) return;
					match(input,107,FOLLOW_107_in_statement3595); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement3597);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_statement3599); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:648:9: 'try' block ( catches 'finally' block | catches | 'finally' block )
					{
					match(input,104,FOLLOW_104_in_statement3609); if (state.failed) return;
					pushFollow(FOLLOW_block_in_statement3611);
					block();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:649:9: ( catches 'finally' block | catches | 'finally' block )
					int alt111=3;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==64) ) {
						int LA111_1 = input.LA(2);
						if ( (synpred162_BasForCCal()) ) {
							alt111=1;
						}
						else if ( (synpred163_BasForCCal()) ) {
							alt111=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 111, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA111_0==75) ) {
						alt111=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 111, 0, input);
						throw nvae;
					}

					switch (alt111) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:649:11: catches 'finally' block
							{
							pushFollow(FOLLOW_catches_in_statement3623);
							catches();
							state._fsp--;
							if (state.failed) return;
							match(input,75,FOLLOW_75_in_statement3625); if (state.failed) return;
							pushFollow(FOLLOW_block_in_statement3627);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:650:11: catches
							{
							pushFollow(FOLLOW_catches_in_statement3639);
							catches();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 3 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:651:13: 'finally' block
							{
							match(input,75,FOLLOW_75_in_statement3653); if (state.failed) return;
							pushFollow(FOLLOW_block_in_statement3655);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:653:9: 'switch' parExpression '{' switchBlockStatementGroups '}'
					{
					match(input,97,FOLLOW_97_in_statement3675); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement3677);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,108,FOLLOW_108_in_statement3679); if (state.failed) return;
					pushFollow(FOLLOW_switchBlockStatementGroups_in_statement3681);
					switchBlockStatementGroups();
					state._fsp--;
					if (state.failed) return;
					match(input,112,FOLLOW_112_in_statement3683); if (state.failed) return;
					}
					break;
				case 9 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:654:9: 'synchronized' parExpression block
					{
					match(input,98,FOLLOW_98_in_statement3693); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement3695);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_block_in_statement3697);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:655:9: 'return' ( expression )? ';'
					{
					match(input,92,FOLLOW_92_in_statement3707); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:655:18: ( expression )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( ((LA112_0 >= CharacterLiteral && LA112_0 <= DecimalLiteral)||LA112_0==FloatingPointLiteral||(LA112_0 >= HexLiteral && LA112_0 <= Identifier)||(LA112_0 >= OctalLiteral && LA112_0 <= StringLiteral)||LA112_0==25||LA112_0==32||(LA112_0 >= 36 && LA112_0 <= 37)||(LA112_0 >= 40 && LA112_0 <= 41)||LA112_0==60||LA112_0==62||LA112_0==65||LA112_0==70||LA112_0==73||LA112_0==76||LA112_0==82||LA112_0==84||(LA112_0 >= 86 && LA112_0 <= 87)||LA112_0==93||LA112_0==96||LA112_0==99||LA112_0==103||LA112_0==105||LA112_0==113) ) {
						alt112=1;
					}
					switch (alt112) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:655:18: expression
							{
							pushFollow(FOLLOW_expression_in_statement3709);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_statement3712); if (state.failed) return;
					}
					break;
				case 11 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:656:9: 'throw' expression ';'
					{
					match(input,100,FOLLOW_100_in_statement3722); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_statement3724);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_statement3726); if (state.failed) return;
					}
					break;
				case 12 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:657:9: 'break' ( Identifier )? ';'
					{
					match(input,61,FOLLOW_61_in_statement3736); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:657:17: ( Identifier )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==Identifier) ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:657:17: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_statement3738); if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_statement3741); if (state.failed) return;
					}
					break;
				case 13 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:658:9: 'continue' ( Identifier )? ';'
					{
					match(input,67,FOLLOW_67_in_statement3751); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:658:20: ( Identifier )?
					int alt114=2;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==Identifier) ) {
						alt114=1;
					}
					switch (alt114) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:658:20: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_statement3753); if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_statement3756); if (state.failed) return;
					}
					break;
				case 14 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:659:9: ';'
					{
					match(input,48,FOLLOW_48_in_statement3766); if (state.failed) return;
					}
					break;
				case 15 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:660:9: statementExpression ';'
					{
					pushFollow(FOLLOW_statementExpression_in_statement3777);
					statementExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_statement3779); if (state.failed) return;
					}
					break;
				case 16 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:661:9: Identifier ':' statement
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement3789); if (state.failed) return;
					match(input,47,FOLLOW_47_in_statement3791); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement3793);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, statement_StartIndex); }

		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "catches"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:664:1: catches : catchClause ( catchClause )* ;
	public final void catches() throws RecognitionException {
		int catches_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:665:5: ( catchClause ( catchClause )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:665:9: catchClause ( catchClause )*
			{
			pushFollow(FOLLOW_catchClause_in_catches3816);
			catchClause();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:665:21: ( catchClause )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==64) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:665:22: catchClause
					{
					pushFollow(FOLLOW_catchClause_in_catches3819);
					catchClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop116;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, catches_StartIndex); }

		}
	}
	// $ANTLR end "catches"



	// $ANTLR start "catchClause"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:668:1: catchClause : 'catch' '(' formalParameter ')' block ;
	public final void catchClause() throws RecognitionException {
		int catchClause_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:669:5: ( 'catch' '(' formalParameter ')' block )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:669:9: 'catch' '(' formalParameter ')' block
			{
			match(input,64,FOLLOW_64_in_catchClause3844); if (state.failed) return;
			match(input,32,FOLLOW_32_in_catchClause3846); if (state.failed) return;
			pushFollow(FOLLOW_formalParameter_in_catchClause3848);
			formalParameter();
			state._fsp--;
			if (state.failed) return;
			match(input,33,FOLLOW_33_in_catchClause3850); if (state.failed) return;
			pushFollow(FOLLOW_block_in_catchClause3852);
			block();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 92, catchClause_StartIndex); }

		}
	}
	// $ANTLR end "catchClause"



	// $ANTLR start "formalParameter"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:672:1: formalParameter : variableModifiers type variableDeclaratorId ;
	public final void formalParameter() throws RecognitionException {
		int formalParameter_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:673:5: ( variableModifiers type variableDeclaratorId )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:673:9: variableModifiers type variableDeclaratorId
			{
			pushFollow(FOLLOW_variableModifiers_in_formalParameter3871);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_formalParameter3873);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_variableDeclaratorId_in_formalParameter3875);
			variableDeclaratorId();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 93, formalParameter_StartIndex); }

		}
	}
	// $ANTLR end "formalParameter"



	// $ANTLR start "switchBlockStatementGroups"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:676:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
	public final void switchBlockStatementGroups() throws RecognitionException {
		int switchBlockStatementGroups_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:677:5: ( ( switchBlockStatementGroup )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:677:9: ( switchBlockStatementGroup )*
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:677:9: ( switchBlockStatementGroup )*
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==63||LA117_0==68) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:677:10: switchBlockStatementGroup
					{
					pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups3903);
					switchBlockStatementGroup();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop117;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 94, switchBlockStatementGroups_StartIndex); }

		}
	}
	// $ANTLR end "switchBlockStatementGroups"



	// $ANTLR start "switchBlockStatementGroup"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:684:1: switchBlockStatementGroup : ( switchLabel )+ ( blockStatement )* ;
	public final void switchBlockStatementGroup() throws RecognitionException {
		int switchBlockStatementGroup_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:5: ( ( switchLabel )+ ( blockStatement )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:9: ( switchLabel )+ ( blockStatement )*
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:9: ( switchLabel )+
			int cnt118=0;
			loop118:
			while (true) {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==63) ) {
					int LA118_2 = input.LA(2);
					if ( (synpred178_BasForCCal()) ) {
						alt118=1;
					}

				}
				else if ( (LA118_0==68) ) {
					int LA118_3 = input.LA(2);
					if ( (synpred178_BasForCCal()) ) {
						alt118=1;
					}

				}

				switch (alt118) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:9: switchLabel
					{
					pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup3930);
					switchLabel();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt118 >= 1 ) break loop118;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(118, input);
					throw eee;
				}
				cnt118++;
			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:22: ( blockStatement )*
			loop119:
			while (true) {
				int alt119=2;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==ASSERT||(LA119_0 >= CharacterLiteral && LA119_0 <= ENUM)||LA119_0==FloatingPointLiteral||(LA119_0 >= HexLiteral && LA119_0 <= Identifier)||(LA119_0 >= OctalLiteral && LA119_0 <= StringLiteral)||LA119_0==25||LA119_0==32||(LA119_0 >= 36 && LA119_0 <= 37)||(LA119_0 >= 40 && LA119_0 <= 41)||LA119_0==48||LA119_0==54||(LA119_0 >= 59 && LA119_0 <= 62)||(LA119_0 >= 65 && LA119_0 <= 67)||(LA119_0 >= 69 && LA119_0 <= 70)||(LA119_0 >= 73 && LA119_0 <= 74)||(LA119_0 >= 76 && LA119_0 <= 78)||(LA119_0 >= 82 && LA119_0 <= 84)||(LA119_0 >= 86 && LA119_0 <= 87)||(LA119_0 >= 89 && LA119_0 <= 100)||(LA119_0 >= 103 && LA119_0 <= 105)||(LA119_0 >= 107 && LA119_0 <= 108)||LA119_0==113) ) {
					alt119=1;
				}

				switch (alt119) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:22: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup3933);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop119;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 95, switchBlockStatementGroup_StartIndex); }

		}
	}
	// $ANTLR end "switchBlockStatementGroup"



	// $ANTLR start "switchLabel"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:688:1: switchLabel : ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' );
	public final void switchLabel() throws RecognitionException {
		int switchLabel_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:689:5: ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' )
			int alt120=3;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==63) ) {
				int LA120_1 = input.LA(2);
				if ( ((LA120_1 >= CharacterLiteral && LA120_1 <= DecimalLiteral)||LA120_1==FloatingPointLiteral||LA120_1==HexLiteral||(LA120_1 >= OctalLiteral && LA120_1 <= StringLiteral)||LA120_1==25||LA120_1==32||(LA120_1 >= 36 && LA120_1 <= 37)||(LA120_1 >= 40 && LA120_1 <= 41)||LA120_1==60||LA120_1==62||LA120_1==65||LA120_1==70||LA120_1==73||LA120_1==76||LA120_1==82||LA120_1==84||(LA120_1 >= 86 && LA120_1 <= 87)||LA120_1==93||LA120_1==96||LA120_1==99||LA120_1==103||LA120_1==105||LA120_1==113) ) {
					alt120=1;
				}
				else if ( (LA120_1==Identifier) ) {
					int LA120_4 = input.LA(3);
					if ( ((LA120_4 >= 26 && LA120_4 <= 32)||(LA120_4 >= 34 && LA120_4 <= 38)||(LA120_4 >= 40 && LA120_4 <= 43)||(LA120_4 >= 45 && LA120_4 <= 46)||(LA120_4 >= 49 && LA120_4 <= 53)||LA120_4==55||(LA120_4 >= 57 && LA120_4 <= 58)||LA120_4==81||(LA120_4 >= 109 && LA120_4 <= 111)) ) {
						alt120=1;
					}
					else if ( (LA120_4==47) ) {
						int LA120_5 = input.LA(4);
						if ( (synpred180_BasForCCal()) ) {
							alt120=1;
						}
						else if ( (synpred181_BasForCCal()) ) {
							alt120=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 120, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 120, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 120, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA120_0==68) ) {
				alt120=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 120, 0, input);
				throw nvae;
			}

			switch (alt120) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:689:9: 'case' constantExpression ':'
					{
					match(input,63,FOLLOW_63_in_switchLabel3957); if (state.failed) return;
					pushFollow(FOLLOW_constantExpression_in_switchLabel3959);
					constantExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,47,FOLLOW_47_in_switchLabel3961); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:690:9: 'case' enumConstantName ':'
					{
					match(input,63,FOLLOW_63_in_switchLabel3971); if (state.failed) return;
					pushFollow(FOLLOW_enumConstantName_in_switchLabel3973);
					enumConstantName();
					state._fsp--;
					if (state.failed) return;
					match(input,47,FOLLOW_47_in_switchLabel3975); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:691:9: 'default' ':'
					{
					match(input,68,FOLLOW_68_in_switchLabel3985); if (state.failed) return;
					match(input,47,FOLLOW_47_in_switchLabel3987); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, switchLabel_StartIndex); }

		}
	}
	// $ANTLR end "switchLabel"



	// $ANTLR start "forControl"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:694:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );
	public final void forControl() throws RecognitionException {
		int forControl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:696:5: ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? )
			int alt124=2;
			alt124 = dfa124.predict(input);
			switch (alt124) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:696:9: enhancedForControl
					{
					pushFollow(FOLLOW_enhancedForControl_in_forControl4018);
					enhancedForControl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:697:9: ( forInit )? ';' ( expression )? ';' ( forUpdate )?
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:697:9: ( forInit )?
					int alt121=2;
					int LA121_0 = input.LA(1);
					if ( ((LA121_0 >= CharacterLiteral && LA121_0 <= DecimalLiteral)||LA121_0==FloatingPointLiteral||(LA121_0 >= HexLiteral && LA121_0 <= Identifier)||(LA121_0 >= OctalLiteral && LA121_0 <= StringLiteral)||LA121_0==25||LA121_0==32||(LA121_0 >= 36 && LA121_0 <= 37)||(LA121_0 >= 40 && LA121_0 <= 41)||LA121_0==60||LA121_0==62||LA121_0==65||LA121_0==70||(LA121_0 >= 73 && LA121_0 <= 74)||LA121_0==76||LA121_0==82||LA121_0==84||(LA121_0 >= 86 && LA121_0 <= 87)||LA121_0==93||LA121_0==96||LA121_0==99||LA121_0==103||LA121_0==105||LA121_0==113) ) {
						alt121=1;
					}
					switch (alt121) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:697:9: forInit
							{
							pushFollow(FOLLOW_forInit_in_forControl4028);
							forInit();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_forControl4031); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:697:22: ( expression )?
					int alt122=2;
					int LA122_0 = input.LA(1);
					if ( ((LA122_0 >= CharacterLiteral && LA122_0 <= DecimalLiteral)||LA122_0==FloatingPointLiteral||(LA122_0 >= HexLiteral && LA122_0 <= Identifier)||(LA122_0 >= OctalLiteral && LA122_0 <= StringLiteral)||LA122_0==25||LA122_0==32||(LA122_0 >= 36 && LA122_0 <= 37)||(LA122_0 >= 40 && LA122_0 <= 41)||LA122_0==60||LA122_0==62||LA122_0==65||LA122_0==70||LA122_0==73||LA122_0==76||LA122_0==82||LA122_0==84||(LA122_0 >= 86 && LA122_0 <= 87)||LA122_0==93||LA122_0==96||LA122_0==99||LA122_0==103||LA122_0==105||LA122_0==113) ) {
						alt122=1;
					}
					switch (alt122) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:697:22: expression
							{
							pushFollow(FOLLOW_expression_in_forControl4033);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_forControl4036); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:697:38: ( forUpdate )?
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( ((LA123_0 >= CharacterLiteral && LA123_0 <= DecimalLiteral)||LA123_0==FloatingPointLiteral||(LA123_0 >= HexLiteral && LA123_0 <= Identifier)||(LA123_0 >= OctalLiteral && LA123_0 <= StringLiteral)||LA123_0==25||LA123_0==32||(LA123_0 >= 36 && LA123_0 <= 37)||(LA123_0 >= 40 && LA123_0 <= 41)||LA123_0==60||LA123_0==62||LA123_0==65||LA123_0==70||LA123_0==73||LA123_0==76||LA123_0==82||LA123_0==84||(LA123_0 >= 86 && LA123_0 <= 87)||LA123_0==93||LA123_0==96||LA123_0==99||LA123_0==103||LA123_0==105||LA123_0==113) ) {
						alt123=1;
					}
					switch (alt123) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:697:38: forUpdate
							{
							pushFollow(FOLLOW_forUpdate_in_forControl4038);
							forUpdate();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, forControl_StartIndex); }

		}
	}
	// $ANTLR end "forControl"



	// $ANTLR start "forInit"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:700:1: forInit : ( localVariableDeclaration | expressionList );
	public final void forInit() throws RecognitionException {
		int forInit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:701:5: ( localVariableDeclaration | expressionList )
			int alt125=2;
			switch ( input.LA(1) ) {
			case 74:
				{
				alt125=1;
				}
				break;
			case Identifier:
				{
				int LA125_2 = input.LA(2);
				if ( (synpred186_BasForCCal()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 60:
				{
				int LA125_3 = input.LA(2);
				if ( (synpred186_BasForCCal()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 65:
				{
				int LA125_4 = input.LA(2);
				if ( (synpred186_BasForCCal()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 62:
				{
				int LA125_5 = input.LA(2);
				if ( (synpred186_BasForCCal()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 93:
				{
				int LA125_6 = input.LA(2);
				if ( (synpred186_BasForCCal()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 82:
				{
				int LA125_7 = input.LA(2);
				if ( (synpred186_BasForCCal()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 84:
				{
				int LA125_8 = input.LA(2);
				if ( (synpred186_BasForCCal()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 76:
				{
				int LA125_9 = input.LA(2);
				if ( (synpred186_BasForCCal()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case 70:
				{
				int LA125_10 = input.LA(2);
				if ( (synpred186_BasForCCal()) ) {
					alt125=1;
				}
				else if ( (true) ) {
					alt125=2;
				}

				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case OctalLiteral:
			case StringLiteral:
			case 25:
			case 32:
			case 36:
			case 37:
			case 40:
			case 41:
			case 73:
			case 86:
			case 87:
			case 96:
			case 99:
			case 103:
			case 105:
			case 113:
				{
				alt125=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:701:9: localVariableDeclaration
					{
					pushFollow(FOLLOW_localVariableDeclaration_in_forInit4058);
					localVariableDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:702:9: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forInit4068);
					expressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 98, forInit_StartIndex); }

		}
	}
	// $ANTLR end "forInit"



	// $ANTLR start "enhancedForControl"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:705:1: enhancedForControl : variableModifiers type Identifier ':' expression ;
	public final void enhancedForControl() throws RecognitionException {
		int enhancedForControl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:706:5: ( variableModifiers type Identifier ':' expression )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:706:9: variableModifiers type Identifier ':' expression
			{
			pushFollow(FOLLOW_variableModifiers_in_enhancedForControl4091);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_enhancedForControl4093);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_enhancedForControl4095); if (state.failed) return;
			match(input,47,FOLLOW_47_in_enhancedForControl4097); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_enhancedForControl4099);
			expression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 99, enhancedForControl_StartIndex); }

		}
	}
	// $ANTLR end "enhancedForControl"



	// $ANTLR start "forUpdate"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:709:1: forUpdate : expressionList ;
	public final void forUpdate() throws RecognitionException {
		int forUpdate_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:710:5: ( expressionList )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:710:9: expressionList
			{
			pushFollow(FOLLOW_expressionList_in_forUpdate4118);
			expressionList();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 100, forUpdate_StartIndex); }

		}
	}
	// $ANTLR end "forUpdate"



	// $ANTLR start "parExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:715:1: parExpression : '(' expression ')' ;
	public final void parExpression() throws RecognitionException {
		int parExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:716:5: ( '(' expression ')' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:716:9: '(' expression ')'
			{
			match(input,32,FOLLOW_32_in_parExpression4139); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_parExpression4141);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,33,FOLLOW_33_in_parExpression4143); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, parExpression_StartIndex); }

		}
	}
	// $ANTLR end "parExpression"



	// $ANTLR start "expressionList"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:719:1: expressionList : expression ( ',' expression )* ;
	public final void expressionList() throws RecognitionException {
		int expressionList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:720:5: ( expression ( ',' expression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:720:9: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList4166);
			expression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:720:20: ( ',' expression )*
			loop126:
			while (true) {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==39) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:720:21: ',' expression
					{
					match(input,39,FOLLOW_39_in_expressionList4169); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_expressionList4171);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop126;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, expressionList_StartIndex); }

		}
	}
	// $ANTLR end "expressionList"



	// $ANTLR start "statementExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:723:1: statementExpression : expression ;
	public final void statementExpression() throws RecognitionException {
		int statementExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:724:5: ( expression )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:724:9: expression
			{
			pushFollow(FOLLOW_expression_in_statementExpression4192);
			expression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, statementExpression_StartIndex); }

		}
	}
	// $ANTLR end "statementExpression"



	// $ANTLR start "constantExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:727:1: constantExpression : expression ;
	public final void constantExpression() throws RecognitionException {
		int constantExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:728:5: ( expression )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:728:9: expression
			{
			pushFollow(FOLLOW_expression_in_constantExpression4215);
			expression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, constantExpression_StartIndex); }

		}
	}
	// $ANTLR end "constantExpression"



	// $ANTLR start "expression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:731:1: expression : conditionalExpression ( assignmentOperator expression )? ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:732:5: ( conditionalExpression ( assignmentOperator expression )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:732:9: conditionalExpression ( assignmentOperator expression )?
			{
			pushFollow(FOLLOW_conditionalExpression_in_expression4238);
			conditionalExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:732:31: ( assignmentOperator expression )?
			int alt127=2;
			switch ( input.LA(1) ) {
				case 50:
					{
					int LA127_1 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt127=1;
					}
					}
					break;
				case 38:
					{
					int LA127_2 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt127=1;
					}
					}
					break;
				case 42:
					{
					int LA127_3 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt127=1;
					}
					}
					break;
				case 35:
					{
					int LA127_4 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt127=1;
					}
					}
					break;
				case 46:
					{
					int LA127_5 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt127=1;
					}
					}
					break;
				case 31:
					{
					int LA127_6 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt127=1;
					}
					}
					break;
				case 110:
					{
					int LA127_7 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt127=1;
					}
					}
					break;
				case 58:
					{
					int LA127_8 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt127=1;
					}
					}
					break;
				case 28:
					{
					int LA127_9 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt127=1;
					}
					}
					break;
				case 49:
					{
					int LA127_10 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt127=1;
					}
					}
					break;
				case 52:
					{
					int LA127_11 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt127=1;
					}
					}
					break;
			}
			switch (alt127) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:732:32: assignmentOperator expression
					{
					pushFollow(FOLLOW_assignmentOperator_in_expression4241);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expression_in_expression4243);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 105, expression_StartIndex); }

		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "assignmentOperator"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:735:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?| ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?| ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?);
	public final void assignmentOperator() throws RecognitionException {
		int assignmentOperator_StartIndex = input.index();

		Token t1=null;
		Token t2=null;
		Token t3=null;
		Token t4=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:736:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?| ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?| ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?)
			int alt128=12;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==50) ) {
				alt128=1;
			}
			else if ( (LA128_0==38) ) {
				alt128=2;
			}
			else if ( (LA128_0==42) ) {
				alt128=3;
			}
			else if ( (LA128_0==35) ) {
				alt128=4;
			}
			else if ( (LA128_0==46) ) {
				alt128=5;
			}
			else if ( (LA128_0==31) ) {
				alt128=6;
			}
			else if ( (LA128_0==110) ) {
				alt128=7;
			}
			else if ( (LA128_0==58) ) {
				alt128=8;
			}
			else if ( (LA128_0==28) ) {
				alt128=9;
			}
			else if ( (LA128_0==49) && (synpred198_BasForCCal())) {
				alt128=10;
			}
			else if ( (LA128_0==52) ) {
				int LA128_11 = input.LA(2);
				if ( (LA128_11==52) ) {
					int LA128_12 = input.LA(3);
					if ( (LA128_12==52) && (synpred199_BasForCCal())) {
						alt128=11;
					}
					else if ( (LA128_12==50) && (synpred200_BasForCCal())) {
						alt128=12;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 128, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}

			switch (alt128) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:736:9: '='
					{
					match(input,50,FOLLOW_50_in_assignmentOperator4268); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:737:9: '+='
					{
					match(input,38,FOLLOW_38_in_assignmentOperator4278); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:738:9: '-='
					{
					match(input,42,FOLLOW_42_in_assignmentOperator4288); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:739:9: '*='
					{
					match(input,35,FOLLOW_35_in_assignmentOperator4298); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:740:9: '/='
					{
					match(input,46,FOLLOW_46_in_assignmentOperator4308); if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:741:9: '&='
					{
					match(input,31,FOLLOW_31_in_assignmentOperator4318); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:742:9: '|='
					{
					match(input,110,FOLLOW_110_in_assignmentOperator4328); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:743:9: '^='
					{
					match(input,58,FOLLOW_58_in_assignmentOperator4338); if (state.failed) return;
					}
					break;
				case 9 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:744:9: '%='
					{
					match(input,28,FOLLOW_28_in_assignmentOperator4348); if (state.failed) return;
					}
					break;
				case 10 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:745:9: ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?
					{
					t1=(Token)match(input,49,FOLLOW_49_in_assignmentOperator4369); if (state.failed) return;
					t2=(Token)match(input,49,FOLLOW_49_in_assignmentOperator4373); if (state.failed) return;
					t3=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4377); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() &&
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() && 
					          t2.getLine() == t3.getLine() && 
					          t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() &&\r\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && \r\n          $t2.getLine() == $t3.getLine() && \r\n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
					}
					}
					break;
				case 11 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:750:9: ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?
					{
					t1=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4411); if (state.failed) return;
					t2=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4415); if (state.failed) return;
					t3=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4419); if (state.failed) return;
					t4=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4423); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() &&
					          t2.getLine() == t3.getLine() && 
					          t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() &&
					          t3.getLine() == t4.getLine() && 
					          t3.getCharPositionInLine() + 1 == t4.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() && \r\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&\r\n          $t2.getLine() == $t3.getLine() && \r\n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() &&\r\n          $t3.getLine() == $t4.getLine() && \r\n          $t3.getCharPositionInLine() + 1 == $t4.getCharPositionInLine() ");
					}
					}
					break;
				case 12 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:757:9: ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?
					{
					t1=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4454); if (state.failed) return;
					t2=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4458); if (state.failed) return;
					t3=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4462); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() && 
					          t2.getLine() == t3.getLine() && 
					          t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() && \r\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && \r\n          $t2.getLine() == $t3.getLine() && \r\n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
					}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 106, assignmentOperator_StartIndex); }

		}
	}
	// $ANTLR end "assignmentOperator"



	// $ANTLR start "conditionalExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:764:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' expression )? ;
	public final void conditionalExpression() throws RecognitionException {
		int conditionalExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:765:5: ( conditionalOrExpression ( '?' expression ':' expression )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:765:9: conditionalOrExpression ( '?' expression ':' expression )?
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression4491);
			conditionalOrExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:765:33: ( '?' expression ':' expression )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==53) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:765:35: '?' expression ':' expression
					{
					match(input,53,FOLLOW_53_in_conditionalExpression4495); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_conditionalExpression4497);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,47,FOLLOW_47_in_conditionalExpression4499); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_conditionalExpression4501);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 107, conditionalExpression_StartIndex); }

		}
	}
	// $ANTLR end "conditionalExpression"



	// $ANTLR start "conditionalOrExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:768:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
	public final void conditionalOrExpression() throws RecognitionException {
		int conditionalOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:769:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:769:9: conditionalAndExpression ( '||' conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression4523);
			conditionalAndExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:769:34: ( '||' conditionalAndExpression )*
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==111) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:769:36: '||' conditionalAndExpression
					{
					match(input,111,FOLLOW_111_in_conditionalOrExpression4527); if (state.failed) return;
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression4529);
					conditionalAndExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop130;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 108, conditionalOrExpression_StartIndex); }

		}
	}
	// $ANTLR end "conditionalOrExpression"



	// $ANTLR start "conditionalAndExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:772:1: conditionalAndExpression : inclusiveOrExpression ( '&&' inclusiveOrExpression )* ;
	public final void conditionalAndExpression() throws RecognitionException {
		int conditionalAndExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:773:5: ( inclusiveOrExpression ( '&&' inclusiveOrExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:773:9: inclusiveOrExpression ( '&&' inclusiveOrExpression )*
			{
			pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4551);
			inclusiveOrExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:773:31: ( '&&' inclusiveOrExpression )*
			loop131:
			while (true) {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==29) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:773:33: '&&' inclusiveOrExpression
					{
					match(input,29,FOLLOW_29_in_conditionalAndExpression4555); if (state.failed) return;
					pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4557);
					inclusiveOrExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop131;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 109, conditionalAndExpression_StartIndex); }

		}
	}
	// $ANTLR end "conditionalAndExpression"



	// $ANTLR start "inclusiveOrExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:776:1: inclusiveOrExpression : exclusiveOrExpression ( '|' exclusiveOrExpression )* ;
	public final void inclusiveOrExpression() throws RecognitionException {
		int inclusiveOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:777:5: ( exclusiveOrExpression ( '|' exclusiveOrExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:777:9: exclusiveOrExpression ( '|' exclusiveOrExpression )*
			{
			pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4579);
			exclusiveOrExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:777:31: ( '|' exclusiveOrExpression )*
			loop132:
			while (true) {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==109) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:777:33: '|' exclusiveOrExpression
					{
					match(input,109,FOLLOW_109_in_inclusiveOrExpression4583); if (state.failed) return;
					pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4585);
					exclusiveOrExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop132;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 110, inclusiveOrExpression_StartIndex); }

		}
	}
	// $ANTLR end "inclusiveOrExpression"



	// $ANTLR start "exclusiveOrExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:780:1: exclusiveOrExpression : andExpression ( '^' andExpression )* ;
	public final void exclusiveOrExpression() throws RecognitionException {
		int exclusiveOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:781:5: ( andExpression ( '^' andExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:781:9: andExpression ( '^' andExpression )*
			{
			pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression4607);
			andExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:781:23: ( '^' andExpression )*
			loop133:
			while (true) {
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==57) ) {
					alt133=1;
				}

				switch (alt133) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:781:25: '^' andExpression
					{
					match(input,57,FOLLOW_57_in_exclusiveOrExpression4611); if (state.failed) return;
					pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression4613);
					andExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop133;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 111, exclusiveOrExpression_StartIndex); }

		}
	}
	// $ANTLR end "exclusiveOrExpression"



	// $ANTLR start "andExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:784:1: andExpression : equalityExpression ( '&' equalityExpression )* ;
	public final void andExpression() throws RecognitionException {
		int andExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:785:5: ( equalityExpression ( '&' equalityExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:785:9: equalityExpression ( '&' equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_andExpression4635);
			equalityExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:785:28: ( '&' equalityExpression )*
			loop134:
			while (true) {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==30) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:785:30: '&' equalityExpression
					{
					match(input,30,FOLLOW_30_in_andExpression4639); if (state.failed) return;
					pushFollow(FOLLOW_equalityExpression_in_andExpression4641);
					equalityExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop134;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 112, andExpression_StartIndex); }

		}
	}
	// $ANTLR end "andExpression"



	// $ANTLR start "equalityExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:788:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
	public final void equalityExpression() throws RecognitionException {
		int equalityExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:789:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:789:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
			{
			pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression4663);
			instanceOfExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:789:30: ( ( '==' | '!=' ) instanceOfExpression )*
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==26||LA135_0==51) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:789:32: ( '==' | '!=' ) instanceOfExpression
					{
					if ( input.LA(1)==26||input.LA(1)==51 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression4675);
					instanceOfExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop135;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 113, equalityExpression_StartIndex); }

		}
	}
	// $ANTLR end "equalityExpression"



	// $ANTLR start "instanceOfExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:792:1: instanceOfExpression : relationalExpression ( 'instanceof' type )? ;
	public final void instanceOfExpression() throws RecognitionException {
		int instanceOfExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:793:5: ( relationalExpression ( 'instanceof' type )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:793:9: relationalExpression ( 'instanceof' type )?
			{
			pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression4697);
			relationalExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:793:30: ( 'instanceof' type )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==81) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:793:31: 'instanceof' type
					{
					match(input,81,FOLLOW_81_in_instanceOfExpression4700); if (state.failed) return;
					pushFollow(FOLLOW_type_in_instanceOfExpression4702);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 114, instanceOfExpression_StartIndex); }

		}
	}
	// $ANTLR end "instanceOfExpression"



	// $ANTLR start "relationalExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:796:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
	public final void relationalExpression() throws RecognitionException {
		int relationalExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:797:5: ( shiftExpression ( relationalOp shiftExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:797:9: shiftExpression ( relationalOp shiftExpression )*
			{
			pushFollow(FOLLOW_shiftExpression_in_relationalExpression4723);
			shiftExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:797:25: ( relationalOp shiftExpression )*
			loop137:
			while (true) {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==49) ) {
					int LA137_2 = input.LA(2);
					if ( ((LA137_2 >= CharacterLiteral && LA137_2 <= DecimalLiteral)||LA137_2==FloatingPointLiteral||(LA137_2 >= HexLiteral && LA137_2 <= Identifier)||(LA137_2 >= OctalLiteral && LA137_2 <= StringLiteral)||LA137_2==25||LA137_2==32||(LA137_2 >= 36 && LA137_2 <= 37)||(LA137_2 >= 40 && LA137_2 <= 41)||LA137_2==50||LA137_2==60||LA137_2==62||LA137_2==65||LA137_2==70||LA137_2==73||LA137_2==76||LA137_2==82||LA137_2==84||(LA137_2 >= 86 && LA137_2 <= 87)||LA137_2==93||LA137_2==96||LA137_2==99||LA137_2==103||LA137_2==105||LA137_2==113) ) {
						alt137=1;
					}

				}
				else if ( (LA137_0==52) ) {
					int LA137_3 = input.LA(2);
					if ( ((LA137_3 >= CharacterLiteral && LA137_3 <= DecimalLiteral)||LA137_3==FloatingPointLiteral||(LA137_3 >= HexLiteral && LA137_3 <= Identifier)||(LA137_3 >= OctalLiteral && LA137_3 <= StringLiteral)||LA137_3==25||LA137_3==32||(LA137_3 >= 36 && LA137_3 <= 37)||(LA137_3 >= 40 && LA137_3 <= 41)||LA137_3==50||LA137_3==60||LA137_3==62||LA137_3==65||LA137_3==70||LA137_3==73||LA137_3==76||LA137_3==82||LA137_3==84||(LA137_3 >= 86 && LA137_3 <= 87)||LA137_3==93||LA137_3==96||LA137_3==99||LA137_3==103||LA137_3==105||LA137_3==113) ) {
						alt137=1;
					}

				}

				switch (alt137) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:797:27: relationalOp shiftExpression
					{
					pushFollow(FOLLOW_relationalOp_in_relationalExpression4727);
					relationalOp();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_shiftExpression_in_relationalExpression4729);
					shiftExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop137;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 115, relationalExpression_StartIndex); }

		}
	}
	// $ANTLR end "relationalExpression"



	// $ANTLR start "relationalOp"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:800:1: relationalOp : ( ( '<' '=' )=>t1= '<' t2= '=' {...}?| ( '>' '=' )=>t1= '>' t2= '=' {...}?| '<' | '>' );
	public final void relationalOp() throws RecognitionException {
		int relationalOp_StartIndex = input.index();

		Token t1=null;
		Token t2=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:801:5: ( ( '<' '=' )=>t1= '<' t2= '=' {...}?| ( '>' '=' )=>t1= '>' t2= '=' {...}?| '<' | '>' )
			int alt138=4;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==49) ) {
				int LA138_1 = input.LA(2);
				if ( (LA138_1==50) && (synpred211_BasForCCal())) {
					alt138=1;
				}
				else if ( ((LA138_1 >= CharacterLiteral && LA138_1 <= DecimalLiteral)||LA138_1==FloatingPointLiteral||(LA138_1 >= HexLiteral && LA138_1 <= Identifier)||(LA138_1 >= OctalLiteral && LA138_1 <= StringLiteral)||LA138_1==25||LA138_1==32||(LA138_1 >= 36 && LA138_1 <= 37)||(LA138_1 >= 40 && LA138_1 <= 41)||LA138_1==60||LA138_1==62||LA138_1==65||LA138_1==70||LA138_1==73||LA138_1==76||LA138_1==82||LA138_1==84||(LA138_1 >= 86 && LA138_1 <= 87)||LA138_1==93||LA138_1==96||LA138_1==99||LA138_1==103||LA138_1==105||LA138_1==113) ) {
					alt138=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA138_0==52) ) {
				int LA138_2 = input.LA(2);
				if ( (LA138_2==50) && (synpred212_BasForCCal())) {
					alt138=2;
				}
				else if ( ((LA138_2 >= CharacterLiteral && LA138_2 <= DecimalLiteral)||LA138_2==FloatingPointLiteral||(LA138_2 >= HexLiteral && LA138_2 <= Identifier)||(LA138_2 >= OctalLiteral && LA138_2 <= StringLiteral)||LA138_2==25||LA138_2==32||(LA138_2 >= 36 && LA138_2 <= 37)||(LA138_2 >= 40 && LA138_2 <= 41)||LA138_2==60||LA138_2==62||LA138_2==65||LA138_2==70||LA138_2==73||LA138_2==76||LA138_2==82||LA138_2==84||(LA138_2 >= 86 && LA138_2 <= 87)||LA138_2==93||LA138_2==96||LA138_2==99||LA138_2==103||LA138_2==105||LA138_2==113) ) {
					alt138=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 138, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 138, 0, input);
				throw nvae;
			}

			switch (alt138) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:801:9: ( '<' '=' )=>t1= '<' t2= '=' {...}?
					{
					t1=(Token)match(input,49,FOLLOW_49_in_relationalOp4764); if (state.failed) return;
					t2=(Token)match(input,50,FOLLOW_50_in_relationalOp4768); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "relationalOp", " $t1.getLine() == $t2.getLine() && \r\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
					}
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:804:9: ( '>' '=' )=>t1= '>' t2= '=' {...}?
					{
					t1=(Token)match(input,52,FOLLOW_52_in_relationalOp4798); if (state.failed) return;
					t2=(Token)match(input,50,FOLLOW_50_in_relationalOp4802); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "relationalOp", " $t1.getLine() == $t2.getLine() && \r\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
					}
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:807:9: '<'
					{
					match(input,49,FOLLOW_49_in_relationalOp4823); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:808:9: '>'
					{
					match(input,52,FOLLOW_52_in_relationalOp4834); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 116, relationalOp_StartIndex); }

		}
	}
	// $ANTLR end "relationalOp"



	// $ANTLR start "shiftExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:811:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
	public final void shiftExpression() throws RecognitionException {
		int shiftExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:812:5: ( additiveExpression ( shiftOp additiveExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:812:9: additiveExpression ( shiftOp additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_shiftExpression4854);
			additiveExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:812:28: ( shiftOp additiveExpression )*
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==49) ) {
					int LA139_1 = input.LA(2);
					if ( (LA139_1==49) ) {
						int LA139_4 = input.LA(3);
						if ( ((LA139_4 >= CharacterLiteral && LA139_4 <= DecimalLiteral)||LA139_4==FloatingPointLiteral||(LA139_4 >= HexLiteral && LA139_4 <= Identifier)||(LA139_4 >= OctalLiteral && LA139_4 <= StringLiteral)||LA139_4==25||LA139_4==32||(LA139_4 >= 36 && LA139_4 <= 37)||(LA139_4 >= 40 && LA139_4 <= 41)||LA139_4==60||LA139_4==62||LA139_4==65||LA139_4==70||LA139_4==73||LA139_4==76||LA139_4==82||LA139_4==84||(LA139_4 >= 86 && LA139_4 <= 87)||LA139_4==93||LA139_4==96||LA139_4==99||LA139_4==103||LA139_4==105||LA139_4==113) ) {
							alt139=1;
						}

					}

				}
				else if ( (LA139_0==52) ) {
					int LA139_2 = input.LA(2);
					if ( (LA139_2==52) ) {
						int LA139_5 = input.LA(3);
						if ( (LA139_5==52) ) {
							int LA139_7 = input.LA(4);
							if ( ((LA139_7 >= CharacterLiteral && LA139_7 <= DecimalLiteral)||LA139_7==FloatingPointLiteral||(LA139_7 >= HexLiteral && LA139_7 <= Identifier)||(LA139_7 >= OctalLiteral && LA139_7 <= StringLiteral)||LA139_7==25||LA139_7==32||(LA139_7 >= 36 && LA139_7 <= 37)||(LA139_7 >= 40 && LA139_7 <= 41)||LA139_7==60||LA139_7==62||LA139_7==65||LA139_7==70||LA139_7==73||LA139_7==76||LA139_7==82||LA139_7==84||(LA139_7 >= 86 && LA139_7 <= 87)||LA139_7==93||LA139_7==96||LA139_7==99||LA139_7==103||LA139_7==105||LA139_7==113) ) {
								alt139=1;
							}

						}
						else if ( ((LA139_5 >= CharacterLiteral && LA139_5 <= DecimalLiteral)||LA139_5==FloatingPointLiteral||(LA139_5 >= HexLiteral && LA139_5 <= Identifier)||(LA139_5 >= OctalLiteral && LA139_5 <= StringLiteral)||LA139_5==25||LA139_5==32||(LA139_5 >= 36 && LA139_5 <= 37)||(LA139_5 >= 40 && LA139_5 <= 41)||LA139_5==60||LA139_5==62||LA139_5==65||LA139_5==70||LA139_5==73||LA139_5==76||LA139_5==82||LA139_5==84||(LA139_5 >= 86 && LA139_5 <= 87)||LA139_5==93||LA139_5==96||LA139_5==99||LA139_5==103||LA139_5==105||LA139_5==113) ) {
							alt139=1;
						}

					}

				}

				switch (alt139) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:812:30: shiftOp additiveExpression
					{
					pushFollow(FOLLOW_shiftOp_in_shiftExpression4858);
					shiftOp();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_additiveExpression_in_shiftExpression4860);
					additiveExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop139;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 117, shiftExpression_StartIndex); }

		}
	}
	// $ANTLR end "shiftExpression"



	// $ANTLR start "shiftOp"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:815:1: shiftOp : ( ( '<' '<' )=>t1= '<' t2= '<' {...}?| ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?| ( '>' '>' )=>t1= '>' t2= '>' {...}?);
	public final void shiftOp() throws RecognitionException {
		int shiftOp_StartIndex = input.index();

		Token t1=null;
		Token t2=null;
		Token t3=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:816:5: ( ( '<' '<' )=>t1= '<' t2= '<' {...}?| ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?| ( '>' '>' )=>t1= '>' t2= '>' {...}?)
			int alt140=3;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==49) && (synpred215_BasForCCal())) {
				alt140=1;
			}
			else if ( (LA140_0==52) ) {
				int LA140_2 = input.LA(2);
				if ( (LA140_2==52) ) {
					int LA140_3 = input.LA(3);
					if ( (LA140_3==52) && (synpred216_BasForCCal())) {
						alt140=2;
					}
					else if ( (LA140_3==36) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==40) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==37) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==41) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==113) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==25) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==32) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==99) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==96) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==DecimalLiteral||LA140_3==HexLiteral||LA140_3==OctalLiteral) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==FloatingPointLiteral) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==CharacterLiteral) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==StringLiteral) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==73||LA140_3==103) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==87) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==86) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==Identifier) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==60) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==65) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==62) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==93) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==82) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==84) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==76) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==70) && (synpred217_BasForCCal())) {
						alt140=3;
					}
					else if ( (LA140_3==105) && (synpred217_BasForCCal())) {
						alt140=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 140, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 140, 0, input);
				throw nvae;
			}

			switch (alt140) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:816:9: ( '<' '<' )=>t1= '<' t2= '<' {...}?
					{
					t1=(Token)match(input,49,FOLLOW_49_in_shiftOp4891); if (state.failed) return;
					t2=(Token)match(input,49,FOLLOW_49_in_shiftOp4895); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \r\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
					}
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:819:9: ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?
					{
					t1=(Token)match(input,52,FOLLOW_52_in_shiftOp4927); if (state.failed) return;
					t2=(Token)match(input,52,FOLLOW_52_in_shiftOp4931); if (state.failed) return;
					t3=(Token)match(input,52,FOLLOW_52_in_shiftOp4935); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() &&
					          t2.getLine() == t3.getLine() && 
					          t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \r\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&\r\n          $t2.getLine() == $t3.getLine() && \r\n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
					}
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:824:9: ( '>' '>' )=>t1= '>' t2= '>' {...}?
					{
					t1=(Token)match(input,52,FOLLOW_52_in_shiftOp4965); if (state.failed) return;
					t2=(Token)match(input,52,FOLLOW_52_in_shiftOp4969); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \r\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
					}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 118, shiftOp_StartIndex); }

		}
	}
	// $ANTLR end "shiftOp"



	// $ANTLR start "additiveExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:830:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
	public final void additiveExpression() throws RecognitionException {
		int additiveExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:831:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:831:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4999);
			multiplicativeExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:831:34: ( ( '+' | '-' ) multiplicativeExpression )*
			loop141:
			while (true) {
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==36||LA141_0==40) ) {
					alt141=1;
				}

				switch (alt141) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:831:36: ( '+' | '-' ) multiplicativeExpression
					{
					if ( input.LA(1)==36||input.LA(1)==40 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5011);
					multiplicativeExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop141;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 119, additiveExpression_StartIndex); }

		}
	}
	// $ANTLR end "additiveExpression"



	// $ANTLR start "multiplicativeExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:834:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
	public final void multiplicativeExpression() throws RecognitionException {
		int multiplicativeExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:835:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:835:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5033);
			unaryExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:835:25: ( ( '*' | '/' | '%' ) unaryExpression )*
			loop142:
			while (true) {
				int alt142=2;
				int LA142_0 = input.LA(1);
				if ( (LA142_0==27||LA142_0==34||LA142_0==45) ) {
					alt142=1;
				}

				switch (alt142) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:835:27: ( '*' | '/' | '%' ) unaryExpression
					{
					if ( input.LA(1)==27||input.LA(1)==34||input.LA(1)==45 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5051);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop142;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 120, multiplicativeExpression_StartIndex); }

		}
	}
	// $ANTLR end "multiplicativeExpression"



	// $ANTLR start "unaryExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:838:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
	public final void unaryExpression() throws RecognitionException {
		int unaryExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:839:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
			int alt143=5;
			switch ( input.LA(1) ) {
			case 36:
				{
				alt143=1;
				}
				break;
			case 40:
				{
				alt143=2;
				}
				break;
			case 37:
				{
				alt143=3;
				}
				break;
			case 41:
				{
				alt143=4;
				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case Identifier:
			case OctalLiteral:
			case StringLiteral:
			case 25:
			case 32:
			case 60:
			case 62:
			case 65:
			case 70:
			case 73:
			case 76:
			case 82:
			case 84:
			case 86:
			case 87:
			case 93:
			case 96:
			case 99:
			case 103:
			case 105:
			case 113:
				{
				alt143=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 143, 0, input);
				throw nvae;
			}
			switch (alt143) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:839:9: '+' unaryExpression
					{
					match(input,36,FOLLOW_36_in_unaryExpression5077); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5079);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:840:9: '-' unaryExpression
					{
					match(input,40,FOLLOW_40_in_unaryExpression5089); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5091);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:841:9: '++' unaryExpression
					{
					match(input,37,FOLLOW_37_in_unaryExpression5101); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5103);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:842:9: '--' unaryExpression
					{
					match(input,41,FOLLOW_41_in_unaryExpression5113); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression5115);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:843:9: unaryExpressionNotPlusMinus
					{
					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression5125);
					unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 121, unaryExpression_StartIndex); }

		}
	}
	// $ANTLR end "unaryExpression"



	// $ANTLR start "unaryExpressionNotPlusMinus"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:846:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );
	public final void unaryExpressionNotPlusMinus() throws RecognitionException {
		int unaryExpressionNotPlusMinus_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:847:5: ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? )
			int alt146=4;
			switch ( input.LA(1) ) {
			case 113:
				{
				alt146=1;
				}
				break;
			case 25:
				{
				alt146=2;
				}
				break;
			case 32:
				{
				int LA146_3 = input.LA(2);
				if ( (synpred229_BasForCCal()) ) {
					alt146=3;
				}
				else if ( (true) ) {
					alt146=4;
				}

				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case Identifier:
			case OctalLiteral:
			case StringLiteral:
			case 60:
			case 62:
			case 65:
			case 70:
			case 73:
			case 76:
			case 82:
			case 84:
			case 86:
			case 87:
			case 93:
			case 96:
			case 99:
			case 103:
			case 105:
				{
				alt146=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 146, 0, input);
				throw nvae;
			}
			switch (alt146) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:847:9: '~' unaryExpression
					{
					match(input,113,FOLLOW_113_in_unaryExpressionNotPlusMinus5144); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5146);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:848:9: '!' unaryExpression
					{
					match(input,25,FOLLOW_25_in_unaryExpressionNotPlusMinus5156); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5158);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:849:9: castExpression
					{
					pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus5168);
					castExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:850:9: primary ( selector )* ( '++' | '--' )?
					{
					pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus5178);
					primary();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:850:17: ( selector )*
					loop144:
					while (true) {
						int alt144=2;
						int LA144_0 = input.LA(1);
						if ( (LA144_0==43||LA144_0==55) ) {
							alt144=1;
						}

						switch (alt144) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:850:17: selector
							{
							pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus5180);
							selector();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop144;
						}
					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:850:27: ( '++' | '--' )?
					int alt145=2;
					int LA145_0 = input.LA(1);
					if ( (LA145_0==37||LA145_0==41) ) {
						alt145=1;
					}
					switch (alt145) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:
							{
							if ( input.LA(1)==37||input.LA(1)==41 ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 122, unaryExpressionNotPlusMinus_StartIndex); }

		}
	}
	// $ANTLR end "unaryExpressionNotPlusMinus"



	// $ANTLR start "castExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:853:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus );
	public final void castExpression() throws RecognitionException {
		int castExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:854:5: ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus )
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==32) ) {
				int LA148_1 = input.LA(2);
				if ( (synpred233_BasForCCal()) ) {
					alt148=1;
				}
				else if ( (true) ) {
					alt148=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 148, 0, input);
				throw nvae;
			}

			switch (alt148) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:854:8: '(' primitiveType ')' unaryExpression
					{
					match(input,32,FOLLOW_32_in_castExpression5206); if (state.failed) return;
					pushFollow(FOLLOW_primitiveType_in_castExpression5208);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					match(input,33,FOLLOW_33_in_castExpression5210); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_castExpression5212);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:855:8: '(' ( type | expression ) ')' unaryExpressionNotPlusMinus
					{
					match(input,32,FOLLOW_32_in_castExpression5221); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:855:12: ( type | expression )
					int alt147=2;
					alt147 = dfa147.predict(input);
					switch (alt147) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:855:13: type
							{
							pushFollow(FOLLOW_type_in_castExpression5224);
							type();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:855:20: expression
							{
							pushFollow(FOLLOW_expression_in_castExpression5228);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,33,FOLLOW_33_in_castExpression5231); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression5233);
					unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 123, castExpression_StartIndex); }

		}
	}
	// $ANTLR end "castExpression"



	// $ANTLR start "primary"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:858:1: primary : ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator | Identifier trying | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );
	public final void primary() throws RecognitionException {
		int primary_StartIndex = input.index();

		Token Identifier12=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:859:5: ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator | Identifier trying | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' )
			int alt152=8;
			switch ( input.LA(1) ) {
			case 32:
				{
				alt152=1;
				}
				break;
			case 99:
				{
				alt152=2;
				}
				break;
			case 96:
				{
				alt152=3;
				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FloatingPointLiteral:
			case HexLiteral:
			case OctalLiteral:
			case StringLiteral:
			case 73:
			case 87:
			case 103:
				{
				alt152=4;
				}
				break;
			case 86:
				{
				alt152=5;
				}
				break;
			case Identifier:
				{
				alt152=6;
				}
				break;
			case 60:
			case 62:
			case 65:
			case 70:
			case 76:
			case 82:
			case 84:
			case 93:
				{
				alt152=7;
				}
				break;
			case 105:
				{
				alt152=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 152, 0, input);
				throw nvae;
			}
			switch (alt152) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:859:9: parExpression
					{
					pushFollow(FOLLOW_parExpression_in_primary5252);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:860:9: 'this' ( '.' Identifier )* ( identifierSuffix )?
					{
					match(input,99,FOLLOW_99_in_primary5262); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:860:16: ( '.' Identifier )*
					loop149:
					while (true) {
						int alt149=2;
						int LA149_0 = input.LA(1);
						if ( (LA149_0==43) ) {
							int LA149_2 = input.LA(2);
							if ( (LA149_2==Identifier) ) {
								int LA149_3 = input.LA(3);
								if ( (synpred236_BasForCCal()) ) {
									alt149=1;
								}

							}

						}

						switch (alt149) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:860:17: '.' Identifier
							{
							match(input,43,FOLLOW_43_in_primary5265); if (state.failed) return;
							match(input,Identifier,FOLLOW_Identifier_in_primary5267); if (state.failed) return;
							}
							break;

						default :
							break loop149;
						}
					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:860:34: ( identifierSuffix )?
					int alt150=2;
					switch ( input.LA(1) ) {
						case 55:
							{
							int LA150_1 = input.LA(2);
							if ( (synpred237_BasForCCal()) ) {
								alt150=1;
							}
							}
							break;
						case 32:
							{
							alt150=1;
							}
							break;
						case 43:
							{
							int LA150_3 = input.LA(2);
							if ( (synpred237_BasForCCal()) ) {
								alt150=1;
							}
							}
							break;
					}
					switch (alt150) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:860:34: identifierSuffix
							{
							pushFollow(FOLLOW_identifierSuffix_in_primary5271);
							identifierSuffix();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:861:9: 'super' superSuffix
					{
					match(input,96,FOLLOW_96_in_primary5282); if (state.failed) return;
					pushFollow(FOLLOW_superSuffix_in_primary5284);
					superSuffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:862:9: literal
					{
					pushFollow(FOLLOW_literal_in_primary5294);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:863:9: 'new' creator
					{
					match(input,86,FOLLOW_86_in_primary5304); if (state.failed) return;
					pushFollow(FOLLOW_creator_in_primary5306);
					creator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:864:9: Identifier trying
					{
					Identifier12=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary5316); if (state.failed) return;
					if ( state.backtracking==0 ) {methodname = (Identifier12!=null?Identifier12.getText():null);}
					pushFollow(FOLLOW_trying_in_primary5320);
					trying();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:865:9: primitiveType ( '[' ']' )* '.' 'class'
					{
					pushFollow(FOLLOW_primitiveType_in_primary5331);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:865:23: ( '[' ']' )*
					loop151:
					while (true) {
						int alt151=2;
						int LA151_0 = input.LA(1);
						if ( (LA151_0==55) ) {
							alt151=1;
						}

						switch (alt151) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:865:24: '[' ']'
							{
							match(input,55,FOLLOW_55_in_primary5334); if (state.failed) return;
							match(input,56,FOLLOW_56_in_primary5336); if (state.failed) return;
							}
							break;

						default :
							break loop151;
						}
					}

					match(input,43,FOLLOW_43_in_primary5340); if (state.failed) return;
					match(input,66,FOLLOW_66_in_primary5342); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:866:9: 'void' '.' 'class'
					{
					match(input,105,FOLLOW_105_in_primary5352); if (state.failed) return;
					match(input,43,FOLLOW_43_in_primary5354); if (state.failed) return;
					match(input,66,FOLLOW_66_in_primary5356); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 124, primary_StartIndex); }

		}
	}
	// $ANTLR end "primary"



	// $ANTLR start "trying"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:868:1: trying : ( '.' Identifier )* ( identifierSuffix )? ;
	public final void trying() throws RecognitionException {
		int trying_StartIndex = input.index();

		Token Identifier13=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:869:5: ( ( '.' Identifier )* ( identifierSuffix )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:869:9: ( '.' Identifier )* ( identifierSuffix )?
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:869:9: ( '.' Identifier )*
			loop153:
			while (true) {
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==43) ) {
					int LA153_2 = input.LA(2);
					if ( (LA153_2==Identifier) ) {
						int LA153_3 = input.LA(3);
						if ( (synpred245_BasForCCal()) ) {
							alt153=1;
						}

					}

				}

				switch (alt153) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:869:10: '.' Identifier
					{
					match(input,43,FOLLOW_43_in_trying5376); if (state.failed) return;
					Identifier13=(Token)match(input,Identifier,FOLLOW_Identifier_in_trying5378); if (state.failed) return;
					if ( state.backtracking==0 ) {isClassObject= true;methodname+= '.'+ (Identifier13!=null?Identifier13.getText():null); }
					}
					break;

				default :
					break loop153;
				}
			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:869:91: ( identifierSuffix )?
			int alt154=2;
			switch ( input.LA(1) ) {
				case 55:
					{
					int LA154_1 = input.LA(2);
					if ( (synpred246_BasForCCal()) ) {
						alt154=1;
					}
					}
					break;
				case 32:
					{
					alt154=1;
					}
					break;
				case 43:
					{
					int LA154_3 = input.LA(2);
					if ( (synpred246_BasForCCal()) ) {
						alt154=1;
					}
					}
					break;
			}
			switch (alt154) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:869:91: identifierSuffix
					{
					pushFollow(FOLLOW_identifierSuffix_in_trying5389);
					identifierSuffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 125, trying_StartIndex); }

		}
	}
	// $ANTLR end "trying"



	// $ANTLR start "identifierSuffix"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:871:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator );
	public final void identifierSuffix() throws RecognitionException {
		int identifierSuffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:872:5: ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator )
			int alt157=8;
			switch ( input.LA(1) ) {
			case 55:
				{
				int LA157_1 = input.LA(2);
				if ( (LA157_1==56) ) {
					alt157=1;
				}
				else if ( ((LA157_1 >= CharacterLiteral && LA157_1 <= DecimalLiteral)||LA157_1==FloatingPointLiteral||(LA157_1 >= HexLiteral && LA157_1 <= Identifier)||(LA157_1 >= OctalLiteral && LA157_1 <= StringLiteral)||LA157_1==25||LA157_1==32||(LA157_1 >= 36 && LA157_1 <= 37)||(LA157_1 >= 40 && LA157_1 <= 41)||LA157_1==60||LA157_1==62||LA157_1==65||LA157_1==70||LA157_1==73||LA157_1==76||LA157_1==82||LA157_1==84||(LA157_1 >= 86 && LA157_1 <= 87)||LA157_1==93||LA157_1==96||LA157_1==99||LA157_1==103||LA157_1==105||LA157_1==113) ) {
					alt157=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 157, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 32:
				{
				alt157=3;
				}
				break;
			case 43:
				{
				switch ( input.LA(2) ) {
				case 66:
					{
					alt157=4;
					}
					break;
				case 99:
					{
					alt157=6;
					}
					break;
				case 96:
					{
					alt157=7;
					}
					break;
				case 86:
					{
					alt157=8;
					}
					break;
				case 49:
					{
					alt157=5;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 157, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 157, 0, input);
				throw nvae;
			}
			switch (alt157) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:872:10: ( '[' ']' )+ '.' 'class'
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:872:10: ( '[' ']' )+
					int cnt155=0;
					loop155:
					while (true) {
						int alt155=2;
						int LA155_0 = input.LA(1);
						if ( (LA155_0==55) ) {
							alt155=1;
						}

						switch (alt155) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:872:11: '[' ']'
							{
							match(input,55,FOLLOW_55_in_identifierSuffix5411); if (state.failed) return;
							match(input,56,FOLLOW_56_in_identifierSuffix5413); if (state.failed) return;
							}
							break;

						default :
							if ( cnt155 >= 1 ) break loop155;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(155, input);
							throw eee;
						}
						cnt155++;
					}

					match(input,43,FOLLOW_43_in_identifierSuffix5417); if (state.failed) return;
					match(input,66,FOLLOW_66_in_identifierSuffix5419); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:873:9: ( '[' expression ']' )+
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:873:9: ( '[' expression ']' )+
					int cnt156=0;
					loop156:
					while (true) {
						int alt156=2;
						int LA156_0 = input.LA(1);
						if ( (LA156_0==55) ) {
							int LA156_2 = input.LA(2);
							if ( (synpred249_BasForCCal()) ) {
								alt156=1;
							}

						}

						switch (alt156) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:873:10: '[' expression ']'
							{
							match(input,55,FOLLOW_55_in_identifierSuffix5430); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_identifierSuffix5432);
							expression();
							state._fsp--;
							if (state.failed) return;
							match(input,56,FOLLOW_56_in_identifierSuffix5434); if (state.failed) return;
							}
							break;

						default :
							if ( cnt156 >= 1 ) break loop156;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(156, input);
							throw eee;
						}
						cnt156++;
					}

					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:874:9: arguments
					{
					pushFollow(FOLLOW_arguments_in_identifierSuffix5447);
					arguments();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { methodcalls.add(methodname); methodname ="";}
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:875:9: '.' 'class'
					{
					match(input,43,FOLLOW_43_in_identifierSuffix5459); if (state.failed) return;
					match(input,66,FOLLOW_66_in_identifierSuffix5461); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:876:9: '.' explicitGenericInvocation
					{
					match(input,43,FOLLOW_43_in_identifierSuffix5471); if (state.failed) return;
					pushFollow(FOLLOW_explicitGenericInvocation_in_identifierSuffix5473);
					explicitGenericInvocation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:877:9: '.' 'this'
					{
					match(input,43,FOLLOW_43_in_identifierSuffix5483); if (state.failed) return;
					match(input,99,FOLLOW_99_in_identifierSuffix5485); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:878:9: '.' 'super' arguments
					{
					match(input,43,FOLLOW_43_in_identifierSuffix5495); if (state.failed) return;
					match(input,96,FOLLOW_96_in_identifierSuffix5497); if (state.failed) return;
					pushFollow(FOLLOW_arguments_in_identifierSuffix5499);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:879:9: '.' 'new' innerCreator
					{
					match(input,43,FOLLOW_43_in_identifierSuffix5509); if (state.failed) return;
					match(input,86,FOLLOW_86_in_identifierSuffix5511); if (state.failed) return;
					pushFollow(FOLLOW_innerCreator_in_identifierSuffix5513);
					innerCreator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 126, identifierSuffix_StartIndex); }

		}
	}
	// $ANTLR end "identifierSuffix"



	// $ANTLR start "creator"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:882:1: creator : ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) );
	public final void creator() throws RecognitionException {
		int creator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:883:5: ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) )
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==49) ) {
				alt159=1;
			}
			else if ( (LA159_0==Identifier||LA159_0==60||LA159_0==62||LA159_0==65||LA159_0==70||LA159_0==76||LA159_0==82||LA159_0==84||LA159_0==93) ) {
				alt159=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 159, 0, input);
				throw nvae;
			}

			switch (alt159) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:883:9: nonWildcardTypeArguments createdName classCreatorRest
					{
					pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator5532);
					nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_createdName_in_creator5534);
					createdName();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_classCreatorRest_in_creator5536);
					classCreatorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:884:9: createdName ( arrayCreatorRest | classCreatorRest )
					{
					pushFollow(FOLLOW_createdName_in_creator5546);
					createdName();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:884:21: ( arrayCreatorRest | classCreatorRest )
					int alt158=2;
					int LA158_0 = input.LA(1);
					if ( (LA158_0==55) ) {
						alt158=1;
					}
					else if ( (LA158_0==32) ) {
						alt158=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 158, 0, input);
						throw nvae;
					}

					switch (alt158) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:884:22: arrayCreatorRest
							{
							pushFollow(FOLLOW_arrayCreatorRest_in_creator5549);
							arrayCreatorRest();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:884:41: classCreatorRest
							{
							pushFollow(FOLLOW_classCreatorRest_in_creator5553);
							classCreatorRest();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 127, creator_StartIndex); }

		}
	}
	// $ANTLR end "creator"



	// $ANTLR start "createdName"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:887:1: createdName : ( classOrInterfaceType | primitiveType );
	public final void createdName() throws RecognitionException {
		int createdName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:888:5: ( classOrInterfaceType | primitiveType )
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==Identifier) ) {
				alt160=1;
			}
			else if ( (LA160_0==60||LA160_0==62||LA160_0==65||LA160_0==70||LA160_0==76||LA160_0==82||LA160_0==84||LA160_0==93) ) {
				alt160=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 160, 0, input);
				throw nvae;
			}

			switch (alt160) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:888:9: classOrInterfaceType
					{
					pushFollow(FOLLOW_classOrInterfaceType_in_createdName5573);
					classOrInterfaceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:889:9: primitiveType
					{
					pushFollow(FOLLOW_primitiveType_in_createdName5583);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 128, createdName_StartIndex); }

		}
	}
	// $ANTLR end "createdName"



	// $ANTLR start "innerCreator"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:892:1: innerCreator : nonWildcardTypeArguments Identifier classCreatorRest ;
	public final void innerCreator() throws RecognitionException {
		int innerCreator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:893:5: ( nonWildcardTypeArguments Identifier classCreatorRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:893:9: nonWildcardTypeArguments Identifier classCreatorRest
			{
			pushFollow(FOLLOW_nonWildcardTypeArguments_in_innerCreator5606);
			nonWildcardTypeArguments();
			state._fsp--;
			if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_innerCreator5608); if (state.failed) return;
			pushFollow(FOLLOW_classCreatorRest_in_innerCreator5610);
			classCreatorRest();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 129, innerCreator_StartIndex); }

		}
	}
	// $ANTLR end "innerCreator"



	// $ANTLR start "arrayCreatorRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:896:1: arrayCreatorRest : '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) ;
	public final void arrayCreatorRest() throws RecognitionException {
		int arrayCreatorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:897:5: ( '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:897:9: '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
			{
			match(input,55,FOLLOW_55_in_arrayCreatorRest5629); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:898:9: ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==56) ) {
				alt164=1;
			}
			else if ( ((LA164_0 >= CharacterLiteral && LA164_0 <= DecimalLiteral)||LA164_0==FloatingPointLiteral||(LA164_0 >= HexLiteral && LA164_0 <= Identifier)||(LA164_0 >= OctalLiteral && LA164_0 <= StringLiteral)||LA164_0==25||LA164_0==32||(LA164_0 >= 36 && LA164_0 <= 37)||(LA164_0 >= 40 && LA164_0 <= 41)||LA164_0==60||LA164_0==62||LA164_0==65||LA164_0==70||LA164_0==73||LA164_0==76||LA164_0==82||LA164_0==84||(LA164_0 >= 86 && LA164_0 <= 87)||LA164_0==93||LA164_0==96||LA164_0==99||LA164_0==103||LA164_0==105||LA164_0==113) ) {
				alt164=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 164, 0, input);
				throw nvae;
			}

			switch (alt164) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:898:13: ']' ( '[' ']' )* arrayInitializer
					{
					match(input,56,FOLLOW_56_in_arrayCreatorRest5643); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:898:17: ( '[' ']' )*
					loop161:
					while (true) {
						int alt161=2;
						int LA161_0 = input.LA(1);
						if ( (LA161_0==55) ) {
							alt161=1;
						}

						switch (alt161) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:898:18: '[' ']'
							{
							match(input,55,FOLLOW_55_in_arrayCreatorRest5646); if (state.failed) return;
							match(input,56,FOLLOW_56_in_arrayCreatorRest5648); if (state.failed) return;
							}
							break;

						default :
							break loop161;
						}
					}

					pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest5652);
					arrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:899:13: expression ']' ( '[' expression ']' )* ( '[' ']' )*
					{
					pushFollow(FOLLOW_expression_in_arrayCreatorRest5666);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,56,FOLLOW_56_in_arrayCreatorRest5668); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:899:28: ( '[' expression ']' )*
					loop162:
					while (true) {
						int alt162=2;
						int LA162_0 = input.LA(1);
						if ( (LA162_0==55) ) {
							int LA162_1 = input.LA(2);
							if ( (synpred261_BasForCCal()) ) {
								alt162=1;
							}

						}

						switch (alt162) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:899:29: '[' expression ']'
							{
							match(input,55,FOLLOW_55_in_arrayCreatorRest5671); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_arrayCreatorRest5673);
							expression();
							state._fsp--;
							if (state.failed) return;
							match(input,56,FOLLOW_56_in_arrayCreatorRest5675); if (state.failed) return;
							}
							break;

						default :
							break loop162;
						}
					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:899:50: ( '[' ']' )*
					loop163:
					while (true) {
						int alt163=2;
						int LA163_0 = input.LA(1);
						if ( (LA163_0==55) ) {
							int LA163_2 = input.LA(2);
							if ( (LA163_2==56) ) {
								alt163=1;
							}

						}

						switch (alt163) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:899:51: '[' ']'
							{
							match(input,55,FOLLOW_55_in_arrayCreatorRest5680); if (state.failed) return;
							match(input,56,FOLLOW_56_in_arrayCreatorRest5682); if (state.failed) return;
							}
							break;

						default :
							break loop163;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 130, arrayCreatorRest_StartIndex); }

		}
	}
	// $ANTLR end "arrayCreatorRest"



	// $ANTLR start "classCreatorRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:903:1: classCreatorRest : arguments ( classBody )? ;
	public final void classCreatorRest() throws RecognitionException {
		int classCreatorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:904:5: ( arguments ( classBody )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:904:9: arguments ( classBody )?
			{
			pushFollow(FOLLOW_arguments_in_classCreatorRest5713);
			arguments();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:904:19: ( classBody )?
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==108) ) {
				alt165=1;
			}
			switch (alt165) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:904:19: classBody
					{
					pushFollow(FOLLOW_classBody_in_classCreatorRest5715);
					classBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 131, classCreatorRest_StartIndex); }

		}
	}
	// $ANTLR end "classCreatorRest"



	// $ANTLR start "explicitGenericInvocation"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:907:1: explicitGenericInvocation : nonWildcardTypeArguments Identifier arguments ;
	public final void explicitGenericInvocation() throws RecognitionException {
		int explicitGenericInvocation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:908:5: ( nonWildcardTypeArguments Identifier arguments )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:908:9: nonWildcardTypeArguments Identifier arguments
			{
			pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation5739);
			nonWildcardTypeArguments();
			state._fsp--;
			if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_explicitGenericInvocation5741); if (state.failed) return;
			pushFollow(FOLLOW_arguments_in_explicitGenericInvocation5743);
			arguments();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 132, explicitGenericInvocation_StartIndex); }

		}
	}
	// $ANTLR end "explicitGenericInvocation"



	// $ANTLR start "nonWildcardTypeArguments"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:911:1: nonWildcardTypeArguments : '<' typeList '>' ;
	public final void nonWildcardTypeArguments() throws RecognitionException {
		int nonWildcardTypeArguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:912:5: ( '<' typeList '>' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:912:9: '<' typeList '>'
			{
			match(input,49,FOLLOW_49_in_nonWildcardTypeArguments5766); if (state.failed) return;
			pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments5768);
			typeList();
			state._fsp--;
			if (state.failed) return;
			match(input,52,FOLLOW_52_in_nonWildcardTypeArguments5770); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 133, nonWildcardTypeArguments_StartIndex); }

		}
	}
	// $ANTLR end "nonWildcardTypeArguments"



	// $ANTLR start "selector"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:915:1: selector : ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' );
	public final void selector() throws RecognitionException {
		int selector_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:916:5: ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' )
			int alt167=5;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==43) ) {
				switch ( input.LA(2) ) {
				case Identifier:
					{
					alt167=1;
					}
					break;
				case 99:
					{
					alt167=2;
					}
					break;
				case 96:
					{
					alt167=3;
					}
					break;
				case 86:
					{
					alt167=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 167, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA167_0==55) ) {
				alt167=5;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 167, 0, input);
				throw nvae;
			}

			switch (alt167) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:916:9: '.' Identifier ( arguments )?
					{
					match(input,43,FOLLOW_43_in_selector5793); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_selector5795); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:916:24: ( arguments )?
					int alt166=2;
					int LA166_0 = input.LA(1);
					if ( (LA166_0==32) ) {
						alt166=1;
					}
					switch (alt166) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:916:24: arguments
							{
							pushFollow(FOLLOW_arguments_in_selector5797);
							arguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:917:9: '.' 'this'
					{
					match(input,43,FOLLOW_43_in_selector5808); if (state.failed) return;
					match(input,99,FOLLOW_99_in_selector5810); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:918:9: '.' 'super' superSuffix
					{
					match(input,43,FOLLOW_43_in_selector5820); if (state.failed) return;
					match(input,96,FOLLOW_96_in_selector5822); if (state.failed) return;
					pushFollow(FOLLOW_superSuffix_in_selector5824);
					superSuffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:919:9: '.' 'new' innerCreator
					{
					match(input,43,FOLLOW_43_in_selector5834); if (state.failed) return;
					match(input,86,FOLLOW_86_in_selector5836); if (state.failed) return;
					pushFollow(FOLLOW_innerCreator_in_selector5838);
					innerCreator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:920:9: '[' expression ']'
					{
					match(input,55,FOLLOW_55_in_selector5848); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_selector5850);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,56,FOLLOW_56_in_selector5852); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 134, selector_StartIndex); }

		}
	}
	// $ANTLR end "selector"



	// $ANTLR start "superSuffix"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:923:1: superSuffix : ( arguments | '.' Identifier ( arguments )? );
	public final void superSuffix() throws RecognitionException {
		int superSuffix_StartIndex = input.index();

		Token Identifier14=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:924:5: ( arguments | '.' Identifier ( arguments )? )
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==32) ) {
				alt169=1;
			}
			else if ( (LA169_0==43) ) {
				alt169=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 169, 0, input);
				throw nvae;
			}

			switch (alt169) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:924:9: arguments
					{
					pushFollow(FOLLOW_arguments_in_superSuffix5875);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:925:9: '.' Identifier ( arguments )?
					{
					match(input,43,FOLLOW_43_in_superSuffix5885); if (state.failed) return;
					Identifier14=(Token)match(input,Identifier,FOLLOW_Identifier_in_superSuffix5887); if (state.failed) return;
					if ( state.backtracking==0 ) {methodname =  (Identifier14!=null?Identifier14.getText():null); methodcalls.add(methodname); methodname="";}
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:925:103: ( arguments )?
					int alt168=2;
					int LA168_0 = input.LA(1);
					if ( (LA168_0==32) ) {
						alt168=1;
					}
					switch (alt168) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:925:103: arguments
							{
							pushFollow(FOLLOW_arguments_in_superSuffix5892);
							arguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 135, superSuffix_StartIndex); }

		}
	}
	// $ANTLR end "superSuffix"



	// $ANTLR start "arguments"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:928:1: arguments : '(' ( expressionList )? ')' ;
	public final void arguments() throws RecognitionException {
		int arguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:929:5: ( '(' ( expressionList )? ')' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:929:9: '(' ( expressionList )? ')'
			{
			match(input,32,FOLLOW_32_in_arguments5912); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:929:13: ( expressionList )?
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( ((LA170_0 >= CharacterLiteral && LA170_0 <= DecimalLiteral)||LA170_0==FloatingPointLiteral||(LA170_0 >= HexLiteral && LA170_0 <= Identifier)||(LA170_0 >= OctalLiteral && LA170_0 <= StringLiteral)||LA170_0==25||LA170_0==32||(LA170_0 >= 36 && LA170_0 <= 37)||(LA170_0 >= 40 && LA170_0 <= 41)||LA170_0==60||LA170_0==62||LA170_0==65||LA170_0==70||LA170_0==73||LA170_0==76||LA170_0==82||LA170_0==84||(LA170_0 >= 86 && LA170_0 <= 87)||LA170_0==93||LA170_0==96||LA170_0==99||LA170_0==103||LA170_0==105||LA170_0==113) ) {
				alt170=1;
			}
			switch (alt170) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:929:13: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_arguments5914);
					expressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,33,FOLLOW_33_in_arguments5917); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 136, arguments_StartIndex); }

		}
	}
	// $ANTLR end "arguments"

	// $ANTLR start synpred5_BasForCCal
	public final void synpred5_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:56:9: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:56:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
		{
		pushFollow(FOLLOW_annotations_in_synpred5_BasForCCal55);
		annotations();
		state._fsp--;
		if (state.failed) return;
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
		int alt176=2;
		int LA176_0 = input.LA(1);
		if ( (LA176_0==88) ) {
			alt176=1;
		}
		else if ( (LA176_0==ENUM||LA176_0==54||LA176_0==59||LA176_0==66||LA176_0==74||LA176_0==83||(LA176_0 >= 89 && LA176_0 <= 91)||(LA176_0 >= 94 && LA176_0 <= 95)) ) {
			alt176=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 176, 0, input);
			throw nvae;
		}

		switch (alt176) {
			case 1 :
				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
				{
				pushFollow(FOLLOW_packageDeclaration_in_synpred5_BasForCCal69);
				packageDeclaration();
				state._fsp--;
				if (state.failed) return;
				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:32: ( importDeclaration )*
				loop173:
				while (true) {
					int alt173=2;
					int LA173_0 = input.LA(1);
					if ( (LA173_0==80) ) {
						alt173=1;
					}

					switch (alt173) {
					case 1 :
						// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:32: importDeclaration
						{
						pushFollow(FOLLOW_importDeclaration_in_synpred5_BasForCCal71);
						importDeclaration();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop173;
					}
				}

				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:51: ( typeDeclaration )*
				loop174:
				while (true) {
					int alt174=2;
					int LA174_0 = input.LA(1);
					if ( (LA174_0==ENUM||LA174_0==48||LA174_0==54||LA174_0==59||LA174_0==66||LA174_0==74||LA174_0==83||(LA174_0 >= 89 && LA174_0 <= 91)||(LA174_0 >= 94 && LA174_0 <= 95)) ) {
						alt174=1;
					}

					switch (alt174) {
					case 1 :
						// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:51: typeDeclaration
						{
						pushFollow(FOLLOW_typeDeclaration_in_synpred5_BasForCCal74);
						typeDeclaration();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop174;
					}
				}

				}
				break;
			case 2 :
				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:58:13: classOrInterfaceDeclaration ( typeDeclaration )*
				{
				pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred5_BasForCCal89);
				classOrInterfaceDeclaration();
				state._fsp--;
				if (state.failed) return;
				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:58:41: ( typeDeclaration )*
				loop175:
				while (true) {
					int alt175=2;
					int LA175_0 = input.LA(1);
					if ( (LA175_0==ENUM||LA175_0==48||LA175_0==54||LA175_0==59||LA175_0==66||LA175_0==74||LA175_0==83||(LA175_0 >= 89 && LA175_0 <= 91)||(LA175_0 >= 94 && LA175_0 <= 95)) ) {
						alt175=1;
					}

					switch (alt175) {
					case 1 :
						// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:58:41: typeDeclaration
						{
						pushFollow(FOLLOW_typeDeclaration_in_synpred5_BasForCCal91);
						typeDeclaration();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop175;
					}
				}

				}
				break;

		}

		}

	}
	// $ANTLR end synpred5_BasForCCal

	// $ANTLR start synpred47_BasForCCal
	public final void synpred47_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:9: ( modifiers genericMethodOrConstructorDecl )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:9: modifiers genericMethodOrConstructorDecl
		{
		pushFollow(FOLLOW_modifiers_in_synpred47_BasForCCal977);
		modifiers();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_genericMethodOrConstructorDecl_in_synpred47_BasForCCal979);
		genericMethodOrConstructorDecl();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred47_BasForCCal

	// $ANTLR start synpred48_BasForCCal
	public final void synpred48_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:251:9: ( memberDeclaration )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:251:9: memberDeclaration
		{
		pushFollow(FOLLOW_memberDeclaration_in_synpred48_BasForCCal989);
		memberDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred48_BasForCCal

	// $ANTLR start synpred49_BasForCCal
	public final void synpred49_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:252:8: ( modifiers 'void' Identifier voidMethodDeclaratorRest )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:252:8: modifiers 'void' Identifier voidMethodDeclaratorRest
		{
		pushFollow(FOLLOW_modifiers_in_synpred49_BasForCCal1000);
		modifiers();
		state._fsp--;
		if (state.failed) return;
		match(input,105,FOLLOW_105_in_synpred49_BasForCCal1002); if (state.failed) return;
		match(input,Identifier,FOLLOW_Identifier_in_synpred49_BasForCCal1004); if (state.failed) return;
		pushFollow(FOLLOW_voidMethodDeclaratorRest_in_synpred49_BasForCCal1008);
		voidMethodDeclaratorRest();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred49_BasForCCal

	// $ANTLR start synpred50_BasForCCal
	public final void synpred50_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:255:8: ( modifiers Identifier constructorDeclaratorRest )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:255:8: modifiers Identifier constructorDeclaratorRest
		{
		pushFollow(FOLLOW_modifiers_in_synpred50_BasForCCal1018);
		modifiers();
		state._fsp--;
		if (state.failed) return;
		match(input,Identifier,FOLLOW_Identifier_in_synpred50_BasForCCal1020); if (state.failed) return;
		pushFollow(FOLLOW_constructorDeclaratorRest_in_synpred50_BasForCCal1024);
		constructorDeclaratorRest();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred50_BasForCCal

	// $ANTLR start synpred51_BasForCCal
	public final void synpred51_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:258:16: ( modifiers interfaceDeclaration )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:258:16: modifiers interfaceDeclaration
		{
		pushFollow(FOLLOW_modifiers_in_synpred51_BasForCCal1042);
		modifiers();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_interfaceDeclaration_in_synpred51_BasForCCal1044);
		interfaceDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred51_BasForCCal

	// $ANTLR start synpred52_BasForCCal
	public final void synpred52_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:265:10: ( modifiers type methodDeclaration )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:265:10: modifiers type methodDeclaration
		{
		pushFollow(FOLLOW_modifiers_in_synpred52_BasForCCal1082);
		modifiers();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_type_in_synpred52_BasForCCal1084);
		type();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_methodDeclaration_in_synpred52_BasForCCal1086);
		methodDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred52_BasForCCal

	// $ANTLR start synpred91_BasForCCal
	public final void synpred91_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:401:26: ( '[' ']' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:401:26: '[' ']'
		{
		match(input,55,FOLLOW_55_in_synpred91_BasForCCal2159); if (state.failed) return;
		match(input,56,FOLLOW_56_in_synpred91_BasForCCal2161); if (state.failed) return;
		}

	}
	// $ANTLR end synpred91_BasForCCal

	// $ANTLR start synpred93_BasForCCal
	public final void synpred93_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:402:19: ( '[' ']' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:402:19: '[' ']'
		{
		match(input,55,FOLLOW_55_in_synpred93_BasForCCal2171); if (state.failed) return;
		match(input,56,FOLLOW_56_in_synpred93_BasForCCal2173); if (state.failed) return;
		}

	}
	// $ANTLR end synpred93_BasForCCal

	// $ANTLR start synpred113_BasForCCal
	public final void synpred113_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:514:13: ( explicitConstructorInvocation )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:514:13: explicitConstructorInvocation
		{
		pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred113_BasForCCal2609);
		explicitConstructorInvocation();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred113_BasForCCal

	// $ANTLR start synpred117_BasForCCal
	public final void synpred117_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:518:9: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:518:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
		{
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:518:9: ( nonWildcardTypeArguments )?
		int alt184=2;
		int LA184_0 = input.LA(1);
		if ( (LA184_0==49) ) {
			alt184=1;
		}
		switch (alt184) {
			case 1 :
				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:518:9: nonWildcardTypeArguments
				{
				pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred117_BasForCCal2634);
				nonWildcardTypeArguments();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		if ( input.LA(1)==96||input.LA(1)==99 ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_arguments_in_synpred117_BasForCCal2645);
		arguments();
		state._fsp--;
		if (state.failed) return;
		match(input,48,FOLLOW_48_in_synpred117_BasForCCal2647); if (state.failed) return;
		}

	}
	// $ANTLR end synpred117_BasForCCal

	// $ANTLR start synpred128_BasForCCal
	public final void synpred128_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:550:9: ( annotation )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:550:9: annotation
		{
		pushFollow(FOLLOW_annotation_in_synpred128_BasForCCal2858);
		annotation();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred128_BasForCCal

	// $ANTLR start synpred151_BasForCCal
	public final void synpred151_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:623:8: ( localVariableDeclarationStatement )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:623:8: localVariableDeclarationStatement
		{
		pushFollow(FOLLOW_localVariableDeclarationStatement_in_synpred151_BasForCCal3385);
		localVariableDeclarationStatement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred151_BasForCCal

	// $ANTLR start synpred152_BasForCCal
	public final void synpred152_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:624:9: ( classOrInterfaceDeclaration )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:624:9: classOrInterfaceDeclaration
		{
		pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred152_BasForCCal3395);
		classOrInterfaceDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred152_BasForCCal

	// $ANTLR start synpred157_BasForCCal
	public final void synpred157_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:644:54: ( 'else' statement )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:644:54: 'else' statement
		{
		match(input,71,FOLLOW_71_in_synpred157_BasForCCal3545); if (state.failed) return;
		pushFollow(FOLLOW_statement_in_synpred157_BasForCCal3547);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred157_BasForCCal

	// $ANTLR start synpred162_BasForCCal
	public final void synpred162_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:649:11: ( catches 'finally' block )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:649:11: catches 'finally' block
		{
		pushFollow(FOLLOW_catches_in_synpred162_BasForCCal3623);
		catches();
		state._fsp--;
		if (state.failed) return;
		match(input,75,FOLLOW_75_in_synpred162_BasForCCal3625); if (state.failed) return;
		pushFollow(FOLLOW_block_in_synpred162_BasForCCal3627);
		block();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred162_BasForCCal

	// $ANTLR start synpred163_BasForCCal
	public final void synpred163_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:650:11: ( catches )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:650:11: catches
		{
		pushFollow(FOLLOW_catches_in_synpred163_BasForCCal3639);
		catches();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred163_BasForCCal

	// $ANTLR start synpred178_BasForCCal
	public final void synpred178_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:9: ( switchLabel )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:9: switchLabel
		{
		pushFollow(FOLLOW_switchLabel_in_synpred178_BasForCCal3930);
		switchLabel();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred178_BasForCCal

	// $ANTLR start synpred180_BasForCCal
	public final void synpred180_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:689:9: ( 'case' constantExpression ':' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:689:9: 'case' constantExpression ':'
		{
		match(input,63,FOLLOW_63_in_synpred180_BasForCCal3957); if (state.failed) return;
		pushFollow(FOLLOW_constantExpression_in_synpred180_BasForCCal3959);
		constantExpression();
		state._fsp--;
		if (state.failed) return;
		match(input,47,FOLLOW_47_in_synpred180_BasForCCal3961); if (state.failed) return;
		}

	}
	// $ANTLR end synpred180_BasForCCal

	// $ANTLR start synpred181_BasForCCal
	public final void synpred181_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:690:9: ( 'case' enumConstantName ':' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:690:9: 'case' enumConstantName ':'
		{
		match(input,63,FOLLOW_63_in_synpred181_BasForCCal3971); if (state.failed) return;
		pushFollow(FOLLOW_enumConstantName_in_synpred181_BasForCCal3973);
		enumConstantName();
		state._fsp--;
		if (state.failed) return;
		match(input,47,FOLLOW_47_in_synpred181_BasForCCal3975); if (state.failed) return;
		}

	}
	// $ANTLR end synpred181_BasForCCal

	// $ANTLR start synpred182_BasForCCal
	public final void synpred182_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:696:9: ( enhancedForControl )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:696:9: enhancedForControl
		{
		pushFollow(FOLLOW_enhancedForControl_in_synpred182_BasForCCal4018);
		enhancedForControl();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred182_BasForCCal

	// $ANTLR start synpred186_BasForCCal
	public final void synpred186_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:701:9: ( localVariableDeclaration )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:701:9: localVariableDeclaration
		{
		pushFollow(FOLLOW_localVariableDeclaration_in_synpred186_BasForCCal4058);
		localVariableDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred186_BasForCCal

	// $ANTLR start synpred188_BasForCCal
	public final void synpred188_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:732:32: ( assignmentOperator expression )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:732:32: assignmentOperator expression
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred188_BasForCCal4241);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred188_BasForCCal4243);
		expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred188_BasForCCal

	// $ANTLR start synpred198_BasForCCal
	public final void synpred198_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:745:9: ( '<' '<' '=' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:745:10: '<' '<' '='
		{
		match(input,49,FOLLOW_49_in_synpred198_BasForCCal4359); if (state.failed) return;
		match(input,49,FOLLOW_49_in_synpred198_BasForCCal4361); if (state.failed) return;
		match(input,50,FOLLOW_50_in_synpred198_BasForCCal4363); if (state.failed) return;
		}

	}
	// $ANTLR end synpred198_BasForCCal

	// $ANTLR start synpred199_BasForCCal
	public final void synpred199_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:750:9: ( '>' '>' '>' '=' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:750:10: '>' '>' '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred199_BasForCCal4399); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred199_BasForCCal4401); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred199_BasForCCal4403); if (state.failed) return;
		match(input,50,FOLLOW_50_in_synpred199_BasForCCal4405); if (state.failed) return;
		}

	}
	// $ANTLR end synpred199_BasForCCal

	// $ANTLR start synpred200_BasForCCal
	public final void synpred200_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:757:9: ( '>' '>' '=' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:757:10: '>' '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred200_BasForCCal4444); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred200_BasForCCal4446); if (state.failed) return;
		match(input,50,FOLLOW_50_in_synpred200_BasForCCal4448); if (state.failed) return;
		}

	}
	// $ANTLR end synpred200_BasForCCal

	// $ANTLR start synpred211_BasForCCal
	public final void synpred211_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:801:9: ( '<' '=' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:801:10: '<' '='
		{
		match(input,49,FOLLOW_49_in_synpred211_BasForCCal4756); if (state.failed) return;
		match(input,50,FOLLOW_50_in_synpred211_BasForCCal4758); if (state.failed) return;
		}

	}
	// $ANTLR end synpred211_BasForCCal

	// $ANTLR start synpred212_BasForCCal
	public final void synpred212_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:804:9: ( '>' '=' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:804:10: '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred212_BasForCCal4790); if (state.failed) return;
		match(input,50,FOLLOW_50_in_synpred212_BasForCCal4792); if (state.failed) return;
		}

	}
	// $ANTLR end synpred212_BasForCCal

	// $ANTLR start synpred215_BasForCCal
	public final void synpred215_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:816:9: ( '<' '<' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:816:10: '<' '<'
		{
		match(input,49,FOLLOW_49_in_synpred215_BasForCCal4883); if (state.failed) return;
		match(input,49,FOLLOW_49_in_synpred215_BasForCCal4885); if (state.failed) return;
		}

	}
	// $ANTLR end synpred215_BasForCCal

	// $ANTLR start synpred216_BasForCCal
	public final void synpred216_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:819:9: ( '>' '>' '>' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:819:10: '>' '>' '>'
		{
		match(input,52,FOLLOW_52_in_synpred216_BasForCCal4917); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred216_BasForCCal4919); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred216_BasForCCal4921); if (state.failed) return;
		}

	}
	// $ANTLR end synpred216_BasForCCal

	// $ANTLR start synpred217_BasForCCal
	public final void synpred217_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:824:9: ( '>' '>' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:824:10: '>' '>'
		{
		match(input,52,FOLLOW_52_in_synpred217_BasForCCal4957); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred217_BasForCCal4959); if (state.failed) return;
		}

	}
	// $ANTLR end synpred217_BasForCCal

	// $ANTLR start synpred229_BasForCCal
	public final void synpred229_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:849:9: ( castExpression )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:849:9: castExpression
		{
		pushFollow(FOLLOW_castExpression_in_synpred229_BasForCCal5168);
		castExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred229_BasForCCal

	// $ANTLR start synpred233_BasForCCal
	public final void synpred233_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:854:8: ( '(' primitiveType ')' unaryExpression )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:854:8: '(' primitiveType ')' unaryExpression
		{
		match(input,32,FOLLOW_32_in_synpred233_BasForCCal5206); if (state.failed) return;
		pushFollow(FOLLOW_primitiveType_in_synpred233_BasForCCal5208);
		primitiveType();
		state._fsp--;
		if (state.failed) return;
		match(input,33,FOLLOW_33_in_synpred233_BasForCCal5210); if (state.failed) return;
		pushFollow(FOLLOW_unaryExpression_in_synpred233_BasForCCal5212);
		unaryExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred233_BasForCCal

	// $ANTLR start synpred234_BasForCCal
	public final void synpred234_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:855:13: ( type )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:855:13: type
		{
		pushFollow(FOLLOW_type_in_synpred234_BasForCCal5224);
		type();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred234_BasForCCal

	// $ANTLR start synpred236_BasForCCal
	public final void synpred236_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:860:17: ( '.' Identifier )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:860:17: '.' Identifier
		{
		match(input,43,FOLLOW_43_in_synpred236_BasForCCal5265); if (state.failed) return;
		match(input,Identifier,FOLLOW_Identifier_in_synpred236_BasForCCal5267); if (state.failed) return;
		}

	}
	// $ANTLR end synpred236_BasForCCal

	// $ANTLR start synpred237_BasForCCal
	public final void synpred237_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:860:34: ( identifierSuffix )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:860:34: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred237_BasForCCal5271);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred237_BasForCCal

	// $ANTLR start synpred245_BasForCCal
	public final void synpred245_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:869:10: ( '.' Identifier )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:869:10: '.' Identifier
		{
		match(input,43,FOLLOW_43_in_synpred245_BasForCCal5376); if (state.failed) return;
		match(input,Identifier,FOLLOW_Identifier_in_synpred245_BasForCCal5378); if (state.failed) return;
		}

	}
	// $ANTLR end synpred245_BasForCCal

	// $ANTLR start synpred246_BasForCCal
	public final void synpred246_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:869:91: ( identifierSuffix )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:869:91: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred246_BasForCCal5389);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred246_BasForCCal

	// $ANTLR start synpred249_BasForCCal
	public final void synpred249_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:873:10: ( '[' expression ']' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:873:10: '[' expression ']'
		{
		match(input,55,FOLLOW_55_in_synpred249_BasForCCal5430); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred249_BasForCCal5432);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,56,FOLLOW_56_in_synpred249_BasForCCal5434); if (state.failed) return;
		}

	}
	// $ANTLR end synpred249_BasForCCal

	// $ANTLR start synpred261_BasForCCal
	public final void synpred261_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:899:29: ( '[' expression ']' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:899:29: '[' expression ']'
		{
		match(input,55,FOLLOW_55_in_synpred261_BasForCCal5671); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred261_BasForCCal5673);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,56,FOLLOW_56_in_synpred261_BasForCCal5675); if (state.failed) return;
		}

	}
	// $ANTLR end synpred261_BasForCCal

	// Delegated rules

	public final boolean synpred128_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred128_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred52_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred52_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred151_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred151_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred91_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred91_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred49_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred49_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred211_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred211_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred180_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred180_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred215_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred215_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred237_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred237_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred48_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred48_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred51_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred51_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred186_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred186_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred234_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred234_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred157_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred157_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred163_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred163_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred47_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred47_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred50_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred50_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred113_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred113_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred246_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred246_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred93_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred93_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred182_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred182_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred200_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred200_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred152_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred152_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred217_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred217_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred117_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred117_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred233_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred233_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred199_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred199_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred229_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred229_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred162_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred162_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred188_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred188_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred245_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred245_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred181_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred181_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred212_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred212_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred249_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred249_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred178_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred178_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred216_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred216_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred261_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred261_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred236_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred236_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred198_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred198_BasForCCal_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA124 dfa124 = new DFA124(this);
	protected DFA147 dfa147 = new DFA147(this);
	static final String DFA124_eotS =
		"\u00ef\uffff";
	static final String DFA124_eofS =
		"\u00ef\uffff";
	static final String DFA124_minS =
		"\1\6\12\17\22\uffff\13\17\1\6\1\17\1\6\1\47\30\uffff\1\70\1\47\1\uffff"+
		"\1\70\1\47\1\uffff\1\70\1\47\1\uffff\1\70\1\47\1\uffff\1\70\1\47\1\uffff"+
		"\1\70\1\47\1\uffff\1\70\1\47\1\uffff\1\70\1\47\1\uffff\40\0\2\uffff\12"+
		"\0\21\uffff\1\0\5\uffff\1\0\37\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff"+
		"\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff";
	static final String DFA124_maxS =
		"\1\161\1\135\1\157\10\67\22\uffff\11\67\1\135\1\17\1\161\1\143\1\161\1"+
		"\67\30\uffff\1\70\1\67\1\uffff\1\70\1\67\1\uffff\1\70\1\67\1\uffff\1\70"+
		"\1\67\1\uffff\1\70\1\67\1\uffff\1\70\1\67\1\uffff\1\70\1\67\1\uffff\1"+
		"\70\1\67\1\uffff\40\0\2\uffff\12\0\21\uffff\1\0\5\uffff\1\0\37\uffff\1"+
		"\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff"+
		"\1\0\5\uffff\1\0\5\uffff";
	static final String DFA124_acceptS =
		"\13\uffff\1\2\u00ae\uffff\1\1\64\uffff";
	static final String DFA124_specialS =
		"\134\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
		"\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1"+
		"\33\1\34\1\35\1\36\1\37\2\uffff\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
		"\1\50\1\51\21\uffff\1\52\5\uffff\1\53\37\uffff\1\54\5\uffff\1\55\5\uffff"+
		"\1\56\5\uffff\1\57\5\uffff\1\60\5\uffff\1\61\5\uffff\1\62\5\uffff\1\63"+
		"\5\uffff}>";
	static final String[] DFA124_transitionS = {
			"\2\13\4\uffff\1\13\1\uffff\1\13\1\2\5\uffff\2\13\2\uffff\1\13\6\uffff"+
			"\1\13\3\uffff\2\13\2\uffff\2\13\6\uffff\1\13\13\uffff\1\3\1\uffff\1\5"+
			"\2\uffff\1\4\4\uffff\1\12\2\uffff\1\13\1\1\1\uffff\1\11\5\uffff\1\7\1"+
			"\uffff\1\10\1\uffff\2\13\5\uffff\1\6\2\uffff\1\13\2\uffff\1\13\3\uffff"+
			"\1\13\1\uffff\1\13\7\uffff\1\13",
			"\1\35\54\uffff\1\36\1\uffff\1\40\2\uffff\1\37\4\uffff\1\45\3\uffff\1"+
			"\46\1\uffff\1\44\5\uffff\1\42\1\uffff\1\43\10\uffff\1\41",
			"\1\53\12\uffff\7\13\1\uffff\11\13\1\51\1\uffff\2\13\1\uffff\1\13\1\50"+
			"\4\13\1\47\1\52\1\uffff\2\13\26\uffff\1\13\33\uffff\3\13",
			"\1\105\33\uffff\1\13\13\uffff\1\104",
			"\1\110\33\uffff\1\13\13\uffff\1\107",
			"\1\113\33\uffff\1\13\13\uffff\1\112",
			"\1\116\33\uffff\1\13\13\uffff\1\115",
			"\1\121\33\uffff\1\13\13\uffff\1\120",
			"\1\124\33\uffff\1\13\13\uffff\1\123",
			"\1\127\33\uffff\1\13\13\uffff\1\126",
			"\1\132\33\uffff\1\13\13\uffff\1\131",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\137\33\uffff\1\135\5\uffff\1\134\4\uffff\1\140\1\136",
			"\1\142\47\uffff\1\141",
			"\1\144\47\uffff\1\143",
			"\1\146\47\uffff\1\145",
			"\1\150\47\uffff\1\147",
			"\1\152\47\uffff\1\151",
			"\1\154\47\uffff\1\153",
			"\1\156\47\uffff\1\155",
			"\1\160\47\uffff\1\157",
			"\1\161\54\uffff\1\162\1\uffff\1\164\2\uffff\1\163\4\uffff\1\171\3\uffff"+
			"\1\172\1\uffff\1\170\5\uffff\1\166\1\uffff\1\167\10\uffff\1\165",
			"\1\173",
			"\2\13\4\uffff\1\13\1\uffff\1\13\1\176\5\uffff\2\13\2\uffff\1\13\6\uffff"+
			"\1\13\3\uffff\2\13\2\uffff\2\13\7\uffff\2\13\2\uffff\1\u0087\6\uffff"+
			"\1\177\1\uffff\1\u0081\2\uffff\1\u0080\4\uffff\1\u0086\2\uffff\1\13\2"+
			"\uffff\1\u0085\5\uffff\1\u0083\1\uffff\1\u0084\1\uffff\2\13\5\uffff\1"+
			"\u0082\2\uffff\1\13\2\uffff\1\13\3\uffff\1\13\1\uffff\1\13\7\uffff\1"+
			"\13",
			"\1\u0099\41\uffff\1\13\20\uffff\1\13\23\uffff\1\13\11\uffff\1\13\2\uffff"+
			"\1\13",
			"\2\13\4\uffff\1\13\1\uffff\2\13\5\uffff\2\13\2\uffff\1\13\6\uffff\1"+
			"\13\3\uffff\2\13\2\uffff\2\13\16\uffff\1\u009f\3\uffff\1\13\1\uffff\1"+
			"\13\2\uffff\1\13\4\uffff\1\13\2\uffff\1\13\2\uffff\1\13\5\uffff\1\13"+
			"\1\uffff\1\13\1\uffff\2\13\5\uffff\1\13\2\uffff\1\13\2\uffff\1\13\3\uffff"+
			"\1\13\1\uffff\1\13\7\uffff\1\13",
			"\1\13\7\uffff\1\u00ba\1\13\1\uffff\1\13\4\uffff\1\13",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00bf",
			"\1\13\7\uffff\1\u00ba\1\13\1\uffff\1\13\4\uffff\1\13",
			"",
			"\1\u00c5",
			"\1\13\7\uffff\1\u00ba\1\13\1\uffff\1\13\4\uffff\1\13",
			"",
			"\1\u00cb",
			"\1\13\7\uffff\1\u00ba\1\13\1\uffff\1\13\4\uffff\1\13",
			"",
			"\1\u00d1",
			"\1\13\7\uffff\1\u00ba\1\13\1\uffff\1\13\4\uffff\1\13",
			"",
			"\1\u00d7",
			"\1\13\7\uffff\1\u00ba\1\13\1\uffff\1\13\4\uffff\1\13",
			"",
			"\1\u00dd",
			"\1\13\7\uffff\1\u00ba\1\13\1\uffff\1\13\4\uffff\1\13",
			"",
			"\1\u00e3",
			"\1\13\7\uffff\1\u00ba\1\13\1\uffff\1\13\4\uffff\1\13",
			"",
			"\1\u00e9",
			"\1\13\7\uffff\1\u00ba\1\13\1\uffff\1\13\4\uffff\1\13",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA124_eot = DFA.unpackEncodedString(DFA124_eotS);
	static final short[] DFA124_eof = DFA.unpackEncodedString(DFA124_eofS);
	static final char[] DFA124_min = DFA.unpackEncodedStringToUnsignedChars(DFA124_minS);
	static final char[] DFA124_max = DFA.unpackEncodedStringToUnsignedChars(DFA124_maxS);
	static final short[] DFA124_accept = DFA.unpackEncodedString(DFA124_acceptS);
	static final short[] DFA124_special = DFA.unpackEncodedString(DFA124_specialS);
	static final short[][] DFA124_transition;

	static {
		int numStates = DFA124_transitionS.length;
		DFA124_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA124_transition[i] = DFA.unpackEncodedString(DFA124_transitionS[i]);
		}
	}

	protected class DFA124 extends DFA {

		public DFA124(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 124;
			this.eot = DFA124_eot;
			this.eof = DFA124_eof;
			this.min = DFA124_min;
			this.max = DFA124_max;
			this.accept = DFA124_accept;
			this.special = DFA124_special;
			this.transition = DFA124_transition;
		}
		@Override
		public String getDescription() {
			return "694:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA124_92 = input.LA(1);
						 
						int index124_92 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_92);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA124_93 = input.LA(1);
						 
						int index124_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_93);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA124_94 = input.LA(1);
						 
						int index124_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_94);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA124_95 = input.LA(1);
						 
						int index124_95 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_95);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA124_96 = input.LA(1);
						 
						int index124_96 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_96);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA124_97 = input.LA(1);
						 
						int index124_97 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_97);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA124_98 = input.LA(1);
						 
						int index124_98 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_98);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA124_99 = input.LA(1);
						 
						int index124_99 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_99);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA124_100 = input.LA(1);
						 
						int index124_100 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_100);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA124_101 = input.LA(1);
						 
						int index124_101 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_101);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA124_102 = input.LA(1);
						 
						int index124_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_102);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA124_103 = input.LA(1);
						 
						int index124_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_103);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA124_104 = input.LA(1);
						 
						int index124_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_104);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA124_105 = input.LA(1);
						 
						int index124_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_105);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA124_106 = input.LA(1);
						 
						int index124_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_106);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA124_107 = input.LA(1);
						 
						int index124_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_107);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA124_108 = input.LA(1);
						 
						int index124_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_108);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA124_109 = input.LA(1);
						 
						int index124_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_109);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA124_110 = input.LA(1);
						 
						int index124_110 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_110);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA124_111 = input.LA(1);
						 
						int index124_111 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_111);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA124_112 = input.LA(1);
						 
						int index124_112 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_112);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA124_113 = input.LA(1);
						 
						int index124_113 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_113);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA124_114 = input.LA(1);
						 
						int index124_114 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_114);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA124_115 = input.LA(1);
						 
						int index124_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_115);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA124_116 = input.LA(1);
						 
						int index124_116 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_116);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA124_117 = input.LA(1);
						 
						int index124_117 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_117);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA124_118 = input.LA(1);
						 
						int index124_118 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_118);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA124_119 = input.LA(1);
						 
						int index124_119 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_119);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA124_120 = input.LA(1);
						 
						int index124_120 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_120);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA124_121 = input.LA(1);
						 
						int index124_121 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_121);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA124_122 = input.LA(1);
						 
						int index124_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_122);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA124_123 = input.LA(1);
						 
						int index124_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_123);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA124_126 = input.LA(1);
						 
						int index124_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_126);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA124_127 = input.LA(1);
						 
						int index124_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_127);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA124_128 = input.LA(1);
						 
						int index124_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_128);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA124_129 = input.LA(1);
						 
						int index124_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_129);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA124_130 = input.LA(1);
						 
						int index124_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_130);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA124_131 = input.LA(1);
						 
						int index124_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_131);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA124_132 = input.LA(1);
						 
						int index124_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_132);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA124_133 = input.LA(1);
						 
						int index124_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_133);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA124_134 = input.LA(1);
						 
						int index124_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_134);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA124_135 = input.LA(1);
						 
						int index124_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_135);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA124_153 = input.LA(1);
						 
						int index124_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_153);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA124_159 = input.LA(1);
						 
						int index124_159 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_159);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA124_191 = input.LA(1);
						 
						int index124_191 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_191);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA124_197 = input.LA(1);
						 
						int index124_197 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_197);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA124_203 = input.LA(1);
						 
						int index124_203 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_203);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA124_209 = input.LA(1);
						 
						int index124_209 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_209);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA124_215 = input.LA(1);
						 
						int index124_215 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_215);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA124_221 = input.LA(1);
						 
						int index124_221 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_221);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA124_227 = input.LA(1);
						 
						int index124_227 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_227);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA124_233 = input.LA(1);
						 
						int index124_233 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 186;}
						else if ( (true) ) {s = 11;}
						 
						input.seek(index124_233);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 124, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA147_eotS =
		"\16\uffff";
	static final String DFA147_eofS =
		"\16\uffff";
	static final String DFA147_minS =
		"\1\6\1\0\10\41\2\uffff\1\70\1\41";
	static final String DFA147_maxS =
		"\1\161\1\0\10\67\2\uffff\1\70\1\67";
	static final String DFA147_acceptS =
		"\12\uffff\1\2\1\1\2\uffff";
	static final String DFA147_specialS =
		"\1\uffff\1\0\14\uffff}>";
	static final String[] DFA147_transitionS = {
			"\2\12\4\uffff\1\12\1\uffff\1\12\1\1\5\uffff\2\12\2\uffff\1\12\6\uffff"+
			"\1\12\3\uffff\2\12\2\uffff\2\12\22\uffff\1\2\1\uffff\1\4\2\uffff\1\3"+
			"\4\uffff\1\11\2\uffff\1\12\2\uffff\1\10\5\uffff\1\6\1\uffff\1\7\1\uffff"+
			"\2\12\5\uffff\1\5\2\uffff\1\12\2\uffff\1\12\3\uffff\1\12\1\uffff\1\12"+
			"\7\uffff\1\12",
			"\1\uffff",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"\1\13\11\uffff\1\12\13\uffff\1\14",
			"",
			"",
			"\1\15",
			"\1\13\11\uffff\1\12\13\uffff\1\14"
	};

	static final short[] DFA147_eot = DFA.unpackEncodedString(DFA147_eotS);
	static final short[] DFA147_eof = DFA.unpackEncodedString(DFA147_eofS);
	static final char[] DFA147_min = DFA.unpackEncodedStringToUnsignedChars(DFA147_minS);
	static final char[] DFA147_max = DFA.unpackEncodedStringToUnsignedChars(DFA147_maxS);
	static final short[] DFA147_accept = DFA.unpackEncodedString(DFA147_acceptS);
	static final short[] DFA147_special = DFA.unpackEncodedString(DFA147_specialS);
	static final short[][] DFA147_transition;

	static {
		int numStates = DFA147_transitionS.length;
		DFA147_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA147_transition[i] = DFA.unpackEncodedString(DFA147_transitionS[i]);
		}
	}

	protected class DFA147 extends DFA {

		public DFA147(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 147;
			this.eot = DFA147_eot;
			this.eof = DFA147_eof;
			this.min = DFA147_min;
			this.max = DFA147_max;
			this.accept = DFA147_accept;
			this.special = DFA147_special;
			this.transition = DFA147_transition;
		}
		@Override
		public String getDescription() {
			return "855:12: ( type | expression )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA147_1 = input.LA(1);
						 
						int index147_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred234_BasForCCal()) ) {s = 11;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index147_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 147, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_annotations_in_compilationUnit55 = new BitSet(new long[]{0x0840000000000100L,0x00000000CF080404L});
	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit69 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit71 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit74 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_compilationUnit89 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit91 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit112 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit115 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit118 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_88_in_packageDeclaration142 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedName_in_packageDeclaration144 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_packageDeclaration146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_importDeclaration169 = new BitSet(new long[]{0x0000000000008000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_importDeclaration171 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedName_in_importDeclaration174 = new BitSet(new long[]{0x0001080000000000L});
	public static final BitSet FOLLOW_43_in_importDeclaration177 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_importDeclaration179 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_importDeclaration183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_typeDeclaration216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration239 = new BitSet(new long[]{0x0040000000000100L,0x0000000000080004L});
	public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers270 = new BitSet(new long[]{0x0840000000000002L,0x00000000CE000400L});
	public static final BitSet FOLLOW_annotation_in_classOrInterfaceModifier290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_classOrInterfaceModifier303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_classOrInterfaceModifier315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_classOrInterfaceModifier327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_classOrInterfaceModifier339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_classOrInterfaceModifier351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_classOrInterfaceModifier363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_classOrInterfaceModifier375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifiers396 = new BitSet(new long[]{0x0840000000000002L,0x00000444CE200400L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_classDeclaration416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_classDeclaration426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_normalClassDeclaration449 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_normalClassDeclaration451 = new BitSet(new long[]{0x0002000000000000L,0x0000100000008100L});
	public static final BitSet FOLLOW_typeParameters_in_normalClassDeclaration455 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008100L});
	public static final BitSet FOLLOW_72_in_normalClassDeclaration467 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_normalClassDeclaration471 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008000L});
	public static final BitSet FOLLOW_79_in_normalClassDeclaration484 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_normalClassDeclaration487 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_classBody_in_normalClassDeclaration500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_typeParameters531 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_typeParameter_in_typeParameters533 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_39_in_typeParameters536 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_typeParameter_in_typeParameters538 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_52_in_typeParameters542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_typeParameter561 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_typeParameter564 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeBound_in_typeParameter566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeBound595 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_typeBound598 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_typeBound600 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ENUM_in_enumDeclaration621 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_enumDeclaration623 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008000L});
	public static final BitSet FOLLOW_79_in_enumDeclaration626 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_enumDeclaration628 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_enumBody_in_enumDeclaration632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_enumBody651 = new BitSet(new long[]{0x0041008000008000L,0x0001000000000000L});
	public static final BitSet FOLLOW_enumConstants_in_enumBody653 = new BitSet(new long[]{0x0001008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_enumBody656 = new BitSet(new long[]{0x0001000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_enumBodyDeclarations_in_enumBody659 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_enumBody662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants681 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_enumConstants684 = new BitSet(new long[]{0x0040000000008000L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants686 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_annotations_in_enumConstant711 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_enumConstant714 = new BitSet(new long[]{0x0000000100000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_arguments_in_enumConstant716 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_classBody_in_enumConstant719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_enumBodyDeclarations743 = new BitSet(new long[]{0x5843000000008102L,0x00001644EE3C1446L});
	public static final BitSet FOLLOW_classBodyDeclaration_in_enumBodyDeclarations746 = new BitSet(new long[]{0x5843000000008102L,0x00001644EE3C1446L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_normalInterfaceDeclaration804 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_normalInterfaceDeclaration806 = new BitSet(new long[]{0x0002000000000000L,0x0000100000000100L});
	public static final BitSet FOLLOW_typeParameters_in_normalInterfaceDeclaration810 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000100L});
	public static final BitSet FOLLOW_72_in_normalInterfaceDeclaration814 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_normalInterfaceDeclaration816 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_normalInterfaceDeclaration820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeList843 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_typeList846 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_typeList848 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_108_in_classBody873 = new BitSet(new long[]{0x5843000000008100L,0x00011644EE3C1446L});
	public static final BitSet FOLLOW_classBodyDeclaration_in_classBody875 = new BitSet(new long[]{0x5843000000008100L,0x00011644EE3C1446L});
	public static final BitSet FOLLOW_112_in_classBody878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_interfaceBody902 = new BitSet(new long[]{0x5843000000008100L,0x00010644EE341446L});
	public static final BitSet FOLLOW_interfaceBodyDeclaration_in_interfaceBody904 = new BitSet(new long[]{0x5843000000008100L,0x00010644EE341446L});
	public static final BitSet FOLLOW_112_in_interfaceBody907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_classBodyDeclaration926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_classBodyDeclaration938 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_classBodyDeclaration941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_memberDecl977 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_genericMethodOrConstructorDecl_in_memberDecl979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberDeclaration_in_memberDecl989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_memberDecl1000 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_memberDecl1002 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_memberDecl1004 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDecl1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_memberDecl1018 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_memberDecl1020 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_constructorDeclaratorRest_in_memberDecl1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_memberDecl1042 = new BitSet(new long[]{0x0040000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_memberDecl1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_memberDecl1054 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000004L});
	public static final BitSet FOLLOW_classDeclaration_in_memberDecl1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_memberDeclaration1082 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_memberDeclaration1084 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_methodDeclaration_in_memberDeclaration1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_memberDeclaration1090 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_memberDeclaration1093 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1115 = new BitSet(new long[]{0x5000000000008000L,0x0000020020141042L});
	public static final BitSet FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_genericMethodOrConstructorRest1141 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_105_in_genericMethodOrConstructorRest1145 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1148 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1160 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_methodDeclaration1181 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_methodDeclaratorRest_in_methodDeclaration1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarators_in_fieldDeclaration1204 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_fieldDeclaration1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_interfaceBodyDeclaration1233 = new BitSet(new long[]{0x5002000000008100L,0x0000020020141046L});
	public static final BitSet FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_interfaceBodyDeclaration1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_interfaceMemberDecl1284 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMemberDecl1286 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMemberDecl1300 = new BitSet(new long[]{0x0040000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_interfaceMemberDecl1304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_interfaceMemberDecl1314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_interfaceMethodOrFieldDecl1338 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMethodOrFieldDecl1340 = new BitSet(new long[]{0x0084000100000000L});
	public static final BitSet FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest1367 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_interfaceMethodOrFieldRest1369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest1379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaratorRest1402 = new BitSet(new long[]{0x0081000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_55_in_methodDeclaratorRest1405 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_methodDeclaratorRest1407 = new BitSet(new long[]{0x0081000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_methodDeclaratorRest1420 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaratorRest1422 = new BitSet(new long[]{0x0001000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_methodBody_in_methodDeclaratorRest1438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_methodDeclaratorRest1452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest1485 = new BitSet(new long[]{0x0001000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_voidMethodDeclaratorRest1488 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1490 = new BitSet(new long[]{0x0001000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_voidMethodDeclaratorRest1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest1555 = new BitSet(new long[]{0x0081000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_55_in_interfaceMethodDeclaratorRest1558 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_interfaceMethodDeclaratorRest1560 = new BitSet(new long[]{0x0081000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_interfaceMethodDeclaratorRest1565 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest1567 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_interfaceMethodDeclaratorRest1571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameters_in_interfaceGenericMethodDecl1594 = new BitSet(new long[]{0x5000000000008000L,0x0000020020141042L});
	public static final BitSet FOLLOW_type_in_interfaceGenericMethodDecl1597 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_105_in_interfaceGenericMethodDecl1601 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceGenericMethodDecl1604 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl1616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest1641 = new BitSet(new long[]{0x0001000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_voidInterfaceMethodDeclaratorRest1644 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest1646 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_voidInterfaceMethodDeclaratorRest1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_constructorDeclaratorRest1675 = new BitSet(new long[]{0x0000000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_constructorDeclaratorRest1678 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1680 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_constructorBody_in_constructorDeclaratorRest1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantDeclarator1703 = new BitSet(new long[]{0x0084000000000000L});
	public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclarator1705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1729 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_variableDeclarators1732 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1736 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableDeclarator1758 = new BitSet(new long[]{0x0084000000000000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator1762 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_50_in_variableDeclarator1766 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1793 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_constantDeclaratorsRest1796 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_constantDeclarator_in_constantDeclaratorsRest1798 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_55_in_constantDeclaratorRest1821 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_constantDeclaratorRest1823 = new BitSet(new long[]{0x0084000000000000L});
	public static final BitSet FOLLOW_50_in_constantDeclaratorRest1827 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_constantDeclaratorRest1829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_variableDeclaratorId1853 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_variableDeclaratorId1855 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableInitializer1887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_arrayInitializer1914 = new BitSet(new long[]{0x500003310260D0C0L,0x0003128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1917 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_arrayInitializer1920 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1922 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_arrayInitializer1927 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_arrayInitializer1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_modifier1953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_modifier1963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_modifier1975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_modifier1987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_modifier1999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_modifier2011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_modifier2023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_modifier2035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_modifier2047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_modifier2059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_modifier2071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_modifier2083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_packageOrTypeName2104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_enumConstantName2123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_typeName2142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_type2156 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_type2159 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_type2161 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_type2168 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_type2171 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_type2173 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType2188 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2202 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_classOrInterfaceType2206 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType2208 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2210 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_60_in_primitiveType2231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_primitiveType2243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_primitiveType2255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_primitiveType2267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_primitiveType2279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_primitiveType2292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_primitiveType2304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_primitiveType2316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_variableModifier2337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableModifier2349 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_annotation_in_variableModifier2351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_typeArguments2371 = new BitSet(new long[]{0x5020000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments2373 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_39_in_typeArguments2376 = new BitSet(new long[]{0x5020000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments2378 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_52_in_typeArguments2382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeArgument2405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_typeArgument2415 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000100L});
	public static final BitSet FOLLOW_set_in_typeArgument2418 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_typeArgument2426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualifiedNameList2450 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList2452 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_qualifiedNameList2455 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList2457 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_32_in_formalParameters2480 = new BitSet(new long[]{0x5000000200008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters2482 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_formalParameters2485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_formalParameterDecls2512 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_formalParameterDecls2514 = new BitSet(new long[]{0x0000100000008000L});
	public static final BitSet FOLLOW_formalParameterDeclsRest_in_formalParameterDecls2516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_formalParameterDeclsRest2538 = new BitSet(new long[]{0x0080008000000000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2540 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_formalParameterDeclsRest2544 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDeclsRest2548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_formalParameterDeclsRest2562 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_methodBody2588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_constructorBody2607 = new BitSet(new long[]{0x784303310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody2609 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_blockStatement_in_constructorBody2612 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_112_in_constructorBody2615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2634 = new BitSet(new long[]{0x0000000000000000L,0x0000000900000000L});
	public static final BitSet FOLLOW_set_in_explicitConstructorInvocation2637 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation2645 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_explicitConstructorInvocation2647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_explicitConstructorInvocation2657 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_explicitConstructorInvocation2659 = new BitSet(new long[]{0x0002000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2661 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_explicitConstructorInvocation2664 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation2666 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_explicitConstructorInvocation2668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualifiedName2688 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_qualifiedName2691 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_qualifiedName2693 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_integerLiteral_in_literal2719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FloatingPointLiteral_in_literal2729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CharacterLiteral_in_literal2739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_literal2749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_literal2759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_literal2769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_annotations2858 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_annotation2878 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_annotationName_in_annotation2880 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_annotation2884 = new BitSet(new long[]{0x504003330260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValuePairs_in_annotation2888 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_elementValue_in_annotation2892 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_annotation2897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationName2921 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_annotationName2924 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_annotationName2926 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs2947 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_elementValuePairs2950 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs2952 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_Identifier_in_elementValuePair2974 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_elementValuePair2976 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValuePair2978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_elementValue3001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_elementValue3011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue3021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_elementValueArrayInitializer3044 = new BitSet(new long[]{0x504003B10260D0C0L,0x0003128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer3047 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_elementValueArrayInitializer3050 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer3052 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_elementValueArrayInitializer3059 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_elementValueArrayInitializer3063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_annotationTypeDeclaration3086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_annotationTypeDeclaration3088 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_annotationTypeDeclaration3090 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_annotationTypeBody_in_annotationTypeDeclaration3092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_annotationTypeBody3115 = new BitSet(new long[]{0x5840000000008100L,0x00010444EE3C1446L});
	public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody3118 = new BitSet(new long[]{0x5840000000008100L,0x00010444EE3C1446L});
	public static final BitSet FOLLOW_112_in_annotationTypeBody3122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_annotationTypeElementDeclaration3145 = new BitSet(new long[]{0x5040000000008100L,0x00000000201C1046L});
	public static final BitSet FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration3147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_annotationTypeElementRest3170 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest3172 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_annotationTypeElementRest3184 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest3197 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_annotationTypeElementRest3210 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest3223 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest3249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest3259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationMethodRest3282 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_annotationMethodRest3284 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_annotationMethodRest3286 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_defaultValue_in_annotationMethodRest3288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarators_in_annotationConstantRest3312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_defaultValue3335 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_defaultValue3337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_block3358 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_blockStatement_in_block3360 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_112_in_block3363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement3385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement3395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_blockStatement3405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement3434 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_localVariableDeclarationStatement3436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_localVariableDeclaration3455 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_localVariableDeclaration3457 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclarators_in_localVariableDeclaration3459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifier_in_variableModifiers3482 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_statement3500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSERT_in_statement3510 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3512 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_47_in_statement3515 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3517 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_statement3531 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3533 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3535 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_statement3545 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_statement3559 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_statement3561 = new BitSet(new long[]{0x500103310260D0C0L,0x0002028920D41642L});
	public static final BitSet FOLLOW_forControl_in_statement3563 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement3565 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_statement3577 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3579 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_statement3591 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3593 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_107_in_statement3595 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3597 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_statement3609 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000801L});
	public static final BitSet FOLLOW_catches_in_statement3623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_statement3625 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_statement3639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_statement3653 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_statement3675 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3677 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_statement3679 = new BitSet(new long[]{0x8000000000000000L,0x0001000000000010L});
	public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement3681 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_statement3683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_statement3693 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3695 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_statement3707 = new BitSet(new long[]{0x500103310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3709 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_statement3722 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3724 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_statement3736 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_Identifier_in_statement3738 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_statement3751 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_Identifier_in_statement3753 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_statement3766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statementExpression_in_statement3777 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement3789 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement3791 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catchClause_in_catches3816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_catchClause_in_catches3819 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_catchClause3844 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_catchClause3846 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameter_in_catchClause3848 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_catchClause3850 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_catchClause3852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_formalParameter3871 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_formalParameter3873 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameter3875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups3903 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup3930 = new BitSet(new long[]{0xF84103310260D1D2L,0x00021B9FFEDC767EL});
	public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup3933 = new BitSet(new long[]{0x784103310260D1D2L,0x00021B9FFEDC766EL});
	public static final BitSet FOLLOW_63_in_switchLabel3957 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_constantExpression_in_switchLabel3959 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel3961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_switchLabel3971 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_enumConstantName_in_switchLabel3973 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel3975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_switchLabel3985 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel3987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enhancedForControl_in_forControl4018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_forControl4028 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_forControl4031 = new BitSet(new long[]{0x500103310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_forControl4033 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_forControl4036 = new BitSet(new long[]{0x500003310260D0C2L,0x0002028920D41242L});
	public static final BitSet FOLLOW_forUpdate_in_forControl4038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_forInit4058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit4068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_enhancedForControl4091 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_enhancedForControl4093 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_enhancedForControl4095 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_enhancedForControl4097 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_enhancedForControl4099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forUpdate4118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_parExpression4139 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_parExpression4141 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_parExpression4143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList4166 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_expressionList4169 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_expressionList4171 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_expression_in_statementExpression4192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_constantExpression4215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_expression4238 = new BitSet(new long[]{0x0416444890000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_assignmentOperator_in_expression4241 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_expression4243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_assignmentOperator4278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_assignmentOperator4288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_assignmentOperator4298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_assignmentOperator4308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_assignmentOperator4318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_assignmentOperator4328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_assignmentOperator4338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignmentOperator4348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_assignmentOperator4369 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_assignmentOperator4373 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4411 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4415 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4419 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4454 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4458 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression4491 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_conditionalExpression4495 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression4497 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_conditionalExpression4499 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression4501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression4523 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_conditionalOrExpression4527 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression4529 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4551 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_conditionalAndExpression4555 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4557 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4579 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_inclusiveOrExpression4583 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4585 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression4607 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_exclusiveOrExpression4611 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression4613 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression4635 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_andExpression4639 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression4641 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression4663 = new BitSet(new long[]{0x0008000004000002L});
	public static final BitSet FOLLOW_set_in_equalityExpression4667 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression4675 = new BitSet(new long[]{0x0008000004000002L});
	public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression4697 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_instanceOfExpression4700 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_instanceOfExpression4702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4723 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_relationalOp_in_relationalExpression4727 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4729 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_49_in_relationalOp4764 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_relationalOp4768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_relationalOp4798 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_relationalOp4802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_relationalOp4823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_relationalOp4834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4854 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_shiftOp_in_shiftExpression4858 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4860 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_49_in_shiftOp4891 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_shiftOp4895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_shiftOp4927 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp4931 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp4935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_shiftOp4965 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp4969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4999 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression5003 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5011 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5033 = new BitSet(new long[]{0x0000200408000002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression5037 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5051 = new BitSet(new long[]{0x0000200408000002L});
	public static final BitSet FOLLOW_36_in_unaryExpression5077 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_unaryExpression5089 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_unaryExpression5101 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unaryExpression5113 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression5125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_unaryExpressionNotPlusMinus5144 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_unaryExpressionNotPlusMinus5156 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus5168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus5178 = new BitSet(new long[]{0x00800A2000000002L});
	public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus5180 = new BitSet(new long[]{0x00800A2000000002L});
	public static final BitSet FOLLOW_32_in_castExpression5206 = new BitSet(new long[]{0x5000000000000000L,0x0000000020141042L});
	public static final BitSet FOLLOW_primitiveType_in_castExpression5208 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_castExpression5210 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_castExpression5212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_castExpression5221 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_type_in_castExpression5224 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_expression_in_castExpression5228 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_castExpression5231 = new BitSet(new long[]{0x500000010260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression5233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parExpression_in_primary5252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_primary5262 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_43_in_primary5265 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_primary5267 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_primary5271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_primary5282 = new BitSet(new long[]{0x0000080100000000L});
	public static final BitSet FOLLOW_superSuffix_in_primary5284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primary5294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_primary5304 = new BitSet(new long[]{0x5002000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_creator_in_primary5306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primary5316 = new BitSet(new long[]{0x0080080100000000L});
	public static final BitSet FOLLOW_trying_in_primary5320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_primary5331 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_55_in_primary5334 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_primary5336 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_43_in_primary5340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_primary5342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_primary5352 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_primary5354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_primary5356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_trying5376 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_trying5378 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_trying5389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_identifierSuffix5411 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_identifierSuffix5413 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_identifierSuffix5419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_identifierSuffix5430 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_identifierSuffix5432 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_identifierSuffix5434 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix5447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_identifierSuffix5461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5471 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_explicitGenericInvocation_in_identifierSuffix5473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5483 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_identifierSuffix5485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5495 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_identifierSuffix5497 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix5499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_identifierSuffix5511 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_innerCreator_in_identifierSuffix5513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator5532 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_createdName_in_creator5534 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator5536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createdName_in_creator5546 = new BitSet(new long[]{0x0080000100000000L});
	public static final BitSet FOLLOW_arrayCreatorRest_in_creator5549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator5553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_createdName5573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_createdName5583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_innerCreator5606 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_innerCreator5608 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_classCreatorRest_in_innerCreator5610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5629 = new BitSet(new long[]{0x510003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5643 = new BitSet(new long[]{0x0080000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5646 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5648 = new BitSet(new long[]{0x0080000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest5652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayCreatorRest5666 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5668 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5671 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_arrayCreatorRest5673 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5675 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5680 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5682 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_arguments_in_classCreatorRest5713 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_classBody_in_classCreatorRest5715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation5739 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_explicitGenericInvocation5741 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitGenericInvocation5743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_nonWildcardTypeArguments5766 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments5768 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_nonWildcardTypeArguments5770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector5793 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_selector5795 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_arguments_in_selector5797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector5808 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_selector5810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector5820 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_selector5822 = new BitSet(new long[]{0x0000080100000000L});
	public static final BitSet FOLLOW_superSuffix_in_selector5824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector5834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_selector5836 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_innerCreator_in_selector5838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_selector5848 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_selector5850 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_selector5852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arguments_in_superSuffix5875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_superSuffix5885 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_superSuffix5887 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_arguments_in_superSuffix5892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_arguments5912 = new BitSet(new long[]{0x500003330260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expressionList_in_arguments5914 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_arguments5917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotations_in_synpred5_BasForCCal55 = new BitSet(new long[]{0x0840000000000100L,0x00000000CF080404L});
	public static final BitSet FOLLOW_packageDeclaration_in_synpred5_BasForCCal69 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_importDeclaration_in_synpred5_BasForCCal71 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred5_BasForCCal74 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred5_BasForCCal89 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred5_BasForCCal91 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_modifiers_in_synpred47_BasForCCal977 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_genericMethodOrConstructorDecl_in_synpred47_BasForCCal979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberDeclaration_in_synpred48_BasForCCal989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_synpred49_BasForCCal1000 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_synpred49_BasForCCal1002 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_synpred49_BasForCCal1004 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_synpred49_BasForCCal1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_synpred50_BasForCCal1018 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_synpred50_BasForCCal1020 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_constructorDeclaratorRest_in_synpred50_BasForCCal1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_synpred51_BasForCCal1042 = new BitSet(new long[]{0x0040000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_synpred51_BasForCCal1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_synpred52_BasForCCal1082 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_synpred52_BasForCCal1084 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_methodDeclaration_in_synpred52_BasForCCal1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred91_BasForCCal2159 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred91_BasForCCal2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred93_BasForCCal2171 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred93_BasForCCal2173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred113_BasForCCal2609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred117_BasForCCal2634 = new BitSet(new long[]{0x0000000000000000L,0x0000000900000000L});
	public static final BitSet FOLLOW_set_in_synpred117_BasForCCal2637 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_synpred117_BasForCCal2645 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_synpred117_BasForCCal2647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_synpred128_BasForCCal2858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_synpred151_BasForCCal3385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred152_BasForCCal3395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_synpred157_BasForCCal3545 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_synpred157_BasForCCal3547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred162_BasForCCal3623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_synpred162_BasForCCal3625 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_synpred162_BasForCCal3627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred163_BasForCCal3639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchLabel_in_synpred178_BasForCCal3930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_synpred180_BasForCCal3957 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_constantExpression_in_synpred180_BasForCCal3959 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred180_BasForCCal3961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_synpred181_BasForCCal3971 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_enumConstantName_in_synpred181_BasForCCal3973 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred181_BasForCCal3975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enhancedForControl_in_synpred182_BasForCCal4018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_synpred186_BasForCCal4058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred188_BasForCCal4241 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred188_BasForCCal4243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred198_BasForCCal4359 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred198_BasForCCal4361 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred198_BasForCCal4363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred199_BasForCCal4399 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred199_BasForCCal4401 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred199_BasForCCal4403 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred199_BasForCCal4405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred200_BasForCCal4444 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred200_BasForCCal4446 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred200_BasForCCal4448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred211_BasForCCal4756 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred211_BasForCCal4758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred212_BasForCCal4790 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred212_BasForCCal4792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred215_BasForCCal4883 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred215_BasForCCal4885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred216_BasForCCal4917 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred216_BasForCCal4919 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred216_BasForCCal4921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred217_BasForCCal4957 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred217_BasForCCal4959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_synpred229_BasForCCal5168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_synpred233_BasForCCal5206 = new BitSet(new long[]{0x5000000000000000L,0x0000000020141042L});
	public static final BitSet FOLLOW_primitiveType_in_synpred233_BasForCCal5208 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_synpred233_BasForCCal5210 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_synpred233_BasForCCal5212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred234_BasForCCal5224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_synpred236_BasForCCal5265 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_synpred236_BasForCCal5267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred237_BasForCCal5271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_synpred245_BasForCCal5376 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_synpred245_BasForCCal5378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred246_BasForCCal5389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred249_BasForCCal5430 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred249_BasForCCal5432 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred249_BasForCCal5434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred261_BasForCCal5671 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred261_BasForCCal5673 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred261_BasForCCal5675 = new BitSet(new long[]{0x0000000000000002L});
}
