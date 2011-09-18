package br.com.jp.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.exception.InvalidRoverInformationException;

public class RoverTest {
	
	public static final String VALID_INSTRUCTIONS = "LMLMLMLMM";
	
	private Position position;
	
	private List<OperationType> operations;
	
	@Before
	public void setUp()
	{
		position = new Position(10, 5);
		
		operations = new ArrayList<OperationType>();
		operations.add(OperationType.MOVE_FORWARD);
		operations.add(OperationType.TURN_LEFT);
	}
	
	@Test
	public void shouldCreateRoverWithValidInformation()
	{
		Rover rover = new Rover(position, Heading.NORTH, operations);
		
		Assert.assertEquals(operations, rover.getOperations());
	}
	
	@Test(expected = InvalidRoverInformationException.class)
	public void shouldNotCreateRoverWithNullInstructions()
	{
		new Rover(position, Heading.NORTH, null);
	}
	
	@Test(expected = InvalidRoverInformationException.class)
	public void shouldNotCreateRoverWithNullHeading()
	{
		new Rover(position, null, operations);
	}
	
	@Test
	public void shouldPrintRoverInformation()
	{
		Rover rover = new Rover(position, Heading.NORTH, operations);
		
		Assert.assertEquals("10 5 N", rover.toString());
	}
}
