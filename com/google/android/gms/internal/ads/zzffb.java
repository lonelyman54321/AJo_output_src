/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzfdx;

public final class zzffb
implements zzfdx {
    public final /* synthetic */ zzbyh zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzffb(zzbyh zzbyh2, String string2, String string3) {
        this.zza = zzbyh2;
        this.zzb = string2;
        this.zzc = string3;
    }

    public final void zza(Object object) {
        Object object2 = this.zza;
        object = (zzbzi)object;
        String string2 = object2.zzc();
        int n3 = object2.zzb();
        zzbzr zzbzr2 = new zzbzr(string2, n3);
        object2 = this.zzb;
        string2 = this.zzc;
        ((zzbzi)object).zze(zzbzr2, (String)object2, string2);
    }
}

