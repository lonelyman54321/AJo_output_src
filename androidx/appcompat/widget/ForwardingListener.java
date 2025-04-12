/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.ForwardingListener$DisallowIntercept;
import androidx.appcompat.widget.ForwardingListener$TriggerLongPress;

public abstract class ForwardingListener
implements View.OnTouchListener,
View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public Runnable e;
    public Runnable f;
    public boolean g;
    public int h;
    public final int[] i;

    public ForwardingListener(View view) {
        int n3;
        int n4;
        float f5;
        int n7 = 2;
        int[] nArray = new int[n7];
        this.i = nArray;
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        this.a = f5 = (float)ViewConfiguration.get((Context)view.getContext()).getScaledTouchSlop();
        this.b = n4 = ViewConfiguration.getTapTimeout();
        this.c = n3 = (ViewConfiguration.getLongPressTimeout() + n4) / n7;
    }

    public final void a() {
        Runnable runnable2 = this.f;
        View view = this.d;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
        if ((runnable2 = this.e) != null) {
            view.removeCallbacks(runnable2);
        }
    }

    public abstract q43 b();

    public abstract boolean c();

    public boolean d() {
        boolean bl2;
        q43 q432 = this.b();
        if (q432 != null && (bl2 = q432.a())) {
            q432.dismiss();
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onTouch(View var1_1, MotionEvent var2_2) {
        block10: {
            block16: {
                block11: {
                    block12: {
                        block13: {
                            block15: {
                                block14: {
                                    block8: {
                                        block9: {
                                            var3_3 = this.g;
                                            var4_4 = 3;
                                            var5_5 = 4.2E-45f;
                                            var6_6 = this.d;
                                            var7_7 = 1;
                                            if (!var3_3) break block8;
                                            var8_8 = this.b();
                                            if (var8_8 == null || !(var9_9 = var8_8.a()) || (var8_8 = (DropDownListView)var8_8.n()) == null || !(var9_9 = var8_8.isShown())) break block9;
                                            var10_11 = MotionEvent.obtainNoHistory((MotionEvent)var2_2 /* !! */ );
                                            var11_12 = this.i;
                                            var6_6.getLocationOnScreen(var11_12);
                                            var12_13 = var11_12[0];
                                            var13_14 = var11_12[var7_7];
                                            var14_15 = var13_14;
                                            var10_11.offsetLocation(var12_13, var14_15);
                                            var8_8.getLocationOnScreen(var11_12);
                                            var12_13 = -var11_12[0];
                                            var15_16 = -var11_12[var7_7];
                                            var16_18 = var15_16;
                                            var10_11.offsetLocation(var12_13, var16_18);
                                            var17_19 = this.h;
                                            var17_19 = (int)var8_8.b(var10_11, var17_19);
                                            var10_11.recycle();
                                            var18_20 = var2_2 /* !! */ .getActionMasked();
                                            if (var18_20 != var7_7 && var18_20 != var4_4) {
                                                var18_20 = 1;
                                                var19_21 = 1.4E-45f;
                                            } else {
                                                var18_20 = 0;
                                                var19_21 = 0.0f;
                                                var2_2 /* !! */  = null;
                                            }
                                            if (var17_19 != 0 && var18_20 != 0) ** GOTO lbl-1000
                                        }
                                        if ((var18_20 = this.d()) == 0) lbl-1000:
                                        // 2 sources

                                        {
                                            var18_20 = 1;
                                            var19_21 = 1.4E-45f;
                                        } else {
                                            var18_20 = 0;
                                            var19_21 = 0.0f;
                                            var2_2 /* !! */  = null;
                                        }
                                        break block10;
                                    }
                                    var20_23 = var6_6.isEnabled();
                                    if (var20_23 == 0) break block11;
                                    var20_23 = var2_2 /* !! */ .getActionMasked();
                                    if (var20_23 == 0) break block12;
                                    if (var20_23 == var7_7) break block13;
                                    var9_10 = 2;
                                    var21_24 = 2.8E-45f;
                                    if (var20_23 == var9_10) break block14;
                                    if (var20_23 == var4_4) break block13;
                                    break block11;
                                }
                                var4_4 = this.h;
                                if ((var4_4 = var2_2 /* !! */ .findPointerIndex(var4_4)) < 0) break block11;
                                var22_25 = var2_2 /* !! */ .getX(var4_4);
                                var19_22 = var2_2 /* !! */ .getY(var4_4);
                                var5_5 = this.a;
                                var21_24 = -var5_5;
                                cfr_temp_0 = var22_25 - var21_24;
                                var15_17 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                if (var15_17 /* !! */  < 0 || (var9_10 = (int)(var19_22 == var21_24 ? 0 : (var19_22 > var21_24 ? 1 : -1))) < 0) break block15;
                                var9_10 = var6_6.getRight();
                                var15_17 /* !! */  = var6_6.getLeft();
                                var21_24 = (float)(var9_10 -= var15_17 /* !! */ ) + var5_5;
                                cfr_temp_1 = var22_25 - var21_24;
                                var20_23 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                                if (var20_23 >= 0) break block15;
                                var20_23 = var6_6.getBottom();
                                var9_10 = var6_6.getTop();
                                var22_25 = (float)(var20_23 -= var9_10) + var5_5;
                                cfr_temp_2 = var19_22 - var22_25;
                                var18_20 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                                if (var18_20 < 0) break block11;
                            }
                            this.a();
                            var2_2 /* !! */  = var6_6.getParent();
                            var2_2 /* !! */ .requestDisallowInterceptTouchEvent((boolean)var7_7);
                            var18_20 = (int)this.c();
                            if (var18_20 == 0) break block11;
                            var18_20 = 1;
                            var19_22 = 1.4E-45f;
                            break block16;
                        }
                        this.a();
                        break block11;
                    }
                    this.h = var18_20 = var2_2 /* !! */ .getPointerId(0);
                    var2_2 /* !! */  = this.e;
                    if (var2_2 /* !! */  == null) {
                        var2_2 /* !! */  = new ForwardingListener$DisallowIntercept(this);
                        this.e = var2_2 /* !! */ ;
                    }
                    var2_2 /* !! */  = this.e;
                    var4_4 = this.b;
                    var23_26 = var4_4;
                    var6_6.postDelayed((Runnable)var2_2 /* !! */ , var23_26);
                    var2_2 /* !! */  = this.f;
                    if (var2_2 /* !! */  == null) {
                        var2_2 /* !! */  = new ForwardingListener$TriggerLongPress(this);
                        this.f = var2_2 /* !! */ ;
                    }
                    var2_2 /* !! */  = this.f;
                    var4_4 = this.c;
                    var23_26 = var4_4;
                    var6_6.postDelayed((Runnable)var2_2 /* !! */ , var23_26);
                }
                var18_20 = 0;
                var19_22 = 0.0f;
                var2_2 /* !! */  = null;
            }
            if (var18_20 != 0) {
                var25_27 = SystemClock.uptimeMillis();
                var27_28 = 3;
                var23_26 = var25_27;
                var28_29 = MotionEvent.obtain((long)var25_27, (long)var25_27, (int)var27_28, (float)0.0f, (float)0.0f, (int)0);
                var6_6.onTouchEvent(var28_29);
                var28_29.recycle();
            }
        }
        this.g = var18_20;
        if (var18_20 == 0 && !var3_3) {
            var7_7 = 0;
        }
        return (boolean)var7_7;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View object) {
        int n3;
        this.g = false;
        this.h = n3 = -1;
        object = this.e;
        if (object != null) {
            View view = this.d;
            view.removeCallbacks((Runnable)object);
        }
    }
}

