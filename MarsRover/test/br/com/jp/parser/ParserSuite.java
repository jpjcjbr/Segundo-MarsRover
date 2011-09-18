package br.com.jp.parser;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({
	PlateauParserTest.class,
	RoverParserTest.class,
	PositionParserTest.class,
	OperationParserTest.class,
	HeadingParserTest.class
})
@RunWith(Suite.class)
public class ParserSuite {

}
