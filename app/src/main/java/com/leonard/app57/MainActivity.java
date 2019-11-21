package com.leonard.app57;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtName, txtEmail, txtUserName, txtPassword;
    private Button btnSecond;
    private static final int REQUEST_CODE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (TextView) findViewById(R.id.txtName);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtUserName = (TextView) findViewById(R.id.txtUserName);
        txtPassword = (TextView) findViewById(R.id.txtPassword);

        btnSecond = (Button) findViewById(R.id.btnSecond);


        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {

            String name = data.getStringExtra(SecondActivity.NAME_REQUEST_CODE);
            String email = data.getStringExtra(SecondActivity.EMAIL_REQUEST_CODE);
            String userName = data.getStringExtra(SecondActivity.USER_NAME_REQUEST_CODE);
            String password = data.getStringExtra(SecondActivity.PASSWORD_REQUEST_CODE);

            txtName.setText(name);
            txtEmail.setText(email);
            txtUserName.setText(userName);
            txtPassword.setText(password);


        }
    }
}
