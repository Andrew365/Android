package com.awdevelopment.practice3;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

import java.util.Random;

public class Randomizer extends ActionBarActivity{
    final TextView content = (TextView) findViewById(R.id.number);
    Button clickMe = (Button) findViewById(R.id.clickMe);

public void setIt() {
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText mEdit = (EditText) findViewById(R.id.editText);
            final int val = Integer.parseInt(mEdit.getText().toString());
            Random generator = new Random();
            int num = generator.nextInt(val);
            String say = num + "";
            content.setText(say);
        }
    };
    clickMe.setOnClickListener(listener);
}



}