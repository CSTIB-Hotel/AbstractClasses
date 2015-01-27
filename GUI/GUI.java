package AbstractClasses.GUI;

import AbstractClasses.CommunicationLayer.SearchListener;
import AbstractClasses.CommunicationLayer.SearchResult;

abstract class GUI implements SearchListener {
	
	public GUI(){
		throw new UnsupportedOperationException("This method has not yet been implemented.");
    	}
	
	SearchWindow search;
	ErrorWindow error;
	GraphWindow graph;
	DataWindow data;
	AnalysisWindow analysis;
	SummaryWindow summary;

	// This is the method responsible for handling an incoming search result
	// It's called by the communication layer whenever a search result is ready	
	@Override	
	abstract SearchResult getSearchResult(SearchResult s);
}
