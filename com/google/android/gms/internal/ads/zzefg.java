/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class zzefg {
    public static int zza(SQLiteDatabase sQLiteDatabase, int n3) {
        int n4 = 2;
        int n7 = 0;
        if (n3 == n4) {
            return 0;
        }
        if ((n3 = (sQLiteDatabase = zzefg.zzg(sQLiteDatabase, n3)).getCount()) > 0) {
            sQLiteDatabase.moveToNext();
            String string2 = "value";
            n3 = sQLiteDatabase.getColumnIndexOrThrow(string2);
            n7 = sQLiteDatabase.getInt(n3);
        }
        sQLiteDatabase.close();
        return n7;
    }

    public static long zzb(SQLiteDatabase sQLiteDatabase, int n3) {
        long l2;
        n3 = (sQLiteDatabase = zzefg.zzg(sQLiteDatabase, 2)).getCount();
        if (n3 > 0) {
            sQLiteDatabase.moveToNext();
            String string2 = "value";
            n3 = sQLiteDatabase.getColumnIndexOrThrow(string2);
            l2 = sQLiteDatabase.getLong(n3);
        } else {
            l2 = 0L;
        }
        sQLiteDatabase.close();
        return l2;
    }

    public static void zzc(SQLiteDatabase sQLiteDatabase, long l2, byte[] object) {
        ContentValues contentValues = new ContentValues();
        Object object2 = l2;
        String string2 = "timestamp";
        contentValues.put(string2, (Long)object2);
        object2 = "serialized_proto_data";
        contentValues.put((String)object2, object);
        String[] stringArray = String.valueOf(l2);
        stringArray = new String[]{stringArray};
        String string3 = "offline_signal_contents";
        object = "timestamp = ?";
        int n3 = sQLiteDatabase.update(string3, contentValues, (String)object, stringArray);
        if (n3 == 0) {
            n3 = 0;
            stringArray = null;
            sQLiteDatabase.insert(string3, null, contentValues);
        }
    }

    public static void zzd(SQLiteDatabase sQLiteDatabase) {
        zzefg.zzh(sQLiteDatabase, "failed_requests", 0);
        zzefg.zzh(sQLiteDatabase, "total_requests", 0);
        zzefg.zzh(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        Long l2 = 0L;
        contentValues.put("value", l2);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void zze(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        zzefg.zzi(sQLiteDatabase, "failed_requests", 0);
        zzefg.zzi(sQLiteDatabase, "total_requests", 0);
        zzefg.zzi(sQLiteDatabase, "completed_requests", 0);
    }

    public static void zzf(SQLiteDatabase sQLiteDatabase, boolean bl2, boolean bl3) {
        if (!bl3) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
            return;
        }
        String string2 = "UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'";
        sQLiteDatabase.execSQL(string2);
        if (!bl2) {
            String string3 = "UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'";
            sQLiteDatabase.execSQL(string3);
        }
    }

    private static Cursor zzg(SQLiteDatabase sQLiteDatabase, int n3) {
        String string2;
        String string3;
        String string4;
        String string5;
        String string6 = "value";
        String[] stringArray = new String[]{string6};
        int n4 = 1;
        String[] stringArray2 = new String[n4];
        stringArray2[0] = n3 != 0 ? (n3 != n4 ? (n3 != (n4 = 2) ? (string5 = "completed_requests") : (string4 = "last_successful_request_time")) : (string3 = "total_requests")) : (string2 = "failed_requests");
        return sQLiteDatabase.query("offline_signal_statistics", stringArray, "statistic_name = ?", stringArray2, null, null, null);
    }

    private static void zzh(SQLiteDatabase sQLiteDatabase, String object, int n3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", (String)object);
        object = 0;
        contentValues.put("value", (Integer)object);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    private static void zzi(SQLiteDatabase sQLiteDatabase, String stringArray, int n3) {
        ContentValues contentValues = new ContentValues();
        Integer n4 = 0;
        contentValues.put("value", n4);
        stringArray = new String[]{stringArray};
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", stringArray);
    }
}

