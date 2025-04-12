/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzay {
    private static Set zza(SQLiteDatabase sQLiteDatabase, String stringArray) {
        HashSet hashSet = new HashSet();
        String string2 = "SELECT * FROM ";
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append((String)stringArray);
        stringBuilder.append(" LIMIT 0");
        stringArray = stringBuilder.toString();
        stringBuilder = null;
        sQLiteDatabase = sQLiteDatabase.rawQuery((String)stringArray, null);
        try {
            stringArray = sQLiteDatabase.getColumnNames();
            Collections.addAll(hashSet, stringArray);
            return hashSet;
        }
        finally {
            sQLiteDatabase.close();
        }
    }

    public static void zza(zzgo object, SQLiteDatabase object2) {
        if (object != null) {
            String string2;
            Object object3 = zzcf.zza();
            object2 = object2.getPath();
            object2 = object3.zza((String)object2);
            File file = new File((String)object2);
            boolean bl2 = false;
            object2 = null;
            boolean bl3 = file.setReadable(false, false);
            if (!bl3) {
                object3 = ((zzgo)object).zzr();
                string2 = "Failed to turn off database read permission";
                ((zzgq)object3).zza(string2);
            }
            if (!(bl2 = file.setWritable(false, false))) {
                object2 = ((zzgo)object).zzr();
                object3 = "Failed to turn off database write permission";
                ((zzgq)object2).zza((String)object3);
            }
            if (!(bl3 = file.setReadable(bl2 = true, bl2))) {
                object3 = ((zzgo)object).zzr();
                string2 = "Failed to turn on database read permission for owner";
                ((zzgq)object3).zza(string2);
            }
            if (!(bl2 = file.setWritable(bl2, bl2))) {
                object = ((zzgo)object).zzr();
                object2 = "Failed to turn on database write permission for owner";
                ((zzgq)object).zza((String)object2);
            }
            return;
        }
        object = new IllegalArgumentException("Monitor must not be null");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zza(zzgo object, SQLiteDatabase object2, String string2, String object3, String object4, String[] object5) {
        SQLiteException sQLiteException2;
        block9: {
            boolean bl2;
            int n3;
            if (object == null) {
                object = new IllegalArgumentException("Monitor must not be null");
                throw object;
            }
            int n4 = zzay.zza((zzgo)object, (SQLiteDatabase)object2, string2);
            if (n4 == 0) {
                object2.execSQL((String)object3);
            }
            try {
                object3 = zzay.zza((SQLiteDatabase)object2, string2);
                String string3 = ",";
                object4 = object4.split(string3);
                n4 = ((String[])object4).length;
                n3 = 0;
                for (int i3 = 0; i3 < n4; ++i3) {
                    String string4 = object4[i3];
                    boolean bl3 = object3.remove(string4);
                    if (bl3) continue;
                    object4 = "Table ";
                    object3 = new StringBuilder((String)object4);
                    ((StringBuilder)object3).append(string2);
                    object4 = " is missing required column: ";
                    ((StringBuilder)object3).append((String)object4);
                    ((StringBuilder)object3).append(string4);
                    object3 = ((StringBuilder)object3).toString();
                    object2 = new SQLiteException((String)object3);
                    throw object2;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block9;
            }
            if (object5 != null) {
                int n7;
                while (n3 < (n7 = ((String[])object5).length)) {
                    object4 = object5[n3];
                    n7 = (int)(object3.remove(object4) ? 1 : 0);
                    if (n7 == 0) {
                        n7 = n3 + 1;
                        object4 = object5[n7];
                        object2.execSQL((String)object4);
                    }
                    n3 += 2;
                }
            }
            if (!(bl2 = object3.isEmpty())) {
                object2 = ((zzgo)object).zzr();
                object4 = "Table has extra columns. table, columns";
                object5 = ", ";
                object3 = TextUtils.join((CharSequence)object5, (Iterable)object3);
                ((zzgq)object2).zza((String)object4, string2, object3);
            }
            return;
        }
        ((zzgo)object).zzg().zza("Failed to verify columns on table that was just created", string2);
        throw sQLiteException2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean zza(zzgo object, SQLiteDatabase sQLiteDatabase, String string2) {
        Throwable throwable2222222;
        Cursor cursor;
        block6: {
            if (object == null) {
                object = new IllegalArgumentException("Monitor must not be null");
                throw object;
            }
            cursor = null;
            String string3 = "SQLITE_MASTER";
            String string4 = "name";
            String[] stringArray = new String[]{string4};
            String string5 = "name=?";
            String[] stringArray2 = new String[]{string2};
            string4 = sQLiteDatabase;
            cursor = sQLiteDatabase.query(string3, stringArray, string5, stringArray2, null, null, null);
            boolean bl2 = cursor.moveToFirst();
            {
                block7: {
                    catch (Throwable throwable2222222) {
                        break block6;
                    }
                    catch (SQLiteException sQLiteException) {}
                    {
                        object = ((zzgo)object).zzr();
                        string4 = "Error querying for table";
                        ((zzgq)object).zza(string4, string2, (Object)sQLiteException);
                        if (cursor == null) break block7;
                    }
                    cursor.close();
                }
                return false;
            }
            cursor.close();
            return bl2;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2222222;
    }
}

