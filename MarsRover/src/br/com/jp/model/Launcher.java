package br.com.jp.model;

import java.util.ArrayList;
import java.util.List;

import br.com.jp.operations.RoverOperation;
import br.com.jp.operations.factory.RoverOperationFactory;
import br.com.jp.resultprinter.ResultPrinter;

public class Launcher {

	private List<Rover> deployedRovers = new ArrayList<Rover>();
	
	public void deploy(Rover rover, Plateau plateau) {
		
		boolean roverNotNull = rover != null;
		boolean plateauNotNull = plateau != null;
		
		if(roverNotNull && plateauNotNull)
		{
			if(plateau.contains(rover.getPosition()))
			{
				rover.associatePlateau(plateau);
				deployedRovers.add(rover);
			}
		}
	}

	public List<Rover> getDeployedRovers() {
		return deployedRovers;
	}

	public void startRovers(ResultPrinter resultPrinter) 
	{
		for(Rover rover: deployedRovers)
		{
			for(OperationType operation: rover.getOperations())
			{
				RoverOperation roverOperation = RoverOperationFactory.getRoverOperation(operation);
				
				roverOperation.execute(rover);
			}
			
			resultPrinter.print(rover.toString());
		}
	}

}
