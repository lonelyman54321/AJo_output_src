/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ConsoleMessage
 *  android.webkit.WebChromeClient
 */
package in.juspay.hypersdk.core;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import in.juspay.hypersdk.core.DynamicUI;

class DynamicUI$1
extends WebChromeClient {
    final /* synthetic */ DynamicUI this$0;

    public DynamicUI$1(DynamicUI dynamicUI) {
        this.this$0 = dynamicUI;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }
}

