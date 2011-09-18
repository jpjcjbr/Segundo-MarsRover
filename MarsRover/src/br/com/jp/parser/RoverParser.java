package br.com.jp.parser;

import java.util.List;

import br.com.jp.model.Heading;
import br.com.jp.model.OperationType;
import br.com.jp.model.Position;
import br.com.jp.model.Rover;

public class RoverParser {

	public Rover parse(String positionInformation, String instructions) {
		Position position = new PositionParser().parse(positionInformation);
		Heading heading = new HeadingParser().parse(positionInformation);
		List<OperationType> operations = new OperationParser().parse(instructions);
		
		return new Rover(position, heading, operations);
	}

}
