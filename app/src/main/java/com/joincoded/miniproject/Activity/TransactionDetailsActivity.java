package com.joincoded.miniproject.Activity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.joincoded.miniproject.R;
import com.joincoded.miniproject.Transaction;

public class TransactionDetailsActivity extends AppCompatActivity {

    private TextView transactionDetailsIDText;
    private TextView TransactionDetailsType;
    private TextView TransDetailsTextDate;
    private TextView TransDetailsTextAmount;
    private TextView TransDetailsTextCurrent;
    private TextView TransDetailTextAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_details);

        transactionDetailsIDText = findViewById(R.id.transactionDetailsIDText);
        TransactionDetailsType = findViewById(R.id.TransactionDetailsType);
        TransDetailsTextDate = findViewById(R.id.TransDetailsTextDate);
        TransDetailsTextAmount = findViewById(R.id.TransDetailsTextAmount);
        TransDetailsTextCurrent = findViewById(R.id.TransDetailsTextCurrent);
        TransDetailTextAcc = findViewById(R.id.TransDetailTextAcc);


        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("Transaction")) {
            Transaction transaction = (Transaction) intent.getSerializableExtra("Transaction");
            assert transaction != null;
            displayTransactionDetails(transaction);
        }

//

    }

    @SuppressLint("SetTextI18n")
    private void displayTransactionDetails(Transaction transaction) {
        transactionDetailsIDText.setText("Transaction ID: " + transaction.getId());
        TransactionDetailsType.setText("Transaction Type: " + transaction.getType());
        TransDetailsTextDate.setText("Date: " + transaction.getDate());
        TransDetailsTextAmount.setText("Amount: KWD " + transaction.getAmount());
        TransDetailsTextCurrent.setText("Current Balance: KWD " + transaction.getBalance());
        TransDetailTextAcc.setText("Account: XXXX-XXXX-XXXX-" + transaction.getAccount());
    }
}
