package fr.pootis.todoleast;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class MainActivity extends AppCompatActivity {

    ListView mTaskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTaskList = (ListView)findViewById(R.id.task_list);

        ArrayList<TaskItem> list = new ArrayList<TaskItem>();

        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", Calendar.));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));

        TaskItemAdapter adapter = new TaskItemAdapter(
                MainActivity.this
                , list
        );

        mTaskList.setAdapter(adapter);

        }
}
