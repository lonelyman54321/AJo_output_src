/*
 * Decompiled with CFR 0.152.
 */
public final class QP2 {
    public static final boolean a(NP2 nP2) {
        float f5;
        float f6;
        float f7;
        boolean bl2;
        float f8;
        float f11;
        float f12;
        long l2;
        float f14;
        float f15;
        long l3;
        float f16;
        long l4 = nP2.e;
        float f17 = r90_0.b(l4);
        float f18 = f17 - (f16 = r90_0.c(l3 = nP2.e));
        float f19 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
        if (f19 == false && (f19 = (f15 = (f17 = r90_0.b(l3)) - (f14 = r90_0.b(l2 = nP2.f))) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1)) == false && (f19 = (f12 = (f17 = r90_0.b(l3)) - (f16 = r90_0.c(l2))) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) == false && (f19 = (f11 = (f17 = r90_0.b(l3)) - (f14 = r90_0.b(l2 = nP2.g))) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) == false && (f19 = (f8 = (f17 = r90_0.b(l3)) - (f16 = r90_0.c(l2))) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) == false && !(bl2 = (f7 = (f17 = r90_0.b(l3)) - (f6 = r90_0.b(l2 = nP2.h))) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) && !(bl2 = (f5 = (f6 = r90_0.b(l3)) - (f17 = r90_0.c(l2))) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) {
            bl2 = true;
            f6 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f6 = 0.0f;
            nP2 = null;
        }
        return bl2;
    }
}

