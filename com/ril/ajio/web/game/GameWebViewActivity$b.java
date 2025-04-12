/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.ril.ajio.web.game;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ril.ajio.web.game.GameWebViewActivity;

public final class GameWebViewActivity$b
extends WebViewClient {
    public final /* synthetic */ GameWebViewActivity a;

    public GameWebViewActivity$b(GameWebViewActivity gameWebViewActivity) {
        this.a = gameWebViewActivity;
    }

    public final void onReceivedError(WebView object, WebResourceRequest object2, WebResourceError objectArray) {
        int n3;
        super.onReceivedError((WebView)object, (WebResourceRequest)object2, (WebResourceError)objectArray);
        object = yn3_0.a;
        Object object3 = new Object[]{};
        Object object4 = "---- GameWebViewActivity onReceivedError: ---- starts";
        ((yn3$a)object).a((String)object4, object3);
        object3 = null;
        if (object2 != null && (object2 = object2.getUrl()) != null) {
            object2 = object2.toString();
        } else {
            n3 = 0;
            object2 = null;
        }
        object2 = kp1_0.c("GameWebViewActivity onReceivedError: Url", (String)object2);
        object4 = new Object[]{};
        ((yn3$a)object).a((String)object2, (Object[])object4);
        if (objectArray != null) {
            object2 = objectArray.getDescription();
        } else {
            n3 = 0;
            object2 = null;
        }
        String string2 = "GameWebViewActivity onReceivedError: Error Desc";
        object4 = new StringBuilder(string2);
        ((StringBuilder)object4).append(object2);
        object2 = ((StringBuilder)object4).toString();
        object4 = new Object[]{};
        ((yn3$a)object).a((String)object2, (Object[])object4);
        if (objectArray != null) {
            n3 = objectArray.getErrorCode();
            object3 = n3;
        }
        object2 = new StringBuilder("GameWebViewActivity onReceivedError: Error Code");
        ((StringBuilder)object2).append(object3);
        object2 = ((StringBuilder)object2).toString();
        objectArray = new Object[]{};
        ((yn3$a)object).a((String)object2, objectArray);
        objectArray = new Object[]{};
        ((yn3$a)object).a("---- GameWebViewActivity onReceivedError: ---- ends", objectArray);
    }

    public final boolean shouldOverrideUrlLoading(WebView object, WebResourceRequest object2) {
        object = object2 != null && (object = object2.getUrl()) != null ? object.toString() : null;
        object2 = GameWebViewActivity.Companion;
        this.a.y2((String)object);
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        this.a.y2(string2);
        return true;
    }
}

