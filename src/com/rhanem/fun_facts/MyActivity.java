package com.rhanem.fun_facts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity
{

    public static final String TAG = MyActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mcolorWheel = new ColorWheel();
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        /* Declare our View variables
         * and assign the views from the layout file
         */

        final TextView factLable = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        //for the setOnClickListener() we need the View OnClickListener

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Update the lable with our dynamic fact
                String fact = mFactBook.getFact();
                factLable.setText(fact);

                int color = mcolorWheel.getColor();
                relativeLayout.setBackgroundColor(color);

                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
        //Toast welcomeToast =Toast.makeText()
        Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();

        Log.d(TAG,"we re logging from onCreate() method!");
    }
}
