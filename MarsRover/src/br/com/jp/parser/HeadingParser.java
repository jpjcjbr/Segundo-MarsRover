package br.com.jp.parser;

import br.com.jp.exception.InvalidHeadingException;
import br.com.jp.model.Heading;

public class HeadingParser {

	public Heading parse(String headingInformation) {
		Heading heading = null;

		try
		{
			String[] headingInfo = headingInformation.split("\\s");
			
			String headingAcronym = headingInfo[2];
			
			if(headingAcronym.length() != 1)
			{
				throw new InvalidHeadingException();
			}

			heading = Heading.getHeadingToByAcronym(headingAcronym.charAt(0));
		}
		catch(Exception e)
		{
			throw new InvalidHeadingException();
		}

		return heading;
	}

}
