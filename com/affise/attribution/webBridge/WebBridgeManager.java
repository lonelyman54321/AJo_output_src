/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.affise.attribution.webBridge;

import android.webkit.WebView;
import com.affise.attribution.events.StoreEventUseCase;
import com.affise.attribution.modules.AffiseKeyValue;
import com.affise.attribution.modules.AffiseModuleManager;
import com.affise.attribution.modules.AffiseModules;
import com.affise.attribution.webBridge.WebBridgeManager$Companion;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class WebBridgeManager {
    public static final WebBridgeManager$Companion Companion;
    public static final String WEB_BRIDGE_JAVASCRIPT_INTERFACE_NAME = "AffiseBridge";
    private final AffiseModuleManager moduleManager;
    private final StoreEventUseCase storeEventUseCase;
    private WebView webView;

    static {
        WebBridgeManager$Companion webBridgeManager$Companion;
        Companion = webBridgeManager$Companion = new WebBridgeManager$Companion(null);
    }

    public WebBridgeManager(StoreEventUseCase storeEventUseCase2, AffiseModuleManager affiseModuleManager) {
        Intrinsics.checkNotNullParameter(storeEventUseCase2, "storeEventUseCase");
        Intrinsics.checkNotNullParameter(affiseModuleManager, "moduleManager");
        this.storeEventUseCase = storeEventUseCase2;
        this.moduleManager = affiseModuleManager;
    }

    public static /* synthetic */ void a(WebBridgeManager webBridgeManager2, String string2, List list) {
        WebBridgeManager.getStatus$lambda$5(webBridgeManager2, string2, list);
    }

    public static /* synthetic */ void b(WebBridgeManager webBridgeManager2, String string2, String string3, String string4) {
        WebBridgeManager.post$lambda$7(webBridgeManager2, string2, string3, string4);
    }

    private static final void getStatus$lambda$5(WebBridgeManager webBridgeManager2, String string2, List object) {
        Intrinsics.checkNotNullParameter(webBridgeManager2, "this$0");
        Intrinsics.checkNotNullParameter(object, "data");
        object = (Iterable)object;
        int n3 = yx_2.o((Iterable)object, 10);
        Object object2 = new ArrayList(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object3 = (AffiseKeyValue)object.next();
            JSONObject jSONObject = new JSONObject();
            String string3 = ((AffiseKeyValue)object3).getKey();
            String string4 = "key";
            jSONObject.put(string4, (Object)string3);
            string3 = "value";
            object3 = ((AffiseKeyValue)object3).getValue();
            jSONObject.put(string3, object3);
            object2.add(jSONObject);
        }
        new JSONArray(object2);
        object2 = object2.toString();
        webBridgeManager2.post("getStatus", string2, (String)object2);
    }

    private final void post(String string2, String string3, String string4) {
        WebView webView = this.webView;
        if (webView != null) {
            kf3_0 kf3_02 = new kf3_0(this, string2, string3, string4);
            webView.post((Runnable)kf3_02);
        }
    }

    private static final void post$lambda$7(WebBridgeManager webBridgeManager2, String charSequence, String string2, String string3) {
        Intrinsics.checkNotNullParameter(webBridgeManager2, "this$0");
        Intrinsics.checkNotNullParameter(charSequence, "$name");
        String string4 = "$data";
        Intrinsics.checkNotNullParameter(string3, string4);
        webBridgeManager2 = webBridgeManager2.webView;
        if (webBridgeManager2 != null) {
            string4 = "AffiseEventHandler.dispatchEvent('";
            String string5 = "','";
            charSequence = og_1.a(string4, (String)charSequence, string5, string2, string5);
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append("');");
            charSequence = ((StringBuilder)charSequence).toString();
            string2 = null;
            webBridgeManager2.evaluateJavascript((String)charSequence, null);
        }
    }

    public final void getStatus(String object, String string2) {
        if (object != null && (object = AffiseModules.valueOf(object)) != null) {
            AffiseModuleManager affiseModuleManager = this.moduleManager;
            lf3_1 lf3_12 = new lf3_1(this, string2);
            affiseModuleManager.status((AffiseModules)((Object)object), lf3_12);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void log(String string2, String string3) {
        int n3;
        if (string2 == null) return;
        int n4 = string2.hashCode();
        if (n4 != (n3 = 100)) {
            n3 = 101;
            if (n4 != n3) {
                n3 = 119;
                if (n4 != n3) {
                    return;
                }
                string3 = "w";
            } else {
                string3 = "e";
            }
        } else {
            string3 = "d";
        }
        string2.equals(string3);
    }

    public final void registerWebView(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        webView.addJavascriptInterface((Object)this, WEB_BRIDGE_JAVASCRIPT_INTERFACE_NAME);
    }

    public final void sendEvent(String string2) {
        if (string2 != null) {
            StoreEventUseCase storeEventUseCase2 = this.storeEventUseCase;
            storeEventUseCase2.storeWebEvent(string2);
        }
    }

    public final void unregisterWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            String string2 = WEB_BRIDGE_JAVASCRIPT_INTERFACE_NAME;
            webView.removeJavascriptInterface(string2);
        }
        this.webView = null;
    }
}

