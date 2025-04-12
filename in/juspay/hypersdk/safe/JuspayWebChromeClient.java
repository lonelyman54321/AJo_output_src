/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 */
package in.juspay.hypersdk.safe;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.safe.Godel;

public class JuspayWebChromeClient
extends WebChromeClient {
    private final Godel godelManager;

    public JuspayWebChromeClient(Godel godel) {
        this.godelManager = godel;
    }

    public void onProgressChanged(WebView object, int n3) {
        super.onProgressChanged((WebView)object, n3);
        object = this.godelManager.getDuiInterface();
        String string2 = String.valueOf(n3);
        ((DuiInterface)object).invokeFnInDUIWebview("onProgressChanged", string2);
    }
}

