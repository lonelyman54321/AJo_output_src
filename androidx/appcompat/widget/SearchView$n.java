/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.view.MotionEvent
 *  android.view.TouchDelegate
 *  android.view.View
 *  android.view.ViewConfiguration
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

public final class SearchView$n
extends TouchDelegate {
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;

    public SearchView$n(View view, Rect rect, Rect rect2) {
        super(rect, view);
        Rect rect3;
        Rect rect4;
        Rect rect5;
        int n3;
        this.e = n3 = ViewConfiguration.get((Context)view.getContext()).getScaledTouchSlop();
        this.b = rect5 = new Rect();
        this.d = rect4 = new Rect();
        this.c = rect3 = new Rect();
        rect5.set(rect);
        rect4.set(rect);
        int n4 = -n3;
        rect4.inset(n4, n4);
        rect3.set(rect2);
        this.a = view;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean onTouchEvent(MotionEvent var1_1) {
        block7: {
            block10: {
                block8: {
                    block9: {
                        var2_2 = var1_1.getX();
                        var3_3 = (int)var2_2;
                        var4_4 = var1_1.getY();
                        var5_5 = (int)var4_4;
                        var6_6 = var1_1.getAction();
                        var7_7 = 2;
                        var8_8 = false;
                        var9_9 = null;
                        var10_10 = 1;
                        if (var6_6 == 0) break block8;
                        if (var6_6 == var10_10 || var6_6 == var7_7) break block9;
                        var11_11 = 3;
                        if (var6_6 == var11_11) {
                            var6_6 = (int)this.f;
                            this.f = false;
lbl16:
                            // 2 sources

                            while (true) {
                                var10_10 = var6_6;
lbl18:
                                // 2 sources

                                while (true) {
                                    var6_6 = 1;
                                    break block7;
                                    break;
                                }
                                break;
                            }
                        }
                        break block10;
                    }
                    ** while ((var6_6 = (int)this.f) == 0 || (var11_12 = (var12_13 = this.d).contains((int)var3_3, (int)var5_5)))
lbl24:
                    // 1 sources

                    var10_10 = var6_6;
                    var6_6 = 0;
                    var13_14 = null;
                    break block7;
                }
                var13_15 = this.b;
                var6_6 = (int)var13_15.contains(var3_3, var5_5);
                if (var6_6 != 0) {
                    this.f = var10_10;
                    ** continue;
                }
            }
            var6_6 = 1;
            var10_10 = 0;
            var14_16 = null;
        }
        if (var10_10 != 0) {
            var9_9 = this.c;
            var14_16 = this.a;
            if (var6_6 != 0 && (var6_6 = (int)var9_9.contains(var3_3, var5_5)) == 0) {
                var3_3 = var14_16.getWidth() / var7_7;
                var2_2 = var3_3;
                var5_5 = var14_16.getHeight() / var7_7;
                var4_4 = var5_5;
                var1_1.setLocation(var2_2, var4_4);
            } else {
                var6_6 = var9_9.left;
                var2_2 = var3_3 -= var6_6;
                var6_6 = var9_9.top;
                var4_4 = var5_5 -= var6_6;
                var1_1.setLocation(var2_2, var4_4);
            }
            var8_8 = var14_16.dispatchTouchEvent(var1_1);
        }
        return var8_8;
    }
}

