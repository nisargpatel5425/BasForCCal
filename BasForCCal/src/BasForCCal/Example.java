package BasForCCal;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
/**
 * @author Ashwini Ukarde
 *
 */
public class Example {

	public static void parseProg(String args,String path,boolean flag)throws IOException, RecognitionException  {

		BasForCCalLexer lexer = new BasForCCalLexer(new ANTLRFileStream(args));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		BasForCCalParser parser = new BasForCCalParser(tokens);
		parser.compilationUnit(path,flag);
		args="";
	}

}
