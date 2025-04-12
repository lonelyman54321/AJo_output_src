/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ResolveInfo
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Message
 *  android.view.KeyEvent
 *  android.webkit.ClientCertRequest
 *  android.webkit.CookieSyncManager
 *  android.webkit.HttpAuthHandler
 *  android.webkit.RenderProcessGoneDetail
 *  android.webkit.SafeBrowsingResponse
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.safe;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.CookieSyncManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.AcsInterface;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.JsInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.PaymentSessionInfo;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.safe.Godel;
import in.juspay.hypersdk.safe.JuspayWebView;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.utils.Utils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JuspayWebViewClient
extends WebViewClient {
    private static final String LOG_TAG = "in.juspay.hypersdk.safe.JuspayWebViewClient";
    private WebViewClient delegate;
    private final Godel godelManager;
    private final JuspayWebView juspayWebView;
    public String latestStartUrl;

    public JuspayWebViewClient(Godel godel, JuspayWebView object) {
        this.godelManager = godel;
        this.juspayWebView = object;
        object = godel.getJuspayServices().getHyperCallback();
        if (object != null) {
            godel = godel.getJuspayServices().getHyperCallback().createJuspaySafeWebViewClient();
            this.delegate = godel;
        }
    }

    private JSONArray getIntentUris() {
        return Utils.optJSONArray(this.godelManager.getJuspayServices().getSdkConfigService().getSdkConfig(), "intentURIs");
    }

    private void insertACS() {
        String string2;
        Object object;
        Object object2;
        JuspayServices juspayServices = this.godelManager.getJuspayServices();
        Object object3 = juspayServices.getFileProviderService();
        Object object4 = this.godelManager.getPaymentSessionInfo();
        boolean bl2 = ((PaymentSessionInfo)object4).isGodelEnabled();
        if (bl2) {
            object2 = this.godelManager.getDuiInterface();
            object = this.godelManager.getConfig().toString();
            ((JsInterface)object2).setSessionAttribute("config", (String)object);
            object2 = new StringBuilder("window.juspayContext = {}; juspayContext['web_lab_rules'] = ");
            object = this.godelManager.getConfig();
            string2 = "weblab";
            object = object.getJSONObject(string2);
            ((StringBuilder)object2).append(object);
            object2 = ((StringBuilder)object2).toString();
            object = this.juspayWebView;
            ((JuspayWebView)((Object)object)).addJsToWebView((String)object2);
        }
        if (bl2 = ((PaymentSessionInfo)object4).isGodelEnabled()) {
            object2 = juspayServices.getContext();
            object3 = ((FileProviderService)object3).readFromFile((Context)object2, "payments/in.juspay.godel/v1-acs.jsa");
            this.juspayWebView.addJsToWebView((String)object3);
            object2 = LOG_TAG;
            juspayServices.sdkDebug((String)object2, "Tracking weblab rules in acs");
            object2 = this.juspayWebView;
            object = "__juspay.trackWebLabRules();";
            ((JuspayWebView)((Object)object2)).addJsToWebView((String)object);
            object2 = ((PaymentSessionInfo)object4).getAcsJsHash();
            if (object2 == null) {
                object3 = EncryptionHelper.md5((String)object3);
                ((PaymentSessionInfo)object4).setAcsJsHash((String)object3);
                object2 = juspayServices.getSdkTracker();
                String string3 = ((PaymentSessionInfo)object4).getAcsJsHash();
                String string4 = "juspay_webview_client";
                String string5 = "hash_of_inserted_acs_min_script";
                object = "system";
                string2 = "info";
                ((SdkTracker)object2).trackAction((String)object, string2, string4, string5, string3);
            }
        } else {
            object3 = LOG_TAG;
            object4 = "disabling_insertion_of_java_script_since_jb_is_disabled";
            juspayServices.sdkDebug((String)object3, (String)object4);
        }
    }

    private boolean openIntentFromGodel(String object) {
        block18: {
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            Exception exception;
            Object object2 = this.getIntentUris();
            int n3 = 0;
            Object object3 = null;
            while (true) {
                block19: {
                    int n4;
                    try {
                        n4 = object2.length();
                        if (n3 >= n4) break block18;
                    }
                    catch (Exception exception2) {
                        exception = exception2;
                        break;
                    }
                    string6 = object2.getString(n3);
                    n4 = (int)(((String)object).startsWith(string6) ? 1 : 0);
                    if (n4 == 0) break block19;
                    object2 = this.godelManager;
                    object2 = ((Godel)object2).getJuspayServices();
                    object3 = ((JuspayServices)object2).getSdkTracker();
                    string6 = "system";
                    string5 = "info";
                    string4 = "juspay_webview_client";
                    string3 = "intent_uri";
                    string2 = object;
                    ((SdkTracker)object3).trackAction(string6, string5, string4, string3, object);
                    object3 = "android.intent.action.VIEW";
                    string6 = Uri.parse((String)object);
                    object2 = new Intent((String)object3, (Uri)string6);
                    object3 = this.godelManager;
                    object3 = ((Godel)object3).getJuspayServices();
                    n4 = -1;
                    string5 = null;
                    ((JuspayServices)object3).startActivityForResult((Intent)object2, n4, null);
                    object2 = new JSONObject();
                    object3 = "url";
                    object2.put((String)object3, object);
                    object = this.godelManager;
                    object = ((Godel)object).getAcsInterface();
                    object3 = "openIntentFromGodel";
                    object2 = object2.toString();
                    ((AcsInterface)object).invoke((String)object3, (String)object2);
                    return true;
                }
                ++n3;
            }
            JuspayServices juspayServices = this.godelManager.getJuspayServices();
            object3 = juspayServices.getSdkTracker();
            string6 = LOG_TAG;
            string3 = "juspay_webview_client";
            string2 = "Exception in shouldOverrideUrlLoading";
            string5 = "action";
            string4 = "system";
            ((SdkTracker)object3).trackAndLogException(string6, string5, string4, string3, string2, exception);
        }
        return false;
    }

    public void doUpdateVisitedHistory(WebView webView, String string2, boolean bl2) {
        super.doUpdateVisitedHistory(webView, string2, bl2);
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        super.onFormResubmission(webView, message, message2);
    }

    public void onLoadResource(WebView webView, String string2) {
        super.onLoadResource(webView, string2);
        WebViewClient webViewClient = this.delegate;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, string2);
        }
    }

    public void onPageCommitVisible(WebView webView, String string2) {
        super.onPageCommitVisible(webView, string2);
        WebViewClient webViewClient = this.delegate;
        if (webViewClient != null) {
            webViewClient.onPageCommitVisible(webView, string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onPageFinished(WebView webView, String string2) {
        JuspayServices juspayServices;
        block5: {
            JSONException jSONException2;
            block4: {
                Object object;
                block3: {
                    super.onPageFinished(webView, string2);
                    juspayServices = this.godelManager.getJuspayServices();
                    try {
                        object = this.godelManager;
                        boolean bl2 = ((Godel)object).isDuiLoaded();
                        if (!bl2) break block3;
                        object = new JSONObject();
                        Object object2 = "url";
                        object.put((String)object2, (Object)string2);
                        object2 = "title";
                        String string3 = webView.getTitle();
                        object.put((String)object2, (Object)string3);
                        object2 = this.godelManager;
                        object2 = ((Godel)object2).getAcsInterface();
                        string3 = "onPageFinished";
                        object = object.toString();
                        ((AcsInterface)object2).invoke(string3, (String)object);
                    }
                    catch (JSONException jSONException2) {
                        break block4;
                    }
                }
                object = CookieSyncManager.getInstance();
                object.sync();
                this.insertACS();
                break block5;
            }
            SdkTracker sdkTracker = juspayServices.getSdkTracker();
            String string4 = LOG_TAG;
            String string5 = "juspay_webview_client";
            String string6 = "Exception while creating ACS onPageFinished event";
            String string7 = "action";
            String string8 = "system";
            sdkTracker.trackAndLogException(string4, string7, string8, string5, string6, jSONException2);
        }
        juspayServices = this.delegate;
        if (juspayServices != null) {
            juspayServices.onPageFinished(webView, string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onPageStarted(WebView object, String string2, Bitmap object2) {
        String string3;
        String string4;
        Object object3;
        String string5;
        String string6;
        Iterator iterator;
        SdkTracker sdkTracker;
        block11: {
            int n3;
            super.onPageStarted((WebView)object, string2, object2);
            Object object4 = this.godelManager.getJuspayServices();
            sdkTracker = ((JuspayServices)object4).getSdkTracker();
            iterator = this.godelManager;
            ((Godel)((Object)iterator)).isRupaySupportedAdded = false;
            int n4 = ((Godel)((Object)iterator)).isDuiLoaded();
            if (n4 != 0) {
                JSONObject jSONObject = new JSONObject();
                iterator = "url";
                try {
                    jSONObject.put((String)((Object)iterator), (Object)string2);
                }
                catch (JSONException jSONException) {
                    string6 = LOG_TAG;
                    string5 = "juspay_webview_client";
                    object3 = "Exception while creating ACS onPageStarted event";
                    string4 = "action";
                    string3 = "system";
                    iterator = sdkTracker;
                    sdkTracker.trackAndLogException(string6, string4, string3, string5, (String)object3, jSONException);
                }
                iterator = this.godelManager.getAcsInterface();
                string6 = jSONObject.toString();
                string4 = "onPageStarted";
                ((AcsInterface)((Object)iterator)).invoke(string4, string6);
            }
            this.latestStartUrl = string2;
            object4 = ((JuspayServices)object4).getSessionInfo();
            iterator = "currentUrl";
            ((SessionInfo)object4).set((String)((Object)iterator), string2);
            object4 = this.delegate;
            if (object4 != null) {
                object4.onPageStarted((WebView)object, string2, object2);
            }
            try {
                object = this.godelManager;
                object = ((Godel)object).getAllowedDeeplinkPackages();
                int n7 = object.size();
                if (n7 == 0) {
                    return;
                }
                object4 = "android.intent.action.VIEW";
                object2 = new Intent((String)object4);
                object4 = Uri.parse((String)string2);
                object2.setData((Uri)object4);
                object4 = this.godelManager;
                object4 = ((Godel)object4).getContext();
                object4 = object4.getPackageManager();
                n4 = 65536;
                object4 = object4.queryIntentActivities((Intent)object2, n4);
                if (object4 == null) {
                    return;
                }
                iterator = object4.iterator();
                string6 = null;
                string4 = null;
                while ((n3 = iterator.hasNext()) != 0) {
                    string3 = iterator.next();
                    string3 = (ResolveInfo)string3;
                    string5 = LOG_TAG;
                    object3 = ((ResolveInfo)string3).activityInfo;
                    object3 = ((ActivityInfo)object3).packageName;
                    JuspayLogger.d(string5, (String)object3);
                    if (string4 != null) continue;
                    string5 = ((ResolveInfo)string3).activityInfo;
                    string5 = ((ActivityInfo)string5).packageName;
                    boolean bl2 = object.contains(string5);
                    if (!bl2) continue;
                    string4 = ((ResolveInfo)string3).activityInfo;
                    string4 = ((ActivityInfo)string4).packageName;
                }
            }
            catch (Exception exception) {
                object3 = exception;
                break block11;
            }
            if (string4 == null && (n4 = object4.size()) > (n3 = 1)) {
                object = LOG_TAG;
                object2 = "Too many activities";
                JuspayLogger.e((String)object, (String)object2);
                return;
            }
            n4 = object4.size();
            if (n4 == 0) return;
            object4 = object4.get(0);
            object4 = (ResolveInfo)object4;
            object4 = ((ResolveInfo)object4).activityInfo;
            object4 = ((ActivityInfo)object4).packageName;
            boolean bl3 = object.contains(object4);
            if (!bl3) {
                return;
            }
            object2.setPackage(string4);
            object = this.godelManager;
            object = ((Godel)object).getJuspayServices();
            int n8 = -1;
            ((JuspayServices)object).startActivityForResult((Intent)object2, n8, null);
            object = this.godelManager;
            object = ((Godel)object).getJuspayServices();
            object2 = "if (window.onDeepLinkUrlAppOpen != null) { window.onDeepLinkUrlAppOpen('{}'); }";
            ((JuspayServices)object).addJsToWebView((String)object2);
            return;
        }
        String string7 = "Exception when trying to launch deeplink activity for ";
        string5 = kp1_0.c(string7, string2);
        string4 = "external_sdk";
        string3 = "webview_client";
        string6 = "godel";
        iterator = sdkTracker;
        sdkTracker.trackException(string6, string4, string3, string5, (Throwable)object3);
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public void onReceivedError(WebView webView, int n3, String string2, String string3) {
        JuspayServices juspayServices;
        block14: {
            super.onReceivedError(webView, n3, string2, string3);
            juspayServices = this.godelManager.getJuspayServices();
            Object object = this.godelManager;
            boolean bl2 = ((Godel)object).isDuiLoaded();
            if (!bl2) break block14;
            object = new JSONObject();
            Object object2 = "url";
            String string4 = webView.getUrl();
            object.put((String)object2, (Object)string4);
            object2 = "title";
            string4 = webView.getTitle();
            object.put((String)object2, (Object)string4);
            object2 = "statusCode";
            object.put((String)object2, n3);
            object2 = this.godelManager;
            object2 = ((Godel)object2).getAcsInterface();
            string4 = "onReceivedError";
            object = object.toString();
            try {
                ((AcsInterface)object2).invoke(string4, (String)object);
                this.insertACS();
            }
            catch (JSONException jSONException) {
                object2 = juspayServices.getSdkTracker();
                string4 = LOG_TAG;
                String string5 = "juspay_webview_client";
                String string6 = "Exception while creating ACS onReceivedError event";
                String string7 = "action";
                String string8 = "system";
                ((SdkTracker)object2).trackAndLogException(string4, string7, string8, string5, string6, jSONException);
            }
        }
        if ((juspayServices = this.delegate) != null) {
            juspayServices.onReceivedError(webView, n3, string2, string3);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        JuspayServices juspayServices;
        block16: {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            juspayServices = this.godelManager.getJuspayServices();
            Object object = this.godelManager;
            boolean bl2 = ((Godel)object).isDuiLoaded();
            if (!bl2) break block16;
            object = new JSONObject();
            Object object2 = "url";
            String string2 = webView.getUrl();
            object.put((String)object2, (Object)string2);
            object2 = "title";
            string2 = webView.getTitle();
            object.put((String)object2, (Object)string2);
            object2 = "statusCode";
            int n3 = webResourceError.getErrorCode();
            object.put((String)object2, n3);
            object2 = this.godelManager;
            object2 = ((Godel)object2).getAcsInterface();
            string2 = "onReceivedError";
            object = object.toString();
            ((AcsInterface)object2).invoke(string2, (String)object);
            this.insertACS();
            object = CookieSyncManager.getInstance();
            try {
                object.sync();
            }
            catch (JSONException jSONException) {
                object2 = juspayServices.getSdkTracker();
                string2 = LOG_TAG;
                String string3 = "juspay_webview_client";
                String string4 = "Exception while creating ACS onReceivedError event";
                String string5 = "action";
                String string6 = "system";
                ((SdkTracker)object2).trackAndLogException(string2, string5, string6, string3, string4, jSONException);
            }
        }
        if ((juspayServices = this.delegate) != null) {
            juspayServices.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String string2, String string3) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, string2, string3);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        WebViewClient webViewClient = this.delegate;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public void onReceivedLoginRequest(WebView webView, String string2, String string3, String string4) {
        super.onReceivedLoginRequest(webView, string2, string3, string4);
    }

    public boolean onRenderProcessGone(WebView object, RenderProcessGoneDetail object2) {
        object2 = this.juspayWebView;
        if (object == object2) {
            Object object3 = this.godelManager.getJuspayServices().getSdkTracker();
            String string2 = "error";
            String string3 = "godel render process is gone";
            String string4 = "system";
            String string5 = "error";
            String string6 = "on_render_process_gone";
            ((SdkTracker)object3).trackLifecycle(string4, string5, string6, string2, string3);
            object = this.godelManager.getAcsInterface();
            object2 = JSONObject.NULL.toString();
            object3 = "onRenderProcessGone";
            ((AcsInterface)object).invoke((String)object3, (String)object2);
            object = this.godelManager.getDuiInterface();
            ((DuiInterface)object).onWebViewReleased();
        }
        return true;
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int n3, SafeBrowsingResponse safeBrowsingResponse) {
        super.onSafeBrowsingHit(webView, webResourceRequest, n3, safeBrowsingResponse);
    }

    public void onScaleChanged(WebView webView, float f5, float f6) {
        super.onScaleChanged(webView, f5, f6);
        WebViewClient webViewClient = this.delegate;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f5, f6);
        }
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        super.onTooManyRedirects(webView, message, message2);
        WebViewClient webViewClient = this.delegate;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        }
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse = this.godelManager.shouldInterceptRequest(webResourceRequest);
        WebViewClient webViewClient = this.delegate;
        if (webViewClient != null && webResourceResponse == null) {
            webResourceResponse = webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        }
        return webResourceResponse;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String string2) {
        WebResourceResponse webResourceResponse = this.godelManager.shouldInterceptRequest(string2);
        WebViewClient webViewClient = this.delegate;
        if (webViewClient != null && webResourceResponse == null) {
            webResourceResponse = webViewClient.shouldInterceptRequest(webView, string2);
        }
        return webResourceResponse;
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object object = this.delegate;
        if (object != null) {
            return object.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        object = webResourceRequest.getUrl().toString();
        boolean bl2 = this.openIntentFromGodel((String)object);
        if (bl2) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        WebViewClient webViewClient = this.delegate;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, string2);
        }
        boolean bl2 = this.openIntentFromGodel(string2);
        if (bl2) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, string2);
    }
}

