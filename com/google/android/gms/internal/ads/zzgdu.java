/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgdt;
import com.google.android.gms.internal.ads.zzgdv;
import java.math.RoundingMode;

public final class zzgdu {
    private static final long[][] zza;

    static {
        long[] lArray;
        long[] lArray2;
        long[] lArray3;
        long[] lArray4;
        long[] lArray5;
        long[] lArray6;
        int n3 = 2;
        long[] lArray7 = new long[n3];
        lArray7[0] = 291830L;
        lArray7[1] = 126401071349994536L;
        int n4 = 3;
        long[] lArray8 = lArray6 = new long[n4];
        lArray6[0] = 885594168L;
        lArray8[1] = 725270293939359937L;
        lArray8[2] = 3569819667048198375L;
        int n7 = 4;
        long[] lArray9 = lArray5 = new long[n7];
        long[] lArray10 = lArray5;
        lArray9[0] = 273919523040L;
        lArray10[1] = 15;
        lArray9[2] = 7363882082L;
        lArray10[3] = 992620450144556L;
        int n8 = 5;
        long[] lArray11 = lArray4 = new long[n8];
        long[] lArray12 = lArray4;
        lArray11[0] = 47636622961200L;
        lArray12[1] = 2;
        lArray11[2] = 2570940L;
        lArray12[3] = 211991001L;
        lArray12[4] = 3749873356L;
        int n10 = 6;
        long[] lArray13 = lArray3 = new long[n10];
        long[] lArray14 = lArray3;
        lArray13[0] = 7999252175582850L;
        lArray14[1] = 2;
        lArray13[2] = 4130806001517L;
        lArray14[3] = 149795463772692060L;
        lArray13[4] = 186635894390467037L;
        lArray14[5] = 3967304179347715805L;
        int n14 = 7;
        long[] lArray15 = lArray2 = new long[n14];
        long[] lArray16 = lArray2;
        lArray15[0] = 585226005592931976L;
        lArray16[1] = 2;
        lArray15[2] = 123635709730000L;
        lArray16[3] = 9233062284813009L;
        lArray15[4] = 43835965440333360L;
        lArray16[5] = 761179012939631437L;
        lArray16[6] = 1263739024124850375L;
        long[] lArray17 = lArray = new long[8];
        long[] lArray18 = lArray;
        lArray17[0] = Long.MAX_VALUE;
        lArray18[1] = 2;
        lArray17[2] = 325L;
        lArray18[3] = 9375L;
        lArray17[4] = 28178L;
        lArray18[5] = 450775L;
        lArray17[6] = 9780504L;
        lArray18[7] = 1795265022L;
        long[][] lArrayArray = new long[n14][];
        lArrayArray[0] = lArray7;
        lArrayArray[1] = lArray6;
        lArrayArray[n3] = lArray5;
        lArrayArray[n4] = lArray4;
        lArrayArray[n7] = lArray3;
        lArrayArray[n8] = lArray2;
        lArrayArray[n10] = lArray;
        zza = lArrayArray;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static long zza(long l2, long l3, RoundingMode roundingMode) {
        ((Object)((Object)roundingMode)).getClass();
        long l4 = l2 / l3;
        long l7 = l3 * l4;
        l7 = l2 - l7;
        long l8 = 0L;
        long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
        if (l12 == false) {
            return l4;
        }
        l2 ^= l3;
        int[] nArray = zzgdt.zza;
        int n3 = roundingMode.ordinal();
        l12 = nArray[n3];
        n3 = 63;
        int n4 = (int)(l2 >>= n3);
        int n7 = n4 | 1;
        int n8 = 0;
        block8: do {
            switch (n8 == 0 ? l12 : n8) {
                default: {
                    AssertionError assertionError = new AssertionError();
                    throw assertionError;
                }
                case 6: 
                case 7: 
                case 8: {
                    l7 = Math.abs(l7);
                    long l14 = Math.abs(l3) - l7;
                    long l15 = (l7 -= l14) - l8;
                    n4 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                    if (n4 == 0) {
                        n8 = 4;
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        if (roundingMode == roundingMode2) continue block8;
                        roundingMode2 = RoundingMode.HALF_EVEN;
                        if (roundingMode != roundingMode2) return l4;
                        l14 = 1L & l4;
                        long l16 = l14 - l8;
                        Object object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                        if (object == false) return l4;
                        n8 = 4;
                        continue block8;
                    }
                    if (n4 <= 0) return l4;
                    n8 = 4;
                    continue block8;
                }
                case 5: {
                    if (n7 <= 0) return l4;
                    n8 = 4;
                    continue block8;
                }
                case 3: {
                    if (n7 >= 0) return l4;
                }
                case 4: {
                    l2 = n7;
                    return l4 + l2;
                }
                case 1: {
                    n7 = 0;
                    Object var16_12 = null;
                    zzgdv.zzb(false);
                    return l4;
                }
                case 2: 
            }
            return l4;
        } while (true);
        return l4;
    }

    public static long zzb(long l2, long l3) {
        zzgdv.zza("a", l2);
        String string2 = "b";
        zzgdv.zza(string2, l3);
        long l4 = 0L;
        Object object = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (object == false) {
            return l3;
        }
        object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object == false) {
            return l2;
        }
        int n3 = Long.numberOfTrailingZeros(l2);
        l2 >>= n3;
        int n4 = Long.numberOfTrailingZeros(l3);
        l3 >>= n4;
        while ((object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) != false) {
            object = 63;
            long l7 = (l2 -= l3) >> object & l2;
            l2 = l2 - l7 - l7;
            int n7 = Long.numberOfTrailingZeros(l2);
            l2 >>= n7;
            l3 += l7;
        }
        int n8 = Math.min(n3, n4);
        return l2 << n8;
    }

    public static long zzc(long l2, long l3) {
        long l4;
        long l7 = l2 ^ (long)-1;
        int n3 = Long.numberOfLeadingZeros(l2);
        int n4 = Long.numberOfLeadingZeros(l7) + n3;
        int n7 = Long.numberOfLeadingZeros(l3) + n4;
        long l8 = l3 ^ (long)-1;
        n4 = Long.numberOfLeadingZeros(l8) + n7;
        if (n4 > (n7 = 65)) {
            return l2 * l3;
        }
        long l12 = l2 ^ l3;
        int n8 = 64;
        int n10 = 0;
        int n14 = 1;
        n4 = n4 < n8 ? 1 : 0;
        long l14 = 0L;
        n8 = (int)(l2 == l14 ? 0 : (l2 < l14 ? -1 : 1));
        int n15 = n8 < 0 ? 1 : 0;
        long l15 = Long.MIN_VALUE;
        long l16 = l3 - l15;
        Object object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (object == false) {
            n10 = 1;
        }
        n14 = 63;
        l12 >>>= n14;
        long l17 = Long.MAX_VALUE;
        l12 += l17;
        if ((n4 |= (n10 &= n15)) != 0) {
            return l12;
        }
        l17 = l2 * l3;
        if (n8 != 0 && (n4 = (int)((l4 = (l2 = l17 / l2) - l3) == 0L ? 0 : (l4 < 0L ? -1 : 1))) != 0) {
            return l12;
        }
        return l17;
    }
}

