package fr.pootis.todoleast;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.MenuItemHoverListener;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class MainActivity extends AppCompatActivity {

    public static final String Tag = "TodoList";
    ListView mTaskList;
    Button mAddButton;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        menu.findItem(R.id.addButton).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.i(Tag, "addButton pressed !");

                // TODO: display windowAddTask

                return true;
            }
        });

        return true;

    }

    public boolean onOptionItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.addButton) {
            Log.e(Tag, "addButton pressed !");

            return true;
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTaskList = (ListView)findViewById(R.id.task_list);
        mAddButton = (Button)findViewById(R.id.addButton);

        ArrayList<TaskItem> list = new ArrayList<TaskItem>();

        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
        list.add(new TaskItem("pouet", "lol", "42"));
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
