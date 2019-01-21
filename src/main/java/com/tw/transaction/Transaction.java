package com.tw.transaction;

import java.util.Date;

public class Transaction {

    private long shares;
    private Date date;
    private User from;
    private User to;
    private long txn_id;

    public Transaction(long shares, Date date, User from, User to,long txn_id) {
        this.shares = shares;
        this.date = date;
        this.from = from;
        this.to = to;
        this.txn_id = txn_id;
    }

    public long getShares() {
        return shares;
    }


    public Date getDate() {
        return date;
    }


    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    public long getTxn_id() {
        return txn_id;
    }
}
