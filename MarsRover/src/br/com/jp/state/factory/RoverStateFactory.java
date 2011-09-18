package br.com.jp.state.factory;

import br.com.jp.model.Heading;
import br.com.jp.state.HeadingToEastState;
import br.com.jp.state.HeadingToNorthState;
import br.com.jp.state.HeadingToSouthState;
import br.com.jp.state.HeadingToWestState;
import br.com.jp.state.RoverState;

public class RoverStateFactory {

	private static HeadingToEastState headingToEastState = new HeadingToEastState();
	private static HeadingToWestState headingToWestState = new HeadingToWestState();
	private static HeadingToSouthState headingToSouthState = new HeadingToSouthState();
	private static HeadingToNorthState headingToNorthState = new HeadingToNorthState();
	
	public static RoverState getRoverState(Heading heading)
	{
		RoverState roverState = null;
		
		switch (heading) {
		case EAST: 
			roverState = headingToEastState; 
			break;
		case NORTH:
			roverState = headingToNorthState; 
			break;
		case SOUTH:
			roverState = headingToSouthState; 
			break;
		case WEST:
			roverState = headingToWestState; 
			break;
		}
		
		return roverState; 
	}
}
