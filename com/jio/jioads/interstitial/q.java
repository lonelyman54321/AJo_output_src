/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 */
package com.jio.jioads.interstitial;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.jio.jioads.interstitial.x;
import com.jio.jioads.utils.Constants$AdTouchEvents;
import kotlin.jvm.internal.Intrinsics;

public final class q
extends GestureDetector.SimpleOnGestureListener {
    public final int a;
    public final int b;
    public final /* synthetic */ x c;

    public q(x x5) {
        int n3;
        this.c = x5;
        this.a = n3 = 100;
        this.b = n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onFling(MotionEvent var1_1, MotionEvent var2_2, float var3_3, float var4_4) {
        block11: {
            var5_5 = "e2";
            Intrinsics.checkNotNullParameter(var2_2 /* !! */ , var5_5);
            try {
                var6_6 = var2_2 /* !! */ .getY();
                var7_7 = var1_1 != null ? var1_1.getY() : 0.0f;
                var6_6 -= var7_7;
            }
            catch (Exception v0) {
                return false;
            }
            {
                var8_8 = var2_2 /* !! */ .getX();
                if (var1_1 != null) {
                    var9_9 = var1_1.getX();
                } else {
                    var10_10 = 0;
                    var9_9 = 0.0f;
                    var1_1 = null;
                }
                var8_8 -= var9_9;
            }
            {
                var9_9 = Math.abs(var8_8);
                var7_7 = Math.abs(var6_6);
                var11_11 = this.b;
                var12_12 = this.a;
                var13_13 = this.c;
                var10_10 = var9_9 == var7_7 ? 0 : (var9_9 > var7_7 ? 1 : -1);
                if (var10_10 <= 0) break block11;
            }
            {
                var9_9 = Math.abs(var8_8);
            }
            var4_4 = var12_12;
            var10_10 = (int)(var9_9 == var4_4 ? 0 : (var9_9 > var4_4 ? 1 : -1));
            if (var10_10 <= 0) return true;
            {
                var9_9 = Math.abs(var3_3);
            }
            var3_3 = var11_11;
            var10_10 = (int)(var9_9 == var3_3 ? 0 : (var9_9 > var3_3 ? 1 : -1));
            if (var10_10 <= 0) return true;
            cfr_temp_0 = var8_8 - 0.0f;
            var10_10 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            if (var10_10 <= 0) ** GOTO lbl40
            {
                var1_1 = var13_13.b;
                var2_2 /* !! */  = Constants$AdTouchEvents.SWIPE_RIGHT;
                var1_1.b((Constants$AdTouchEvents)var2_2 /* !! */ );
                return true;
lbl40:
                // 1 sources

                var1_1 = var13_13.b;
                var2_2 /* !! */  = Constants$AdTouchEvents.SWIPE_LEFT;
                var1_1.b((Constants$AdTouchEvents)var2_2 /* !! */ );
                return true;
            }
        }
        var9_9 = Math.abs(var6_6);
        cfr_temp_1 = var9_9 - (var8_8 = (float)var12_12);
        var10_10 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
        if (var10_10 <= 0) return true;
        {
            var9_9 = Math.abs(var4_4);
        }
        var8_8 = var11_11;
        var10_10 = (int)(var9_9 == var8_8 ? 0 : (var9_9 > var8_8 ? 1 : -1));
        if (var10_10 <= 0) return true;
        cfr_temp_2 = var6_6 - 0.0f;
        var10_10 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
        if (var10_10 <= 0) ** GOTO lbl60
        {
            var1_1 = var13_13.b;
            var2_2 /* !! */  = Constants$AdTouchEvents.SWIPE_DOWN;
            var1_1.b((Constants$AdTouchEvents)var2_2 /* !! */ );
            return true;
lbl60:
            // 1 sources

            var1_1 = var13_13.b;
            var2_2 /* !! */  = Constants$AdTouchEvents.SWIPE_UP;
            var1_1.b((Constants$AdTouchEvents)var2_2 /* !! */ );
        }
        return true;
    }
}

