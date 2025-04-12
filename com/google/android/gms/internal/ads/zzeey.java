/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbdv$zzaf$zza;
import com.google.android.gms.internal.ads.zzbdv$zzaf$zza$zza;
import com.google.android.gms.internal.ads.zzeez;
import com.google.android.gms.internal.ads.zzefg;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzhbi;

public final class zzeey
implements zzfkw {
    public final /* synthetic */ zzeez zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzeey(zzeez zzeez2, long l2) {
        this.zza = zzeez2;
        this.zzb = l2;
    }

    public final Object zza(Object object) {
        zzeez zzeez2 = this.zza;
        object = (SQLiteDatabase)object;
        boolean bl2 = zzeez2.zzf();
        if (!bl2) {
            long l2 = this.zzb;
            Object object2 = zzbdv$zzaf$zza.zzn();
            ((zzbdv$zzaf$zza$zza)object2).zzP(l2);
            object2 = ((zzbdv$zzaf$zza)((zzhbi)object2).zzbn()).zzaV();
            zzefg.zzf((SQLiteDatabase)object, false, false);
            zzefg.zzc((SQLiteDatabase)object, l2, (byte[])object2);
        }
        return null;
    }
}

