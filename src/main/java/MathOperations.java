
public class MathOperations {

    public static double addition(double x, double y){
        double sumResult = x + y;
        return sumResult;
          }

    public static double subtraction(double x, double y){
        double difResult = x - y;
        return difResult;
    }

    public static double multiplication(double x, double y){
        double prodResult = x * y;
        return prodResult;
    }

    public static double division(double x, double y){
        double fracResult = x / y;
        return fracResult;

    }

    public static double circleArea(int d){
        return Math.PI * Math.pow ((d / 2), 2);
    }


}
