/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbps;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmq;

final class zzbpj
implements zzccp {
    final /* synthetic */ zzbps zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ zzbpt zzc;

    public zzbpj(zzbpt zzbpt2, zzbps zzbps2, zzfmc zzfmc2) {
        this.zza = zzbps2;
        this.zzb = zzfmc2;
        this.zzc = zzbpt2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zza() {
        Object object2;
        zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        Object object = zzbpt.zzf(this.zzc);
        // MONITORENTER : object
        Object object3 = "loadNewJavascriptEngine (failure): Lock acquired";
        zze.zza((String)object3);
        object3 = this.zzc;
        int n3 = 1;
        zzbpt.zzh((zzbpt)object3, n3);
        object3 = "Failed loading new engine. Marking new engine destroyable.";
        zze.zza((String)object3);
        object3 = this.zza;
        ((zzbps)object3).zzb();
        object3 = zzbgd.zzd;
        object3 = ((zzbfv)object3).zze();
        object3 = (Boolean)object3;
        boolean bl2 = (Boolean)object3;
        if (bl2 && (object2 = zzbpt.zze((zzbpt)(object3 = this.zzc))) != null) {
            object3 = zzbpt.zze((zzbpt)object3);
            object2 = this.zzb;
            String string2 = "Failed loading new engine";
            object2.zzc(string2);
            string2 = null;
            object2.zzh(false);
            object2 = object2.zzn();
            ((zzfmq)object3).zzb((zzfmg)object2);
        }
        zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}

