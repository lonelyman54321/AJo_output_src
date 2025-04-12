/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

public class CircularFlow
extends VirtualLayout {
    public static int v;
    public static float w;
    public ConstraintLayout l;
    public int m;
    public float[] n;
    public int[] o;
    public int p;
    public int q;
    public String r;
    public String s;
    public Float t;
    public Integer u;

    public CircularFlow(Context context) {
        super(context);
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    private void setAngles(String string2) {
        if (string2 == null) {
            return;
        }
        int n3 = 0;
        String string3 = null;
        this.q = 0;
        while (true) {
            int n4;
            int n7;
            if ((n7 = string2.indexOf(44, n3)) == (n4 = -1)) {
                string2 = string2.substring(n3).trim();
                this.s(string2);
                return;
            }
            string3 = string2.substring(n3, n7).trim();
            this.s(string3);
            n3 = n7 + 1;
        }
    }

    private void setRadius(String string2) {
        if (string2 == null) {
            return;
        }
        int n3 = 0;
        String string3 = null;
        this.p = 0;
        while (true) {
            int n4;
            int n7;
            if ((n7 = string2.indexOf(44, n3)) == (n4 = -1)) {
                string2 = string2.substring(n3).trim();
                this.t(string2);
                return;
            }
            string3 = string2.substring(n3, n7).trim();
            this.t(string3);
            n3 = n7 + 1;
        }
    }

    public float[] getAngles() {
        float[] fArray = this.n;
        int n3 = this.q;
        return Arrays.copyOf(fArray, n3);
    }

    public int[] getRadius() {
        int[] nArray = this.o;
        int n3 = this.p;
        return Arrays.copyOf(nArray, n3);
    }

    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            Context context = this.getContext();
            int[] nArray = R$styleable.ConstraintLayout_Layout;
            attributeSet = context.obtainStyledAttributes(attributeSet, nArray);
            int n3 = attributeSet.getIndexCount();
            nArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object;
                int n4;
                int n7 = attributeSet.getIndex(i3);
                if (n7 == (n4 = R$styleable.ConstraintLayout_Layout_circularflow_viewCenter)) {
                    this.m = n7 = attributeSet.getResourceId(n7, 0);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_circularflow_angles;
                if (n7 == n4) {
                    object = attributeSet.getString(n7);
                    this.r = object;
                    this.setAngles((String)object);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_circularflow_radiusInDP;
                if (n7 == n4) {
                    object = attributeSet.getString(n7);
                    this.s = object;
                    this.setRadius((String)object);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_circularflow_defaultAngle;
                if (n7 == n4) {
                    float f5 = w;
                    this.t = object = Float.valueOf(attributeSet.getFloat(n7, f5));
                    float f6 = ((Float)object).floatValue();
                    this.setDefaultAngle(f6);
                    continue;
                }
                n4 = R$styleable.ConstraintLayout_Layout_circularflow_defaultRadius;
                if (n7 != n4) continue;
                n4 = v;
                this.u = object = Integer.valueOf(attributeSet.getDimensionPixelSize(n7, n4));
                n7 = (Integer)object;
                this.setDefaultRadius(n7);
            }
            attributeSet.recycle();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        var1_1 /* !! */  = this.r;
        var2_2 = 1;
        if (var1_1 /* !! */  != null) {
            var3_3 = new float[var2_2];
            this.n = var3_3;
            this.setAngles((String)var1_1 /* !! */ );
        }
        if ((var1_1 /* !! */  = this.s) != null) {
            var3_3 = new int[var2_2];
            this.o = (int[])var3_3;
            this.setRadius((String)var1_1 /* !! */ );
        }
        if ((var1_1 /* !! */  = this.t) != null) {
            var4_4 = var1_1 /* !! */ .floatValue();
            this.setDefaultAngle(var4_4);
        }
        if ((var1_1 /* !! */  = this.u) != null) {
            var5_5 = var1_1 /* !! */ .intValue();
            this.setDefaultRadius(var5_5);
        }
        var1_1 /* !! */  = (ConstraintLayout)this.getParent();
        this.l = var1_1 /* !! */ ;
        var4_4 = 0.0f;
        var1_1 /* !! */  = null;
        for (var5_5 = 0; var5_5 < (var6_6 = this.b); ++var5_5) {
            block14: {
                block13: {
                    block12: {
                        block11: {
                            var3_3 = (Object)this.l;
                            var7_7 = this.a;
                            var8_8 /* !! */  = var7_7[var5_5];
                            if ((var3_3 = var3_3.getViewById(var8_8 /* !! */ )) == null) continue;
                            var8_8 /* !! */  = CircularFlow.v;
                            var9_9 /* !! */  = CircularFlow.w;
                            var10_10 /* !! */  = this.o;
                            var11_11 = this.i;
                            if (var10_10 /* !! */  == null || var5_5 >= (var12_12 = var10_10 /* !! */ .length)) break block11;
                            var8_8 /* !! */  = (int)var10_10 /* !! */ [var5_5];
                            break block12;
                        }
                        var10_10 /* !! */  = (int[])this.u;
                        if (var10_10 /* !! */  == null) ** GOTO lbl-1000
                        var13_13 = var10_10 /* !! */ .intValue();
                        var12_12 = -1;
                        var14_14 = 0.0f / 0.0f;
                        if (var13_13 != var12_12) {
                            this.p = var13_13 = this.p + var2_2;
                            var10_10 /* !! */  = this.o;
                            if (var10_10 /* !! */  == null) {
                                this.o = var10_10 /* !! */  = new int[var2_2];
                            }
                            this.o = var10_10 /* !! */  = this.getRadius();
                            var12_12 = this.p - var2_2;
                            var10_10 /* !! */ [var12_12] = var8_8 /* !! */ ;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var13_13 = var3_3.getId();
                            var10_10 /* !! */  = var13_13;
                            var10_10 /* !! */  = (int[])((String)var11_11.get(var10_10 /* !! */ ));
                        }
                    }
                    var10_10 /* !! */  = (int[])this.n;
                    if (var10_10 /* !! */  == null || var5_5 >= (var12_12 = var10_10 /* !! */ .length)) break block13;
                    var9_9 /* !! */  = (float)var10_10 /* !! */ [var5_5];
                    break block14;
                }
                var10_10 /* !! */  = (int[])this.t;
                if (var10_10 /* !! */  == null) ** GOTO lbl-1000
                var15_15 = var10_10 /* !! */ .floatValue();
                var12_12 = -1082130432;
                var14_14 = -1.0f;
                cfr_temp_0 = var15_15 - var14_14;
                var13_13 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var13_13 != 0) {
                    this.q = var13_13 = this.q + var2_2;
                    var10_10 /* !! */  = (int[])this.n;
                    if (var10_10 /* !! */  == null) {
                        var10_10 /* !! */  = (int[])new float[var2_2];
                        this.n = var10_10 /* !! */ ;
                    }
                    var10_10 /* !! */  = (int[])this.getAngles();
                    this.n = var10_10 /* !! */ ;
                    var16_16 = this.q - var2_2;
                    var10_10 /* !! */ [var16_16] = (int)var9_9 /* !! */ ;
                } else lbl-1000:
                // 2 sources

                {
                    var13_13 = var3_3.getId();
                    var10_10 /* !! */  = var13_13;
                    var10_10 /* !! */  = (int[])((String)var11_11.get(var10_10 /* !! */ ));
                }
            }
            var10_10 /* !! */  = (int[])((ConstraintLayout$LayoutParams)var3_3.getLayoutParams());
            var10_10 /* !! */ .r = var9_9 /* !! */ ;
            var10_10 /* !! */ .p = var17_17 = this.m;
            var10_10 /* !! */ .q = var8_8 /* !! */ ;
            var3_3.setLayoutParams((ViewGroup.LayoutParams)var10_10 /* !! */ );
        }
        this.e();
    }

    public final void s(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            int n4;
            Object object = this.c;
            if (object == null) {
                return;
            }
            object = this.n;
            if (object == null) {
                return;
            }
            int n7 = this.q + 1;
            int n8 = ((Context)object).length;
            if (n7 > n8) {
                n7 = ((Context)object).length + 1;
                object = Arrays.copyOf((float[])object, n7);
                this.n = (float[])object;
            }
            object = this.n;
            n7 = this.q;
            float f5 = Integer.parseInt(string2);
            object[n7] = (Context)f5;
            this.q = n4 = this.q + 1;
        }
    }

    public void setDefaultAngle(float f5) {
        w = f5;
    }

    public void setDefaultRadius(int n3) {
        v = n3;
    }

    public final void t(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            int n4;
            Context context = this.c;
            if (context == null) {
                return;
            }
            int[] nArray = this.o;
            if (nArray == null) {
                return;
            }
            int n7 = this.p + 1;
            int n8 = nArray.length;
            if (n7 > n8) {
                n7 = nArray.length + 1;
                this.o = nArray = Arrays.copyOf(nArray, n7);
            }
            nArray = this.o;
            n7 = this.p;
            float f5 = Integer.parseInt(string2);
            context = context.getResources().getDisplayMetrics();
            float f6 = context.density;
            nArray[n7] = n4 = (int)(f5 *= f6);
            this.p = n4 = this.p + 1;
        }
    }
}

