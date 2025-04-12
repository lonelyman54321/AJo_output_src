/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

public final class zzbmw
implements OnH5AdsEventListener {
    public final /* synthetic */ WebView zza;

    public /* synthetic */ zzbmw(WebView webView) {
        this.zza = webView;
    }

    public final void onH5AdsEvent(String string2) {
        this.zza.evaluateJavascript(string2, null);
    }
}

