package com.example.a17045697.todolist;

import java.util.Calendar;

public class ToDoItem {

    private String itemName;
    private Calendar date;

    public ToDoItem(String itemName, Calendar date) {
        this.itemName = itemName;
        this.date = date;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString(){
        String str = date.get(Calendar.DAY_OF_MONTH)+ "/" + date.get(Calendar.MONTH)  + "/" + date.get(Calendar.YEAR);
        return str;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "itemName='" + itemName + '\'' +
                ", date=" + getDateString() +
                '}';
    }
}
