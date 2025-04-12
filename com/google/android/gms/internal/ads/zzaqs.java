/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzarn;

public final class zzaqs {
    private int zza = 2500;
    private int zzb;

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final void zzc(zzarn zzarn2) {
        int n3 = this.zzb;
        int n4 = 1;
        this.zzb = n3 += n4;
        int n7 = this.zza;
        float f5 = n7;
        int n8 = (int)f5;
        this.zza = n7 += n8;
        if (n3 <= n4) {
            return;
        }
        throw zzarn2;
    }
}

