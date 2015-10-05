package com.example.dai.layoutpractice;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonClick extends AppCompatActivity implements View.OnClickListener {

    Button[] buttons = new Button[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);


        for (int i = 0; i < buttons.length; i++) {
            String buttonID = "button"+i;
            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            buttons[i] = (Button) findViewById(resID);
        }




        buttons[1].setText("Grid View");
        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), GridL.class));
                Toast.makeText(ButtonClick.this, "Button 2 clicked", Toast.LENGTH_SHORT).show();

            }
        });

        buttons[2].setText("Frame View");
        buttons[2].setOnClickListener(this);


    }



    public void button0Click(View v) {
        Toast.makeText(ButtonClick.this, "Button1 clicked", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(), LinearL.class));
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(ButtonClick.this, "Button 3 clicked", Toast.LENGTH_LONG).show();
        startActivity(new Intent(getApplicationContext(), FrameL.class));
    }
}
