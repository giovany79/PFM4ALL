import java.util.Date;

public class Main {
    public static void main(String[] args){

        Date date = new Date();
        Transaction transaction = new Transaction();
        transaction.setAccountId(1);
        transaction.setAmount(130000);
        transaction.setDate(date);
        transaction.setTransactionId(1);
        transaction.setType("servicios");


        System.out.println(transaction);

    }
}
