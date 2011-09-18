package br.com.jp.operations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.model.Heading;
import br.com.jp.model.Position;
import br.com.jp.model.Rover;

public class MoveForwardRoverOperationTest {

	private MoveForwardRoverOperation operation;
	
	private Position initialPosition;
	
	@Before
	public void setUp()
	{
		operation = new MoveForwardRoverOperation();
		initialPosition = new Position(2, 2);
	}
	
	
	@Test
	public void shouldMoveForwardHeadingSouth() {
		
		Rover rover = new Rover(initialPosition, Heading.SOUTH);
		operation.execute(rover);
		
		Assert.assertEquals(Heading.SOUTH, rover.getHeading());
		Assert.assertEquals(new Position(2, 1), rover.getPosition());
	}
	
	@Test
	public void shouldMoveForwardHeadingNorth() {
		Rover rover = new Rover(initialPosition, Heading.NORTH);
		operation.execute(rover);
		
		Assert.assertEquals(Heading.NORTH, rover.getHeading());
		Assert.assertEquals(new Position(2, 3), rover.getPosition());
	}
	
	@Test
	public void shouldMoveForwardHeadingEast() {
		Rover rover = new Rover(initialPosition, Heading.EAST);
		operation.execute(rover);
		
		Assert.assertEquals(Heading.EAST, rover.getHeading());
		Assert.assertEquals(new Position(3, 2), rover.getPosition());
	}
	
	@Test
	public void shouldMoveForwardHeadingWest() {
		Rover rover = new Rover(initialPosition, Heading.WEST);
		operation.execute(rover);
		
		Assert.assertEquals(Heading.WEST, rover.getHeading());
		Assert.assertEquals(new Position(1, 2), rover.getPosition());
	}

}
