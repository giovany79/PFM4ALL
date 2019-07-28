package co.com.pfm4all;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main {
    public static void main(String[] args){

        SpringApplication.run(Main.class, args);

        Transaction transaction1 = new Transaction(2, "tanqueada", "ingreso", new Date(), 1, 2, "vehiculo");
        Collection<Transaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.stream()
                .forEach(System.out::println);

    }
}
