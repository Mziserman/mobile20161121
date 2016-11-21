package com.example.martin.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.login_edittext)
    protected EditText loginEditText;

    @BindView(R.id.password_edittext)
    protected EditText passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.login_button)
    public void onLogin() {

        String login = loginEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (!login.isEmpty() && !password.isEmpty()) {
            showAlert(R.string.alert_login_title, R.string.alert_login_message);
        } else {
            showAlert(R.string.alert_login_empty_title, R.string.alert_login_empty_message);
        }

    }

    private void showAlert(int title, int message) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create();
        alertDialog.show();
    }

    @OnClick(R.id.signup_button)
    public void onSignup() {

    }
}
