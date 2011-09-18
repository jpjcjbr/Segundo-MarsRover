package br.com.jp.operations;

import br.com.jp.model.Rover;

public class TurnLeftRoverOperation implements RoverOperation{

	public void execute(Rover rover) {
		rover.turnLeft();
	}
}
