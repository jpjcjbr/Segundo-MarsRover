package br.com.jp.parser;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.jp.model.OperationType;

public class OperationParserTest {

	private OperationParser operationParser;
	
	@Before
	public void setUp()
	{
		operationParser = new OperationParser();
	}

	@Test
	public void shouldParseMoveForwardOperation()
	{
		List<OperationType> operations = operationParser.parse("M");
		
		Assert.assertNotNull(operations);
		Assert.assertEquals(1, operations.size());
		Assert.assertTrue(operations.contains(OperationType.MOVE_FORWARD));
	}
	
	@Test
	public void shouldParseTurnLeftOperation()
	{
		List<OperationType> operations = operationParser.parse("L");
		
		Assert.assertNotNull(operations);
		Assert.assertEquals(1, operations.size());
		Assert.assertTrue(operations.contains(OperationType.TURN_LEFT));
	}
	
	@Test
	public void shouldParseTurnRightOperation()
	{
		List<OperationType> operations = operationParser.parse("R");
		
		Assert.assertNotNull(operations);
		Assert.assertEquals(1, operations.size());
		Assert.assertTrue(operations.contains(OperationType.TURN_RIGHT));
	}
}
