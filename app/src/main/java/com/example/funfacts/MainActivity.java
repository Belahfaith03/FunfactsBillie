package com.example.funfacts;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button button;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
    text=findViewById(R.id.text);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setFact();
                    }
                });
    }

    public void setFact() {
        String[] facts = {"I'm 16",
                "I'm 5'1",
                "humans are mammals",
                "the coronavirus is killing thousands of people",
                "Saving the turtles by using medal straws",
                "I'm bored",
                "Recycle art is hard",
                "I'm tired",
                "The heat makes strawberries hard to grow",
                "Airpods are over populated",
                "I don't know what else to say",


        };

        Random random= new Random();
        int randomnumber=random.nextInt(facts.length);
        text.setText(facts[randomnumber]);

    }
}
