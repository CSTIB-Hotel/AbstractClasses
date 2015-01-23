abstract class DataAnalyser {
    void sendAnalysis(); //Sends results of analysis to GUI
    Anomaly[] identifyAnomalies();
    TrendAlert[] identifyTrendAlerts();
}
