package com.example.dai.layoutpractice;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FrameL extends AppCompatActivity implements View.OnClickListener {

    ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_l);
        img1 = (ImageView) findViewById(R.id.imageView);
        img2 = (ImageView) findViewById(R.id.imageView2);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img1.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//                menu.setHeaderTitle("menu");

                Toast.makeText(getApplicationContext(), "Hi", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "switch", Toast.LENGTH_SHORT).show();
        int id = v.getId();
        if (id == R.id.imageView) {
            img1.setVisibility(View.GONE);
            img2.setVisibility(View.VISIBLE);
        } else {
            img2.setVisibility(View.GONE);
            img1.setVisibility(View.VISIBLE);
        }
    }
}
