/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzfkw;

public final class zzefx
implements zzfkw {
    public final /* synthetic */ zzefz zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzefx(zzefz zzefz2, String string2) {
        this.zza = zzefz2;
        this.zzb = string2;
    }

    public final Object zza(Object object) {
        object = (SQLiteDatabase)object;
        String string2 = this.zzb;
        zzefz.zzi((SQLiteDatabase)object, string2);
        return null;
    }
}

