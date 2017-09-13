package com.abc.incrementalgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.abc.incrementalgame.R.styleable.View;

public class mainActivity extends AppCompatActivity {

    private TextView money_display;
    private int money = 0;
    private Button tap_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tap_button = (Button) findViewById(R.id.tap_button);
        tap_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                money++;
                money_display.setText(Integer.toString(money));
            }
        });
        money_display = (TextView) findViewById(R.id.money_view);
        money_display.setText(Integer.toString(money));
    }
}
