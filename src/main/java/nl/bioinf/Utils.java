package nl.bioinf;

public class Utils {
    /**
     * Calculates duistance (meters) based on speed (m/s) and time (s)
     * @param speed in meters per second
     * @param time in seconds
     * @return distance in meters
     */
    public static double calculateDistance(double speed, double time) {
        //if (speed <  0 || time < 0) {}
        if (speed < 0) {
            throw new IllegalArgumentException("Distance based on negative speed is not allowed: " + speed);
        }
        if (time < 0) {
            throw new IllegalArgumentException("Distance based on negative time is not allowed" + time);
        }
        return speed * time;
    }
}
