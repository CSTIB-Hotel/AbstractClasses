abstract class CommunicationLayer {
	
	// Creates a Search from the current values of fields in the GUI
	Search createSearch(); 
	
	// Sends a Search to the database	
	void sendSearch();

	// Polls for a SearchResult from the database
	SearchResult getResult();

	// Passes the SearchResult on to any listening components (GUI and
	// data analyser)
	void sendResult()
}
