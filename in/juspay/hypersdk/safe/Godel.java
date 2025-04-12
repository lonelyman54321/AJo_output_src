/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewManager
 *  android.webkit.CookieManager
 *  android.webkit.URLUtil
 *  android.webkit.WebChromeClient
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.safe;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R$id;
import in.juspay.hypersdk.core.AcsInterface;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.GodelJsInterface;
import in.juspay.hypersdk.core.JsInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.JuspayWebViewConfigurationCallback;
import in.juspay.hypersdk.core.PaymentUtils;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.PaymentSessionInfo;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.safe.JuspayWebChromeClient;
import in.juspay.hypersdk.safe.JuspayWebView;
import in.juspay.hypersdk.safe.JuspayWebViewClient;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Godel {
    private static final String GODEL = "Godel";
    private static final String LOG_TAG = "PaymentUtils";
    private static final long ON_EXCEPTION_GODEL_OFF_STICKINESS = 86400000L;
    private final AcsInterface acsInterface;
    private final List allowedDeeplinkPackages;
    private final JSONObject bundleParameters;
    private JSONObject config;
    private final Context context;
    private final DuiInterface duiInterface;
    public boolean isRupaySupportedAdded;
    private final JuspayServices juspayServices;
    private final JuspayWebChromeClient juspayWebChromeClient;
    private final JuspayWebView juspayWebView;
    private final JuspayWebViewClient juspayWebViewClient;
    private final JuspayWebViewConfigurationCallback juspayWebViewConfigurationCallback;
    private final PaymentSessionInfo paymentSessionInfo;
    private final JSONObject processPayload;
    private final SdkTracker sdkTracker;
    private final Workspace workspace;

    public Godel(JuspayServices juspayServices) {
        JuspayWebView juspayWebView;
        Workspace workspace;
        Object object;
        this.allowedDeeplinkPackages = object = new ArrayList();
        this.isRupaySupportedAdded = false;
        this.context = object = juspayServices.getContext();
        this.juspayServices = juspayServices;
        this.workspace = workspace = juspayServices.getWorkspace();
        workspace = juspayServices.getActivity();
        if (workspace != null) {
            object = workspace;
        }
        this.juspayWebView = juspayWebView = new JuspayWebView((Context)object);
        super(this, juspayWebView);
        this.juspayWebViewClient = object;
        super(this);
        this.juspayWebChromeClient = object;
        super(juspayServices);
        this.acsInterface = object;
        object = juspayServices.getWebViewConfigurationCallback();
        this.juspayWebViewConfigurationCallback = object;
        object = juspayServices.getSdkTracker();
        this.sdkTracker = object;
        object = juspayServices.getJBridge();
        this.duiInterface = object;
        object = juspayServices.getPaymentSessionInfo();
        this.paymentSessionInfo = object;
        object = juspayServices.getSessionInfo().getBundleParams();
        this.bundleParameters = object;
        juspayServices = juspayServices.getLastProcessPayload();
        this.processPayload = juspayServices;
        super();
        this.config = juspayServices;
    }

    public static /* synthetic */ void a(Godel godel, Activity activity, String string2, String string3, String string4) {
        godel.lambda$onBrowserReady$0(activity, string2, string3, string4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private WebResourceResponse addAcsToJSFile(WebResourceRequest var1_1, String var2_2, String var3_3, JSONObject var4_4, JSONObject var5_5) {
        block12: {
            var6_6 /* !! */  = "POST";
            try {
                var7_7 = var2_2.equals(var6_6 /* !! */ );
                if (!var7_7) {
                    var3_3 = "GET";
                    var9_9 = var2_2.equals(var3_3);
                    if (var9_9 == false) return null;
                    var3_3 = "connection_timeout";
                    var10_10 = 10000;
                    var11_11 = var5_5.optInt((String)var3_3, var10_10);
                    var6_6 /* !! */  = "read_timeout";
                    var10_10 = var5_5.optInt(var6_6 /* !! */ , var10_10);
                    var2_2 = new NetUtils(var11_11, var10_10);
                    var2_2 = this.getDataFromGetRequest((NetUtils)var2_2, var1_1 /* !! */ );
                    var8_8 = var2_2;
                    return null;
                }
                var1_1 /* !! */  = this.getPostRequestConnection((JSONObject)var5_5, var4_4 /* !! */ , var1_1 /* !! */ );
                var2_2 = this.getDataAcsFromPostRequest((cl2_2)var1_1 /* !! */ , (String)var3_3);
                var8_8 = var2_2;
                if (var1_1 /* !! */  == null) {
                    return null;
                }
                var2_2 = "content-type";
                var3_3 = "name";
                Intrinsics.checkNotNullParameter(var2_2, (String)var3_3);
                var2_2 = cl2_2.c((cl2_2)var1_1 /* !! */ , (String)var2_2);
                var11_11 = -1;
                var10_10 = 59;
                if (var2_2 != null && (var12_12 = var2_2.indexOf(var10_10)) > var11_11) {
                    var12_12 = var2_2.indexOf(var10_10);
                    var7_7 = false;
                    var6_6 /* !! */  = null;
                    var13_13 = var5_5 = var2_2.substring(0, var12_12);
                } else {
                    var13_13 = var2_2;
                }
                if (var2_2 == null || (var10_10 = var2_2.indexOf(var10_10)) <= var11_11) ** GOTO lbl-1000
                var3_3 = "charset=([\\w-_]+)";
                var2_2 = (var3_3 = Pattern.compile((String)var3_3)).matcher((CharSequence)var2_2);
                var11_11 = (int)var2_2.find();
                if (var11_11 != 0) {
                    var11_11 = 1;
                    var14_14 = var2_2 = var2_2.group(var11_11);
                } else lbl-1000:
                // 2 sources

                {
                    var14_14 = null;
                }
                var15_15 = new HashMap<JSONObject, Object>();
                var2_2 = var1_1 /* !! */ .f;
                var2_2 = var2_2.f();
                var2_2 = var2_2.entrySet();
                var2_2 = var2_2.iterator();
lbl49:
                // 2 sources

                while (true) {
                    var11_11 = (int)var2_2.hasNext();
                    if (var11_11 != 0) {
                        var3_3 = var2_2.next();
                        var3_3 = (Map.Entry)var3_3;
                        var4_4 /* !! */  = var3_3.getKey();
                        var4_4 /* !! */  = (String)var4_4 /* !! */ ;
                        var3_3 = var3_3.getValue();
                        var3_3 = (List)var3_3;
                        var5_5 = new StringBuilder();
                        var3_3 = var3_3.iterator();
                        break block12;
                    }
                    var16_16 = var1_1 /* !! */ .d;
                    var18_18 = var1_1 /* !! */ .c;
                    if (var8_8 == null) return null;
                    var6_6 /* !! */  = var1_1 /* !! */ ;
                    return new WebResourceResponse((String)var13_13, (String)var14_14, var16_16, var18_18, var15_15, var8_8);
                }
            }
            catch (Exception v0) {}
            return null;
        }
        while (var7_7 = var3_3.hasNext()) {
            var6_6 /* !! */  = var3_3.next();
            var16_16 = var5_5.length();
            if (var16_16 == 0) {
                var5_5 = new StringBuilder(var6_6 /* !! */ );
                continue;
            }
            var17_17 = ",";
            var5_5.append(var17_17);
            var5_5.append(var6_6 /* !! */ );
        }
        var3_3 = var5_5.toString();
        var15_15.put(var4_4 /* !! */ , var3_3);
        ** while (true)
    }

    public static /* synthetic */ void b(Godel godel, Activity activity, String string2, String string3, String string4, String string5, String string6, String string7) {
        godel.lambda$onBrowserReady$1(activity, string2, string3, string4, string5, string6, string7);
    }

    private String getAcsScript() {
        Object object = this.juspayServices.getFileProviderService();
        StringBuilder stringBuilder = new StringBuilder("window.juspayContext = {}; juspayContext['web_lab_rules'] = ");
        JSONObject jSONObject = this.getWebLabRules();
        stringBuilder.append(jSONObject);
        stringBuilder = nn_2.a(stringBuilder.toString(), ", ");
        jSONObject = this.juspayServices.getContext();
        object = ((FileProviderService)object).readFromFile((Context)jSONObject, "payments/in.juspay.godel/v1-acs.jsa");
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String getConnectionData(Reader reader, int n3) {
        int n4;
        char[] cArray;
        StringBuilder stringBuilder;
        try {
            stringBuilder = new StringBuilder();
            cArray = new char[n3];
        }
        catch (Exception exception) {
            return null;
        }
        while (true) {
            n4 = reader.read(cArray);
            int n7 = -1;
            if (n4 == n7) return stringBuilder.toString();
            n7 = 0;
            break;
        }
        {
            stringBuilder.append(cArray, 0, n4);
            continue;
        }
    }

    private InputStream getDataAcsFromPostRequest(cl2_2 cl2_22, String string2) {
        block7: {
            boolean bl2;
            String string3;
            block6: {
                string3 = ".html";
                try {
                    bl2 = string3.matches(string2);
                    if (!bl2) break block6;
                }
                catch (Exception exception) {
                    return null;
                }
                return this.handleHtmlFile(cl2_22);
            }
            string3 = ".js";
            bl2 = string3.matches(string2);
            if (bl2) break block7;
            string3 = ".jsp";
            boolean bl3 = string3.matches(string2);
            if (bl3) break block7;
            return null;
        }
        return this.handleJsFile(cl2_22);
    }

    private InputStream getDataFromGetRequest(NetUtils object, WebResourceRequest object2) {
        Object object3;
        Object object4 = "window.addEventListener('load', function() { if(!window.GK) { ";
        try {
            object3 = object2.getUrl();
        }
        catch (Exception exception) {
            return null;
        }
        String string2 = object3.toString();
        Map map2 = object2.getRequestHeaders();
        object = ((NetUtils)object).doGet(string2, map2, null, null, null);
        object = ((cl2_2)object).g;
        object = ((il2_2)object).a();
        object2 = this.getAcsScript();
        object3 = new StringBuilder((String)object4);
        ((StringBuilder)object3).append((String)object2);
        object2 = " } });";
        ((StringBuilder)object3).append((String)object2);
        object2 = ((StringBuilder)object3).toString();
        object3 = StandardCharsets.UTF_8;
        object2 = object2.getBytes((Charset)object3);
        object4 = new ByteArrayInputStream((byte[])object2);
        object2 = new SequenceInputStream((InputStream)object4, (InputStream)object);
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List getExcludeUrlsPatternList() {
        JSONException jSONException;
        Object object3;
        block12: {
            JSONException jSONException222;
            block9: {
                Exception exception;
                block11: {
                    Exception exception32;
                    block8: {
                        JSONException jSONException322;
                        Object object4;
                        block10: {
                            object3 = null;
                            try {
                                object4 = new LinkedList();
                            }
                            catch (Exception exception32) {
                                break block8;
                            }
                            catch (JSONException jSONException222) {
                                break block9;
                            }
                            try {
                                int n3;
                                object3 = this.config;
                                String object2 = "exclude_url_patterns";
                                object3 = object3.getJSONArray(object2);
                                int n4 = Godel.isNotNull((JSONArray)object3);
                                if (n4 == 0) return object4;
                                n4 = 0;
                                object2 = null;
                                while (n4 < (n3 = object3.length())) {
                                    Object object = object3.get(n4);
                                    object = object.toString();
                                    object = Pattern.compile((String)object);
                                    ((LinkedList)object4).add(object);
                                    ++n4;
                                }
                                return object4;
                            }
                            catch (Exception exception22) {
                            }
                            catch (JSONException jSONException322) {
                                break block10;
                            }
                            exception = exception22;
                            object3 = object4;
                            break block11;
                        }
                        jSONException = jSONException322;
                        object3 = object4;
                        break block12;
                    }
                    exception = exception32;
                }
                SdkTracker sdkTracker = this.sdkTracker;
                String string2 = LOG_TAG;
                String string3 = "util";
                String string4 = "Exception while compiling patterns in excludeUrlPatterns from config";
                String string5 = "action";
                String string6 = "system";
                sdkTracker.trackAndLogException(string2, string5, string6, string3, string4, exception);
                return object3;
            }
            jSONException = jSONException222;
        }
        SdkTracker sdkTracker = this.sdkTracker;
        String string7 = LOG_TAG;
        String string8 = "util";
        String string9 = "Json Exception while fetching excludeUrlPatterns from config";
        String string10 = "action";
        String string11 = "system";
        sdkTracker.trackAndLogException(string7, string10, string11, string8, string9, jSONException);
        return object3;
    }

    private cl2_2 getPostRequestConnection(JSONObject object, JSONObject jSONObject, WebResourceRequest webResourceRequest) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        String string2;
        String string3;
        block35: {
            string3 = "iframe_form_data";
            string2 = "wait_for_me";
            object5 = this.juspayServices;
            object5 = ((JuspayServices)object5).getJBridge();
            object5 = ((JsInterface)object5).getSessionAttribute(string3, string2);
            object4 = this.config;
            object3 = "waiting_time_postparams";
            object4 = object4.getJSONObject((String)object3);
            object3 = "total_time";
            int n3 = 1000;
            int n4 = object4.optInt((String)object3, n3);
            object2 = "interval";
            int n7 = 50;
            int n8 = object4.optInt((String)object2, n7);
            while (true) {
                n3 = (int)(((String)object5).equals(string2) ? 1 : 0);
                if (n3 == 0 || n4 <= 0) break;
                object5 = TimeUnit.MILLISECONDS;
                long l2 = n8;
                ((TimeUnit)((Object)object5)).sleep(l2);
                object5 = this.juspayServices;
                object5 = ((JuspayServices)object5).getJBridge();
                object5 = ((JsInterface)object5).getSessionAttribute(string3, string2);
                n4 -= n8;
                continue;
                break;
            }
            n8 = (int)(((String)object5).equals(string2) ? 1 : 0);
            if (n8 == 0) break block35;
            return null;
        }
        object4 = this.juspayServices;
        object4 = ((JuspayServices)object4).getJBridge();
        ((JsInterface)object4).setSessionAttribute(string3, string2);
        HashMap hashMap = this.toMap((String)object5);
        String string4 = "connection_timeout";
        int n10 = 10000;
        int n14 = object.optInt(string4, n10);
        object5 = "read_timeout";
        int n15 = object.optInt((String)object5, n10);
        object3 = new NetUtils(n14, n15);
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        object = jSONObject.keys();
        while (true) {
            n14 = (int)(object.hasNext() ? 1 : 0);
            if (n14 == 0) break;
            Object e2 = object.next();
            String string5 = (String)e2;
            string2 = jSONObject.getString(string5);
            hashMap2.put(string5, string2);
            continue;
            break;
        }
        try {
            object = webResourceRequest.getUrl();
        }
        catch (Exception exception) {
            return null;
        }
        object = object.toString();
        object2 = new URL((String)object);
        JSONObject jSONObject2 = new JSONObject();
        return ((NetUtils)object3).postUrl((URL)object2, hashMap2, hashMap, jSONObject2, null);
    }

    private List getRupaySpecificDomains() {
        ArrayList<Object> arrayList;
        block19: {
            JSONException jSONException;
            CharSequence charSequence;
            Object object;
            ArrayList<Object> arrayList2;
            Object object2;
            block23: {
                JSONException jSONException22;
                block25: {
                    Exception exception;
                    block22: {
                        Exception exception22;
                        block24: {
                            String string2 = "printing urlArray";
                            int n3 = 0;
                            arrayList = null;
                            object2 = this.config;
                            arrayList2 = "rupay_specific_domains";
                            object2 = object2.getJSONArray((String)((Object)arrayList2));
                            arrayList2 = this.juspayServices;
                            object = LOG_TAG;
                            charSequence = new StringBuilder(string2);
                            ((StringBuilder)charSequence).append(object2);
                            string2 = ((StringBuilder)charSequence).toString();
                            ((JuspayServices)((Object)arrayList2)).sdkDebug((String)object, string2);
                            int n4 = Godel.isNotNull((JSONArray)object2);
                            if (n4 == 0) break block19;
                            n4 = object2.length();
                            try {
                                arrayList2 = new ArrayList<Object>(n4);
                                arrayList = null;
                            }
                            catch (Exception exception22) {
                                break block24;
                            }
                            catch (JSONException jSONException22) {
                                break block25;
                            }
                            for (n3 = 0; n3 < n4; ++n3) {
                                JSONException jSONException32;
                                block21: {
                                    object = object2.get(n3);
                                    object = object.toString();
                                    try {
                                        arrayList2.add(object);
                                        continue;
                                    }
                                    catch (Exception exception3) {
                                    }
                                    catch (JSONException jSONException32) {
                                        break block21;
                                    }
                                    exception = exception3;
                                    arrayList = arrayList2;
                                    break block22;
                                }
                                jSONException = jSONException32;
                                arrayList = arrayList2;
                                break block23;
                            }
                            arrayList = arrayList2;
                            break block19;
                        }
                        exception = exception22;
                    }
                    object2 = this.sdkTracker;
                    arrayList2 = LOG_TAG;
                    String string3 = "util";
                    String string4 = "Exception while getting rupay urls from config";
                    object = "action";
                    charSequence = "system";
                    ((SdkTracker)object2).trackAndLogException((String)((Object)arrayList2), (String)object, (String)charSequence, string3, string4, exception);
                    break block19;
                }
                jSONException = jSONException22;
            }
            object2 = this.sdkTracker;
            arrayList2 = LOG_TAG;
            String string5 = "util";
            String string6 = "Json Exception while fetching Rupay Urls from config";
            object = "action";
            charSequence = "system";
            ((SdkTracker)object2).trackAndLogException((String)((Object)arrayList2), (String)object, (String)charSequence, string5, string6, jSONException);
        }
        return arrayList;
    }

    /*
     * Exception decompiling
     */
    private InputStream handleHtmlFile(cl2_2 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 4 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private InputStream handleJsFile(cl2_2 closeable) {
        Object object = "window.addEventListener('load', function() { if(!window.GK) { ";
        if (closeable == null) {
            return null;
        }
        try {
            closeable = ((cl2_2)closeable).g;
        }
        catch (Exception exception) {
            return null;
        }
        closeable = ((il2_2)closeable).a();
        Object object2 = this.getAcsScript();
        Comparable<StringBuilder> comparable = new StringBuilder((String)object);
        comparable.append((String)object2);
        object = " } });";
        comparable.append((String)object);
        object = comparable.toString();
        comparable = StandardCharsets.UTF_8;
        object = ((String)object).getBytes((Charset)comparable);
        object2 = new ByteArrayInputStream((byte[])object);
        object = new SequenceInputStream((InputStream)object2, (InputStream)closeable);
        return object;
    }

    private void initializeJuspayWebView(Context object) {
        this.sdkTracker.trackAction("system", "info", "initialise_juspay_webview", "started", object);
        int n3 = -1;
        object = new FrameLayout.LayoutParams(n3, n3);
        Object object2 = this.juspayWebView;
        int n4 = R$id.juspay_browser_view;
        object2.setId(n4);
        this.juspayWebView.setLayoutParams((ViewGroup.LayoutParams)object);
        this.juspayWebView.setHorizontalScrollBarEnabled(false);
        this.juspayWebView.setVerticalScrollBarEnabled(false);
        object = this.juspayWebView;
        object2 = this.acsInterface;
        object.addJavascriptInterface(object2, "ACSGatekeeper");
        object = this.juspayServices.getFileProviderService();
        object2 = this.paymentSessionInfo;
        JSONObject jSONObject = this.bundleParameters;
        ((PaymentSessionInfo)object2).setPaymentDetails(jSONObject);
        ((FileProviderService)object).addToFileCacheWhiteList("acs.jsa");
        this.prepareWebView();
    }

    private boolean isAcsToBeAddedToResource(URL uRL) {
        boolean bl2;
        Object object = this.getRupaySpecificDomains();
        if (object == null) {
            return false;
        }
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            Object object2 = uRL.toString();
            Locale locale = Locale.getDefault();
            bl2 = ((String)(object2 = ((String)object2).toLowerCase(locale))).contains(string2);
            if (!bl2) continue;
            string2 = uRL.getPath();
            object2 = Locale.getDefault();
            bl2 = (string2 = string2.toLowerCase((Locale)object2)).endsWith((String)(object2 = ".js"));
            if (!bl2) continue;
            string2 = uRL.getPath();
            object2 = Locale.getDefault();
            bl2 = (string2 = string2.toLowerCase((Locale)object2)).endsWith((String)(object2 = ".jsp"));
            if (bl2) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean isClientWhitelistedForWebViewAccess(String string2) {
        String string3;
        JSONArray jSONArray = Utils.optJSONArray(Utils.optJSONObject(Utils.optJSONObject(this.juspayServices.getSdkConfigService().getSdkConfig(), "godelConfig"), "webViewAccess"), "whitelistedClientIds");
        SdkTracker sdkTracker = null;
        try {
            int n4;
            for (int n3 = 0; n3 < (n4 = jSONArray.length()); ++n3) {
                string3 = jSONArray.getString(n3);
                n4 = (int)(string2.contains(string3) ? 1 : 0);
                if (n4 == 0) continue;
                return true;
            }
            return false;
        }
        catch (JSONException jSONException) {
            sdkTracker = this.sdkTracker;
            String string4 = "godel_webview_whitelist";
            String string5 = "Failed to read whitelisted config";
            string3 = GODEL;
            String string6 = "action";
            String string7 = "system";
            sdkTracker.trackAndLogException(string3, string6, string7, string4, string5, jSONException);
        }
        return false;
    }

    private static boolean isNotNull(JSONArray jSONArray) {
        boolean bl2;
        Object object;
        if (jSONArray != null && jSONArray != (object = JSONObject.NULL)) {
            bl2 = true;
        } else {
            bl2 = false;
            jSONArray = null;
        }
        return bl2;
    }

    private /* synthetic */ void lambda$onBrowserReady$0(Activity activity, String string2, String string3, String string4) {
        this.addWebView(activity, string2);
        this.loadPage(string3, string4);
    }

    private /* synthetic */ void lambda$onBrowserReady$1(Activity activity, String string2, String string3, String string4, String string5, String string6, String string7) {
        this.addWebView(activity, string2);
        this.juspayWebView.loadDataWithBaseURL(string3, string4, string5, string6, string7);
    }

    private boolean shouldDisableGodel(Context object) {
        String string2;
        int n3;
        if (object != null && (n3 = ((Workspace)(object = this.workspace)).isInSharedPreference(string2 = "GODEL_EXCEPTION_OFF")) != 0) {
            String string3;
            String string4;
            Object object2;
            Object object3;
            object = this.getConfig();
            String string5 = "ON_EXCEPTION_GODEL_OFF_STICKINESS";
            long l2 = 86400000L;
            long l3 = object.optLong(string5, l2);
            long l4 = System.currentTimeMillis();
            object = this.workspace;
            long l7 = System.currentTimeMillis();
            String string6 = String.valueOf(l7);
            object = ((Workspace)object).getFromSharedPreference(string2, string6);
            try {
                l7 = Long.parseLong((String)object);
                l4 -= l7;
            }
            catch (NumberFormatException numberFormatException) {
                object3 = numberFormatException;
                long l8 = System.currentTimeMillis();
                SdkTracker sdkTracker = this.sdkTracker;
                object2 = "should_disable_godel";
                string4 = "Failed while parsing number";
                String string7 = GODEL;
                string6 = "action";
                string3 = "user";
                sdkTracker.trackAndLogException(string7, string6, string3, (String)object2, string4, numberFormatException);
                l4 = l8;
            }
            object = this.workspace;
            string6 = "EXCEPTION_INFO";
            string3 = null;
            String string8 = ((Workspace)object).getFromSharedPreference(string6, null);
            object2 = this.sdkTracker;
            String string9 = "should_disable_godel";
            String string10 = "exception_info";
            string4 = "user";
            object3 = "info";
            ((SdkTracker)object2).trackAction(string4, (String)object3, string9, string10, string8);
            n3 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
            if (n3 <= 0) {
                return true;
            }
            this.workspace.removeFromSharedPreference(string2);
            object = this.workspace;
            string2 = "EXCEPTION_OFF";
            ((Workspace)object).removeFromSharedPreference(string2);
        }
        return false;
    }

    private WebResourceResponse shouldExcludeResource(String object) {
        boolean bl2;
        Pattern pattern = Pattern.compile(".*\\.(gif|jpg|jpeg|png)([;?].*)?$");
        Object object2 = Bitmap.Config.ARGB_4444;
        int n3 = 1;
        object2 = Bitmap.createBitmap((int)n3, (int)n3, (Bitmap.Config)object2);
        Object object3 = new ByteArrayOutputStream();
        Object object4 = Bitmap.CompressFormat.PNG;
        int n4 = 100;
        object2.compress((Bitmap.CompressFormat)object4, n4, (OutputStream)object3);
        object2 = ((ByteArrayOutputStream)object3).toByteArray();
        object3 = this.getExcludeUrlsPatternList();
        if (object3 == null) {
            object3 = new ArrayList();
        }
        object3 = object3.iterator();
        while (bl2 = object3.hasNext()) {
            object4 = ((Pattern)object3.next()).matcher((CharSequence)object);
            bl2 = ((Matcher)object4).matches();
            if (!bl2) continue;
            boolean bl3 = ((Matcher)(object = pattern.matcher((CharSequence)object))).matches();
            if (bl3) {
                object = "text/html";
            } else {
                object2 = "[blocked]".getBytes();
                object = "text/plain";
            }
            object3 = new ByteArrayInputStream((byte[])object2);
            pattern = new WebResourceResponse((String)object, "utf-8", (InputStream)object3);
            return pattern;
        }
        return null;
    }

    private HashMap toMap(String object) {
        boolean bl2;
        JSONObject jSONObject;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        try {
            jSONObject = new JSONObject((String)object);
        }
        catch (JSONException jSONException) {
            JuspayLogger.d(LOG_TAG, "Not a json string. Passing as such");
            return null;
        }
        object = jSONObject.keys();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            String string3 = jSONObject.getString(string2);
            hashMap.put(string2, string3);
        }
        return hashMap;
    }

    private void turnOffGodelIfNeeded() {
        Object object;
        Object object2 = this.context;
        boolean bl2 = this.shouldDisableGodel((Context)object2);
        if (bl2) {
            object2 = this.paymentSessionInfo;
            object = "ON_GODEL_EXCEPTION";
            ((PaymentSessionInfo)object2).setGodelDisabled((String)object);
        }
        if (!(bl2 = PaymentUtils.hasTelephonyService((JuspayServices)(object2 = this.juspayServices)))) {
            object2 = this.juspayServices;
            String string2 = "No telephony service found.. disabling JB";
            ((JuspayServices)object2).sdkDebug(GODEL, string2);
            object2 = this.paymentSessionInfo;
            object = "TELEPHONY_NOT_FOUND";
            ((PaymentSessionInfo)object2).setGodelDisabled((String)object);
        }
        object2 = this.juspayServices;
        object = this.paymentSessionInfo;
        PaymentUtils.switchOffGodelIfLowOnMemory(this, (JuspayServices)object2, (PaymentSessionInfo)object);
    }

    public void addWebView(Activity object, String object2) {
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        SdkTracker sdkTracker;
        int n3;
        Context context = this.context;
        this.initializeJuspayWebView(context);
        context = this.juspayServices.getContainer();
        if (context != null) {
            context = this.juspayServices.getContainer();
            int n4 = Integer.parseInt(object2);
            context = (FrameLayout)context.findViewById(n4);
        } else {
            context = null;
        }
        if (context == null && object != null) {
            n3 = Integer.parseInt(object2);
            object = object.findViewById(n3);
            context = object;
            context = (FrameLayout)object;
        } else {
            sdkTracker = this.sdkTracker;
            string6 = "missing";
            string5 = "activity";
            string4 = "system";
            string3 = "error";
            string2 = "add_web_view";
            sdkTracker.trackAction(string4, string3, string2, string6, string5);
        }
        if (context == null) {
            this.sdkTracker.trackAction("system", "error", "add_web_view", "missing", "view");
            return;
        }
        object = this.juspayWebView.getParent();
        if (object == context) {
            this.sdkTracker.trackAction("system", "warning", "add_web_view", "parent", "parent view is same as before");
            return;
        }
        this.turnOffGodelIfNeeded();
        object = this.juspayWebView.getParent();
        if (object != null) {
            sdkTracker = this.sdkTracker;
            string6 = "parent";
            string5 = "already present";
            string4 = "system";
            string3 = "warning";
            string2 = "add_web_view";
            sdkTracker.trackAction(string4, string3, string2, string6, string5);
            n3 = object instanceof ViewGroup;
            if (n3 == 0) {
                this.sdkTracker.trackAction("system", "error", "add_web_view", "parent", "not a ViewGroup");
                return;
            }
            object = (ViewGroup)object;
            object2 = this.juspayWebView;
            object.removeView((View)object2);
        }
        object = this.juspayWebView;
        context.addView((View)object, 0);
    }

    public void exit() {
        n01_0 n01_02 = new n01_0(this);
        ExecutorManager.runOnMainThread(n01_02);
    }

    public AcsInterface getAcsInterface() {
        return this.acsInterface;
    }

    public List getAllowedDeeplinkPackages() {
        return this.allowedDeeplinkPackages;
    }

    public JSONObject getConfig() {
        return this.config;
    }

    public Context getContext() {
        return this.context;
    }

    public DuiInterface getDuiInterface() {
        return this.duiInterface;
    }

    public JuspayServices getJuspayServices() {
        return this.juspayServices;
    }

    public JuspayWebView getJuspayWebView() {
        return this.juspayWebView;
    }

    public PaymentSessionInfo getPaymentSessionInfo() {
        return this.paymentSessionInfo;
    }

    public JSONObject getWebLabRules() {
        Object object;
        JSONObject jSONObject;
        try {
            jSONObject = this.config;
            object = "weblab";
        }
        catch (Exception exception) {
            object = this.sdkTracker;
            String string2 = LOG_TAG;
            ((SdkTracker)object).trackAndLogException(string2, "action", "system", "util", "Unable to find weblab key in config", exception);
            return null;
        }
        return jSONObject.getJSONObject((String)object);
    }

    public boolean isDuiLoaded() {
        return true;
    }

    public void loadPage() {
        Object object = this.bundleParameters;
        String string2 = "url";
        boolean bl2 = object.has(string2);
        if (!bl2) {
            object = this.bundleParameters.optString(string2);
            string2 = this.bundleParameters;
            String string3 = "postData";
            string2 = string2.optString(string3);
            this.loadPage((String)object, string2);
        } else {
            object = "file:///android_assets/juspay/acs_blank.html";
            string2 = null;
            this.loadPage((String)object, null);
        }
    }

    public void loadPage(String string2, String object) {
        Object object2 = this.bundleParameters;
        Object object3 = "url";
        object2.put((String)object3, (Object)string2);
        object2 = this.bundleParameters;
        object3 = "postData";
        try {
            object2.put((String)object3, object);
        }
        catch (JSONException jSONException) {
            object3 = this.sdkTracker;
            String string3 = "load_page";
            String string4 = "Failed to write to JSON bundle parameters";
            String string5 = GODEL;
            String string6 = "lifecycle";
            String string7 = "hypersdk";
            ((SdkTracker)object3).trackAndLogException(string5, string6, string7, string3, string4, jSONException);
        }
        if (object != null) {
            object2 = this.juspayWebView;
            object = object.getBytes();
            object2.postUrl(string2, (byte[])object);
        } else {
            object = this.juspayWebView;
            object.loadUrl(string2);
        }
    }

    public void onBrowserReady(Activity activity, String string2, String string3, String string4) {
        l01_0 l01_02 = new l01_0(this, activity, string4, string2, string3);
        ExecutorManager.runOnMainThread(l01_02);
    }

    public void onBrowserReady(Activity activity, String string2, String string3, String string4, String string5, String string6, String string7) {
        m01_0 m01_02 = new m01_0(this, activity, string7, string2, string3, string4, string5, string6);
        ExecutorManager.runOnMainThread(m01_02);
    }

    public void onDuiReady() {
        this.paymentSessionInfo.setGodelManager(this);
        this.juspayServices.getJBridge().attach("NETWORK_STATUS", "{}", "");
        this.setupAllowedDeeplinkPackages();
        this.sdkTracker.trackLifecycle("hypersdk", "info", "on_dui_ready", "class", "HyperFragment");
    }

    public void onDuiReleased() {
        SdkTracker sdkTracker = this.sdkTracker;
        Object object = JSONObject.NULL;
        sdkTracker.trackAction("system", "info", "on_dui_released", "exit_sdk", object);
        this.exit();
        this.paymentSessionInfo.setGodelManager(null);
    }

    public void prepareWebView() {
        Object object;
        String string2;
        String string3;
        String string4;
        String string5;
        Object object2;
        Object object3;
        boolean bl2;
        Object object4;
        Object object5;
        boolean bl3;
        int n3;
        Object object6;
        block14: {
            object6 = this.juspayWebView.getSettings();
            n3 = 1;
            object6.setJavaScriptEnabled(n3 != 0);
            this.juspayWebView.getSettings().setDomStorageEnabled(n3 != 0);
            bl3 = false;
            object6 = null;
            object5 = this.bundleParameters;
            object4 = "payload";
            object6 = object5.getJSONObject(object4);
            object5 = "godel_receive_merchant_messages";
            bl2 = object6.optBoolean((String)object5);
            if (!bl2) break block14;
            object5 = this.juspayWebView;
            object3 = this.juspayServices;
            object4 = new GodelJsInterface((JuspayServices)object3);
            object3 = "GodelInterface";
            try {
                object5.addJavascriptInterface(object4, (String)object3);
            }
            catch (JSONException jSONException) {
                object5 = this.sdkTracker;
                object2 = "initialise_juspay_webview";
                string5 = "Initiate payload is missing";
                object4 = GODEL;
                object3 = "action";
                string4 = "system";
                ((SdkTracker)object5).trackAndLogException((String)object4, (String)object3, string4, (String)object2, string5, jSONException);
            }
        }
        object5 = this.juspayWebView;
        object4 = this.juspayWebViewClient;
        ((JuspayWebView)((Object)object5)).setDefaultWebViewClient((WebViewClient)object4);
        object5 = this.juspayWebView;
        object4 = this.juspayWebChromeClient;
        ((JuspayWebView)((Object)object5)).setDefaultWebChromeClient((WebChromeClient)object4);
        this.juspayWebView.getSettings().setAllowFileAccess(n3 != 0);
        object5 = this.juspayWebView.getSettings();
        int n4 = -1;
        object5.setCacheMode(n4);
        object3 = this.sdkTracker;
        Object object7 = Boolean.TRUE;
        string5 = "initialise_juspay_webview";
        Object object8 = "enabling_third_party_cookies";
        object2 = "info";
        ((SdkTracker)object3).trackAction("system", (String)object2, string5, (String)object8, object7);
        object5 = CookieManager.getInstance();
        object4 = this.juspayWebView;
        object5.setAcceptThirdPartyCookies((WebView)object4, n3 != 0);
        object5 = this.juspayServices.getJBridge();
        object3 = "{}";
        string4 = "";
        object5 = ((DuiInterface)object5).execute("NETWORK_STATUS", string4, (String)object3, string4);
        object4 = String.valueOf(n3 != 0);
        bl2 = ((String)object5).equals(object4);
        if (!bl2) {
            object2 = this.sdkTracker;
            string3 = "no_network";
            string2 = "Setting web view to load from cache if there is no network";
            string5 = "system";
            object8 = "info";
            object7 = "initialise_juspay_webview";
            ((SdkTracker)object2).trackAction(string5, (String)object8, (String)object7, string3, string2);
            object5 = this.juspayWebView.getSettings();
            object5.setCacheMode(n3);
        }
        if ((n3 = (object = this.bundleParameters).has((String)(object5 = "clearCookies"))) != 0 && (n3 = (object = this.bundleParameters).optBoolean((String)object5)) != 0) {
            object2 = this.sdkTracker;
            string3 = "clearing";
            string2 = "cookies";
            string5 = "system";
            object8 = "info";
            object7 = "initialise_juspay_webview";
            ((SdkTracker)object2).trackAction(string5, (String)object8, (String)object7, string3, string2);
            object = this.juspayServices;
            PaymentUtils.clearCookies((JuspayServices)object);
        }
        if (object6 != null) {
            object6 = object6.optString("clientId", string4);
            object = this.juspayWebViewConfigurationCallback;
            if (object != null && (bl3 = this.isClientWhitelistedForWebViewAccess((String)object6))) {
                object6 = this.juspayWebViewConfigurationCallback;
                object = this.juspayWebView;
                object6.configureJuspayWebView((WebView)object);
                object5 = this.sdkTracker;
                object2 = "configured";
                string5 = "JuspayWebView";
                object4 = "system";
                object3 = "info";
                string4 = "godel_webview_whitelist";
                ((SdkTracker)object5).trackAction((String)object4, (String)object3, string4, (String)object2, string5);
            }
        } else {
            object8 = this.sdkTracker;
            String string6 = "missing";
            String string7 = "JuspayWebView";
            object7 = "system";
            string3 = "error";
            string2 = "initialise_juspay_webview";
            ((SdkTracker)object8).trackAction((String)object7, string3, string2, string6, string7);
        }
    }

    public void resetWebView() {
        JuspayWebView juspayWebView = this.juspayWebView;
        Object object = juspayWebView.getWebChromeClient();
        juspayWebView.setDefaultWebChromeClient((WebChromeClient)object);
        juspayWebView = this.juspayWebView;
        object = juspayWebView.getWebViewClient();
        juspayWebView.setDefaultWebViewClient((WebViewClient)object);
        this.juspayWebView.stopLoading();
        juspayWebView = this.juspayWebView;
        object = "ACSGatekeeper";
        juspayWebView.removeJavascriptInterface((String)object);
        this.juspayWebView.clearHistory();
        this.juspayWebView.destroy();
        juspayWebView = this.juspayWebView.getParent();
        if (juspayWebView != null) {
            juspayWebView = (ViewManager)this.juspayWebView.getParent();
            object = this.juspayWebView;
            juspayWebView.removeView((View)object);
        }
    }

    public void setConfig(JSONObject jSONObject) {
        this.config = jSONObject;
    }

    public void setIsRupaySupportedAdded(boolean bl2) {
        this.isRupaySupportedAdded = bl2;
    }

    public void setupAllowedDeeplinkPackages() {
        Object object;
        JSONObject jSONObject = this.processPayload;
        if (jSONObject != null) {
            object = "payload";
            jSONObject = jSONObject.optJSONObject((String)object);
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        jSONObject = jSONObject.optJSONArray("allowedDeepLinkPackages");
        object = this.allowedDeeplinkPackages;
        object.clear();
        if (jSONObject != null) {
            int n3;
            object = null;
            for (int i3 = 0; i3 < (n3 = jSONObject.length()); ++i3) {
                String string2 = jSONObject.optString(i3);
                if (string2 == null) continue;
                List list = this.allowedDeeplinkPackages;
                list.add(string2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        int n3;
        int n4;
        Object object;
        Object object2;
        block12: {
            int n7;
            int n8;
            block11: {
                int n10;
                block9: {
                    Exception exception2;
                    Object object3;
                    block10: {
                        block7: {
                            block8: {
                                object2 = this.juspayServices.getSessionInfo();
                                object3 = "inject_acs_into_iframes";
                                object = "false";
                                try {
                                    object2 = ((SessionInfo)object2).get((String)object3, (String)object);
                                    object3 = "true";
                                    n8 = ((String)object2).equals(object3);
                                    object3 = null;
                                    if (n8 == 0 || (n8 = ((String)(object2 = webResourceRequest.getMethod())).equals(object = "GET")) == 0) break block7;
                                    object2 = this.config;
                                    object = "bank_js_urls_v2";
                                    if ((object2 = object2.optJSONArray((String)object)) != null) break block8;
                                    object2 = this.config;
                                    object = "bank_js_urls";
                                    if ((object2 = object2.optJSONArray((String)object)) == null) return null;
                                    break block9;
                                }
                                catch (Exception exception2) {
                                    Exception exception3 = exception2;
                                    break block10;
                                }
                            }
                            object = null;
                            break block11;
                        }
                        object2 = webResourceRequest.getMethod();
                        n8 = ((String)object2).equals(object = "POST");
                        if (n8 == 0) return null;
                        object2 = this.config;
                        object = "post_urls";
                        if ((object2 = object2.optJSONArray((String)object)) == null) {
                            return null;
                        }
                        break block12;
                    }
                    object3 = this.sdkTracker;
                    object = LOG_TAG;
                    ((SdkTracker)object3).trackAndLogException((String)object, "action", "system", "util", "Exception while adding ACS to js file", exception2);
                    return null;
                }
                for (n4 = 0; n4 < (n10 = object2.length()); ++n4) {
                    object = object2.getString(n4);
                    object = Pattern.compile((String)object);
                    Object object4 = webResourceRequest.getUrl();
                    n10 = (int)(((Matcher)(object = ((Pattern)object).matcher((CharSequence)(object4 = object4.toString())))).find() ? 1 : 0);
                    if (n10 == 0) continue;
                    String string2 = "GET";
                    String string3 = ".*\\.jsp?$";
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    object4 = this;
                    WebResourceRequest webResourceRequest2 = webResourceRequest;
                    return this.addAcsToJSFile(webResourceRequest, string2, string3, jSONObject, jSONObject2);
                }
                return null;
            }
            for (int i3 = 0; i3 < (n7 = object2.length()); ++i3) {
                JSONArray jSONArray = object2.getJSONArray(i3);
                Object object5 = jSONArray.getString(0);
                object5 = Pattern.compile((String)object5);
                Object object6 = webResourceRequest.getUrl();
                boolean bl2 = ((Matcher)(object5 = ((Pattern)object5).matcher((CharSequence)(object6 = object6.toString())))).find();
                if (!bl2) continue;
                String string4 = "GET";
                n8 = 1;
                String string5 = jSONArray.getString(n8);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                object6 = this;
                WebResourceRequest webResourceRequest3 = webResourceRequest;
                return this.addAcsToJSFile(webResourceRequest, string4, string5, jSONObject, jSONObject3);
            }
            return null;
        }
        while (n4 < (n3 = object2.length())) {
            object = object2.getJSONObject(n4);
            Object object7 = "url";
            object7 = object.getString((String)object7);
            object7 = Pattern.compile((String)object7);
            Object object8 = webResourceRequest.getUrl();
            boolean bl3 = ((Matcher)(object7 = ((Pattern)object7).matcher((CharSequence)(object8 = object8.toString())))).find();
            if (bl3) {
                String string6 = "POST";
                object2 = "file_type";
                String string7 = object.getString((String)object2);
                object2 = "headers";
                JSONObject jSONObject = object.getJSONObject((String)object2);
                object2 = "timeout";
                JSONObject jSONObject4 = object.getJSONObject((String)object2);
                object8 = this;
                WebResourceRequest webResourceRequest4 = webResourceRequest;
                return this.addAcsToJSFile(webResourceRequest, string6, string7, jSONObject, jSONObject4);
            }
            ++n4;
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public WebResourceResponse shouldInterceptRequest(String object) {
        Exception exception222;
        String string2;
        Object object2;
        block15: {
            CharSequence charSequence;
            Object object3;
            block14: {
                Throwable throwable422;
                object3 = "Intercepted URL and modified: ";
                Object object4 = "Intercepted URL: ";
                object2 = this.juspayServices;
                string2 = LOG_TAG;
                charSequence = new StringBuilder((String)object4);
                ((StringBuilder)charSequence).append((String)object);
                object4 = ((StringBuilder)charSequence).toString();
                ((JuspayServices)object2).sdkDebug(string2, (String)object4);
                boolean bl2 = URLUtil.isValidUrl((String)object);
                if (!bl2 || !(bl2 = this.isAcsToBeAddedToResource((URL)(object4 = new URL((String)object)))) || (bl2 = this.isRupaySupportedAdded)) break block14;
                object4 = new URL((String)object);
                object2 = this.juspayServices;
                charSequence = new StringBuilder((String)object3);
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
                ((JuspayServices)object2).sdkDebug(string2, (String)object);
                boolean bl3 = true;
                this.setIsRupaySupportedAdded(bl3);
                object = this.getAcsScript();
                object2 = StandardCharsets.UTF_8;
                object = ((String)object).getBytes((Charset)object2);
                object3 = new ByteArrayInputStream((byte[])object);
                {
                    catch (Exception exception222) {}
                }
                object4 = ((URL)object4).openStream();
                object = new SequenceInputStream((InputStream)object3, (InputStream)object4);
                object2 = "text/javascript";
                string2 = "utf-8";
                object4 = new WebResourceResponse((String)object2, string2, (InputStream)object);
                ((SequenceInputStream)object).close();
                ((InputStream)object3).close();
                return object4;
                catch (Throwable throwable2) {
                    try {
                        ((SequenceInputStream)object).close();
                        throw throwable2;
                    }
                    catch (Throwable throwable3) {
                        try {
                            throwable2.addSuppressed(throwable3);
                            throw throwable2;
                        }
                        catch (Throwable throwable422) {}
                    }
                }
                try {
                    ((InputStream)object3).close();
                    throw throwable422;
                }
                catch (Throwable throwable5) {
                    throwable422.addSuppressed(throwable5);
                    throw throwable422;
                }
                break block15;
            }
            object3 = this.shouldExcludeResource((String)object);
            if (object3 == null) return null;
            object2 = this.sdkTracker;
            string2 = "system";
            charSequence = "info";
            String string3 = "util";
            String string4 = "url_excluded";
            ((SdkTracker)object2).trackAction(string2, (String)charSequence, string3, string4, object);
            return object3;
        }
        object2 = this.sdkTracker;
        string2 = LOG_TAG;
        ((SdkTracker)object2).trackAndLogException(string2, "action", "system", "util", "Error while Caching Files", exception222);
        return null;
    }
}

