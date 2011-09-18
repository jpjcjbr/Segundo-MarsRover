package br.com.jp.state;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jp.state.factory.RoverStateFactoryTest;

@SuiteClasses({
	RoverStateFactoryTest.class,
	HeadingToEastStateTest.class,
	HeadingToNorthStateTest.class,
	HeadingToSouthStateTest.class,
	HeadingToWestStateTest.class
})
@RunWith(Suite.class)
public class RoverStateSuite {

}
