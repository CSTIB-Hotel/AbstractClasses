abstract class CSVTradeFile extends File{
    String[] columnHeaders;

    public CSVTradeFile(File f);
    Trade getTrade(int i);
}
