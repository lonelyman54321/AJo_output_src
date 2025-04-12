/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzfo;
import com.google.android.gms.internal.icing.zzfr;

final class zzfp
extends zzfo {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int zzb(int n3, byte[] byArray, int n4, int n7) {
        int n8;
        n3 = 0;
        for (n4 = 0; n4 < n7 && (n8 = byArray[n4]) >= 0; ++n4) {
        }
        if (n4 >= n7) return n3;
        while (n4 < n7) {
            n8 = n4 + 1;
            int n10 = byArray[n4];
            if (n10 < 0) {
                int n14 = -32;
                int n15 = -65;
                if (n10 < n14) {
                    if (n8 >= n7) return n10;
                    n14 = -62;
                    if (n10 < n14) return -1;
                    n4 += 2;
                    if ((n8 = byArray[n8]) <= n15) continue;
                    return -1;
                }
                int n16 = -16;
                if (n10 < n16) {
                    n16 = n7 + -1;
                    if (n8 >= n16) {
                        return zzfr.zze(byArray, n8, n7);
                    }
                    n16 = n4 + 2;
                    if ((n8 = byArray[n8]) > n15) return -1;
                    int n17 = -96;
                    if (n10 == n14) {
                        if (n8 < n17) return -1;
                    }
                    if (n10 == (n14 = -19)) {
                        if (n8 >= n17) return -1;
                    }
                    n4 += 3;
                    n8 = byArray[n16];
                    if (n8 <= n15) continue;
                    return -1;
                }
                n14 = n7 + -2;
                if (n8 >= n14) {
                    return zzfr.zze(byArray, n8, n7);
                }
                n14 = n4 + 2;
                if ((n8 = byArray[n8]) > n15) return -1;
                if ((n8 = n8 + 112 + (n10 <<= 28) >> 30) != 0) return -1;
                n8 = n4 + 3;
                n10 = byArray[n14];
                if (n10 > n15) return -1;
                n4 += 4;
                if ((n8 = byArray[n8]) <= n15) continue;
                return -1;
            }
            n4 = n8;
        }
        return n3;
    }
}

