/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzqn;

public final class zzqm
implements Runnable {
    public final /* synthetic */ zzqn zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzqm(zzqn zzqn2, String string2) {
        this.zza = zzqn2;
        this.zzb = string2;
    }

    public final void run() {
        zzqn zzqn2 = this.zza;
        String string2 = this.zzb;
        zzqn2.zzo(string2);
    }
}

