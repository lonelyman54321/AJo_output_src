/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.zzfa;

final class zzev
implements Runnable {
    final /* synthetic */ zzfa zza;

    public zzev(zzfa zzfa2) {
        this.zza = zzfa2;
    }

    public final void run() {
        zzfa.zze(this.zza).zza();
    }
}

