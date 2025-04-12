/*
 * Decompiled with CFR 0.152.
 */
public final class Ks0 {
    public static final boolean a(Es0 object, long l2) {
        LP1$c lP1$c = object.e();
        int n3 = lP1$c.m;
        boolean bl2 = false;
        if (n3 != 0) {
            object = go0.f((fo0)object).y.b;
            lP1$c = ((Fh1)object).P;
            n3 = lP1$c.m;
            if (n3 != 0) {
                float f5;
                float f6;
                long l3 = ((Ns2)object).c;
                n3 = (int)(l3 >> 32);
                int n4 = (int)(l3 &= 0xFFFFFFFFL);
                long l4 = ((w32_0)object).a0(0L);
                float f7 = e72.d(l4);
                float f8 = e72.e(l4);
                float f11 = (float)n3 + f7;
                float f12 = (float)n4 + f8;
                float f14 = e72.d(l2);
                float f15 = f7 - f14;
                float f16 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                if (f16 <= 0 && (f16 = f14 == f11 ? 0 : (f14 < f11 ? -1 : 1)) <= 0 && (f6 = (f5 = f8 - (f7 = e72.e(l2))) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) <= 0 && (f16 = f7 == f12 ? 0 : (f7 < f12 ? -1 : 1)) <= 0) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }
}

