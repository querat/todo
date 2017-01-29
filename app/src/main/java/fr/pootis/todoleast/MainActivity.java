package fr.pootis.todoleast;

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    protected static final int DIALOG_ADD_TASK = 0xADD;

    ListView mTaskList;
    Button mAddButton;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.i(Tag, "addButton pressed !");

        // TODO: display windowAddTask
        addTaskDialog dialog = new addTaskDialog();
        dialog.show(getFragmentManager(), "addTaskDialog");

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
