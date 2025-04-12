/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.tagmanager.zzbx;
import com.google.android.gms.tagmanager.zzby;
import com.google.android.gms.tagmanager.zzfa;

final class zzbw
implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbx zzc;
    final /* synthetic */ zzbx zzd;

    public zzbw(zzbx zzbx2, zzbx zzbx3, long l2, String string2) {
        this.zzd = zzbx3;
        this.zza = l2;
        this.zzb = string2;
        this.zzc = zzbx2;
    }

    public final void run() {
        Object object = zzbx.zzc(this.zzc);
        if (object == null) {
            object = this.zzc;
            Object object2 = this.zzd;
            zzfa zzfa2 = zzfa.zzg();
            object = zzbx.zza((zzbx)object);
            zzfa2.zzl((Context)object, (zzbx)object2);
            object = this.zzc;
            object2 = zzfa2.zzf();
            zzbx.zzd((zzbx)object, (zzby)object2);
        }
        object = this.zzc;
        long l2 = this.zza;
        String string2 = this.zzb;
        zzbx.zzc((zzbx)object).zzb(l2, string2);
    }
}

