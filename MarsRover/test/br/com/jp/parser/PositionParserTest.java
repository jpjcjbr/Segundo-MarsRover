package br.com.jp.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.exception.InvalidPositionInformationException;
import br.com.jp.model.Position;

public class PositionParserTest {
	
	private static final Integer VALID_X_COORDINATE = 4;
	
	private static final Integer VALID_Y_COORDINATE = 5;
	
	public static final String VALID_POSITION_INFORMATION = VALID_X_COORDINATE + " " + VALID_Y_COORDINATE +  " N";
	
	public static final String INVALID_POSITION_INFORMATION = "invalid position information";
	
	private PositionParser positionParser;
	
	@Before
	public void setUp()
	{
		positionParser = new PositionParser();
	}

	@Test
	public void shouldParseStringToPosition()
	{
		Position position = positionParser.parse(VALID_POSITION_INFORMATION);

		Assert.assertEquals(VALID_X_COORDINATE, position.getX());
		Assert.assertEquals(VALID_Y_COORDINATE, position.getY());
	}
	
	@Test(expected = InvalidPositionInformationException.class)
	public void shouldNotCreatePositionFromAnInvalidPositionString()
	{
		positionParser.parse(INVALID_POSITION_INFORMATION);
	}
}
