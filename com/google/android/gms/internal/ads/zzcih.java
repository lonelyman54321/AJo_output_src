/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcij;

public final class zzcih
implements Runnable {
    public final /* synthetic */ zzcij zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcih(zzcij zzcij2, String string2) {
        this.zza = zzcij2;
        this.zzb = string2;
    }

    public final void run() {
        zzcij zzcij2 = this.zza;
        String string2 = this.zzb;
        zzcij2.zza(string2);
    }
}

