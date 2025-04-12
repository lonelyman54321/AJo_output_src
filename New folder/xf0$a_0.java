/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.web.chromecustomtab.KeepAliveService;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xf0$a
 */
public final class xf0$a_0 {
    public static void a(Context object, Intent intent) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intent intent2 = new Intent();
        object = object.getPackageName();
        String string2 = KeepAliveService.class.getCanonicalName();
        Intrinsics.checkNotNull(string2, "null cannot be cast to non-null type kotlin.String");
        intent2.setClassName((String)object, string2);
        intent.putExtra("android.support.customtabs.extra.KEEP_ALIVE", (Parcelable)intent2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(Context var0, CustomTabsIntent var1_1, Uri var2_2, int var3_3, Xf0$b var4_4) {
        block21: {
            block19: {
                block20: {
                    block22: {
                        var5_5 /* !! */  = var0;
                        var6_6 = var1_1;
                        var7_7 = var2_2;
                        var8_8 = var3_3;
                        var9_9 = var4_4;
                        var10_10 = "context";
                        Intrinsics.checkNotNullParameter(var0, (String)var10_10);
                        Intrinsics.checkNotNullParameter(var1_1, "customTabsIntent");
                        Intrinsics.checkNotNullParameter(var2_2, "uri");
                        var11_11 = yf0_2.a;
                        Intrinsics.checkNotNullParameter(var0, (String)var10_10);
                        var10_10 = yf0_2.b;
                        if (var10_10 != null) break block21;
                        var10_10 = var0.getPackageManager();
                        var12_12 = Uri.parse((String)"https://www.ajio.com");
                        var13_13 = "android.intent.action.VIEW";
                        var11_11 = new Intent(var13_13, (Uri)var12_12);
                        var12_12 = "android.intent.category.BROWSABLE";
                        var11_11.addCategory((String)var12_12);
                        var14_14 = Build.VERSION.SDK_INT;
                        var15_15 = 30;
                        if (var14_14 >= var15_15) {
                            var14_14 = 0x10000400;
                            var11_11.addFlags(var14_14);
                        }
                        var14_14 = 0;
                        var12_12 = null;
                        var13_13 = var10_10.resolveActivity((Intent)var11_11, 0);
                        if (var13_13 != null && (var13_13 = var13_13.activityInfo) != null) {
                            var13_13 = var13_13.packageName;
                        } else {
                            var15_15 = 0;
                            var13_13 = null;
                        }
                        var16_16 /* !! */  = var10_10.queryIntentActivities((Intent)var11_11, 0);
                        var17_17 = "queryIntentActivities(...)";
                        Intrinsics.checkNotNullExpressionValue(var16_16 /* !! */ , var17_17);
                        var18_18 = new ArrayList();
                        var16_16 /* !! */  = ((Iterable)var16_16 /* !! */ ).iterator();
                        while (var19_19 = var16_16 /* !! */ .hasNext()) {
                            var20_20 = (ResolveInfo)var16_16 /* !! */ .next();
                            var21_21 = new Intent();
                            var21_21.setAction("android.support.customtabs.action.CustomTabsService");
                            var22_22 = yn3_0.a;
                            var23_23 = var20_20.activityInfo.packageName;
                            var24_24 = var16_16 /* !! */ ;
                            var23_23 = kp1_0.c("Supported Apps With CustomTabs: ", (String)var23_23);
                            var16_16 /* !! */  = new Object[]{};
                            var22_22.a((String)var23_23, var16_16 /* !! */ );
                            var23_23 = var20_20.activityInfo.packageName;
                            var21_21.setPackage((String)var23_23);
                            var23_23 = var10_10.resolveService(var21_21, 0);
                            if (var23_23 != null) {
                                var23_23 = var20_20.activityInfo.packageName;
                                var16_16 /* !! */  = "packageName";
                                Intrinsics.checkNotNullExpressionValue(var23_23, (String)var16_16 /* !! */ );
                                var18_18.add(var23_23);
                            }
                            var16_16 /* !! */  = var24_24;
                        }
                        var25_25 = var18_18.isEmpty();
                        if (var25_25 != 0) {
                            while (true) {
                                var26_26 = 0;
                                var23_23 = null;
                                break block19;
                                break;
                            }
                        }
                        var25_25 = var18_18.size();
                        if (var25_25 != (var26_26 = 1)) break block22;
                        var10_10 = var18_18.get(0);
                        var23_23 = var10_10;
                        var23_23 = (String)var10_10;
                        break block19;
                    }
                    var25_25 = (int)TextUtils.isEmpty((CharSequence)var13_13);
                    if (var25_25 != 0) ** GOTO lbl-1000
                    var10_10 = yf0_2.a;
                    var10_10.getClass();
                    try {
                        var10_10 = var0.getPackageManager();
                        var26_26 = 64;
                        var10_10 = var10_10.queryIntentActivities((Intent)var11_11, var26_26);
                        Intrinsics.checkNotNullExpressionValue(var10_10, var17_17);
                        var27_27 = var10_10.size();
                        if (var27_27 == 0) break block20;
                        var10_10 = (Iterable)var10_10;
                        var10_10 = var10_10.iterator();
                        while ((var27_27 = (int)var10_10.hasNext()) != 0) {
                            var11_11 = var10_10.next();
                            var11_11 = (ResolveInfo)var11_11;
                            var23_23 = var11_11.filter;
                            if (var23_23 == null || (var28_28 = var23_23.countDataAuthorities()) == 0 || (var26_26 = var23_23.countDataPaths()) == 0 || (var11_11 = var11_11.activityInfo) == null) continue;
                            ** GOTO lbl-1000
                        }
                    }
                    catch (RuntimeException v0) {
                        var10_10 = yn3_0.a;
                        var11_11 = "Runtime exception while getting specialized handlers";
                        var23_23 = new Object[]{};
                        var10_10.d((String)var11_11, var23_23);
                    }
                }
                var25_25 = (int)CollectionsKt.F((Iterable)var18_18, var13_13);
                if (var25_25 != 0) {
                    var23_23 = var13_13;
                } else if ((var27_27 = (int)var18_18.contains(var10_10 = "com.android.chrome")) != 0) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var23_23 = var10_10;
                        break;
                    }
                } else {
                    if ((var27_27 = (int)var18_18.contains(var10_10 = "com.chrome.beta")) == 0 && (var27_27 = (int)var18_18.contains(var10_10 = "com.chrome.dev")) == 0 && (var27_27 = (int)var18_18.contains(var10_10 = "com.google.android.apps.chrome")) == 0) ** continue;
                    ** continue;
                }
            }
            yf0_2.b = var23_23;
            var10_10 = yn3_0.a;
            var11_11 = yf0_2.b;
            var13_13 = "CustomTabs packageNameToUse: ";
            var11_11 = kp1_0.c(var13_13, (String)var11_11);
            var12_12 = new Object[]{};
            var10_10.a((String)var11_11, var12_12);
            var10_10 = yf0_2.b;
        }
        if (var10_10 == null) {
            var9_9.a(var5_5 /* !! */ , (Uri)var7_7, var8_8);
            return;
        }
        try {
            var27_27 = Build.VERSION.SDK_INT;
            var14_14 = 22;
            if (var27_27 >= var14_14) {
                var11_11 = var6_6.intent;
                var12_12 = "android.intent.extra.REFERRER";
                var13_13 = var0.getPackageName();
                var23_23 = new StringBuilder();
                var16_16 /* !! */  = "2//";
                var23_23.append((String)var16_16 /* !! */ );
                var23_23.append(var13_13);
                var13_13 = var23_23.toString();
                var13_13 = Uri.parse((String)var13_13);
                var11_11.putExtra((String)var12_12, (Parcelable)var13_13);
            }
            var11_11 = var6_6.intent;
            var11_11.setPackage((String)var10_10);
            var6_6.launchUrl(var5_5 /* !! */ , (Uri)var7_7);
        }
        catch (ActivityNotFoundException v1) {
            var9_9.a(var5_5 /* !! */ , (Uri)var7_7, var8_8);
            return;
        }
        var17_17 = var2_2.toString();
        Intrinsics.checkNotNullExpressionValue(var17_17, "toString(...)");
        var29_29 = var5_5 /* !! */ ;
        var5_5 /* !! */  = new Bundle();
        var5_5 /* !! */ .putString("browser_type", "in-app chrome browser");
        var18_18 = var5_5 /* !! */ ;
        var30_30 = 65023;
        var19_19 = false;
        var21_21 = null;
        var22_22 = null;
        var31_31 = 0L;
        var5_5 /* !! */  = new AnalyticsData(null, null, null, var31_31, null, null, null, null, null, (Bundle)var29_29, null, null, null, null, null, null, var30_30, null);
        var6_6 = AnalyticsManager.Companion;
        var7_7 = var6_6.getInstance();
        var12_12 = var7_7.getGtmEvents();
        var18_18 = av_0.a((AnalyticsManager$Companion)var6_6);
        var16_16 /* !! */  = "external link clicks";
        var13_13 = "user interaction";
        var23_23 = "user_interaction";
        var20_20 = var5_5 /* !! */ ;
        var12_12.gtmEventsToGaWithCategory(var13_13, (String)var23_23, (String)var16_16 /* !! */ , var17_17, (String)var18_18, (AnalyticsData)var5_5 /* !! */ );
    }
}

