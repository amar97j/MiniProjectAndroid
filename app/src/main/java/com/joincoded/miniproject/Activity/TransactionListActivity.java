package com.joincoded.miniproject.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.joincoded.miniproject.DummyDataRepository;
import com.joincoded.miniproject.Interface.OnClickListenerInterface;
import com.joincoded.miniproject.R;
import com.joincoded.miniproject.Transaction;
import com.joincoded.miniproject.TransactionAdapter;

import java.io.Serializable;
import java.util.List;

public class TransactionListActivity extends AppCompatActivity implements OnClickListenerInterface {

    private RecyclerView recyclerView;
    private TransactionAdapter transactionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        List<Transaction> transactionList = DummyDataRepository.generateDummyTransactions();

        transactionAdapter = new TransactionAdapter(transactionList, this);

        recyclerView.setAdapter(transactionAdapter);

    }

    @Override
    public void onItemClick(Transaction transaction) {
        Intent intent = new Intent(TransactionListActivity.this, TransactionDetailsActivity.class);

        intent.putExtra("Transaction", transaction);
        startActivity(intent);
    }
}








