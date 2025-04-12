/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.SQLException
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteOpenHelper
 */
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/*
 * Renamed from nb3
 */
public final class nb3_2
extends SQLiteOpenHelper
implements Ai0 {
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
        Throwable throwable2;
        Cursor cursor;
        block7: {
            String string2 = "name";
            Object object = new String[]{"type", string2};
            CharSequence charSequence = "sqlite_master";
            Object object2 = sQLiteDatabase;
            cursor = sQLiteDatabase.query((String)charSequence, object, null, null, null, null, null);
            try {
                while ((n4 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) {
                    n4 = 0;
                    string2 = null;
                    string2 = cursor.getString(0);
                    charSequence = "sqlite_sequence";
                    int n7 = 1;
                    object2 = cursor.getString(n7);
                    boolean bl2 = ((String)charSequence).equals(object2);
                    if (bl2) continue;
                    charSequence = new StringBuilder();
                    object = "DROP ";
                    ((StringBuilder)charSequence).append((String)object);
                    ((StringBuilder)charSequence).append(string2);
                    string2 = " IF EXISTS ";
                    ((StringBuilder)charSequence).append(string2);
                    ((StringBuilder)charSequence).append((String)object2);
                    string2 = ((StringBuilder)charSequence).toString();
                    try {
                        sQLiteDatabase.execSQL(string2);
                    }
                    catch (SQLException sQLException) {
                        charSequence = new StringBuilder();
                        object = "Error executing ";
                        ((StringBuilder)charSequence).append((String)object);
                        ((StringBuilder)charSequence).append(string2);
                        string2 = ((StringBuilder)charSequence).toString();
                        Cx.d(string2, sQLException);
                    }
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            cursor.close();
            return;
        }
        if (cursor == null) throw throwable2;
        try {
            cursor.close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
    }
}

