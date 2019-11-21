package com.leonard.app57;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText edtName, edtEmail, edtUserName, edtPassword;
    private Button btnDone;

    public static final String NAME_REQUEST_CODE = "REQUEST_NAME";
    public static final String EMAIL_REQUEST_CODE = "REQUEST_EMAIL";
    public static final String USER_NAME_REQUEST_CODE = "REQUEST_USER_NAME";
    public static final String PASSWORD_REQUEST_CODE = "REQUEST_PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edtName = (EditText) findViewById(R.id.edtName);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtUserName = (EditText) findViewById(R.id.edtUserName);
        edtPassword = (EditText) findViewById(R.id.edtPassword);

        btnDone = (Button) findViewById(R.id.btnDone);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent data = new Intent();
                data.putExtra(NAME_REQUEST_CODE, edtName.getText().toString());
                data.putExtra(EMAIL_REQUEST_CODE, edtEmail.getText().toString());
                data.putExtra(USER_NAME_REQUEST_CODE, edtUserName.getText().toString());
                data.putExtra(PASSWORD_REQUEST_CODE, edtPassword.getText().toString());
                setResult(RESULT_OK, data);
                finish();
            }
        });




    }
}
