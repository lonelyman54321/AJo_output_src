/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 */
package com.jio.jioads.native.renderer;

import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.K;
import com.jio.jioads.adinterfaces.L;
import com.jio.jioads.adinterfaces.N;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.jvm.internal.Intrinsics;

public final class B
extends GestureDetector.SimpleOnGestureListener {
    public final int a;
    public final int b;
    public final /* synthetic */ NativeAdViewRenderer c;

    public B(NativeAdViewRenderer nativeAdViewRenderer) {
        int n3;
        this.c = nativeAdViewRenderer;
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
            Intrinsics.checkNotNullParameter(var2_2, var5_5);
            try {
                var6_6 = var2_2.getY();
                var7_7 = var1_1 != null ? var1_1.getY() : 0.0f;
                var6_6 -= var7_7;
            }
            catch (Exception v0) {
                return false;
            }
            {
                var8_8 = var2_2.getX();
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
            if (var10_10 <= 0) ** GOTO lbl48
            {
                var1_1 = NativeAdViewRenderer.access$getJioAdCallback$p(var13_13);
                var1_1 = (V)var1_1;
                var1_1.getClass();
                var14_14 /* !! */  = Looper.getMainLooper();
                var2_2 = new Handler(var14_14 /* !! */ );
                var15_18 = var1_1.b;
                var1_1 = var1_1.a;
                var14_14 /* !! */  = new L((JioAdView)var1_1, var15_18);
                var2_2.post((Runnable)var14_14 /* !! */ );
                return true;
lbl48:
                // 1 sources

                var1_1 = NativeAdViewRenderer.access$getJioAdCallback$p(var13_13);
                var1_1 = (V)var1_1;
                var1_1.getClass();
                var14_15 /* !! */  = Looper.getMainLooper();
                var2_2 = new Handler(var14_15 /* !! */ );
                var15_19 = var1_1.b;
                var1_1 = var1_1.a;
                var16_22 = 1;
                var6_6 = 1.4E-45f;
                var14_15 /* !! */  = new xT(var16_22, var15_19, var1_1);
                var2_2.post((Runnable)var14_15 /* !! */ );
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
        if (var10_10 <= 0) ** GOTO lbl86
        {
            var1_1 = NativeAdViewRenderer.access$getJioAdCallback$p(var13_13);
            var1_1 = (V)var1_1;
            var1_1.getClass();
            var14_16 /* !! */  = Looper.getMainLooper();
            var2_2 = new Handler(var14_16 /* !! */ );
            var15_20 = var1_1.b;
            var1_1 = var1_1.a;
            var14_16 /* !! */  = new K((JioAdView)var1_1, var15_20);
            var2_2.post((Runnable)var14_16 /* !! */ );
            return true;
lbl86:
            // 1 sources

            var1_1 = NativeAdViewRenderer.access$getJioAdCallback$p(var13_13);
            var1_1 = (V)var1_1;
            var1_1.getClass();
            var14_17 /* !! */  = Looper.getMainLooper();
            var2_2 = new Handler(var14_17 /* !! */ );
            var15_21 = var1_1.b;
            var1_1 = var1_1.a;
            var14_17 /* !! */  = new N((JioAdView)var1_1, var15_21);
            var2_2.post((Runnable)var14_17 /* !! */ );
        }
        return true;
    }
}

