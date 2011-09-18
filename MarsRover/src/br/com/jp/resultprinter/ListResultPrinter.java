package br.com.jp.resultprinter;

import java.util.ArrayList;
import java.util.List;

public class ListResultPrinter implements ResultPrinter{

	private List<String> results = new ArrayList<String>();
	
	@Override
	public void print(String result) {
		results.add(result);
	}

	public List<String> getResults() {
		return results;
	}

}
