package br.com.jp.state.factory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.jp.model.Heading;
import br.com.jp.state.HeadingToEastState;
import br.com.jp.state.HeadingToNorthState;
import br.com.jp.state.HeadingToSouthState;
import br.com.jp.state.HeadingToWestState;
import br.com.jp.state.RoverState;

public class RoverStateFactoryTest {

	@Test
	public void shouldReturnHeadingToSouthState() {
		RoverState roverState = RoverStateFactory.getRoverState(Heading.SOUTH);
		assertTrue(roverState instanceof HeadingToSouthState);
	}
	
	@Test
	public void shouldReturnHeadingToNorthState() {
		RoverState roverState = RoverStateFactory.getRoverState(Heading.NORTH);
		assertTrue(roverState instanceof HeadingToNorthState);
	}
	
	@Test
	public void shouldReturnHeadingToEastState() {
		RoverState roverState = RoverStateFactory.getRoverState(Heading.EAST);
		assertTrue(roverState instanceof HeadingToEastState);
	}
	
	@Test
	public void shouldReturnHeadingToWestState() {
		RoverState roverState = RoverStateFactory.getRoverState(Heading.WEST);
		assertTrue(roverState instanceof HeadingToWestState);
	}

}
