/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzcd;
import com.google.android.gms.internal.gtm.zzen;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfp;
import com.google.android.gms.internal.gtm.zzfr;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

final class zzcc
extends zzfp {
    final /* synthetic */ zzcd zza;

    public zzcc(zzcd zzcd2, Context context, String string2) {
        this.zza = zzcd2;
        super(context, "google_analytics_v4.db", null, 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zza(SQLiteDatabase sQLiteDatabase, String string2) {
        Throwable throwable2;
        Cursor cursor;
        block6: {
            boolean bl2;
            cursor = null;
            String string3 = "SQLITE_MASTER";
            Object object = "name";
            try {
                try {
                    String[] stringArray = new String[]{object};
                    String string4 = "name=?";
                    String[] stringArray2 = new String[]{string2};
                    object = sQLiteDatabase;
                    cursor = sQLiteDatabase.query(string3, stringArray, string4, stringArray2, null, null, null);
                    bl2 = cursor.moveToFirst();
                }
                catch (SQLiteException sQLiteException) {
                    object = this.zza;
                    string3 = "Error querying for table";
                    ((zzbq)object).zzS(string3, string2, (Object)sQLiteException);
                    bl2 = false;
                    Object var1_4 = null;
                }
            }
            catch (Throwable throwable2) {
                break block6;
            }
            if (cursor != null) {
                cursor.close();
            }
            return bl2;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    private static final Set zzb(SQLiteDatabase sQLiteDatabase, String stringArray) {
        Throwable throwable2;
        block7: {
            HashSet<String> hashSet;
            block6: {
                hashSet = new HashSet<String>();
                String string2 = "SELECT * FROM ";
                StringBuilder stringBuilder = new StringBuilder(string2);
                stringBuilder.append((String)stringArray);
                stringBuilder.append(" LIMIT 0");
                stringArray = stringBuilder.toString();
                int n3 = 0;
                stringBuilder = null;
                sQLiteDatabase = sQLiteDatabase.rawQuery((String)stringArray, null);
                try {
                    stringArray = sQLiteDatabase.getColumnNames();
                    n3 = 0;
                    stringBuilder = null;
                }
                catch (Throwable throwable2) {}
                while (true) {
                    int n4 = stringArray.length;
                    if (n3 >= n4) break block6;
                    break;
                }
                {
                    string2 = stringArray[n3];
                    hashSet.add(string2);
                    ++n3;
                    continue;
                }
                break block7;
            }
            sQLiteDatabase.close();
            return hashSet;
        }
        sQLiteDatabase.close();
        throw throwable2;
    }

    public final SQLiteDatabase getWritableDatabase() {
        long l2;
        Object object = zzcd.zzg(this.zza);
        boolean bl2 = ((zzfb)object).zzc(l2 = 3600000L);
        if (bl2) {
            try {
                return super.getWritableDatabase();
            }
            catch (SQLiteException sQLiteException) {
                zzcd.zzg(this.zza).zzb();
                this.zza.zzI("Opening the database failed, dropping the table and recreating it");
                object = this.zza;
                Object object2 = zzcd.zzh((zzcd)object);
                object = ((zzbq)object).zzo().getDatabasePath((String)object2);
                ((File)object).delete();
                try {
                    object = super.getWritableDatabase();
                }
                catch (SQLiteException sQLiteException2) {
                    this.zza.zzJ("Failed to open freshly created database", (Object)sQLiteException2);
                    throw sQLiteException2;
                }
                object2 = this.zza;
                object2 = zzcd.zzg((zzcd)object2);
                ((zzfb)object2).zza();
                return object;
            }
        }
        object = new SQLiteException("Database open failed");
        throw object;
    }

    public final void onCreate(SQLiteDatabase object) {
        int n3;
        Object object2;
        block3: {
            object = object.getPath();
            try {
                object2 = Build.VERSION.SDK;
            }
            catch (NumberFormatException numberFormatException) {
                object2 = Build.VERSION.SDK;
                zzen.zzb("Invalid version number", object2);
                return;
            }
            int n4 = Integer.parseInt((String)object2);
            n3 = 9;
            if (n4 >= n3) break block3;
            return;
        }
        zzfm.zza();
        n3 = zzfr.zza;
        object2 = new File((String)object);
        ((File)object2).setReadable(false, false);
        ((File)object2).setWritable(false, false);
        boolean bl2 = true;
        ((File)object2).setReadable(bl2, bl2);
        ((File)object2).setWritable(bl2, bl2);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
    }

    public final void onOpen(SQLiteDatabase object) {
        block12: {
            int n3;
            String string2;
            Object object2;
            String string3;
            String string4;
            int n4;
            int n7;
            Object object3;
            block11: {
                int n8;
                block10: {
                    object3 = "hits2";
                    n7 = this.zza((SQLiteDatabase)object, (String)object3);
                    n4 = 0;
                    if (n7 != 0) break block10;
                    object3 = zzcd.zzi();
                    object.execSQL((String)object3);
                    break block11;
                }
                object3 = zzcc.zzb(object, (String)object3);
                string4 = "hit_id";
                string3 = "hit_string";
                object2 = new String[]{string4, string3, "hit_time", "hit_url"};
                string2 = null;
                for (n3 = 0; n3 < (n8 = 4); ++n3) {
                    string4 = object2[n3];
                    boolean bl2 = object3.remove(string4);
                    if (bl2) {
                        continue;
                    }
                    object = String.valueOf(string4);
                    object = "Database hits2 is missing required column: ".concat((String)object);
                    object3 = new SQLiteException((String)object);
                    throw object3;
                }
                object2 = "hit_app_id";
                n7 = object3.remove(object2) ^ 1;
                boolean bl3 = object3.isEmpty();
                if (!bl3) break block12;
                if (n7 != 0) {
                    object3 = "ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER";
                    object.execSQL((String)object3);
                }
            }
            object3 = "properties";
            n7 = this.zza((SQLiteDatabase)object, (String)object3);
            if (n7 != 0) {
                object = zzcc.zzb(object, (String)object3);
                String string5 = "adid";
                String string6 = "hits_count";
                string2 = "app_uid";
                string4 = "cid";
                string3 = "tid";
                String string7 = "params";
                object3 = new String[]{string2, string4, string3, string7, string5, string6};
                while (n4 < (n7 = 6)) {
                    object2 = object3[n4];
                    n3 = (int)(object.remove(object2) ? 1 : 0);
                    if (n3 != 0) {
                        ++n4;
                        continue;
                    }
                    object = String.valueOf(object2);
                    object = "Database properties is missing required column: ".concat((String)object);
                    object3 = new SQLiteException((String)object);
                    throw object3;
                }
                boolean bl4 = object.isEmpty();
                if (bl4) {
                    return;
                }
                object = new SQLiteException("Database properties table has extra columns");
                throw object;
            }
            object.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
        }
        object = new SQLiteException("Database hits2 has extra columns");
        throw object;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
    }
}

