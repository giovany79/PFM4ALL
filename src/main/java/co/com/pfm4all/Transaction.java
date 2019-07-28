package co.com.pfm4all;

import lombok.AllArgsConstructor;
import lombok.Data;



import java.util.Date;


@Data
@AllArgsConstructor
public class Transaction {

    private int  transactionId;
    private String description;
    private String type;
    private Date date;
    private double amount;
    private double accountId;
    private String category;

}
