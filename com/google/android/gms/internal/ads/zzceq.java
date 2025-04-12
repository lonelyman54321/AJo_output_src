/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcew;

public final class zzceq
implements Runnable {
    public final /* synthetic */ zzcew zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzceq(zzcew zzcew2, String string2) {
        this.zza = zzcew2;
        this.zzb = string2;
    }

    public final void run() {
        zzcew zzcew2 = this.zza;
        String string2 = this.zzb;
        zzcew2.zzK(string2);
    }
}

