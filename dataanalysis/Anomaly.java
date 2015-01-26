package AbstractClasses.DataAnalysis;

import AbstractClasses.Trade.AssetClass;
import AbstractClasses.Trade.Trade;
import java.util.Date;

abstract class Anomaly {
    Trade anomaly;
    Date startTime, endTime; //time period for which it is an anomaly
}
