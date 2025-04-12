/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhky;
import com.google.android.gms.internal.ads.zzhlb;
import com.google.android.gms.internal.ads.zzhld;
import java.util.List;

public final class zzhlc {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzhlc(int n3, int n4, zzhlb zzhlb2) {
        List list;
        this.zza = list = zzhkm.zzc(n3);
        this.zzb = list = zzhkm.zzc(n4);
    }

    public final zzhlc zza(zzhky zzhky2) {
        this.zzb.add(zzhky2);
        return this;
    }

    public final zzhlc zzb(zzhky zzhky2) {
        this.zza.add(zzhky2);
        return this;
    }

    public final zzhld zzc() {
        List list = this.zza;
        List list2 = this.zzb;
        zzhld zzhld2 = new zzhld(list, list2, null);
        return zzhld2;
    }
}

