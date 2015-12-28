package br.com.aluras.algum.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.com.aluras.algum.data.AlgumContract.ContaEntry;

/**
 * Created by Andre on 26/12/2015.
 */
public class AlgumDbHelper extends SQLiteOpenHelper {

    // If you change the database schema, you must increment the database version.
    private static final int DATABASE_VERSION = 1;

    static final String DATABASE_NAME = "algum.db";

    public AlgumDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_CONTAS_TABLE = "CREATE TABLE " + ContaEntry.TABLE_NAME + " (" +
                ContaEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ContaEntry.COLUMN_NOME + " TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_CONTAS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ContaEntry.TABLE_NAME);
        onCreate(db);

    }
}
