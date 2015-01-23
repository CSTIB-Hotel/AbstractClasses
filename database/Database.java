abstract class Database{
    private void addTrade(Trade trade);
    void addTrades(CSVTradeFile csv);
    SearchResult search(Search s);
    Time getLastUpdateTime();
    Search[] getSavedSearches();
    UPI[] getMatchingUPI(String s);
}
