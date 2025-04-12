/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzgx;
import com.google.android.gms.internal.gtm.zzgz;
import com.google.android.gms.internal.gtm.zzha;
import com.google.android.gms.internal.gtm.zzig;
import java.util.Map;

final class zzgy
implements Runnable {
    final /* synthetic */ zzgx zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ Map zzf;
    final /* synthetic */ String zzg;
    final /* synthetic */ zzgz zzh;

    public zzgy(zzgz zzgz2, zzgx zzgx2, long l2, String string2, String string3, String string4, Map map2, String string5) {
        this.zza = zzgx2;
        this.zzb = l2;
        this.zzc = string2;
        this.zzd = string3;
        this.zze = string4;
        this.zzf = map2;
        this.zzg = string5;
        this.zzh = zzgz2;
    }

    public final void run() {
        Object object = zzgz.zze(this.zzh);
        if (object == null) {
            object = this.zzh;
            Object object2 = this.zza;
            zzig zzig2 = zzig.zzf();
            object = zzgz.zzc((zzgz)object);
            zzig2.zzj((Context)object, (zzgx)object2);
            object = this.zzh;
            object2 = zzig2.zze();
            zzgz.zzf((zzgz)object, (zzha)object2);
        }
        object = this.zzh;
        long l2 = this.zzb;
        String string2 = this.zzc;
        String string3 = this.zzd;
        String string4 = this.zze;
        Map map2 = this.zzf;
        String string5 = this.zzg;
        zzgz.zze((zzgz)object).zzb(l2, string2, string3, string4, map2, string5);
    }
}

