import java.io.*;
import java.util.*;
import java.math.*;

public class Helper {
    // https://stackoverflow.com/a/9898528
    public static String integerOrDouble(double val) {
        /*if ((val == Math.floor(val)) && !Double.isInfinite(val)) {
            return Integer.toString((int)val);
        } else */{
            return Double.toString(val);
        }
    }
}
