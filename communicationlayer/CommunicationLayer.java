abstract class CommunicationLayer {
	SearchQuery createSearchQuery();
	void sendSearchQuery(); // Sends SearchQuery to database
	SearchResult getResult();
	void sendResult()
}
