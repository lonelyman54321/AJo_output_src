/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 */
package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import java.util.ArrayList;
import java.util.HashMap;

public class MotionEffect
extends MotionHelper {
    public float n = 0.1f;
    public int o = 49;
    public int p = 50;
    public int q = 0;
    public int r = 0;
    public boolean s = true;
    public int t;
    public int u;

    public MotionEffect(Context context) {
        super(context);
        int n3;
        this.t = n3 = -1;
        this.u = n3;
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        this.t = n3 = -1;
        this.u = n3;
        this.s(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.t = n3 = -1;
        this.u = n3;
        this.s(context, attributeSet);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void r(MotionLayout var1_1, HashMap var2_2) {
        var3_3 /* !! */  = this;
        var4_4 = var2_2;
        var5_5 = (View[])this.getParent();
        if ((var5_5 = this.j((ConstraintLayout)var5_5)) == null) {
            oi0_0.a();
            return;
        }
        var6_6 = new sn1_0();
        var7_7 = new sn1_0();
        var8_8 = Float.valueOf(this.n);
        var9_9 = "alpha";
        var6_6.h(var8_8, (String)var9_9);
        var10_10 = this.n;
        var8_8 = Float.valueOf(var10_10);
        var7_7.h(var8_8, (String)var9_9);
        var6_6.a = var11_11 = this.o;
        var7_7.a = var11_11 = this.p;
        var8_8 = new no1_0();
        var8_8.a = var12_12 /* !! */  = this.o;
        var12_12 /* !! */  = 0;
        var13_13 = 0.0f;
        var9_9 = null;
        var8_8.o = 0;
        var14_14 = 0;
        var15_15 = "percentX";
        var8_8.h(var14_14, (String)var15_15);
        var14_14 = 0;
        var16_16 = "percentY";
        var8_8.h(var14_14, (String)var16_16);
        var14_14 = new no1_0();
        var14_14.a = var17_17 /* !! */  = this.p;
        var14_14.o = 0;
        var17_17 /* !! */  = 1;
        var18_18 = 1.4E-45f;
        var19_19 = var17_17 /* !! */ ;
        var14_14.h(var19_19, (String)var15_15);
        var15_15 = var17_17 /* !! */ ;
        var14_14.h(var15_15, (String)var16_16);
        var20_20 = this.q;
        var16_16 = null;
        if (var20_20 > 0) {
            var15_15 = new sn1_0();
            var19_19 = new sn1_0();
            var21_21 = this.q;
            var22_22 = "translationX";
            var15_15.h(var21_21, (String)var22_22);
            var15_15.a = var23_23 = this.p;
            var21_21 = 0;
            var19_19.h(var21_21, (String)var22_22);
            var19_19.a = var23_23 = this.p - var17_17 /* !! */ ;
        } else {
            var20_20 = 0;
            var15_15 = null;
            var19_19 = null;
        }
        var23_23 = var3_3 /* !! */ .r;
        if (var23_23 > 0) {
            var16_16 = new sn1_0();
            var21_21 = new sn1_0();
            var22_22 = var3_3 /* !! */ .r;
            var24_24 = "translationY";
            var16_16.h(var22_22, (String)var24_24);
            var16_16.a = var25_25 = var3_3 /* !! */ .p;
            var22_22 = 0;
            var21_21.h(var22_22, (String)var24_24);
            var21_21.a = var25_25 = var3_3 /* !! */ .p - var17_17 /* !! */ ;
        } else {
            var23_23 = 0;
            var21_21 = null;
            var26_26 = 0.0f;
        }
        var25_25 = var3_3 /* !! */ .u;
        var27_27 = -1;
        var28_28 = 0.0f / 0.0f;
        if (var25_25 == var27_27) {
            var24_24 = new int[4];
            var22_22 = null;
            for (var25_25 = 0; var25_25 < (var29_29 /* !! */  = var5_5.length); ++var25_25) {
                var30_30 = var5_5[var25_25];
                if ((var30_30 = (fQ1)var4_4.get(var30_30)) == null) {
                    var31_31 = var21_21;
                } else {
                    var9_9 = var30_30.g;
                    var18_18 = var9_9.e;
                    var30_30 = var30_30.f;
                    var31_31 = var21_21;
                    var26_26 = var30_30.e;
                    var18_18 -= var26_26;
                    var13_13 = var9_9.f;
                    var26_26 = var30_30.f;
                    cfr_temp_0 = (var13_13 -= var26_26) - 0.0f;
                    var23_23 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                    if (var23_23 < 0) {
                        var23_23 = 1;
                        var26_26 = 1.4E-45f;
                        var29_29 /* !! */  = (int)(var24_24[var23_23] + var23_23);
                        var24_24[var23_23] = var29_29 /* !! */ ;
                    } else {
                        var23_23 = 1;
                        var26_26 = 1.4E-45f;
                    }
                    var12_12 /* !! */  = (int)((cfr_temp_1 = var13_13 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                    if (var12_12 /* !! */  > 0) {
                        var12_12 /* !! */  = 0;
                        var13_13 = 0.0f;
                        var9_9 = null;
                        var29_29 /* !! */  = (int)(var24_24[0] + var23_23);
                        var24_24[0] = var29_29 /* !! */ ;
                    }
                    if ((var12_12 /* !! */  = (int)((cfr_temp_2 = var18_18 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) > 0) {
                        var12_12 /* !! */  = 3;
                        var13_13 = 4.2E-45f;
                        var29_29 /* !! */  = (int)(var24_24[var12_12 /* !! */ ] + var23_23);
                        var24_24[var12_12 /* !! */ ] = var29_29 /* !! */ ;
                    }
                    if ((var12_12 /* !! */  = (int)((cfr_temp_3 = var18_18 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1))) < 0) {
                        var12_12 /* !! */  = 2;
                        var13_13 = 2.8E-45f;
                        var17_17 /* !! */  = (int)(var24_24[var12_12 /* !! */ ] + var23_23);
                        var24_24[var12_12 /* !! */ ] = var17_17 /* !! */ ;
                    }
                }
                var21_21 = var31_31;
                var12_12 /* !! */  = 0;
                var13_13 = 0.0f;
                var9_9 = null;
                var17_17 /* !! */  = 1;
                var18_18 = 1.4E-45f;
            }
            var31_31 = var21_21;
            var17_17 /* !! */  = (int)var24_24[0];
            var26_26 = 1.4E-45f;
            var25_25 = 0;
            var22_22 = null;
            var29_29 /* !! */  = 4;
            for (var23_23 = 1; var23_23 < var29_29 /* !! */ ; ++var23_23) {
                var12_12 /* !! */  = (int)var24_24[var23_23];
                if (var17_17 /* !! */  < var12_12 /* !! */ ) {
                    var17_17 /* !! */  = var12_12 /* !! */ ;
                    var25_25 = var23_23;
                }
                var12_12 /* !! */  = 0;
                var13_13 = 0.0f;
                var9_9 = null;
            }
        } else {
            var31_31 = var21_21;
        }
        var13_13 = 0.0f;
        var9_9 = null;
        for (var12_12 /* !! */  = 0; var12_12 /* !! */  < (var17_17 /* !! */  = var5_5.length); ++var12_12 /* !! */ ) {
            block32: {
                block33: {
                    block35: {
                        block36: {
                            block34: {
                                var32_32 = var5_5[var12_12 /* !! */ ];
                                if ((var32_32 = (fQ1)var4_4.get(var32_32)) == null) lbl-1000:
                                // 4 sources

                                {
                                    while (true) {
                                        var21_21 = var1_1;
                                        var33_33 /* !! */  = var5_5;
                                        var24_24 = var31_31;
lbl148:
                                        // 2 sources

                                        while (true) {
                                            var34_34 = -1;
                                            break block32;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                var21_21 = var32_32.g;
                                var28_28 = var21_21.e;
                                var30_30 = var32_32.f;
                                var35_35 = var30_30.e;
                                var28_28 -= var35_35;
                                var35_35 = var21_21.f;
                                var26_26 = var30_30.f;
                                var35_35 -= var26_26;
                                if (var25_25 != 0) break block34;
                                cfr_temp_4 = var35_35 - 0.0f;
                                var36_36 /* !! */  = (float)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                                if (var36_36 /* !! */  <= 0 || (var36_36 /* !! */  = (float)var3_3 /* !! */ .s) != false && (var36_36 /* !! */  = (cfr_temp_5 = var28_28 - 0.0f) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1)) != false) {
                                    while (true) {
                                        var23_23 = 3;
                                        var26_26 = 4.2E-45f;
                                        var29_29 /* !! */  = 2;
                                        break block33;
                                        break;
                                    }
                                }
lbl168:
                                // 3 sources

                                while (true) {
                                    var23_23 = 3;
                                    var26_26 = 4.2E-45f;
                                    var29_29 /* !! */  = 2;
                                    ** GOTO lbl-1000
                                    break;
                                }
                            }
                            var23_23 = 1;
                            var26_26 = 1.4E-45f;
                            if (var25_25 == var23_23) {
                                if ((var36_36 /* !! */  = (cfr_temp_6 = var35_35 - 0.0f) == 0.0f ? 0 : (cfr_temp_6 < 0.0f ? -1 : 1)) >= 0 || (var36_36 /* !! */  = (float)var3_3 /* !! */ .s) != false && (var36_36 /* !! */  = (cfr_temp_7 = var28_28 - 0.0f) == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1)) != false) ** continue;
                                ** continue;
                            }
                            var29_29 /* !! */  = 2;
                            if (var25_25 != var29_29 /* !! */ ) break block35;
                            cfr_temp_8 = var28_28 - 0.0f;
                            var27_27 = (int)(cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 < 0.0f ? -1 : 1));
                            if (var27_27 < 0 && ((var27_27 = (int)var3_3 /* !! */ .s) == 0 || (var36_36 /* !! */  = (cfr_temp_9 = var35_35 - 0.0f) == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1)) == false)) break block36;
                            var23_23 = 3;
                            var26_26 = 4.2E-45f;
                            break block33;
                        }
                        var23_23 = 3;
                        var26_26 = 4.2E-45f;
                        ** GOTO lbl-1000
                    }
                    var23_23 = 3;
                    var26_26 = 4.2E-45f;
                    if (var25_25 != var23_23 || (var27_27 = (int)((cfr_temp_10 = var28_28 - 0.0f) == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1))) <= 0 || (var27_27 = (int)var3_3 /* !! */ .s) != 0 && (var36_36 /* !! */  = (cfr_temp_11 = var35_35 - 0.0f) == 0.0f ? 0 : (cfr_temp_11 > 0.0f ? 1 : -1)) != false) ** break;
                    ** continue;
                }
                var36_36 /* !! */  = var3_3 /* !! */ .t;
                var27_27 = -1;
                var28_28 = 0.0f / 0.0f;
                if (var36_36 /* !! */  == var27_27) {
                    var32_32.a(var6_6);
                    var32_32.a(var7_7);
                    var32_32.a((Pn1)var8_8);
                    var32_32.a((Pn1)var14_14);
                    var36_36 /* !! */  = var3_3 /* !! */ .q;
                    if (var36_36 /* !! */  > 0) {
                        var32_32.a((Pn1)var15_15);
                        var32_32.a((Pn1)var19_19);
                    }
                    if ((var36_36 /* !! */  = (float)var3_3 /* !! */ .r) > 0) {
                        var32_32.a((Pn1)var16_16);
                        var24_24 = var31_31;
                        var32_32.a((Pn1)var31_31);
lbl213:
                        // 2 sources

                        while (true) {
                            var21_21 = var1_1;
lbl215:
                            // 3 sources

                            while (true) {
                                var33_33 /* !! */  = var5_5;
                                ** continue;
                                break;
                            }
                            break;
                        }
                    }
                    var24_24 = var31_31;
                    ** continue;
                }
                var21_21 = var1_1;
                var24_24 = var31_31;
                var30_30 = var1_1.a;
                if (var30_30 == null) ** GOTO lbl215
                var30_30 = var30_30.q.b.iterator();
                while (true) {
                    if (var37_37 = var30_30.hasNext()) ** break;
                    ** continue;
                    var3_3 /* !! */  = var33_33 /* !! */  = var30_30.next();
                    var3_3 /* !! */  = (c)var33_33 /* !! */ ;
                    var33_33 /* !! */  = var5_5;
                    var34_34 = var3_3 /* !! */ .a;
                    if (var34_34 == var36_36 /* !! */ ) {
                        var3_3 /* !! */  = var3_3 /* !! */ .f;
                        var34_34 = -1;
                        var4_4 = Integer.valueOf(var34_34);
                        var3_3 /* !! */  = (ArrayList)var3_3 /* !! */ .a.get(var4_4);
                        if (var3_3 /* !! */  == null) break;
                        var4_4 = var32_32.w;
                        var4_4.addAll(var3_3 /* !! */ );
                        break;
                    }
                    var3_3 /* !! */  = this;
                }
            }
            var3_3 /* !! */  = this;
            var4_4 = var2_2;
            var31_31 = var24_24;
            var5_5 = var33_33 /* !! */ ;
        }
    }

    public final void s(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            int[] nArray = R$styleable.MotionEffect;
            context = context.obtainStyledAttributes(attributeSet, nArray);
            int n3 = context.getIndexCount();
            int n4 = 0;
            nArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                int n7 = context.getIndex(i3);
                int n8 = R$styleable.MotionEffect_motionEffect_start;
                int n10 = 99;
                if (n7 == n8) {
                    n8 = this.o;
                    this.o = n7 = context.getInt(n7, n8);
                    this.o = n7 = Math.max(Math.min(n7, n10), 0);
                    continue;
                }
                n8 = R$styleable.MotionEffect_motionEffect_end;
                if (n7 == n8) {
                    n8 = this.p;
                    this.p = n7 = context.getInt(n7, n8);
                    this.p = n7 = Math.max(Math.min(n7, n10), 0);
                    continue;
                }
                n8 = R$styleable.MotionEffect_motionEffect_translationX;
                if (n7 == n8) {
                    n8 = this.q;
                    this.q = n7 = context.getDimensionPixelOffset(n7, n8);
                    continue;
                }
                n8 = R$styleable.MotionEffect_motionEffect_translationY;
                if (n7 == n8) {
                    n8 = this.r;
                    this.r = n7 = context.getDimensionPixelOffset(n7, n8);
                    continue;
                }
                n8 = R$styleable.MotionEffect_motionEffect_alpha;
                if (n7 == n8) {
                    float f5;
                    float f6 = this.n;
                    this.n = f5 = context.getFloat(n7, f6);
                    continue;
                }
                n8 = R$styleable.MotionEffect_motionEffect_move;
                if (n7 == n8) {
                    n8 = this.u;
                    this.u = n7 = context.getInt(n7, n8);
                    continue;
                }
                n8 = R$styleable.MotionEffect_motionEffect_strict;
                if (n7 == n8) {
                    n8 = (int)(this.s ? 1 : 0);
                    n7 = (int)(context.getBoolean(n7, n8 != 0) ? 1 : 0);
                    this.s = n7;
                    continue;
                }
                n8 = R$styleable.MotionEffect_motionEffect_viewTransition;
                if (n7 != n8) continue;
                n8 = this.t;
                this.t = n7 = context.getResourceId(n7, n8);
            }
            n3 = this.o;
            n4 = this.p;
            if (n3 == n4) {
                if (n3 > 0) {
                    this.o = n3 += -1;
                } else {
                    this.p = ++n4;
                }
            }
            context.recycle();
        }
    }
}

