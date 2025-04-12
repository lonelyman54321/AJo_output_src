/*
 * Decompiled with CFR 0.152.
 */
public final class EK1 {
    public static final float a(long l2, float f5, long l3, long l4) {
        l2 = zx_0.f(OX.b(l2, f5), l4);
        f5 = zx_0.h(zx_0.f(l3, l2));
        float f6 = 0.05f;
        float f7 = zx_0.h(l2) + f6;
        float f8 = Math.max(f5 += f6, f7);
        f7 = Math.min(f5, f7);
        return f8 / f7;
    }
}

