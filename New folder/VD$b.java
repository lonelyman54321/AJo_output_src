/*
 * Decompiled with CFR 0.152.
 */
public final class VD$b
implements UD {
    public final Qs3 b;

    public VD$b() {
        float f5 = 0.25f;
        Object object = new ne0_1(f5, 0.1f, f5);
        this.b = object = Hl.c(125, 0, (cx0_0)object, 2);
    }

    public final float a(float f5, float f6, float f7) {
        float f8 = (f6 = Math.abs(f6 + f5 - f5)) - f7;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        object = object <= 0 ? (Object)true : (Object)false;
        float f11 = 0.3f * f7;
        float f12 = 0.0f * f6;
        f11 -= f12;
        f12 = f7 - f11;
        if (object != false && (object = f12 == f6 ? 0 : (f12 < f6 ? -1 : 1)) < 0) {
            f11 = f7 - f6;
        }
        return f5 - f11;
    }

    public final Gl b() {
        return this.b;
    }
}

