/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.zzaz;

final class zzaw
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzaz zzb;

    public zzaw(zzaz zzaz2, String string2) {
        this.zza = string2;
        this.zzb = zzaz2;
    }

    public final void run() {
        zzaz zzaz2 = this.zzb;
        String string2 = this.zza;
        zzaz.zzg(zzaz2, string2);
    }
}

