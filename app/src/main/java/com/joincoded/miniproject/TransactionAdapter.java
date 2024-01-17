package com.joincoded.miniproject;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joincoded.miniproject.Interface.OnClickListenerInterface;

import java.util.List;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {

    private final List<Transaction> transactionList;
    private OnClickListenerInterface onItemClickListener;


    public TransactionAdapter(List<Transaction> transactionList, OnClickListenerInterface onItemClickListener ) {
        this.transactionList = transactionList;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transactions, parent, false);
        return new TransactionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position) {
        Transaction transaction = transactionList.get(position);
        holder.bind(transaction);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(transaction);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return transactionList.size();
    }




    public static class TransactionViewHolder extends RecyclerView.ViewHolder {

        private final TextView dataTextView;
        private final TextView typeTextView;
        private final TextView amountTextview;
        private final TextView balanceTextView;

        public TransactionViewHolder(@NonNull View itemView) {
            super(itemView);
            dataTextView = itemView.findViewById(R.id.dataTextView);
            typeTextView = itemView.findViewById(R.id.typeTextView);
            amountTextview = itemView.findViewById(R.id.amountTextview);
            balanceTextView = itemView.findViewById(R.id.balanceTextView);
        }

        @SuppressLint("SetTextI18n")
        public void bind(Transaction transaction) {
            dataTextView.setText("Date: " + transaction.getDate());
            typeTextView.setText("Type: " + transaction.getType());
            amountTextview.setText("Amount: " + transaction.getAmount());
            balanceTextView.setText("Balance: " + transaction.getBalance());
        }
    }
}






