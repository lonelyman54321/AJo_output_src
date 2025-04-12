/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.Base64
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.FrameLayout
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import in.juspay.hyper.core.BridgeComponents;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JsCallback;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R$bool;
import in.juspay.hypersdk.core.AndroidInterface;
import in.juspay.hypersdk.core.DUIMerchantView;
import in.juspay.hypersdk.core.DuiLogger;
import in.juspay.hypersdk.core.DynamicUI$1;
import in.juspay.hypersdk.core.DynamicUI$2;
import in.juspay.hypersdk.core.InflateView;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.core.Renderer;
import in.juspay.hypersdk.core.WebViewState;
import in.juspay.hypersdk.core.a_0;
import in.juspay.hypersdk.core.w;
import in.juspay.hypersdk.core.x;
import in.juspay.hypersdk.core.y;
import in.juspay.hypersdk.core.z;
import in.juspay.hypersdk.mystique.Callback;
import in.juspay.hypersdk.mystique.DUIWebViewClient;
import in.juspay.hypersdk.mystique.WebClientCallback;
import in.juspay.hypersdk.ota.ApplicationManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

final class DynamicUI
implements JsCallback {
    private Activity activity;
    private final HashMap activityData;
    private final AndroidInterface androidInterface;
    private Context appContext;
    private ApplicationManager applicationManager;
    private final String baseContent;
    private final BridgeComponents bridgeComponents;
    private WebView browser;
    private final Callback callback;
    private FrameLayout container;
    private final DUIMerchantView duiMerchantView;
    private boolean enableWebViewRecreate;
    private HashMap fragments;
    private final HashMap globalState;
    private final InflateView inflateView;
    private boolean isForeGround;
    private boolean isInitiated;
    final Map jsInterfaces;
    private String loadCallJS;
    private final DuiLogger mLogger;
    private final Renderer renderer;
    private final Map screenMap;
    private final HashMap storedFunctions;
    private int totalWebViewFailure;
    private Exception webViewCrashException = null;
    private final AtomicReference webViewState;

    public DynamicUI(Context object, DuiLogger object2, Callback object3, BridgeComponents bridgeComponents, String string2, Map map2, JSONObject jSONObject, ApplicationManager applicationManager, DUIMerchantView dUIMerchantView, boolean bl2) {
        HashMap<Context, Context> hashMap;
        this.globalState = hashMap = new HashMap<Context, Context>();
        this.activityData = hashMap = new HashMap<Context, Context>();
        this.isForeGround = true;
        this.isInitiated = false;
        this.totalWebViewFailure = 0;
        this.enableWebViewRecreate = false;
        this.jsInterfaces = hashMap = new HashMap<Context, Context>();
        this.mLogger = object2;
        this.callback = object3;
        this.bridgeComponents = bridgeComponents;
        object3 = WebViewState.Null;
        object2 = new AtomicReference(object3);
        this.webViewState = object2;
        this.storedFunctions = object2;
        boolean bl3 = object instanceof Activity;
        if (bl3) {
            object2 = object;
            object2 = (Activity)object;
            this.activity = object2;
        }
        this.appContext = object = object.getApplicationContext();
        super();
        this.screenMap = object;
        super();
        this.fragments = object;
        this.duiMerchantView = dUIMerchantView;
        this.applicationManager = applicationManager;
        super(this);
        this.androidInterface = object;
        super(this, jSONObject);
        this.renderer = object2;
        super(this);
        this.inflateView = object2;
        if (string2 == null) {
            string2 = "<html>\n<head>\n    <title>Hyper OS</title>\n</head>\n<body>\n</body>\n<script type=\"text/javascript\">\nwindow.bootLoad = function(){\n    window.DUIGatekeeper = JBridge;\n    var headID = document.getElementsByTagName(\"head\")[0];\n    var newScript = document.createElement('script');\n    newScript.type = 'text/javascript';\n    newScript.id = 'boot_loader';\n    var bundleLoadStart = Date.now();\n    var logViaTracker = function() {\n       var bundleLoadEnd = Date.now();\n       window.__osStart = Date.now();\n       var loadLatency = bundleLoadEnd - bundleLoadStart;\n       var obj = {};\n       obj[\"os_bundle_load\"] = {\"bundle_load_start\":bundleLoadStart,\"bundle_load_end\":bundleLoadEnd,\"bundle_load_latency\":loadLatency};\n       window.__osBundleLoadLogLine = obj;\n    }\n    window.onerror = function (message, src, lno, cno, err) {\n       console.log('ERROR WHILE LOADING SCRIPT');\n       const errorObj = {};\n       errorObj.message = typeof message === 'string' ? message : '';\n       errorObj.source = typeof src === 'string' ? src : '';\n       errorObj.lineNo = typeof lno === 'number' ? lno : -1;\n       errorObj.columnNo = typeof cno === 'number' ? cno : -1;\n       if (typeof err === 'object') {\n           errorObj.stackTrace = typeof err.stack === 'string' ? err.stack : '';\n       }\n       window.scriptError = errorObj;\n       var args = JSON.stringify({ app: \"in.juspay.hyperos\", serializedError: JSON.stringify(errorObj)});\n       JBridge.runInJuspayBrowser(\"onScriptError\", args, \"\");\n    };\n    var loadBundle = function () {\n       newScript.innerHTML = JBridge.getApplicationContent();\n       headID.appendChild(newScript);\n       logViaTracker();\n    }\n    loadBundle();\n    setTimeout(function () {\n       if (typeof window.onMerchantEvent !== 'function') {\n           loadBundle();\n           var retryObj = {'retry_tried': 'true'};\n           try {\n               window.Analytics._trackLifeCycle('hypersdk')('info')('bundle_load_retry')(retryObj)();\n           } catch (e) {}\n       }\n    }, 1000);\n}\nJBridge.runInJuspayBrowser(\"onHtmlReady\", \"{}\", \"\");\n </script>\n</html>";
        }
        this.baseContent = string2;
        object2 = "Android";
        hashMap.put((Context)object2, (Context)object);
        hashMap.putAll(map2);
        if (!bl2) {
            super(this);
            ExecutorManager.runOnMainThread((Runnable)object);
        }
    }

    public static /* synthetic */ void a(DynamicUI dynamicUI, Object object, String string2) {
        dynamicUI.lambda$addJavascriptInterface$2(object, string2);
    }

    public static /* synthetic */ void b(DynamicUI dynamicUI) {
        dynamicUI.loadData();
    }

    public static /* synthetic */ void c(DynamicUI dynamicUI, WebView webView) {
        dynamicUI.lambda$setupWebView$0(webView);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void createWebView() {
        int n3;
        int n4 = 0;
        Object object = null;
        int n7 = 1;
        try {
            Object object2 = this.appContext;
            Object object3 = new WebView(object2);
            this.browser = object3;
            object3 = this.webViewState;
            object2 = WebViewState.Created;
            ((AtomicReference)object3).set(object2);
            this.setupWebView();
            object3 = this.browser;
            object3 = object3.getSettings();
            object3.setJavaScriptEnabled(n7 != 0);
            object3 = this.jsInterfaces;
            object3 = object3.entrySet();
            object3 = object3.iterator();
            while (true) {
                boolean bl2;
                if (!(bl2 = object3.hasNext())) {
                    this.loadBaseHtml();
                    object3 = this.callback;
                    object3.webViewLoaded(null);
                    object3 = null;
                    this.totalWebViewFailure = 0;
                    return;
                }
                object2 = object3.next();
                object2 = (Map.Entry)object2;
                WebView webView = this.browser;
                Object v4 = object2.getValue();
                object2 = object2.getKey();
                object2 = (String)object2;
                webView.addJavascriptInterface(v4, (String)object2);
            }
        }
        catch (Exception exception) {}
        this.totalWebViewFailure = n3 = this.totalWebViewFailure + n7;
        n3 = (int)(this.isWebViewBroken() ? 1 : 0);
        String string2 = "webview";
        if (n3 != 0) {
            object = this.webViewState;
            Object object4 = WebViewState.Broken;
            ((AtomicReference)object).set(object4);
            this.webViewCrashException = exception;
            this.callback.webViewLoaded(exception);
            object = this.mLogger;
            String string3 = "WebView creation failed ";
            object4 = new StringBuilder(string3);
            n3 = this.totalWebViewFailure;
            ((StringBuilder)object4).append(n3);
            object4 = ((StringBuilder)object4).toString();
            object.logLifeCycleException(string2, (String)object4, exception);
            return;
        }
        this.browser = null;
        object = this.webViewState;
        Object object5 = WebViewState.Recreating;
        ((AtomicReference)object).set(object5);
        object = this.mLogger;
        String string4 = "Webview crashed, recreating ";
        object5 = new StringBuilder(string4);
        int n8 = this.totalWebViewFailure;
        ((StringBuilder)object5).append(n8);
        object5 = ((StringBuilder)object5).toString();
        object.logLifeCycleException(string2, (String)object5, exception);
        n4 = (this.totalWebViewFailure + n7) * 50;
        long l2 = n4;
        w w4 = new w(this);
        ExecutorManager.postOnMainThread(l2, w4);
    }

    public static /* synthetic */ void d(DynamicUI dynamicUI) {
        dynamicUI.createWebView();
    }

    public static /* synthetic */ void e(DynamicUI dynamicUI, String string2) {
        dynamicUI.lambda$addJsToWebView$1(string2);
    }

    private String getStringStackTraceFromError(Error stackTraceElementArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stackTraceElementArray = stackTraceElementArray.getStackTrace();
        int n3 = stackTraceElementArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = stackTraceElementArray[i3].toString();
            stringBuilder.append(string2);
            string2 = "\n";
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    private String getStringStackTraceFromException(Exception stackTraceElementArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stackTraceElementArray = stackTraceElementArray.getStackTrace();
        int n3 = stackTraceElementArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = stackTraceElementArray[i3].toString();
            stringBuilder.append(string2);
            string2 = "\n";
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    private boolean isWebViewBroken() {
        int n3 = this.totalWebViewFailure;
        int n4 = 3;
        n3 = n3 > n4 ? 1 : 0;
        return n3 != 0;
    }

    private /* synthetic */ void lambda$addJavascriptInterface$2(Object object, String string2) {
        WebView webView = this.browser;
        if (webView != null) {
            webView.addJavascriptInterface(object, string2);
        }
        this.jsInterfaces.put(string2, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$addJsToWebView$1(String string2) {
        OutOfMemoryError outOfMemoryError2;
        String string3;
        block5: {
            Exception exception2;
            block4: {
                string3 = "addJsToWebView";
                try {
                    WebView webView = this.browser;
                    if (webView != null) {
                        webView.evaluateJavascript(string2, null);
                        return;
                    }
                }
                catch (Exception exception2) {
                    break block4;
                }
                catch (OutOfMemoryError outOfMemoryError2) {
                    break block5;
                }
                string2 = "browser null, call start first";
                this.logError(string2);
                return;
            }
            String string4 = this.getStringStackTraceFromException(exception2);
            Object object = kp1_0.c("Exception :", string4);
            this.logError((String)object);
            object = this.callback;
            object.onError(string3, string4);
            return;
        }
        String string5 = this.getStringStackTraceFromError(outOfMemoryError2);
        Object object = kp1_0.c("OutOfMemoryError :", string5);
        this.logError((String)object);
        object = this.callback;
        object.onError(string3, string5);
    }

    private /* synthetic */ void lambda$setupWebView$0(WebView webView) {
        WebView webView2 = this.browser;
        if (webView == webView2) {
            this.recreateWebView();
        }
    }

    private void loadBaseHtml() {
        y y5 = new y(this);
        ExecutorManager.runOnMainThread(y5);
    }

    private void loadData() {
        Object object = this.browser;
        if (object != null) {
            String string2 = this.baseContent;
            String string3 = "utf-8";
            String string4 = "text/html";
            object.loadDataWithBaseURL(null, string2, string4, string3, null);
            object = this.mLogger;
            String string5 = "url_loaded";
            string2 = "base.html";
            object.logLifeCycleInfo(string5, string2);
        }
    }

    private void logError(String string2) {
        this.mLogger.e("DynamicUI", string2);
    }

    private void recreateWebView() {
        Object object = this.webViewState;
        WebViewState webViewState = WebViewState.Null;
        ((AtomicReference)object).set(webViewState);
        object = this.callback;
        boolean bl2 = this.enableWebViewRecreate;
        object.onRenderProcessGone(bl2);
        boolean bl3 = this.enableWebViewRecreate;
        if (bl3) {
            object = null;
            this.browser = null;
            bl3 = this.isForeGround;
            if (bl3) {
                object = new w(this);
                ExecutorManager.runOnMainThread((Runnable)object);
            } else {
                object = this.webViewState;
                webViewState = WebViewState.Crashed;
                ((AtomicReference)object).set(webViewState);
            }
        }
    }

    private void setupWebView() {
        Object object = this.browser;
        if (object != null) {
            Object object2;
            int n3;
            object = this.appContext.getResources();
            boolean bl2 = object.getBoolean(n3 = R$bool.godel_debuggable);
            if (bl2) {
                object = this.browser;
                object2 = new WebChromeClient();
                object.setWebChromeClient(object2);
            } else {
                object = this.browser;
                object2 = new DynamicUI$1(this);
                object.setWebChromeClient(object2);
            }
            object2 = new a_0(this);
            object = new DUIWebViewClient((WebClientCallback)object2);
            object2 = this.browser;
            object2.setWebViewClient((WebViewClient)object);
        }
    }

    public void addJavascriptInterface(Object object, String string2) {
        z z5 = new z(this, object, string2);
        ExecutorManager.runOnMainThread(z5);
    }

    public void addJsToWebView(String string2) {
        x x5 = new x(this, string2);
        ExecutorManager.runOnMainThread(x5);
    }

    public String addToContainerList(ViewGroup viewGroup) {
        String string2 = UUID.randomUUID().toString();
        this.fragments.put(string2, viewGroup);
        return string2;
    }

    public void addToScreenMap(String string2, Object object) {
        this.screenMap.put(string2, object);
    }

    public String encodeUtfAndWrapDecode(String string2, String string3) {
        String string4;
        CharSequence charSequence;
        String string5 = "')";
        String string6 = "decodeURIComponent('";
        String string7 = "UTF-8";
        try {
            string7 = URLEncoder.encode(string2, string7);
            charSequence = "+";
            string4 = "%20";
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            JuspayLogger.e(string3, "Failed to encode using URLEncoder");
            string2 = Base64.encodeToString((byte[])string2.getBytes(), (int)2);
            return cP.a("atob('", string2, string5);
        }
        string7 = string7.replace(charSequence, string4);
        charSequence = new StringBuilder(string6);
        ((StringBuilder)charSequence).append(string7);
        ((StringBuilder)charSequence).append(string5);
        return ((StringBuilder)charSequence).toString();
    }

    public Activity getActivity() {
        return this.activity;
    }

    public String getActivityData(String string2) {
        HashMap hashMap = this.activityData;
        boolean bl2 = hashMap.containsKey(string2);
        if (bl2) {
            return (String)this.activityData.get(string2);
        }
        return "";
    }

    public HashMap getAllFunctions() {
        return this.storedFunctions;
    }

    public HashMap getAllGlobalState() {
        return this.globalState;
    }

    public AndroidInterface getAndroidInterface() {
        return this.androidInterface;
    }

    public Context getAppContext() {
        return this.appContext;
    }

    public ApplicationManager getApplicationManager() {
        return this.applicationManager;
    }

    public BridgeComponents getBridgeComponents() {
        return this.bridgeComponents;
    }

    public ViewGroup getContainer(String string2) {
        if (string2 == null) {
            return this.container;
        }
        return (ViewGroup)this.fragments.get(string2);
    }

    public Callback getErrorCallback() {
        return this.callback;
    }

    public JSONArray getFunction(String string2) {
        return (JSONArray)this.storedFunctions.get(string2);
    }

    public Object getGlobalState(String string2) {
        return this.globalState.get(string2);
    }

    public InflateView getInflateView() {
        return this.inflateView;
    }

    public DuiLogger getLogger() {
        return this.mLogger;
    }

    public View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
        return this.duiMerchantView.getMerchantView(viewGroup, merchantViewType);
    }

    public Renderer getRenderer() {
        return this.renderer;
    }

    public String getState() {
        return this.androidInterface.getState();
    }

    public Object getViewFromScreenName(String string2) {
        Map map2 = this.screenMap;
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            return this.screenMap.get(string2);
        }
        return null;
    }

    public Exception getWebViewCrashException() {
        return this.webViewCrashException;
    }

    public boolean initiate() {
        boolean bl2;
        block2: {
            Object object;
            block4: {
                block3: {
                    this.loadCallJS = "window.bootLoad()";
                    object = null;
                    this.totalWebViewFailure = 0;
                    bl2 = true;
                    this.isInitiated = bl2;
                    int[] nArray = DynamicUI$2.$SwitchMap$in$juspay$hypersdk$core$WebViewState;
                    WebViewState webViewState = (WebViewState)((Object)this.webViewState.get());
                    int n3 = webViewState.ordinal();
                    int n4 = nArray[n3];
                    if (n4 == bl2) break block2;
                    n3 = 3;
                    if (n4 == n3) break block3;
                    n3 = 4;
                    if (n4 == n3) break block4;
                    n3 = 5;
                    if (n4 != n3) {
                        n3 = 6;
                        if (n4 != n3) {
                            return false;
                        }
                        object = this.loadCallJS;
                        this.addJsToWebView((String)object);
                        return bl2;
                    }
                    break block2;
                }
                object = new w(this);
                ExecutorManager.runOnMainThread((Runnable)object);
            }
            object = new w(this);
            ExecutorManager.runOnMainThread((Runnable)object);
        }
        return bl2;
    }

    public void onPauseCallback() {
        this.isForeGround = false;
    }

    public void onResumeCallback() {
        WebViewState webViewState;
        boolean bl2;
        this.isForeGround = bl2 = true;
        Object object = this.webViewState.get();
        if (object == (webViewState = WebViewState.Crashed)) {
            object = new Object(this);
            ExecutorManager.runOnMainThread(object);
        }
    }

    public void putFunction(String string2, JSONArray jSONArray) {
        this.storedFunctions.put(string2, jSONArray);
    }

    public void resetActivity() {
        this.activity = null;
        this.getInflateView().resetState();
    }

    public void setActivity(Activity activity) {
        Object object = this.activity;
        if (object != activity) {
            object = new HashMap();
            this.fragments = object;
            object = this.getInflateView();
            ((InflateView)object).resetState();
        }
        this.activity = activity;
        activity = activity.getApplicationContext();
        this.appContext = activity;
    }

    public void setApplicationManager(ApplicationManager applicationManager) {
        this.applicationManager = applicationManager;
    }

    public void setContainer(FrameLayout frameLayout) {
        boolean bl2;
        this.container = frameLayout;
        if (frameLayout != null && (bl2 = frameLayout.isHardwareAccelerated())) {
            frameLayout = this.container;
            int n3 = 2;
            frameLayout.setLayerType(n3, null);
        }
    }

    public void setGlobalState(String string2, Object object) {
        this.globalState.put(string2, object);
    }

    public void setState(String string2) {
        this.androidInterface.setState(string2);
    }

    public void setWebViewActive() {
        Object object;
        boolean bl2 = this.isInitiated;
        if (bl2) {
            object = this.loadCallJS;
            this.addJsToWebView((String)object);
        }
        object = this.webViewState;
        WebViewState webViewState = WebViewState.Active;
        ((AtomicReference)object).set(webViewState);
    }

    public void setWebViewRecreate(boolean bl2) {
        this.enableWebViewRecreate = bl2;
    }

    public void storeActivityData(String string2, String string3) {
        this.activityData.put(string2, string3);
    }

    public void terminate() {
        Object object = this.browser;
        if (object != null) {
            this.isInitiated = false;
            object = this.webViewState;
            WebViewState webViewState = WebViewState.Null;
            ((AtomicReference)object).set(webViewState);
            WebView webView = this.browser;
            String string2 = "utf-8";
            String string3 = "http://juspay.in";
            String string4 = "<html></html>";
            String string5 = "text/html";
            webView.loadDataWithBaseURL(string3, string4, string5, string2, null);
            this.browser.stopLoading();
            this.browser.destroy();
            object = null;
            this.browser = null;
        } else {
            object = "Browser is not present";
            this.logError((String)object);
        }
    }
}

