abstract class Trade {
	
	//TODO: not sure on how to represent some of these fields at the moment	

	// The fields in here are a direct copy of the fields of a trade taken
	// from the OTC repository
	
	long disseminationID;
	long originalDisseminationID;
	Action action;
	boolean cleared;
	Collateralization collateralization;
	boolean bespoke;
	boolean exceptionVenue; // true for ON, false for OFF
	boolean blockTrades;
	Date effectiveDate;
	Date endDate;
	AssetClass assetClass;
	SubAssetClass subAssetClass;
	??? taxonomy; 
	PriceFormingContinuationData priceFormingContinuationData;
	String underlyingAsset1;
	String underlyingAsset2;
	String priceNotationType;
	int priceNotation;
	String notionalCurrency1;
	String notionalCurrency2;
	long roundedNotionalAmount1;
	long roundedNotionalAmount2;
	
	// Whole bunch of extra stuff here, not sure how relevant it really is	
}
