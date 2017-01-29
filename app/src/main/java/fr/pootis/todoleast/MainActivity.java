package fr.pootis.todoleast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String Tag = "TodoList";
    protected static final int DIALOG_ADD_TASK = 0xADD;


    ListView _TaskList;
    Button _AddButton;
    TaskItemDAO _databaseDAO;

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

        _TaskList = (ListView)findViewById(R.id.task_list);
        _AddButton = (Button)findViewById(R.id.addButton);
        _databaseDAO = new TaskItemDAO(getBaseContext());

        _databaseDAO.createTaskItem(new TaskItem(42, "pouet", "lol", "42"));
        _databaseDAO.createTaskItem(new TaskItem(42, "pouet", "lol", "42"));
        _databaseDAO.createTaskItem(new TaskItem(42, "pouet", "lol", "42"));
        _databaseDAO.createTaskItem(new TaskItem(42, "pouet", "lol", "42"));
        _databaseDAO.createTaskItem(new TaskItem(42, "pouet", "lol", "42"));
        _databaseDAO.createTaskItem(new TaskItem(42, "pouet", "lol", "42"));
        _databaseDAO.createTaskItem(new TaskItem(42, "pouet", "lol", "42"));
        _databaseDAO.createTaskItem(new TaskItem(42, "pouet", "lol", "42"));
        _databaseDAO.createTaskItem(new TaskItem(42, "pouet", "lol", "42"));
        _databaseDAO.createTaskItem(new TaskItem(42, "pouet", "lol", "42"));
        _databaseDAO.createTaskItem(new TaskItem(42, "pouet", "lol", "42"));

        ArrayList<TaskItem> list = _databaseDAO.getAllTaskItems();

        TaskItemAdapter adapter = new TaskItemAdapter(
                MainActivity.this
                , list
        );
        _TaskList.setAdapter(adapter);

        }
}
