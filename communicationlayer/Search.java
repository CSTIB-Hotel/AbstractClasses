package AbstractClasses.CommunicationLayer;

import AbstractClasses.Trade.Asset;
import AbstractClasses.Trade.*;
import java.util.Currency;
import java.util.Date;

public abstract class Search {
    
    AssetClass assetClass;
    Asset asset;
    int minPrice, maxPrice;
    Currency currency;
    Date startTime, endTime;
    UPI upi;
    
    public Search(AssetClass ac, Asset a, int minP, int maxP, Currency c, Date st, Date et, UPI upi){
	throw new UnsupportedOperationException("This method has not yet been implemented.");
    };
}
