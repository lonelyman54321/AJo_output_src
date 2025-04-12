/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 */
import android.text.Layout;

public final class LF3$d {
    public long a;
    public long b;
    public CharSequence c;
    public int d;
    public float e;
    public int f;
    public int g;
    public float h;
    public int i;
    public float j;
    public int k;

    public LF3$d() {
        int n3;
        float f5;
        long l2;
        this.a = l2 = 0L;
        this.b = l2;
        this.d = 2;
        this.e = f5 = -3.4028235E38f;
        this.f = 1;
        this.g = 0;
        this.h = f5;
        this.i = n3 = -1 << -1;
        this.j = 1.0f;
        this.k = n3;
    }

    /*
     * Unable to fully structure code
     */
    public final Pe0$a a() {
        block28: {
            block26: {
                block27: {
                    block24: {
                        block25: {
                            var1_1 = this.h;
                            var2_2 = 0;
                            var3_3 = 0.0f;
                            var4_4 = null;
                            var5_5 = 0x3F000000;
                            var6_6 = 0.5f;
                            var7_7 = 1.0f;
                            var8_8 = 5;
                            var9_9 = 7.0E-45f;
                            var10_10 = 4;
                            var11_11 = -3.4028235E38f;
                            cfr_temp_0 = var1_1 - var11_11;
                            var12_12 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                            if (var12_12 == false) {
                                var13_13 = this.d;
                                if (var13_13 != var10_10) {
                                    if (var13_13 != var8_8) {
                                        var13_13 = 0x3F000000;
                                        var1_1 = 0.5f;
                                    } else {
                                        var13_13 = 1065353216;
                                        var1_1 = 1.0f;
                                    }
                                } else {
                                    var13_13 = 0;
                                    var1_1 = 0.0f;
                                    var14_14 = null;
                                }
                            }
                            var12_12 = this.i;
                            var15_15 = -1 << -1;
                            var16_16 = 3;
                            var17_17 = 2;
                            var18_18 = 1;
                            if (var12_12 != var15_15) break block24;
                            var12_12 = this.d;
                            if (var12_12 == var18_18) break block25;
                            if (var12_12 == var16_16) ** GOTO lbl-1000
                            if (var12_12 != var10_10) {
                                ** if (var12_12 == var8_8) goto lbl-1000
lbl-1000:
                                // 1 sources

                                {
                                    var12_12 = (float)true;
                                    ** GOTO lbl45
                                }
                            }
                            break block25;
lbl-1000:
                            // 2 sources

                            {
                                var12_12 = 2;
                            }
                            break block24;
                        }
                        var12_12 = (float)false;
                    }
                    var19_19 = new Pe0$a();
                    var20_20 = this.d;
                    if (var20_20 == var18_18) break block26;
                    if (var20_20 == var17_17) break block27;
                    if (var20_20 == var16_16) ** GOTO lbl-1000
                    if (var20_20 != var10_10) {
                        ** if (var20_20 == var8_8) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            CS1.a((int)var20_20, (String)"Unknown textAlignment: ");
                            var8_8 = 0;
                            var9_9 = 0.0f;
                            var21_21 = null;
                            ** GOTO lbl66
                        }
                    }
                    break block26;
lbl-1000:
                    // 2 sources

                    {
                        var21_21 = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                    break block28;
                }
                var21_21 = Layout.Alignment.ALIGN_CENTER;
                break block28;
            }
            var21_21 = Layout.Alignment.ALIGN_NORMAL;
        }
        var19_19.c = var21_21;
        var9_9 = this.e;
        var10_10 = this.f;
        var16_16 = var9_9 == var11_11 ? 0 : (var9_9 > var11_11 ? 1 : -1);
        if (var16_16 != 0 && var10_10 == 0 && ((var2_2 = (cfr_temp_1 = var9_9 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1)) < 0 || (var2_2 = (int)(var9_9 == var7_7 ? 0 : (var9_9 > var7_7 ? 1 : -1))) > 0)) {
            while (true) {
                var11_11 = 1.0f;
                break;
            }
        } else if (var16_16 != 0) {
            var11_11 = var9_9;
        } else if (var10_10 == 0) ** continue;
        var19_19.e = var11_11;
        var19_19.f = var10_10;
        var19_19.g = var2_2 = this.g;
        var19_19.h = var1_1;
        var19_19.i = (int)var12_12;
        var3_3 = this.j;
        if (var12_12 != false) {
            if (var12_12 != var18_18) {
                if (var12_12 != var17_17) {
                    var4_4 = String.valueOf((int)var12_12);
                    var14_14 = new IllegalStateException(var4_4);
                    throw var14_14;
                }
            } else {
                var8_8 = 0x40000000;
                var9_9 = 2.0f;
                var5_5 = var1_1 == var6_6 ? 0 : (var1_1 < var6_6 ? -1 : 1);
                if (var5_5 <= 0) {
                    var1_1 *= var9_9;
                } else {
                    var7_7 -= var1_1;
                    var1_1 = var7_7 * var9_9;
                }
            }
        } else {
            var1_1 = var7_7 - var1_1;
        }
        var19_19.l = var1_1 = Math.min(var3_3, var1_1);
        var19_19.p = var13_13 = this.k;
        var14_14 = this.c;
        if (var14_14 != null) {
            var19_19.a = var14_14;
        }
        return var19_19;
    }
}

