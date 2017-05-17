package com.example.ir2.gridviewcustomadapter;

import android.widget.ImageView;

/**
 * Created by ir2 on 5/17/2017.
 */
public class Item {
    String head,end;
    int body;

    // Set head,body,end to Item
    Item(String head, int body,String end) {
        this.head = head;
        this.body = body;
        this.end = end;
    }
}
