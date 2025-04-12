/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeu;

public final class zzchg
implements Runnable {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzchg(String string2) {
        this.zza = string2;
    }

    public final void run() {
        zzbeu zzbeu2 = zzu.zzo().zzg();
        String string2 = this.zza;
        zzbeu2.zze(string2);
    }
}

