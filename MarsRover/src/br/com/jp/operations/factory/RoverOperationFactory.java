package br.com.jp.operations.factory;

import br.com.jp.model.OperationType;
import br.com.jp.operations.MoveForwardRoverOperation;
import br.com.jp.operations.RoverOperation;
import br.com.jp.operations.TurnLeftRoverOperation;
import br.com.jp.operations.TurnRightRoverOperation;

public class RoverOperationFactory {

	private static MoveForwardRoverOperation moveForwardRoverOperation = new  MoveForwardRoverOperation();
	
	private static TurnLeftRoverOperation turnLeftRoverOperation = new TurnLeftRoverOperation();
	
	private static TurnRightRoverOperation turnRightRoverOperation = new TurnRightRoverOperation();
	
	public static RoverOperation getRoverOperation(OperationType operation)
	{
		RoverOperation roverOperation = null;
		
		switch (operation) {
		case TURN_LEFT: 
			roverOperation = turnLeftRoverOperation;
			break;
		case TURN_RIGHT: 
			roverOperation = turnRightRoverOperation;
			break;
		case MOVE_FORWARD: 
			roverOperation = moveForwardRoverOperation;
			break;
		}
		
		return roverOperation;
	}
}
