package nl.bioinf.modeling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatsAnalyser {
    private final DataProvider dataProvider;
    private List<DataStats> stats = new ArrayList<>();

    public StatsAnalyser(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public List<DataStats> getStats(){
        return Collections.unmodifiableList(this.stats);

    }
    public void start() {
        for (List<Double> series : dataProvider.getData()) {
            if (series.isEmpty()) continue;
            processSeries(series);
        }
    }

    private void processSeries(List<Double> series) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double mean = 0;
        double total = 0;
        double length = series.size();

        for (double value : series) {
            if (value < min) min = value;
            if (value > max) max = value;
            total += value;
        }
        mean = total / length;
        
        DataStats s = new DataStats(min, max, mean, length);
        this.stats.add(s);
//        System.out.println("s = " + s);
//        System.out.println(s.length());
    }
}
