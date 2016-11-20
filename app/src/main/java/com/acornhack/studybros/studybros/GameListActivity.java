package com.acornhack.studybros.studybros;
/**
 * Created by jessjames on 20/11/2016.
 */

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class GameListActivity {
    String[] subjectArray = {"Maths", "Physics", "Chemistry", "Biology"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listView, subjectArray);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
