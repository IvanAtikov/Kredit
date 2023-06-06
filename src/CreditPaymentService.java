public class CreditPaymentService {

    public double calculate(int kredit, double stavka, int srok) {
        double stavkaMonth = stavka / (100 * 12);
        int i = -srok;
        double result = kredit * stavkaMonth / (1 - Math.pow((1 + stavkaMonth), i));
        return result;
    }
}
