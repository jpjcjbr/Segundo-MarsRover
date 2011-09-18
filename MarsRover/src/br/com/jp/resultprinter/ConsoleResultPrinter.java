package br.com.jp.resultprinter;

public class ConsoleResultPrinter implements ResultPrinter{

	@Override
	public void print(String result) {
		System.out.println(result);
	}

}
