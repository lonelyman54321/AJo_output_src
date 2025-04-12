/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzewp;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzewo
implements zzexw {
    private final String zza;
    private final String zzb;

    public zzewo(String string2, String string3) {
        this.zza = string2;
        this.zzb = string3;
    }

    public final int zza() {
        return 31;
    }

    public final ListenableFuture zzb() {
        String string2 = this.zza;
        String string3 = this.zzb;
        zzewp zzewp2 = new zzewp(string2, string3);
        return zzgft.zzh(zzewp2);
    }
}

