package br.com.jp.model;

import br.com.jp.exception.InvalidXCoordinateException;
import br.com.jp.exception.InvalidYCoordinateException;

public class Position {

	private Integer x;
	
	private Integer y;
	
	public Position(Integer x, Integer y) 
	{
		if(x < 0)
		{
			throw new InvalidXCoordinateException();
		}
		
		if(y < 0)
		{
			throw new InvalidYCoordinateException();
		}
		
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}
	
	public void incrementX()
	{
		x++;
	}
	
	public void decrementX()
	{
		x--;
	}
	
	public void incrementY()
	{
		y++;
	}
	
	public void decrementY()
	{
		y--;
	}
	
	@Override
	public String toString() {
		return x + " " + y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}

}
