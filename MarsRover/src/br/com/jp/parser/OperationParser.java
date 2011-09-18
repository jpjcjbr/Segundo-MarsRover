package br.com.jp.parser;

import java.util.ArrayList;
import java.util.List;

import br.com.jp.model.OperationType;

public class OperationParser {

	public List<OperationType> parse(String instructions) {
		List<OperationType> operations = new ArrayList<OperationType>();
		
		for(int i = 0; i < instructions.length(); i++)
		{
			char command = instructions.charAt(i);
			
			OperationType operationType = OperationType.getOperationByAcronym(command);
			
			operations.add(operationType);
		}
		
		return operations;
	}

}
