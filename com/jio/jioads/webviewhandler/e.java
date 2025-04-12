/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.jio.jioads.webviewhandler;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.webviewhandler.InAppWebView;
import kotlin.jvm.internal.Intrinsics;

public final class e
extends WebViewClient {
    public final /* synthetic */ InAppWebView a;

    public e(InAppWebView inAppWebView) {
        this.a = inAppWebView;
    }

    public final void onPageFinished(WebView object, String string2) {
        super.onPageFinished(object, string2);
        l_0.h("InAppWebView onPageFinished: ", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.a;
        string2 = object.c;
        if (string2 != null) {
            Intrinsics.checkNotNull(string2);
            int n3 = string2.getVisibility();
            if (n3 == 0) {
                object = object.c;
                Intrinsics.checkNotNull(object);
                n3 = 8;
                object.setVisibility(n3);
            }
        }
    }

    public final void onPageStarted(WebView object, String string2, Bitmap bitmap) {
        super.onPageStarted(object, string2, bitmap);
        l_0.h("InAppWebView onPageStarted: ", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.a.c;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            string2 = null;
            object.setVisibility(0);
        }
    }

    public final void onReceivedError(WebView object, WebResourceRequest object2, WebResourceError webResourceError) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "request");
        String string2 = "error";
        Intrinsics.checkNotNullParameter(webResourceError, string2);
        super.onReceivedError(object, object2, webResourceError);
        object = new StringBuilder("InAppWebView onReceivedError.Error code: ");
        int n3 = webResourceError.getErrorCode();
        object.append(n3);
        object.append(" and error description: ");
        object2 = webResourceError.getDescription();
        object.append(object2);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.a;
        object2 = object.c;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            n3 = object2.getVisibility();
            if (n3 == 0) {
                object = object.c;
                Intrinsics.checkNotNull(object);
                n3 = 8;
                object.setVisibility(n3);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView object, WebResourceRequest webResourceRequest) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(webResourceRequest, "request");
        object = new StringBuilder("webview full screen activity shouldOverrideUrlLoading: ");
        webResourceRequest = webResourceRequest.getUrl();
        object.append(webResourceRequest);
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return false;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        l_0.h("webview full screen activity shouldOverrideUrlLoading: ", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        return false;
    }
}

