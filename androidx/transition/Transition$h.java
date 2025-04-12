/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.AnimationUtils
 */
package androidx.transition;

import android.view.animation.AnimationUtils;
import androidx.dynamicanimation.animation.b$r;
import androidx.dynamicanimation.animation.c;
import androidx.dynamicanimation.animation.d;
import androidx.transition.Transition;
import androidx.transition.e;
import androidx.transition.f;
import java.util.Arrays;

public final class Transition$h
extends f
implements Lr3,
b$r {
    public long a = -1;
    public boolean b;
    public boolean c;
    public c d;
    public final aB3 e;
    public Runnable f;
    public final /* synthetic */ Transition g;

    public Transition$h(Transition object) {
        this.g = object;
        object = new Object();
        int n3 = 20;
        long[] lArray = new long[n3];
        ((aB3)object).a = lArray;
        float[] fArray = new float[n3];
        ((aB3)object).b = fArray;
        ((aB3)object).c = 0;
        Arrays.fill(lArray, Long.MIN_VALUE);
        this.e = object;
    }

    public final long a() {
        return this.g.getTotalDurationMillis();
    }

    public final void b() {
        this.g();
        c c2 = this.d;
        float f5 = this.g.getTotalDurationMillis() + 1L;
        c2.d(f5);
    }

    public final boolean c() {
        return this.b;
    }

    public final void d(gn0_0 gn0_02) {
        this.f = gn0_02;
        this.g();
        this.d.d(0.0f);
    }

    public final void e(long l2) {
        c c2 = this.d;
        if (c2 == null) {
            long l3 = this.a;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object != false && (object = (Object)this.b) != false) {
                object = this.c;
                if (object == false) {
                    Object object2;
                    Transition transition2 = this.g;
                    long l7 = 0L;
                    long l8 = l2 - l7;
                    Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (object3 == false && (object3 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1)) > 0) {
                        l2 = -1;
                    } else {
                        long l12;
                        l3 = transition2.getTotalDurationMillis();
                        long l14 = l2 - l3;
                        object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object2 == false && (object3 = (l12 = (l7 = this.a) - l3) == 0L ? 0 : (l12 < 0L ? -1 : 1)) < 0) {
                            l2 = 1L + l3;
                        }
                    }
                    l3 = this.a;
                    object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (object2 != false) {
                        transition2.setCurrentPlayTimeMillis(l2, l3);
                        this.a = l2;
                    }
                }
                l3 = AnimationUtils.currentAnimationTimeMillis();
                float f5 = l2;
                Object object4 = this.e;
                object = (((aB3)object4).c + 1) % 20;
                ((aB3)object4).c = (int)object;
                long[] lArray = ((aB3)object4).a;
                lArray[object] = l3;
                object4 = ((aB3)object4).b;
                object4[object] = f5;
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
        throw illegalStateException;
    }

    public final void f(float f5) {
        Transition transition2 = this.g;
        long l2 = transition2.getTotalDurationMillis() + 1L;
        long l3 = Math.round((double)f5);
        l2 = Math.min(l2, l3);
        l2 = Math.max((long)-1, l2);
        l3 = this.a;
        transition2.setCurrentPlayTimeMillis(l2, l3);
        this.a = l2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void g() {
        var1_1 = this;
        var2_2 = this.d;
        if (var2_2 != null) {
            return;
        }
        var3_3 = AnimationUtils.currentAnimationTimeMillis();
        var5_4 = this.a;
        var7_5 = var5_4;
        var8_6 = this.e;
        var9_7 = var8_6.c;
        var10_8 = 1;
        var11_9 = 1.4E-45f;
        var9_7 += var10_8;
        var12_10 = 20;
        var13_11 = 2.8E-44f;
        var8_6.c = var9_7 %= var12_10;
        var14_12 /* !! */  = var8_6.a;
        var14_12 /* !! */ [var9_7] = var3_3;
        var8_6.b[var9_7] = var7_5;
        var15_13 = new pS0();
        var2_2 = new c((pS0)var15_13);
        this.d = var2_2;
        var2_2 = new d();
        var2_2.a();
        var16_14 = 1128792064;
        var17_15 = 200.0f;
        var2_2.b(var17_15);
        var15_13 = this.d;
        var15_13.s = var2_2;
        var18_16 = this.a;
        var15_13.b = var20_17 = (float)var18_16;
        var15_13.c = var10_8;
        var21_18 = var15_13.f;
        if (!var21_18) {
            var2_2 = var15_13.l;
            var16_14 = (int)var2_2.contains(this);
            if (var16_14 == 0) {
                var2_2.add(this);
            }
            var2_2 = var1_1.d;
            var16_14 = var8_6.c;
            var22_19 = var8_6.a;
            var18_16 = -9223372036854775808L;
            var9_7 = 0;
            var23_20 = 0.0f;
            if (var16_14 != 0 || (var26_22 = (cfr_temp_0 = (var24_21 = var22_19[var16_14]) - var18_16) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != 0) {
                var24_21 = var22_19[var16_14];
                var26_22 = 0;
                var27_23 = 0.0f;
                var28_24 = var24_21;
                while ((var32_26 = (cfr_temp_1 = (var30_25 = var22_19[var16_14]) - var18_16) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) != false) {
                    var18_16 = var24_21 - var30_25;
                    var33_27 = var18_16;
                    var28_24 = Math.abs(var30_25 - var28_24);
                    var34_28 = var28_24;
                    var35_29 = 100.0f;
                    cfr_temp_2 = var33_27 - var35_29;
                    var36_30 /* !! */  = (float)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                    if (var36_30 /* !! */  > 0 || (var36_30 /* !! */  = (cfr_temp_3 = var34_28 - (var33_27 = 40.0f)) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1)) > 0) break;
                    if (var16_14 == 0) {
                        var16_14 = 20;
                        var17_15 = 2.8E-44f;
                    }
                    var16_14 -= var10_8;
                    if (++var26_22 >= var12_10) break;
                    var28_24 = var30_25;
                    var18_16 = -9223372036854775808L;
                }
                var16_14 = 2;
                var17_15 = 2.8E-45f;
                if (var26_22 >= var16_14) {
                    var14_12 /* !! */  = (long[])var8_6.b;
                    var34_28 = 1000.0f;
                    if (var26_22 == var16_14) {
                        var16_14 = var8_6.c;
                        if (var16_14 == 0) {
                            var37_31 = 19;
                            var38_33 = 2.7E-44f;
                        } else {
                            var37_31 = var16_14 + -1;
                        }
                        var39_35 = var22_19[var16_14];
                        var24_21 = var22_19[var37_31];
                        var7_5 = var39_35 -= var24_21;
                        cfr_temp_4 = var7_5 - 0.0f;
                        var10_8 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                        if (var10_8 != 0) {
                            var17_15 = var14_12 /* !! */ [var16_14];
                            var38_33 = var14_12 /* !! */ [var37_31];
                            var17_15 = (var17_15 - var38_33) / var7_5;
lbl88:
                            // 2 sources

                            while (true) {
                                var23_20 = var17_15 * var34_28;
                                break;
                            }
                        }
                    } else {
                        var16_14 = var8_6.c;
                        var37_32 = (var16_14 - var26_22 + 21) % var12_10;
                        var16_14 = (var16_14 + 21) % var12_10;
                        var24_21 = var22_19[var37_32];
                        var27_23 = var14_12 /* !! */ [var37_32];
                        var37_32 += var10_8;
                        var10_8 = var37_32 % 20;
                        var35_29 = 0.0f;
                        while (true) {
                            var41_37 = 2.0f;
                            if (var10_8 == var16_14) break;
                            var30_25 = var22_19[var10_8];
                            var42_38 /* !! */  = var14_12 /* !! */ ;
                            var43_39 = var30_25 - var24_21;
                            var13_11 = var43_39;
                            cfr_temp_5 = var13_11 - 0.0f;
                            var36_30 /* !! */  = (float)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1));
                            if (var36_30 /* !! */  == false) {
                                var9_7 = var10_8;
                            } else {
                                var33_27 = var14_12 /* !! */ [var10_8];
                                var45_40 = Math.signum(var35_29);
                                var46_41 = var45_40;
                                var48_42 = Math.abs(var35_29);
                                var49_43 = Math.sqrt(var41_37 *= var48_42) * var46_41;
                                var23_20 = (float)var49_43;
                                var11_9 = (var33_27 - var27_23) / var13_11;
                                var23_20 = var11_9 - var23_20;
                                var11_9 = Math.abs(var11_9) * var23_20 + var35_29;
                                var9_7 = var10_8;
                                if (var10_8 == var37_32) {
                                    var12_10 = 0x3F000000;
                                    var13_11 = 0.5f;
                                    var11_9 *= var13_11;
                                }
                                var35_29 = var11_9;
                                var27_23 = var33_27;
                                var24_21 = var30_25;
                            }
                            var10_8 = (var9_7 + 1) % 20;
                            var14_12 /* !! */  = var42_38 /* !! */ ;
                            var9_7 = 0;
                            var23_20 = 0.0f;
                            var12_10 = 20;
                            var13_11 = 2.8E-44f;
                        }
                        var51_44 = Math.signum(var35_29);
                        var38_34 = Math.abs(var35_29) * var41_37;
                        var53_36 = Math.sqrt(var38_34) * var51_44;
                        var17_15 = (float)var53_36;
                        ** continue;
                    }
                }
            }
            var2_2.a = var23_20;
            var2_2 = var1_1.d;
            var55_45 = var1_1.g.getTotalDurationMillis();
            var57_46 = 1L;
            var53_36 = 4.9E-324;
            var2_2.g = var17_15 = (float)(var55_45 += var57_46);
            var2_2 = var1_1.d;
            var2_2.h = -1.0f;
            var16_14 = 0x40800000;
            var2_2.j = var17_15 = 4.0f;
            var15_13 = new e(var1_1);
            var2_2 = var2_2.k;
            var59_47 = var2_2.contains(var15_13);
            if (!var59_47) {
                var2_2.add(var15_13);
            }
            return;
        }
        var2_2 = new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        throw var2_2;
    }

    public final void onTransitionCancel(Transition transition2) {
        this.c = true;
    }
}

