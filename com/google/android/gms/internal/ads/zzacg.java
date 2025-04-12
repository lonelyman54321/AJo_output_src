/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzach;

public final class zzacg
implements Runnable {
    public final /* synthetic */ zzach zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzacg(zzach zzach2, String string2) {
        this.zza = zzach2;
        this.zzb = string2;
    }

    public final void run() {
        zzach zzach2 = this.zza;
        String string2 = this.zzb;
        zzach2.zzh(string2);
    }
}

