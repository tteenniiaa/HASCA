package h.tenia.humansmokingcapacity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

class myDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "hasca.db";
    private static final int SCHEMA_VERSION = 1;

    public myDatabase(Context context) {
        super(context, "hasca.db", (SQLiteDatabase.CursorFactory)null, 1);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE gejala (_id INTEGER PRIMARY KEY AUTOINCREMENT, sakit1 TEXT, sakit2 TEXT, sakit3 TEXT, sakit4 TEXT, sakit5 TEXT, sakit6 TEXT, sakit7 TEXT, sakit8 TEXT, sakit9 TEXT, sakit10 TEXT, sakit11 TEXT);");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public Cursor getAll() {
        return this.getReadableDatabase().rawQuery("SELECT _id, sakit1, sakit2, sakit3, sakit4, sakit5, sakit6, sakit7, sakit8, sakit9, sakit10, sakit11, sakit12 FROM gejala ORDER BY id asc", (String[])null);
    }

    public void insert(String sakit1, String sakit2, String sakit3, String sakit4, String sakit5, String sakit6, String sakit7, String sakit8, String sakit9, String sakit10, String sakit11, String sakit12) {
        ContentValues cv = new ContentValues();
        cv.put("sakit1", sakit1);
        cv.put("sakit2", sakit2);
        cv.put("sakit3", sakit3);
        cv.put("sakit4", sakit4);
        cv.put("sakit5", sakit5);
        cv.put("sakit6", sakit6);
        cv.put("sakit7", sakit7);
        cv.put("sakit8", sakit8);
        cv.put("sakit9", sakit9);
        cv.put("sakit10", sakit10);
        cv.put("sakit11", sakit11);
        cv.put("sakit12", sakit12);
        this.getWritableDatabase().insert("gejala", "name", cv);
    }

    public String getSakit1(Cursor c) {
        return c.getString(1);
    }

    public String getSakit2(Cursor c) {
        return c.getString(2);
    }

    public String getSakit3(Cursor c) {
        return c.getString(3);
    }

    public String getSakit4(Cursor c) {
        return c.getString(4);
    }

    public String getSakit5(Cursor c) {
        return c.getString(5);
    }

    public String getSakit6(Cursor c) {
        return c.getString(6);
    }

    public String getSakit7(Cursor c) {
        return c.getString(7);
    }

    public String getSakit8(Cursor c) {
        return c.getString(8);
    }

    public String getSakit9(Cursor c) {
        return c.getString(9);
    }

    public String getSakit10(Cursor c) {
        return c.getString(10);
    }

    public String getSakit11(Cursor c) {
        return c.getString(11);
    }

    public String getSakit12(Cursor c) {
        return c.getString(12);
    }
}
