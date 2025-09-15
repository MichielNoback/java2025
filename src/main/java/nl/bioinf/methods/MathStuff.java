package nl.bioinf.methods;

public class MathStuff {

    double powerUp(double x, double y) {
        return Math.pow(x, y);
    }

    double powerUp(double x) {
        //do something extra
        return powerUp(x, 2);
    }

}
