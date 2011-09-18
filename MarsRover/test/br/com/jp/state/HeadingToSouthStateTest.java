package br.com.jp.state;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.jp.model.Heading;
import br.com.jp.model.Position;
import br.com.jp.model.Rover;

public class HeadingToSouthStateTest {

	private HeadingToSouthState state;
	
	private Rover rover;
	
	private Position initialPosition;
	
	@Before
	public void setUp()
	{
		state = new HeadingToSouthState();
		initialPosition = new Position(2, 2);
		rover = new Rover(initialPosition, Heading.SOUTH);
	}

	@Test
	public void shouldSpinLeft() {
		state.turnLeft(rover);
		
		assertEquals(Heading.EAST, rover.getHeading());
		assertEquals(initialPosition, rover.getPosition());
	}

	@Test
	public void shouldSpinRight() {
		state.turnRight(rover);
		
		assertEquals(Heading.WEST, rover.getHeading());
		assertEquals(initialPosition, rover.getPosition());
	}

	@Test
	public void shouldMoveForward() {
		state.moveForward(rover);
		
		Position expectedPosition = new Position(2, 1);
		
		assertEquals(Heading.SOUTH, rover.getHeading());
		assertEquals(expectedPosition, rover.getPosition());
	}

}
