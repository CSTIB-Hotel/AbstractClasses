package AbstractClasses.DataAnalysis;

import AbstractClasses.Trade.Trade;
import java.util.List;

abstract class DataAnalyser {
    abstract void sendAnalysis(); //Sends results of analysis to GUI
    abstract List<Anomaly> identifyAnomalies(List<Trade> trade);
    abstract List<TrendAlert> identifyTrends(List<Trade> trade);
}
