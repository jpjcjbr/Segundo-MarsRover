package br.com.jp.state;

import br.com.jp.model.Heading;
import br.com.jp.model.Rover;

public class HeadingToNorthState implements RoverState{

	@Override
	public void turnLeft(Rover rover) {
		rover.setHeading(Heading.WEST);
	}

	@Override
	public void turnRight(Rover rover) {
		rover.setHeading(Heading.EAST);
	}

	@Override
	public void moveForward(Rover rover) {
		rover.moveToNorth();
	}

}
