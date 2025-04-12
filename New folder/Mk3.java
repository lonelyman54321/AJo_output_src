/*
 * Decompiled with CFR 0.152.
 */
public final class Mk3 {
    public static final aG2 a(Vo0 vo0, int n3, dr3 object, Tl3 tl3, boolean bl2, int n4) {
        float f5;
        aG2 aG22;
        if (tl3 != null) {
            object = ((dr3)object).b;
            n3 = object.b(n3);
            aG22 = tl3.c(n3);
        } else {
            aG22 = aG2.e;
        }
        float f6 = Zj3.a;
        int n7 = vo0.e0(f6);
        f6 = aG22.a;
        if (bl2) {
            f5 = (float)n4 - f6;
            float f7 = n7;
            f5 -= f7;
        } else {
            f5 = f6;
        }
        float f8 = bl2 ? (float)n4 - f6 : (float)n7 + f6;
        float f11 = aG22.b;
        float f12 = aG22.d;
        object = new aG2(f5, f11, f8, f12);
        return object;
    }
}

