package AbstractClasses.GUI;

abstract class GUI {
    public GUI(){
	throw new UnsupportedOperationException("This method has not yet been implemented.");
    }
    SearchWindow search;
    ErrorWindow error;
    GraphWindow graph;
    DataWindow data;
    AnalysisWindow analysis;
    SummaryWindow summary;
}
