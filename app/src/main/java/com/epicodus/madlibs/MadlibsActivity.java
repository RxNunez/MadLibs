package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MadlibsActivity extends AppCompatActivity {

    private TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlibs);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String verb = intent.getStringExtra("verb");
        String adjective = intent.getStringExtra("adjective");
        String adverb = intent.getStringExtra("adverb");

        mStoryTextView.setText("dasdasdasd" + noun + "asdasdasdsa" + adjective + "asdasdas" + verb + "asdasda" + adverb + "loremsadhasd");

    }
}
