package calculate.logic;

import appline.logic.User;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Model implements Serializable {


    public static double run(double a, double b, String math) {
        double result;
        switch (math) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                result = 0;
        }
        return result;
    }
}
