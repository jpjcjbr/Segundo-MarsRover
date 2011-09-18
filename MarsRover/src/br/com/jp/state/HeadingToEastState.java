package br.com.jp.state;

import br.com.jp.model.Heading;
import br.com.jp.model.Rover;

public class HeadingToEastState implements RoverState{

	@Override
	public void turnLeft(Rover rover) {
		rover.setHeading(Heading.NORTH);
	}

	@Override
	public void turnRight(Rover rover) {
		rover.setHeading(Heading.SOUTH);
	}

	@Override
	public void moveForward(Rover rover) {
		rover.moveToEast();
	}

}
