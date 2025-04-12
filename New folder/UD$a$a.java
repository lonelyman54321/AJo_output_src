/*
 * Decompiled with CFR 0.152.
 */
public final class UD$a$a
implements UD {
    /*
     * Enabled aggressive block sorting
     */
    public final float a(float f5, float f6, float f7) {
        float f8;
        UD.a.getClass();
        f6 += f5;
        float f11 = 0.0f;
        float f12 = f5 - 0.0f;
        Object object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (object >= 0) {
            object = f6 == f7 ? 0 : (f6 < f7 ? -1 : 1);
            if (object <= 0) return 0.0f;
        }
        if ((object = (f8 = f5 - 0.0f) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) < 0 && (object = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1)) > 0) {
            return 0.0f;
        }
        f11 = Math.abs(f5);
        float f14 = f11 - (f7 = Math.abs(f6 -= f7));
        Object object2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object2 >= 0) return f6;
        return f5;
    }

    public final Gl b() {
        UD.a.getClass();
        return UD$a.b;
    }
}

