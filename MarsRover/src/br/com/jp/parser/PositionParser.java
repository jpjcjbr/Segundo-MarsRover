package br.com.jp.parser;

import br.com.jp.exception.InvalidPositionInformationException;
import br.com.jp.model.Position;

public class PositionParser {

	public Position parse(String positionInformation) {
		Position position = null;

		try
		{
			String[] positionInfo = positionInformation.split("\\s");

			Integer x = Integer.parseInt(positionInfo[0]);
			Integer y = Integer.parseInt(positionInfo[1]);

			position = new Position(x, y);
		}
		catch(Exception e)
		{
			throw new InvalidPositionInformationException();
		}

		return position;
	}

}
