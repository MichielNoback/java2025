package nl.bioinf.modeling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommandLineDataProvider implements DataProvider{
    private List<List<Double>> numbers = new ArrayList<>();

    public CommandLineDataProvider(String[] args) {
        parseCommandLine(args);
    }

    private void parseCommandLine(String[] args) {
        for (String arg : args) {
            //System.out.println("arg = " + arg);
            String[] split = arg.split(",");
            //System.out.println("split = " + Arrays.toString(split));

            List<Double> numbersList = new ArrayList<>();
            for (String numberStr : split) {
                numbersList.add(Double.parseDouble(numberStr));
            }
            //System.out.println("numbers = " + numbers);
            this.numbers.add(numbersList);
        }
        //System.out.println("this.numbers = " + this.numbers);
    }

    @Override
    public List<List<Double>> getData() {
        return Collections.unmodifiableList(this.numbers); //encapsulation!
    }
}
