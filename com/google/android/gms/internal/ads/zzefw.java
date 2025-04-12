/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.internal.ads.zzefz;

public final class zzefw
implements Runnable {
    public final /* synthetic */ SQLiteDatabase zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzr zzc;

    public /* synthetic */ zzefw(SQLiteDatabase sQLiteDatabase, String string2, zzr zzr2) {
        this.zza = sQLiteDatabase;
        this.zzb = string2;
        this.zzc = zzr2;
    }

    public final void run() {
        SQLiteDatabase sQLiteDatabase = this.zza;
        String string2 = this.zzb;
        zzr zzr2 = this.zzc;
        zzefz.zzf(sQLiteDatabase, string2, zzr2);
    }
}

