package br.com.jp.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({
	PlateauTest.class,
	RoverTest.class,
	LauncherTest.class,
	PositionTest.class,
	HeadingTest.class,
	OperationTypeTest.class
})
@RunWith(Suite.class)
public class ModelSuite {

}
