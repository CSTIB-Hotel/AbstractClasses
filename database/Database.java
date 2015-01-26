package AbstractClasses.Database;

import AbstractClasses.Trade.Trade;
import AbstractClasses.CommunicationLayer.Search;
import AbstractClasses.CommunicationLayer.SearchResult;
import AbstractClasses.Trade.UPI;
import java.util.Date;

abstract class Database{
    abstract protected void addTrade(Trade trade);
    abstract void addTrades(CSVTradeFile csv);
    abstract SearchResult search(Search s);
    
    /**
     * 
     * @return The time the database was last updated
     */
    abstract Date getLastUpdateTime();
    
    
    /**
     * 
     * @return A list of previously saved searches
     */
    abstract Search[] getSavedSearches();
    
    /**
     * 
     * @param s The string to search against
     * @return A list of UPIs which have the parameter as a substring
     */
    abstract UPI[] getMatchingUPI(String s);
}
