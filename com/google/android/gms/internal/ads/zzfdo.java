/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcys;
import com.google.android.gms.internal.ads.zzfdl;
import com.google.android.gms.internal.ads.zzfdp;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfel;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.common.util.concurrent.ListenableFuture;

final class zzfdo
implements zzfjw {
    private final zzfek zza;

    public zzfdo(zzfek zzfek2) {
        this.zza = zzfek2;
    }

    public final ListenableFuture zza(zzfjx object) {
        object = (zzfdp)object;
        zzfel zzfel2 = ((zzfdp)object).zzb;
        object = ((zzfdp)object).zza;
        return ((zzfdl)this.zza).zzb(zzfel2, (zzfej)object, null);
    }

    public final void zzb(zzfjl zzfjl2) {
        zzcys zzcys2;
        zzfjl2.zza = zzcys2 = ((zzfdl)this.zza).zza();
    }
}

