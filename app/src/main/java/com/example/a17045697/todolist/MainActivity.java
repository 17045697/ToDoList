package com.example.a17045697.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> alItemList;
    CustomAdapter caItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo);
        Calendar date1 = Calendar.getInstance();
        date1.set(2018,8,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2018,12,25);

        alItemList = new ArrayList<>();
        ToDoItem item1 = new ToDoItem("MSA",date1);
        ToDoItem item2 = new ToDoItem("Haircut",date2);

        alItemList.add(item1);
        alItemList.add(item2);

        caItem = new CustomAdapter(this,R.layout.item_list,alItemList);
        lvToDo.setAdapter(caItem);

    }
}
