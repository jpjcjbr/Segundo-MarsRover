package br.com.jp.parser;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.model.Heading;
import br.com.jp.model.OperationType;
import br.com.jp.model.Rover;

public class RoverParserTest {

	public static final String INSTRUCTIONS = "ML";
	public static final String POSITION_INFORMATION = "1 2 E";
	
	private RoverParser roverParser;
	
	private List<OperationType> operations;
	
	@Before
	public void setUp()
	{
		roverParser = new RoverParser();
		
		operations = new ArrayList<OperationType>();
		operations.add(OperationType.MOVE_FORWARD);
		operations.add(OperationType.TURN_LEFT);
	}
	
	@Test
	public void shouldParseStringToRover()
	{
		Rover rover = roverParser.parse(POSITION_INFORMATION, INSTRUCTIONS);
		
		Assert.assertNotNull(rover.getOperations());
		Assert.assertEquals(OperationType.MOVE_FORWARD, rover.getOperations().get(0));
		Assert.assertEquals(OperationType.TURN_LEFT, rover.getOperations().get(1));
		
		Assert.assertNotNull(rover.getHeading());
		Assert.assertEquals(Heading.EAST, rover.getHeading());
		
		Assert.assertNotNull(rover.getPosition());
		Assert.assertEquals(Integer.valueOf(1), rover.getPosition().getX());
		Assert.assertEquals(Integer.valueOf(2), rover.getPosition().getY());
	}
}
