import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jp.model.ModelSuite;
import br.com.jp.operations.RoverOperationSuite;
import br.com.jp.parser.ParserSuite;
import br.com.jp.state.RoverStateSuite;

@SuiteClasses({
	ModelSuite.class,
	ParserSuite.class,
	RoverOperationSuite.class,
	RoverStateSuite.class
})
@RunWith(Suite.class)
public class MarsRoverSuite {
	
}
