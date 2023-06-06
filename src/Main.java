public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

       /// int kredit = 1000000;     // Сумма кредита
       /// double stavka = 9.99;    // Ставка по кредиту
       ///int srok = 36;           //Срок по кредиту

       /// double plateg = service.calculate (kredit, stavka, srok);
       ///int mesPlateg = (int) plateg;
       ///System.out.println("Месячный платёж  =   " + mesPlateg);

        System.out.println("Кредит на 1 год");
        System.out.println("Месячный платёж  =  " + (int) service.calculate (1000000, 9.99, 12));
        System.out.println();
        System.out.println("Кредит на 2 года");
        System.out.println("Месячный платёж  =  " + (int) service.calculate (1000000, 9.99, 24));
        System.out.println();
        System.out.println("Кредит на 3 года");
        System.out.println("Месячный платёж  =  " + (int) service.calculate (1000000, 9.99, 36));
    }
}