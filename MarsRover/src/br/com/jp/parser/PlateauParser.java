package br.com.jp.parser;

import br.com.jp.exception.InvalidPlateauInformationException;
import br.com.jp.model.Plateau;

public class PlateauParser {

	public Plateau parse(String plateauInformation) {
		Plateau plateau = null;

		try
		{
			String[] plateauSize = plateauInformation.split("\\s");

			Integer width = Integer.parseInt(plateauSize[0]);
			Integer height = Integer.parseInt(plateauSize[1]);

			plateau = new Plateau(width, height);
		}
		catch(Exception e)
		{
			throw new InvalidPlateauInformationException();
		}

		return plateau;
	}
	
}
