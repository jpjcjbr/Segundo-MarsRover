package br.com.jp.model;

import br.com.jp.exception.InvalidHeadingException;

public enum Heading {
	NORTH('N'), EAST('E'), SOUTH('S'), WEST('W');
	
	private char acronym;

	private Heading(char acronym)
	{
		this.acronym = acronym;
	}
	
	public char getAcronym() {
		return acronym;
	}
	
	public static Heading getHeadingToByAcronym(char acronym)
	{
		switch (acronym) {
		case 'N': return Heading.NORTH;
		case 'E': return Heading.EAST;
		case 'S': return Heading.SOUTH;
		case 'W': return Heading.WEST;

		default:
			throw new InvalidHeadingException(); 
		}
	}
}
