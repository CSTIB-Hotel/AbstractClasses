abstract class DataAnalyser {
    void sendAnalysis(); //Sends results of analysis to GUI
    List<Anomaly> identifyAnomalies(List<Trade>);
    List<TrendAlert> identifyTrends(List<Trade>);
}
