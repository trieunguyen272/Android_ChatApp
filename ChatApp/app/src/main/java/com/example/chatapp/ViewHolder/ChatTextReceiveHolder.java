package com.example.chatapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ChatTextReceiveHolder extends RecyclerView.ViewHolder {

    Unbinder unbinder;
    @BindView(R.id.txt_time)
    public TextView txt_time;
    @BindView(R.id.txt_chat_message)
    public TextView txt_chat_message;
    public ChatTextReceiveHolder(@NonNull View itemView) {
        super(itemView);
        unbinder = ButterKnife.bind(this, itemView);
    }
}
