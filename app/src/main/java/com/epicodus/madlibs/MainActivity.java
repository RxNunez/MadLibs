package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Button mGoButton;
    private EditText mNounEditText;
    private EditText mVerbEditText;
    private EditText mAdjectiveEditText;
    private EditText mAdverbEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNounEditText = (EditText) findViewById(R.id.nounEditText);
        mVerbEditText = (EditText) findViewById(R.id.verbEditText);
        mAdjectiveEditText = (EditText) findViewById(R.id.adjectiveEditText);
        mAdverbEditText = (EditText) findViewById(R.id.adverbEditText);

        mGoButton = (Button) findViewById(R.id.goButton);
        mGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noun = mNounEditText.getText().toString();
                String verb = mVerbEditText.getText().toString();
                String adjective = mAdjectiveEditText.getText().toString();
                String adverb = mAdverbEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, MadlibsActivity.class);
                intent.putExtra("noun", noun);
                intent.putExtra("verb", verb);
                intent.putExtra("adjective", adjective);
                intent.putExtra("adverb", adverb);
                startActivity(intent);
            }
        });
    }
}
