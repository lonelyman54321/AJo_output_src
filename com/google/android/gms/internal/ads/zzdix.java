/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzdik;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzdix
implements zzhkp {
    private final zzdik zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzdix(zzdik zzdik2, zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzdik2;
        this.zzb = zzhlg2;
        this.zzc = zzhlg3;
    }

    public final zzcaq zza() {
        Context context = ((zzcjj)this.zzb).zza();
        String string2 = ((zzczc)this.zzc).zza().zzf;
        zzcaq zzcaq2 = new zzcaq(context, string2);
        return zzcaq2;
    }
}

