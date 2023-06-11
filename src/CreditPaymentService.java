public class CreditPaymentService {

    public double calculate(int credit, double rate, int term) {
        double monthRate = rate / (100 * 12);
        int i = -term;
        double result = credit * monthRate / (1 - Math.pow((1 + monthRate), i));
        return result;
    }
}
