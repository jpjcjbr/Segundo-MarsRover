package br.com.jp.operations;

import br.com.jp.model.Rover;

public class MoveForwardRoverOperation implements RoverOperation{

	@Override
	public void execute(Rover rover) {
		rover.moveForward();
	}

}
