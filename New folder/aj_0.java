/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.SQLException
 *  android.database.sqlite.SQLiteDatabase
 */
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

/*
 * Renamed from aJ
 */
public final class aj_0 {
    public static final String[] c = new String[]{"name", "length", "last_touch_timestamp"};
    public Object a;
    public Object b;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public HashMap a() {
        SQLException sQLException2222222;
        Serializable serializable;
        block9: {
            Object object = this.b;
            object = (String)object;
            object.getClass();
            object = this.a;
            object = (Ai0)object;
            serializable = object.getReadableDatabase();
            Object object2 = object = this.b;
            object2 = (String)object;
            String[] stringArray = c;
            int n3 = 0;
            ZI zI = null;
            object = serializable.query((String)object2, stringArray, null, null, null, null, null);
            {
                Throwable throwable2222222;
                block10: {
                    catch (SQLException sQLException2222222) {
                        break block9;
                    }
                    try {
                        int n4 = object.getCount();
                        serializable = new HashMap(n4);
                        while ((n4 = (int)(object.moveToNext() ? 1 : 0)) != 0) {
                            n4 = 0;
                            object2 = null;
                            object2 = object.getString(0);
                            object2.getClass();
                            int n7 = 1;
                            long l2 = object.getLong(n7);
                            n3 = 2;
                            long l3 = object.getLong(n3);
                            zI = new ZI(l2, l3);
                            ((HashMap)serializable).put(object2, zI);
                        }
                    }
                    catch (Throwable throwable2222222) {
                        break block10;
                    }
                    {
                        object.close();
                        return serializable;
                    }
                }
                if (object == null) throw throwable2222222;
                try {
                    object.close();
                    throw throwable2222222;
                }
                catch (Throwable throwable3) {}
                {
                    throwable2222222.addSuppressed(throwable3);
                    throw throwable2222222;
                }
            }
        }
        serializable = new IOException(sQLException2222222);
        throw serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(long l2) {
        int n3;
        Object object;
        String string2;
        Object object2;
        Object object3 = (Ai0)this.a;
        String string3 = " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";
        String string4 = "CREATE TABLE ";
        try {
            object2 = Long.toHexString(l2);
            string2 = "ExoPlayerCacheFileMetadata";
            object = new StringBuilder(string2);
            ((StringBuilder)object).append((String)object2);
            this.b = object = ((StringBuilder)object).toString();
            object = object3.getReadableDatabase();
            n3 = 2;
            int n4 = ob3_0.a((SQLiteDatabase)object, (String)object2, n3);
            int n7 = 1;
            if (n4 == n7) return;
            object = object3.getWritableDatabase();
            object.beginTransactionNonExclusive();
        }
        catch (SQLException sQLException) {}
        try {
            ob3_0.b((SQLiteDatabase)object, (String)object2, n3);
            object2 = this.b;
            object2 = (String)object2;
            string2 = "DROP TABLE IF EXISTS ";
            object3 = new StringBuilder(string2);
            ((StringBuilder)object3).append((String)object2);
            object2 = ((StringBuilder)object3).toString();
            object.execSQL((String)object2);
            object2 = new StringBuilder(string4);
            object3 = this.b;
            object3 = (String)object3;
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(string3);
            object2 = ((StringBuilder)object2).toString();
            object.execSQL((String)object2);
            object.setTransactionSuccessful();
        }
        catch (Throwable throwable) {
            object.endTransaction();
            throw throwable;
        }
        object.endTransaction();
        return;
        object = new IOException(sQLException);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(Set object) {
        SQLException sQLException2;
        Object object2;
        block6: {
            Throwable throwable2;
            block7: {
                object2 = (String)this.b;
                object2.getClass();
                try {
                    object2 = this.a;
                    object2 = (Ai0)object2;
                    object2 = object2.getWritableDatabase();
                    object2.beginTransactionNonExclusive();
                }
                catch (SQLException sQLException2) {
                    break block6;
                }
                try {
                    boolean bl2;
                    object = object.iterator();
                    while (bl2 = object.hasNext()) {
                        Object object3 = object.next();
                        object3 = (String)object3;
                        Object object4 = this.b;
                        object4 = (String)object4;
                        String string2 = "name = ?";
                        object3 = new String[]{object3};
                        object2.delete((String)object4, string2, object3);
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                object2.setTransactionSuccessful();
                object2.endTransaction();
                return;
            }
            object2.endTransaction();
            throw throwable2;
        }
        object2 = new IOException(sQLException2);
        throw object2;
    }

    public void d(long l2, String string2, long l3) {
        Serializable serializable;
        Object object = (String)this.b;
        object.getClass();
        try {
            object = this.a;
        }
        catch (SQLException sQLException) {
            serializable = new IOException(sQLException);
            throw serializable;
        }
        object = (Ai0)object;
        object = object.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        String string3 = "name";
        contentValues.put(string3, string2);
        string2 = "length";
        Object object2 = l2;
        contentValues.put(string2, (Long)object2);
        object2 = "last_touch_timestamp";
        serializable = Long.valueOf(l3);
        contentValues.put((String)object2, (Long)serializable);
        object2 = this.b;
        object2 = (String)object2;
        serializable = null;
        object.replaceOrThrow((String)object2, null, contentValues);
    }
}

