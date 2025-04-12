/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package in.juspay.hypersdk.safe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;

public class JuspayWebView
extends WebView {
    private static final String LOG_TAG = "JuspayWebView";
    private Integer keyboardInputType = null;
    private long lastKeyboardTypeSetTime = 0L;
    private WebChromeClient webChromeClient;
    private WebViewClient webViewClient;

    public JuspayWebView(Context context) {
        super(context);
    }

    public JuspayWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JuspayWebView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public JuspayWebView(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
    }

    public static /* synthetic */ void a(String string2, JuspayWebView juspayWebView) {
        juspayWebView.lambda$addJsToWebView$0(string2);
    }

    private /* synthetic */ void lambda$addJsToWebView$0(String string2) {
        this.evaluateJavascript(string2, null);
    }

    public void addJsToWebView(String string2) {
        zn_0 zn_02 = new zn_0(1, (Object)this, string2);
        ExecutorManager.runOnMainThread(zn_02);
    }

    public WebChromeClient getWebChromeClient() {
        return this.webChromeClient;
    }

    public WebViewClient getWebViewClient() {
        return this.webViewClient;
    }

    public void loadData(String string2, String string3, String string4) {
        super.loadData(string2, string3, string4);
    }

    public void loadDataWithBaseURL(String string2, String string3, String string4, String string5, String string6) {
        super.loadDataWithBaseURL(string2, string3, string4, string5, string6);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int n3;
        int n4;
        int n7;
        JuspayLogger.d(LOG_TAG, "Creating input connection");
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        Integer n8 = this.keyboardInputType;
        if (n8 != null) {
            long l2 = System.currentTimeMillis();
            long l3 = this.lastKeyboardTypeSetTime;
            n7 = 300;
            long l4 = (l2 -= l3) - (l3 = (long)n7);
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object <= 0) {
                n4 = editorInfo.inputType;
                Integer n10 = this.keyboardInputType;
                n3 = n10;
                editorInfo.inputType = n4 |= n3;
            }
        }
        if ((n3 = (n4 = editorInfo.inputType) & 1) == (n7 = 1)) {
            editorInfo.inputType = n4 |= 0xE0;
        }
        return inputConnection;
    }

    public void requestNumericKeyboardShow() {
        Integer n3;
        this.keyboardInputType = n3 = Integer.valueOf(2);
        n3 = (InputMethodManager)this.getContext().getSystemService("input_method");
        this.setLastKeyboardTypeSetTime();
        n3.restartInput((View)this);
        n3.showSoftInput((View)this, 1);
    }

    public void requestPasswordKeyboardShow() {
        Integer n3;
        this.keyboardInputType = n3 = Integer.valueOf(225);
        n3 = (InputMethodManager)this.getContext().getSystemService("input_method");
        this.setLastKeyboardTypeSetTime();
        n3.restartInput((View)this);
        n3.showSoftInput((View)this, 1);
    }

    public void requestPhoneKeyboardShow() {
        Integer n3;
        this.keyboardInputType = n3 = Integer.valueOf(3);
        n3 = (InputMethodManager)this.getContext().getSystemService("input_method");
        this.setLastKeyboardTypeSetTime();
        n3.restartInput((View)this);
        n3.showSoftInput((View)this, 1);
    }

    public void setDefaultWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
    }

    public void setDefaultWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
    }

    public void setLastKeyboardTypeSetTime() {
        long l2;
        this.lastKeyboardTypeSetTime = l2 = System.currentTimeMillis();
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.webChromeClient = webChromeClient;
        super.setWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.webViewClient = webViewClient;
        super.setWebViewClient(webViewClient);
    }
}

