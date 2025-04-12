/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.ril.ajio.gamezone;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.gamezone.GameZoneWebViewActivity;

public final class GameZoneWebViewActivity$b
extends WebViewClient {
    public final /* synthetic */ GameZoneWebViewActivity a;

    public GameZoneWebViewActivity$b(GameZoneWebViewActivity gameZoneWebViewActivity) {
        this.a = gameZoneWebViewActivity;
    }

    public final void onPageFinished(WebView object, String string2) {
        super.onPageFinished((WebView)object, string2);
        object = yn3_0.a;
        string2 = kp1_0.c("onPageFinished>>>>>>>>>", string2);
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).a(string2, objectArray);
        this.a.stopLoader();
    }

    public final void onPageStarted(WebView object, String string2, Bitmap object2) {
        super.onPageStarted((WebView)object, string2, (Bitmap)object2);
        object = this.a;
        object2 = ((GameZoneWebViewActivity)object).D0;
        if (object2 != null) {
            ((AjioLoaderView)((Object)object2)).startLoader();
        }
        object2 = yn3_0.a;
        string2 = kp1_0.c("onPageStarted>>>>>>>>>", string2);
        Object[] objectArray = new Object[]{};
        ((yn3$a)object2).a(string2, objectArray);
        ((GameZoneWebViewActivity)object).F2();
    }

    public final void onReceivedError(WebView object, WebResourceRequest object2, WebResourceError objectArray) {
        int n3;
        super.onReceivedError((WebView)object, (WebResourceRequest)object2, (WebResourceError)objectArray);
        object = yn3_0.a;
        Object object3 = new Object[]{};
        Object object4 = "---- GameZoneWebViewActivity onReceivedError: ---- starts";
        ((yn3$a)object).a((String)object4, object3);
        object3 = null;
        if (object2 != null) {
            object2 = object2.getUrl();
        } else {
            n3 = 0;
            object2 = null;
        }
        object2 = og3_1.a((Uri)object2, "GameZoneWebViewActivity onReceivedError: Url");
        object4 = new Object[]{};
        ((yn3$a)object).a((String)object2, (Object[])object4);
        if (objectArray != null) {
            object2 = objectArray.getDescription();
        } else {
            n3 = 0;
            object2 = null;
        }
        String string2 = "GameZoneWebViewActivity onReceivedError: Error Desc";
        object4 = new StringBuilder(string2);
        ((StringBuilder)object4).append(object2);
        object2 = ((StringBuilder)object4).toString();
        object4 = new Object[]{};
        ((yn3$a)object).a((String)object2, (Object[])object4);
        if (objectArray != null) {
            n3 = objectArray.getErrorCode();
            object3 = n3;
        }
        object2 = new StringBuilder("GameZoneWebViewActivity onReceivedError: Error Code");
        ((StringBuilder)object2).append(object3);
        object2 = ((StringBuilder)object2).toString();
        objectArray = new Object[]{};
        ((yn3$a)object).a((String)object2, objectArray);
        objectArray = new Object[]{};
        ((yn3$a)object).a("---- GameZoneWebViewActivity onReceivedError: ---- ends", objectArray);
    }

    public final boolean shouldOverrideUrlLoading(WebView object, WebResourceRequest webResourceRequest) {
        Object object2;
        object = yn3_0.a;
        String string2 = null;
        object2 = webResourceRequest != null && (object2 = webResourceRequest.getUrl()) != null ? object2.toString() : null;
        object2 = kp1_0.c("shouldOverrideUrlLoading>>>>>>>>>", (String)object2);
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).a((String)object2, objectArray);
        if (webResourceRequest != null && (object = webResourceRequest.getUrl()) != null) {
            string2 = object.toString();
        }
        object = GameZoneWebViewActivity.Companion;
        this.a.D2(string2);
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView object, String string2) {
        object = yn3_0.a;
        String string3 = kp1_0.c("shouldOverrideUrlLoading>>11>>>>>>>", string2);
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).a(string3, objectArray);
        object = GameZoneWebViewActivity.Companion;
        this.a.D2(string2);
        return true;
    }
}

