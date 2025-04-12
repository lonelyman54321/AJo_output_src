/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AnimationUtils
 */
package androidx.core.widget;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.core.view.ViewCompat;
import androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable;
import androidx.core.widget.AutoScrollHelper$a;

public abstract class AutoScrollHelper
implements View.OnTouchListener {
    public static final int q = ViewConfiguration.getTapTimeout();
    public final AutoScrollHelper$a a;
    public final AccelerateInterpolator b;
    public final View c;
    public Runnable d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final int h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;

    public AutoScrollHelper(View view) {
        Object object;
        AutoScrollHelper$a autoScrollHelper$a;
        int n3 = 2;
        autoScrollHelper$a.e = Long.MIN_VALUE;
        autoScrollHelper$a.g = -1;
        autoScrollHelper$a.f = 0L;
        this.a = autoScrollHelper$a;
        this.b = object = new AccelerateInterpolator();
        Object object2 = object = (Object)new float[n3];
        object2[0] = (AccelerateInterpolator)0.0f;
        object2[1] = (AccelerateInterpolator)0.0f;
        this.e = (float[])object;
        float f5 = Float.MAX_VALUE;
        float[] fArray = new float[n3];
        fArray[0] = Float.MAX_VALUE;
        fArray[1] = Float.MAX_VALUE;
        this.f = fArray;
        float[] fArray2 = new float[n3];
        fArray2[0] = 0.0f;
        fArray2[1] = 0.0f;
        this.i = fArray2;
        float[] fArray3 = new float[n3];
        fArray3[0] = 0.0f;
        fArray3[1] = 0.0f;
        this.j = fArray3;
        float[] fArray4 = new float[n3];
        fArray4[0] = Float.MAX_VALUE;
        fArray4[1] = Float.MAX_VALUE;
        this.k = fArray4;
        this.c = view;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f7 = 1575.0f * f6;
        float f8 = 0.5f;
        int n4 = (int)(f7 + f8);
        int n7 = (int)(f6 * 315.0f + f8);
        f7 = n4;
        f8 = 1000.0f;
        fArray4[0] = f7 /= f8;
        int n8 = 1;
        fArray4[n8] = f7;
        fArray3[0] = f6 = (float)n7 / f8;
        fArray3[n8] = f6;
        this.g = n8;
        fArray[0] = f5;
        fArray[n8] = f5;
        f6 = 0.2f;
        object[0] = (AccelerateInterpolator)f6;
        object[n8] = (AccelerateInterpolator)f6;
        fArray2[0] = f6 = 0.001f;
        fArray2[n8] = f6;
        this.h = n7 = q;
        autoScrollHelper$a.a = n7 = 500;
        autoScrollHelper$a.b = n7;
    }

    public static float b(float f5, float f6, float f7) {
        Object object = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1);
        if (object > 0) {
            return f7;
        }
        Object object2 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object2 < 0) {
            return f6;
        }
        return f5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final float a(float var1_1, float var2_2, float var3_3, int var4_4) {
        block4: {
            var5_5 = this.e;
            var6_6 = var5_5[var4_4];
            var7_7 = this.f;
            var8_8 = var7_7[var4_4];
            var6_6 *= var2_2;
            var9_9 = null;
            var6_6 = AutoScrollHelper.b(var6_6, 0.0f, var8_8);
            var8_8 = this.c(var1_1, var6_6);
            var2_2 -= var1_1;
            var1_1 = this.c(var2_2, var6_6) - var8_8;
            var10_10 = this.b;
            cfr_temp_0 = var1_1 - 0.0f;
            var11_11 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
            if (var11_11 /* !! */  >= 0) break block4;
            var1_1 = -var1_1;
            var1_1 = -var10_10.getInterpolation(var1_1);
            ** GOTO lbl23
        }
        cfr_temp_1 = var1_1 - 0.0f;
        var11_11 /* !! */  = (float)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
        if (var11_11 /* !! */  > 0) {
            var1_1 = var10_10.getInterpolation(var1_1);
lbl23:
            // 2 sources

            var12_12 = -1082130432;
            var2_2 = -1.0f;
            var11_11 /* !! */  = 1065353216;
            var6_6 = 1.0f;
            var1_1 = AutoScrollHelper.b(var1_1, var2_2, var6_6);
        } else {
            var1_1 = 0.0f;
        }
        var12_12 = (int)((cfr_temp_2 = var1_1 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
        if (var12_12 == 0) {
            return 0.0f;
        }
        var5_5 = this.i;
        var6_6 = var5_5[var4_4];
        var7_7 = this.j;
        var8_8 = var7_7[var4_4];
        var9_9 = this.k;
        var13_13 = var9_9[var4_4];
        var6_6 *= var3_3;
        if (var12_12 > 0) {
            return AutoScrollHelper.b(var1_1 * var6_6, var8_8, var13_13);
        }
        return -AutoScrollHelper.b(-var1_1 * var6_6, var8_8, var13_13);
    }

    public final float c(float f5, float f6) {
        float f7 = f6 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            return 0.0f;
        }
        object = this.g;
        int n3 = 1;
        if (object != false && object != n3) {
            float f8;
            n3 = 2;
            if (object == n3 && (object = (f8 = f5 - 0.0f) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) < 0) {
                f6 = -f6;
                return f5 / f6;
            }
        } else {
            Object object2 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
            if (object2 < 0) {
                object2 = 1065353216;
                float f11 = 1.0f;
                float f12 = f5 - 0.0f;
                Object object3 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (object3 >= 0) {
                    return f11 - (f5 /= f6);
                }
                boolean bl2 = this.o;
                if (bl2 && object == n3) {
                    return f11;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        boolean bl2 = this.m;
        int n3 = 0;
        float f5 = 0.0f;
        if (bl2) {
            this.o = false;
        } else {
            AutoScrollHelper$a autoScrollHelper$a = this.a;
            autoScrollHelper$a.getClass();
            long l2 = AnimationUtils.currentAnimationTimeMillis();
            long l3 = autoScrollHelper$a.e;
            l3 = l2 - l3;
            int n4 = (int)l3;
            int n7 = autoScrollHelper$a.b;
            if (n4 > n7) {
                n3 = n7;
            } else if (n4 >= 0) {
                n3 = n4;
            }
            autoScrollHelper$a.i = n3;
            autoScrollHelper$a.h = f5 = autoScrollHelper$a.a(l2);
            autoScrollHelper$a.g = l2;
        }
    }

    public final boolean e() {
        AutoScrollHelper$a autoScrollHelper$a = this.a;
        float f5 = autoScrollHelper$a.d;
        float f6 = Math.abs(f5);
        int n3 = (int)(f5 /= f6);
        Math.abs(autoScrollHelper$a.c);
        boolean bl2 = false;
        autoScrollHelper$a = null;
        if (n3 != 0) {
            AutoScrollHelper autoScrollHelper = this;
            autoScrollHelper = ((kv1)this).r;
            int n4 = autoScrollHelper.getCount();
            if (n4 != 0) {
                View view;
                int n7;
                View view2;
                int n8 = autoScrollHelper.getChildCount();
                int n10 = autoScrollHelper.getFirstVisiblePosition();
                int n14 = n10 + n8;
                int n15 = 1;
                if (!(n3 > 0 ? n14 >= n4 && (n3 = (view2 = autoScrollHelper.getChildAt(n8 -= n15)).getBottom()) <= (n7 = autoScrollHelper.getHeight()) : n3 >= 0 || n10 <= 0 && (n3 = (view = autoScrollHelper.getChildAt(0)).getTop()) >= 0)) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public final boolean onTouch(View object, MotionEvent object2) {
        block10: {
            float f5;
            int n3;
            int n4;
            block9: {
                block7: {
                    block8: {
                        int n7 = this.p;
                        if (n7 == 0) {
                            return false;
                        }
                        n7 = object2.getActionMasked();
                        n4 = 1;
                        if (n7 == 0) break block7;
                        if (n7 == n4) break block8;
                        n3 = 2;
                        f5 = 2.8E-45f;
                        if (n7 == n3) break block9;
                        int n8 = 3;
                        float f6 = 4.2E-45f;
                        if (n7 != n8) break block10;
                    }
                    this.d();
                    break block10;
                }
                this.n = n4;
                this.l = false;
            }
            float f7 = object2.getX();
            f5 = object.getWidth();
            View view = this.c;
            int n10 = view.getWidth();
            float f8 = n10;
            f7 = this.a(f7, f5, f8, 0);
            float f11 = object2.getY();
            float f12 = object.getHeight();
            n3 = view.getHeight();
            f5 = n3;
            f12 = this.a(f11, f12, f5, n4);
            object2 = this.a;
            object2.c = f7;
            object2.d = f12;
            int n14 = this.o;
            if (n14 == 0 && (n14 = this.e()) != 0) {
                object = this.d;
                if (object == null) {
                    object = new AutoScrollHelper$ScrollAnimationRunnable(this);
                    this.d = object;
                }
                this.o = n4;
                this.m = n4;
                n14 = this.l;
                if (n14 == 0 && (n14 = this.h) > 0) {
                    object2 = this.d;
                    long l2 = n14;
                    object = ViewCompat.a;
                    view.postOnAnimationDelayed((Runnable)object2, l2);
                } else {
                    object = (AutoScrollHelper$ScrollAnimationRunnable)this.d;
                    ((AutoScrollHelper$ScrollAnimationRunnable)object).run();
                }
                this.l = n4;
            }
        }
        return false;
    }
}

