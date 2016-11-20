package com.acornhack.studybros.studybros;
/**
 * Created by jessjames on 20/11/2016.
 */

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class GameListActivity extends Activity {
    String[] subjectArray = {"Maths", "Physics", "Chemistry", "Biology"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_game_list, R.id.label, subjectArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }

}
