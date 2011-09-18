package br.com.jp.model;

import static org.junit.Assert.assertEquals;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.jp.exception.InvalidHeightException;
import br.com.jp.exception.InvalidWidthException;
import br.com.jp.model.Plateau;
import br.com.jp.model.Position;

public class PlateauTest {
	
	public static final Integer WIDTH = 6;
	public static final Integer INVALID_WIDTH = -5;
	
	public static final Integer HEIGHT = 8;
	public static final Integer INVALID_HEIGHT = -6;
	
	public static final Integer X_INSIDE = 3;
	public static final Integer X_OUTSIDE = 10;
	
	public static final Integer Y_INSIDE = 4;
	public static final Integer Y_OUTSIDE = 20;
	
	private Plateau plateau;
	private Position position;
	private Position positionOutsidePlateau;
	
	@Before
	public void setUp()
	{
		plateau = new Plateau(WIDTH, HEIGHT);
		position = new Position(X_INSIDE, Y_INSIDE);
		positionOutsidePlateau = new Position(X_OUTSIDE, Y_OUTSIDE);
	}
	
	@Test
	public void shouldCreatePlateauWithValidSize()
	{
		Plateau plateau = new Plateau(WIDTH, HEIGHT);
		assertEquals(WIDTH, plateau.getWidth());
		assertEquals(HEIGHT, plateau.getHeight());
	}
	
	@Test(expected = InvalidWidthException.class)
	public void shouldNotCreatePlateauWithInvalidWidth()
	{
		new Plateau(INVALID_WIDTH, HEIGHT);
	}
	
	@Test(expected = InvalidHeightException.class)
	public void shouldNotCreatePlateauWithInvalidHeight()
	{
		new Plateau(WIDTH, INVALID_HEIGHT);
	}
	
	@Test(expected = InvalidWidthException.class)
	public void shouldNotCreatePlateauWithWidthZero()
	{
		new Plateau(0, HEIGHT);
	}
	
	@Test(expected = InvalidHeightException.class)
	public void shouldNotCreatePlateauWithHeightZero()
	{
		new Plateau(WIDTH, 0);
	}
	
	@Test
	public void shouldVerifyIfAPositionIsInsidePlateau()
	{
		boolean contains = plateau.contains(position);
		
		Assert.assertTrue(contains);
	}
	
	@Test
	public void shouldVerifyIfAPositionIsNotInsidePlateau()
	{
		boolean contains = plateau.contains(positionOutsidePlateau);
		
		Assert.assertFalse(contains);
	}
}
