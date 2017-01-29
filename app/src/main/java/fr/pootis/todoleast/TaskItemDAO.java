package fr.pootis.todoleast;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by querat_g on 29/01/17.
 */

public class TaskItemDAO {

    private SQLiteDatabase _database;
    private DataBaseHelper _dbHelper;

    public TaskItemDAO(Context context) {
        _dbHelper = new DataBaseHelper(context);
        _database = _dbHelper.getWritableDatabase();
    }

    public void close() {
        _database.close();
    }

    public long createTaskItem(TaskItem task) {
        ContentValues contentValues = new ContentValues();

        contentValues.put("title", task.getTitle());
        contentValues.put("content", task.getContent());
        contentValues.put("date", task.getDate());

        // Insert() returns the id of the last inserted element in the SQL Table
        return _database.insert(
            _dbHelper.getTableName()
            , null
            , contentValues
        );
    }

    public void deleteTaskItem(TaskItem task) {
        Long iNeedToDoThisSoICanUse = task.getId();
        _database.delete(_dbHelper.getTableName(), "id = " + iNeedToDoThisSoICanUse.toString(), null);
    }

    public ArrayList<TaskItem> getAllTaskItems() {

        ArrayList<TaskItem> itemsList = new ArrayList<TaskItem>();
        final String[] columns = _dbHelper.getColumnsStringArray();

        // Yay for the sea of null pointers
        Cursor cursor = _database.query(_dbHelper.getTableName(), null, null, null, null, null, null);
        cursor.moveToFirst();

        Log.e("e", "pootis pouet");

        while (!cursor.isAfterLast()) {

            Log.e("e",Long.toString(cursor.getLong(0)));

            TaskItem task = new TaskItem(
                    cursor.getLong(0)
                    , cursor.getString(1)
                    , cursor.getString(2)
                    , cursor.getString(3)
            );
            itemsList.add(task);
            cursor.moveToNext();
        }
        cursor.close();

        return itemsList;
    }


}
