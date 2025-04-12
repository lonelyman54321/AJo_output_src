/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.jio.jioads.multiad;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.cdnlogging.a;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.multiad.H;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;

public final class C
extends WebViewClient {
    public final /* synthetic */ H a;

    public C(H h3) {
        this.a = h3;
    }

    public final void onPageFinished(WebView object, String object2) {
        object = new StringBuilder();
        object2 = this.a;
        Object object3 = ((H)object2).f;
        j_0.k((StringBuilder)object, (String)object3, ": JS loading Finished");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = new Handler();
        object3 = new pw1_0(object2, 1);
        object.postDelayed((Runnable)object3, (long)100);
    }

    public final void onPageStarted(WebView object, String object2, Bitmap object3) {
        super.onPageStarted(object, (String)object2, object3);
        object = new StringBuilder();
        object2 = this.a;
        object3 = ((H)object2).f;
        j_0.k((StringBuilder)object, (String)object3, ": JS loading started");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        ((H)object2).c = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onReceivedError(WebView webView, int n3, String string2, String string3) {
        super.onReceivedError(webView, n3, string2, string3);
        Object object = new StringBuilder();
        H h3 = this.a;
        Object object2 = h3.f;
        String string4 = string2;
        X50.a((StringBuilder)object, (String)object2, ": Error while executing JS: ", string2, " - ");
        w12_0.b(n3, "message", (StringBuilder)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        h3.getClass();
        object2 = Utility.INSTANCE;
        Activity activity = h3.a;
        d d2 = d.a;
        object = JioAdError$JioAdErrorType.ERROR_IN_JS_TARGETING;
        String string5 = ((JioAdError$JioAdErrorType)((Object)object)).getErrorTitle();
        Object object3 = p.t;
        object3 = object3 != null ? new a() : null;
        Object object4 = object3;
        Boolean bl2 = h3.b;
        String string6 = h3.a.getPackageName();
        String string7 = ((JioAdError$JioAdErrorType)((Object)object)).getErrorCode();
        ((Utility)object2).logError((Context)activity, "", d2, string5, "Exception while executing JS", (a)object4, "CampaignQualifierHandler-initiateWebView", bl2, string6, string7, false);
        h3.a();
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Object object;
        Object object2;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        String string2 = "message";
        String string3 = ": Error while executing JS: ";
        a a2 = null;
        H h3 = this.a;
        if (n3 >= n4) {
            object2 = new StringBuilder();
            object = h3.f;
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(string3);
            if (webResourceError != null) {
                object = webResourceError.getDescription();
            } else {
                n4 = 0;
                object = null;
            }
            ((StringBuilder)object2).append(object);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
        } else {
            object2 = new StringBuilder();
            object = h3.f;
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(string3);
            if (webResourceError != null) {
                object = webResourceError.toString();
            } else {
                n4 = 0;
                object = null;
            }
            ir3_0.b((StringBuilder)object2, (String)object, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
        }
        h3.getClass();
        Utility utility = Utility.INSTANCE;
        Activity activity = h3.a;
        d d2 = d.a;
        object2 = JioAdError$JioAdErrorType.ERROR_IN_JS_TARGETING;
        String string4 = ((JioAdError$JioAdErrorType)((Object)object2)).getErrorTitle();
        object = p.t;
        if (object != null) {
            a2 = new a();
        }
        Boolean bl2 = h3.b;
        String string5 = h3.a.getPackageName();
        String string6 = ((JioAdError$JioAdErrorType)((Object)object2)).getErrorCode();
        utility.logError((Context)activity, "", d2, string4, "Exception while executing JS", a2, "CampaignQualifierHandler-initiateWebView", bl2, string5, string6, false);
        h3.a();
    }
}

