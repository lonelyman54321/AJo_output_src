/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 */
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.clevertap.android.sdk.b;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ax3
 */
public final class ax3_0 {
    public final zi0_1 a;
    public final b b;
    public final ci3_1 c;

    public ax3_0(zi0_1 zi0_12, b b2, ci3_1 ci3_12) {
        Intrinsics.checkNotNullParameter((Object)zi0_12, "db");
        Intrinsics.checkNotNullParameter(b2, "logger");
        Intrinsics.checkNotNullParameter((Object)ci3_12, "table");
        this.a = zi0_12;
        this.b = b2;
        this.c = ci3_12;
    }

    public final boolean a() {
        int n3 = 1;
        String string2 = "\n            DELETE FROM ";
        b b2 = this.b;
        Object object = this.c.getTableName();
        Comparable<StringBuilder> comparable = new StringBuilder(string2);
        comparable.append((String)object);
        string2 = "\n            WHERE (normalizedEventName, deviceID) IN (\n                SELECT normalizedEventName, deviceID\n                FROM ";
        comparable.append(string2);
        comparable.append((String)object);
        string2 = "\n                ORDER BY lastTs ASC \n                LIMIT (\n                SELECT CASE \n                    WHEN COUNT(*) > ? THEN COUNT(*) - ?\n                    ELSE 0\n                END \n                FROM ";
        comparable.append(string2);
        comparable.append((String)object);
        string2 = "\n                )\n            );\n        ";
        comparable.append(string2);
        string2 = comparable.toString();
        string2 = ee3_2.b(string2);
        object = this.a;
        object = object.getWritableDatabase();
        int n4 = 11520;
        comparable = n4;
        int n7 = 9216;
        Integer n8 = n7;
        int n10 = 2;
        Object[] objectArray = new Integer[n10];
        objectArray[0] = comparable;
        objectArray[n3] = n8;
        try {
            object.execSQL(string2, objectArray);
            b2.a();
        }
        catch (Exception exception) {
            b2.getClass();
            com.clevertap.android.sdk.b.n();
            n3 = 0;
        }
        return n3 != 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(String object, String string2) {
        int n3;
        block9: {
            Intrinsics.checkNotNullParameter(object, "deviceID");
            Intrinsics.checkNotNullParameter(string2, "normalizedEventName");
            String string3 = this.c.getTableName();
            object = new String[]{object, string2};
            string2 = "eventExists";
            String string4 = "\n            SELECT EXISTS(\n                SELECT 1 \n                FROM ";
            StringBuilder stringBuilder = new StringBuilder(string4);
            stringBuilder.append(string3);
            stringBuilder.append(" \n                WHERE deviceID = ? AND normalizedEventName = ?\n            ) AS eventExists;\n        ");
            string3 = ee3_2.b(stringBuilder.toString());
            n3 = 0;
            stringBuilder = null;
            zi0_1 zi0_12 = this.a;
            SQLiteDatabase sQLiteDatabase = zi0_12.getReadableDatabase();
            object = sQLiteDatabase.rawQuery(string3, (String[])object);
            if (object == null) return n3 != 0;
            {
                Throwable throwable2222222;
                block11: {
                    int n4;
                    int n7;
                    block10: {
                        catch (Exception exception) {
                            break block9;
                        }
                        try {
                            n7 = object.moveToFirst();
                            if (n7 != 0) {
                                n4 = object.getColumnIndexOrThrow(string2);
                                if ((n4 = object.getInt(n4)) == (n7 = 1)) break block10;
                            }
                            n7 = 0;
                            string3 = null;
                        }
                        catch (Throwable throwable2222222) {
                            break block11;
                        }
                    }
                    n4 = 0;
                    string2 = null;
                    {
                        xj3_1.b((Closeable)object, null);
                        return n7 != 0;
                    }
                }
                try {
                    throw throwable2222222;
                }
                catch (Throwable throwable3) {}
                {
                    xj3_1.b((Closeable)object, throwable2222222);
                    throw throwable3;
                }
            }
        }
        object = this.b;
        object.getClass();
        com.clevertap.android.sdk.b.n();
        return n3 != 0;
    }

    public final long c(String object, String object2, String string2) {
        long l2;
        String string3 = "deviceID";
        Intrinsics.checkNotNullParameter(object, string3);
        String string4 = "eventName";
        Intrinsics.checkNotNullParameter(object2, string4);
        String string5 = "normalizedEventName";
        Intrinsics.checkNotNullParameter(string2, string5);
        zi0_1 zi0_12 = this.a;
        boolean bl2 = zi0_12.a();
        b b2 = this.b;
        if (!bl2) {
            b2.a();
            return -2;
        }
        String string6 = this.c.getTableName();
        b2.a();
        long l3 = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put(string4, (String)object2);
        contentValues.put(string5, string2);
        object2 = l3;
        contentValues.put("firstTs", (Long)object2);
        object2 = l3;
        contentValues.put("lastTs", (Long)object2);
        int n3 = 1;
        object2 = n3;
        string2 = "count";
        contentValues.put(string2, (Integer)object2);
        contentValues.put(string3, (String)object);
        object = zi0_12.getWritableDatabase();
        n3 = 0;
        object2 = null;
        int n4 = 5;
        try {
            l2 = object.insertWithOnConflict(string6, null, contentValues, n4);
        }
        catch (Exception exception) {
            ((Object)exception).toString();
            b2.a();
            zi0_12.close();
            object = zi0_12.d;
            boolean bl3 = ((File)object).delete();
            if (!bl3) {
                object = zi0_12.c;
                object.getClass();
                com.clevertap.android.sdk.b.e();
            }
            l2 = -1;
        }
        return l2;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zx3 d(String object, String object2) {
        Throwable throwable222222;
        void var1_4;
        Object object3;
        block10: {
            void var5_13;
            block9: {
                boolean bl2;
                block8: {
                    String string2 = "deviceID";
                    Intrinsics.checkNotNullParameter(object, string2);
                    String string3 = "normalizedEventName";
                    Intrinsics.checkNotNullParameter(object3, string3);
                    ci3_1 ci3_12 = this.c;
                    String string4 = ci3_12.getTableName();
                    String string5 = "deviceID = ? AND normalizedEventName = ?";
                    String[] stringArray = new String[]{object, object3};
                    Object var1_2 = null;
                    object3 = this.a;
                    SQLiteDatabase sQLiteDatabase = object3.getReadableDatabase();
                    int n3 = 0;
                    String string6 = null;
                    String string7 = null;
                    object3 = sQLiteDatabase.query(string4, null, string5, stringArray, null, null, null, null);
                    if (object3 == null) return var1_4;
                    {
                        catch (Exception exception) {}
                    }
                    try {
                        zx3 zx32;
                        bl2 = object3.moveToFirst();
                        if (!bl2) break block8;
                        String string8 = "eventName";
                        int n4 = object3.getColumnIndexOrThrow(string8);
                        string4 = object3.getString(n4);
                        String string9 = "cursor.getString(cursor.\u2026Throw(Column.EVENT_NAME))";
                        Intrinsics.checkNotNullExpressionValue(string4, string9);
                        int n7 = object3.getColumnIndexOrThrow(string3);
                        string7 = object3.getString(n7);
                        string3 = "cursor.getString(cursor.\u2026n.NORMALIZED_EVENT_NAME))";
                        Intrinsics.checkNotNullExpressionValue(string7, string3);
                        string3 = "firstTs";
                        n7 = object3.getColumnIndexOrThrow(string3);
                        long l2 = object3.getLong(n7);
                        string3 = "lastTs";
                        n7 = object3.getColumnIndexOrThrow(string3);
                        long l3 = object3.getLong(n7);
                        string3 = "count";
                        n7 = object3.getColumnIndexOrThrow(string3);
                        n3 = object3.getInt(n7);
                        int n8 = object3.getColumnIndexOrThrow(string2);
                        string6 = object3.getString(n8);
                        string2 = "cursor.getString(cursor.\u2026rThrow(Column.DEVICE_ID))";
                        Intrinsics.checkNotNullExpressionValue(string6, string2);
                        zx3 zx33 = zx32;
                        zx32 = new zx3(string4, string7, l2, l3, n3, string6);
                        break block9;
                    }
                    catch (Throwable throwable222222) {
                        break block10;
                    }
                }
                bl2 = false;
                Object var5_12 = null;
            }
            xj3_1.b((Closeable)object3, null);
            void var1_3 = var5_13;
            return var1_4;
        }
        try {
            throw throwable222222;
        }
        catch (Throwable throwable3) {
            xj3_1.b((Closeable)object3, throwable222222);
            throw throwable3;
        }
        object3 = this.b;
        object3.getClass();
        com.clevertap.android.sdk.b.n();
        return var1_4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int e(String object, String string2) {
        int n3;
        block8: {
            Intrinsics.checkNotNullParameter(object, "deviceID");
            Intrinsics.checkNotNullParameter(string2, "normalizedEventName");
            ci3_1 ci3_12 = this.c;
            String string3 = ci3_12.getTableName();
            String string4 = "deviceID = ? AND normalizedEventName = ?";
            String[] stringArray = new String[]{object, string2};
            object = "count";
            String[] stringArray2 = new String[]{object};
            n3 = -1;
            zi0_1 zi0_12 = this.a;
            SQLiteDatabase sQLiteDatabase = zi0_12.getReadableDatabase();
            Cursor cursor = sQLiteDatabase.query(string3, stringArray2, string4, stringArray, null, null, null, null);
            if (cursor == null) return n3;
            {
                Throwable throwable2222222;
                block11: {
                    int n4;
                    boolean bl2;
                    block10: {
                        block9: {
                            catch (Exception exception) {
                                break block8;
                            }
                            try {
                                bl2 = cursor.moveToFirst();
                                if (!bl2) break block9;
                                n4 = cursor.getColumnIndexOrThrow((String)object);
                                n4 = cursor.getInt(n4);
                                break block10;
                            }
                            catch (Throwable throwable2222222) {
                                break block11;
                            }
                        }
                        n4 = 0;
                        object = null;
                    }
                    bl2 = false;
                    sQLiteDatabase = null;
                    {
                        xj3_1.b((Closeable)cursor, null);
                        return n4;
                    }
                }
                try {
                    throw throwable2222222;
                }
                catch (Throwable throwable3) {}
                {
                    xj3_1.b((Closeable)cursor, throwable2222222);
                    throw throwable3;
                }
            }
        }
        object = this.b;
        object.getClass();
        com.clevertap.android.sdk.b.n();
        return n3;
    }

    public final boolean f(String string2, String string3) {
        int n3 = 1;
        b b2 = this.b;
        String string4 = "\n            UPDATE ";
        Intrinsics.checkNotNullParameter(string2, "deviceID");
        Intrinsics.checkNotNullParameter(string3, "normalizedEventName");
        Object object = this.c.getTableName();
        Serializable serializable = yz3_0.a;
        long l2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(string4);
        stringBuilder.append((String)object);
        string4 = " \n            SET \n                count = count + 1,\n                lastTs = ?\n            WHERE deviceID = ? \n            AND normalizedEventName = ?;\n        ";
        stringBuilder.append(string4);
        string4 = stringBuilder.toString();
        string4 = ee3_2.b(string4);
        b2.a();
        object = this.a;
        object = object.getWritableDatabase();
        serializable = Long.valueOf(l2);
        int n4 = 3;
        Object[] objectArray = new Object[n4];
        objectArray[0] = serializable;
        objectArray[n3] = string2;
        int n7 = 2;
        objectArray[n7] = string3;
        try {
            object.execSQL(string4, objectArray);
        }
        catch (Exception exception) {
            b2.getClass();
            com.clevertap.android.sdk.b.n();
            n3 = 0;
        }
        return n3 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean g(String string2, HashSet iterator) {
        zi0_1 zi0_12 = this.a;
        Intrinsics.checkNotNullParameter(string2, "deviceID");
        Intrinsics.checkNotNullParameter(iterator, "setOfActualAndNormalizedEventNamePair");
        this.c.getTableName();
        b b2 = this.b;
        b2.a();
        try {
            boolean bl2;
            Object object = zi0_12.getWritableDatabase();
            object.beginTransaction();
            iterator = iterator.iterator();
            while (bl2 = iterator.hasNext()) {
                object = iterator.next();
                object = (Pair)object;
                Object object2 = ((Pair)object).b;
                object2 = (String)object2;
                boolean bl3 = this.b(string2, (String)object2);
                Object object3 = ((Pair)object).b;
                if (bl3) {
                    ((Pair)object).toString();
                    b2.a();
                    object3 = (String)object3;
                    this.f(string2, (String)object3);
                    continue;
                }
                ((Pair)object).toString();
                b2.a();
                object = ((Pair)object).a;
                object = (String)object;
                object3 = (String)object3;
                this.c(string2, (String)object, (String)object3);
            }
            string2 = zi0_12.getWritableDatabase();
            string2.setTransactionSuccessful();
            string2 = zi0_12.getWritableDatabase();
            string2.endTransaction();
            return true;
        }
        catch (Exception exception) {
            com.clevertap.android.sdk.b.n();
            try {
                string2 = zi0_12.getWritableDatabase();
                string2.endTransaction();
                return false;
            }
            catch (Exception exception2) {
                com.clevertap.android.sdk.b.n();
            }
            return false;
        }
    }
}

