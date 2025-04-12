/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  org.json.JSONObject
 */
package com.jio.jioads.webviewhandler;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.Constants$SDKVersion;
import com.jio.jioads.utils.Constants$SDKVersion$Companion;
import com.jio.jioads.webviewhandler.InAppWebView;
import java.net.URLEncoder;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class c {
    public final /* synthetic */ InAppWebView a;

    public c(InAppWebView inAppWebView) {
        this.a = inAppWebView;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getMetaDetails() {
        Object object;
        Object object2;
        JSONObject jSONObject;
        InAppWebView inAppWebView;
        block8: {
            Exception exception2;
            block7: {
                int n3;
                Object[] objectArray;
                int n4;
                Object object3;
                Object object4;
                Object object5;
                String string2;
                Object object6;
                int n7;
                int n8;
                int n10;
                block6: {
                    n10 = 3;
                    n8 = 2;
                    n7 = 1;
                    object6 = null;
                    string2 = "gts";
                    inAppWebView = this.a;
                    ((Object)((Object)inAppWebView)).getClass();
                    jSONObject = inAppWebView.j;
                    object5 = "asi";
                    try {
                        object4 = inAppWebView.g;
                        jSONObject.put(object5, object4);
                        object5 = "ifa";
                        object4 = inAppWebView.f;
                        jSONObject.put(object5, object4);
                        object5 = "vr";
                        object4 = Constants$SDKVersion.Companion;
                        object4 = ((Constants$SDKVersion$Companion)object4).getLIBRARY_VERSION();
                        jSONObject.put(object5, object4);
                        object5 = "ai";
                        object4 = inAppWebView.e;
                        object3 = "mContext";
                        n4 = 0;
                        objectArray = null;
                        if (object4 != null) break block6;
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n3 = 0;
                        object4 = null;
                    }
                    catch (Exception exception2) {
                        break block7;
                    }
                }
                object4 = object4.getPackageName();
                jSONObject.put(object5, object4);
                object5 = inAppWebView.e;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    object5 = null;
                }
                object5 = object5.getPackageManager();
                object4 = inAppWebView.e;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    object4 = null;
                }
                object4 = object4.getPackageName();
                object5 = object5.getPackageInfo((String)object4, 0);
                object4 = "av";
                object5 = ((PackageInfo)object5).versionName;
                jSONObject.put((String)object4, object5);
                inAppWebView.a();
                inAppWebView.c();
                object5 = "osv";
                object4 = Build.VERSION.RELEASE;
                jSONObject.put(object5, object4);
                object5 = "mn";
                object4 = Build.MODEL;
                Object object7 = "UTF-8";
                object4 = URLEncoder.encode((String)object4, object7);
                jSONObject.put(object5, object4);
                object5 = "br";
                object4 = Build.BRAND;
                jSONObject.put(object5, object4);
                object5 = "ua";
                object4 = Utility.INSTANCE;
                object7 = inAppWebView.e;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    object7 = null;
                }
                object4 = ((Utility)object4).getUserAgent((Context)object7);
                jSONObject.put(object5, object4);
                object5 = "ccb";
                object4 = inAppWebView.h;
                jSONObject.put(object5, object4);
                object5 = inAppWebView.e;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    object5 = null;
                }
                object4 = "context";
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object4 = "common_prefs";
                object5 = j_0.o((Context)object5, (String)object4);
                object4 = "lat";
                long l2 = 0L;
                long l3 = object5.getLong((String)object4, l2);
                double d2 = Double.longBitsToDouble(l3);
                object4 = d2;
                object3 = "lon";
                long l4 = object5.getLong((String)object3, l2);
                double d5 = Double.longBitsToDouble(l4);
                object3 = d5;
                Object object8 = "accu";
                float f5 = object5.getFloat((String)object8, 0.0f);
                object8 = Float.valueOf(f5);
                l2 = object5.getLong(string2, l2);
                object7 = l2;
                String string3 = "provider";
                object5 = object5.getString(string3, null);
                n4 = 5;
                objectArray = new Object[n4];
                objectArray[0] = object4;
                objectArray[n7] = object3;
                objectArray[n8] = object8;
                objectArray[n10] = object7;
                n3 = 4;
                objectArray[n3] = object5;
                object5 = "la";
                object6 = objectArray[0];
                jSONObject.put(object5, object6);
                object6 = "lo";
                Object object9 = objectArray[n7];
                jSONObject.put((String)object6, object9);
                object9 = "acc";
                object2 = objectArray[n8];
                jSONObject.put((String)object9, object2);
                object = objectArray[n10];
                jSONObject.put(string2, object);
                break block8;
            }
            object2 = new StringBuilder("Exception while creating metaData json: ");
            Utility utility = Utility.INSTANCE;
            b.c(utility, exception2, (StringBuilder)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
        object = new StringBuilder();
        object2 = inAppWebView.g;
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(":getMetaDetails() json: ");
        ((StringBuilder)object).append(jSONObject);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public final String getReplacedMacrosClickUrl(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        return string2;
    }

    public final void launchBrowser(String string2) {
        this.a.b(string2);
    }
}

