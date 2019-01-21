package com.tw.transaction;

import java.util.*;
import java.util.stream.Collectors;

public class App {



    public static void main(String[] args) {

        TransactionReport transactionReport = new TransactionReport();

        User dhaval = new User("Dhaval",1);
        User shibi = new User("Shibi",2);

        Transaction t1 = new Transaction(2000,new Date(),dhaval,shibi,1);
        Transaction t2 = new Transaction(1500,new Date(),dhaval,shibi,2);
        Transaction t3 = new Transaction(200,new Date(),shibi,dhaval,3);
        Transaction t4 = new Transaction(500,new Date(),dhaval,shibi,4);
        Transaction t5 = new Transaction(700,new Date(),shibi,dhaval,5);

        List<Transaction> transactions = Arrays.asList(new Transaction[]{t1, t2, t3, t4,t5});

        transactionReport.displayResult(transactionReport.getTransactionsFilteredByShares(transactions,2019,100));


    }
}
