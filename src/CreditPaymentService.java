public class CreditPaymentService {

    public double calculate(int credit, double rate, int term) {
        double stavkaMonth = rate / (100 * 12);
        int i = -term;
        double result = credit * stavkaMonth / (1 - Math.pow((1 + stavkaMonth), i));
        return result;
    }
}
