/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
package com.facebook.internal;

import android.webkit.WebView;

public final class WebDialog$setUpWebView$1
extends WebView {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onWindowFocusChanged(boolean bl2) {
        try {
            super.onWindowFocusChanged(bl2);
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }
}

