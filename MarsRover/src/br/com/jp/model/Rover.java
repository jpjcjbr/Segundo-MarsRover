package br.com.jp.model;

import java.util.List;

import br.com.jp.exception.InvalidRoverInformationException;
import br.com.jp.state.factory.RoverStateFactory;


public class Rover {

	private Plateau plateau;
	
	private Position position;
	
	private Heading heading;
	
	private List<OperationType> operations;
	
	public Rover(Position position, Heading heading, List<OperationType> operations) {

		this(position, heading);
		
		boolean operationsIsNull = operations == null;
		
		if(operationsIsNull)
		{
			throw new InvalidRoverInformationException();
		}
		
		this.operations = operations;
	}

	public Rover(Position position, Heading heading) {
		boolean positionIsNull = position == null;
		boolean headingIsNull = heading == null;
		
		if(headingIsNull || positionIsNull)
		{
			throw new InvalidRoverInformationException();
		}
		
		this.heading = heading;
		this.position = position;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void associatePlateau(Plateau plateau) {
		this.plateau = plateau;
	}

	public Position getPosition() {
		return position;
	}

	public Heading getHeading() {
		return heading;
	}
	
	public List<OperationType> getOperations()
	{
		return operations;
	}
	
	@Override
	public String toString() {
		return position.toString() + " " + heading.getAcronym();
	}

	public void turnLeft()
	{
		RoverStateFactory.getRoverState(heading).turnLeft(this);
	}
	
	public void turnRight()
	{
		RoverStateFactory.getRoverState(heading).turnRight(this);
	}
	
	public void moveForward()
	{
		RoverStateFactory.getRoverState(heading).moveForward(this);
	}
	
	public void moveToSouth()
	{
		position.decrementY();
	}
	
	public void moveToNorth()
	{
		position.incrementY();
	}
	
	public void moveToEast()
	{
		position.incrementX();
	}
	
	public void moveToWest()
	{
		position.decrementX();
	}

	public void setHeading(Heading heading) {
		this.heading = heading;
	}
}
