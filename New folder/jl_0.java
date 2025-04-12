/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Jl
 */
public final class jl_0 {
    public static il_0 a(float f5, float f6, int n3) {
        if ((n3 &= 2) != 0) {
            f6 = 0.0f;
        }
        Ws3 ws3 = ya3_0.a;
        Float f7 = Float.valueOf(f5);
        kl_1 kl_12 = new kl_1(f6);
        il_0 il_02 = new il_0(ws3, f7, kl_12, Long.MIN_VALUE, Long.MIN_VALUE, false);
        return il_02;
    }

    public static il_0 b(il_0 il_02, float f5, float f6, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            Number number = (Number)il_02.b.getValue();
            f5 = number.floatValue();
        }
        if ((n3 &= 2) != 0) {
            kl_1 kl_12 = (kl_1)il_02.c;
            f6 = kl_12.a;
        }
        long l2 = il_02.d;
        long l3 = il_02.e;
        boolean bl2 = il_02.f;
        Vs3 vs3 = il_02.a;
        Float f7 = Float.valueOf(f5);
        kl_1 kl_13 = new kl_1(f6);
        il_0 il_03 = new il_0(vs3, f7, kl_13, l2, l3, bl2);
        return il_03;
    }
}

