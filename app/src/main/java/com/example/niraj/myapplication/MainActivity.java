package com.example.niraj.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private String names[] = {
            "HTML",
            "CSS",
            "Java Script",
            "Wordpress",
            "pranav",
            "chandan"
    };



    private Integer imageid[] = new Integer[]{
            //R.drawable.image02,
            R.drawable.img1,
            R.drawable.img1,
            R.drawable.img1,
            R.drawable.img1,
            R.drawable.img5,
        //    R.drawable.img3,
          //  R.drawable.img4,
            R.drawable.img5,
         //   R.drawable.img6,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGridAdapter customGrid = new CustomGridAdapter( this,names , imageid);

        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(customGrid);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"You Clicked "+names[i], Toast.LENGTH_SHORT).show();
            }
        });

    }



}
