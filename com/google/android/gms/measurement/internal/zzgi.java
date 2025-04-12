/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteException
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzcj;
import com.google.android.gms.measurement.internal.zzay;
import com.google.android.gms.measurement.internal.zzgj;
import com.google.android.gms.measurement.internal.zzgq;
import java.io.File;

final class zzgi
extends zzcj {
    private final /* synthetic */ zzgj zza;

    public zzgi(zzgj zzgj2, Context context, String string2) {
        this.zza = zzgj2;
        super(context, string2, null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        }
        catch (SQLiteException sQLiteException) {
            this.zza.zzj().zzg().zza("Opening the local database failed, dropping and recreating it");
            Object object = this.zza.zza();
            String string2 = "google_app_measurement_local.db";
            object = object.getDatabasePath(string2);
            boolean bl2 = ((File)object).delete();
            if (!bl2) {
                object = this.zza.zzj().zzg();
                String string3 = "Failed to delete corrupted local db file";
                ((zzgq)object).zza(string3, string2);
            }
            try {
                return super.getWritableDatabase();
            }
            catch (SQLiteException sQLiteException2) {
                this.zza.zzj().zzg().zza("Failed to open local database. Events will bypass local storage", (Object)sQLiteException2);
                return null;
            }
        }
        catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
            throw sQLiteDatabaseLockedException;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzay.zza(this.zza.zzj(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        zzay.zza(this.zza.zzj(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
    }
}

