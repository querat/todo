package fr.pootis.todoleast;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by querat_g on 29/01/17.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    protected static final String _tableName = "todolist";
    protected static final String[] _columns = new String[] { "id", "title", "content", "date" };

    public DataBaseHelper(Context context) {
        super(context, "TodoListDataBase", null, 1);
    }

    public void onCreate(SQLiteDatabase database) {
        database.execSQL(
            "CREATE TABLE " + _tableName + " ("
            + "id INTEGER PRIMARY KEY AUTOINCREMENT"
            + ", title TEXT NOT NULL"
            + ", content TEXT NOT NULL"
            + ", date TEXT NOT NULL"
            + ");"
        );
    }

    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        database.execSQL("DROP TABLE IF EXISTS " + _tableName);
        onCreate(database);
    }

    public final String getTableName() { return _tableName; }
    public final String[] getColumnsStringArray() { return _columns; }

}
