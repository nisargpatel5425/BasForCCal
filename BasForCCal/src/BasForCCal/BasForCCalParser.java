// $ANTLR 3.5.1 C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g 2020-10-21 18:10:50

package BasForCCal;


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



	// $ANTLR start "compilationUnit"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:21:1: compilationUnit : ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* );
	public final void compilationUnit() throws RecognitionException {
		int compilationUnit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:22:5: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:22:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
					{
					pushFollow(FOLLOW_annotations_in_compilationUnit54);
					annotations();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
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
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
							{
							pushFollow(FOLLOW_packageDeclaration_in_compilationUnit68);
							packageDeclaration();
							state._fsp--;
							if (state.failed) return;
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:32: ( importDeclaration )*
							loop1:
							while (true) {
								int alt1=2;
								int LA1_0 = input.LA(1);
								if ( (LA1_0==80) ) {
									alt1=1;
								}

								switch (alt1) {
								case 1 :
									// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:32: importDeclaration
									{
									pushFollow(FOLLOW_importDeclaration_in_compilationUnit70);
									importDeclaration();
									state._fsp--;
									if (state.failed) return;
									}
									break;

								default :
									break loop1;
								}
							}

							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:51: ( typeDeclaration )*
							loop2:
							while (true) {
								int alt2=2;
								int LA2_0 = input.LA(1);
								if ( (LA2_0==ENUM||LA2_0==48||LA2_0==54||LA2_0==59||LA2_0==66||LA2_0==74||LA2_0==83||(LA2_0 >= 89 && LA2_0 <= 91)||(LA2_0 >= 94 && LA2_0 <= 95)) ) {
									alt2=1;
								}

								switch (alt2) {
								case 1 :
									// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:51: typeDeclaration
									{
									pushFollow(FOLLOW_typeDeclaration_in_compilationUnit73);
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
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:24:13: classOrInterfaceDeclaration ( typeDeclaration )*
							{
							pushFollow(FOLLOW_classOrInterfaceDeclaration_in_compilationUnit88);
							classOrInterfaceDeclaration();
							state._fsp--;
							if (state.failed) return;
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:24:41: ( typeDeclaration )*
							loop3:
							while (true) {
								int alt3=2;
								int LA3_0 = input.LA(1);
								if ( (LA3_0==ENUM||LA3_0==48||LA3_0==54||LA3_0==59||LA3_0==66||LA3_0==74||LA3_0==83||(LA3_0 >= 89 && LA3_0 <= 91)||(LA3_0 >= 94 && LA3_0 <= 95)) ) {
									alt3=1;
								}

								switch (alt3) {
								case 1 :
									// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:24:41: typeDeclaration
									{
									pushFollow(FOLLOW_typeDeclaration_in_compilationUnit90);
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:26:9: ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )*
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:26:9: ( packageDeclaration )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==88) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:26:9: packageDeclaration
							{
							pushFollow(FOLLOW_packageDeclaration_in_compilationUnit111);
							packageDeclaration();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:26:29: ( importDeclaration )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==80) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:26:29: importDeclaration
							{
							pushFollow(FOLLOW_importDeclaration_in_compilationUnit114);
							importDeclaration();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop6;
						}
					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:26:48: ( typeDeclaration )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ENUM||LA7_0==48||LA7_0==54||LA7_0==59||LA7_0==66||LA7_0==74||LA7_0==83||(LA7_0 >= 89 && LA7_0 <= 91)||(LA7_0 >= 94 && LA7_0 <= 95)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:26:48: typeDeclaration
							{
							pushFollow(FOLLOW_typeDeclaration_in_compilationUnit117);
							typeDeclaration();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop7;
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
			if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }

		}
	}
	// $ANTLR end "compilationUnit"



	// $ANTLR start "packageDeclaration"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:29:1: packageDeclaration : 'package' qualifiedName ';' ;
	public final void packageDeclaration() throws RecognitionException {
		int packageDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:30:5: ( 'package' qualifiedName ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:30:9: 'package' qualifiedName ';'
			{
			match(input,88,FOLLOW_88_in_packageDeclaration137); if (state.failed) return;
			pushFollow(FOLLOW_qualifiedName_in_packageDeclaration139);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			match(input,48,FOLLOW_48_in_packageDeclaration141); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:33:1: importDeclaration : 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';' ;
	public final void importDeclaration() throws RecognitionException {
		int importDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:34:5: ( 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:34:9: 'import' ( 'static' )? qualifiedName ( '.' '*' )? ';'
			{
			match(input,80,FOLLOW_80_in_importDeclaration164); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:34:18: ( 'static' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==94) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:34:18: 'static'
					{
					match(input,94,FOLLOW_94_in_importDeclaration166); if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_qualifiedName_in_importDeclaration169);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:34:42: ( '.' '*' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==43) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:34:43: '.' '*'
					{
					match(input,43,FOLLOW_43_in_importDeclaration172); if (state.failed) return;
					match(input,34,FOLLOW_34_in_importDeclaration174); if (state.failed) return;
					}
					break;

			}

			match(input,48,FOLLOW_48_in_importDeclaration178); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:37:1: typeDeclaration : ( classOrInterfaceDeclaration | ';' );
	public final void typeDeclaration() throws RecognitionException {
		int typeDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:38:5: ( classOrInterfaceDeclaration | ';' )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:38:9: classOrInterfaceDeclaration
					{
					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration201);
					classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:39:9: ';'
					{
					match(input,48,FOLLOW_48_in_typeDeclaration211); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:42:1: classOrInterfaceDeclaration : classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) ;
	public final void classOrInterfaceDeclaration() throws RecognitionException {
		int classOrInterfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:43:5: ( classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:43:9: classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration )
			{
			pushFollow(FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration234);
			classOrInterfaceModifiers();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:43:35: ( classDeclaration | interfaceDeclaration )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:43:36: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration237);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:43:55: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration241);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:46:1: classOrInterfaceModifiers : ( classOrInterfaceModifier )* ;
	public final void classOrInterfaceModifiers() throws RecognitionException {
		int classOrInterfaceModifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:47:5: ( ( classOrInterfaceModifier )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:47:9: ( classOrInterfaceModifier )*
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:47:9: ( classOrInterfaceModifier )*
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:47:9: classOrInterfaceModifier
					{
					pushFollow(FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers265);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:50:1: classOrInterfaceModifier : ( annotation | 'public' | 'protected' | 'private' | 'abstract' | 'static' | 'final' | 'strictfp' );
	public final void classOrInterfaceModifier() throws RecognitionException {
		int classOrInterfaceModifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:51:5: ( annotation | 'public' | 'protected' | 'private' | 'abstract' | 'static' | 'final' | 'strictfp' )
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
			case 59:
				{
				alt14=5;
				}
				break;
			case 94:
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:51:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_classOrInterfaceModifier285);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:52:9: 'public'
					{
					match(input,91,FOLLOW_91_in_classOrInterfaceModifier298); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:53:9: 'protected'
					{
					match(input,90,FOLLOW_90_in_classOrInterfaceModifier313); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:54:9: 'private'
					{
					match(input,89,FOLLOW_89_in_classOrInterfaceModifier326); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:55:9: 'abstract'
					{
					match(input,59,FOLLOW_59_in_classOrInterfaceModifier340); if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:56:9: 'static'
					{
					match(input,94,FOLLOW_94_in_classOrInterfaceModifier353); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:57:9: 'final'
					{
					match(input,74,FOLLOW_74_in_classOrInterfaceModifier368); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:58:9: 'strictfp'
					{
					match(input,95,FOLLOW_95_in_classOrInterfaceModifier384); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:61:1: modifiers : ( modifier )* ;
	public final void modifiers() throws RecognitionException {
		int modifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:62:5: ( ( modifier )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:62:9: ( modifier )*
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:62:9: ( modifier )*
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:62:9: modifier
					{
					pushFollow(FOLLOW_modifier_in_modifiers406);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:65:1: classDeclaration : ( normalClassDeclaration | enumDeclaration );
	public final void classDeclaration() throws RecognitionException {
		int classDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:66:5: ( normalClassDeclaration | enumDeclaration )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:66:9: normalClassDeclaration
					{
					pushFollow(FOLLOW_normalClassDeclaration_in_classDeclaration426);
					normalClassDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:67:9: enumDeclaration
					{
					pushFollow(FOLLOW_enumDeclaration_in_classDeclaration436);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:70:1: normalClassDeclaration : 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody ;
	public final void normalClassDeclaration() throws RecognitionException {
		int normalClassDeclaration_StartIndex = input.index();

		Token Identifier1=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:71:5: ( 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:71:9: 'class' Identifier ( typeParameters )? ( 'extends' type )? ( 'implements' typeList )? classBody
			{
			match(input,66,FOLLOW_66_in_normalClassDeclaration459); if (state.failed) return;
			Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_normalClassDeclaration461); if (state.failed) return;
			if ( state.backtracking==0 ) {System.out.println("Class:"+(Identifier1!=null?Identifier1.getText():null));}
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:71:77: ( typeParameters )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==49) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:71:77: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalClassDeclaration465);
					typeParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:72:9: ( 'extends' type )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==72) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:72:10: 'extends' type
					{
					match(input,72,FOLLOW_72_in_normalClassDeclaration477); if (state.failed) return;
					if ( state.backtracking==0 ) {isExtends=true;}
					pushFollow(FOLLOW_type_in_normalClassDeclaration480);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:73:9: ( 'implements' typeList )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==79) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:73:10: 'implements' typeList
					{
					match(input,79,FOLLOW_79_in_normalClassDeclaration493); if (state.failed) return;
					if ( state.backtracking==0 ) {isImp= true;}
					pushFollow(FOLLOW_typeList_in_normalClassDeclaration496);
					typeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_classBody_in_normalClassDeclaration508);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:77:1: typeParameters : '<' typeParameter ( ',' typeParameter )* '>' ;
	public final void typeParameters() throws RecognitionException {
		int typeParameters_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:78:5: ( '<' typeParameter ( ',' typeParameter )* '>' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:78:9: '<' typeParameter ( ',' typeParameter )* '>'
			{
			match(input,49,FOLLOW_49_in_typeParameters531); if (state.failed) return;
			pushFollow(FOLLOW_typeParameter_in_typeParameters533);
			typeParameter();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:78:27: ( ',' typeParameter )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==39) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:78:28: ',' typeParameter
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:81:1: typeParameter : Identifier ( 'extends' typeBound )? ;
	public final void typeParameter() throws RecognitionException {
		int typeParameter_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:82:5: ( Identifier ( 'extends' typeBound )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:82:9: Identifier ( 'extends' typeBound )?
			{
			match(input,Identifier,FOLLOW_Identifier_in_typeParameter561); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:82:20: ( 'extends' typeBound )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==72) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:82:21: 'extends' typeBound
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:85:1: typeBound : type ( '&' type )* ;
	public final void typeBound() throws RecognitionException {
		int typeBound_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:86:5: ( type ( '&' type )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:86:9: type ( '&' type )*
			{
			pushFollow(FOLLOW_type_in_typeBound595);
			type();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:86:14: ( '&' type )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==30) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:86:15: '&' type
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:89:1: enumDeclaration : ENUM Identifier ( 'implements' typeList )? enumBody ;
	public final void enumDeclaration() throws RecognitionException {
		int enumDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:90:5: ( ENUM Identifier ( 'implements' typeList )? enumBody )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:90:9: ENUM Identifier ( 'implements' typeList )? enumBody
			{
			match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration621); if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_enumDeclaration623); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:90:25: ( 'implements' typeList )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==79) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:90:26: 'implements' typeList
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:93:1: enumBody : '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' ;
	public final void enumBody() throws RecognitionException {
		int enumBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:94:5: ( '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:94:9: '{' ( enumConstants )? ( ',' )? ( enumBodyDeclarations )? '}'
			{
			match(input,108,FOLLOW_108_in_enumBody651); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:94:13: ( enumConstants )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==Identifier||LA24_0==54) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:94:13: enumConstants
					{
					pushFollow(FOLLOW_enumConstants_in_enumBody653);
					enumConstants();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:94:28: ( ',' )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==39) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:94:28: ','
					{
					match(input,39,FOLLOW_39_in_enumBody656); if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:94:33: ( enumBodyDeclarations )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==48) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:94:33: enumBodyDeclarations
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:97:1: enumConstants : enumConstant ( ',' enumConstant )* ;
	public final void enumConstants() throws RecognitionException {
		int enumConstants_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:98:5: ( enumConstant ( ',' enumConstant )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:98:9: enumConstant ( ',' enumConstant )*
			{
			pushFollow(FOLLOW_enumConstant_in_enumConstants681);
			enumConstant();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:98:22: ( ',' enumConstant )*
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:98:23: ',' enumConstant
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:101:1: enumConstant : ( annotations )? Identifier ( arguments )? ( classBody )? ;
	public final void enumConstant() throws RecognitionException {
		int enumConstant_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:102:5: ( ( annotations )? Identifier ( arguments )? ( classBody )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:102:9: ( annotations )? Identifier ( arguments )? ( classBody )?
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:102:9: ( annotations )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==54) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:102:9: annotations
					{
					pushFollow(FOLLOW_annotations_in_enumConstant711);
					annotations();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,Identifier,FOLLOW_Identifier_in_enumConstant714); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:102:33: ( arguments )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==32) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:102:33: arguments
					{
					pushFollow(FOLLOW_arguments_in_enumConstant716);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:102:44: ( classBody )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==108) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:102:44: classBody
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:105:1: enumBodyDeclarations : ';' ( classBodyDeclaration )* ;
	public final void enumBodyDeclarations() throws RecognitionException {
		int enumBodyDeclarations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:106:5: ( ';' ( classBodyDeclaration )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:106:9: ';' ( classBodyDeclaration )*
			{
			match(input,48,FOLLOW_48_in_enumBodyDeclarations743); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:106:13: ( classBodyDeclaration )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==ENUM||LA31_0==Identifier||(LA31_0 >= 48 && LA31_0 <= 49)||LA31_0==54||(LA31_0 >= 59 && LA31_0 <= 60)||LA31_0==62||(LA31_0 >= 65 && LA31_0 <= 66)||LA31_0==70||LA31_0==74||LA31_0==76||(LA31_0 >= 82 && LA31_0 <= 85)||(LA31_0 >= 89 && LA31_0 <= 91)||(LA31_0 >= 93 && LA31_0 <= 95)||LA31_0==98||LA31_0==102||(LA31_0 >= 105 && LA31_0 <= 106)||LA31_0==108) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:106:14: classBodyDeclaration
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:109:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );
	public final void interfaceDeclaration() throws RecognitionException {
		int interfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:110:5: ( normalInterfaceDeclaration | annotationTypeDeclaration )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:110:9: normalInterfaceDeclaration
					{
					pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration771);
					normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:111:9: annotationTypeDeclaration
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:114:1: normalInterfaceDeclaration : 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody ;
	public final void normalInterfaceDeclaration() throws RecognitionException {
		int normalInterfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:115:5: ( 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:115:9: 'interface' Identifier ( typeParameters )? ( 'extends' typeList )? interfaceBody
			{
			match(input,83,FOLLOW_83_in_normalInterfaceDeclaration804); if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_normalInterfaceDeclaration806); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:115:32: ( typeParameters )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==49) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:115:32: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalInterfaceDeclaration808);
					typeParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:115:48: ( 'extends' typeList )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==72) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:115:49: 'extends' typeList
					{
					match(input,72,FOLLOW_72_in_normalInterfaceDeclaration812); if (state.failed) return;
					pushFollow(FOLLOW_typeList_in_normalInterfaceDeclaration814);
					typeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_interfaceBody_in_normalInterfaceDeclaration818);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:118:1: typeList : type ( ',' type )* ;
	public final void typeList() throws RecognitionException {
		int typeList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:119:5: ( type ( ',' type )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:119:9: type ( ',' type )*
			{
			pushFollow(FOLLOW_type_in_typeList841);
			type();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:119:14: ( ',' type )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==39) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:119:15: ',' type
					{
					match(input,39,FOLLOW_39_in_typeList844); if (state.failed) return;
					pushFollow(FOLLOW_type_in_typeList846);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:122:1: classBody : '{' ( classBodyDeclaration )* '}' ;
	public final void classBody() throws RecognitionException {
		int classBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:123:5: ( '{' ( classBodyDeclaration )* '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:123:9: '{' ( classBodyDeclaration )* '}'
			{
			match(input,108,FOLLOW_108_in_classBody871); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:123:13: ( classBodyDeclaration )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==ENUM||LA36_0==Identifier||(LA36_0 >= 48 && LA36_0 <= 49)||LA36_0==54||(LA36_0 >= 59 && LA36_0 <= 60)||LA36_0==62||(LA36_0 >= 65 && LA36_0 <= 66)||LA36_0==70||LA36_0==74||LA36_0==76||(LA36_0 >= 82 && LA36_0 <= 85)||(LA36_0 >= 89 && LA36_0 <= 91)||(LA36_0 >= 93 && LA36_0 <= 95)||LA36_0==98||LA36_0==102||(LA36_0 >= 105 && LA36_0 <= 106)||LA36_0==108) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:123:13: classBodyDeclaration
					{
					pushFollow(FOLLOW_classBodyDeclaration_in_classBody873);
					classBodyDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop36;
				}
			}

			match(input,112,FOLLOW_112_in_classBody876); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:126:1: interfaceBody : '{' ( interfaceBodyDeclaration )* '}' ;
	public final void interfaceBody() throws RecognitionException {
		int interfaceBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:127:5: ( '{' ( interfaceBodyDeclaration )* '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:127:9: '{' ( interfaceBodyDeclaration )* '}'
			{
			match(input,108,FOLLOW_108_in_interfaceBody899); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:127:13: ( interfaceBodyDeclaration )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==ENUM||LA37_0==Identifier||(LA37_0 >= 48 && LA37_0 <= 49)||LA37_0==54||(LA37_0 >= 59 && LA37_0 <= 60)||LA37_0==62||(LA37_0 >= 65 && LA37_0 <= 66)||LA37_0==70||LA37_0==74||LA37_0==76||(LA37_0 >= 82 && LA37_0 <= 85)||(LA37_0 >= 89 && LA37_0 <= 91)||(LA37_0 >= 93 && LA37_0 <= 95)||LA37_0==98||LA37_0==102||(LA37_0 >= 105 && LA37_0 <= 106)) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:127:13: interfaceBodyDeclaration
					{
					pushFollow(FOLLOW_interfaceBodyDeclaration_in_interfaceBody901);
					interfaceBodyDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop37;
				}
			}

			match(input,112,FOLLOW_112_in_interfaceBody904); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:130:1: classBodyDeclaration : ( ';' | ( 'static' )? block | modifiers memberDecl );
	public final void classBodyDeclaration() throws RecognitionException {
		int classBodyDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:131:5: ( ';' | ( 'static' )? block | modifiers memberDecl )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:131:9: ';'
					{
					match(input,48,FOLLOW_48_in_classBodyDeclaration923); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:132:9: ( 'static' )? block
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:132:9: ( 'static' )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==94) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:132:9: 'static'
							{
							match(input,94,FOLLOW_94_in_classBodyDeclaration933); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_block_in_classBodyDeclaration936);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:133:9: modifiers memberDecl
					{
					pushFollow(FOLLOW_modifiers_in_classBodyDeclaration946);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration948);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:136:1: memberDecl : ( genericMethodOrConstructorDecl | memberDeclaration | 'void' Identifier voidMethodDeclaratorRest | Identifier constructorDeclaratorRest | interfaceDeclaration | classDeclaration );
	public final void memberDecl() throws RecognitionException {
		int memberDecl_StartIndex = input.index();

		Token Identifier2=null;
		Token Identifier3=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:137:5: ( genericMethodOrConstructorDecl | memberDeclaration | 'void' Identifier voidMethodDeclaratorRest | Identifier constructorDeclaratorRest | interfaceDeclaration | classDeclaration )
			int alt40=6;
			switch ( input.LA(1) ) {
			case 49:
				{
				alt40=1;
				}
				break;
			case Identifier:
				{
				int LA40_2 = input.LA(2);
				if ( (LA40_2==Identifier||LA40_2==43||LA40_2==49||LA40_2==55) ) {
					alt40=2;
				}
				else if ( (LA40_2==32) ) {
					alt40=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 2, input);
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
			case 54:
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:137:9: genericMethodOrConstructorDecl
					{
					pushFollow(FOLLOW_genericMethodOrConstructorDecl_in_memberDecl971);
					genericMethodOrConstructorDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:138:9: memberDeclaration
					{
					pushFollow(FOLLOW_memberDeclaration_in_memberDecl981);
					memberDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:139:9: 'void' Identifier voidMethodDeclaratorRest
					{
					match(input,105,FOLLOW_105_in_memberDecl991); if (state.failed) return;
					Identifier2=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl993); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.println("  "+(Identifier2!=null?Identifier2.getText():null));}
					pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDecl997);
					voidMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:140:9: Identifier constructorDeclaratorRest
					{
					Identifier3=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl1007); if (state.failed) return;
					if ( state.backtracking==0 ) {System.out.println("  "+(Identifier3!=null?Identifier3.getText():null));}
					pushFollow(FOLLOW_constructorDeclaratorRest_in_memberDecl1011);
					constructorDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:141:9: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_memberDecl1021);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:142:9: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_memberDecl1031);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:145:1: memberDeclaration : type ( methodDeclaration | fieldDeclaration ) ;
	public final void memberDeclaration() throws RecognitionException {
		int memberDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:146:5: ( type ( methodDeclaration | fieldDeclaration ) )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:146:9: type ( methodDeclaration | fieldDeclaration )
			{
			pushFollow(FOLLOW_type_in_memberDeclaration1054);
			type();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:146:14: ( methodDeclaration | fieldDeclaration )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==Identifier) ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1==32) ) {
					alt41=1;
				}
				else if ( (LA41_1==39||LA41_1==48||LA41_1==50||LA41_1==55) ) {
					alt41=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:146:15: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration1057);
					methodDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:146:35: fieldDeclaration
					{
					pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration1061);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:149:1: genericMethodOrConstructorDecl : typeParameters genericMethodOrConstructorRest ;
	public final void genericMethodOrConstructorDecl() throws RecognitionException {
		int genericMethodOrConstructorDecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:150:5: ( typeParameters genericMethodOrConstructorRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:150:9: typeParameters genericMethodOrConstructorRest
			{
			pushFollow(FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1081);
			typeParameters();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1083);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:153:1: genericMethodOrConstructorRest : ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest );
	public final void genericMethodOrConstructorRest() throws RecognitionException {
		int genericMethodOrConstructorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:154:5: ( ( type | 'void' ) Identifier methodDeclaratorRest | Identifier constructorDeclaratorRest )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:154:9: ( type | 'void' ) Identifier methodDeclaratorRest
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:154:9: ( type | 'void' )
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
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:154:10: type
							{
							pushFollow(FOLLOW_type_in_genericMethodOrConstructorRest1107);
							type();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:154:17: 'void'
							{
							match(input,105,FOLLOW_105_in_genericMethodOrConstructorRest1111); if (state.failed) return;
							}
							break;

					}

					match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1114); if (state.failed) return;
					pushFollow(FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1116);
					methodDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:155:9: Identifier constructorDeclaratorRest
					{
					match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1126); if (state.failed) return;
					pushFollow(FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1128);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:158:1: methodDeclaration : Identifier methodDeclaratorRest ;
	public final void methodDeclaration() throws RecognitionException {
		int methodDeclaration_StartIndex = input.index();

		Token Identifier4=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:159:5: ( Identifier methodDeclaratorRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:159:9: Identifier methodDeclaratorRest
			{
			Identifier4=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1147); if (state.failed) return;
			if ( state.backtracking==0 ) {System.out.println("  "+(Identifier4!=null?Identifier4.getText():null));}
			pushFollow(FOLLOW_methodDeclaratorRest_in_methodDeclaration1151);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:162:1: fieldDeclaration : variableDeclarators ';' ;
	public final void fieldDeclaration() throws RecognitionException {
		int fieldDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:163:5: ( variableDeclarators ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:163:9: variableDeclarators ';'
			{
			pushFollow(FOLLOW_variableDeclarators_in_fieldDeclaration1170);
			variableDeclarators();
			state._fsp--;
			if (state.failed) return;
			match(input,48,FOLLOW_48_in_fieldDeclaration1172); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:166:1: interfaceBodyDeclaration : ( modifiers interfaceMemberDecl | ';' );
	public final void interfaceBodyDeclaration() throws RecognitionException {
		int interfaceBodyDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:167:5: ( modifiers interfaceMemberDecl | ';' )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:167:9: modifiers interfaceMemberDecl
					{
					pushFollow(FOLLOW_modifiers_in_interfaceBodyDeclaration1199);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1201);
					interfaceMemberDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:168:9: ';'
					{
					match(input,48,FOLLOW_48_in_interfaceBodyDeclaration1211); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:171:1: interfaceMemberDecl : ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration );
	public final void interfaceMemberDecl() throws RecognitionException {
		int interfaceMemberDecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:172:5: ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl | 'void' Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration )
			int alt45=5;
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
			case 54:
			case 83:
				{
				alt45=4;
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:172:9: interfaceMethodOrFieldDecl
					{
					pushFollow(FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1230);
					interfaceMethodOrFieldDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:173:9: interfaceGenericMethodDecl
					{
					pushFollow(FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1240);
					interfaceGenericMethodDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:174:9: 'void' Identifier voidInterfaceMethodDeclaratorRest
					{
					match(input,105,FOLLOW_105_in_interfaceMemberDecl1250); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_interfaceMemberDecl1252); if (state.failed) return;
					pushFollow(FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1254);
					voidInterfaceMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:175:9: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_interfaceMemberDecl1264);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:176:9: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_interfaceMemberDecl1274);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:179:1: interfaceMethodOrFieldDecl : type Identifier interfaceMethodOrFieldRest ;
	public final void interfaceMethodOrFieldDecl() throws RecognitionException {
		int interfaceMethodOrFieldDecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:180:5: ( type Identifier interfaceMethodOrFieldRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:180:9: type Identifier interfaceMethodOrFieldRest
			{
			pushFollow(FOLLOW_type_in_interfaceMethodOrFieldDecl1297);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodOrFieldDecl1299); if (state.failed) return;
			pushFollow(FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl1301);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:183:1: interfaceMethodOrFieldRest : ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest );
	public final void interfaceMethodOrFieldRest() throws RecognitionException {
		int interfaceMethodOrFieldRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:184:5: ( constantDeclaratorsRest ';' | interfaceMethodDeclaratorRest )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:184:9: constantDeclaratorsRest ';'
					{
					pushFollow(FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest1324);
					constantDeclaratorsRest();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_interfaceMethodOrFieldRest1326); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:185:9: interfaceMethodDeclaratorRest
					{
					pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest1336);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:188:1: methodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
	public final void methodDeclaratorRest() throws RecognitionException {
		int methodDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:189:5: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:189:9: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ( methodBody | ';' )
			{
			pushFollow(FOLLOW_formalParameters_in_methodDeclaratorRest1359);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:189:26: ( '[' ']' )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==55) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:189:27: '[' ']'
					{
					match(input,55,FOLLOW_55_in_methodDeclaratorRest1362); if (state.failed) return;
					match(input,56,FOLLOW_56_in_methodDeclaratorRest1364); if (state.failed) return;
					}
					break;

				default :
					break loop47;
				}
			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:190:9: ( 'throws' qualifiedNameList )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==101) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:190:10: 'throws' qualifiedNameList
					{
					match(input,101,FOLLOW_101_in_methodDeclaratorRest1377); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaratorRest1379);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:191:9: ( methodBody | ';' )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:191:13: methodBody
					{
					pushFollow(FOLLOW_methodBody_in_methodDeclaratorRest1395);
					methodBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:192:13: ';'
					{
					match(input,48,FOLLOW_48_in_methodDeclaratorRest1409); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:196:1: voidMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) ;
	public final void voidMethodDeclaratorRest() throws RecognitionException {
		int voidMethodDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:197:5: ( formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' ) )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:197:9: formalParameters ( 'throws' qualifiedNameList )? ( methodBody | ';' )
			{
			pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest1442);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:197:26: ( 'throws' qualifiedNameList )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==101) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:197:27: 'throws' qualifiedNameList
					{
					match(input,101,FOLLOW_101_in_voidMethodDeclaratorRest1445); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1447);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:198:9: ( methodBody | ';' )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:198:13: methodBody
					{
					pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest1463);
					methodBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:199:13: ';'
					{
					match(input,48,FOLLOW_48_in_voidMethodDeclaratorRest1477); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:203:1: interfaceMethodDeclaratorRest : formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' ;
	public final void interfaceMethodDeclaratorRest() throws RecognitionException {
		int interfaceMethodDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:204:5: ( formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:204:9: formalParameters ( '[' ']' )* ( 'throws' qualifiedNameList )? ';'
			{
			pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest1510);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:204:26: ( '[' ']' )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==55) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:204:27: '[' ']'
					{
					match(input,55,FOLLOW_55_in_interfaceMethodDeclaratorRest1513); if (state.failed) return;
					match(input,56,FOLLOW_56_in_interfaceMethodDeclaratorRest1515); if (state.failed) return;
					}
					break;

				default :
					break loop52;
				}
			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:204:37: ( 'throws' qualifiedNameList )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==101) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:204:38: 'throws' qualifiedNameList
					{
					match(input,101,FOLLOW_101_in_interfaceMethodDeclaratorRest1520); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest1522);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,48,FOLLOW_48_in_interfaceMethodDeclaratorRest1526); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:207:1: interfaceGenericMethodDecl : typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest ;
	public final void interfaceGenericMethodDecl() throws RecognitionException {
		int interfaceGenericMethodDecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:208:5: ( typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:208:9: typeParameters ( type | 'void' ) Identifier interfaceMethodDeclaratorRest
			{
			pushFollow(FOLLOW_typeParameters_in_interfaceGenericMethodDecl1549);
			typeParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:208:24: ( type | 'void' )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:208:25: type
					{
					pushFollow(FOLLOW_type_in_interfaceGenericMethodDecl1552);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:208:32: 'void'
					{
					match(input,105,FOLLOW_105_in_interfaceGenericMethodDecl1556); if (state.failed) return;
					}
					break;

			}

			match(input,Identifier,FOLLOW_Identifier_in_interfaceGenericMethodDecl1559); if (state.failed) return;
			pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl1569);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:212:1: voidInterfaceMethodDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? ';' ;
	public final void voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		int voidInterfaceMethodDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:213:5: ( formalParameters ( 'throws' qualifiedNameList )? ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:213:9: formalParameters ( 'throws' qualifiedNameList )? ';'
			{
			pushFollow(FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest1592);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:213:26: ( 'throws' qualifiedNameList )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==101) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:213:27: 'throws' qualifiedNameList
					{
					match(input,101,FOLLOW_101_in_voidInterfaceMethodDeclaratorRest1595); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest1597);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,48,FOLLOW_48_in_voidInterfaceMethodDeclaratorRest1601); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:216:1: constructorDeclaratorRest : formalParameters ( 'throws' qualifiedNameList )? constructorBody ;
	public final void constructorDeclaratorRest() throws RecognitionException {
		int constructorDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:217:5: ( formalParameters ( 'throws' qualifiedNameList )? constructorBody )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:217:9: formalParameters ( 'throws' qualifiedNameList )? constructorBody
			{
			pushFollow(FOLLOW_formalParameters_in_constructorDeclaratorRest1624);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:217:26: ( 'throws' qualifiedNameList )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==101) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:217:27: 'throws' qualifiedNameList
					{
					match(input,101,FOLLOW_101_in_constructorDeclaratorRest1627); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1629);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_constructorBody_in_constructorDeclaratorRest1633);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:220:1: constantDeclarator : Identifier constantDeclaratorRest ;
	public final void constantDeclarator() throws RecognitionException {
		int constantDeclarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:221:5: ( Identifier constantDeclaratorRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:221:9: Identifier constantDeclaratorRest
			{
			match(input,Identifier,FOLLOW_Identifier_in_constantDeclarator1652); if (state.failed) return;
			pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclarator1654);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:224:1: variableDeclarators : variableDeclarator ( ',' variableDeclarator )* ;
	public final void variableDeclarators() throws RecognitionException {
		int variableDeclarators_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:225:5: ( variableDeclarator ( ',' variableDeclarator )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:225:9: variableDeclarator ( ',' variableDeclarator )*
			{
			pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1677);
			variableDeclarator();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:225:28: ( ',' variableDeclarator )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==39) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:225:29: ',' variableDeclarator
					{
					match(input,39,FOLLOW_39_in_variableDeclarators1680); if (state.failed) return;
					pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators1682);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:228:1: variableDeclarator : variableDeclaratorId ( '=' variableInitializer )? ;
	public final void variableDeclarator() throws RecognitionException {
		int variableDeclarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:229:5: ( variableDeclaratorId ( '=' variableInitializer )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:229:9: variableDeclaratorId ( '=' variableInitializer )?
			{
			pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator1703);
			variableDeclaratorId();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:229:30: ( '=' variableInitializer )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==50) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:229:31: '=' variableInitializer
					{
					match(input,50,FOLLOW_50_in_variableDeclarator1706); if (state.failed) return;
					pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1708);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:232:1: constantDeclaratorsRest : constantDeclaratorRest ( ',' constantDeclarator )* ;
	public final void constantDeclaratorsRest() throws RecognitionException {
		int constantDeclaratorsRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:233:5: ( constantDeclaratorRest ( ',' constantDeclarator )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:233:9: constantDeclaratorRest ( ',' constantDeclarator )*
			{
			pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1733);
			constantDeclaratorRest();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:233:32: ( ',' constantDeclarator )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==39) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:233:33: ',' constantDeclarator
					{
					match(input,39,FOLLOW_39_in_constantDeclaratorsRest1736); if (state.failed) return;
					pushFollow(FOLLOW_constantDeclarator_in_constantDeclaratorsRest1738);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:236:1: constantDeclaratorRest : ( '[' ']' )* '=' variableInitializer ;
	public final void constantDeclaratorRest() throws RecognitionException {
		int constantDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:237:5: ( ( '[' ']' )* '=' variableInitializer )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:237:9: ( '[' ']' )* '=' variableInitializer
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:237:9: ( '[' ']' )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==55) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:237:10: '[' ']'
					{
					match(input,55,FOLLOW_55_in_constantDeclaratorRest1760); if (state.failed) return;
					match(input,56,FOLLOW_56_in_constantDeclaratorRest1762); if (state.failed) return;
					}
					break;

				default :
					break loop60;
				}
			}

			match(input,50,FOLLOW_50_in_constantDeclaratorRest1766); if (state.failed) return;
			pushFollow(FOLLOW_variableInitializer_in_constantDeclaratorRest1768);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:240:1: variableDeclaratorId : Identifier ( '[' ']' )* ;
	public final void variableDeclaratorId() throws RecognitionException {
		int variableDeclaratorId_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:241:5: ( Identifier ( '[' ']' )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:241:9: Identifier ( '[' ']' )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_variableDeclaratorId1791); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:241:20: ( '[' ']' )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==55) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:241:21: '[' ']'
					{
					match(input,55,FOLLOW_55_in_variableDeclaratorId1794); if (state.failed) return;
					match(input,56,FOLLOW_56_in_variableDeclaratorId1796); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:244:1: variableInitializer : ( arrayInitializer | expression );
	public final void variableInitializer() throws RecognitionException {
		int variableInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:245:5: ( arrayInitializer | expression )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:245:9: arrayInitializer
					{
					pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1817);
					arrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:246:9: expression
					{
					pushFollow(FOLLOW_expression_in_variableInitializer1827);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:249:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' ;
	public final void arrayInitializer() throws RecognitionException {
		int arrayInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:5: ( '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:9: '{' ( variableInitializer ( ',' variableInitializer )* ( ',' )? )? '}'
			{
			match(input,108,FOLLOW_108_in_arrayInitializer1854); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:13: ( variableInitializer ( ',' variableInitializer )* ( ',' )? )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( ((LA65_0 >= CharacterLiteral && LA65_0 <= DecimalLiteral)||LA65_0==FloatingPointLiteral||(LA65_0 >= HexLiteral && LA65_0 <= Identifier)||(LA65_0 >= OctalLiteral && LA65_0 <= StringLiteral)||LA65_0==25||LA65_0==32||(LA65_0 >= 36 && LA65_0 <= 37)||(LA65_0 >= 40 && LA65_0 <= 41)||LA65_0==60||LA65_0==62||LA65_0==65||LA65_0==70||LA65_0==73||LA65_0==76||LA65_0==82||LA65_0==84||(LA65_0 >= 86 && LA65_0 <= 87)||LA65_0==93||LA65_0==96||LA65_0==99||LA65_0==103||LA65_0==105||LA65_0==108||LA65_0==113) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:14: variableInitializer ( ',' variableInitializer )* ( ',' )?
					{
					pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1857);
					variableInitializer();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:34: ( ',' variableInitializer )*
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
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:35: ',' variableInitializer
							{
							match(input,39,FOLLOW_39_in_arrayInitializer1860); if (state.failed) return;
							pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1862);
							variableInitializer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop63;
						}
					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:61: ( ',' )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==39) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:250:62: ','
							{
							match(input,39,FOLLOW_39_in_arrayInitializer1867); if (state.failed) return;
							}
							break;

					}

					}
					break;

			}

			match(input,112,FOLLOW_112_in_arrayInitializer1874); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:253:1: modifier : ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' );
	public final void modifier() throws RecognitionException {
		int modifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:254:5: ( annotation | 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:254:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_modifier1893);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:255:9: 'public'
					{
					match(input,91,FOLLOW_91_in_modifier1903); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:256:9: 'protected'
					{
					match(input,90,FOLLOW_90_in_modifier1913); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:257:9: 'private'
					{
					match(input,89,FOLLOW_89_in_modifier1923); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:258:9: 'static'
					{
					match(input,94,FOLLOW_94_in_modifier1933); if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:259:9: 'abstract'
					{
					match(input,59,FOLLOW_59_in_modifier1943); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:260:9: 'final'
					{
					match(input,74,FOLLOW_74_in_modifier1953); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:261:9: 'native'
					{
					match(input,85,FOLLOW_85_in_modifier1963); if (state.failed) return;
					}
					break;
				case 9 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:262:9: 'synchronized'
					{
					match(input,98,FOLLOW_98_in_modifier1973); if (state.failed) return;
					}
					break;
				case 10 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:263:9: 'transient'
					{
					match(input,102,FOLLOW_102_in_modifier1983); if (state.failed) return;
					}
					break;
				case 11 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:264:9: 'volatile'
					{
					match(input,106,FOLLOW_106_in_modifier1993); if (state.failed) return;
					}
					break;
				case 12 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:265:9: 'strictfp'
					{
					match(input,95,FOLLOW_95_in_modifier2003); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:268:1: packageOrTypeName : qualifiedName ;
	public final void packageOrTypeName() throws RecognitionException {
		int packageOrTypeName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:269:5: ( qualifiedName )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:269:9: qualifiedName
			{
			pushFollow(FOLLOW_qualifiedName_in_packageOrTypeName2022);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:272:1: enumConstantName : Identifier ;
	public final void enumConstantName() throws RecognitionException {
		int enumConstantName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:273:5: ( Identifier )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:273:9: Identifier
			{
			match(input,Identifier,FOLLOW_Identifier_in_enumConstantName2041); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:276:1: typeName : qualifiedName ;
	public final void typeName() throws RecognitionException {
		int typeName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:277:5: ( qualifiedName )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:277:9: qualifiedName
			{
			pushFollow(FOLLOW_qualifiedName_in_typeName2060);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:280:1: type : ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* );
	public final void type() throws RecognitionException {
		int type_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:281:2: ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:281:4: classOrInterfaceType ( '[' ']' )*
					{
					pushFollow(FOLLOW_classOrInterfaceType_in_type2074);
					classOrInterfaceType();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:281:25: ( '[' ']' )*
					loop67:
					while (true) {
						int alt67=2;
						int LA67_0 = input.LA(1);
						if ( (LA67_0==55) ) {
							alt67=1;
						}

						switch (alt67) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:281:26: '[' ']'
							{
							match(input,55,FOLLOW_55_in_type2077); if (state.failed) return;
							match(input,56,FOLLOW_56_in_type2079); if (state.failed) return;
							}
							break;

						default :
							break loop67;
						}
					}

					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:282:4: primitiveType ( '[' ']' )*
					{
					pushFollow(FOLLOW_primitiveType_in_type2086);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:282:18: ( '[' ']' )*
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==55) ) {
							alt68=1;
						}

						switch (alt68) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:282:19: '[' ']'
							{
							match(input,55,FOLLOW_55_in_type2089); if (state.failed) return;
							match(input,56,FOLLOW_56_in_type2091); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:285:1: classOrInterfaceType : I1= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* ;
	public final void classOrInterfaceType() throws RecognitionException {
		int classOrInterfaceType_StartIndex = input.index();

		Token I1=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:286:2: (I1= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:286:4: I1= Identifier ( typeArguments )? ( '.' Identifier ( typeArguments )? )*
			{
			I1=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType2106); if (state.failed) return;
			if ( state.backtracking==0 ) {if(isExtends){ 
				                          System.out.println("Ancestor classes:  "+(I1!=null?I1.getText():null)); isExtends=false;} 
				                       else 
				                       if(isImp){
				                       	  System.out.println("implements "+(I1!=null?I1.getText():null)); isExtends=false;
				                       	  isImp=false;
				                       } 
				                       //else
				                       //System.out.println("Found type " + (I1!=null?I1.getText():null));
				                       }
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:296:11: ( typeArguments )?
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:296:11: typeArguments
					{
					pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2120);
					typeArguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:296:26: ( '.' Identifier ( typeArguments )? )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==43) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:296:27: '.' Identifier ( typeArguments )?
					{
					match(input,43,FOLLOW_43_in_classOrInterfaceType2124); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType2126); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:296:42: ( typeArguments )?
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
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:296:42: typeArguments
							{
							pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2128);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:299:1: primitiveType : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
	public final void primitiveType() throws RecognitionException {
		int primitiveType_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:300:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:
			{
			if ( input.LA(1)==60||input.LA(1)==62||input.LA(1)==65||input.LA(1)==70||input.LA(1)==76||input.LA(1)==82||input.LA(1)==84||input.LA(1)==93 ) {
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
			if ( state.backtracking>0 ) { memoize(input, 55, primitiveType_StartIndex); }

		}
	}
	// $ANTLR end "primitiveType"



	// $ANTLR start "variableModifier"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:310:1: variableModifier : ( 'final' | annotation );
	public final void variableModifier() throws RecognitionException {
		int variableModifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:311:5: ( 'final' | annotation )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==74) ) {
				alt73=1;
			}
			else if ( (LA73_0==54) ) {
				alt73=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:311:9: 'final'
					{
					match(input,74,FOLLOW_74_in_variableModifier2237); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:312:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_variableModifier2247);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:315:1: typeArguments : '<' typeArgument ( ',' typeArgument )* '>' ;
	public final void typeArguments() throws RecognitionException {
		int typeArguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:316:5: ( '<' typeArgument ( ',' typeArgument )* '>' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:316:9: '<' typeArgument ( ',' typeArgument )* '>'
			{
			match(input,49,FOLLOW_49_in_typeArguments2266); if (state.failed) return;
			pushFollow(FOLLOW_typeArgument_in_typeArguments2268);
			typeArgument();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:316:26: ( ',' typeArgument )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==39) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:316:27: ',' typeArgument
					{
					match(input,39,FOLLOW_39_in_typeArguments2271); if (state.failed) return;
					pushFollow(FOLLOW_typeArgument_in_typeArguments2273);
					typeArgument();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop74;
				}
			}

			match(input,52,FOLLOW_52_in_typeArguments2277); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:319:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );
	public final void typeArgument() throws RecognitionException {
		int typeArgument_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:320:5: ( type | '?' ( ( 'extends' | 'super' ) type )? )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==Identifier||LA76_0==60||LA76_0==62||LA76_0==65||LA76_0==70||LA76_0==76||LA76_0==82||LA76_0==84||LA76_0==93) ) {
				alt76=1;
			}
			else if ( (LA76_0==53) ) {
				alt76=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:320:9: type
					{
					pushFollow(FOLLOW_type_in_typeArgument2300);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:321:9: '?' ( ( 'extends' | 'super' ) type )?
					{
					match(input,53,FOLLOW_53_in_typeArgument2310); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:321:13: ( ( 'extends' | 'super' ) type )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==72||LA75_0==96) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:321:14: ( 'extends' | 'super' ) type
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
							pushFollow(FOLLOW_type_in_typeArgument2321);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:324:1: qualifiedNameList : qualifiedName ( ',' qualifiedName )* ;
	public final void qualifiedNameList() throws RecognitionException {
		int qualifiedNameList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:325:5: ( qualifiedName ( ',' qualifiedName )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:325:9: qualifiedName ( ',' qualifiedName )*
			{
			pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList2346);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:325:23: ( ',' qualifiedName )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==39) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:325:24: ',' qualifiedName
					{
					match(input,39,FOLLOW_39_in_qualifiedNameList2349); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList2351);
					qualifiedName();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop77;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:328:1: formalParameters : '(' ( formalParameterDecls )? ')' ;
	public final void formalParameters() throws RecognitionException {
		int formalParameters_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:329:5: ( '(' ( formalParameterDecls )? ')' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:329:9: '(' ( formalParameterDecls )? ')'
			{
			match(input,32,FOLLOW_32_in_formalParameters2372); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:329:13: ( formalParameterDecls )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==Identifier||LA78_0==54||LA78_0==60||LA78_0==62||LA78_0==65||LA78_0==70||LA78_0==74||LA78_0==76||LA78_0==82||LA78_0==84||LA78_0==93) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:329:13: formalParameterDecls
					{
					pushFollow(FOLLOW_formalParameterDecls_in_formalParameters2374);
					formalParameterDecls();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,33,FOLLOW_33_in_formalParameters2377); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:332:1: formalParameterDecls : variableModifiers type formalParameterDeclsRest ;
	public final void formalParameterDecls() throws RecognitionException {
		int formalParameterDecls_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:333:5: ( variableModifiers type formalParameterDeclsRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:333:9: variableModifiers type formalParameterDeclsRest
			{
			pushFollow(FOLLOW_variableModifiers_in_formalParameterDecls2400);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_formalParameterDecls2402);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_formalParameterDeclsRest_in_formalParameterDecls2404);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:336:1: formalParameterDeclsRest : ( variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId );
	public final void formalParameterDeclsRest() throws RecognitionException {
		int formalParameterDeclsRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:337:5: ( variableDeclaratorId ( ',' formalParameterDecls )? | '...' variableDeclaratorId )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==Identifier) ) {
				alt80=1;
			}
			else if ( (LA80_0==44) ) {
				alt80=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:337:9: variableDeclaratorId ( ',' formalParameterDecls )?
					{
					pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2427);
					variableDeclaratorId();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:337:30: ( ',' formalParameterDecls )?
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0==39) ) {
						alt79=1;
					}
					switch (alt79) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:337:31: ',' formalParameterDecls
							{
							match(input,39,FOLLOW_39_in_formalParameterDeclsRest2430); if (state.failed) return;
							pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDeclsRest2432);
							formalParameterDecls();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:338:9: '...' variableDeclaratorId
					{
					match(input,44,FOLLOW_44_in_formalParameterDeclsRest2444); if (state.failed) return;
					pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2446);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:341:1: methodBody : block ;
	public final void methodBody() throws RecognitionException {
		int methodBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:342:5: ( block )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:342:9: block
			{
			pushFollow(FOLLOW_block_in_methodBody2469);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:345:1: constructorBody : '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' ;
	public final void constructorBody() throws RecognitionException {
		int constructorBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:346:5: ( '{' ( explicitConstructorInvocation )? ( blockStatement )* '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:346:9: '{' ( explicitConstructorInvocation )? ( blockStatement )* '}'
			{
			match(input,108,FOLLOW_108_in_constructorBody2488); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:346:13: ( explicitConstructorInvocation )?
			int alt81=2;
			switch ( input.LA(1) ) {
				case 49:
					{
					alt81=1;
					}
					break;
				case 99:
					{
					int LA81_2 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
				case 32:
					{
					int LA81_3 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
				case 96:
					{
					int LA81_4 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
				case DecimalLiteral:
				case HexLiteral:
				case OctalLiteral:
					{
					int LA81_5 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
				case FloatingPointLiteral:
					{
					int LA81_6 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
				case CharacterLiteral:
					{
					int LA81_7 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
				case StringLiteral:
					{
					int LA81_8 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
				case 73:
				case 103:
					{
					int LA81_9 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
				case 87:
					{
					int LA81_10 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
				case 86:
					{
					int LA81_11 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
				case Identifier:
					{
					int LA81_12 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
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
					int LA81_13 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
				case 105:
					{
					int LA81_14 = input.LA(2);
					if ( (synpred113_BasForCCal()) ) {
						alt81=1;
					}
					}
					break;
			}
			switch (alt81) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:346:13: explicitConstructorInvocation
					{
					pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody2490);
					explicitConstructorInvocation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:346:44: ( blockStatement )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==ASSERT||(LA82_0 >= CharacterLiteral && LA82_0 <= ENUM)||LA82_0==FloatingPointLiteral||(LA82_0 >= HexLiteral && LA82_0 <= Identifier)||(LA82_0 >= OctalLiteral && LA82_0 <= StringLiteral)||LA82_0==25||LA82_0==32||(LA82_0 >= 36 && LA82_0 <= 37)||(LA82_0 >= 40 && LA82_0 <= 41)||LA82_0==48||LA82_0==54||(LA82_0 >= 59 && LA82_0 <= 62)||(LA82_0 >= 65 && LA82_0 <= 67)||(LA82_0 >= 69 && LA82_0 <= 70)||(LA82_0 >= 73 && LA82_0 <= 74)||(LA82_0 >= 76 && LA82_0 <= 78)||(LA82_0 >= 82 && LA82_0 <= 84)||(LA82_0 >= 86 && LA82_0 <= 87)||(LA82_0 >= 89 && LA82_0 <= 100)||(LA82_0 >= 103 && LA82_0 <= 105)||(LA82_0 >= 107 && LA82_0 <= 108)||LA82_0==113) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:346:44: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_constructorBody2493);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop82;
				}
			}

			match(input,112,FOLLOW_112_in_constructorBody2496); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:349:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' );
	public final void explicitConstructorInvocation() throws RecognitionException {
		int explicitConstructorInvocation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:350:5: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' | primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';' )
			int alt85=2;
			switch ( input.LA(1) ) {
			case 49:
				{
				alt85=1;
				}
				break;
			case 99:
				{
				int LA85_2 = input.LA(2);
				if ( (synpred117_BasForCCal()) ) {
					alt85=1;
				}
				else if ( (true) ) {
					alt85=2;
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
				alt85=2;
				}
				break;
			case 96:
				{
				int LA85_4 = input.LA(2);
				if ( (synpred117_BasForCCal()) ) {
					alt85=1;
				}
				else if ( (true) ) {
					alt85=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:350:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:350:9: ( nonWildcardTypeArguments )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==49) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:350:9: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2515);
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
					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation2526);
					arguments();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_explicitConstructorInvocation2528); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:351:9: primary '.' ( nonWildcardTypeArguments )? 'super' arguments ';'
					{
					pushFollow(FOLLOW_primary_in_explicitConstructorInvocation2538);
					primary();
					state._fsp--;
					if (state.failed) return;
					match(input,43,FOLLOW_43_in_explicitConstructorInvocation2540); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:351:21: ( nonWildcardTypeArguments )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==49) ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:351:21: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2542);
							nonWildcardTypeArguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,96,FOLLOW_96_in_explicitConstructorInvocation2545); if (state.failed) return;
					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation2547);
					arguments();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_explicitConstructorInvocation2549); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:355:1: qualifiedName : Identifier ( '.' Identifier )* ;
	public final void qualifiedName() throws RecognitionException {
		int qualifiedName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:356:5: ( Identifier ( '.' Identifier )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:356:9: Identifier ( '.' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_qualifiedName2569); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:356:20: ( '.' Identifier )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==43) ) {
					int LA86_2 = input.LA(2);
					if ( (LA86_2==Identifier) ) {
						alt86=1;
					}

				}

				switch (alt86) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:356:21: '.' Identifier
					{
					match(input,43,FOLLOW_43_in_qualifiedName2572); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_qualifiedName2574); if (state.failed) return;
					}
					break;

				default :
					break loop86;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:359:1: literal : ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' );
	public final void literal() throws RecognitionException {
		int literal_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:360:5: ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | booleanLiteral | 'null' )
			int alt87=6;
			switch ( input.LA(1) ) {
			case DecimalLiteral:
			case HexLiteral:
			case OctalLiteral:
				{
				alt87=1;
				}
				break;
			case FloatingPointLiteral:
				{
				alt87=2;
				}
				break;
			case CharacterLiteral:
				{
				alt87=3;
				}
				break;
			case StringLiteral:
				{
				alt87=4;
				}
				break;
			case 73:
			case 103:
				{
				alt87=5;
				}
				break;
			case 87:
				{
				alt87=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}
			switch (alt87) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:360:9: integerLiteral
					{
					pushFollow(FOLLOW_integerLiteral_in_literal2600);
					integerLiteral();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:361:9: FloatingPointLiteral
					{
					match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal2610); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:362:9: CharacterLiteral
					{
					match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal2620); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:363:9: StringLiteral
					{
					match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2630); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:364:9: booleanLiteral
					{
					pushFollow(FOLLOW_booleanLiteral_in_literal2640);
					booleanLiteral();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:365:9: 'null'
					{
					match(input,87,FOLLOW_87_in_literal2650); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:368:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
	public final void integerLiteral() throws RecognitionException {
		int integerLiteral_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:369:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:374:1: booleanLiteral : ( 'true' | 'false' );
	public final void booleanLiteral() throws RecognitionException {
		int booleanLiteral_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:375:5: ( 'true' | 'false' )
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:381:1: annotations : ( annotation )+ ;
	public final void annotations() throws RecognitionException {
		int annotations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:382:5: ( ( annotation )+ )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:382:9: ( annotation )+
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:382:9: ( annotation )+
			int cnt88=0;
			loop88:
			while (true) {
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==54) ) {
					int LA88_2 = input.LA(2);
					if ( (LA88_2==Identifier) ) {
						int LA88_3 = input.LA(3);
						if ( (synpred128_BasForCCal()) ) {
							alt88=1;
						}

					}

				}

				switch (alt88) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:382:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_annotations2739);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt88 >= 1 ) break loop88;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(88, input);
					throw eee;
				}
				cnt88++;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:385:1: annotation : '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )? ;
	public final void annotation() throws RecognitionException {
		int annotation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:386:5: ( '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:386:9: '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
			{
			match(input,54,FOLLOW_54_in_annotation2759); if (state.failed) return;
			pushFollow(FOLLOW_annotationName_in_annotation2761);
			annotationName();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:386:28: ( '(' ( elementValuePairs | elementValue )? ')' )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==32) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:386:30: '(' ( elementValuePairs | elementValue )? ')'
					{
					match(input,32,FOLLOW_32_in_annotation2765); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:386:34: ( elementValuePairs | elementValue )?
					int alt89=3;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==Identifier) ) {
						int LA89_1 = input.LA(2);
						if ( (LA89_1==50) ) {
							alt89=1;
						}
						else if ( ((LA89_1 >= 26 && LA89_1 <= 27)||(LA89_1 >= 29 && LA89_1 <= 30)||(LA89_1 >= 32 && LA89_1 <= 34)||(LA89_1 >= 36 && LA89_1 <= 37)||(LA89_1 >= 40 && LA89_1 <= 41)||LA89_1==43||LA89_1==45||LA89_1==49||(LA89_1 >= 51 && LA89_1 <= 53)||LA89_1==55||LA89_1==57||LA89_1==81||LA89_1==109||LA89_1==111) ) {
							alt89=2;
						}
					}
					else if ( ((LA89_0 >= CharacterLiteral && LA89_0 <= DecimalLiteral)||LA89_0==FloatingPointLiteral||LA89_0==HexLiteral||(LA89_0 >= OctalLiteral && LA89_0 <= StringLiteral)||LA89_0==25||LA89_0==32||(LA89_0 >= 36 && LA89_0 <= 37)||(LA89_0 >= 40 && LA89_0 <= 41)||LA89_0==54||LA89_0==60||LA89_0==62||LA89_0==65||LA89_0==70||LA89_0==73||LA89_0==76||LA89_0==82||LA89_0==84||(LA89_0 >= 86 && LA89_0 <= 87)||LA89_0==93||LA89_0==96||LA89_0==99||LA89_0==103||LA89_0==105||LA89_0==108||LA89_0==113) ) {
						alt89=2;
					}
					switch (alt89) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:386:36: elementValuePairs
							{
							pushFollow(FOLLOW_elementValuePairs_in_annotation2769);
							elementValuePairs();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:386:56: elementValue
							{
							pushFollow(FOLLOW_elementValue_in_annotation2773);
							elementValue();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,33,FOLLOW_33_in_annotation2778); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:389:1: annotationName : Identifier ( '.' Identifier )* ;
	public final void annotationName() throws RecognitionException {
		int annotationName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:390:5: ( Identifier ( '.' Identifier )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:390:7: Identifier ( '.' Identifier )*
			{
			match(input,Identifier,FOLLOW_Identifier_in_annotationName2802); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:390:18: ( '.' Identifier )*
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==43) ) {
					alt91=1;
				}

				switch (alt91) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:390:19: '.' Identifier
					{
					match(input,43,FOLLOW_43_in_annotationName2805); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_annotationName2807); if (state.failed) return;
					}
					break;

				default :
					break loop91;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:393:1: elementValuePairs : elementValuePair ( ',' elementValuePair )* ;
	public final void elementValuePairs() throws RecognitionException {
		int elementValuePairs_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:394:5: ( elementValuePair ( ',' elementValuePair )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:394:9: elementValuePair ( ',' elementValuePair )*
			{
			pushFollow(FOLLOW_elementValuePair_in_elementValuePairs2828);
			elementValuePair();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:394:26: ( ',' elementValuePair )*
			loop92:
			while (true) {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==39) ) {
					alt92=1;
				}

				switch (alt92) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:394:27: ',' elementValuePair
					{
					match(input,39,FOLLOW_39_in_elementValuePairs2831); if (state.failed) return;
					pushFollow(FOLLOW_elementValuePair_in_elementValuePairs2833);
					elementValuePair();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 73, elementValuePairs_StartIndex); }

		}
	}
	// $ANTLR end "elementValuePairs"



	// $ANTLR start "elementValuePair"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:397:1: elementValuePair : Identifier '=' elementValue ;
	public final void elementValuePair() throws RecognitionException {
		int elementValuePair_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:398:5: ( Identifier '=' elementValue )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:398:9: Identifier '=' elementValue
			{
			match(input,Identifier,FOLLOW_Identifier_in_elementValuePair2854); if (state.failed) return;
			match(input,50,FOLLOW_50_in_elementValuePair2856); if (state.failed) return;
			pushFollow(FOLLOW_elementValue_in_elementValuePair2858);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:401:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );
	public final void elementValue() throws RecognitionException {
		int elementValue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:402:5: ( conditionalExpression | annotation | elementValueArrayInitializer )
			int alt93=3;
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
				alt93=1;
				}
				break;
			case 54:
				{
				alt93=2;
				}
				break;
			case 108:
				{
				alt93=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}
			switch (alt93) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:402:9: conditionalExpression
					{
					pushFollow(FOLLOW_conditionalExpression_in_elementValue2881);
					conditionalExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:403:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_elementValue2891);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:404:9: elementValueArrayInitializer
					{
					pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue2901);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:407:1: elementValueArrayInitializer : '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' ;
	public final void elementValueArrayInitializer() throws RecognitionException {
		int elementValueArrayInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:408:5: ( '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:408:9: '{' ( elementValue ( ',' elementValue )* )? ( ',' )? '}'
			{
			match(input,108,FOLLOW_108_in_elementValueArrayInitializer2924); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:408:13: ( elementValue ( ',' elementValue )* )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( ((LA95_0 >= CharacterLiteral && LA95_0 <= DecimalLiteral)||LA95_0==FloatingPointLiteral||(LA95_0 >= HexLiteral && LA95_0 <= Identifier)||(LA95_0 >= OctalLiteral && LA95_0 <= StringLiteral)||LA95_0==25||LA95_0==32||(LA95_0 >= 36 && LA95_0 <= 37)||(LA95_0 >= 40 && LA95_0 <= 41)||LA95_0==54||LA95_0==60||LA95_0==62||LA95_0==65||LA95_0==70||LA95_0==73||LA95_0==76||LA95_0==82||LA95_0==84||(LA95_0 >= 86 && LA95_0 <= 87)||LA95_0==93||LA95_0==96||LA95_0==99||LA95_0==103||LA95_0==105||LA95_0==108||LA95_0==113) ) {
				alt95=1;
			}
			switch (alt95) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:408:14: elementValue ( ',' elementValue )*
					{
					pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer2927);
					elementValue();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:408:27: ( ',' elementValue )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==39) ) {
							int LA94_1 = input.LA(2);
							if ( ((LA94_1 >= CharacterLiteral && LA94_1 <= DecimalLiteral)||LA94_1==FloatingPointLiteral||(LA94_1 >= HexLiteral && LA94_1 <= Identifier)||(LA94_1 >= OctalLiteral && LA94_1 <= StringLiteral)||LA94_1==25||LA94_1==32||(LA94_1 >= 36 && LA94_1 <= 37)||(LA94_1 >= 40 && LA94_1 <= 41)||LA94_1==54||LA94_1==60||LA94_1==62||LA94_1==65||LA94_1==70||LA94_1==73||LA94_1==76||LA94_1==82||LA94_1==84||(LA94_1 >= 86 && LA94_1 <= 87)||LA94_1==93||LA94_1==96||LA94_1==99||LA94_1==103||LA94_1==105||LA94_1==108||LA94_1==113) ) {
								alt94=1;
							}

						}

						switch (alt94) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:408:28: ',' elementValue
							{
							match(input,39,FOLLOW_39_in_elementValueArrayInitializer2930); if (state.failed) return;
							pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer2932);
							elementValue();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop94;
						}
					}

					}
					break;

			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:408:49: ( ',' )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==39) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:408:50: ','
					{
					match(input,39,FOLLOW_39_in_elementValueArrayInitializer2939); if (state.failed) return;
					}
					break;

			}

			match(input,112,FOLLOW_112_in_elementValueArrayInitializer2943); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:411:1: annotationTypeDeclaration : '@' 'interface' Identifier annotationTypeBody ;
	public final void annotationTypeDeclaration() throws RecognitionException {
		int annotationTypeDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:412:5: ( '@' 'interface' Identifier annotationTypeBody )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:412:9: '@' 'interface' Identifier annotationTypeBody
			{
			match(input,54,FOLLOW_54_in_annotationTypeDeclaration2966); if (state.failed) return;
			match(input,83,FOLLOW_83_in_annotationTypeDeclaration2968); if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_annotationTypeDeclaration2970); if (state.failed) return;
			pushFollow(FOLLOW_annotationTypeBody_in_annotationTypeDeclaration2972);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:415:1: annotationTypeBody : '{' ( annotationTypeElementDeclaration )* '}' ;
	public final void annotationTypeBody() throws RecognitionException {
		int annotationTypeBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:416:5: ( '{' ( annotationTypeElementDeclaration )* '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:416:9: '{' ( annotationTypeElementDeclaration )* '}'
			{
			match(input,108,FOLLOW_108_in_annotationTypeBody2995); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:416:13: ( annotationTypeElementDeclaration )*
			loop97:
			while (true) {
				int alt97=2;
				int LA97_0 = input.LA(1);
				if ( (LA97_0==ENUM||LA97_0==Identifier||LA97_0==49||LA97_0==54||(LA97_0 >= 59 && LA97_0 <= 60)||LA97_0==62||(LA97_0 >= 65 && LA97_0 <= 66)||LA97_0==70||LA97_0==74||LA97_0==76||(LA97_0 >= 82 && LA97_0 <= 85)||(LA97_0 >= 89 && LA97_0 <= 91)||(LA97_0 >= 93 && LA97_0 <= 95)||LA97_0==98||LA97_0==102||(LA97_0 >= 105 && LA97_0 <= 106)) ) {
					alt97=1;
				}

				switch (alt97) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:416:14: annotationTypeElementDeclaration
					{
					pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody2998);
					annotationTypeElementDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop97;
				}
			}

			match(input,112,FOLLOW_112_in_annotationTypeBody3002); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:419:1: annotationTypeElementDeclaration : modifiers annotationTypeElementRest ;
	public final void annotationTypeElementDeclaration() throws RecognitionException {
		int annotationTypeElementDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:420:5: ( modifiers annotationTypeElementRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:420:9: modifiers annotationTypeElementRest
			{
			pushFollow(FOLLOW_modifiers_in_annotationTypeElementDeclaration3025);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration3027);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:423:1: annotationTypeElementRest : ( type annotationMethodOrConstantRest ';' | normalClassDeclaration ( ';' )? | normalInterfaceDeclaration ( ';' )? | enumDeclaration ( ';' )? | annotationTypeDeclaration ( ';' )? );
	public final void annotationTypeElementRest() throws RecognitionException {
		int annotationTypeElementRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:424:5: ( type annotationMethodOrConstantRest ';' | normalClassDeclaration ( ';' )? | normalInterfaceDeclaration ( ';' )? | enumDeclaration ( ';' )? | annotationTypeDeclaration ( ';' )? )
			int alt102=5;
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
				alt102=1;
				}
				break;
			case 66:
				{
				alt102=2;
				}
				break;
			case 83:
				{
				alt102=3;
				}
				break;
			case ENUM:
				{
				alt102=4;
				}
				break;
			case 54:
				{
				alt102=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}
			switch (alt102) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:424:9: type annotationMethodOrConstantRest ';'
					{
					pushFollow(FOLLOW_type_in_annotationTypeElementRest3050);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest3052);
					annotationMethodOrConstantRest();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_annotationTypeElementRest3054); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:425:9: normalClassDeclaration ( ';' )?
					{
					pushFollow(FOLLOW_normalClassDeclaration_in_annotationTypeElementRest3064);
					normalClassDeclaration();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:425:32: ( ';' )?
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==48) ) {
						alt98=1;
					}
					switch (alt98) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:425:32: ';'
							{
							match(input,48,FOLLOW_48_in_annotationTypeElementRest3066); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:426:9: normalInterfaceDeclaration ( ';' )?
					{
					pushFollow(FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest3077);
					normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:426:36: ( ';' )?
					int alt99=2;
					int LA99_0 = input.LA(1);
					if ( (LA99_0==48) ) {
						alt99=1;
					}
					switch (alt99) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:426:36: ';'
							{
							match(input,48,FOLLOW_48_in_annotationTypeElementRest3079); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:427:9: enumDeclaration ( ';' )?
					{
					pushFollow(FOLLOW_enumDeclaration_in_annotationTypeElementRest3090);
					enumDeclaration();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:427:25: ( ';' )?
					int alt100=2;
					int LA100_0 = input.LA(1);
					if ( (LA100_0==48) ) {
						alt100=1;
					}
					switch (alt100) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:427:25: ';'
							{
							match(input,48,FOLLOW_48_in_annotationTypeElementRest3092); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:428:9: annotationTypeDeclaration ( ';' )?
					{
					pushFollow(FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest3103);
					annotationTypeDeclaration();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:428:35: ( ';' )?
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==48) ) {
						alt101=1;
					}
					switch (alt101) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:428:35: ';'
							{
							match(input,48,FOLLOW_48_in_annotationTypeElementRest3105); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:431:1: annotationMethodOrConstantRest : ( annotationMethodRest | annotationConstantRest );
	public final void annotationMethodOrConstantRest() throws RecognitionException {
		int annotationMethodOrConstantRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:432:5: ( annotationMethodRest | annotationConstantRest )
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==Identifier) ) {
				int LA103_1 = input.LA(2);
				if ( (LA103_1==32) ) {
					alt103=1;
				}
				else if ( (LA103_1==39||LA103_1==48||LA103_1==50||LA103_1==55) ) {
					alt103=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 103, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}

			switch (alt103) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:432:9: annotationMethodRest
					{
					pushFollow(FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest3129);
					annotationMethodRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:433:9: annotationConstantRest
					{
					pushFollow(FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest3139);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:436:1: annotationMethodRest : Identifier '(' ')' ( defaultValue )? ;
	public final void annotationMethodRest() throws RecognitionException {
		int annotationMethodRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:437:5: ( Identifier '(' ')' ( defaultValue )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:437:9: Identifier '(' ')' ( defaultValue )?
			{
			match(input,Identifier,FOLLOW_Identifier_in_annotationMethodRest3162); if (state.failed) return;
			match(input,32,FOLLOW_32_in_annotationMethodRest3164); if (state.failed) return;
			match(input,33,FOLLOW_33_in_annotationMethodRest3166); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:437:28: ( defaultValue )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==68) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:437:28: defaultValue
					{
					pushFollow(FOLLOW_defaultValue_in_annotationMethodRest3168);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:440:1: annotationConstantRest : variableDeclarators ;
	public final void annotationConstantRest() throws RecognitionException {
		int annotationConstantRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:441:5: ( variableDeclarators )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:441:9: variableDeclarators
			{
			pushFollow(FOLLOW_variableDeclarators_in_annotationConstantRest3192);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:444:1: defaultValue : 'default' elementValue ;
	public final void defaultValue() throws RecognitionException {
		int defaultValue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:445:5: ( 'default' elementValue )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:445:9: 'default' elementValue
			{
			match(input,68,FOLLOW_68_in_defaultValue3215); if (state.failed) return;
			pushFollow(FOLLOW_elementValue_in_defaultValue3217);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:450:1: block : '{' ( blockStatement )* '}' ;
	public final void block() throws RecognitionException {
		int block_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:451:5: ( '{' ( blockStatement )* '}' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:451:9: '{' ( blockStatement )* '}'
			{
			match(input,108,FOLLOW_108_in_block3238); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:451:13: ( blockStatement )*
			loop105:
			while (true) {
				int alt105=2;
				int LA105_0 = input.LA(1);
				if ( (LA105_0==ASSERT||(LA105_0 >= CharacterLiteral && LA105_0 <= ENUM)||LA105_0==FloatingPointLiteral||(LA105_0 >= HexLiteral && LA105_0 <= Identifier)||(LA105_0 >= OctalLiteral && LA105_0 <= StringLiteral)||LA105_0==25||LA105_0==32||(LA105_0 >= 36 && LA105_0 <= 37)||(LA105_0 >= 40 && LA105_0 <= 41)||LA105_0==48||LA105_0==54||(LA105_0 >= 59 && LA105_0 <= 62)||(LA105_0 >= 65 && LA105_0 <= 67)||(LA105_0 >= 69 && LA105_0 <= 70)||(LA105_0 >= 73 && LA105_0 <= 74)||(LA105_0 >= 76 && LA105_0 <= 78)||(LA105_0 >= 82 && LA105_0 <= 84)||(LA105_0 >= 86 && LA105_0 <= 87)||(LA105_0 >= 89 && LA105_0 <= 100)||(LA105_0 >= 103 && LA105_0 <= 105)||(LA105_0 >= 107 && LA105_0 <= 108)||LA105_0==113) ) {
					alt105=1;
				}

				switch (alt105) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:451:13: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_block3240);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop105;
				}
			}

			match(input,112,FOLLOW_112_in_block3243); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:454:1: blockStatement : ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement );
	public final void blockStatement() throws RecognitionException {
		int blockStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:455:5: ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement )
			int alt106=3;
			switch ( input.LA(1) ) {
			case 74:
				{
				int LA106_1 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt106=1;
				}
				else if ( (synpred152_BasForCCal()) ) {
					alt106=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 106, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 54:
				{
				int LA106_2 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt106=1;
				}
				else if ( (synpred152_BasForCCal()) ) {
					alt106=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 106, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA106_3 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt106=1;
				}
				else if ( (true) ) {
					alt106=3;
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
				int LA106_4 = input.LA(2);
				if ( (synpred151_BasForCCal()) ) {
					alt106=1;
				}
				else if ( (true) ) {
					alt106=3;
				}

				}
				break;
			case ENUM:
			case 59:
			case 66:
			case 83:
			case 89:
			case 90:
			case 91:
			case 94:
			case 95:
				{
				alt106=2;
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
				alt106=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:455:9: localVariableDeclarationStatement
					{
					pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement3266);
					localVariableDeclarationStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:456:9: classOrInterfaceDeclaration
					{
					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement3276);
					classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:457:9: statement
					{
					pushFollow(FOLLOW_statement_in_blockStatement3286);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:460:1: localVariableDeclarationStatement : localVariableDeclaration ';' ;
	public final void localVariableDeclarationStatement() throws RecognitionException {
		int localVariableDeclarationStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:461:5: ( localVariableDeclaration ';' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:461:10: localVariableDeclaration ';'
			{
			pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement3310);
			localVariableDeclaration();
			state._fsp--;
			if (state.failed) return;
			match(input,48,FOLLOW_48_in_localVariableDeclarationStatement3312); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:464:1: localVariableDeclaration : variableModifiers type variableDeclarators ;
	public final void localVariableDeclaration() throws RecognitionException {
		int localVariableDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:465:5: ( variableModifiers type variableDeclarators )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:465:9: variableModifiers type variableDeclarators
			{
			pushFollow(FOLLOW_variableModifiers_in_localVariableDeclaration3331);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_localVariableDeclaration3333);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_variableDeclarators_in_localVariableDeclaration3335);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:468:1: variableModifiers : ( variableModifier )* ;
	public final void variableModifiers() throws RecognitionException {
		int variableModifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:469:5: ( ( variableModifier )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:469:9: ( variableModifier )*
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:469:9: ( variableModifier )*
			loop107:
			while (true) {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==54||LA107_0==74) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:469:9: variableModifier
					{
					pushFollow(FOLLOW_variableModifier_in_variableModifiers3358);
					variableModifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop107;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:472:1: statement : ( block | ASSERT expression ( ':' expression )? ';' | 'if' parExpression statement ( options {k=1; } : 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement );
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:473:5: ( block | ASSERT expression ( ':' expression )? ';' | 'if' parExpression statement ( options {k=1; } : 'else' statement )? | 'for' '(' forControl ')' statement | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | 'try' block ( catches 'finally' block | catches | 'finally' block ) | 'switch' parExpression '{' switchBlockStatementGroups '}' | 'synchronized' parExpression block | 'return' ( expression )? ';' | 'throw' expression ';' | 'break' ( Identifier )? ';' | 'continue' ( Identifier )? ';' | ';' | statementExpression ';' | Identifier ':' statement )
			int alt114=16;
			switch ( input.LA(1) ) {
			case 108:
				{
				alt114=1;
				}
				break;
			case ASSERT:
				{
				alt114=2;
				}
				break;
			case 78:
				{
				alt114=3;
				}
				break;
			case 77:
				{
				alt114=4;
				}
				break;
			case 107:
				{
				alt114=5;
				}
				break;
			case 69:
				{
				alt114=6;
				}
				break;
			case 104:
				{
				alt114=7;
				}
				break;
			case 97:
				{
				alt114=8;
				}
				break;
			case 98:
				{
				alt114=9;
				}
				break;
			case 92:
				{
				alt114=10;
				}
				break;
			case 100:
				{
				alt114=11;
				}
				break;
			case 61:
				{
				alt114=12;
				}
				break;
			case 67:
				{
				alt114=13;
				}
				break;
			case 48:
				{
				alt114=14;
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
				alt114=15;
				}
				break;
			case Identifier:
				{
				int LA114_16 = input.LA(2);
				if ( (LA114_16==47) ) {
					alt114=16;
				}
				else if ( ((LA114_16 >= 26 && LA114_16 <= 32)||(LA114_16 >= 34 && LA114_16 <= 38)||(LA114_16 >= 40 && LA114_16 <= 43)||(LA114_16 >= 45 && LA114_16 <= 46)||(LA114_16 >= 48 && LA114_16 <= 53)||LA114_16==55||(LA114_16 >= 57 && LA114_16 <= 58)||LA114_16==81||(LA114_16 >= 109 && LA114_16 <= 111)) ) {
					alt114=15;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 114, 16, input);
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
					new NoViableAltException("", 114, 0, input);
				throw nvae;
			}
			switch (alt114) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:473:7: block
					{
					pushFollow(FOLLOW_block_in_statement3376);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:474:9: ASSERT expression ( ':' expression )? ';'
					{
					match(input,ASSERT,FOLLOW_ASSERT_in_statement3386); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_statement3388);
					expression();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:474:27: ( ':' expression )?
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==47) ) {
						alt108=1;
					}
					switch (alt108) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:474:28: ':' expression
							{
							match(input,47,FOLLOW_47_in_statement3391); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_statement3393);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_statement3397); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:475:9: 'if' parExpression statement ( options {k=1; } : 'else' statement )?
					{
					match(input,78,FOLLOW_78_in_statement3407); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement3409);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement3411);
					statement();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:475:38: ( options {k=1; } : 'else' statement )?
					int alt109=2;
					int LA109_0 = input.LA(1);
					if ( (LA109_0==71) ) {
						int LA109_1 = input.LA(2);
						if ( (synpred157_BasForCCal()) ) {
							alt109=1;
						}
					}
					switch (alt109) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:475:54: 'else' statement
							{
							match(input,71,FOLLOW_71_in_statement3421); if (state.failed) return;
							pushFollow(FOLLOW_statement_in_statement3423);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:476:9: 'for' '(' forControl ')' statement
					{
					match(input,77,FOLLOW_77_in_statement3435); if (state.failed) return;
					match(input,32,FOLLOW_32_in_statement3437); if (state.failed) return;
					pushFollow(FOLLOW_forControl_in_statement3439);
					forControl();
					state._fsp--;
					if (state.failed) return;
					match(input,33,FOLLOW_33_in_statement3441); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement3443);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:477:9: 'while' parExpression statement
					{
					match(input,107,FOLLOW_107_in_statement3453); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement3455);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement3457);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:478:9: 'do' statement 'while' parExpression ';'
					{
					match(input,69,FOLLOW_69_in_statement3467); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement3469);
					statement();
					state._fsp--;
					if (state.failed) return;
					match(input,107,FOLLOW_107_in_statement3471); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement3473);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_statement3475); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:479:9: 'try' block ( catches 'finally' block | catches | 'finally' block )
					{
					match(input,104,FOLLOW_104_in_statement3485); if (state.failed) return;
					pushFollow(FOLLOW_block_in_statement3487);
					block();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:480:9: ( catches 'finally' block | catches | 'finally' block )
					int alt110=3;
					int LA110_0 = input.LA(1);
					if ( (LA110_0==64) ) {
						int LA110_1 = input.LA(2);
						if ( (synpred162_BasForCCal()) ) {
							alt110=1;
						}
						else if ( (synpred163_BasForCCal()) ) {
							alt110=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 110, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA110_0==75) ) {
						alt110=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 110, 0, input);
						throw nvae;
					}

					switch (alt110) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:480:11: catches 'finally' block
							{
							pushFollow(FOLLOW_catches_in_statement3499);
							catches();
							state._fsp--;
							if (state.failed) return;
							match(input,75,FOLLOW_75_in_statement3501); if (state.failed) return;
							pushFollow(FOLLOW_block_in_statement3503);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:481:11: catches
							{
							pushFollow(FOLLOW_catches_in_statement3515);
							catches();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 3 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:482:13: 'finally' block
							{
							match(input,75,FOLLOW_75_in_statement3529); if (state.failed) return;
							pushFollow(FOLLOW_block_in_statement3531);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:484:9: 'switch' parExpression '{' switchBlockStatementGroups '}'
					{
					match(input,97,FOLLOW_97_in_statement3551); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement3553);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,108,FOLLOW_108_in_statement3555); if (state.failed) return;
					pushFollow(FOLLOW_switchBlockStatementGroups_in_statement3557);
					switchBlockStatementGroups();
					state._fsp--;
					if (state.failed) return;
					match(input,112,FOLLOW_112_in_statement3559); if (state.failed) return;
					}
					break;
				case 9 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:485:9: 'synchronized' parExpression block
					{
					match(input,98,FOLLOW_98_in_statement3569); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement3571);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_block_in_statement3573);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:486:9: 'return' ( expression )? ';'
					{
					match(input,92,FOLLOW_92_in_statement3583); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:486:18: ( expression )?
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( ((LA111_0 >= CharacterLiteral && LA111_0 <= DecimalLiteral)||LA111_0==FloatingPointLiteral||(LA111_0 >= HexLiteral && LA111_0 <= Identifier)||(LA111_0 >= OctalLiteral && LA111_0 <= StringLiteral)||LA111_0==25||LA111_0==32||(LA111_0 >= 36 && LA111_0 <= 37)||(LA111_0 >= 40 && LA111_0 <= 41)||LA111_0==60||LA111_0==62||LA111_0==65||LA111_0==70||LA111_0==73||LA111_0==76||LA111_0==82||LA111_0==84||(LA111_0 >= 86 && LA111_0 <= 87)||LA111_0==93||LA111_0==96||LA111_0==99||LA111_0==103||LA111_0==105||LA111_0==113) ) {
						alt111=1;
					}
					switch (alt111) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:486:18: expression
							{
							pushFollow(FOLLOW_expression_in_statement3585);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_statement3588); if (state.failed) return;
					}
					break;
				case 11 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:487:9: 'throw' expression ';'
					{
					match(input,100,FOLLOW_100_in_statement3598); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_statement3600);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_statement3602); if (state.failed) return;
					}
					break;
				case 12 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:488:9: 'break' ( Identifier )? ';'
					{
					match(input,61,FOLLOW_61_in_statement3612); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:488:17: ( Identifier )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==Identifier) ) {
						alt112=1;
					}
					switch (alt112) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:488:17: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_statement3614); if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_statement3617); if (state.failed) return;
					}
					break;
				case 13 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:489:9: 'continue' ( Identifier )? ';'
					{
					match(input,67,FOLLOW_67_in_statement3627); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:489:20: ( Identifier )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==Identifier) ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:489:20: Identifier
							{
							match(input,Identifier,FOLLOW_Identifier_in_statement3629); if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_statement3632); if (state.failed) return;
					}
					break;
				case 14 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:490:9: ';'
					{
					match(input,48,FOLLOW_48_in_statement3642); if (state.failed) return;
					}
					break;
				case 15 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:491:9: statementExpression ';'
					{
					pushFollow(FOLLOW_statementExpression_in_statement3653);
					statementExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,48,FOLLOW_48_in_statement3655); if (state.failed) return;
					}
					break;
				case 16 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:492:9: Identifier ':' statement
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement3665); if (state.failed) return;
					match(input,47,FOLLOW_47_in_statement3667); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement3669);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:495:1: catches : catchClause ( catchClause )* ;
	public final void catches() throws RecognitionException {
		int catches_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:496:5: ( catchClause ( catchClause )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:496:9: catchClause ( catchClause )*
			{
			pushFollow(FOLLOW_catchClause_in_catches3692);
			catchClause();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:496:21: ( catchClause )*
			loop115:
			while (true) {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==64) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:496:22: catchClause
					{
					pushFollow(FOLLOW_catchClause_in_catches3695);
					catchClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop115;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:499:1: catchClause : 'catch' '(' formalParameter ')' block ;
	public final void catchClause() throws RecognitionException {
		int catchClause_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:500:5: ( 'catch' '(' formalParameter ')' block )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:500:9: 'catch' '(' formalParameter ')' block
			{
			match(input,64,FOLLOW_64_in_catchClause3720); if (state.failed) return;
			match(input,32,FOLLOW_32_in_catchClause3722); if (state.failed) return;
			pushFollow(FOLLOW_formalParameter_in_catchClause3724);
			formalParameter();
			state._fsp--;
			if (state.failed) return;
			match(input,33,FOLLOW_33_in_catchClause3726); if (state.failed) return;
			pushFollow(FOLLOW_block_in_catchClause3728);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:503:1: formalParameter : variableModifiers type variableDeclaratorId ;
	public final void formalParameter() throws RecognitionException {
		int formalParameter_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:504:5: ( variableModifiers type variableDeclaratorId )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:504:9: variableModifiers type variableDeclaratorId
			{
			pushFollow(FOLLOW_variableModifiers_in_formalParameter3747);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_formalParameter3749);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_variableDeclaratorId_in_formalParameter3751);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:507:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
	public final void switchBlockStatementGroups() throws RecognitionException {
		int switchBlockStatementGroups_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:508:5: ( ( switchBlockStatementGroup )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:508:9: ( switchBlockStatementGroup )*
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:508:9: ( switchBlockStatementGroup )*
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==63||LA116_0==68) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:508:10: switchBlockStatementGroup
					{
					pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups3779);
					switchBlockStatementGroup();
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
			if ( state.backtracking>0 ) { memoize(input, 94, switchBlockStatementGroups_StartIndex); }

		}
	}
	// $ANTLR end "switchBlockStatementGroups"



	// $ANTLR start "switchBlockStatementGroup"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:515:1: switchBlockStatementGroup : ( switchLabel )+ ( blockStatement )* ;
	public final void switchBlockStatementGroup() throws RecognitionException {
		int switchBlockStatementGroup_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:516:5: ( ( switchLabel )+ ( blockStatement )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:516:9: ( switchLabel )+ ( blockStatement )*
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:516:9: ( switchLabel )+
			int cnt117=0;
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==63) ) {
					int LA117_2 = input.LA(2);
					if ( (synpred178_BasForCCal()) ) {
						alt117=1;
					}

				}
				else if ( (LA117_0==68) ) {
					int LA117_3 = input.LA(2);
					if ( (synpred178_BasForCCal()) ) {
						alt117=1;
					}

				}

				switch (alt117) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:516:9: switchLabel
					{
					pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup3806);
					switchLabel();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt117 >= 1 ) break loop117;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(117, input);
					throw eee;
				}
				cnt117++;
			}

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:516:22: ( blockStatement )*
			loop118:
			while (true) {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==ASSERT||(LA118_0 >= CharacterLiteral && LA118_0 <= ENUM)||LA118_0==FloatingPointLiteral||(LA118_0 >= HexLiteral && LA118_0 <= Identifier)||(LA118_0 >= OctalLiteral && LA118_0 <= StringLiteral)||LA118_0==25||LA118_0==32||(LA118_0 >= 36 && LA118_0 <= 37)||(LA118_0 >= 40 && LA118_0 <= 41)||LA118_0==48||LA118_0==54||(LA118_0 >= 59 && LA118_0 <= 62)||(LA118_0 >= 65 && LA118_0 <= 67)||(LA118_0 >= 69 && LA118_0 <= 70)||(LA118_0 >= 73 && LA118_0 <= 74)||(LA118_0 >= 76 && LA118_0 <= 78)||(LA118_0 >= 82 && LA118_0 <= 84)||(LA118_0 >= 86 && LA118_0 <= 87)||(LA118_0 >= 89 && LA118_0 <= 100)||(LA118_0 >= 103 && LA118_0 <= 105)||(LA118_0 >= 107 && LA118_0 <= 108)||LA118_0==113) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:516:22: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup3809);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop118;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:519:1: switchLabel : ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' );
	public final void switchLabel() throws RecognitionException {
		int switchLabel_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:520:5: ( 'case' constantExpression ':' | 'case' enumConstantName ':' | 'default' ':' )
			int alt119=3;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==63) ) {
				int LA119_1 = input.LA(2);
				if ( ((LA119_1 >= CharacterLiteral && LA119_1 <= DecimalLiteral)||LA119_1==FloatingPointLiteral||LA119_1==HexLiteral||(LA119_1 >= OctalLiteral && LA119_1 <= StringLiteral)||LA119_1==25||LA119_1==32||(LA119_1 >= 36 && LA119_1 <= 37)||(LA119_1 >= 40 && LA119_1 <= 41)||LA119_1==60||LA119_1==62||LA119_1==65||LA119_1==70||LA119_1==73||LA119_1==76||LA119_1==82||LA119_1==84||(LA119_1 >= 86 && LA119_1 <= 87)||LA119_1==93||LA119_1==96||LA119_1==99||LA119_1==103||LA119_1==105||LA119_1==113) ) {
					alt119=1;
				}
				else if ( (LA119_1==Identifier) ) {
					int LA119_4 = input.LA(3);
					if ( ((LA119_4 >= 26 && LA119_4 <= 32)||(LA119_4 >= 34 && LA119_4 <= 38)||(LA119_4 >= 40 && LA119_4 <= 43)||(LA119_4 >= 45 && LA119_4 <= 46)||(LA119_4 >= 49 && LA119_4 <= 53)||LA119_4==55||(LA119_4 >= 57 && LA119_4 <= 58)||LA119_4==81||(LA119_4 >= 109 && LA119_4 <= 111)) ) {
						alt119=1;
					}
					else if ( (LA119_4==47) ) {
						int LA119_5 = input.LA(4);
						if ( (synpred180_BasForCCal()) ) {
							alt119=1;
						}
						else if ( (synpred181_BasForCCal()) ) {
							alt119=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 119, 5, input);
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
								new NoViableAltException("", 119, 4, input);
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
							new NoViableAltException("", 119, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA119_0==68) ) {
				alt119=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 119, 0, input);
				throw nvae;
			}

			switch (alt119) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:520:9: 'case' constantExpression ':'
					{
					match(input,63,FOLLOW_63_in_switchLabel3833); if (state.failed) return;
					pushFollow(FOLLOW_constantExpression_in_switchLabel3835);
					constantExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,47,FOLLOW_47_in_switchLabel3837); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:521:9: 'case' enumConstantName ':'
					{
					match(input,63,FOLLOW_63_in_switchLabel3847); if (state.failed) return;
					pushFollow(FOLLOW_enumConstantName_in_switchLabel3849);
					enumConstantName();
					state._fsp--;
					if (state.failed) return;
					match(input,47,FOLLOW_47_in_switchLabel3851); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:522:9: 'default' ':'
					{
					match(input,68,FOLLOW_68_in_switchLabel3861); if (state.failed) return;
					match(input,47,FOLLOW_47_in_switchLabel3863); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:525:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );
	public final void forControl() throws RecognitionException {
		int forControl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:527:5: ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? )
			int alt123=2;
			alt123 = dfa123.predict(input);
			switch (alt123) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:527:9: enhancedForControl
					{
					pushFollow(FOLLOW_enhancedForControl_in_forControl3894);
					enhancedForControl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:528:9: ( forInit )? ';' ( expression )? ';' ( forUpdate )?
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:528:9: ( forInit )?
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( ((LA120_0 >= CharacterLiteral && LA120_0 <= DecimalLiteral)||LA120_0==FloatingPointLiteral||(LA120_0 >= HexLiteral && LA120_0 <= Identifier)||(LA120_0 >= OctalLiteral && LA120_0 <= StringLiteral)||LA120_0==25||LA120_0==32||(LA120_0 >= 36 && LA120_0 <= 37)||(LA120_0 >= 40 && LA120_0 <= 41)||LA120_0==54||LA120_0==60||LA120_0==62||LA120_0==65||LA120_0==70||(LA120_0 >= 73 && LA120_0 <= 74)||LA120_0==76||LA120_0==82||LA120_0==84||(LA120_0 >= 86 && LA120_0 <= 87)||LA120_0==93||LA120_0==96||LA120_0==99||LA120_0==103||LA120_0==105||LA120_0==113) ) {
						alt120=1;
					}
					switch (alt120) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:528:9: forInit
							{
							pushFollow(FOLLOW_forInit_in_forControl3904);
							forInit();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_forControl3907); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:528:22: ( expression )?
					int alt121=2;
					int LA121_0 = input.LA(1);
					if ( ((LA121_0 >= CharacterLiteral && LA121_0 <= DecimalLiteral)||LA121_0==FloatingPointLiteral||(LA121_0 >= HexLiteral && LA121_0 <= Identifier)||(LA121_0 >= OctalLiteral && LA121_0 <= StringLiteral)||LA121_0==25||LA121_0==32||(LA121_0 >= 36 && LA121_0 <= 37)||(LA121_0 >= 40 && LA121_0 <= 41)||LA121_0==60||LA121_0==62||LA121_0==65||LA121_0==70||LA121_0==73||LA121_0==76||LA121_0==82||LA121_0==84||(LA121_0 >= 86 && LA121_0 <= 87)||LA121_0==93||LA121_0==96||LA121_0==99||LA121_0==103||LA121_0==105||LA121_0==113) ) {
						alt121=1;
					}
					switch (alt121) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:528:22: expression
							{
							pushFollow(FOLLOW_expression_in_forControl3909);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,48,FOLLOW_48_in_forControl3912); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:528:38: ( forUpdate )?
					int alt122=2;
					int LA122_0 = input.LA(1);
					if ( ((LA122_0 >= CharacterLiteral && LA122_0 <= DecimalLiteral)||LA122_0==FloatingPointLiteral||(LA122_0 >= HexLiteral && LA122_0 <= Identifier)||(LA122_0 >= OctalLiteral && LA122_0 <= StringLiteral)||LA122_0==25||LA122_0==32||(LA122_0 >= 36 && LA122_0 <= 37)||(LA122_0 >= 40 && LA122_0 <= 41)||LA122_0==60||LA122_0==62||LA122_0==65||LA122_0==70||LA122_0==73||LA122_0==76||LA122_0==82||LA122_0==84||(LA122_0 >= 86 && LA122_0 <= 87)||LA122_0==93||LA122_0==96||LA122_0==99||LA122_0==103||LA122_0==105||LA122_0==113) ) {
						alt122=1;
					}
					switch (alt122) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:528:38: forUpdate
							{
							pushFollow(FOLLOW_forUpdate_in_forControl3914);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:531:1: forInit : ( localVariableDeclaration | expressionList );
	public final void forInit() throws RecognitionException {
		int forInit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:532:5: ( localVariableDeclaration | expressionList )
			int alt124=2;
			switch ( input.LA(1) ) {
			case 54:
			case 74:
				{
				alt124=1;
				}
				break;
			case Identifier:
				{
				int LA124_3 = input.LA(2);
				if ( (synpred186_BasForCCal()) ) {
					alt124=1;
				}
				else if ( (true) ) {
					alt124=2;
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
				int LA124_4 = input.LA(2);
				if ( (synpred186_BasForCCal()) ) {
					alt124=1;
				}
				else if ( (true) ) {
					alt124=2;
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
				alt124=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:532:9: localVariableDeclaration
					{
					pushFollow(FOLLOW_localVariableDeclaration_in_forInit3934);
					localVariableDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:533:9: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forInit3944);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:536:1: enhancedForControl : variableModifiers type Identifier ':' expression ;
	public final void enhancedForControl() throws RecognitionException {
		int enhancedForControl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:537:5: ( variableModifiers type Identifier ':' expression )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:537:9: variableModifiers type Identifier ':' expression
			{
			pushFollow(FOLLOW_variableModifiers_in_enhancedForControl3967);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_enhancedForControl3969);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_enhancedForControl3971); if (state.failed) return;
			match(input,47,FOLLOW_47_in_enhancedForControl3973); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_enhancedForControl3975);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:540:1: forUpdate : expressionList ;
	public final void forUpdate() throws RecognitionException {
		int forUpdate_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:541:5: ( expressionList )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:541:9: expressionList
			{
			pushFollow(FOLLOW_expressionList_in_forUpdate3994);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:546:1: parExpression : '(' expression ')' ;
	public final void parExpression() throws RecognitionException {
		int parExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:547:5: ( '(' expression ')' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:547:9: '(' expression ')'
			{
			match(input,32,FOLLOW_32_in_parExpression4015); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_parExpression4017);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,33,FOLLOW_33_in_parExpression4019); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:550:1: expressionList : expression ( ',' expression )* ;
	public final void expressionList() throws RecognitionException {
		int expressionList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:551:5: ( expression ( ',' expression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:551:9: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList4042);
			expression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:551:20: ( ',' expression )*
			loop125:
			while (true) {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==39) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:551:21: ',' expression
					{
					match(input,39,FOLLOW_39_in_expressionList4045); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_expressionList4047);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop125;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:554:1: statementExpression : expression ;
	public final void statementExpression() throws RecognitionException {
		int statementExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:555:5: ( expression )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:555:9: expression
			{
			pushFollow(FOLLOW_expression_in_statementExpression4068);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:558:1: constantExpression : expression ;
	public final void constantExpression() throws RecognitionException {
		int constantExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:559:5: ( expression )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:559:9: expression
			{
			pushFollow(FOLLOW_expression_in_constantExpression4091);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:562:1: expression : conditionalExpression ( assignmentOperator expression )? ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:563:5: ( conditionalExpression ( assignmentOperator expression )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:563:9: conditionalExpression ( assignmentOperator expression )?
			{
			pushFollow(FOLLOW_conditionalExpression_in_expression4114);
			conditionalExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:563:31: ( assignmentOperator expression )?
			int alt126=2;
			switch ( input.LA(1) ) {
				case 50:
					{
					int LA126_1 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt126=1;
					}
					}
					break;
				case 38:
					{
					int LA126_2 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt126=1;
					}
					}
					break;
				case 42:
					{
					int LA126_3 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt126=1;
					}
					}
					break;
				case 35:
					{
					int LA126_4 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt126=1;
					}
					}
					break;
				case 46:
					{
					int LA126_5 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt126=1;
					}
					}
					break;
				case 31:
					{
					int LA126_6 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt126=1;
					}
					}
					break;
				case 110:
					{
					int LA126_7 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt126=1;
					}
					}
					break;
				case 58:
					{
					int LA126_8 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt126=1;
					}
					}
					break;
				case 28:
					{
					int LA126_9 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt126=1;
					}
					}
					break;
				case 49:
					{
					int LA126_10 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt126=1;
					}
					}
					break;
				case 52:
					{
					int LA126_11 = input.LA(2);
					if ( (synpred188_BasForCCal()) ) {
						alt126=1;
					}
					}
					break;
			}
			switch (alt126) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:563:32: assignmentOperator expression
					{
					pushFollow(FOLLOW_assignmentOperator_in_expression4117);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expression_in_expression4119);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:566:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?| ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?| ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?);
	public final void assignmentOperator() throws RecognitionException {
		int assignmentOperator_StartIndex = input.index();

		Token t1=null;
		Token t2=null;
		Token t3=null;
		Token t4=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:567:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?| ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?| ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?)
			int alt127=12;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==50) ) {
				alt127=1;
			}
			else if ( (LA127_0==38) ) {
				alt127=2;
			}
			else if ( (LA127_0==42) ) {
				alt127=3;
			}
			else if ( (LA127_0==35) ) {
				alt127=4;
			}
			else if ( (LA127_0==46) ) {
				alt127=5;
			}
			else if ( (LA127_0==31) ) {
				alt127=6;
			}
			else if ( (LA127_0==110) ) {
				alt127=7;
			}
			else if ( (LA127_0==58) ) {
				alt127=8;
			}
			else if ( (LA127_0==28) ) {
				alt127=9;
			}
			else if ( (LA127_0==49) && (synpred198_BasForCCal())) {
				alt127=10;
			}
			else if ( (LA127_0==52) ) {
				int LA127_11 = input.LA(2);
				if ( (LA127_11==52) ) {
					int LA127_12 = input.LA(3);
					if ( (LA127_12==52) && (synpred199_BasForCCal())) {
						alt127=11;
					}
					else if ( (LA127_12==50) && (synpred200_BasForCCal())) {
						alt127=12;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 127, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}

			switch (alt127) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:567:9: '='
					{
					match(input,50,FOLLOW_50_in_assignmentOperator4144); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:568:9: '+='
					{
					match(input,38,FOLLOW_38_in_assignmentOperator4154); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:569:9: '-='
					{
					match(input,42,FOLLOW_42_in_assignmentOperator4164); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:570:9: '*='
					{
					match(input,35,FOLLOW_35_in_assignmentOperator4174); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:571:9: '/='
					{
					match(input,46,FOLLOW_46_in_assignmentOperator4184); if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:572:9: '&='
					{
					match(input,31,FOLLOW_31_in_assignmentOperator4194); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:573:9: '|='
					{
					match(input,110,FOLLOW_110_in_assignmentOperator4204); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:574:9: '^='
					{
					match(input,58,FOLLOW_58_in_assignmentOperator4214); if (state.failed) return;
					}
					break;
				case 9 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:575:9: '%='
					{
					match(input,28,FOLLOW_28_in_assignmentOperator4224); if (state.failed) return;
					}
					break;
				case 10 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:576:9: ( '<' '<' '=' )=>t1= '<' t2= '<' t3= '=' {...}?
					{
					t1=(Token)match(input,49,FOLLOW_49_in_assignmentOperator4245); if (state.failed) return;
					t2=(Token)match(input,49,FOLLOW_49_in_assignmentOperator4249); if (state.failed) return;
					t3=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4253); if (state.failed) return;
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:581:9: ( '>' '>' '>' '=' )=>t1= '>' t2= '>' t3= '>' t4= '=' {...}?
					{
					t1=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4287); if (state.failed) return;
					t2=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4291); if (state.failed) return;
					t3=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4295); if (state.failed) return;
					t4=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4299); if (state.failed) return;
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:588:9: ( '>' '>' '=' )=>t1= '>' t2= '>' t3= '=' {...}?
					{
					t1=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4330); if (state.failed) return;
					t2=(Token)match(input,52,FOLLOW_52_in_assignmentOperator4334); if (state.failed) return;
					t3=(Token)match(input,50,FOLLOW_50_in_assignmentOperator4338); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:595:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' expression )? ;
	public final void conditionalExpression() throws RecognitionException {
		int conditionalExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:596:5: ( conditionalOrExpression ( '?' expression ':' expression )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:596:9: conditionalOrExpression ( '?' expression ':' expression )?
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression4367);
			conditionalOrExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:596:33: ( '?' expression ':' expression )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==53) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:596:35: '?' expression ':' expression
					{
					match(input,53,FOLLOW_53_in_conditionalExpression4371); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_conditionalExpression4373);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,47,FOLLOW_47_in_conditionalExpression4375); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_conditionalExpression4377);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:599:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
	public final void conditionalOrExpression() throws RecognitionException {
		int conditionalOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:600:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:600:9: conditionalAndExpression ( '||' conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression4399);
			conditionalAndExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:600:34: ( '||' conditionalAndExpression )*
			loop129:
			while (true) {
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==111) ) {
					alt129=1;
				}

				switch (alt129) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:600:36: '||' conditionalAndExpression
					{
					match(input,111,FOLLOW_111_in_conditionalOrExpression4403); if (state.failed) return;
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression4405);
					conditionalAndExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop129;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:603:1: conditionalAndExpression : inclusiveOrExpression ( '&&' inclusiveOrExpression )* ;
	public final void conditionalAndExpression() throws RecognitionException {
		int conditionalAndExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:604:5: ( inclusiveOrExpression ( '&&' inclusiveOrExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:604:9: inclusiveOrExpression ( '&&' inclusiveOrExpression )*
			{
			pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4427);
			inclusiveOrExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:604:31: ( '&&' inclusiveOrExpression )*
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==29) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:604:33: '&&' inclusiveOrExpression
					{
					match(input,29,FOLLOW_29_in_conditionalAndExpression4431); if (state.failed) return;
					pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4433);
					inclusiveOrExpression();
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
			if ( state.backtracking>0 ) { memoize(input, 109, conditionalAndExpression_StartIndex); }

		}
	}
	// $ANTLR end "conditionalAndExpression"



	// $ANTLR start "inclusiveOrExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:607:1: inclusiveOrExpression : exclusiveOrExpression ( '|' exclusiveOrExpression )* ;
	public final void inclusiveOrExpression() throws RecognitionException {
		int inclusiveOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:608:5: ( exclusiveOrExpression ( '|' exclusiveOrExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:608:9: exclusiveOrExpression ( '|' exclusiveOrExpression )*
			{
			pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4455);
			exclusiveOrExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:608:31: ( '|' exclusiveOrExpression )*
			loop131:
			while (true) {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==109) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:608:33: '|' exclusiveOrExpression
					{
					match(input,109,FOLLOW_109_in_inclusiveOrExpression4459); if (state.failed) return;
					pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4461);
					exclusiveOrExpression();
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
			if ( state.backtracking>0 ) { memoize(input, 110, inclusiveOrExpression_StartIndex); }

		}
	}
	// $ANTLR end "inclusiveOrExpression"



	// $ANTLR start "exclusiveOrExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:611:1: exclusiveOrExpression : andExpression ( '^' andExpression )* ;
	public final void exclusiveOrExpression() throws RecognitionException {
		int exclusiveOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:612:5: ( andExpression ( '^' andExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:612:9: andExpression ( '^' andExpression )*
			{
			pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression4483);
			andExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:612:23: ( '^' andExpression )*
			loop132:
			while (true) {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==57) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:612:25: '^' andExpression
					{
					match(input,57,FOLLOW_57_in_exclusiveOrExpression4487); if (state.failed) return;
					pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression4489);
					andExpression();
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
			if ( state.backtracking>0 ) { memoize(input, 111, exclusiveOrExpression_StartIndex); }

		}
	}
	// $ANTLR end "exclusiveOrExpression"



	// $ANTLR start "andExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:615:1: andExpression : equalityExpression ( '&' equalityExpression )* ;
	public final void andExpression() throws RecognitionException {
		int andExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:616:5: ( equalityExpression ( '&' equalityExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:616:9: equalityExpression ( '&' equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_andExpression4511);
			equalityExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:616:28: ( '&' equalityExpression )*
			loop133:
			while (true) {
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==30) ) {
					alt133=1;
				}

				switch (alt133) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:616:30: '&' equalityExpression
					{
					match(input,30,FOLLOW_30_in_andExpression4515); if (state.failed) return;
					pushFollow(FOLLOW_equalityExpression_in_andExpression4517);
					equalityExpression();
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
			if ( state.backtracking>0 ) { memoize(input, 112, andExpression_StartIndex); }

		}
	}
	// $ANTLR end "andExpression"



	// $ANTLR start "equalityExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:619:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
	public final void equalityExpression() throws RecognitionException {
		int equalityExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:620:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:620:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
			{
			pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression4539);
			instanceOfExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:620:30: ( ( '==' | '!=' ) instanceOfExpression )*
			loop134:
			while (true) {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==26||LA134_0==51) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:620:32: ( '==' | '!=' ) instanceOfExpression
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
					pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression4551);
					instanceOfExpression();
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
			if ( state.backtracking>0 ) { memoize(input, 113, equalityExpression_StartIndex); }

		}
	}
	// $ANTLR end "equalityExpression"



	// $ANTLR start "instanceOfExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:623:1: instanceOfExpression : relationalExpression ( 'instanceof' type )? ;
	public final void instanceOfExpression() throws RecognitionException {
		int instanceOfExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:624:5: ( relationalExpression ( 'instanceof' type )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:624:9: relationalExpression ( 'instanceof' type )?
			{
			pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression4573);
			relationalExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:624:30: ( 'instanceof' type )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==81) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:624:31: 'instanceof' type
					{
					match(input,81,FOLLOW_81_in_instanceOfExpression4576); if (state.failed) return;
					pushFollow(FOLLOW_type_in_instanceOfExpression4578);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:627:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
	public final void relationalExpression() throws RecognitionException {
		int relationalExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:628:5: ( shiftExpression ( relationalOp shiftExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:628:9: shiftExpression ( relationalOp shiftExpression )*
			{
			pushFollow(FOLLOW_shiftExpression_in_relationalExpression4599);
			shiftExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:628:25: ( relationalOp shiftExpression )*
			loop136:
			while (true) {
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==49) ) {
					int LA136_2 = input.LA(2);
					if ( ((LA136_2 >= CharacterLiteral && LA136_2 <= DecimalLiteral)||LA136_2==FloatingPointLiteral||(LA136_2 >= HexLiteral && LA136_2 <= Identifier)||(LA136_2 >= OctalLiteral && LA136_2 <= StringLiteral)||LA136_2==25||LA136_2==32||(LA136_2 >= 36 && LA136_2 <= 37)||(LA136_2 >= 40 && LA136_2 <= 41)||LA136_2==50||LA136_2==60||LA136_2==62||LA136_2==65||LA136_2==70||LA136_2==73||LA136_2==76||LA136_2==82||LA136_2==84||(LA136_2 >= 86 && LA136_2 <= 87)||LA136_2==93||LA136_2==96||LA136_2==99||LA136_2==103||LA136_2==105||LA136_2==113) ) {
						alt136=1;
					}

				}
				else if ( (LA136_0==52) ) {
					int LA136_3 = input.LA(2);
					if ( ((LA136_3 >= CharacterLiteral && LA136_3 <= DecimalLiteral)||LA136_3==FloatingPointLiteral||(LA136_3 >= HexLiteral && LA136_3 <= Identifier)||(LA136_3 >= OctalLiteral && LA136_3 <= StringLiteral)||LA136_3==25||LA136_3==32||(LA136_3 >= 36 && LA136_3 <= 37)||(LA136_3 >= 40 && LA136_3 <= 41)||LA136_3==50||LA136_3==60||LA136_3==62||LA136_3==65||LA136_3==70||LA136_3==73||LA136_3==76||LA136_3==82||LA136_3==84||(LA136_3 >= 86 && LA136_3 <= 87)||LA136_3==93||LA136_3==96||LA136_3==99||LA136_3==103||LA136_3==105||LA136_3==113) ) {
						alt136=1;
					}

				}

				switch (alt136) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:628:27: relationalOp shiftExpression
					{
					pushFollow(FOLLOW_relationalOp_in_relationalExpression4603);
					relationalOp();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_shiftExpression_in_relationalExpression4605);
					shiftExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop136;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:631:1: relationalOp : ( ( '<' '=' )=>t1= '<' t2= '=' {...}?| ( '>' '=' )=>t1= '>' t2= '=' {...}?| '<' | '>' );
	public final void relationalOp() throws RecognitionException {
		int relationalOp_StartIndex = input.index();

		Token t1=null;
		Token t2=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:632:5: ( ( '<' '=' )=>t1= '<' t2= '=' {...}?| ( '>' '=' )=>t1= '>' t2= '=' {...}?| '<' | '>' )
			int alt137=4;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==49) ) {
				int LA137_1 = input.LA(2);
				if ( (LA137_1==50) && (synpred211_BasForCCal())) {
					alt137=1;
				}
				else if ( ((LA137_1 >= CharacterLiteral && LA137_1 <= DecimalLiteral)||LA137_1==FloatingPointLiteral||(LA137_1 >= HexLiteral && LA137_1 <= Identifier)||(LA137_1 >= OctalLiteral && LA137_1 <= StringLiteral)||LA137_1==25||LA137_1==32||(LA137_1 >= 36 && LA137_1 <= 37)||(LA137_1 >= 40 && LA137_1 <= 41)||LA137_1==60||LA137_1==62||LA137_1==65||LA137_1==70||LA137_1==73||LA137_1==76||LA137_1==82||LA137_1==84||(LA137_1 >= 86 && LA137_1 <= 87)||LA137_1==93||LA137_1==96||LA137_1==99||LA137_1==103||LA137_1==105||LA137_1==113) ) {
					alt137=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 137, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA137_0==52) ) {
				int LA137_2 = input.LA(2);
				if ( (LA137_2==50) && (synpred212_BasForCCal())) {
					alt137=2;
				}
				else if ( ((LA137_2 >= CharacterLiteral && LA137_2 <= DecimalLiteral)||LA137_2==FloatingPointLiteral||(LA137_2 >= HexLiteral && LA137_2 <= Identifier)||(LA137_2 >= OctalLiteral && LA137_2 <= StringLiteral)||LA137_2==25||LA137_2==32||(LA137_2 >= 36 && LA137_2 <= 37)||(LA137_2 >= 40 && LA137_2 <= 41)||LA137_2==60||LA137_2==62||LA137_2==65||LA137_2==70||LA137_2==73||LA137_2==76||LA137_2==82||LA137_2==84||(LA137_2 >= 86 && LA137_2 <= 87)||LA137_2==93||LA137_2==96||LA137_2==99||LA137_2==103||LA137_2==105||LA137_2==113) ) {
					alt137=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 137, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 137, 0, input);
				throw nvae;
			}

			switch (alt137) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:632:9: ( '<' '=' )=>t1= '<' t2= '=' {...}?
					{
					t1=(Token)match(input,49,FOLLOW_49_in_relationalOp4640); if (state.failed) return;
					t2=(Token)match(input,50,FOLLOW_50_in_relationalOp4644); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "relationalOp", " $t1.getLine() == $t2.getLine() && \r\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
					}
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:635:9: ( '>' '=' )=>t1= '>' t2= '=' {...}?
					{
					t1=(Token)match(input,52,FOLLOW_52_in_relationalOp4674); if (state.failed) return;
					t2=(Token)match(input,50,FOLLOW_50_in_relationalOp4678); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "relationalOp", " $t1.getLine() == $t2.getLine() && \r\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
					}
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:638:9: '<'
					{
					match(input,49,FOLLOW_49_in_relationalOp4699); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:639:9: '>'
					{
					match(input,52,FOLLOW_52_in_relationalOp4710); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:642:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
	public final void shiftExpression() throws RecognitionException {
		int shiftExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:643:5: ( additiveExpression ( shiftOp additiveExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:643:9: additiveExpression ( shiftOp additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_shiftExpression4730);
			additiveExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:643:28: ( shiftOp additiveExpression )*
			loop138:
			while (true) {
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==49) ) {
					int LA138_1 = input.LA(2);
					if ( (LA138_1==49) ) {
						int LA138_4 = input.LA(3);
						if ( ((LA138_4 >= CharacterLiteral && LA138_4 <= DecimalLiteral)||LA138_4==FloatingPointLiteral||(LA138_4 >= HexLiteral && LA138_4 <= Identifier)||(LA138_4 >= OctalLiteral && LA138_4 <= StringLiteral)||LA138_4==25||LA138_4==32||(LA138_4 >= 36 && LA138_4 <= 37)||(LA138_4 >= 40 && LA138_4 <= 41)||LA138_4==60||LA138_4==62||LA138_4==65||LA138_4==70||LA138_4==73||LA138_4==76||LA138_4==82||LA138_4==84||(LA138_4 >= 86 && LA138_4 <= 87)||LA138_4==93||LA138_4==96||LA138_4==99||LA138_4==103||LA138_4==105||LA138_4==113) ) {
							alt138=1;
						}

					}

				}
				else if ( (LA138_0==52) ) {
					int LA138_2 = input.LA(2);
					if ( (LA138_2==52) ) {
						int LA138_5 = input.LA(3);
						if ( (LA138_5==52) ) {
							int LA138_7 = input.LA(4);
							if ( ((LA138_7 >= CharacterLiteral && LA138_7 <= DecimalLiteral)||LA138_7==FloatingPointLiteral||(LA138_7 >= HexLiteral && LA138_7 <= Identifier)||(LA138_7 >= OctalLiteral && LA138_7 <= StringLiteral)||LA138_7==25||LA138_7==32||(LA138_7 >= 36 && LA138_7 <= 37)||(LA138_7 >= 40 && LA138_7 <= 41)||LA138_7==60||LA138_7==62||LA138_7==65||LA138_7==70||LA138_7==73||LA138_7==76||LA138_7==82||LA138_7==84||(LA138_7 >= 86 && LA138_7 <= 87)||LA138_7==93||LA138_7==96||LA138_7==99||LA138_7==103||LA138_7==105||LA138_7==113) ) {
								alt138=1;
							}

						}
						else if ( ((LA138_5 >= CharacterLiteral && LA138_5 <= DecimalLiteral)||LA138_5==FloatingPointLiteral||(LA138_5 >= HexLiteral && LA138_5 <= Identifier)||(LA138_5 >= OctalLiteral && LA138_5 <= StringLiteral)||LA138_5==25||LA138_5==32||(LA138_5 >= 36 && LA138_5 <= 37)||(LA138_5 >= 40 && LA138_5 <= 41)||LA138_5==60||LA138_5==62||LA138_5==65||LA138_5==70||LA138_5==73||LA138_5==76||LA138_5==82||LA138_5==84||(LA138_5 >= 86 && LA138_5 <= 87)||LA138_5==93||LA138_5==96||LA138_5==99||LA138_5==103||LA138_5==105||LA138_5==113) ) {
							alt138=1;
						}

					}

				}

				switch (alt138) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:643:30: shiftOp additiveExpression
					{
					pushFollow(FOLLOW_shiftOp_in_shiftExpression4734);
					shiftOp();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_additiveExpression_in_shiftExpression4736);
					additiveExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop138;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:646:1: shiftOp : ( ( '<' '<' )=>t1= '<' t2= '<' {...}?| ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?| ( '>' '>' )=>t1= '>' t2= '>' {...}?);
	public final void shiftOp() throws RecognitionException {
		int shiftOp_StartIndex = input.index();

		Token t1=null;
		Token t2=null;
		Token t3=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:647:5: ( ( '<' '<' )=>t1= '<' t2= '<' {...}?| ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?| ( '>' '>' )=>t1= '>' t2= '>' {...}?)
			int alt139=3;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==49) && (synpred215_BasForCCal())) {
				alt139=1;
			}
			else if ( (LA139_0==52) ) {
				int LA139_2 = input.LA(2);
				if ( (LA139_2==52) ) {
					int LA139_3 = input.LA(3);
					if ( (LA139_3==52) && (synpred216_BasForCCal())) {
						alt139=2;
					}
					else if ( (LA139_3==36) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==40) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==37) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==41) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==113) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==25) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==32) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==99) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==96) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==DecimalLiteral||LA139_3==HexLiteral||LA139_3==OctalLiteral) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==FloatingPointLiteral) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==CharacterLiteral) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==StringLiteral) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==73||LA139_3==103) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==87) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==86) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==Identifier) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==60||LA139_3==62||LA139_3==65||LA139_3==70||LA139_3==76||LA139_3==82||LA139_3==84||LA139_3==93) && (synpred217_BasForCCal())) {
						alt139=3;
					}
					else if ( (LA139_3==105) && (synpred217_BasForCCal())) {
						alt139=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 139, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 139, 0, input);
				throw nvae;
			}

			switch (alt139) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:647:9: ( '<' '<' )=>t1= '<' t2= '<' {...}?
					{
					t1=(Token)match(input,49,FOLLOW_49_in_shiftOp4767); if (state.failed) return;
					t2=(Token)match(input,49,FOLLOW_49_in_shiftOp4771); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \r\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
					}
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:650:9: ( '>' '>' '>' )=>t1= '>' t2= '>' t3= '>' {...}?
					{
					t1=(Token)match(input,52,FOLLOW_52_in_shiftOp4803); if (state.failed) return;
					t2=(Token)match(input,52,FOLLOW_52_in_shiftOp4807); if (state.failed) return;
					t3=(Token)match(input,52,FOLLOW_52_in_shiftOp4811); if (state.failed) return;
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:655:9: ( '>' '>' )=>t1= '>' t2= '>' {...}?
					{
					t1=(Token)match(input,52,FOLLOW_52_in_shiftOp4841); if (state.failed) return;
					t2=(Token)match(input,52,FOLLOW_52_in_shiftOp4845); if (state.failed) return;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:661:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
	public final void additiveExpression() throws RecognitionException {
		int additiveExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:662:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:662:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4875);
			multiplicativeExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:662:34: ( ( '+' | '-' ) multiplicativeExpression )*
			loop140:
			while (true) {
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==36||LA140_0==40) ) {
					alt140=1;
				}

				switch (alt140) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:662:36: ( '+' | '-' ) multiplicativeExpression
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
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4887);
					multiplicativeExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop140;
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:665:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
	public final void multiplicativeExpression() throws RecognitionException {
		int multiplicativeExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:666:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:666:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4909);
			unaryExpression();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:666:25: ( ( '*' | '/' | '%' ) unaryExpression )*
			loop141:
			while (true) {
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==27||LA141_0==34||LA141_0==45) ) {
					alt141=1;
				}

				switch (alt141) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:666:27: ( '*' | '/' | '%' ) unaryExpression
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
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4927);
					unaryExpression();
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
			if ( state.backtracking>0 ) { memoize(input, 120, multiplicativeExpression_StartIndex); }

		}
	}
	// $ANTLR end "multiplicativeExpression"



	// $ANTLR start "unaryExpression"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:669:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
	public final void unaryExpression() throws RecognitionException {
		int unaryExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:670:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
			int alt142=5;
			switch ( input.LA(1) ) {
			case 36:
				{
				alt142=1;
				}
				break;
			case 40:
				{
				alt142=2;
				}
				break;
			case 37:
				{
				alt142=3;
				}
				break;
			case 41:
				{
				alt142=4;
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
				alt142=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 142, 0, input);
				throw nvae;
			}
			switch (alt142) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:670:9: '+' unaryExpression
					{
					match(input,36,FOLLOW_36_in_unaryExpression4953); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression4955);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:671:9: '-' unaryExpression
					{
					match(input,40,FOLLOW_40_in_unaryExpression4965); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression4967);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:672:9: '++' unaryExpression
					{
					match(input,37,FOLLOW_37_in_unaryExpression4977); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression4979);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:673:9: '--' unaryExpression
					{
					match(input,41,FOLLOW_41_in_unaryExpression4989); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression4991);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:674:9: unaryExpressionNotPlusMinus
					{
					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression5001);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:677:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? );
	public final void unaryExpressionNotPlusMinus() throws RecognitionException {
		int unaryExpressionNotPlusMinus_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:678:5: ( '~' unaryExpression | '!' unaryExpression | castExpression | primary ( selector )* ( '++' | '--' )? )
			int alt145=4;
			switch ( input.LA(1) ) {
			case 113:
				{
				alt145=1;
				}
				break;
			case 25:
				{
				alt145=2;
				}
				break;
			case 32:
				{
				int LA145_3 = input.LA(2);
				if ( (synpred229_BasForCCal()) ) {
					alt145=3;
				}
				else if ( (true) ) {
					alt145=4;
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
				alt145=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}
			switch (alt145) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:678:9: '~' unaryExpression
					{
					match(input,113,FOLLOW_113_in_unaryExpressionNotPlusMinus5020); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5022);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:679:9: '!' unaryExpression
					{
					match(input,25,FOLLOW_25_in_unaryExpressionNotPlusMinus5032); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5034);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:680:9: castExpression
					{
					pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus5044);
					castExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:681:9: primary ( selector )* ( '++' | '--' )?
					{
					pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus5054);
					primary();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:681:17: ( selector )*
					loop143:
					while (true) {
						int alt143=2;
						int LA143_0 = input.LA(1);
						if ( (LA143_0==43||LA143_0==55) ) {
							alt143=1;
						}

						switch (alt143) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:681:17: selector
							{
							pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus5056);
							selector();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop143;
						}
					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:681:27: ( '++' | '--' )?
					int alt144=2;
					int LA144_0 = input.LA(1);
					if ( (LA144_0==37||LA144_0==41) ) {
						alt144=1;
					}
					switch (alt144) {
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:684:1: castExpression : ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus );
	public final void castExpression() throws RecognitionException {
		int castExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:5: ( '(' primitiveType ')' unaryExpression | '(' ( type | expression ) ')' unaryExpressionNotPlusMinus )
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==32) ) {
				int LA147_1 = input.LA(2);
				if ( (synpred233_BasForCCal()) ) {
					alt147=1;
				}
				else if ( (true) ) {
					alt147=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 147, 0, input);
				throw nvae;
			}

			switch (alt147) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:8: '(' primitiveType ')' unaryExpression
					{
					match(input,32,FOLLOW_32_in_castExpression5082); if (state.failed) return;
					pushFollow(FOLLOW_primitiveType_in_castExpression5084);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					match(input,33,FOLLOW_33_in_castExpression5086); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_castExpression5088);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:686:8: '(' ( type | expression ) ')' unaryExpressionNotPlusMinus
					{
					match(input,32,FOLLOW_32_in_castExpression5097); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:686:12: ( type | expression )
					int alt146=2;
					alt146 = dfa146.predict(input);
					switch (alt146) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:686:13: type
							{
							pushFollow(FOLLOW_type_in_castExpression5100);
							type();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:686:20: expression
							{
							pushFollow(FOLLOW_expression_in_castExpression5104);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,33,FOLLOW_33_in_castExpression5107); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression5109);
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
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:689:1: primary : ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator | Identifier ( '.' Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' );
	public final void primary() throws RecognitionException {
		int primary_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:690:5: ( parExpression | 'this' ( '.' Identifier )* ( identifierSuffix )? | 'super' superSuffix | literal | 'new' creator | Identifier ( '.' Identifier )* ( identifierSuffix )? | primitiveType ( '[' ']' )* '.' 'class' | 'void' '.' 'class' )
			int alt153=8;
			switch ( input.LA(1) ) {
			case 32:
				{
				alt153=1;
				}
				break;
			case 99:
				{
				alt153=2;
				}
				break;
			case 96:
				{
				alt153=3;
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
				alt153=4;
				}
				break;
			case 86:
				{
				alt153=5;
				}
				break;
			case Identifier:
				{
				alt153=6;
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
				alt153=7;
				}
				break;
			case 105:
				{
				alt153=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 153, 0, input);
				throw nvae;
			}
			switch (alt153) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:690:9: parExpression
					{
					pushFollow(FOLLOW_parExpression_in_primary5128);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:691:9: 'this' ( '.' Identifier )* ( identifierSuffix )?
					{
					match(input,99,FOLLOW_99_in_primary5138); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:691:16: ( '.' Identifier )*
					loop148:
					while (true) {
						int alt148=2;
						int LA148_0 = input.LA(1);
						if ( (LA148_0==43) ) {
							int LA148_2 = input.LA(2);
							if ( (LA148_2==Identifier) ) {
								int LA148_3 = input.LA(3);
								if ( (synpred236_BasForCCal()) ) {
									alt148=1;
								}

							}

						}

						switch (alt148) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:691:17: '.' Identifier
							{
							match(input,43,FOLLOW_43_in_primary5141); if (state.failed) return;
							match(input,Identifier,FOLLOW_Identifier_in_primary5143); if (state.failed) return;
							}
							break;

						default :
							break loop148;
						}
					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:691:34: ( identifierSuffix )?
					int alt149=2;
					switch ( input.LA(1) ) {
						case 55:
							{
							int LA149_1 = input.LA(2);
							if ( (synpred237_BasForCCal()) ) {
								alt149=1;
							}
							}
							break;
						case 32:
							{
							alt149=1;
							}
							break;
						case 43:
							{
							int LA149_3 = input.LA(2);
							if ( (synpred237_BasForCCal()) ) {
								alt149=1;
							}
							}
							break;
					}
					switch (alt149) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:691:34: identifierSuffix
							{
							pushFollow(FOLLOW_identifierSuffix_in_primary5147);
							identifierSuffix();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:692:9: 'super' superSuffix
					{
					match(input,96,FOLLOW_96_in_primary5158); if (state.failed) return;
					pushFollow(FOLLOW_superSuffix_in_primary5160);
					superSuffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:693:9: literal
					{
					pushFollow(FOLLOW_literal_in_primary5170);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:694:9: 'new' creator
					{
					match(input,86,FOLLOW_86_in_primary5180); if (state.failed) return;
					pushFollow(FOLLOW_creator_in_primary5182);
					creator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:695:9: Identifier ( '.' Identifier )* ( identifierSuffix )?
					{
					match(input,Identifier,FOLLOW_Identifier_in_primary5192); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:695:20: ( '.' Identifier )*
					loop150:
					while (true) {
						int alt150=2;
						int LA150_0 = input.LA(1);
						if ( (LA150_0==43) ) {
							int LA150_2 = input.LA(2);
							if ( (LA150_2==Identifier) ) {
								int LA150_3 = input.LA(3);
								if ( (synpred242_BasForCCal()) ) {
									alt150=1;
								}

							}

						}

						switch (alt150) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:695:21: '.' Identifier
							{
							match(input,43,FOLLOW_43_in_primary5195); if (state.failed) return;
							match(input,Identifier,FOLLOW_Identifier_in_primary5197); if (state.failed) return;
							}
							break;

						default :
							break loop150;
						}
					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:695:38: ( identifierSuffix )?
					int alt151=2;
					switch ( input.LA(1) ) {
						case 55:
							{
							int LA151_1 = input.LA(2);
							if ( (synpred243_BasForCCal()) ) {
								alt151=1;
							}
							}
							break;
						case 32:
							{
							alt151=1;
							}
							break;
						case 43:
							{
							int LA151_3 = input.LA(2);
							if ( (synpred243_BasForCCal()) ) {
								alt151=1;
							}
							}
							break;
					}
					switch (alt151) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:695:38: identifierSuffix
							{
							pushFollow(FOLLOW_identifierSuffix_in_primary5201);
							identifierSuffix();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:696:9: primitiveType ( '[' ']' )* '.' 'class'
					{
					pushFollow(FOLLOW_primitiveType_in_primary5212);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:696:23: ( '[' ']' )*
					loop152:
					while (true) {
						int alt152=2;
						int LA152_0 = input.LA(1);
						if ( (LA152_0==55) ) {
							alt152=1;
						}

						switch (alt152) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:696:24: '[' ']'
							{
							match(input,55,FOLLOW_55_in_primary5215); if (state.failed) return;
							match(input,56,FOLLOW_56_in_primary5217); if (state.failed) return;
							}
							break;

						default :
							break loop152;
						}
					}

					match(input,43,FOLLOW_43_in_primary5221); if (state.failed) return;
					match(input,66,FOLLOW_66_in_primary5223); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:697:9: 'void' '.' 'class'
					{
					match(input,105,FOLLOW_105_in_primary5233); if (state.failed) return;
					match(input,43,FOLLOW_43_in_primary5235); if (state.failed) return;
					match(input,66,FOLLOW_66_in_primary5237); if (state.failed) return;
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



	// $ANTLR start "identifierSuffix"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:700:1: identifierSuffix : ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator );
	public final void identifierSuffix() throws RecognitionException {
		int identifierSuffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:701:5: ( ( '[' ']' )+ '.' 'class' | ( '[' expression ']' )+ | arguments | '.' 'class' | '.' explicitGenericInvocation | '.' 'this' | '.' 'super' arguments | '.' 'new' innerCreator )
			int alt156=8;
			switch ( input.LA(1) ) {
			case 55:
				{
				int LA156_1 = input.LA(2);
				if ( (LA156_1==56) ) {
					alt156=1;
				}
				else if ( ((LA156_1 >= CharacterLiteral && LA156_1 <= DecimalLiteral)||LA156_1==FloatingPointLiteral||(LA156_1 >= HexLiteral && LA156_1 <= Identifier)||(LA156_1 >= OctalLiteral && LA156_1 <= StringLiteral)||LA156_1==25||LA156_1==32||(LA156_1 >= 36 && LA156_1 <= 37)||(LA156_1 >= 40 && LA156_1 <= 41)||LA156_1==60||LA156_1==62||LA156_1==65||LA156_1==70||LA156_1==73||LA156_1==76||LA156_1==82||LA156_1==84||(LA156_1 >= 86 && LA156_1 <= 87)||LA156_1==93||LA156_1==96||LA156_1==99||LA156_1==103||LA156_1==105||LA156_1==113) ) {
					alt156=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 156, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 32:
				{
				alt156=3;
				}
				break;
			case 43:
				{
				switch ( input.LA(2) ) {
				case 66:
					{
					alt156=4;
					}
					break;
				case 99:
					{
					alt156=6;
					}
					break;
				case 96:
					{
					alt156=7;
					}
					break;
				case 86:
					{
					alt156=8;
					}
					break;
				case 49:
					{
					alt156=5;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 156, 3, input);
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
					new NoViableAltException("", 156, 0, input);
				throw nvae;
			}
			switch (alt156) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:701:9: ( '[' ']' )+ '.' 'class'
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:701:9: ( '[' ']' )+
					int cnt154=0;
					loop154:
					while (true) {
						int alt154=2;
						int LA154_0 = input.LA(1);
						if ( (LA154_0==55) ) {
							alt154=1;
						}

						switch (alt154) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:701:10: '[' ']'
							{
							match(input,55,FOLLOW_55_in_identifierSuffix5257); if (state.failed) return;
							match(input,56,FOLLOW_56_in_identifierSuffix5259); if (state.failed) return;
							}
							break;

						default :
							if ( cnt154 >= 1 ) break loop154;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(154, input);
							throw eee;
						}
						cnt154++;
					}

					match(input,43,FOLLOW_43_in_identifierSuffix5263); if (state.failed) return;
					match(input,66,FOLLOW_66_in_identifierSuffix5265); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:702:9: ( '[' expression ']' )+
					{
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:702:9: ( '[' expression ']' )+
					int cnt155=0;
					loop155:
					while (true) {
						int alt155=2;
						int LA155_0 = input.LA(1);
						if ( (LA155_0==55) ) {
							int LA155_2 = input.LA(2);
							if ( (synpred249_BasForCCal()) ) {
								alt155=1;
							}

						}

						switch (alt155) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:702:10: '[' expression ']'
							{
							match(input,55,FOLLOW_55_in_identifierSuffix5276); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_identifierSuffix5278);
							expression();
							state._fsp--;
							if (state.failed) return;
							match(input,56,FOLLOW_56_in_identifierSuffix5280); if (state.failed) return;
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

					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:703:9: arguments
					{
					pushFollow(FOLLOW_arguments_in_identifierSuffix5293);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:704:9: '.' 'class'
					{
					match(input,43,FOLLOW_43_in_identifierSuffix5303); if (state.failed) return;
					match(input,66,FOLLOW_66_in_identifierSuffix5305); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:705:9: '.' explicitGenericInvocation
					{
					match(input,43,FOLLOW_43_in_identifierSuffix5315); if (state.failed) return;
					pushFollow(FOLLOW_explicitGenericInvocation_in_identifierSuffix5317);
					explicitGenericInvocation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:706:9: '.' 'this'
					{
					match(input,43,FOLLOW_43_in_identifierSuffix5327); if (state.failed) return;
					match(input,99,FOLLOW_99_in_identifierSuffix5329); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:707:9: '.' 'super' arguments
					{
					match(input,43,FOLLOW_43_in_identifierSuffix5339); if (state.failed) return;
					match(input,96,FOLLOW_96_in_identifierSuffix5341); if (state.failed) return;
					pushFollow(FOLLOW_arguments_in_identifierSuffix5343);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:708:9: '.' 'new' innerCreator
					{
					match(input,43,FOLLOW_43_in_identifierSuffix5353); if (state.failed) return;
					match(input,86,FOLLOW_86_in_identifierSuffix5355); if (state.failed) return;
					pushFollow(FOLLOW_innerCreator_in_identifierSuffix5357);
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
			if ( state.backtracking>0 ) { memoize(input, 125, identifierSuffix_StartIndex); }

		}
	}
	// $ANTLR end "identifierSuffix"



	// $ANTLR start "creator"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:711:1: creator : ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) );
	public final void creator() throws RecognitionException {
		int creator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:712:5: ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) )
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==49) ) {
				alt158=1;
			}
			else if ( (LA158_0==Identifier||LA158_0==60||LA158_0==62||LA158_0==65||LA158_0==70||LA158_0==76||LA158_0==82||LA158_0==84||LA158_0==93) ) {
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:712:9: nonWildcardTypeArguments createdName classCreatorRest
					{
					pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator5376);
					nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_createdName_in_creator5378);
					createdName();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_classCreatorRest_in_creator5380);
					classCreatorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:713:9: createdName ( arrayCreatorRest | classCreatorRest )
					{
					pushFollow(FOLLOW_createdName_in_creator5390);
					createdName();
					state._fsp--;
					if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:713:21: ( arrayCreatorRest | classCreatorRest )
					int alt157=2;
					int LA157_0 = input.LA(1);
					if ( (LA157_0==55) ) {
						alt157=1;
					}
					else if ( (LA157_0==32) ) {
						alt157=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 157, 0, input);
						throw nvae;
					}

					switch (alt157) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:713:22: arrayCreatorRest
							{
							pushFollow(FOLLOW_arrayCreatorRest_in_creator5393);
							arrayCreatorRest();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:713:41: classCreatorRest
							{
							pushFollow(FOLLOW_classCreatorRest_in_creator5397);
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
			if ( state.backtracking>0 ) { memoize(input, 126, creator_StartIndex); }

		}
	}
	// $ANTLR end "creator"



	// $ANTLR start "createdName"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:716:1: createdName : ( classOrInterfaceType | primitiveType );
	public final void createdName() throws RecognitionException {
		int createdName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:717:5: ( classOrInterfaceType | primitiveType )
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==Identifier) ) {
				alt159=1;
			}
			else if ( (LA159_0==60||LA159_0==62||LA159_0==65||LA159_0==70||LA159_0==76||LA159_0==82||LA159_0==84||LA159_0==93) ) {
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:717:9: classOrInterfaceType
					{
					pushFollow(FOLLOW_classOrInterfaceType_in_createdName5417);
					classOrInterfaceType();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:718:9: primitiveType
					{
					pushFollow(FOLLOW_primitiveType_in_createdName5427);
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
			if ( state.backtracking>0 ) { memoize(input, 127, createdName_StartIndex); }

		}
	}
	// $ANTLR end "createdName"



	// $ANTLR start "innerCreator"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:721:1: innerCreator : ( nonWildcardTypeArguments )? Identifier classCreatorRest ;
	public final void innerCreator() throws RecognitionException {
		int innerCreator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:722:5: ( ( nonWildcardTypeArguments )? Identifier classCreatorRest )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:722:9: ( nonWildcardTypeArguments )? Identifier classCreatorRest
			{
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:722:9: ( nonWildcardTypeArguments )?
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==49) ) {
				alt160=1;
			}
			switch (alt160) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:722:9: nonWildcardTypeArguments
					{
					pushFollow(FOLLOW_nonWildcardTypeArguments_in_innerCreator5450);
					nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,Identifier,FOLLOW_Identifier_in_innerCreator5453); if (state.failed) return;
			pushFollow(FOLLOW_classCreatorRest_in_innerCreator5455);
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
			if ( state.backtracking>0 ) { memoize(input, 128, innerCreator_StartIndex); }

		}
	}
	// $ANTLR end "innerCreator"



	// $ANTLR start "arrayCreatorRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:725:1: arrayCreatorRest : '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) ;
	public final void arrayCreatorRest() throws RecognitionException {
		int arrayCreatorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:726:5: ( '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* ) )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:726:9: '[' ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
			{
			match(input,55,FOLLOW_55_in_arrayCreatorRest5474); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:727:9: ( ']' ( '[' ']' )* arrayInitializer | expression ']' ( '[' expression ']' )* ( '[' ']' )* )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:727:13: ']' ( '[' ']' )* arrayInitializer
					{
					match(input,56,FOLLOW_56_in_arrayCreatorRest5488); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:727:17: ( '[' ']' )*
					loop161:
					while (true) {
						int alt161=2;
						int LA161_0 = input.LA(1);
						if ( (LA161_0==55) ) {
							alt161=1;
						}

						switch (alt161) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:727:18: '[' ']'
							{
							match(input,55,FOLLOW_55_in_arrayCreatorRest5491); if (state.failed) return;
							match(input,56,FOLLOW_56_in_arrayCreatorRest5493); if (state.failed) return;
							}
							break;

						default :
							break loop161;
						}
					}

					pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest5497);
					arrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:728:13: expression ']' ( '[' expression ']' )* ( '[' ']' )*
					{
					pushFollow(FOLLOW_expression_in_arrayCreatorRest5511);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,56,FOLLOW_56_in_arrayCreatorRest5513); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:728:28: ( '[' expression ']' )*
					loop162:
					while (true) {
						int alt162=2;
						int LA162_0 = input.LA(1);
						if ( (LA162_0==55) ) {
							int LA162_1 = input.LA(2);
							if ( (synpred262_BasForCCal()) ) {
								alt162=1;
							}

						}

						switch (alt162) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:728:29: '[' expression ']'
							{
							match(input,55,FOLLOW_55_in_arrayCreatorRest5516); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_arrayCreatorRest5518);
							expression();
							state._fsp--;
							if (state.failed) return;
							match(input,56,FOLLOW_56_in_arrayCreatorRest5520); if (state.failed) return;
							}
							break;

						default :
							break loop162;
						}
					}

					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:728:50: ( '[' ']' )*
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
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:728:51: '[' ']'
							{
							match(input,55,FOLLOW_55_in_arrayCreatorRest5525); if (state.failed) return;
							match(input,56,FOLLOW_56_in_arrayCreatorRest5527); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 129, arrayCreatorRest_StartIndex); }

		}
	}
	// $ANTLR end "arrayCreatorRest"



	// $ANTLR start "classCreatorRest"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:732:1: classCreatorRest : arguments ( classBody )? ;
	public final void classCreatorRest() throws RecognitionException {
		int classCreatorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:733:5: ( arguments ( classBody )? )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:733:9: arguments ( classBody )?
			{
			pushFollow(FOLLOW_arguments_in_classCreatorRest5558);
			arguments();
			state._fsp--;
			if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:733:19: ( classBody )?
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==108) ) {
				alt165=1;
			}
			switch (alt165) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:733:19: classBody
					{
					pushFollow(FOLLOW_classBody_in_classCreatorRest5560);
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
			if ( state.backtracking>0 ) { memoize(input, 130, classCreatorRest_StartIndex); }

		}
	}
	// $ANTLR end "classCreatorRest"



	// $ANTLR start "explicitGenericInvocation"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:736:1: explicitGenericInvocation : nonWildcardTypeArguments Identifier arguments ;
	public final void explicitGenericInvocation() throws RecognitionException {
		int explicitGenericInvocation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:737:5: ( nonWildcardTypeArguments Identifier arguments )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:737:9: nonWildcardTypeArguments Identifier arguments
			{
			pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation5584);
			nonWildcardTypeArguments();
			state._fsp--;
			if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_explicitGenericInvocation5586); if (state.failed) return;
			pushFollow(FOLLOW_arguments_in_explicitGenericInvocation5588);
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
			if ( state.backtracking>0 ) { memoize(input, 131, explicitGenericInvocation_StartIndex); }

		}
	}
	// $ANTLR end "explicitGenericInvocation"



	// $ANTLR start "nonWildcardTypeArguments"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:740:1: nonWildcardTypeArguments : '<' typeList '>' ;
	public final void nonWildcardTypeArguments() throws RecognitionException {
		int nonWildcardTypeArguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:741:5: ( '<' typeList '>' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:741:9: '<' typeList '>'
			{
			match(input,49,FOLLOW_49_in_nonWildcardTypeArguments5611); if (state.failed) return;
			pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments5613);
			typeList();
			state._fsp--;
			if (state.failed) return;
			match(input,52,FOLLOW_52_in_nonWildcardTypeArguments5615); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 132, nonWildcardTypeArguments_StartIndex); }

		}
	}
	// $ANTLR end "nonWildcardTypeArguments"



	// $ANTLR start "selector"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:744:1: selector : ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' );
	public final void selector() throws RecognitionException {
		int selector_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:745:5: ( '.' Identifier ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '.' 'new' innerCreator | '[' expression ']' )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:745:9: '.' Identifier ( arguments )?
					{
					match(input,43,FOLLOW_43_in_selector5638); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_selector5640); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:745:24: ( arguments )?
					int alt166=2;
					int LA166_0 = input.LA(1);
					if ( (LA166_0==32) ) {
						alt166=1;
					}
					switch (alt166) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:745:24: arguments
							{
							pushFollow(FOLLOW_arguments_in_selector5642);
							arguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:746:9: '.' 'this'
					{
					match(input,43,FOLLOW_43_in_selector5653); if (state.failed) return;
					match(input,99,FOLLOW_99_in_selector5655); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:747:9: '.' 'super' superSuffix
					{
					match(input,43,FOLLOW_43_in_selector5665); if (state.failed) return;
					match(input,96,FOLLOW_96_in_selector5667); if (state.failed) return;
					pushFollow(FOLLOW_superSuffix_in_selector5669);
					superSuffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:748:9: '.' 'new' innerCreator
					{
					match(input,43,FOLLOW_43_in_selector5679); if (state.failed) return;
					match(input,86,FOLLOW_86_in_selector5681); if (state.failed) return;
					pushFollow(FOLLOW_innerCreator_in_selector5683);
					innerCreator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:749:9: '[' expression ']'
					{
					match(input,55,FOLLOW_55_in_selector5693); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_selector5695);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,56,FOLLOW_56_in_selector5697); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 133, selector_StartIndex); }

		}
	}
	// $ANTLR end "selector"



	// $ANTLR start "superSuffix"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:752:1: superSuffix : ( arguments | '.' Identifier ( arguments )? );
	public final void superSuffix() throws RecognitionException {
		int superSuffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:753:5: ( arguments | '.' Identifier ( arguments )? )
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
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:753:9: arguments
					{
					pushFollow(FOLLOW_arguments_in_superSuffix5720);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:754:9: '.' Identifier ( arguments )?
					{
					match(input,43,FOLLOW_43_in_superSuffix5730); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_superSuffix5732); if (state.failed) return;
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:754:24: ( arguments )?
					int alt168=2;
					int LA168_0 = input.LA(1);
					if ( (LA168_0==32) ) {
						alt168=1;
					}
					switch (alt168) {
						case 1 :
							// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:754:24: arguments
							{
							pushFollow(FOLLOW_arguments_in_superSuffix5734);
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
			if ( state.backtracking>0 ) { memoize(input, 134, superSuffix_StartIndex); }

		}
	}
	// $ANTLR end "superSuffix"



	// $ANTLR start "arguments"
	// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:757:1: arguments : '(' ( expressionList )? ')' ;
	public final void arguments() throws RecognitionException {
		int arguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return; }

			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:758:5: ( '(' ( expressionList )? ')' )
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:758:9: '(' ( expressionList )? ')'
			{
			match(input,32,FOLLOW_32_in_arguments5754); if (state.failed) return;
			// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:758:13: ( expressionList )?
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( ((LA170_0 >= CharacterLiteral && LA170_0 <= DecimalLiteral)||LA170_0==FloatingPointLiteral||(LA170_0 >= HexLiteral && LA170_0 <= Identifier)||(LA170_0 >= OctalLiteral && LA170_0 <= StringLiteral)||LA170_0==25||LA170_0==32||(LA170_0 >= 36 && LA170_0 <= 37)||(LA170_0 >= 40 && LA170_0 <= 41)||LA170_0==60||LA170_0==62||LA170_0==65||LA170_0==70||LA170_0==73||LA170_0==76||LA170_0==82||LA170_0==84||(LA170_0 >= 86 && LA170_0 <= 87)||LA170_0==93||LA170_0==96||LA170_0==99||LA170_0==103||LA170_0==105||LA170_0==113) ) {
				alt170=1;
			}
			switch (alt170) {
				case 1 :
					// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:758:13: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_arguments5756);
					expressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,33,FOLLOW_33_in_arguments5759); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 135, arguments_StartIndex); }

		}
	}
	// $ANTLR end "arguments"

	// $ANTLR start synpred5_BasForCCal
	public final void synpred5_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:22:9: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:22:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
		{
		pushFollow(FOLLOW_annotations_in_synpred5_BasForCCal54);
		annotations();
		state._fsp--;
		if (state.failed) return;
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
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
				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
				{
				pushFollow(FOLLOW_packageDeclaration_in_synpred5_BasForCCal68);
				packageDeclaration();
				state._fsp--;
				if (state.failed) return;
				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:32: ( importDeclaration )*
				loop173:
				while (true) {
					int alt173=2;
					int LA173_0 = input.LA(1);
					if ( (LA173_0==80) ) {
						alt173=1;
					}

					switch (alt173) {
					case 1 :
						// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:32: importDeclaration
						{
						pushFollow(FOLLOW_importDeclaration_in_synpred5_BasForCCal70);
						importDeclaration();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop173;
					}
				}

				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:51: ( typeDeclaration )*
				loop174:
				while (true) {
					int alt174=2;
					int LA174_0 = input.LA(1);
					if ( (LA174_0==ENUM||LA174_0==48||LA174_0==54||LA174_0==59||LA174_0==66||LA174_0==74||LA174_0==83||(LA174_0 >= 89 && LA174_0 <= 91)||(LA174_0 >= 94 && LA174_0 <= 95)) ) {
						alt174=1;
					}

					switch (alt174) {
					case 1 :
						// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:23:51: typeDeclaration
						{
						pushFollow(FOLLOW_typeDeclaration_in_synpred5_BasForCCal73);
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
				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:24:13: classOrInterfaceDeclaration ( typeDeclaration )*
				{
				pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred5_BasForCCal88);
				classOrInterfaceDeclaration();
				state._fsp--;
				if (state.failed) return;
				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:24:41: ( typeDeclaration )*
				loop175:
				while (true) {
					int alt175=2;
					int LA175_0 = input.LA(1);
					if ( (LA175_0==ENUM||LA175_0==48||LA175_0==54||LA175_0==59||LA175_0==66||LA175_0==74||LA175_0==83||(LA175_0 >= 89 && LA175_0 <= 91)||(LA175_0 >= 94 && LA175_0 <= 95)) ) {
						alt175=1;
					}

					switch (alt175) {
					case 1 :
						// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:24:41: typeDeclaration
						{
						pushFollow(FOLLOW_typeDeclaration_in_synpred5_BasForCCal90);
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

	// $ANTLR start synpred113_BasForCCal
	public final void synpred113_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:346:13: ( explicitConstructorInvocation )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:346:13: explicitConstructorInvocation
		{
		pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred113_BasForCCal2490);
		explicitConstructorInvocation();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred113_BasForCCal

	// $ANTLR start synpred117_BasForCCal
	public final void synpred117_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:350:9: ( ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:350:9: ( nonWildcardTypeArguments )? ( 'this' | 'super' ) arguments ';'
		{
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:350:9: ( nonWildcardTypeArguments )?
		int alt184=2;
		int LA184_0 = input.LA(1);
		if ( (LA184_0==49) ) {
			alt184=1;
		}
		switch (alt184) {
			case 1 :
				// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:350:9: nonWildcardTypeArguments
				{
				pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred117_BasForCCal2515);
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
		pushFollow(FOLLOW_arguments_in_synpred117_BasForCCal2526);
		arguments();
		state._fsp--;
		if (state.failed) return;
		match(input,48,FOLLOW_48_in_synpred117_BasForCCal2528); if (state.failed) return;
		}

	}
	// $ANTLR end synpred117_BasForCCal

	// $ANTLR start synpred128_BasForCCal
	public final void synpred128_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:382:9: ( annotation )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:382:9: annotation
		{
		pushFollow(FOLLOW_annotation_in_synpred128_BasForCCal2739);
		annotation();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred128_BasForCCal

	// $ANTLR start synpred151_BasForCCal
	public final void synpred151_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:455:9: ( localVariableDeclarationStatement )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:455:9: localVariableDeclarationStatement
		{
		pushFollow(FOLLOW_localVariableDeclarationStatement_in_synpred151_BasForCCal3266);
		localVariableDeclarationStatement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred151_BasForCCal

	// $ANTLR start synpred152_BasForCCal
	public final void synpred152_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:456:9: ( classOrInterfaceDeclaration )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:456:9: classOrInterfaceDeclaration
		{
		pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred152_BasForCCal3276);
		classOrInterfaceDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred152_BasForCCal

	// $ANTLR start synpred157_BasForCCal
	public final void synpred157_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:475:54: ( 'else' statement )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:475:54: 'else' statement
		{
		match(input,71,FOLLOW_71_in_synpred157_BasForCCal3421); if (state.failed) return;
		pushFollow(FOLLOW_statement_in_synpred157_BasForCCal3423);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred157_BasForCCal

	// $ANTLR start synpred162_BasForCCal
	public final void synpred162_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:480:11: ( catches 'finally' block )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:480:11: catches 'finally' block
		{
		pushFollow(FOLLOW_catches_in_synpred162_BasForCCal3499);
		catches();
		state._fsp--;
		if (state.failed) return;
		match(input,75,FOLLOW_75_in_synpred162_BasForCCal3501); if (state.failed) return;
		pushFollow(FOLLOW_block_in_synpred162_BasForCCal3503);
		block();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred162_BasForCCal

	// $ANTLR start synpred163_BasForCCal
	public final void synpred163_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:481:11: ( catches )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:481:11: catches
		{
		pushFollow(FOLLOW_catches_in_synpred163_BasForCCal3515);
		catches();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred163_BasForCCal

	// $ANTLR start synpred178_BasForCCal
	public final void synpred178_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:516:9: ( switchLabel )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:516:9: switchLabel
		{
		pushFollow(FOLLOW_switchLabel_in_synpred178_BasForCCal3806);
		switchLabel();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred178_BasForCCal

	// $ANTLR start synpred180_BasForCCal
	public final void synpred180_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:520:9: ( 'case' constantExpression ':' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:520:9: 'case' constantExpression ':'
		{
		match(input,63,FOLLOW_63_in_synpred180_BasForCCal3833); if (state.failed) return;
		pushFollow(FOLLOW_constantExpression_in_synpred180_BasForCCal3835);
		constantExpression();
		state._fsp--;
		if (state.failed) return;
		match(input,47,FOLLOW_47_in_synpred180_BasForCCal3837); if (state.failed) return;
		}

	}
	// $ANTLR end synpred180_BasForCCal

	// $ANTLR start synpred181_BasForCCal
	public final void synpred181_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:521:9: ( 'case' enumConstantName ':' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:521:9: 'case' enumConstantName ':'
		{
		match(input,63,FOLLOW_63_in_synpred181_BasForCCal3847); if (state.failed) return;
		pushFollow(FOLLOW_enumConstantName_in_synpred181_BasForCCal3849);
		enumConstantName();
		state._fsp--;
		if (state.failed) return;
		match(input,47,FOLLOW_47_in_synpred181_BasForCCal3851); if (state.failed) return;
		}

	}
	// $ANTLR end synpred181_BasForCCal

	// $ANTLR start synpred182_BasForCCal
	public final void synpred182_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:527:9: ( enhancedForControl )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:527:9: enhancedForControl
		{
		pushFollow(FOLLOW_enhancedForControl_in_synpred182_BasForCCal3894);
		enhancedForControl();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred182_BasForCCal

	// $ANTLR start synpred186_BasForCCal
	public final void synpred186_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:532:9: ( localVariableDeclaration )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:532:9: localVariableDeclaration
		{
		pushFollow(FOLLOW_localVariableDeclaration_in_synpred186_BasForCCal3934);
		localVariableDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred186_BasForCCal

	// $ANTLR start synpred188_BasForCCal
	public final void synpred188_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:563:32: ( assignmentOperator expression )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:563:32: assignmentOperator expression
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred188_BasForCCal4117);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred188_BasForCCal4119);
		expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred188_BasForCCal

	// $ANTLR start synpred198_BasForCCal
	public final void synpred198_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:576:9: ( '<' '<' '=' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:576:10: '<' '<' '='
		{
		match(input,49,FOLLOW_49_in_synpred198_BasForCCal4235); if (state.failed) return;
		match(input,49,FOLLOW_49_in_synpred198_BasForCCal4237); if (state.failed) return;
		match(input,50,FOLLOW_50_in_synpred198_BasForCCal4239); if (state.failed) return;
		}

	}
	// $ANTLR end synpred198_BasForCCal

	// $ANTLR start synpred199_BasForCCal
	public final void synpred199_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:581:9: ( '>' '>' '>' '=' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:581:10: '>' '>' '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred199_BasForCCal4275); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred199_BasForCCal4277); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred199_BasForCCal4279); if (state.failed) return;
		match(input,50,FOLLOW_50_in_synpred199_BasForCCal4281); if (state.failed) return;
		}

	}
	// $ANTLR end synpred199_BasForCCal

	// $ANTLR start synpred200_BasForCCal
	public final void synpred200_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:588:9: ( '>' '>' '=' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:588:10: '>' '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred200_BasForCCal4320); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred200_BasForCCal4322); if (state.failed) return;
		match(input,50,FOLLOW_50_in_synpred200_BasForCCal4324); if (state.failed) return;
		}

	}
	// $ANTLR end synpred200_BasForCCal

	// $ANTLR start synpred211_BasForCCal
	public final void synpred211_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:632:9: ( '<' '=' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:632:10: '<' '='
		{
		match(input,49,FOLLOW_49_in_synpred211_BasForCCal4632); if (state.failed) return;
		match(input,50,FOLLOW_50_in_synpred211_BasForCCal4634); if (state.failed) return;
		}

	}
	// $ANTLR end synpred211_BasForCCal

	// $ANTLR start synpred212_BasForCCal
	public final void synpred212_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:635:9: ( '>' '=' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:635:10: '>' '='
		{
		match(input,52,FOLLOW_52_in_synpred212_BasForCCal4666); if (state.failed) return;
		match(input,50,FOLLOW_50_in_synpred212_BasForCCal4668); if (state.failed) return;
		}

	}
	// $ANTLR end synpred212_BasForCCal

	// $ANTLR start synpred215_BasForCCal
	public final void synpred215_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:647:9: ( '<' '<' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:647:10: '<' '<'
		{
		match(input,49,FOLLOW_49_in_synpred215_BasForCCal4759); if (state.failed) return;
		match(input,49,FOLLOW_49_in_synpred215_BasForCCal4761); if (state.failed) return;
		}

	}
	// $ANTLR end synpred215_BasForCCal

	// $ANTLR start synpred216_BasForCCal
	public final void synpred216_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:650:9: ( '>' '>' '>' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:650:10: '>' '>' '>'
		{
		match(input,52,FOLLOW_52_in_synpred216_BasForCCal4793); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred216_BasForCCal4795); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred216_BasForCCal4797); if (state.failed) return;
		}

	}
	// $ANTLR end synpred216_BasForCCal

	// $ANTLR start synpred217_BasForCCal
	public final void synpred217_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:655:9: ( '>' '>' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:655:10: '>' '>'
		{
		match(input,52,FOLLOW_52_in_synpred217_BasForCCal4833); if (state.failed) return;
		match(input,52,FOLLOW_52_in_synpred217_BasForCCal4835); if (state.failed) return;
		}

	}
	// $ANTLR end synpred217_BasForCCal

	// $ANTLR start synpred229_BasForCCal
	public final void synpred229_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:680:9: ( castExpression )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:680:9: castExpression
		{
		pushFollow(FOLLOW_castExpression_in_synpred229_BasForCCal5044);
		castExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred229_BasForCCal

	// $ANTLR start synpred233_BasForCCal
	public final void synpred233_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:8: ( '(' primitiveType ')' unaryExpression )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:685:8: '(' primitiveType ')' unaryExpression
		{
		match(input,32,FOLLOW_32_in_synpred233_BasForCCal5082); if (state.failed) return;
		pushFollow(FOLLOW_primitiveType_in_synpred233_BasForCCal5084);
		primitiveType();
		state._fsp--;
		if (state.failed) return;
		match(input,33,FOLLOW_33_in_synpred233_BasForCCal5086); if (state.failed) return;
		pushFollow(FOLLOW_unaryExpression_in_synpred233_BasForCCal5088);
		unaryExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred233_BasForCCal

	// $ANTLR start synpred234_BasForCCal
	public final void synpred234_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:686:13: ( type )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:686:13: type
		{
		pushFollow(FOLLOW_type_in_synpred234_BasForCCal5100);
		type();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred234_BasForCCal

	// $ANTLR start synpred236_BasForCCal
	public final void synpred236_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:691:17: ( '.' Identifier )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:691:17: '.' Identifier
		{
		match(input,43,FOLLOW_43_in_synpred236_BasForCCal5141); if (state.failed) return;
		match(input,Identifier,FOLLOW_Identifier_in_synpred236_BasForCCal5143); if (state.failed) return;
		}

	}
	// $ANTLR end synpred236_BasForCCal

	// $ANTLR start synpred237_BasForCCal
	public final void synpred237_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:691:34: ( identifierSuffix )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:691:34: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred237_BasForCCal5147);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred237_BasForCCal

	// $ANTLR start synpred242_BasForCCal
	public final void synpred242_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:695:21: ( '.' Identifier )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:695:21: '.' Identifier
		{
		match(input,43,FOLLOW_43_in_synpred242_BasForCCal5195); if (state.failed) return;
		match(input,Identifier,FOLLOW_Identifier_in_synpred242_BasForCCal5197); if (state.failed) return;
		}

	}
	// $ANTLR end synpred242_BasForCCal

	// $ANTLR start synpred243_BasForCCal
	public final void synpred243_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:695:38: ( identifierSuffix )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:695:38: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred243_BasForCCal5201);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred243_BasForCCal

	// $ANTLR start synpred249_BasForCCal
	public final void synpred249_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:702:10: ( '[' expression ']' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:702:10: '[' expression ']'
		{
		match(input,55,FOLLOW_55_in_synpred249_BasForCCal5276); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred249_BasForCCal5278);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,56,FOLLOW_56_in_synpred249_BasForCCal5280); if (state.failed) return;
		}

	}
	// $ANTLR end synpred249_BasForCCal

	// $ANTLR start synpred262_BasForCCal
	public final void synpred262_BasForCCal_fragment() throws RecognitionException {
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:728:29: ( '[' expression ']' )
		// C:\\Users\\kjdes\\OneDrive\\Documents\\NetBeansProjects\\BasForCCal_New\\BasForCCal\\BasForCCal\\src\\BasForCCal\\BasForCCal.g:728:29: '[' expression ']'
		{
		match(input,55,FOLLOW_55_in_synpred262_BasForCCal5516); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred262_BasForCCal5518);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,56,FOLLOW_56_in_synpred262_BasForCCal5520); if (state.failed) return;
		}

	}
	// $ANTLR end synpred262_BasForCCal

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
	public final boolean synpred262_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred262_BasForCCal_fragment(); // can never throw exception
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
	public final boolean synpred243_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred243_BasForCCal_fragment(); // can never throw exception
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
	public final boolean synpred242_BasForCCal() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred242_BasForCCal_fragment(); // can never throw exception
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


	protected DFA123 dfa123 = new DFA123(this);
	protected DFA146 dfa146 = new DFA146(this);
	static final String DFA123_eotS =
		"\u0087\uffff";
	static final String DFA123_eofS =
		"\u0087\uffff";
	static final String DFA123_minS =
		"\1\6\4\17\22\uffff\5\17\1\6\1\17\1\6\1\47\30\uffff\1\70\1\47\1\uffff\21"+
		"\0\2\uffff\3\0\21\uffff\1\0\5\uffff\1\0\30\uffff\1\0\5\uffff";
	static final String DFA123_maxS =
		"\1\161\1\135\1\17\1\157\1\67\22\uffff\2\67\1\135\1\17\1\135\1\161\1\143"+
		"\1\161\1\67\30\uffff\1\70\1\67\1\uffff\21\0\2\uffff\3\0\21\uffff\1\0\5"+
		"\uffff\1\0\30\uffff\1\0\5\uffff";
	static final String DFA123_acceptS =
		"\5\uffff\1\2\166\uffff\1\1\12\uffff";
	static final String DFA123_specialS =
		"\73\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\20\2\uffff\1\21\1\22\1\23\21\uffff\1\24\5\uffff\1\25\30\uffff"+
		"\1\26\5\uffff}>";
	static final String[] DFA123_transitionS = {
			"\2\5\4\uffff\1\5\1\uffff\1\5\1\3\5\uffff\2\5\2\uffff\1\5\6\uffff\1\5"+
			"\3\uffff\2\5\2\uffff\2\5\6\uffff\1\5\5\uffff\1\2\5\uffff\1\4\1\uffff"+
			"\1\4\2\uffff\1\4\4\uffff\1\4\2\uffff\1\5\1\1\1\uffff\1\4\5\uffff\1\4"+
			"\1\uffff\1\4\1\uffff\2\5\5\uffff\1\4\2\uffff\1\5\2\uffff\1\5\3\uffff"+
			"\1\5\1\uffff\1\5\7\uffff\1\5",
			"\1\27\46\uffff\1\32\5\uffff\1\30\1\uffff\1\30\2\uffff\1\30\4\uffff\1"+
			"\30\3\uffff\1\31\1\uffff\1\30\5\uffff\1\30\1\uffff\1\30\10\uffff\1\30",
			"\1\33",
			"\1\37\12\uffff\7\5\1\uffff\11\5\1\35\1\uffff\2\5\1\uffff\1\5\1\34\4"+
			"\5\1\uffff\1\36\1\uffff\2\5\26\uffff\1\5\33\uffff\3\5",
			"\1\71\33\uffff\1\5\13\uffff\1\70",
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
			"\1\76\33\uffff\1\74\5\uffff\1\73\5\uffff\1\75",
			"\1\100\47\uffff\1\77",
			"\1\101\46\uffff\1\104\5\uffff\1\102\1\uffff\1\102\2\uffff\1\102\4\uffff"+
			"\1\102\3\uffff\1\103\1\uffff\1\102\5\uffff\1\102\1\uffff\1\102\10\uffff"+
			"\1\102",
			"\1\105",
			"\1\110\20\uffff\1\107\12\uffff\1\106\12\uffff\1\113\5\uffff\1\111\1"+
			"\uffff\1\111\2\uffff\1\111\4\uffff\1\111\3\uffff\1\112\1\uffff\1\111"+
			"\5\uffff\1\111\1\uffff\1\111\10\uffff\1\111",
			"\2\5\4\uffff\1\5\1\uffff\1\5\1\116\5\uffff\2\5\2\uffff\1\5\6\uffff\1"+
			"\5\3\uffff\2\5\2\uffff\2\5\7\uffff\2\5\2\uffff\1\120\6\uffff\1\117\1"+
			"\uffff\1\117\2\uffff\1\117\4\uffff\1\117\2\uffff\1\5\2\uffff\1\117\5"+
			"\uffff\1\117\1\uffff\1\117\1\uffff\2\5\5\uffff\1\117\2\uffff\1\5\2\uffff"+
			"\1\5\3\uffff\1\5\1\uffff\1\5\7\uffff\1\5",
			"\1\142\41\uffff\1\5\20\uffff\1\5\23\uffff\1\5\11\uffff\1\5\2\uffff\1"+
			"\5",
			"\2\5\4\uffff\1\5\1\uffff\2\5\5\uffff\2\5\2\uffff\1\5\6\uffff\1\5\3\uffff"+
			"\2\5\2\uffff\2\5\16\uffff\1\150\3\uffff\1\5\1\uffff\1\5\2\uffff\1\5\4"+
			"\uffff\1\5\2\uffff\1\5\2\uffff\1\5\5\uffff\1\5\1\uffff\1\5\1\uffff\2"+
			"\5\5\uffff\1\5\2\uffff\1\5\2\uffff\1\5\3\uffff\1\5\1\uffff\1\5\7\uffff"+
			"\1\5",
			"\1\5\7\uffff\1\174\1\5\1\uffff\1\5\4\uffff\1\5",
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
			"\1\u0081",
			"\1\5\7\uffff\1\174\1\5\1\uffff\1\5\4\uffff\1\5",
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
			"",
			"",
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
			"\1\uffff",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
	static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
	static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
	static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
	static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
	static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
	static final short[][] DFA123_transition;

	static {
		int numStates = DFA123_transitionS.length;
		DFA123_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
		}
	}

	protected class DFA123 extends DFA {

		public DFA123(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 123;
			this.eot = DFA123_eot;
			this.eof = DFA123_eof;
			this.min = DFA123_min;
			this.max = DFA123_max;
			this.accept = DFA123_accept;
			this.special = DFA123_special;
			this.transition = DFA123_transition;
		}
		@Override
		public String getDescription() {
			return "525:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? ';' ( expression )? ';' ( forUpdate )? );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA123_59 = input.LA(1);
						 
						int index123_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_59);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA123_60 = input.LA(1);
						 
						int index123_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_60);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA123_61 = input.LA(1);
						 
						int index123_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_61);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA123_62 = input.LA(1);
						 
						int index123_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_62);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA123_63 = input.LA(1);
						 
						int index123_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_63);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA123_64 = input.LA(1);
						 
						int index123_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_64);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA123_65 = input.LA(1);
						 
						int index123_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_65);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA123_66 = input.LA(1);
						 
						int index123_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_66);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA123_67 = input.LA(1);
						 
						int index123_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_67);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA123_68 = input.LA(1);
						 
						int index123_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_68);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA123_69 = input.LA(1);
						 
						int index123_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_69);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA123_70 = input.LA(1);
						 
						int index123_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_70);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA123_71 = input.LA(1);
						 
						int index123_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_71);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA123_72 = input.LA(1);
						 
						int index123_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_72);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA123_73 = input.LA(1);
						 
						int index123_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_73);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA123_74 = input.LA(1);
						 
						int index123_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_74);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA123_75 = input.LA(1);
						 
						int index123_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_75);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA123_78 = input.LA(1);
						 
						int index123_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_78);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA123_79 = input.LA(1);
						 
						int index123_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_79);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA123_80 = input.LA(1);
						 
						int index123_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_80);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA123_98 = input.LA(1);
						 
						int index123_98 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_98);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA123_104 = input.LA(1);
						 
						int index123_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_104);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA123_129 = input.LA(1);
						 
						int index123_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred182_BasForCCal()) ) {s = 124;}
						else if ( (true) ) {s = 5;}
						 
						input.seek(index123_129);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 123, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA146_eotS =
		"\7\uffff";
	static final String DFA146_eofS =
		"\7\uffff";
	static final String DFA146_minS =
		"\1\6\1\0\1\41\2\uffff\1\70\1\41";
	static final String DFA146_maxS =
		"\1\161\1\0\1\67\2\uffff\1\70\1\67";
	static final String DFA146_acceptS =
		"\3\uffff\1\2\1\1\2\uffff";
	static final String DFA146_specialS =
		"\1\uffff\1\0\5\uffff}>";
	static final String[] DFA146_transitionS = {
			"\2\3\4\uffff\1\3\1\uffff\1\3\1\1\5\uffff\2\3\2\uffff\1\3\6\uffff\1\3"+
			"\3\uffff\2\3\2\uffff\2\3\22\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff"+
			"\1\2\2\uffff\1\3\2\uffff\1\2\5\uffff\1\2\1\uffff\1\2\1\uffff\2\3\5\uffff"+
			"\1\2\2\uffff\1\3\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\7\uffff\1\3",
			"\1\uffff",
			"\1\4\11\uffff\1\3\13\uffff\1\5",
			"",
			"",
			"\1\6",
			"\1\4\11\uffff\1\3\13\uffff\1\5"
	};

	static final short[] DFA146_eot = DFA.unpackEncodedString(DFA146_eotS);
	static final short[] DFA146_eof = DFA.unpackEncodedString(DFA146_eofS);
	static final char[] DFA146_min = DFA.unpackEncodedStringToUnsignedChars(DFA146_minS);
	static final char[] DFA146_max = DFA.unpackEncodedStringToUnsignedChars(DFA146_maxS);
	static final short[] DFA146_accept = DFA.unpackEncodedString(DFA146_acceptS);
	static final short[] DFA146_special = DFA.unpackEncodedString(DFA146_specialS);
	static final short[][] DFA146_transition;

	static {
		int numStates = DFA146_transitionS.length;
		DFA146_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA146_transition[i] = DFA.unpackEncodedString(DFA146_transitionS[i]);
		}
	}

	protected class DFA146 extends DFA {

		public DFA146(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 146;
			this.eot = DFA146_eot;
			this.eof = DFA146_eof;
			this.min = DFA146_min;
			this.max = DFA146_max;
			this.accept = DFA146_accept;
			this.special = DFA146_special;
			this.transition = DFA146_transition;
		}
		@Override
		public String getDescription() {
			return "686:12: ( type | expression )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA146_1 = input.LA(1);
						 
						int index146_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred234_BasForCCal()) ) {s = 4;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index146_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 146, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_annotations_in_compilationUnit54 = new BitSet(new long[]{0x0840000000000100L,0x00000000CF080404L});
	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit68 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit70 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit73 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_compilationUnit88 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit90 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit111 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit114 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit117 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_88_in_packageDeclaration137 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedName_in_packageDeclaration139 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_packageDeclaration141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_importDeclaration164 = new BitSet(new long[]{0x0000000000008000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_importDeclaration166 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedName_in_importDeclaration169 = new BitSet(new long[]{0x0001080000000000L});
	public static final BitSet FOLLOW_43_in_importDeclaration172 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_importDeclaration174 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_importDeclaration178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_typeDeclaration211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration234 = new BitSet(new long[]{0x0040000000000100L,0x0000000000080004L});
	public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers265 = new BitSet(new long[]{0x0840000000000002L,0x00000000CE000400L});
	public static final BitSet FOLLOW_annotation_in_classOrInterfaceModifier285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_classOrInterfaceModifier298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_classOrInterfaceModifier313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_classOrInterfaceModifier326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_classOrInterfaceModifier340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_classOrInterfaceModifier353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_classOrInterfaceModifier368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_classOrInterfaceModifier384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifiers406 = new BitSet(new long[]{0x0840000000000002L,0x00000444CE200400L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_classDeclaration426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_classDeclaration436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_normalClassDeclaration459 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_normalClassDeclaration461 = new BitSet(new long[]{0x0002000000000000L,0x0000100000008100L});
	public static final BitSet FOLLOW_typeParameters_in_normalClassDeclaration465 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008100L});
	public static final BitSet FOLLOW_72_in_normalClassDeclaration477 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_normalClassDeclaration480 = new BitSet(new long[]{0x0000000000000000L,0x0000100000008000L});
	public static final BitSet FOLLOW_79_in_normalClassDeclaration493 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_normalClassDeclaration496 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_classBody_in_normalClassDeclaration508 = new BitSet(new long[]{0x0000000000000002L});
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
	public static final BitSet FOLLOW_typeParameters_in_normalInterfaceDeclaration808 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000100L});
	public static final BitSet FOLLOW_72_in_normalInterfaceDeclaration812 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_normalInterfaceDeclaration814 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_interfaceBody_in_normalInterfaceDeclaration818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeList841 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_typeList844 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_typeList846 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_108_in_classBody871 = new BitSet(new long[]{0x5843000000008100L,0x00011644EE3C1446L});
	public static final BitSet FOLLOW_classBodyDeclaration_in_classBody873 = new BitSet(new long[]{0x5843000000008100L,0x00011644EE3C1446L});
	public static final BitSet FOLLOW_112_in_classBody876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_interfaceBody899 = new BitSet(new long[]{0x5843000000008100L,0x00010644EE3C1446L});
	public static final BitSet FOLLOW_interfaceBodyDeclaration_in_interfaceBody901 = new BitSet(new long[]{0x5843000000008100L,0x00010644EE3C1446L});
	public static final BitSet FOLLOW_112_in_interfaceBody904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_classBodyDeclaration923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_classBodyDeclaration933 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_classBodyDeclaration936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_classBodyDeclaration946 = new BitSet(new long[]{0x5042000000008100L,0x00000200201C1046L});
	public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericMethodOrConstructorDecl_in_memberDecl971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberDeclaration_in_memberDecl981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_memberDecl991 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_memberDecl993 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDecl997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_memberDecl1007 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_constructorDeclaratorRest_in_memberDecl1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_memberDecl1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_memberDecl1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_memberDeclaration1054 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_methodDeclaration_in_memberDeclaration1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1081 = new BitSet(new long[]{0x5000000000008000L,0x0000020020141042L});
	public static final BitSet FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_genericMethodOrConstructorRest1107 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_105_in_genericMethodOrConstructorRest1111 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1114 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1126 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_methodDeclaration1147 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_methodDeclaratorRest_in_methodDeclaration1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarators_in_fieldDeclaration1170 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_fieldDeclaration1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_interfaceBodyDeclaration1199 = new BitSet(new long[]{0x5042000000008100L,0x00000200201C1046L});
	public static final BitSet FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_interfaceBodyDeclaration1211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_interfaceMemberDecl1250 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMemberDecl1252 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_interfaceMemberDecl1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_interfaceMemberDecl1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_interfaceMethodOrFieldDecl1297 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMethodOrFieldDecl1299 = new BitSet(new long[]{0x0084000100000000L});
	public static final BitSet FOLLOW_interfaceMethodOrFieldRest_in_interfaceMethodOrFieldDecl1301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldRest1324 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_interfaceMethodOrFieldRest1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldRest1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaratorRest1359 = new BitSet(new long[]{0x0081000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_55_in_methodDeclaratorRest1362 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_methodDeclaratorRest1364 = new BitSet(new long[]{0x0081000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_methodDeclaratorRest1377 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaratorRest1379 = new BitSet(new long[]{0x0001000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_methodBody_in_methodDeclaratorRest1395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_methodDeclaratorRest1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest1442 = new BitSet(new long[]{0x0001000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_voidMethodDeclaratorRest1445 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest1447 = new BitSet(new long[]{0x0001000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_voidMethodDeclaratorRest1477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest1510 = new BitSet(new long[]{0x0081000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_55_in_interfaceMethodDeclaratorRest1513 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_interfaceMethodDeclaratorRest1515 = new BitSet(new long[]{0x0081000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_interfaceMethodDeclaratorRest1520 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest1522 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_interfaceMethodDeclaratorRest1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameters_in_interfaceGenericMethodDecl1549 = new BitSet(new long[]{0x5000000000008000L,0x0000020020141042L});
	public static final BitSet FOLLOW_type_in_interfaceGenericMethodDecl1552 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_105_in_interfaceGenericMethodDecl1556 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_interfaceGenericMethodDecl1559 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl1569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest1592 = new BitSet(new long[]{0x0001000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_voidInterfaceMethodDeclaratorRest1595 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest1597 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_voidInterfaceMethodDeclaratorRest1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_constructorDeclaratorRest1624 = new BitSet(new long[]{0x0000000000000000L,0x0000102000000000L});
	public static final BitSet FOLLOW_101_in_constructorDeclaratorRest1627 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedNameList_in_constructorDeclaratorRest1629 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_constructorBody_in_constructorDeclaratorRest1633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantDeclarator1652 = new BitSet(new long[]{0x0084000000000000L});
	public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclarator1654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1677 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_variableDeclarators1680 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators1682 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator1703 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_50_in_variableDeclarator1706 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest1733 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_constantDeclaratorsRest1736 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_constantDeclarator_in_constantDeclaratorsRest1738 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_55_in_constantDeclaratorRest1760 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_constantDeclaratorRest1762 = new BitSet(new long[]{0x0084000000000000L});
	public static final BitSet FOLLOW_50_in_constantDeclaratorRest1766 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_constantDeclaratorRest1768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableDeclaratorId1791 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_variableDeclaratorId1794 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_variableDeclaratorId1796 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableInitializer1827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_arrayInitializer1854 = new BitSet(new long[]{0x500003310260D0C0L,0x0003128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1857 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_arrayInitializer1860 = new BitSet(new long[]{0x500003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1862 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_arrayInitializer1867 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_arrayInitializer1874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_modifier1893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_modifier1903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_modifier1913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_modifier1923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_modifier1933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_modifier1943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_modifier1953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_modifier1963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_modifier1973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_modifier1983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_modifier1993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_modifier2003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_packageOrTypeName2022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_enumConstantName2041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_typeName2060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_type2074 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_type2077 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_type2079 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_type2086 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_type2089 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_type2091 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType2106 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2120 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_classOrInterfaceType2124 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType2126 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2128 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_74_in_variableModifier2237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_variableModifier2247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_typeArguments2266 = new BitSet(new long[]{0x5020000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments2268 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_39_in_typeArguments2271 = new BitSet(new long[]{0x5020000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments2273 = new BitSet(new long[]{0x0010008000000000L});
	public static final BitSet FOLLOW_52_in_typeArguments2277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeArgument2300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_typeArgument2310 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000100L});
	public static final BitSet FOLLOW_set_in_typeArgument2313 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_typeArgument2321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList2346 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_qualifiedNameList2349 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList2351 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_32_in_formalParameters2372 = new BitSet(new long[]{0x5040000200008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters2374 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_formalParameters2377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_formalParameterDecls2400 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_formalParameterDecls2402 = new BitSet(new long[]{0x0000100000008000L});
	public static final BitSet FOLLOW_formalParameterDeclsRest_in_formalParameterDecls2404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2427 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_formalParameterDeclsRest2430 = new BitSet(new long[]{0x5040000000008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDeclsRest2432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_formalParameterDeclsRest2444 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest2446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_methodBody2469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_constructorBody2488 = new BitSet(new long[]{0x784303310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody2490 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_blockStatement_in_constructorBody2493 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_112_in_constructorBody2496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2515 = new BitSet(new long[]{0x0000000000000000L,0x0000000900000000L});
	public static final BitSet FOLLOW_set_in_explicitConstructorInvocation2518 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation2526 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_explicitConstructorInvocation2528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_explicitConstructorInvocation2538 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_explicitConstructorInvocation2540 = new BitSet(new long[]{0x0002000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation2542 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_explicitConstructorInvocation2545 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation2547 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_explicitConstructorInvocation2549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualifiedName2569 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_qualifiedName2572 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_qualifiedName2574 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_integerLiteral_in_literal2600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FloatingPointLiteral_in_literal2610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CharacterLiteral_in_literal2620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_literal2630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_literal2640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_literal2650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_annotations2739 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_annotation2759 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_annotationName_in_annotation2761 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_annotation2765 = new BitSet(new long[]{0x504003330260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValuePairs_in_annotation2769 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_elementValue_in_annotation2773 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_annotation2778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationName2802 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_annotationName2805 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_annotationName2807 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs2828 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_elementValuePairs2831 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs2833 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_Identifier_in_elementValuePair2854 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_elementValuePair2856 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValuePair2858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_elementValue2881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_elementValue2891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue2901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_elementValueArrayInitializer2924 = new BitSet(new long[]{0x504003B10260D0C0L,0x0003128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer2927 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_elementValueArrayInitializer2930 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer2932 = new BitSet(new long[]{0x0000008000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_39_in_elementValueArrayInitializer2939 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_elementValueArrayInitializer2943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_annotationTypeDeclaration2966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_annotationTypeDeclaration2968 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_annotationTypeDeclaration2970 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_annotationTypeBody_in_annotationTypeDeclaration2972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_annotationTypeBody2995 = new BitSet(new long[]{0x5840000000008100L,0x00010444EE3C1446L});
	public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody2998 = new BitSet(new long[]{0x5840000000008100L,0x00010444EE3C1446L});
	public static final BitSet FOLLOW_112_in_annotationTypeBody3002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_annotationTypeElementDeclaration3025 = new BitSet(new long[]{0x5040000000008100L,0x00000000201C1046L});
	public static final BitSet FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration3027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_annotationTypeElementRest3050 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest3052 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_annotationTypeElementRest3064 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest3077 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_annotationTypeElementRest3090 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest3103 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_annotationTypeElementRest3105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest3129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest3139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationMethodRest3162 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_annotationMethodRest3164 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_annotationMethodRest3166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_defaultValue_in_annotationMethodRest3168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarators_in_annotationConstantRest3192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_defaultValue3215 = new BitSet(new long[]{0x504003310260D0C0L,0x0002128920D41242L});
	public static final BitSet FOLLOW_elementValue_in_defaultValue3217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_block3238 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_blockStatement_in_block3240 = new BitSet(new long[]{0x784103310260D1D0L,0x00031B9FFEDC766EL});
	public static final BitSet FOLLOW_112_in_block3243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement3266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement3276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_blockStatement3286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement3310 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_localVariableDeclarationStatement3312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_localVariableDeclaration3331 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_localVariableDeclaration3333 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclarators_in_localVariableDeclaration3335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifier_in_variableModifiers3358 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_block_in_statement3376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSERT_in_statement3386 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3388 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_47_in_statement3391 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3393 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_statement3407 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3409 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_statement3421 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_statement3435 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_statement3437 = new BitSet(new long[]{0x504103310260D0C0L,0x0002028920D41642L});
	public static final BitSet FOLLOW_forControl_in_statement3439 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_statement3441 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_statement3453 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3455 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_statement3467 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3469 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_107_in_statement3471 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3473 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_statement3485 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000801L});
	public static final BitSet FOLLOW_catches_in_statement3499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_statement3501 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_statement3515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_statement3529 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_statement3551 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3553 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_statement3555 = new BitSet(new long[]{0x8000000000000000L,0x0001000000000010L});
	public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement3557 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_statement3559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_statement3569 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_parExpression_in_statement3571 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_statement3573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_statement3583 = new BitSet(new long[]{0x500103310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3585 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_100_in_statement3598 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_statement3600 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_statement3612 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_Identifier_in_statement3614 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_statement3627 = new BitSet(new long[]{0x0001000000008000L});
	public static final BitSet FOLLOW_Identifier_in_statement3629 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_statement3642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statementExpression_in_statement3653 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_statement3655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement3665 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_statement3667 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_statement3669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catchClause_in_catches3692 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_catchClause_in_catches3695 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_catchClause3720 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_catchClause3722 = new BitSet(new long[]{0x5040000000008000L,0x0000000020141442L});
	public static final BitSet FOLLOW_formalParameter_in_catchClause3724 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_catchClause3726 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_catchClause3728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_formalParameter3747 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_formalParameter3749 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameter3751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups3779 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup3806 = new BitSet(new long[]{0xF84103310260D1D2L,0x00021B9FFEDC767EL});
	public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup3809 = new BitSet(new long[]{0x784103310260D1D2L,0x00021B9FFEDC766EL});
	public static final BitSet FOLLOW_63_in_switchLabel3833 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_constantExpression_in_switchLabel3835 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel3837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_switchLabel3847 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_enumConstantName_in_switchLabel3849 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel3851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_switchLabel3861 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_switchLabel3863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enhancedForControl_in_forControl3894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_forControl3904 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_forControl3907 = new BitSet(new long[]{0x500103310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_forControl3909 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_forControl3912 = new BitSet(new long[]{0x500003310260D0C2L,0x0002028920D41242L});
	public static final BitSet FOLLOW_forUpdate_in_forControl3914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_forInit3934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit3944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_enhancedForControl3967 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_enhancedForControl3969 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_enhancedForControl3971 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_enhancedForControl3973 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_enhancedForControl3975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forUpdate3994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_parExpression4015 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_parExpression4017 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_parExpression4019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList4042 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_expressionList4045 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_expressionList4047 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_expression_in_statementExpression4068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_constantExpression4091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_expression4114 = new BitSet(new long[]{0x0416444890000002L,0x0000400000000000L});
	public static final BitSet FOLLOW_assignmentOperator_in_expression4117 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_expression4119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_assignmentOperator4154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_assignmentOperator4164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_assignmentOperator4174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_assignmentOperator4184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_assignmentOperator4194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_assignmentOperator4204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_assignmentOperator4214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignmentOperator4224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_assignmentOperator4245 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_assignmentOperator4249 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4287 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4291 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4295 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4330 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_assignmentOperator4334 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_assignmentOperator4338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression4367 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_conditionalExpression4371 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression4373 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_conditionalExpression4375 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression4377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression4399 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_conditionalOrExpression4403 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression4405 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4427 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_conditionalAndExpression4431 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression4433 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4455 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_109_in_inclusiveOrExpression4459 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression4461 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression4483 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_exclusiveOrExpression4487 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression4489 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression4511 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_andExpression4515 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression4517 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression4539 = new BitSet(new long[]{0x0008000004000002L});
	public static final BitSet FOLLOW_set_in_equalityExpression4543 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression4551 = new BitSet(new long[]{0x0008000004000002L});
	public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression4573 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_instanceOfExpression4576 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_type_in_instanceOfExpression4578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4599 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_relationalOp_in_relationalExpression4603 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4605 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_49_in_relationalOp4640 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_relationalOp4644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_relationalOp4674 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_relationalOp4678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_relationalOp4699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_relationalOp4710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4730 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_shiftOp_in_shiftExpression4734 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4736 = new BitSet(new long[]{0x0012000000000002L});
	public static final BitSet FOLLOW_49_in_shiftOp4767 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_shiftOp4771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_shiftOp4803 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp4807 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp4811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_shiftOp4841 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_shiftOp4845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4875 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_set_in_additiveExpression4879 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4887 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4909 = new BitSet(new long[]{0x0000200408000002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression4913 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4927 = new BitSet(new long[]{0x0000200408000002L});
	public static final BitSet FOLLOW_36_in_unaryExpression4953 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_unaryExpression4965 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_unaryExpression4977 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unaryExpression4989 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression5001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_unaryExpressionNotPlusMinus5020 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_unaryExpressionNotPlusMinus5032 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus5034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus5044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus5054 = new BitSet(new long[]{0x00800A2000000002L});
	public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus5056 = new BitSet(new long[]{0x00800A2000000002L});
	public static final BitSet FOLLOW_32_in_castExpression5082 = new BitSet(new long[]{0x5000000000000000L,0x0000000020141042L});
	public static final BitSet FOLLOW_primitiveType_in_castExpression5084 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_castExpression5086 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_castExpression5088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_castExpression5097 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_type_in_castExpression5100 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_expression_in_castExpression5104 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_castExpression5107 = new BitSet(new long[]{0x500000010260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression5109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parExpression_in_primary5128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_primary5138 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_43_in_primary5141 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_primary5143 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_primary5147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_primary5158 = new BitSet(new long[]{0x0000080100000000L});
	public static final BitSet FOLLOW_superSuffix_in_primary5160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primary5170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_primary5180 = new BitSet(new long[]{0x5002000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_creator_in_primary5182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primary5192 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_43_in_primary5195 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_primary5197 = new BitSet(new long[]{0x0080080100000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_primary5201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_primary5212 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_55_in_primary5215 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_primary5217 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_43_in_primary5221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_primary5223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_primary5233 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_primary5235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_primary5237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_identifierSuffix5257 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_identifierSuffix5259 = new BitSet(new long[]{0x0080080000000000L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_identifierSuffix5265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_identifierSuffix5276 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_identifierSuffix5278 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_identifierSuffix5280 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix5293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_identifierSuffix5305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5315 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_explicitGenericInvocation_in_identifierSuffix5317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5327 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_identifierSuffix5329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5339 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_identifierSuffix5341 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix5343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifierSuffix5353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_identifierSuffix5355 = new BitSet(new long[]{0x0002000000008000L});
	public static final BitSet FOLLOW_innerCreator_in_identifierSuffix5357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator5376 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_createdName_in_creator5378 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator5380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createdName_in_creator5390 = new BitSet(new long[]{0x0080000100000000L});
	public static final BitSet FOLLOW_arrayCreatorRest_in_creator5393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator5397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_createdName5417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_createdName5427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_innerCreator5450 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_innerCreator5453 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_classCreatorRest_in_innerCreator5455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5474 = new BitSet(new long[]{0x510003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5488 = new BitSet(new long[]{0x0080000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5491 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5493 = new BitSet(new long[]{0x0080000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest5497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayCreatorRest5511 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5513 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5516 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_arrayCreatorRest5518 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5520 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_arrayCreatorRest5525 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_arrayCreatorRest5527 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_arguments_in_classCreatorRest5558 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_classBody_in_classCreatorRest5560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation5584 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_explicitGenericInvocation5586 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_explicitGenericInvocation5588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_nonWildcardTypeArguments5611 = new BitSet(new long[]{0x5000000000008000L,0x0000000020141042L});
	public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments5613 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_nonWildcardTypeArguments5615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector5638 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_selector5640 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_arguments_in_selector5642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector5653 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_selector5655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector5665 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_selector5667 = new BitSet(new long[]{0x0000080100000000L});
	public static final BitSet FOLLOW_superSuffix_in_selector5669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_selector5679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_selector5681 = new BitSet(new long[]{0x0002000000008000L});
	public static final BitSet FOLLOW_innerCreator_in_selector5683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_selector5693 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_selector5695 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_selector5697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arguments_in_superSuffix5720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_superSuffix5730 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_superSuffix5732 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_arguments_in_superSuffix5734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_arguments5754 = new BitSet(new long[]{0x500003330260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expressionList_in_arguments5756 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_arguments5759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotations_in_synpred5_BasForCCal54 = new BitSet(new long[]{0x0840000000000100L,0x00000000CF080404L});
	public static final BitSet FOLLOW_packageDeclaration_in_synpred5_BasForCCal68 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_importDeclaration_in_synpred5_BasForCCal70 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE090404L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred5_BasForCCal73 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred5_BasForCCal88 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred5_BasForCCal90 = new BitSet(new long[]{0x0841000000000102L,0x00000000CE080404L});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred113_BasForCCal2490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred117_BasForCCal2515 = new BitSet(new long[]{0x0000000000000000L,0x0000000900000000L});
	public static final BitSet FOLLOW_set_in_synpred117_BasForCCal2518 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_arguments_in_synpred117_BasForCCal2526 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_synpred117_BasForCCal2528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_synpred128_BasForCCal2739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_synpred151_BasForCCal3266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred152_BasForCCal3276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_synpred157_BasForCCal3421 = new BitSet(new long[]{0x700103310260D0D0L,0x00021B9F30D4726AL});
	public static final BitSet FOLLOW_statement_in_synpred157_BasForCCal3423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred162_BasForCCal3499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_synpred162_BasForCCal3501 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_block_in_synpred162_BasForCCal3503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred163_BasForCCal3515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchLabel_in_synpred178_BasForCCal3806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_synpred180_BasForCCal3833 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_constantExpression_in_synpred180_BasForCCal3835 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred180_BasForCCal3837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_synpred181_BasForCCal3847 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_enumConstantName_in_synpred181_BasForCCal3849 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred181_BasForCCal3851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enhancedForControl_in_synpred182_BasForCCal3894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_synpred186_BasForCCal3934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred188_BasForCCal4117 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred188_BasForCCal4119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred198_BasForCCal4235 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred198_BasForCCal4237 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred198_BasForCCal4239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred199_BasForCCal4275 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred199_BasForCCal4277 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred199_BasForCCal4279 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred199_BasForCCal4281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred200_BasForCCal4320 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred200_BasForCCal4322 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred200_BasForCCal4324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred211_BasForCCal4632 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred211_BasForCCal4634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred212_BasForCCal4666 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_synpred212_BasForCCal4668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_synpred215_BasForCCal4759 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred215_BasForCCal4761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred216_BasForCCal4793 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred216_BasForCCal4795 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred216_BasForCCal4797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_synpred217_BasForCCal4833 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_synpred217_BasForCCal4835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_synpred229_BasForCCal5044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_synpred233_BasForCCal5082 = new BitSet(new long[]{0x5000000000000000L,0x0000000020141042L});
	public static final BitSet FOLLOW_primitiveType_in_synpred233_BasForCCal5084 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_synpred233_BasForCCal5086 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_unaryExpression_in_synpred233_BasForCCal5088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred234_BasForCCal5100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_synpred236_BasForCCal5141 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_synpred236_BasForCCal5143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred237_BasForCCal5147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_synpred242_BasForCCal5195 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Identifier_in_synpred242_BasForCCal5197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred243_BasForCCal5201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred249_BasForCCal5276 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred249_BasForCCal5278 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred249_BasForCCal5280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred262_BasForCCal5516 = new BitSet(new long[]{0x500003310260D0C0L,0x0002028920D41242L});
	public static final BitSet FOLLOW_expression_in_synpred262_BasForCCal5518 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_synpred262_BasForCCal5520 = new BitSet(new long[]{0x0000000000000002L});
}
