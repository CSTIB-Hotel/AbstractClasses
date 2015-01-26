package AbstractClasses.DataAnalysis;

import AbstractClasses.CommunicationLayer.SearchListener;
import AbstractClasses.CommunicationLayer.SearchResult;
import AbstractClasses.Trade.Trade;
import java.util.List;

abstract class DataAnalyser implements SearchListener {
    
	abstract void sendAnalysis(); //Sends results of analysis to GUI
   
	abstract List<Anomaly> identifyAnomalies(List<Trade> trade);
   
	abstract List<TrendAlert> identifyTrends(List<Trade> trade);
	
	// This is the method responsible for handling an incoming search result
	// It's called by the communication layer whenever a search result is ready	
	@Override	
	abstract SearchResult getSearchResult(SearchResult s);
}
