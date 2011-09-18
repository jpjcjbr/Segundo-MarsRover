package br.com.jp.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.exception.InvalidPlateauInformationException;
import br.com.jp.model.Plateau;


public class PlateauParserTest {
	
	public static final Integer WIDTH = 10;
	
	public static final Integer HEIGHT = 15;
	
	public static final String validPlateauInformation = WIDTH + " " + HEIGHT;
	
	public static final String invalidPlateauInformation = "invalid plateau information";

	private PlateauParser plateauParser;
	
	@Before
	public void setUp()
	{
		plateauParser = new PlateauParser();
	}
	
	@Test
	public void shouldParseStringToPlateau()
	{
		Plateau plateau = plateauParser.parse(validPlateauInformation);
		
		Assert.assertEquals(WIDTH, plateau.getWidth());
		Assert.assertEquals(HEIGHT, plateau.getHeight());
	}
	
	@Test(expected = InvalidPlateauInformationException.class)
	public void shouldNotCreatePlateauFromANullPlateauString()
	{
		plateauParser.parse(null);
	}
	
	@Test(expected = InvalidPlateauInformationException.class)
	public void shouldNotCreatePlateauFromAnEmptyPlateauString()
	{
		plateauParser.parse("");
	}
	
	@Test(expected = InvalidPlateauInformationException.class)
	public void shouldNotCreatePlateauFromAnInvalidPlateauString()
	{
		plateauParser.parse(invalidPlateauInformation);
	}
}
