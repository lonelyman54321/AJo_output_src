/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from mV0
 */
public final class mv0_0 {
    public static float a(long l2, Vo0 vo0) {
        long l3;
        long l4 = Dm3.b(l2);
        Object object = Fm3.a(l4, l3 = 0x100000000L);
        if (object != 0) {
            float f5;
            Object object2 = kV0.a;
            float f6 = vo0.H0();
            float f7 = f6 - (f5 = 1.03f);
            object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object >= 0) {
                f6 = vo0.H0();
                object2 = kV0.a(f6);
                float f8 = Dm3.c(l2);
                float f11 = object2 == null ? vo0.H0() * f8 : object2.b(f8);
                return f11;
            }
            float f12 = Dm3.c(l2);
            return vo0.H0() * f12;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Only Sp can convert to Px");
        throw illegalStateException;
    }

    public static long b(float f5, Vo0 vo0) {
        float f6;
        Object object = kV0.a;
        float f7 = vo0.H0();
        float f8 = f7 - (f6 = 1.03f);
        Object object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object2 >= 0) {
            object2 = true;
            f7 = Float.MIN_VALUE;
        } else {
            object2 = false;
            f7 = 0.0f;
            object = null;
        }
        long l2 = 0x100000000L;
        if (object2 == false) {
            float f11 = vo0.H0();
            return Em3.i(l2, f5 /= f11);
        }
        f7 = vo0.H0();
        object = kV0.a(f7);
        if (object != null) {
            f5 = object.a(f5);
        } else {
            float f12 = vo0.H0();
            f5 /= f12;
        }
        return Em3.i(l2, f5);
    }
}

