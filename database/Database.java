package AbstractClasses.Database;

import AbstractClasses.Trade.Trade;
import AbstractClasses.CommunicationLayer.Search;
import AbstractClasses.CommunicationLayer.SearchResult;
import AbstractClasses.Trade.UPI;
import java.util.Date;

/**
 * 
 * @author Wai-Wai Ng
 */
abstract class Database{
    
    /**
     * Adds a trade to the database
     * @param trade a trade to be added to the database
     */
    abstract void addTrade(Trade trade);
    
    /**
     * Adds a CSV file listing trades to the database
     * @param csv the relevant CSV file
     */
    abstract void addTrades(CSVTradeFile csv);
    
    /**
     * 
     * @param s the search parameters
     * @return all data matching the search 
     */
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
