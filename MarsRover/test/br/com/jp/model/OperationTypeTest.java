package br.com.jp.model;

import org.junit.Assert;
import org.junit.Test;

import br.com.jp.exception.InvalidRoverOperationException;

public class OperationTypeTest {

	@Test
	public void shouldGetTurnLeftOperationFromAcronymL()
	{
		Assert.assertEquals('L', OperationType.getOperationByAcronym('L').getAcronym());
	}
	
	@Test
	public void shouldGetTurnRightOperationFromAcronymR()
	{
		Assert.assertEquals('R', OperationType.getOperationByAcronym('R').getAcronym());
	}
	
	@Test
	public void shouldGetMoveForwardOperationFromAcronymM()
	{
		Assert.assertEquals('M', OperationType.getOperationByAcronym('M').getAcronym());
	}
	
	@Test(expected = InvalidRoverOperationException.class)
	public void shouldThrowExceptionWhenInvalidAcronym()
	{
		OperationType.getOperationByAcronym('J');
	}
}
