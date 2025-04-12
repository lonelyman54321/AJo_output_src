/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eT2
 */
public final class et2_1 {
    public static final long[] a;

    static {
        long[] lArray = new long[]{-9187201950435737345L, -1};
        a = lArray;
        new nr1_1(0);
    }

    public static final void a(long[] lArray, int n3) {
        long l2;
        long l3;
        String string2 = "metadata";
        Intrinsics.checkNotNullParameter(lArray, string2);
        int n4 = 7;
        n3 = n3 + n4 >> 3;
        for (int i3 = 0; i3 < n3; ++i3) {
            long l4 = lArray[i3] & 0x8080808080808080L;
            long l7 = l4 ^ (long)-1;
            lArray[i3] = l4 = 0xFEFEFEFEFEFEFEFEL & (l7 += (l4 >>>= n4));
        }
        Intrinsics.checkNotNullParameter(lArray, "<this>");
        n3 = lArray.length;
        n4 = n3 + -1;
        lArray[n3 += -2] = l3 = lArray[n3] & 0xFFFFFFFFFFFFFFL | 0xFF00000000000000L;
        lArray[n4] = l2 = lArray[0];
    }

    public static final int b(long[] lArray, int n3, int n4) {
        String string2 = "metadata";
        Intrinsics.checkNotNullParameter(lArray, string2);
        while (n3 < n4) {
            int n7 = n3 >> 3;
            long l2 = lArray[n7];
            int n8 = (n3 & 7) << 3;
            long l3 = 128L;
            long l4 = (l2 = l2 >> n8 & 0xFFL) - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static final int c(int n3) {
        int n4 = 7;
        if (n3 == n4) {
            return 6;
        }
        n4 = n3 / 8;
        return n3 - n4;
    }

    public static final nr1_1 d() {
        nr1_1 nr1_12 = new nr1_1(null);
        return nr1_12;
    }

    public static final int e(int n3) {
        n3 = n3 == 0 ? 6 : n3 * 2 + 1;
        return n3;
    }

    public static final int f(int n3) {
        if (n3 > 0) {
            int n4 = -1;
            n3 = Integer.numberOfLeadingZeros(n3);
            n3 = n4 >>> n3;
        } else {
            n3 = 0;
        }
        return n3;
    }

    public static final int g(int n3) {
        int n4 = 7;
        if (n3 == n4) {
            return 8;
        }
        return (n3 + -1) / n4 + n3;
    }
}

