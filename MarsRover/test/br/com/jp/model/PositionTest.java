package br.com.jp.model;

import org.junit.Assert;
import org.junit.Test;

import br.com.jp.exception.InvalidXCoordinateException;
import br.com.jp.exception.InvalidYCoordinateException;

public class PositionTest {
	
	private static final Integer VALID_X = 0;
	private static final Integer INVALID_X = -5;
	
	private static final Integer VALID_Y = 8;
	private static final Integer INVALID_Y = -8;

	@Test
	public void shouldCreatePositionWithValidCoordinates()
	{
		Position position = new Position(VALID_X, VALID_Y);
		
		Assert.assertEquals(VALID_X, position.getX());
		Assert.assertEquals(VALID_Y, position.getY());
	}
	
	@Test(expected = InvalidXCoordinateException.class)
	public void shouldNotCreatePositionWithInvalidXCoordinate()
	{
		new Position(INVALID_X, VALID_Y);
	}
	
	@Test(expected = InvalidYCoordinateException.class)
	public void shouldNotCreatePositionWithInvalidYCoordinate()
	{
		new Position(VALID_X, INVALID_Y);
	}
	
	@Test
	public void shouldDecrementX()
	{
		Position position = new Position(VALID_X, VALID_Y);
		
		position.decrementX();
	
		assertCoordinates(position, VALID_X - 1, VALID_Y);
	}

	@Test
	public void shouldIncrementX()
	{
		Position position = new Position(VALID_X, VALID_Y);
		
		position.incrementX();
		
		assertCoordinates(position, VALID_X + 1, VALID_Y);
	}
	
	@Test
	public void shouldDecrementY()
	{
		Position position = new Position(VALID_X, VALID_Y);
		
		position.decrementY();
		
		assertCoordinates(position, VALID_X, VALID_Y - 1);
	}
	
	@Test
	public void shouldIncrementY()
	{
		Position position = new Position(VALID_X, VALID_Y);
		
		position.incrementY();
		
		assertCoordinates(position, VALID_X, VALID_Y + 1);
	}
	
	private void assertCoordinates(Position position, Integer x, Integer y) {
		Assert.assertEquals(Integer.valueOf(x), position.getX());
		Assert.assertEquals(Integer.valueOf(y), position.getY());
	}
}
