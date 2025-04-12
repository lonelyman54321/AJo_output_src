/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgdr;
import com.google.android.gms.internal.ads.zzgdv;
import java.math.RoundingMode;

public final class zzgds {
    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static int zza(int n3, int n4, RoundingMode roundingMode) {
        ((Object)((Object)roundingMode)).getClass();
        n4 = n3 / 8;
        int n7 = n4 * 8;
        n7 = n3 - n7;
        if (n7 == 0) {
            return n4;
        }
        int n8 = 8;
        n3 ^= n8;
        int[] nArray = zzgdr.zza;
        int n10 = roundingMode.ordinal();
        int n14 = nArray[n10];
        n3 >>= 31;
        n10 = 1;
        n3 |= n10;
        int n15 = 0;
        block8: do {
            switch (n15 == 0 ? n14 : n15) {
                default: {
                    AssertionError assertionError = new AssertionError();
                    throw assertionError;
                }
                case 6: 
                case 7: 
                case 8: {
                    n7 = Math.abs(n7);
                    n8 = Math.abs(n8) - n7;
                    if ((n7 -= n8) == 0) {
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        if (roundingMode == roundingMode2) return n4 + n3;
                        roundingMode2 = RoundingMode.HALF_EVEN;
                        if (roundingMode != roundingMode2) {
                            n10 = 0;
                        }
                        int n16 = n4 & 1 & n10;
                        if (n16 == 0) return n4;
                        n15 = 4;
                        continue block8;
                    }
                    if (n7 <= 0) return n4;
                    n15 = 4;
                    continue block8;
                }
                case 5: {
                    if (n3 <= 0) return n4;
                    n15 = 4;
                    continue block8;
                }
                case 3: {
                    if (n3 >= 0) return n4;
                }
                case 4: {
                    return n4 + n3;
                }
                case 1: {
                    zzgdv.zzb(false);
                    return n4;
                }
                case 2: 
            }
            return n4;
        } while (true);
        return n4;
    }
}

