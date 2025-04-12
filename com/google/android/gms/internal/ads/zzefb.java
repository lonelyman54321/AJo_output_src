/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbdv$zzab;
import com.google.android.gms.internal.ads.zzbdv$zzaf$zzd;
import com.google.android.gms.internal.ads.zzeev;
import com.google.android.gms.internal.ads.zzefc;
import com.google.android.gms.internal.ads.zzefd;
import com.google.android.gms.internal.ads.zzefe;
import com.google.android.gms.internal.ads.zzefg;
import com.google.android.gms.internal.ads.zzfkw;
import java.util.ArrayList;

public final class zzefb
implements zzfkw {
    public final /* synthetic */ zzefc zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ ArrayList zzc;
    public final /* synthetic */ zzbdv$zzab zzd;
    public final /* synthetic */ zzbdv$zzaf$zzd zze;

    public /* synthetic */ zzefb(zzefc zzefc2, boolean bl2, ArrayList arrayList, zzbdv$zzab zzbdv$zzab, zzbdv$zzaf$zzd zzbdv$zzaf$zzd) {
        this.zza = zzefc2;
        this.zzb = bl2;
        this.zzc = arrayList;
        this.zzd = zzbdv$zzab;
        this.zze = zzbdv$zzaf$zzd;
    }

    public final Object zza(Object object) {
        Object object2 = this.zza;
        Object object3 = ((zzefc)object2).zzb;
        object = (SQLiteDatabase)object;
        boolean bl2 = ((zzefe)object3).zzf();
        if (!bl2) {
            object3 = this.zze;
            zzbdv$zzab zzbdv$zzab = this.zzd;
            ArrayList arrayList = this.zzc;
            boolean bl3 = this.zzb;
            zzefd zzefd2 = ((zzefc)object2).zzb;
            object3 = zzefd.zze(zzefd2, bl3, arrayList, zzbdv$zzab, (zzbdv$zzaf$zzd)object3);
            boolean bl4 = true;
            zzefg.zzf((SQLiteDatabase)object, bl3, bl4);
            object2 = zzefd.zzc(((zzefc)object2).zzb);
            long l2 = ((zzeev)object2).zzd();
            zzefg.zzc((SQLiteDatabase)object, l2, (byte[])object3);
        }
        return null;
    }
}

