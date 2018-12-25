package com.example.fredward.androidbasicexintents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**Call when user presses button
     * call this function in activity_main.xml
     * Using onClick
     */
    public void searchInput (View view){
        //Use this func and call an intent to
        //notify that the action will be done
        //recall two params are needed for Intent
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        /**starts instance of the DisplayMessageActivity, now we need to create class*/
        startActivity(intent);
    }
}
