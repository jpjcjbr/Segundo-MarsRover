package br.com.jp.operations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.model.Heading;
import br.com.jp.model.Position;
import br.com.jp.model.Rover;

public class TurnLeftRoverOperationTest {

	private TurnLeftRoverOperation operation;
	
	private Position initialPosition;
	
	@Before 
	public void setUp()
	{
		operation = new TurnLeftRoverOperation();
		initialPosition = new Position(2, 2);
	}
	
	@Test
	public void shouldTurnLeftFromSouth() {
		Rover rover = new Rover(initialPosition, Heading.SOUTH);
		operation.execute(rover);
		
		Assert.assertEquals(Heading.EAST, rover.getHeading());
		Assert.assertEquals(initialPosition, rover.getPosition());
	}
	
	@Test
	public void shouldTurnLeftFromNorth() {
		Rover rover = new Rover(initialPosition, Heading.NORTH);
		operation.execute(rover);
		
		Assert.assertEquals(Heading.WEST, rover.getHeading());
		Assert.assertEquals(initialPosition, rover.getPosition());
	}
	
	@Test
	public void shouldTurnLeftFromEast() {
		Rover rover = new Rover(initialPosition, Heading.WEST);
		operation.execute(rover);
		
		Assert.assertEquals(Heading.SOUTH, rover.getHeading());
		Assert.assertEquals(initialPosition, rover.getPosition());
	}
	
	@Test
	public void shouldTurnLeftFromWest() {
		Rover rover = new Rover(initialPosition, Heading.EAST);
		operation.execute(rover);
		
		Assert.assertEquals(Heading.NORTH, rover.getHeading());
		Assert.assertEquals(initialPosition, rover.getPosition());
	}
	

}
