package br.com.jp.state;

import br.com.jp.model.Rover;

public interface RoverState {

	void turnLeft(Rover rover);
	
	void turnRight(Rover rover);
	
	void moveForward(Rover rover);
}
