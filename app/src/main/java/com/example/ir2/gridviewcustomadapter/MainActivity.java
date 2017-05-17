package com.example.ir2.gridviewcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Create ArrayList use Item Class
    ArrayList<Item> itemlist = new ArrayList<Item>();
    GridView gridView;
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.gridview);

        // Add items to ArrayList
        addItemToArray();
        // Add items to ArrayList use loop
        addItemToArrayByLoop();

        // Create new ItemAdapter for GridView
        // Item Class(3 parameters) -> 1.Context 2.GridLayout XML file(Resource) 3.ArrayList of items
        itemAdapter = new ItemAdapter(getApplicationContext(),R.layout.grid_layout,itemlist);
        // SetAdapter to GridView
        gridView.setAdapter(itemAdapter);

    }

    private void addItemToArray(){
        // Add items to ArrayList by Item class
        // 3 parameters 1.HEAD 2.body 3.end
        itemlist.add(new Item("HEAD 1",R.mipmap.ic_launcher,"END 1"));
        itemlist.add(new Item("HEAD 2",R.mipmap.ic_launcher,"END 2"));
        itemlist.add(new Item("HEAD 3",R.mipmap.ic_launcher,"END 3"));
        itemlist.add(new Item("HEAD 4",R.mipmap.ic_launcher,"END 4"));
        itemlist.add(new Item("HEAD 5",R.mipmap.ic_launcher,"END 5"));
        itemlist.add(new Item("HEAD 6",R.mipmap.ic_launcher,"END 6"));
        itemlist.add(new Item("HEAD 7",R.mipmap.ic_launcher,"END 7"));
        itemlist.add(new Item("HEAD 8",R.mipmap.ic_launcher,"END 8"));
        itemlist.add(new Item("HEAD 9",R.mipmap.ic_launcher,"END 9"));
        itemlist.add(new Item("HEAD 10",R.mipmap.ic_launcher,"END 10"));
        itemlist.add(new Item("HEAD 11",R.mipmap.ic_launcher,"END 11"));
        itemlist.add(new Item("HEAD 12",R.mipmap.ic_launcher,"END 12"));
        itemlist.add(new Item("HEAD 13",R.mipmap.ic_launcher,"END 13"));
        itemlist.add(new Item("HEAD 14",R.mipmap.ic_launcher,"END 14"));
        itemlist.add(new Item("HEAD 15",R.mipmap.ic_launcher,"END 15"));
        itemlist.add(new Item("HEAD 16",R.mipmap.ic_launcher,"END 16"));
        itemlist.add(new Item("HEAD 17",R.mipmap.ic_launcher,"END 17"));
        itemlist.add(new Item("HEAD 18",R.mipmap.ic_launcher,"END 18"));
        itemlist.add(new Item("HEAD 19",R.mipmap.ic_launcher,"END 19"));
        itemlist.add(new Item("HEAD 20",R.mipmap.ic_launcher,"END 20"));
        itemlist.add(new Item("HEAD 21",R.mipmap.ic_launcher,"END 21"));
        itemlist.add(new Item("HEAD 22",R.mipmap.ic_launcher,"END 22"));
        itemlist.add(new Item("HEAD 23",R.mipmap.ic_launcher,"END 23"));
        itemlist.add(new Item("HEAD 24",R.mipmap.ic_launcher,"END 24"));
    }



    private void addItemToArrayByLoop(){
        // Add 24 item to ArrayList use for Loop
        // Item Class(3 parameters) ->  1.HEAD 2.body 3.end
        for(int i=0;i<24;i++) {
            itemlist.add(new Item("HEAD : "+i, R.mipmap.ic_launcher, "END : "+i));
        }
    }
}
