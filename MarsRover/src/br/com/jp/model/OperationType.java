package br.com.jp.model;

import br.com.jp.exception.InvalidRoverOperationException;

public enum OperationType {
	TURN_LEFT('L'), TURN_RIGHT('R'), MOVE_FORWARD('M');

	private char acronym;

	private OperationType(char acronym) {
		this.acronym = acronym;
	}

	public char getAcronym() {
		return acronym;
	}

	public static OperationType getOperationByAcronym(char command) {

		switch (command) {
		case 'L':
			return OperationType.TURN_LEFT;
		case 'R':
			return OperationType.TURN_RIGHT;
		case 'M':
			return OperationType.MOVE_FORWARD;

		default:
			throw new InvalidRoverOperationException();
		}
	}
}
