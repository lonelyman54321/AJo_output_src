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
import com.google.android.gms.internal.ads.zzfkw;

public final class zzefu
implements zzfkw {
    public final /* synthetic */ zzefz zza;
    public final /* synthetic */ zzr zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzefu(zzefz zzefz2, zzr zzr2, String string2) {
        this.zza = zzefz2;
        this.zzb = zzr2;
        this.zzc = string2;
    }

    public final Object zza(Object object) {
        zzefz zzefz2 = this.zza;
        object = (SQLiteDatabase)object;
        zzr zzr2 = this.zzb;
        String string2 = this.zzc;
        zzefz2.zzg((SQLiteDatabase)object, zzr2, string2);
        return null;
    }
}

