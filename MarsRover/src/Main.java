import java.util.List;

import br.com.jp.model.Launcher;
import br.com.jp.model.Plateau;
import br.com.jp.model.Rover;
import br.com.jp.parser.PlateauParser;
import br.com.jp.parser.RoverParser;
import br.com.jp.resultprinter.ConsoleResultPrinter;
import br.com.jp.utils.FileUtils;


public class Main {

	public static void main(String[] args) {
		List<String> fileLines = FileUtils.readLines(args[0]);
		
		Plateau plateau = new PlateauParser().parse(fileLines.get(0));
		
		Launcher launcher = new Launcher();
		
		for(int i = 1; i < fileLines.size(); i = i + 2)
		{
			Rover rover = new RoverParser().parse(fileLines.get(i), fileLines.get(i + 1));
			
			launcher.deploy(rover, plateau);
		}
		
		launcher.startRovers(new ConsoleResultPrinter());
	}
}
