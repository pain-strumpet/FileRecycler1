package com.soundspainful.filerecycler1;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.vuzix.hud.actionmenu.ActionMenuActivity;

import java.util.ArrayList;

public class MainActivity extends ActionMenuActivity {

    private RecyclerView recyclerView;
    private ArrayList<FileObject> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,  "onCreate");
        recyclerView = findViewById(R.id.recyclerview);
        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        data = new ArrayList<>();

        data.add(new FileObject("one", "this is onethis is onethis is onethis is onethis is onethis is onethis is onethis is onethis is onethis is onethis is onethis is onethis is onethis is onethis is one"));
        data.add(new FileObject("two", "this is two"));
        data.add(new FileObject("three", "this is three"));
        data.add(new FileObject("four", "this is four"));
        data.add(new FileObject("five", "this is five"));
        data.add(new FileObject("six", "this is six"));
        data.add(new FileObject("seven", "this is seven"));
        data.add(new FileObject("eight", "this is eight"));
        data.add(new FileObject("nine", "this is nine"));
        data.add(new FileObject("ten", "this is ten"));

        AdapterClass adapter = new AdapterClass(data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager (this, RecyclerView.HORIZONTAL, false));

    }


    @Override
    public boolean onTrackballEvent(MotionEvent event) {


        String msg = String.format("Trackball - %s", MotionEvent.actionToString(event.getAction()));
        String msgx = String.format(" X - %s", event.getX());
        Log.d(TAG + "_trackball",  msg + msgx);


        // Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

        int swipe = Math.round(event.getX());

        if (swipe < 0) {
            recyclerView.smoothScrollBy(-450,0);
        }
        else if (swipe > 0) {
            recyclerView.smoothScrollBy(450, 0);
        }


        return super.onTrackballEvent(event);
    }
    
}