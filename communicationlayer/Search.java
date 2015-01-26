package AbstractClasses.CommunicationLayer;

import AbstractClasses.Trade.AssetClass;
import AbstractClasses.Trade.TradeType;
import AbstractClasses.Trade.UPI;
import java.util.Currency;
import java.util.Date;

public abstract class Search {
    
    TradeType tradeType;   
    AssetClass assetClass;
    String asset;
    int minPrice, maxPrice;
    Currency currency;
    Date startTime, endTime;
    UPI upi;
    
    public Search(AssetClass ac, String asset, int minP, int maxP, Currency c, Date st, Date et, UPI upi) {
    	throw new UnsupportedOperationException("This method has not yet been implemented.");
    };
}
