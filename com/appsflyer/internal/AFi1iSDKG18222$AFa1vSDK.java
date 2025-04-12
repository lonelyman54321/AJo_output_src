/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.PointF
 *  android.media.AudioTrack
 *  android.os.Process
 *  android.os.SystemClock
 *  android.telephony.cdma.CdmaCellLocation
 *  android.text.AndroidCharacter
 *  android.text.TextUtils
 *  android.view.Gravity
 *  android.view.KeyEvent
 *  android.view.ViewConfiguration
 *  android.widget.ExpandableListView
 *  com.google.android.play.core.integrity.IntegrityTokenResponse
 */
package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.AFi1hSDK;
import com.appsflyer.internal.AFi1jSDK;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1iSDKG18222$AFa1vSDK
implements OnCompleteListener {
    private /* synthetic */ AFi1jSDK AFAdRevenueData;
    private final long getCurrencyIso4217Code;

    public AFi1iSDKG18222$AFa1vSDK(AFi1jSDK aFi1jSDK, long l2) {
        this.AFAdRevenueData = aFi1jSDK;
        this.getCurrencyIso4217Code = l2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onComplete(Task var1_1) {
        block72: {
            block71: {
                var2_2 = this;
                var3_3 = "";
                var4_4 /* !! */  = var1_1;
                Intrinsics.checkNotNullParameter(var1_1, (String)var3_3);
                var5_5 = var1_1.isSuccessful();
                var6_6 = "getMonetizationNetwork";
                var7_7 = 64180;
                var8_8 = 8.9935E-41f;
                var9_9 = 48;
                var10_10 = 2;
                var11_11 = 1;
                var12_12 = '\u0000';
                var13_13 = 0L;
                if (var5_5 == 0) break block71;
                var4_4 /* !! */  = ((IntegrityTokenResponse)var1_1.getResult()).token();
                var15_14 = '\u0000';
                var16_15 = 0.0f;
                var17_17 /* !! */  = null;
                break block72;
            }
            var18_18 = this.AFAdRevenueData;
            var4_4 /* !! */  = var1_1.getException();
            try {
                var19_19 = new Object[var10_10];
            }
            catch (Throwable var19_20) {
                var20_21 = var19_20.getCause();
                if (var20_21 != null) {
                    throw var20_21;
                }
                throw var19_20;
            }
            var19_19[var11_11] = var4_4 /* !! */ ;
            var19_19[0] = var18_18;
            var4_4 /* !! */  = AFi1hSDK.registerClient;
            var5_5 = 2144477203;
            var20_21 = var5_5;
            var20_21 = var4_4 /* !! */ .get(var20_21);
            if (var20_21 != null) ** GOTO lbl86
            var21_22 = AndroidCharacter.getMirror((char)var9_9) + -11;
            var22_23 = CdmaCellLocation.convertQuartSecToDecDegrees((int)0);
            var24_24 = 0L;
            var26_25 = 0.0;
            var9_9 = (int)(var22_23 == var26_25 ? 0 : (var22_23 > var26_25 ? 1 : -1));
            var28_26 = Color.red((int)0);
            var15_14 = (char)(var7_7 - var28_26);
            var20_21 = AFi1hSDK.getMonetizationNetwork(var21_22, var9_9, var15_14);
            var20_21 = (Class)var20_21;
            var24_24 = ViewConfiguration.getGlobalActionKeyTimeout();
            var9_9 = (int)(var24_24 == var13_13 ? 0 : (var24_24 < var13_13 ? -1 : 1));
            var9_9 = 38 - var9_9;
            var16_16 = PointF.length((float)0.0f, (float)0.0f);
            cfr_temp_0 = var16_16 - 0.0f;
            var15_14 = (char)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            var24_24 = ViewConfiguration.getGlobalActionKeyTimeout();
            var28_26 = 64179;
            var29_27 = var24_24 == var13_13 ? 0 : (var24_24 < var13_13 ? -1 : 1);
            var7_7 = (char)(var29_27 + var28_26);
            var30_28 = AFi1hSDK.getMonetizationNetwork(var9_9, var15_14, (char)var7_7);
            var30_28 = (Class)var30_28;
            var31_29 = new Class[var10_10];
            var31_29[0] = var30_28;
            var30_28 = Exception.class;
            var31_29[var11_11] = var30_28;
            var20_21 = var20_21.getMethod(var6_6, var31_29);
            var18_18 = var5_5;
            var4_4 /* !! */ .put(var18_18, var20_21);
lbl86:
            // 2 sources

            var20_21 = (Method)var20_21;
            var32_30 = 0;
            var4_4 /* !! */  = null;
            var19_19 = var20_21.invoke(null, (Object[])var19_19);
            var17_17 /* !! */  = var19_19;
            var32_30 = 0;
            var4_4 /* !! */  = null;
        }
        var19_19 = var2_2.AFAdRevenueData;
        var33_31 = var2_2.getCurrencyIso4217Code;
        var21_22 = 4;
        var18_18 = new Object[var21_22];
        var21_22 = 3;
        var18_18[var21_22] = var17_17 /* !! */ ;
        var18_18[var10_10] = var4_4 /* !! */ ;
        var20_21 = var33_31;
        var18_18[var11_11] = var20_21;
        var18_18[0] = var19_19;
        var19_19 = AFi1hSDK.registerClient;
        var21_22 = 1691062553;
        var4_4 /* !! */  = var21_22;
        var4_4 /* !! */  = var19_19.get(var4_4 /* !! */ );
        if (var4_4 /* !! */  != null) ** GOTO lbl163
        var32_30 = (ViewConfiguration.getScrollBarSize() >> 8) + 37;
        var8_8 = AudioTrack.getMinVolume();
        cfr_temp_1 = var8_8 - 0.0f;
        var7_7 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
        var9_9 = Color.rgb((int)0, (int)0, (int)0);
        var12_12 = '\uff00fab4';
        var9_9 = (char)(var12_12 - var9_9);
        var4_4 /* !! */  = AFi1hSDK.getMonetizationNetwork(var32_30, var7_7, (char)var9_9);
        var4_4 /* !! */  = (Class)var4_4 /* !! */ ;
        var7_7 = Gravity.getAbsoluteGravity((int)0, (int)0) + 37;
        var9_9 = Process.getGidForName((String)var3_3) + var11_11;
        var15_14 = (char)Color.rgb((int)0, (int)0, (int)0);
        var12_12 = (char)(var12_12 - var15_14);
        var30_28 = AFi1hSDK.getMonetizationNetwork(var7_7, var9_9, var12_12);
        var30_28 = (Class)var30_28;
        var9_9 = 4;
        var31_29 = new Class[var9_9];
        var31_29[0] = var30_28;
        var30_28 = Long.TYPE;
        var31_29[var11_11] = var30_28;
        var30_28 = String.class;
        var31_29[var10_10] = var30_28;
        var10_10 = 3;
        var31_29[var10_10] = var30_28;
        var4_4 /* !! */  = var4_4 /* !! */ .getMethod(var6_6, var31_29);
        var20_21 = var21_22;
        var19_19.put(var20_21, var4_4 /* !! */ );
lbl163:
        // 2 sources

        var4_4 /* !! */  = (Method)var4_4 /* !! */ ;
        var21_22 = 0;
        var20_21 = null;
        var4_4 /* !! */ .invoke(null, (Object[])var18_18);
        var20_21 = var2_2.AFAdRevenueData;
        var4_4 /* !! */  = new Object[var11_11];
        var4_4 /* !! */ [0] = var20_21;
        var21_22 = -650568520;
        var18_18 = var21_22;
        var18_18 = var19_19.get(var18_18);
        if (var18_18 != null) ** GOTO lbl220
        var35_32 = ExpandableListView.getPackedPositionForChild((int)0, (int)0);
        var7_7 = (int)(var35_32 == var13_13 ? 0 : (var35_32 < var13_13 ? -1 : 1));
        var5_5 = 36 - var7_7;
        var37_33 = ViewConfiguration.getWindowTouchSlop() >> 8;
        var7_7 = TextUtils.indexOf((CharSequence)var3_3, (CharSequence)var3_3, (int)0, (int)0);
        var9_9 = 64180;
        var7_7 = (char)(var9_9 - var7_7);
        var18_18 = AFi1hSDK.getMonetizationNetwork(var5_5, var37_33, (char)var7_7);
        var18_18 = (Class)var18_18;
        var6_6 = "getRevenue";
        var33_31 = SystemClock.elapsedRealtimeNanos();
        var10_10 = (int)((var33_31 == var13_13 ? 0 : (var33_31 < var13_13 ? -1 : 1)) + 36);
        var7_7 = KeyEvent.normalizeMetaState((int)0);
        var9_9 = 48;
        var38_34 = TextUtils.indexOf((CharSequence)var3_3, (char)var9_9);
        var9_9 = 64181;
        var38_34 = (char)(var38_34 + var9_9);
        var3_3 = AFi1hSDK.getMonetizationNetwork(var10_10, var7_7, var38_34);
        var3_3 = (Class)var3_3;
        var30_28 = new Class[var11_11];
        var30_28[0] = var3_3;
        var18_18 = var18_18.getMethod(var6_6, var30_28);
        var20_21 = var21_22;
        var19_19.put(var20_21, var18_18);
lbl220:
        // 2 sources

        var18_18 = (Method)var18_18;
        var19_19 = null;
        var19_19 = var18_18.invoke(null, var4_4 /* !! */ );
        ((CountDownLatch)var19_19).countDown();
    }
}

