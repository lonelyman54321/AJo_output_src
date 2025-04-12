/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 */
import android.content.Context;
import android.content.res.Configuration;

/*
 * Renamed from Ap1
 */
public final class ap1_0 {
    public static final Xo0 a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        float f5 = configuration.fontScale;
        context = context.getResources().getDisplayMetrics();
        float f6 = context.density;
        jV0 jV02 = kV0.a(f5);
        if (jV02 == null) {
            jV02 = new bu1_1(f5);
        }
        Xo0 xo0 = new Xo0(f6, f5, jV02);
        return xo0;
    }

    public static final aG2 b(zp1 object) {
        Object object2 = object.S();
        if (object2 != null) {
            boolean bl2 = true;
            float f5 = Float.MIN_VALUE;
            object = object2.G((zp1)object, bl2);
        } else {
            long l2 = object.a();
            int n3 = 32;
            float f6 = (int)(l2 >>= n3);
            long l3 = object.a();
            long l4 = 0xFFFFFFFFL;
            int n4 = (int)(l3 &= l4);
            float f7 = n4;
            object = object2 = new aG2(0.0f, 0.0f, f6, f7);
        }
        return object;
    }

    public static final aG2 c(zp1 object) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12;
        zp1 zp12 = ap1_0.d((zp1)object);
        long l2 = zp12.a() >> 32;
        int n3 = (int)l2;
        float f14 = n3;
        long l3 = zp12.a();
        long l4 = 0xFFFFFFFFL;
        int n4 = (int)(l3 &= l4);
        float f15 = n4;
        zp1 zp13 = ap1_0.d((zp1)object);
        object = zp13.G((zp1)object, true);
        float f16 = ((aG2)object).a;
        float f17 = 0.0f;
        float f18 = f16 - 0.0f;
        float f19 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
        if (f19 < 0) {
            n4 = 0;
            f16 = 0.0f;
            zp13 = null;
        }
        if ((f19 = f16 == f14 ? 0 : (f16 > f14 ? 1 : -1)) > 0) {
            f16 = f14;
        }
        if ((f12 = (f11 = (f8 = ((aG2)object).b) - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) < 0) {
            f19 = 0.0f;
            f8 = 0.0f;
        }
        if ((f12 = f8 == f15 ? 0 : (f8 > f15 ? 1 : -1)) > 0) {
            f8 = f15;
        }
        if ((f7 = (f6 = (f5 = ((aG2)object).c) - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) < 0) {
            f12 = 0.0f;
            f5 = 0.0f;
        }
        if ((f7 = f5 == f14 ? 0 : (f5 > f14 ? 1 : -1)) <= 0) {
            f14 = f5;
        }
        float f20 = ((aG2)object).d;
        float f22 = f20 - 0.0f;
        f12 = f22 == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1);
        if (f12 >= 0) {
            f17 = f20;
        }
        float f23 = f17 == f15 ? 0 : (f17 > f15 ? 1 : -1);
        if (f23 <= 0) {
            f15 = f17;
        }
        f23 = f16 == f14 ? 0 : (f16 < f14 ? -1 : 1);
        if (f23 == false || (f23 = f8 == f15 ? 0 : (f8 < f15 ? -1 : 1)) == false) {
            return aG2.e;
        }
        long l7 = h72.a(f16, f8);
        l7 = zp12.J(l7);
        l4 = h72.a(f14, f8);
        l4 = zp12.J(l4);
        long l8 = h72.a(f14, f15);
        l8 = zp12.J(l8);
        l2 = h72.a(f16, f15);
        long l12 = zp12.J(l2);
        f20 = e72.d(l7);
        f15 = e72.d(l4);
        f16 = e72.d(l12);
        float f24 = e72.d(l8);
        float f25 = Math.min(f16, f24);
        f25 = Math.min(f15, f25);
        f25 = Math.min(f20, f25);
        f16 = Math.max(f16, f24);
        f15 = Math.max(f15, f16);
        f20 = Math.max(f20, f15);
        f15 = e72.e(l7);
        f16 = e72.e(l4);
        float f26 = e72.e(l12);
        f14 = e72.e(l8);
        f17 = Math.min(f26, f14);
        f17 = Math.min(f16, f17);
        f17 = Math.min(f15, f17);
        f26 = Math.max(f26, f14);
        f26 = Math.max(f16, f26);
        f26 = Math.max(f15, f26);
        aG2 aG22 = new aG2(f25, f17, f20, f26);
        return aG22;
    }

    public static final zp1 d(zp1 zp12) {
        zp1 zp13;
        zp1 zp14 = zp12.S();
        while (true) {
            zp13 = zp14;
            zp14 = zp12;
            zp12 = zp13;
            if (zp13 == null) break;
            zp14 = zp13.S();
        }
        boolean bl2 = zp14 instanceof w32_0;
        if (bl2) {
            zp12 = zp14;
            zp12 = (w32_0)zp14;
        } else {
            bl2 = false;
            zp12 = null;
        }
        if (zp12 == null) {
            return zp14;
        }
        zp14 = ((w32_0)zp12).q;
        while (true) {
            zp13 = zp14;
            zp14 = zp12;
            zp12 = zp13;
            if (zp13 == null) break;
            zp14 = ((w32_0)zp13).q;
        }
        return zp14;
    }
}

