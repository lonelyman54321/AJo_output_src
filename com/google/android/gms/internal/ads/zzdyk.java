/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyl;

public final class zzdyk
implements Runnable {
    public final /* synthetic */ zzdyl zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdyk(zzdyl zzdyl2, String string2) {
        this.zza = zzdyl2;
        this.zzb = string2;
    }

    public final void run() {
        zzdyl zzdyl2 = this.zza;
        String string2 = this.zzb;
        zzdyl2.zzi(string2);
    }
}

