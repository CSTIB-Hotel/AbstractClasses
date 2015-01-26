package AbstractClasses.Database;

import AbstractClasses.Trade.Trade;
import java.io.File;

abstract class CSVTradeFile extends File{
    String[] columnHeaders;

    public CSVTradeFile(File f, String path){
	super(path);
	throw new UnsupportedOperationException("This function has not yet been implemented.");
	// you can't have abstract constructors
    }
    abstract Trade getTrade(int i);
}
