/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class EI3$a {
    public static long a(boolean bl2, int n3, Au au4, long l2, long l3, int n4, boolean bl3, long l4, long l7, long l8, long l12) {
        int n7 = n3;
        Au au5 = au4;
        long l14 = l2;
        String string2 = "backoffPolicy";
        Intrinsics.checkNotNullParameter((Object)au4, string2);
        long l15 = Long.MAX_VALUE;
        long l16 = l12 == l15 ? 0 : (l12 < l15 ? -1 : 1);
        if (l16 != false && bl3) {
            long l17;
            if (n4 == 0) {
                l17 = l12;
            } else {
                l17 = 900000L + l3;
                l17 = f.b(l12, l17);
            }
            return l17;
        }
        if (bl2) {
            long l18;
            Au au6 = Au.LINEAR;
            if (au5 == au6) {
                l18 = (long)n7 * l14;
            } else {
                float f5 = l14;
                float f6 = Math.scalb(f5, n7 += -1);
                l18 = (long)f6;
            }
            l14 = 18000000L;
            l18 = f.d(l18, l14);
            l15 = l18 + l3;
        } else if (bl3) {
            long l19 = n4 == 0 ? l3 + l4 : l3 + l8;
            long l20 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
            l15 = l20 != false && n4 == 0 ? (l14 = l8 - l7 + l19) : l19;
        } else {
            long l21 = -1;
            long l22 = l3 - l21;
            long l23 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
            if (l23 != false) {
                l15 = l3 + l4;
            }
        }
        return l15;
    }
}

