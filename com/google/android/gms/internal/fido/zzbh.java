/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzbg;
import com.google.android.gms.internal.fido.zzbi;
import java.math.RoundingMode;

public final class zzbh {
    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static int zza(int n3, int n4, RoundingMode roundingMode) {
        ((Object)((Object)roundingMode)).getClass();
        if (n4 == 0) {
            ArithmeticException arithmeticException = new ArithmeticException("/ by zero");
            throw arithmeticException;
        }
        int n7 = n3 / n4;
        int n8 = n4 * n7;
        if ((n8 = n3 - n8) == 0) {
            return n7;
        }
        n3 ^= n4;
        int[] nArray = zzbg.zza;
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
                    n8 = Math.abs(n8);
                    n4 = Math.abs(n4) - n8;
                    if ((n8 -= n4) == 0) {
                        n15 = 4;
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        if (roundingMode == roundingMode2) continue block8;
                        roundingMode2 = RoundingMode.HALF_EVEN;
                        if (roundingMode != roundingMode2) {
                            n10 = 0;
                        }
                        n4 = n7 & 1 & n10;
                        if (n4 == 0) return n7;
                        n15 = 4;
                        continue block8;
                    }
                    if (n8 <= 0) return n7;
                    n15 = 4;
                    continue block8;
                }
                case 5: {
                    if (n3 <= 0) return n7;
                    n15 = 4;
                    continue block8;
                }
                case 3: {
                    if (n3 >= 0) return n7;
                }
                case 4: {
                    return n7 + n3;
                }
                case 1: {
                    zzbi.zza(false);
                    return n7;
                }
                case 2: 
            }
            return n7;
        } while (true);
        return n7;
    }

    public static int zzb(int n3, RoundingMode roundingMode) {
        if (n3 > 0) {
            int[] nArray = zzbg.zza;
            int n4 = roundingMode.ordinal();
            n4 = nArray[n4];
            switch (n4) {
                default: {
                    AssertionError assertionError = new AssertionError();
                    throw assertionError;
                }
                case 6: 
                case 7: 
                case 8: {
                    n4 = Integer.numberOfLeadingZeros(n3);
                    int n7 = -1257966797 >>> n4;
                    n4 = 31 - n4;
                    n3 = n7 - n3 >>> 31;
                    return n4 + n3;
                }
                case 4: 
                case 5: {
                    n3 = Integer.numberOfLeadingZeros(n3 + -1);
                    return 32 - n3;
                }
                case 1: {
                    n4 = n3 + -1 & n3;
                    if (n4 == 0) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        roundingMode = null;
                    }
                    zzbi.zza(n4 != 0);
                }
                case 2: 
                case 3: 
            }
            n3 = Integer.numberOfLeadingZeros(n3);
            return 31 - n3;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("x (0) must be > 0");
        throw illegalArgumentException;
    }
}

