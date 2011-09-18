package br.com.jp.model;

import org.junit.Assert;
import org.junit.Test;

public class HeadingTest {

	@Test
	public void shouldGetHeadingNorthFromAcronymN()
	{
		Assert.assertEquals('N', Heading.getHeadingToByAcronym('N').getAcronym());
	}
	
	@Test
	public void shouldGetHeadingSouthFromAcronymS()
	{
		Assert.assertEquals(Heading.SOUTH, Heading.getHeadingToByAcronym('S'));
	}
	
	@Test
	public void shouldGetHeadingWestFromAcronymW()
	{
		Assert.assertEquals(Heading.WEST, Heading.getHeadingToByAcronym('W'));
	}
	
	@Test
	public void shouldGetHeadingEastFromAcronymE()
	{
		Assert.assertEquals(Heading.EAST, Heading.getHeadingToByAcronym('E'));
	}
}
