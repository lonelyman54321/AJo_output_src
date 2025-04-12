/*
 * Decompiled with CFR 0.152.
 */
public final class Uo0 {
    public static int a(float f5, Vo0 vo0) {
        int n3;
        boolean bl2 = Float.isInfinite(f5 = vo0.J0(f5));
        if (bl2) {
            n3 = -1 >>> 1;
            f5 = 0.0f / 0.0f;
        } else {
            n3 = Math.round(f5);
        }
        return n3;
    }

    public static long b(long l2, Vo0 vo0) {
        long l3 = 9205357640488583168L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            float f5 = C63.d(l2);
            f5 = vo0.E0(f5);
            float f6 = C63.b(l2);
            f6 = vo0.E0(f6);
            l3 = zs0_1.c(f5, f6);
        }
        return l3;
    }

    public static float c(long l2, Vo0 vo0) {
        long l3;
        long l4 = Dm3.b(l2);
        boolean bl2 = Fm3.a(l4, l3 = 0x100000000L);
        if (bl2) {
            float f5 = vo0.H(l2);
            return vo0.J0(f5);
        }
        String string2 = "Only Sp can convert to Px".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static long d(long l2, Vo0 vo0) {
        long l3 = 9205357640488583168L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            float f5 = bs0_0.b(l2);
            f5 = vo0.J0(f5);
            float f6 = bs0_0.a(l2);
            f6 = vo0.J0(f6);
            l3 = bo1_1.a(f5, f6);
        }
        return l3;
    }

    public static /* synthetic */ void e(jr1_0 jr1_02, j6_0 j6_02, u10 u102, int n3) {
        if ((n3 &= 2) != 0) {
            j6_02 = null;
        }
        jr1_02.c(null, j6_02, null, u102);
    }

    public static /* synthetic */ void f(jr1_0 jr1_02, int n3, u10 u102) {
        ir1_1 ir1_12 = ir1_1.c;
        jr1_02.d(n3, null, null, ir1_12, u102);
    }
}

