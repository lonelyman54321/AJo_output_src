/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzeus;
import com.google.android.gms.internal.ads.zzeuu;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeut
implements zzexw {
    private final Context zza;
    private final zzgge zzb;

    public zzeut(zzgge zzgge2, Context context) {
        this.zzb = zzgge2;
        this.zza = context;
    }

    public final int zza() {
        return 57;
    }

    public final ListenableFuture zzb() {
        zzeus zzeus2 = new zzeus(this);
        return this.zzb.zzb(zzeus2);
    }

    public final /* synthetic */ zzeuu zzc() {
        zzu.zzp();
        Integer n3 = zzt.zzs(this.zza);
        zzeuu zzeuu2 = new zzeuu(n3);
        return zzeuu2;
    }
}

