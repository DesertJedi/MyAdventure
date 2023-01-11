package org.makeitabetterplace.myadventure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "db.sqlite";
    public static final String FINDS_TABLE_NAME = "finds";
    public static final String FINDS_COLUMN_ID = "id";
    public static final String FINDS_COLUMN_DESCRIPTION = "description";
    public static final String FINDS_COLUMN_DETAILS = "details";
    public static final String FINDS_COLUMN_LONGLAT = "long_lat";
    public static final String FINDS_COLUMN_ALTITUDE = "altitude";
    private HashMap hp;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + FINDS_TABLE_NAME + " ("
                + FINDS_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + FINDS_COLUMN_DESCRIPTION + " TEXT, "
                + FINDS_COLUMN_DETAILS + " TEXT, "
                + FINDS_COLUMN_LONGLAT + " TEXT, "
                + FINDS_COLUMN_ALTITUDE + " INTEGER)";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + FINDS_TABLE_NAME);
        onCreate(db);
    }

    public void addFind(String find_description, String find_details, String find_longlat, String find_altitude) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(FINDS_COLUMN_DESCRIPTION, find_description);
        values.put(FINDS_COLUMN_DETAILS, find_details);
        values.put(FINDS_COLUMN_LONGLAT, find_longlat);
        values.put(FINDS_COLUMN_ALTITUDE, find_altitude);

        db.insert(FINDS_TABLE_NAME, null, values);

        db.close();
    }
}

