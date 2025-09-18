package nl.bioinf.modeling;

public class Main {
    public static void main(String[] args) {
        DataProvider dataProvider = new CommandLineDataProvider(args);
        StatsAnalyser analyser = new StatsAnalyser(dataProvider);
        analyser.start();
        System.out.println(analyser.getStats());
    }
}
