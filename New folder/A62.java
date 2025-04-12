/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class A62 {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];

    public static final int a(int n3, int n4, int[] nArray) {
        Intrinsics.checkNotNullParameter(nArray, "array");
        n3 += -1;
        int n7 = 0;
        while (n7 <= n3) {
            int n8 = n7 + n3 >>> 1;
            int n10 = nArray[n8];
            if (n10 < n4) {
                n7 = n8 + 1;
                continue;
            }
            if (n10 > n4) {
                n3 = n8 + -1;
                continue;
            }
            return n8;
        }
        return ~n7;
    }

    public static final int b(long[] lArray, int n3, long l2) {
        Intrinsics.checkNotNullParameter(lArray, "array");
        n3 += -1;
        int n4 = 0;
        while (n4 <= n3) {
            int n7 = n4 + n3 >>> 1;
            long l3 = lArray[n7];
            long l4 = l3 - l2;
            long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (l7 < 0) {
                n4 = n7 + 1;
                continue;
            }
            if (l7 > 0) {
                n3 = n7 + -1;
                continue;
            }
            return n7;
        }
        return ~n4;
    }

    public static tr1_0 c() {
        Unit unit = Unit.a;
        J83.h();
        wv1_0 wv1_02 = wv1_0.b;
        return J83.f(unit, wv1_02);
    }

    public static final void d(tr1_0 tr1_02) {
        Unit unit = Unit.a;
        tr1_02.setValue(unit);
    }
}

