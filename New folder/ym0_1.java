/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;
import java.io.IOException;

/*
 * Renamed from ym0
 */
public final class ym0_1
implements q72 {
    public final p72 a;
    public final long b;
    public final long c;
    public final zd3_0 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public ym0_1(zd3_0 object, long l2, long l3, long l4, long l7, boolean bl2) {
        int n3;
        long l8 = 0L;
        long l12 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
        n3 = l12 >= 0 && (n3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) > 0 ? 1 : 0;
        ct3.a(n3 != 0);
        this.d = object;
        this.b = l2;
        this.c = l3;
        long l14 = l4 - (l3 -= l2);
        long l15 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (l15 != false && !bl2) {
            this.e = 0;
        } else {
            this.f = l7;
            l15 = 4;
            this.e = (int)l15;
        }
        this.a = object = new p72();
    }

    /*
     * Unable to fully structure code
     */
    public final long a(il0_0 var1_1) {
        block20: {
            block21: {
                block22: {
                    block24: {
                        block19: {
                            block23: {
                                var2_2 = this;
                                var3_3 = var1_1;
                                var4_4 = this.e;
                                var5_5 = 0L;
                                var7_6 = -1;
                                var9_7 = this.c;
                                var11_8 = this.a;
                                var12_9 = 1;
                                var13_10 = 4;
                                if (var4_4 == 0) break block21;
                                if (var4_4 == var12_9) break block22;
                                var14_11 = 2;
                                var15_12 = 3;
                                if (var4_4 == var14_11) break block23;
                                if (var4_4 != var15_12) {
                                    if (var4_4 == var13_10) {
                                        return var7_6;
                                    }
                                    var3_3 = new IllegalStateException();
                                    throw var3_3;
                                }
                                var16_13 = var7_6;
                                var18_15 = var11_8;
                                break block24;
                            }
                            var19_16 = this.i;
                            var7_6 = this.j;
                            cfr_temp_0 = var19_16 - var7_6;
                            var4_4 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var4_4 == 0) {
                                while (true) {
                                    var18_15 = var11_8;
                                    var16_13 = -1;
                                    var21_20 = -1;
                                    break block19;
                                    break;
                                }
                            }
                            var19_16 = var1_1.d;
                            var4_4 = (int)var11_8.b(var1_1, var7_6);
                            if (var4_4 != 0) ** GOTO lbl49
                            var16_13 = this.i;
                            cfr_temp_1 = var16_13 - var19_16;
                            var23_21 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                            if (var23_21 != 0) {
                                var21_20 = var16_13;
lbl42:
                                // 2 sources

                                while (true) {
                                    var18_15 = var11_8;
lbl44:
                                    // 2 sources

                                    while (true) {
                                        var16_13 = -1;
                                        ** GOTO lbl94
                                        break;
                                    }
                                    break;
                                }
                            } else {
                                var3_3 = new IOException("No ogg page can be found.");
                                throw var3_3;
lbl49:
                                // 1 sources

                                var11_8.a(var1_1, false);
                                var1_1.f = 0;
                                var7_6 = this.h;
                                var24_18 = var11_8.b;
                                var12_9 = var11_8.d;
                                var4_4 = var11_8.e;
                                var12_9 += var4_4;
                                cfr_temp_2 = var5_5 - (var7_6 -= var24_18);
                                var4_4 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                if (var4_4 <= 0 && (var4_4 = (int)((cfr_temp_3 = var7_6 - (var26_19 = 72000L)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) < 0) ** continue;
                                var4_4 = (int)(var7_6 == var5_5 ? 0 : (var7_6 < var5_5 ? -1 : 1));
                                if (var4_4 < 0) {
                                    var2_2.j = var19_16;
                                    var2_2.l = var24_18;
                                } else {
                                    var5_5 = var3_3.d;
                                    var19_16 = var12_9;
                                    var2_2.i = var5_5 += var19_16;
                                    var2_2.k = var24_18;
                                }
                                var5_5 = var2_2.j;
                                var24_18 = var2_2.i;
                                var19_16 = var5_5 - var24_18;
                                var26_19 = 100000L;
                                var28_23 = var19_16 == var26_19 ? 0 : (var19_16 < var26_19 ? -1 : 1);
                                if (var28_23 < 0) {
                                    var2_2.j = var24_18;
                                    var21_20 = var24_18;
                                    ** continue;
                                }
                                var19_16 = var12_9;
                                var26_19 = 1L;
                                var29_25 = var4_4 <= 0 ? (long)2 : var26_19;
                                var18_15 = var11_8;
                                var31_26 = var3_3.d - (var19_16 *= var29_25);
                                var19_16 = (var5_5 - var24_18) * var7_6;
                                var7_6 = var2_2.l;
                                var29_25 = var5_5;
                                var16_13 = var2_2.k;
                                var19_16 /= (var7_6 -= var16_13);
                                var16_13 = var19_16 + var31_26;
                                var33_24 = var5_5 - var26_19;
                                var26_19 = var16_13;
                                var29_25 = var24_18;
                                var21_20 = var16_13 = gz3.i(var16_13, var24_18, var33_24);
                                ** continue;
                            }
                        }
                        var35_27 = var21_20 == var16_13 ? 0 : (var21_20 < var16_13 ? -1 : 1);
                        if (var35_27 != false) {
                            return var21_20;
                        }
                        var2_2.e = var23_21 = 3;
                    }
                    var36_28 = var18_15;
                    while (true) {
                        var36_28.b((il0_0)var3_3, var16_13);
                        var4_4 = 0;
                        var36_28.a((il0_0)var3_3, false);
                        var5_5 = var36_28.b;
                        var37_30 = var2_2.h;
                        var14_11 = (int)(var5_5 == var37_30 ? 0 : (var5_5 < var37_30 ? -1 : 1));
                        if (var14_11 > 0) {
                            var3_3.f = 0;
                            var2_2.e = var13_10;
                            return -(var2_2.k + (long)2);
                        }
                        var37_30 = 2;
                        var39_32 = var36_28.d;
                        var23_21 = var36_28.e;
                        var3_3.j(var39_32 += var23_21);
                        var2_2.i = var5_5 = var3_3.d;
                        var2_2.k = var5_5 = var36_28.b;
                        var16_13 = -1;
                    }
                }
                var36_29 = var11_8;
lbl124:
                // 2 sources

                while (true) {
                    break block20;
                    break;
                }
            }
            var36_29 = var11_8;
            this.g = var37_31 = var1_1.d;
            this.e = var12_9;
            ** while ((var40_34 = (cfr_temp_4 = (var19_17 = var9_7 - 65307L) - var37_31) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) <= 0)
lbl131:
            // 1 sources

            return var19_17;
        }
        var4_4 = 0;
        var36_29.a = 0;
        var36_29.b = var5_5;
        var36_29.c = 0;
        var36_29.d = 0;
        var36_29.e = 0;
        var5_5 = -1;
        var41_35 = var36_29.b((il0_0)var3_3, var5_5);
        if (var41_35) {
            var36_29.a((il0_0)var3_3, false);
            var4_4 = var36_29.d;
            var39_33 = var36_29.e;
            var3_3.j(var4_4 += var39_33);
            var16_14 = var36_29.b;
            while ((var23_22 = var36_29.a & var13_10) != var13_10 && (var23_22 = (int)var36_29.b((il0_0)var3_3, var37_31 = (long)-1)) != 0 && (var23_22 = (int)((cfr_temp_5 = (var19_17 = var3_3.d) - var9_7) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1))) < 0 && (var23_22 = (int)var36_29.a((il0_0)var3_3, (boolean)var12_9)) != 0) {
                var23_22 = var36_29.d;
                var40_34 = var36_29.e;
                var23_22 += var40_34;
                try {
                    var3_3.j(var23_22);
                    var16_14 = var36_29.b;
                    continue;
                }
                catch (EOFException v0) {}
                break;
            }
            var2_2.f = var16_14;
            var2_2.e = var13_10;
            return var2_2.g;
        }
        var3_3 = new EOFException();
        throw var3_3;
    }

    public final dx2_1 b() {
        long l2 = this.f;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        ym0$a ym0$a = object != false ? new ym0$a(this) : null;
        return ym0$a;
    }

    public final void c(long l2) {
        long l3 = this.f - 1L;
        this.h = l2 = gz3.i(l2, 0L, l3);
        this.e = 2;
        this.i = l2 = this.b;
        this.j = l2 = this.c;
        this.k = 0L;
        this.l = l2 = this.f;
    }
}

