package com.joincoded.miniproject;

import java.util.ArrayList;
import java.util.List;

public class DummyDataRepository {

    public static List<Transaction> generateDummyTransactions() {
        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction(1, "2024-01-15", 3435, 100.00, 12575653, TransactionType.WITHDRAW));
        transactions.add(new Transaction(2, "2024-01-16", 1234, 150.00, 1443200, TransactionType.DEPOSIT));
        transactions.add(new Transaction(3, "2024-01-17", 2424, 50.00, 9987678, TransactionType.TRANSFER));


        return transactions;
    }
}
