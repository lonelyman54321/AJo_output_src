/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.internal.DispatchedContinuation;

/*
 * Renamed from Si0
 */
public final class si0_2 {
    public static final boolean a(aw2_0 aw2_02) {
        boolean bl2;
        boolean bl3 = aw2_02.h;
        if (!bl3 && (bl2 = aw2_02.d)) {
            bl2 = true;
        } else {
            bl2 = false;
            aw2_02 = null;
        }
        return bl2;
    }

    public static final boolean b(aw2_0 aw2_02) {
        boolean bl2;
        boolean bl3 = aw2_02.b();
        if (!bl3 && (bl3 = aw2_02.h) && !(bl2 = aw2_02.d)) {
            bl2 = true;
        } else {
            bl2 = false;
            aw2_02 = null;
        }
        return bl2;
    }

    public static final boolean c(aw2_0 aw2_02) {
        boolean bl2;
        boolean bl3 = aw2_02.h;
        if (bl3 && !(bl2 = aw2_02.d)) {
            bl2 = true;
        } else {
            bl2 = false;
            aw2_02 = null;
        }
        return bl2;
    }

    public static final String d(Object object) {
        return Integer.toHexString(System.identityHashCode(object));
    }

    public static final boolean e(aw2_0 aw2_02, long l2) {
        float f5;
        float f6;
        float f7;
        int n3;
        long l3 = aw2_02.c;
        float f8 = e72.d(l3);
        float f11 = e72.e(l3);
        float f12 = 4.5E-44f;
        long l4 = l2 >> 32;
        int n4 = (int)l4;
        long l7 = 0xFFFFFFFFL;
        int n7 = (int)(l2 &= l7);
        float f14 = f8 - 0.0f;
        Object object = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object >= 0 && (n3 = (f7 = f8 - (f12 = (float)n4)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) <= 0 && (n3 = (int)((f6 = f11 - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1))) >= 0 && (n3 = (int)((f5 = f11 - (f8 = (float)n7)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) <= 0) {
            n3 = 0;
            f8 = 0.0f;
            aw2_02 = null;
        } else {
            n3 = 1;
            f8 = Float.MIN_VALUE;
        }
        return n3 != 0;
    }

    public static final boolean f(aw2_0 aw2_02, long l2, long l3) {
        float f5;
        int n3 = aw2_02.i;
        boolean bl2 = true;
        if ((n3 = (int)(lw2_0.a(n3, (int)(bl2 ? 1 : 0)) ? 1 : 0)) == 0) {
            return si0_2.e(aw2_02, l2);
        }
        long l4 = aw2_02.c;
        float f6 = e72.d(l4);
        float f7 = e72.e(l4);
        float f8 = -C63.d(l3);
        int n4 = 32;
        long l7 = l2 >> n4;
        int n7 = (int)l7;
        float f11 = n7;
        float f12 = C63.d(l3) + f11;
        f11 = -C63.b(l3);
        long l8 = 0xFFFFFFFFL;
        int n8 = (int)(l2 &= l8);
        float f14 = n8;
        float f15 = C63.b(l3) + f14;
        Object object = f6 == f8 ? 0 : (f6 < f8 ? -1 : 1);
        if (object >= 0 && (f5 = f6 == f12 ? 0 : (f6 > f12 ? 1 : -1)) <= 0 && (f5 = f7 == f11 ? 0 : (f7 < f11 ? -1 : 1)) >= 0 && (f5 = f7 == f15 ? 0 : (f7 > f15 ? 1 : -1)) <= 0) {
            bl2 = false;
        }
        return bl2;
    }

    public static final long g(aw2_0 aw2_02, boolean bl2) {
        boolean bl3;
        long l2 = aw2_02.g;
        long l3 = aw2_02.c;
        l2 = e72.h(l3, l2);
        if (!bl2 && (bl3 = aw2_02.b())) {
            l2 = 0L;
        }
        return l2;
    }

    public static final String h(f80_0 object) {
        char c2 = object instanceof DispatchedContinuation;
        if (c2 != '\u0000') {
            object = ((DispatchedContinuation)object).toString();
        } else {
            c2 = '@';
            Object object2 = tl2_2.b;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(c2);
            Object object3 = si0_2.d(object);
            try {
                ((StringBuilder)object2).append((String)object3);
                object2 = ((StringBuilder)object2).toString();
            }
            catch (Throwable throwable) {
                object3 = tl2_2.b;
                object2 = vl2_2.a(throwable);
            }
            object3 = tl2_2.a(object2);
            if (object3 != null) {
                object2 = new StringBuilder();
                object3 = object.getClass().getName();
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append(c2);
                object = si0_2.d(object);
                ((StringBuilder)object2).append((String)object);
                object2 = ((StringBuilder)object2).toString();
            }
            object = object2;
            object = (String)object2;
        }
        return object;
    }
}

