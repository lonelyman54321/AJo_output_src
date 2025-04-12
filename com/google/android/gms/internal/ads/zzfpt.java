/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzfps;

public final class zzfpt
extends zzfps {
    public zzfpt(String string2, WebView webView) {
        super(string2);
        string2 = webView.getSettings();
        boolean bl2 = string2.getJavaScriptEnabled();
        if (!bl2) {
            string2 = webView.getSettings();
            boolean bl3 = true;
            string2.setJavaScriptEnabled(bl3);
        }
        this.zzm(webView);
    }
}

