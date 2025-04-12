/*
 * Decompiled with CFR 0.152.
 */
public final class i70$a$f
implements i70_0 {
    public final long a(long l2, long l3) {
        float f5;
        float f6;
        float f7 = C63.d(l2);
        float f8 = f7 - (f6 = C63.d(l3));
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object <= 0 && (object = (f5 = (f7 = C63.b(l2)) - (f6 = C63.b(l3))) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) <= 0) {
            float f11 = 1.0f;
            l2 = ZS2.a(f11, f11);
        } else {
            f7 = C63.d(l3);
            f6 = C63.d(l2);
            float f12 = C63.b(l3);
            float f14 = C63.b(l2);
            f12 /= f14;
            f14 = Math.min(f7 /= f6, f12);
            l2 = ZS2.a(f14, f14);
        }
        return l2;
    }
}

