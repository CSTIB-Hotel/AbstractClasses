package AbstractClasses.CommunicationLayer;

import AbstractClasses.Trade.Trade;
import java.util.List;

public abstract class SearchResult {
	
	// A list containing all of the trades fitting the search query	
	List<Trade> resultData;
	
	int numResults;
	double elapsedTime;
}
