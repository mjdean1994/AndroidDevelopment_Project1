package com.example.matt.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton mCategory1Button;
    private ImageButton mCategory2Button;
    private ImageButton mCategory3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCategory1Button = (ImageButton) findViewById(R.id.categoryButton1);
        mCategory2Button = (ImageButton) findViewById(R.id.categoryButton2);
        mCategory3Button = (ImageButton) findViewById(R.id.categoryButton3);

        mCategory1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //startActivity(new Intent());
            }
        });
    }
}
