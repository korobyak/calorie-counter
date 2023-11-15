public class Converter {

    static double stepToKm = 0.00075;
    static double stepToKilCal = 0.05;

    public static double kilCal(int steps) {
        return steps * stepToKilCal;
    }

    public static double km(int steps) {
        return steps * stepToKm;
    }
}
