package br.com.jp.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.resultprinter.ListResultPrinter;

public class LauncherTest {

	private static final int NUMBER_OF_DEPLOYED_ROVERS = 1;

	private Launcher launcher;
	
	private Rover rover;
	
	private Plateau plateau;
	
	private Position roverPosition;
	
	private Position invalidRoverPosition;
	
	private List<OperationType> operations;
	
	@Before
	public void setUp()
	{
		launcher = new Launcher();
		plateau = new Plateau(3, 4);
		roverPosition = new Position(1, 4);
		invalidRoverPosition = new Position(10, 2);
		
		operations = new ArrayList<OperationType>();
		operations.add(OperationType.MOVE_FORWARD);
		operations.add(OperationType.TURN_LEFT);
		
		rover = new Rover(roverPosition, Heading.NORTH, operations);
	}
	
	@Test
	public void shouldDeployRoverInPlateau()
	{
		launcher.deploy(rover, plateau);
		
		List<Rover> deployedRovers = launcher.getDeployedRovers();
		
		Assert.assertFalse("Rover not deployed Rover in Plateau", deployedRovers.isEmpty());
		Assert.assertEquals("Wrong number of deployed rovers", NUMBER_OF_DEPLOYED_ROVERS, deployedRovers.size());
		Assert.assertTrue("Deployed rover not found in list of deployed rovers", deployedRovers.contains(rover));
	}
	
	@Test
	public void shouldNotDeployANullRover()
	{
		launcher.deploy(null, plateau);
		
		assertThatRoverIsNotDeployed(launcher);
	}
	
	@Test
	public void shouldAssociatePlateauWithRoverWhenRoverDeployed()
	{
		launcher.deploy(rover, plateau);
		
		Assert.assertEquals(plateau, rover.getPlateau());
	}
	
	@Test
	public void shouldNotDeployRoverInANullPlateau()
	{
		launcher.deploy(rover, null);
		
		assertThatRoverIsNotDeployed(launcher);
	}
	
	@Test
	public void shouldNotDeployRoverWhenPositionDoesNotExistInPlateau()
	{
		rover = new Rover(invalidRoverPosition, Heading.NORTH, operations);
		
		launcher.deploy(rover, plateau);
		
		assertThatRoverIsNotDeployed(launcher);
	}
	
	@Test
	public void shouldStartRovers()
	{
		launcher.deploy(rover, plateau);
		
		ListResultPrinter listResultPrinter = new ListResultPrinter();
		
		launcher.startRovers(listResultPrinter);
		
		Assert.assertTrue(listResultPrinter.getResults().contains("1 5 W"));
	}
	
	private void assertThatRoverIsNotDeployed(Launcher launcher) 
	{
		List<Rover> deployedRovers = launcher.getDeployedRovers();
		
		Assert.assertTrue("Rover deployed Rover in Plateau", deployedRovers.isEmpty());
		Assert.assertEquals("Wrong number of deployed rovers", 0, deployedRovers.size());
	}
}
