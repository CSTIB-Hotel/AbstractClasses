abstract class Search {
    
    AssetClass assetClass;
    Asset asset;
    int minPrice, maxPrice;
    Currency currency;
    DateTime startTime, endTime;
    UPI upi;
    
    public Search(AssetClass ac, Asset a, int minP, int maxP, Currency c, DateTime st, DateTime et, UPI upi){};
}
