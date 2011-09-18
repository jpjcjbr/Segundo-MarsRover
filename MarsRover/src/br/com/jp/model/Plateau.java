package br.com.jp.model;

import br.com.jp.exception.InvalidHeightException;
import br.com.jp.exception.InvalidWidthException;

public class Plateau {

	private Integer width;
	
	private Integer height;
	
	public Plateau(Integer width, Integer height) {
		
		boolean isValidWidth = width <= 0;
		
		if(isValidWidth)
		{
			throw new InvalidWidthException();
		}
		
		boolean isValidHeight = height <= 0;
		
		if(isValidHeight)
		{
			throw new InvalidHeightException();
		}
		
		this.width = width;
		this.height = height;
	}

	public Integer getWidth() {
		return this.width;
	}

	public Integer getHeight() {
		return this.height;
	}

	public boolean contains(Position position) {
		boolean containsInXCoordinate = position.getX() <= width;
		boolean containsInYCoordinate = position.getY() <= height;
		
		return containsInXCoordinate && containsInYCoordinate;
	}

}
