package com.tw.transaction;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionReport {

    public List<Transaction> getTransactionsFilteredByShares(List<Transaction> transactions, int date, long shares) {

        return transactions.stream().filter( transaction -> transaction.getShares() > shares).filter(transaction -> {
            final Date date1 = transaction.getDate();
            Calendar calendar = Calendar. getInstance();
            calendar.setTime(date1);
            int year = calendar.get(Calendar.YEAR);
            return year == date;

        }).collect(Collectors.toList());


    }


    public void displayResult(List<Transaction> transactions) {
        System.out.println("Date\tShares\tFrom\tTo");
        transactions.forEach(transaction -> {
            System.out.println(transaction.getDate() +"\t"+transaction.getShares()+"\t"+transaction.getFrom().getName()+"\t"+transaction.getTo().getName());
        });
    }
}
