/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View$MeasureSpec
 *  android.widget.FrameLayout
 */
package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.ui.AspectRatioFrameLayout$AspectRatioUpdateDispatcher;
import androidx.media3.ui.AspectRatioFrameLayout$a;
import androidx.media3.ui.R$styleable;

public final class AspectRatioFrameLayout
extends FrameLayout {
    public static final /* synthetic */ int d;
    public final AspectRatioFrameLayout$AspectRatioUpdateDispatcher a;
    public float b;
    public int c = 0;

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        if (attributeSet != null) {
            object = object.getTheme();
            int[] nArray = R$styleable.AspectRatioFrameLayout;
            object = object.obtainStyledAttributes(attributeSet, nArray, 0, 0);
            try {
                int n3 = R$styleable.AspectRatioFrameLayout_resize_mode;
                this.c = n3 = object.getInt(n3, 0);
            }
            finally {
                object.recycle();
            }
        }
        super(this);
        this.a = object;
    }

    public int getResizeMode() {
        return this.c;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onMeasure(int var1_1, int var2_2) {
        block9: {
            block10: {
                block11: {
                    block12: {
                        super.onMeasure(var1_1, var2_2);
                        var3_3 = this.b;
                        var2_2 = 0;
                        var4_4 = 0.0f;
                        var5_5 = null;
                        cfr_temp_0 = var3_3 - 0.0f;
                        var1_1 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                        if (var1_1 <= 0) {
                            return;
                        }
                        var1_1 = this.getMeasuredWidth();
                        var6_6 = this.getMeasuredHeight();
                        var7_7 = var1_1;
                        var8_8 = var6_6;
                        var9_9 = var7_7 / var8_8;
                        var10_10 = this.b / var9_9 - 1.0f;
                        var9_9 = Math.abs(var10_10);
                        var11_11 = true;
                        var12_12 = 1008981770;
                        var13_13 = 0.01f;
                        var14_14 = this.a;
                        var15_15 /* !! */  = (float)(var9_9 == var13_13 ? 0 : (var9_9 < var13_13 ? -1 : 1));
                        if (var15_15 /* !! */  <= 0) {
                            var1_1 = (int)var14_14.a;
                            if (var1_1 == 0) {
                                var14_14.a = var11_11;
                                var16_16 = var14_14.b;
                                var16_16.post(var14_14);
                            }
                            return;
                        }
                        var15_15 /* !! */  = this.c;
                        if (var15_15 /* !! */  == false) break block10;
                        if (var15_15 /* !! */  == var11_11) break block11;
                        var12_12 = 2;
                        var13_13 = 2.8E-45f;
                        if (var15_15 /* !! */  == var12_12) break block12;
                        var12_12 = 4;
                        var13_13 = 5.6E-45f;
                        if (var15_15 /* !! */  == var12_12) {
                            cfr_temp_1 = var10_10 - 0.0f;
                            var2_2 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                            if (var2_2 > 0) {
                                var3_3 = this.b;
lbl43:
                                // 3 sources

                                while (true) {
                                    var1_1 = (int)(var8_8 *= var3_3);
                                    break block9;
                                    break;
                                }
                            }
                            var4_4 = this.b;
lbl47:
                            // 3 sources

                            while (true) {
                                var6_6 = (int)(var7_7 /= var4_4);
                                break block9;
                                break;
                            }
                        }
                        break block9;
                    }
                    var3_3 = this.b;
                    ** GOTO lbl43
                }
                var4_4 = this.b;
                ** GOTO lbl47
            }
            cfr_temp_2 = var10_10 - 0.0f;
            var2_2 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
            if (var2_2 > 0) {
                var4_4 = this.b;
                ** continue;
            }
            var3_3 = this.b;
            ** while (true)
        }
        if ((var2_2 = (int)var14_14.a) == 0) {
            var14_14.a = var11_11;
            var5_5 = var14_14.b;
            var5_5.post(var14_14);
        }
        var2_2 = 0x40000000;
        var1_1 = View.MeasureSpec.makeMeasureSpec((int)var1_1, (int)var2_2);
        var2_2 = View.MeasureSpec.makeMeasureSpec((int)var6_6, (int)var2_2);
        super.onMeasure(var1_1, var2_2);
    }

    public void setAspectRatio(float f5) {
        float f6 = this.b;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.b = f5;
            this.requestLayout();
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout$a aspectRatioFrameLayout$a) {
    }

    public void setResizeMode(int n3) {
        int n4 = this.c;
        if (n4 != n3) {
            this.c = n3;
            this.requestLayout();
        }
    }
}

