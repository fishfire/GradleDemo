package com.hui.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R2.id.btn_item1)
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);


    }

    @OnClick({R2.id.btn_item1, R2.id.btn_item2})
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_item1) {
            Toast.makeText(this, "item2", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "iterm2", Toast.LENGTH_SHORT).show();
        }
    }
}
