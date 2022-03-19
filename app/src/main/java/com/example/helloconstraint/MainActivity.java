package com.example.helloconstraint;

import static com.example.helloconstraint.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button updatecolor;
    private Button updatecolors;
    private Button number;
    private Button zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        mShowCount = (TextView) findViewById(id.show_count);
        updatecolor = (Button) findViewById(id.button_zero);
        updatecolors=(Button) findViewById(id.button_zero);
        number=(Button) findViewById(id.button_count);
        zero=(Button) findViewById(id.button_count);
    }
    //Shows a Toast when the TOAST button is clicked.
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    //Increments the number in the TextView when the COUNT button is clicked and
    // change the color of COUNT button based on odd and even number
    //to change the color of zero button when count button is clicked
    public void countUp(View view) {

        mCount++;
        updatecolor.setBackgroundColor(getResources().getColor(R.color.purple_200));
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            if(mCount%2==0){
                number.setBackgroundColor(getResources().getColor(color.teal_200));
            }
          else{
                number.setBackgroundColor(getResources().getColor(color.teal_700));
            }

        }

    }
    //to reset the number in the TextView to zero and to change the color back to grey when Zero button is clicked
    //to change the Count button too primary when zero button is clicked
    public void reset(View view) {
        mCount=0;
        mShowCount.setText(Integer.toString(mCount));
        updatecolors.setBackgroundColor(getResources().getColor(R.color.grey));
        zero.setBackgroundColor(getResources().getColor(color.primary));

    }

}