package AbstractClasses.CommunicationLayer;

abstract class CommunicationLayer {
	
	// Creates a Search from the current values of fields in the GUI
	abstract Search createSearch(); 
	
	// Sends a Search to the database	
	abstract void sendSearch();

	// Polls for a SearchResult from the database
	abstract SearchResult getResult();

	// Passes the SearchResult on to any listening components (GUI and
	// data analyser)
	abstract void sendResult();
}
