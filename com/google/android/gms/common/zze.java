/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

import com.google.android.gms.common.zzj;
import com.google.android.gms.common.zzn;
import java.util.concurrent.Callable;

public final class zze
implements Callable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzj zzc;

    public /* synthetic */ zze(boolean bl2, String string2, zzj zzj2) {
        this.zza = bl2;
        this.zzb = string2;
        this.zzc = zzj2;
    }

    public final Object call() {
        boolean bl2 = this.zza;
        String string2 = this.zzb;
        zzj zzj2 = this.zzc;
        return zzn.zzd(bl2, string2, zzj2);
    }
}

