/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.widget.ExpandableListView
 */
package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFa1vSDK;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class AFb1sSDK {
    private final AFa1oSDK getMonetizationNetwork;

    public AFb1sSDK(AFa1oSDK aFa1oSDK) {
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        this.getMonetizationNetwork = aFa1oSDK;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void afInfoLog() {
        var1_1 = 1;
        var2_2 = null;
        try {
            var3_3 = AFa1vSDK.registerClient;
            var4_4 = -305051340;
        }
        catch (Throwable var21_20) {
            var2_2 = var21_20.getCause();
            if (var2_2 != null) {
                throw var2_2;
            }
            throw var21_20;
        }
        var5_5 = var4_4;
        var5_5 = var3_3.get(var5_5);
        var6_6 = null;
        var7_7 = "";
        var8_8 = '\ucef2';
        if (var5_5 != null) ** GOTO lbl38
        var9_9 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37;
        var10_10 = KeyEvent.getMaxKeyCode() >> 16;
        var10_10 = 322 - var10_10;
        var11_11 = KeyEvent.keyCodeFromString((String)var7_7);
        var11_11 = (char)(var8_8 - var11_11);
        var5_5 = AFa1vSDK.getRevenue(var9_9, var10_10, var11_11);
        var5_5 = (Class)var5_5;
        var5_5 = var5_5.getDeclaredConstructor(null);
        var12_12 /* !! */  = var4_4;
        var3_3.put(var12_12 /* !! */ , var5_5);
lbl38:
        // 2 sources

        var5_5 = var5_5;
        var12_12 /* !! */  = var5_5.newInstance(null);
        var5_5 = this.getMonetizationNetwork;
        var6_6 = new Object[var1_1];
        var6_6[0] = var5_5;
        var9_9 = -1120235931;
        var13_13 = var9_9;
        var13_13 = var3_3.get(var13_13);
        if (var13_13 != null) ** GOTO lbl79
        var10_10 = View.resolveSize((int)0, (int)0);
        var10_10 = 37 - var10_10;
        var14_14 = TextUtils.getTrimmedLength((CharSequence)var7_7) + 322;
        var15_15 = ExpandableListView.getPackedPositionForGroup((int)0);
        var17_16 = 0L;
        var19_17 = (var15_15 == var17_16 ? 0 : (var15_15 < var17_16 ? -1 : 1)) + var8_8;
        var8_8 = (char)var19_17;
        var7_7 = AFa1vSDK.getRevenue(var10_10, var14_14, var8_8);
        var7_7 = (Class)var7_7;
        var20_18 = "getMonetizationNetwork";
        var21_19 /* !! */  = new Class[var1_1];
        var13_13 = AFa1oSDK.class;
        var21_19 /* !! */ [0] = var13_13;
        var13_13 = var7_7.getMethod(var20_18, var21_19 /* !! */ );
        var21_19 /* !! */  = var9_9;
        var3_3.put(var21_19 /* !! */ , var13_13);
lbl79:
        // 2 sources

        var13_13 = (Method)var13_13;
        var13_13.invoke(var12_12 /* !! */ , var6_6);
    }
}

