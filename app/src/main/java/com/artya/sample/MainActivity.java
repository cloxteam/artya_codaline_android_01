package com.artya.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText sendText1;
    private TextView txtFromSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendText1 = (EditText) findViewById(R.id.send_text_1);
        txtFromSecond = (TextView) findViewById(R.id.txtFromSecond);

        txtFromSecond.setText(getIntent().getStringExtra("sendText2"));
    }

    public void toSecondActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("sendText1", sendText1.getText().toString());
        startActivity(intent);

        //Toast
        Toast.makeText(MainActivity.this, "To next!", Toast.LENGTH_SHORT).show();
    }


}
