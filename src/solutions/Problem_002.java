package solutions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Problem_002 {

    public String rate (double localCurrency, String foreignCurrency) {
        BigDecimal b = new BigDecimal(localCurrency);
        b = b.setScale(2, RoundingMode.HALF_UP);
        b = b.stripTrailingZeros();
        String localString = b.toString();
        return localString+foreignCurrency;
    }
    public String rate (double localCurrency, double foreignCurrency) {
        double result = localCurrency+foreignCurrency;
        BigDecimal bd = new BigDecimal(Double.toString(result));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.toString();
    }
    public String rate (String localCurrency, String foreignCurrency) {
        return localCurrency+foreignCurrency;
    }
}
