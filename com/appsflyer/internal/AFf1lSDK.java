/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.net.Uri
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.TypedValue
 *  android.view.Gravity
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.widget.ExpandableListView
 */
package com.appsflyer.internal;

import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1vSDK;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFc1sSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1lSDK$AFa1uSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

public final class AFf1lSDK
extends AFf1oSDK {
    public AFf1lSDK$AFa1uSDK component3;
    private String copy;
    private String copydefault;
    private final boolean equals;
    private String hashCode;
    private final AFe1qSDK toString;
    private final UUID values;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AFf1lSDK(AFd1kSDK var1_1, UUID var2_2, Uri var3_3) {
        block23: {
            block22: {
                var4_4 = this;
                var5_5 = 2;
                var6_6 = AFf1zSDK.areAllFieldsValid;
                var7_7 = 1;
                var8_8 /* !! */  = new AFf1zSDK[var7_7];
                var9_9 = AFf1zSDK.getRevenue;
                var10_10 = false;
                var8_8 /* !! */ [0] = var9_9;
                var9_9 = var2_2.toString();
                var11_11 = var1_1;
                super((AFf1zSDK)var6_6, var8_8 /* !! */ , var1_1, (String)var9_9);
                var6_6 = var1_1.getCurrencyIso4217Code();
                this.toString = var6_6;
                var6_6 = var2_2;
                this.values = var2_2;
                var6_6 = var3_3.getHost();
                var12_12 = AFc1sSDK.getRevenue((String)var6_6);
                if (var12_12 || (var12_12 = AFc1sSDK.getRevenue((String)(var6_6 = var3_3.getPath())))) break block22;
                var6_6 = var1_1.d();
                break block23;
            }
lbl23:
            // 4 sources

            while (true) {
                var4_4.equals = var10_10;
                return;
            }
        }
        ** try [egrp 1[TRYBLOCK] [5 : 121->191)] { 
lbl-1000:
        // 1 sources

        {
            catch (Throwable var32_35) {
                var6_6 = var32_35.getCause();
                if (var6_6 != null) {
                    throw var6_6;
                }
                throw var32_35;
            }
        }
lbl33:
        // 1 sources

        ** GOTO lbl36
        {
            block24: {
                catch (Exception var32_31) {
                    break block24;
                }
lbl36:
                // 1 sources

                var8_8 /* !! */  = new Object[var5_5];
                var8_8 /* !! */ [var7_7] = var6_6;
                var8_8 /* !! */ [0] = var3_3;
                var6_6 = AFa1vSDK.registerClient;
                var13_13 = 94011772;
                var11_11 = var13_13;
                var11_11 = var6_6.get(var11_11);
                var14_14 = '\u955d';
                var15_15 = "";
                if (var11_11 != null) ** GOTO lbl59
                var16_16 = TextUtils.indexOf((CharSequence)var15_15, (CharSequence)var15_15, (int)0);
                var16_16 = 37 - var16_16;
                var17_17 = TextUtils.getOffsetBefore((CharSequence)var15_15, (int)0) + 233;
                var18_18 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + var14_14;
                {
                    var11_11 = AFa1vSDK.getRevenue(var16_16, var17_17, (char)var18_18);
                    var11_11 = (Class)var11_11;
                    var19_19 = new Class[var5_5];
                    var19_19[0] = var20_20 /* !! */  = Uri.class;
                    var19_19[var7_7] = var20_20 /* !! */  = AFc1kSDK.class;
                    var11_11 = var11_11.getDeclaredConstructor(var19_19);
                    var9_9 = var13_13;
                    var6_6.put(var9_9, var11_11);
lbl59:
                    // 2 sources

                    var11_11 = (Constructor)var11_11;
                    var8_8 /* !! */  = var11_11.newInstance((Object[])var8_8 /* !! */ );
                    var13_13 = 503513178;
                }
                {
                    var11_11 = var13_13;
                    var11_11 = var6_6.get(var11_11);
                    var17_17 = 0;
                    var19_19 = null;
                    if (var11_11 != null) ** GOTO lbl79
                    var16_16 = Color.alpha((int)0) + 37;
                    var21_21 = TextUtils.indexOf((CharSequence)var15_15, (CharSequence)var15_15);
                    var21_21 = 233 - var21_21;
                    var18_18 = View.resolveSize((int)0, (int)0) + var14_14;
                }
                var14_14 = (char)var18_18;
                {
                    var11_11 = AFa1vSDK.getRevenue(var16_16, var21_21, var14_14);
                    var11_11 = (Class)var11_11;
                    var22_22 = "getMonetizationNetwork";
                    var11_11 = var11_11.getMethod((String)var22_22, null);
                    var9_9 = var13_13;
                    var6_6.put(var9_9, var11_11);
lbl79:
                    // 2 sources

                    var11_11 = (Method)var11_11;
                    var8_8 /* !! */  = var11_11.invoke((Object)var8_8 /* !! */ , null);
                    var13_13 = 1776451557;
                }
                {
                    var11_11 = var13_13;
                    var11_11 = var6_6.get(var11_11);
                    var14_14 = '\u9151';
                    var23_23 = 0L;
                    if (var11_11 != null) ** GOTO lbl100
                    var16_16 = ExpandableListView.getPackedPositionChild((long)var23_23);
                    var16_16 = 51 - var16_16;
                    var21_21 = View.getDefaultSize((int)0, (int)0);
                    var21_21 = 270 - var21_21;
                }
                {
                    var25_24 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                }
                var25_24 = (char)(var14_14 - var25_24);
                {
                    var11_11 = AFa1vSDK.getRevenue(var16_16, var21_21, var25_24);
                    var11_11 = (Class)var11_11;
                    var15_15 = "getRevenue";
                    var11_11 = var11_11.getMethod((String)var15_15, null);
                    var9_9 = var13_13;
                    var6_6.put(var9_9, var11_11);
lbl100:
                    // 2 sources

                    var11_11 = (Method)var11_11;
                    var9_9 = var11_11.invoke((Object)var8_8 /* !! */ , null);
                    var9_9 = (Boolean)var9_9;
                    var13_13 = (int)var9_9.booleanValue();
                    var16_16 = -1029327759;
                }
                {
                    var15_15 = var16_16;
                    var15_15 = var6_6.get(var15_15);
                    if (var15_15 != null) ** GOTO lbl125
                    var21_21 = 0;
                    var15_15 = null;
                    var26_25 = TypedValue.complexToFraction((int)0, (float)0.0f, (float)0.0f);
                }
                cfr_temp_0 = var26_25 - 0.0f;
                var21_21 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                var21_21 = 52 - var21_21;
                {
                    var27_26 = SystemClock.uptimeMillis();
                    var29_27 = (var27_26 == var23_23 ? 0 : (var27_26 < var23_23 ? -1 : 1)) + 269;
                    var18_18 = Gravity.getAbsoluteGravity((int)0, (int)0);
                }
                var14_14 = (char)(var14_14 - var18_18);
                {
                    var22_22 = AFa1vSDK.getRevenue(var21_21, (int)var29_27, var14_14);
                    var22_22 = (Class)var22_22;
                    var15_15 = "getMediationNetwork";
                    var15_15 = var22_22.getMethod((String)var15_15, null);
                    var11_11 = var16_16;
                    var6_6.put(var11_11, var15_15);
lbl125:
                    // 2 sources

                    var15_15 = (Method)var15_15;
                    var6_6 = var15_15.invoke((Object)var8_8 /* !! */ , null);
                    var6_6 = (Boolean)var6_6;
                    var10_10 = var6_6.booleanValue();
                }
                var6_6 = var3_3.getPath();
                var8_8 /* !! */  = "/";
                var6_6 = var6_6.split((String)var8_8 /* !! */ );
                if (var13_13 == 0 || (var30_28 = ((Object)var6_6).length) != (var13_13 = 3)) ** GOTO lbl23
                var4_4.hashCode = var31_29 = var6_6[var7_7];
                var4_4.copy = var32_30 = var6_6[var5_5];
                var4_4.copydefault = var32_30 = var3_3.toString();
                ** GOTO lbl23
            }
            var6_6 = "OneLinkValidator: reflection init failed";
        }
        AFLogger.afErrorLogForExcManagerOnly((String)var6_6, var32_31);
        ** while (true)
    }

    public final boolean a_() {
        return false;
    }

    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public final boolean copy() {
        return this.equals;
    }

    public final boolean copydefault() {
        return false;
    }

    public final boolean equals() {
        String string2;
        String string3 = this.hashCode;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        return !bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(string3 = this.copy))) && !(bl2 = (string3 = this.hashCode).equals(string2 = "app"));
    }

    public final AFe1tSDK getMediationNetwork(String string2) {
        AFe1qSDK aFe1qSDK = this.toString;
        String string3 = this.hashCode;
        String string4 = this.copy;
        UUID uUID = this.values;
        Object[] objectArray = new Object[]{aFe1qSDK, string3, string4, uUID, string2};
        int n3 = System.identityHashCode(aFe1qSDK);
        return (AFe1tSDK)AFe1qSDK.AFAdRevenueData(objectArray, -15930200, 15930202, n3);
    }

    public final boolean getMediationNetwork() {
        return false;
    }

    public final long getMonetizationNetwork() {
        return 3000L;
    }

    public final void getRevenue() {
        super.getRevenue();
        AFf1lSDK$AFa1uSDK aFf1lSDK$AFa1uSDK = this.component3;
        if (aFf1lSDK$AFa1uSDK != null) {
            Object object = this.getMediationNetwork;
            AFe1cSDK aFe1cSDK = AFe1cSDK.getRevenue;
            if (object == aFe1cSDK && (object = this.component4) != null) {
                object = (Map)((AFe1kSDK)object).getBody();
                aFf1lSDK$AFa1uSDK.getRevenue((Map)object);
                return;
            }
            object = this.component1();
            boolean bl2 = object instanceof ParsingException;
            Object object2 = "Can't get OneLink data";
            if (bl2) {
                boolean bl3 = ((AFe1kSDK)(object = ((ParsingException)object).getRawResponse())).isSuccessful();
                if (bl3) {
                    aFf1lSDK$AFa1uSDK.getCurrencyIso4217Code("Can't parse one link data");
                    return;
                }
                object = this.copydefault;
                if (object != null) {
                    object2 = object;
                }
                aFf1lSDK$AFa1uSDK.getCurrencyIso4217Code((String)object2);
                return;
            }
            object = this.copydefault;
            if (object != null) {
                object2 = object;
            }
            aFf1lSDK$AFa1uSDK.getCurrencyIso4217Code((String)object2);
        }
    }
}

