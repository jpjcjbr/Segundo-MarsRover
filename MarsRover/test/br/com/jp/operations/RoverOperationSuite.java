package br.com.jp.operations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jp.operations.factory.RoverOperationFactoryTest;

@SuiteClasses({
	RoverOperationFactoryTest.class,
	MoveForwardRoverOperationTest.class,
	TurnLeftRoverOperationTest.class,
	TurnRightRoverOperationTest.class
})
@RunWith(Suite.class)
public class RoverOperationSuite {

}
