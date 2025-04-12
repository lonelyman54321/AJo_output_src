/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util.client;

import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzr;

final class zzd
extends Thread {
    final /* synthetic */ String zza;

    public zzd(zzf zzf2, String string2) {
        this.zza = string2;
    }

    public final void run() {
        zzr zzr2 = new zzr(null);
        String string2 = this.zza;
        zzr2.zza(string2);
    }
}

