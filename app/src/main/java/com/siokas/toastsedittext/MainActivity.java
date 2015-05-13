package com.siokas.toastsedittext;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    // Declare the variables
    Button bt;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initiate the variables
        bt = (Button) findViewById(R.id.button1);
        et = (EditText) findViewById(R.id.editText1);

        // Set an OnClickListener on the button
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create variable to hold the users message that we will get it from the edittext
                String user = et.getText().toString();
                String message = "User said: " + user;

                //This is the toast message
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
