package br.com.jp.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.exception.InvalidHeadingException;
import br.com.jp.model.Heading;

public class HeadingParserTest {

	private static final String VALID_HEADING = "10 15 S";
	private static final String INVALID_HEADING = "invalid heading information";
	private HeadingParser headingParser;
	
	@Before
	public void setUp()
	{
		headingParser = new HeadingParser();
	}

	@Test
	public void shouldParseStringToHeading()
	{
		Heading heading = headingParser.parse(VALID_HEADING);
		
		Assert.assertEquals(Heading.SOUTH, heading);
	}
	
	@Test(expected = InvalidHeadingException.class)
	public void shouldNotGetHeadingFromInvalidInformation()
	{
		headingParser.parse(INVALID_HEADING);
	}
}
