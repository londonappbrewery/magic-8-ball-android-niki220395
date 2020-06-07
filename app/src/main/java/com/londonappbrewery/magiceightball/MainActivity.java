package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        final Button AskButton= findViewById(R.id.AskButton);
        final int[] BallsArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};
        AskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomnumbergenerator=new Random();
                int randomnumber=randomnumbergenerator.nextInt(5);
                ballDisplay.setImageResource(BallsArray[randomnumber]);
            }
        });
    }
}
