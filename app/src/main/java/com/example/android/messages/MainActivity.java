package com.example.android.messages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText phoneNum = findViewById(R.id.phoneNum);
        final EditText messageText = findViewById(R.id.messageText);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = phoneNum.getText().toString();
                String msg = messageText.getText().toString();

                SmsManager.getDefault().sendTextMessage(phone, null, msg, null, null);
            }
        });
    }
}
