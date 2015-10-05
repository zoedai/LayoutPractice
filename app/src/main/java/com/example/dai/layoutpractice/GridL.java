package com.example.dai.layoutpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GridL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_l);

        Button bt = (Button) findViewById(R.id.btn_goback);
        bt.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      startActivity(new Intent(getApplicationContext(),
                                              ButtonClick.class));
                                  }
                              }
        );
    }
}
