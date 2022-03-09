package com.example.fooddeliveryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddeliveryapp.CourseAdapter;
import com.example.fooddeliveryapp.CourseModel;
import com.example.fooddeliveryapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView courseRV;

        private Button playbtn;




        

    // Arraylist for storing data
    private ArrayList<CourseModel> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView  (R.layout.activity_main);

        playbtn = (Button) findViewById(R.id.addbtn);
        courseRV = findViewById(R.id.idRVCourse);







        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("Biryani", 299, R.drawable.biryani));
        courseModelArrayList.add(new CourseModel("Burger", 159, R.drawable.burger_250p));
        courseModelArrayList.add(new CourseModel("Egg Rolls", 360, R.drawable.egg_roll_250p));
        courseModelArrayList.add(new CourseModel("Noodles", 440, R.drawable.noodles));
        courseModelArrayList.add(new CourseModel("Fired Chicken", 240, R.drawable.fried_chicken));
        courseModelArrayList.add(new CourseModel("Pancakes", 90 , R.drawable.pancakes_250p));
        courseModelArrayList.add(new CourseModel("Fish", 150, R.drawable.fish));
        courseModelArrayList.add(new CourseModel("salad", 150, R.drawable.noodles));
        courseModelArrayList.add(new CourseModel("Rosted Chicken", 150, R.drawable.rosted_chicken));




        // we are initializing our adapter class and passing our arraylist to it.
        CourseAdapter courseAdapter = new CourseAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
        

    }
}
