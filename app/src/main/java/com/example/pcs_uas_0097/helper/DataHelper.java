package com.example.pcs_uas_0097.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.pcs_uas_0097.R;
import com.example.pcs_uas_0097.model.EventsItem;

import java.util.ArrayList;
import java.util.List;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "db_sport";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "table_match";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_DATE = "date";
    private static final String COLUMN_HOME = "home";
    private static final String COLUMN_SCOREHOME = "score_home";
    private static final String COLUMN_SCOREAWAY = "score_away";
    private static final String COLUMN_AWAY = "away";



    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql =
                "CREATE TABLE "+TABLE_NAME+" ( "+
                        COLUMN_ID + " INTEGER PRIMARY KEY , " +
                        COLUMN_DATE + " TEXT , "+
                        COLUMN_HOME + " TEXT , "+
                        COLUMN_SCOREHOME + " TEXT , "+
                        COLUMN_SCOREAWAY + " TEXT , "+
                        COLUMN_AWAY + " TEXT "+

                        ")";

        db.execSQL(sql);
    }

    public void addFavorite(EventsItem eventsItem){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUMN_ID,eventsItem.getIdEvent());
        values.put(COLUMN_DATE,eventsItem.getDateEvent());
        values.put(COLUMN_HOME,eventsItem.getStrHomeTeam());
        values.put(COLUMN_SCOREHOME,eventsItem.getIntHomeScore());
        values.put(COLUMN_SCOREAWAY,eventsItem.getIntAwayScore());
        values.put(COLUMN_AWAY,eventsItem.getStrAwayTeam());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public void deleteFavorite(EventsItem eventsItem){
        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(TABLE_NAME," id = "+eventsItem.getIdEvent().toString(), null);
        db.close();
    }

    public List<EventsItem> getAllFavorite(){
        List<EventsItem> arraySport = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.query(TABLE_NAME, new String[]{COLUMN_ID,COLUMN_DATE,COLUMN_HOME,COLUMN_SCOREHOME,COLUMN_SCOREAWAY,COLUMN_AWAY},null,null,null,null,null);

        if (c != null && c.moveToFirst()){
            do {
                EventsItem eventsItem = new EventsItem();

                eventsItem.setIdEvent(c.getString(0));
                eventsItem.setDateEvent(c.getString(1));
                eventsItem.setStrHomeTeam(c.getString(2));
                eventsItem.setIntHomeScore(c.getString(3));
                eventsItem.setIntAwayScore(c.getString(4));
                eventsItem.setStrAwayTeam(c.getString(5));

                arraySport.add(eventsItem);
            }
            while (c.moveToNext());
        }
        return arraySport;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        }
    }
}
