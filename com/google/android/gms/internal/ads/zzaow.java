/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacz;
import com.google.android.gms.internal.ads.zzade;
import com.google.android.gms.internal.ads.zzaov;
import com.google.android.gms.internal.ads.zzgb;

final class zzaow
extends zzade {
    public zzaow(zzgb zzgb2, long l2, long l3) {
        zzacz zzacz2 = new zzacz();
        zzaov zzaov2 = new zzaov(zzgb2, null);
        long l4 = l2 + 1L;
        super(zzacz2, zzaov2, l2, 0L, l4, 0L, l3, 188L, 1000);
    }

    public static /* bridge */ /* synthetic */ int zzh(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        int n7 = n3 + 1;
        n7 = byArray[n7] & 0xFF;
        int n8 = n3 + 2;
        n8 = byArray[n8] & 0xFF;
        int n10 = byArray[n3 += 3] & 0xFF;
        n3 = n4 << 24;
        n4 = n7 << 16;
        n3 |= n4;
        n4 = n8 << 8;
        return n10 | (n3 |= n4);
    }
}

