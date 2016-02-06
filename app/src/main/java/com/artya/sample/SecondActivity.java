package com.artya.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by artya on 05.02.16.
 */
public class SecondActivity extends AppCompatActivity {

    private EditText sendText2;
    private TextView txtFromFirst;

    //bidlocoding starts here :D
    String str = "Message from second activity is: ";
    //finish here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sendText2 = (EditText) findViewById(R.id.send_text_2);
        txtFromFirst = (TextView) findViewById(R.id.txtFromFirst);

        txtFromFirst.setText(getIntent().getStringExtra("sendText1"));
    }
    public void toPreviousActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("sendText2",str + sendText2.getText().toString());
        startActivity(intent);

        //Toast
        Toast.makeText(SecondActivity.this, "To previous", Toast.LENGTH_SHORT).show();
    }
}
