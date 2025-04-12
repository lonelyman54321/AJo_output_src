/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 */
import android.graphics.Point;
import com.google.common.collect.ImmutableList;

/*
 * Renamed from un0
 */
public final class un0_1
implements zn0$h$a {
    public final /* synthetic */ zn0$d a;
    public final /* synthetic */ int[] b;

    public /* synthetic */ un0_1(zn0$d zn0$d, int[] nArray) {
        this.a = zn0$d;
        this.b = nArray;
    }

    /*
     * Unable to fully structure code
     */
    public final ImmutableList a(int var1_1, qp3 var2_2, int[] var3_3) {
        block11: {
            block10: {
                var4_4 = var2_2;
                var5_5 = this.b;
                var6_6 = var5_5[var1_1];
                var7_7 = this.a;
                var8_8 = var7_7.i;
                var9_9 = -1 >>> 1;
                if (var8_8 == var9_9 || (var10_10 = var7_7.j) == var9_9) break block10;
                var12_12 = -1 >>> 1;
                for (var11_11 = 0; var11_11 < (var13_13 = var4_4.a); ++var11_11) {
                    var14_14 = var4_4.d[var11_11];
                    var15_15 = var14_14.v;
                    if (var15_15 <= 0 || (var16_16 = var14_14.w) <= 0) continue;
                    var17_17 = var7_7.k;
                    if (var17_17 == 0) ** GOTO lbl-1000
                    if (var15_15 > var16_16) {
                        var17_17 = 1;
                    } else {
                        var17_17 = 0;
                        var18_18 = null;
                    }
                    var19_19 = var8_8 > var10_10 ? 1 : 0;
                    if (var17_17 != var19_19) {
                        var17_17 = var8_8;
                        var19_19 = var10_10;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var19_19 = var8_8;
                        var17_17 = var10_10;
                    }
                    var20_20 = var15_15 * var17_17;
                    var21_21 = var16_16 * var19_19;
                    if (var20_20 >= var21_21) {
                        var15_15 = gz3.e(var21_21, var15_15);
                        var18_18 = new Point(var19_19, var15_15);
                    } else {
                        var20_20 = gz3.e(var20_20, var16_16);
                        var18_18 = var22_22 = new Point(var20_20, var17_17);
                    }
                    var13_13 = var14_14.v;
                    var15_15 = var13_13 * var16_16;
                    var23_23 = var18_18.x;
                    var21_21 = 1065017672;
                    var24_24 = 0.98f;
                    var20_20 = (int)(var23_23 *= var24_24);
                    if (var13_13 < var20_20 || var16_16 < (var13_13 = (int)(var25_25 = (float)var18_18.y * var24_24)) || var15_15 >= var12_12) continue;
                    var12_12 = var15_15;
                }
                var20_20 = var12_12;
                break block11;
            }
            var20_20 = -1 >>> 1;
            var23_23 = 0.0f / 0.0f;
        }
        var26_26 = ImmutableList.builder();
        for (var19_19 = 0; var19_19 < (var8_8 = var4_4.a); ++var19_19) {
            var5_5 = var4_4.d[var19_19];
            var8_8 = var5_5.b();
            if (var20_20 != var9_9 && (var8_8 == (var10_10 = -1) || var8_8 > var20_20)) {
                var17_17 = 0;
                var18_18 = null;
            } else {
                var17_17 = 1;
            }
            var15_15 = var3_3[var19_19];
            var5_5 = var27_27;
            var10_10 = var1_1;
            var12_12 = var19_19;
            var14_14 = var7_7;
            var16_16 = var6_6;
            var27_27 = new zn0$i(var1_1, var2_2, var19_19, var7_7, var15_15, var6_6, (boolean)var17_17);
            var26_26.add(var27_27);
            var9_9 = -1 >>> 1;
        }
        return var26_26.build();
    }
}

