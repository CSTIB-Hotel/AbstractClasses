package AbstractClasses.CommunicationLayer;

import AbstractClasses.Trade.Trade;
import java.util.List;

public abstract class SearchResult {
	
	// A list containing all of the trades fitting the search query	
	List<Trade> resultData;
	
	// Statistics relating to the results - could be useful	
	int numResults;
	double elapsedTime;
}
