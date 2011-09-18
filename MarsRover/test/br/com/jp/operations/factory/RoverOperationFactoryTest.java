package br.com.jp.operations.factory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.jp.model.OperationType;
import br.com.jp.operations.MoveForwardRoverOperation;
import br.com.jp.operations.RoverOperation;
import br.com.jp.operations.TurnLeftRoverOperation;
import br.com.jp.operations.TurnRightRoverOperation;

public class RoverOperationFactoryTest {

	@Test
	public void shouldReturnTurnLeftOperation() {
		RoverOperation roverOperation = RoverOperationFactory.getRoverOperation(OperationType.TURN_LEFT);
		assertTrue(roverOperation instanceof TurnLeftRoverOperation);
	}
	
	@Test
	public void shouldReturnTurnRightOperation() {
		RoverOperation roverOperation = RoverOperationFactory.getRoverOperation(OperationType.TURN_RIGHT);
		assertTrue(roverOperation instanceof TurnRightRoverOperation);
	}
	
	@Test
	public void shouldReturnMoveForwardOperation() {
		RoverOperation roverOperation = RoverOperationFactory.getRoverOperation(OperationType.MOVE_FORWARD);
		assertTrue(roverOperation instanceof MoveForwardRoverOperation);
	}

}
