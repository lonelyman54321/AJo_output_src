/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.utils.network;

import android.content.Context;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R$string;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.security.HyperSSLSocketFactory;
import in.juspay.hypersdk.utils.network.JuspayHttpsResponse;
import in.juspay.hypersdk.utils.network.JuspaySSLSocketFactory;
import in.juspay.hypersdk.utils.network.NetUtils$1;
import in.juspay.hypersdk.utils.network.NetworkSummarizer;
import in.juspay.hypersdk.utils.network.NetworkSummarizer$Summary;
import java.io.File;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public class NetUtils {
    public static final x72_0 DEFAULT_HTTP_CLIENT;
    private static final String HTTP_CACHE_NAME = "hyper-http-cache";
    private static final jn1_0 MEDIA_TYPE_TEXT;
    private static final String TAG = "NetUtils";
    private static String USER_AGENT;
    private static String godelAppName;
    private static String packageName;
    private int connectionTimeout;
    private final x72_0 httpClient;
    private final NetworkSummarizer networkSummarizer;
    private int readTimeout;
    private String sessionId;
    private final boolean sslPinningRequired;
    private SSLSocketFactory sslSocketFactory;
    private boolean trackMetrics = false;

    static {
        Object object = jn1_0.d;
        MEDIA_TYPE_TEXT = JN1$a.b("text/plain");
        int n3 = 0;
        packageName = null;
        godelAppName = null;
        DEFAULT_HTTP_CLIENT = NetUtils.buildHttpClient();
        USER_AGENT = object = System.getProperty("http.agent");
        if (object == null || (n3 = ((String)object).length()) == 0) {
            USER_AGENT = object = "Juspay Express Checkout Android SDK";
        }
    }

    public NetUtils(int n3, int n4) {
        this(n3, n4, false);
    }

    public NetUtils(int n3, int n4, boolean bl2) {
        NetworkSummarizer networkSummarizer;
        this.networkSummarizer = networkSummarizer = new NetworkSummarizer();
        this.connectionTimeout = n3;
        this.readTimeout = n4;
        this.sslPinningRequired = bl2;
        x72$a x72$a = DEFAULT_HTTP_CLIENT.d();
        long l2 = n4;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x72$a.c(l2, timeUnit);
        l2 = n3;
        x72$a.b(l2, timeUnit);
        Object object = new x72_0(x72$a);
        this.httpClient = object;
        this.sslSocketFactory = object = new JuspaySSLSocketFactory();
    }

    public static /* synthetic */ jn1_0 access$000() {
        return MEDIA_TYPE_TEXT;
    }

    private static x72_0 buildHttpClient() {
        Object object = JuspayCoreLib.getApplicationContext().getDir(HTTP_CACHE_NAME, 0);
        Object object2 = new ri_2((File)object, 0xA00000L);
        object = new x72$a();
        ((x72$a)object).k = object2;
        ((x72$a)object).i = false;
        object2 = new x72_0((x72$a)object);
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cancelAPICall(String string2, SdkTracker sdkTracker) {
        try {
            boolean bl2;
            boolean bl3;
            Object object;
            Object object2;
            Object object3;
            Iterator iterator;
            block5: {
                boolean bl4;
                iterator = DEFAULT_HTTP_CLIENT;
                iterator = ((x72_0)((Object)iterator)).a;
                iterator = ((fr0_2)((Object)iterator)).f();
                iterator = iterator.iterator();
                do {
                    bl3 = iterator.hasNext();
                    object3 = Object.class;
                    if (!bl3) break block5;
                    object = iterator.next();
                } while (!(bl4 = string2.equals(object3 = ((kj2_2)(object2 = (object = (ij_2)object).request())).d((Class)object3))));
                object.cancel();
                String string3 = "network";
                String string4 = "info";
                String string5 = "cancel_api";
                String string6 = "Cancelling api call from running calls";
                object2 = sdkTracker;
                String string7 = string2;
                sdkTracker.trackAction(string3, string4, string5, string6, string2);
                return;
            }
            iterator = DEFAULT_HTTP_CLIENT;
            iterator = ((x72_0)((Object)iterator)).a;
            iterator = ((fr0_2)((Object)iterator)).e();
            iterator = iterator.iterator();
            do {
                if (!(bl3 = iterator.hasNext())) {
                    object = sdkTracker;
                    String string8 = string2;
                    sdkTracker.trackAction("network", "info", "cancel_api", "Not able to Cancel api call from queued/running calls", string2);
                    return;
                }
                object = iterator.next();
                object = (ij_2)object;
                object2 = object.request();
            } while (!(bl2 = string2.equals(object2 = ((kj2_2)object2).d((Class)object3))));
            object.cancel();
            String string9 = "network";
            String string10 = "info";
            String string11 = "cancel_api";
            String string12 = "Cancelling api call from queued calls";
            SdkTracker sdkTracker2 = sdkTracker;
            sdkTracker.trackAction(string9, string10, string11, string12, string2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
        }
        String string13 = kp1_0.c("Exception while Cancelling API with tag ", string2);
        SdkTracker sdkTracker3 = sdkTracker;
        sdkTracker.trackAndLogException(TAG, "action", "system", "cancel_api", string13, exception);
    }

    private static pj2_2 createRequestBody(byte[] byArray, String string2) {
        NetUtils$1 netUtils$1 = new NetUtils$1(string2, byArray);
        return netUtils$1;
    }

    private cl2_2 doMethod(String object, String charSequence, Map object2, Map object3, byte[] object4, String object5, JSONObject object6, String object7) {
        int n3;
        object2 = this.generateQueryString((Map)object2);
        Object object8 = new StringBuilder((String)charSequence);
        boolean bl2 = ((String)object2).isEmpty();
        if (!bl2) {
            charSequence = h30_0.a((StringBuilder)object8, "?", (String)object2);
        }
        object2 = new KJ2$a();
        ((KJ2$a)object2).h((String)charSequence);
        if (object7 != null) {
            object8 = Object.class;
            ((KJ2$a)object2).g((Class)object8, object7);
        }
        if (object3 != null) {
            NetUtils.setHeaders((KJ2$a)object2, (Map)object3);
        }
        object7 = this.getDefaultSDKHeaders();
        NetUtils.setHeaders((KJ2$a)object2, (Map)object7);
        if (object4 != null) {
            if ((object3 = NetUtils.getContentType((Map)object3)) != null) {
                object5 = object3;
            }
            object3 = NetUtils.createRequestBody((byte[])object4, (String)object5);
            ((KJ2$a)object2).e((String)object, (pj2_2)object3);
        } else {
            boolean n4 = false;
            object3 = null;
            ((KJ2$a)object2).e((String)object, null);
        }
        object3 = DEFAULT_HTTP_CLIENT.d();
        if (object6 != null) {
            this.setOptions((x72$a)object3, (JSONObject)object6);
        }
        if ((object4 = this.sslSocketFactory) != null && (object5 = HyperSSLSocketFactory.DEFAULT_TRUST_MANAGER) != null) {
            ((x72$a)object3).d((SSLSocketFactory)object4, (X509TrustManager)object5);
        }
        long l2 = System.currentTimeMillis();
        object6 = new x72_0((x72$a)object3);
        object2 = ((KJ2$a)object2).b();
        object2 = ((x72_0)object6).b((kj2_2)object2).execute();
        long l3 = System.currentTimeMillis() - l2;
        object3 = "GET";
        boolean bl3 = ((String)object).equalsIgnoreCase((String)object3);
        int n4 = ((cl2_2)object2).d;
        object5 = TAG;
        object8 = " -> ";
        String string2 = "CACHE-HIT";
        String string3 = " ";
        String string4 = "CACHE-MISS";
        if (bl3) {
            int n7;
            object = ((cl2_2)object2).h;
            int n8 = -1;
            n3 = object != null ? ((cl2_2)object).d : -1;
            cl2_2 cl2_22 = ((cl2_2)object2).i;
            if (cl2_22 != null && n3 == (n7 = 304)) {
                string4 = "CONDITIONAL-HIT";
            } else if (cl2_22 != null && n3 == n8) {
                string4 = string2;
            }
            object3 = "x-cache";
            Intrinsics.checkNotNullParameter(object3, "name");
            object = cl2_2.c((cl2_2)object2, (String)object3);
            charSequence = oe3_0.a(n4, "GET ", (String)charSequence, string3, (String)object8);
            ((StringBuilder)charSequence).append(l3);
            ((StringBuilder)charSequence).append(" ms [");
            ((StringBuilder)charSequence).append(string4);
            object3 = "] [x-cache: ";
            ((StringBuilder)charSequence).append((String)object3);
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("]");
            object = ((StringBuilder)charSequence).toString();
            JuspayLogger.d((String)object5, (String)object);
        } else {
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(string3);
            ((StringBuilder)object3).append((String)charSequence);
            ((StringBuilder)object3).append(string3);
            ((StringBuilder)object3).append(n4);
            ((StringBuilder)object3).append((String)object8);
            ((StringBuilder)object3).append(l3);
            ((StringBuilder)object3).append(" ms");
            object = ((StringBuilder)object3).toString();
            JuspayLogger.d((String)object5, (String)object);
        }
        n3 = (int)(string4.equalsIgnoreCase(string2) ? 1 : 0);
        if (n3 == 0 && (n3 = (int)(this.trackMetrics ? 1 : 0)) != 0) {
            object = this.networkSummarizer;
            ((NetworkSummarizer)object).addMetric((cl2_2)object2, l3);
        }
        return object2;
    }

    private static String getContentType(Map map2) {
        Object object;
        if (map2 != null) {
            object = (String)map2.get("content-type");
            if (object == null) {
                map2 = map2.get("Content-Type");
                object = map2;
                object = (String)((Object)map2);
            }
        } else {
            object = null;
        }
        return object;
    }

    public static void setApplicationHeaders(Context context) {
        packageName = context.getPackageName();
        int n3 = R$string.godel_app_name;
        godelAppName = context.getString(n3);
    }

    private void setDefaultSDKHeaders(HttpsURLConnection httpsURLConnection) {
        boolean bl2;
        Iterator iterator = this.getDefaultSDKHeaders().entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            String string2 = (String)object.getKey();
            object = (String)object.getValue();
            if (string2 == null || object == null) continue;
            httpsURLConnection.setRequestProperty(string2, (String)object);
        }
    }

    private static void setHeaders(KJ2$a kJ2$a, Map object) {
        if (object != null) {
            boolean bl2;
            object = object.entrySet().iterator();
            while (bl2 = object.hasNext()) {
                String string2;
                boolean bl3;
                Object object2 = (Map.Entry)object.next();
                String string3 = (String)object2.getKey();
                object2 = (String)object2.getValue();
                if (string3 == null || object2 == null || (bl3 = string3.equalsIgnoreCase(string2 = "accept-encoding")) && (bl3 = ((String)object2).equalsIgnoreCase(string2 = "gzip"))) continue;
                kJ2$a.d(string3, (String)object2);
            }
        }
    }

    private void setOptions(x72$a x72$a, JSONObject jSONObject) {
        long l2;
        int n3 = this.connectionTimeout;
        String string2 = "connectionTimeout";
        n3 = jSONObject.optInt(string2, n3);
        int n4 = this.readTimeout;
        n4 = jSONObject.optInt("readTimeout", n4);
        Object object = "writeTimeout";
        int n7 = -1;
        int n8 = jSONObject.optInt(object, n7);
        Object object2 = "retryOnConnectionFailure";
        boolean bl2 = true;
        boolean bl3 = jSONObject.optBoolean(object2, bl2);
        if (n3 != n7) {
            long l3 = n3;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            x72$a.b(l3, timeUnit);
        }
        if (n4 != n7) {
            l2 = n4;
            object2 = TimeUnit.MILLISECONDS;
            x72$a.c(l2, (TimeUnit)((Object)object2));
        }
        if (n8 != n7) {
            l2 = n8;
            object = TimeUnit.MILLISECONDS;
            x72$a.e(l2, (TimeUnit)((Object)object));
        }
        x72$a.f = bl3;
    }

    public cl2_2 deleteUrl(URL uRL, Map map2, String string2, JSONObject jSONObject, String string3) {
        byte[] byArray = string2.getBytes();
        return this.doDelete(uRL, byArray, "application/x-www-form-urlencoded", map2, jSONObject, string3);
    }

    public cl2_2 deleteUrl(URL uRL, Map map2, Map map3, JSONObject jSONObject, String string2) {
        byte[] byArray = this.generateQueryString(map3).getBytes();
        return this.doDelete(uRL, byArray, "application/json", map2, jSONObject, string2);
    }

    public cl2_2 deleteUrl(URL uRL, Map map2, JSONObject jSONObject) {
        byte[] byArray = this.generateQueryString(map2).getBytes();
        return this.doDelete(uRL, byArray, "application/x-www-form-urlencoded", null, jSONObject, null);
    }

    public cl2_2 deleteUrl(URL uRL, JSONObject jSONObject) {
        return this.doDelete(uRL, null, "application/x-www-form-urlencoded", null, jSONObject, null);
    }

    public cl2_2 doDelete(URL uRL, byte[] byArray, String string2, Map map2, JSONObject jSONObject, String string3) {
        String string4 = uRL.toString();
        return this.doMethod("DELETE", string4, null, map2, byArray, string2, jSONObject, string3);
    }

    public cl2_2 doGet(String string2) {
        return this.doGet(string2, null, null, null, null);
    }

    public cl2_2 doGet(String string2, Map map2) {
        return this.doMethod("GET", string2, null, map2, null, null, null, null);
    }

    public cl2_2 doGet(String string2, Map map2, Map map3, JSONObject jSONObject, String string3) {
        return this.doMethod("GET", string2, map3, map2, null, null, jSONObject, string3);
    }

    public cl2_2 doHead(String string2, Map map2, Map map3, JSONObject jSONObject, String string3) {
        return this.doMethod("HEAD", string2, map3, map2, null, null, jSONObject, string3);
    }

    public cl2_2 doPost(URL uRL, byte[] byArray, String string2, Map map2, JSONObject jSONObject, String string3) {
        String string4 = uRL.toString();
        return this.doMethod("POST", string4, null, map2, byArray, string2, jSONObject, string3);
    }

    public cl2_2 doPut(Context context, URL uRL, byte[] byArray, Map map2, NetUtils netUtils, JSONObject jSONObject, String string2) {
        String string3 = uRL.toString();
        return this.doMethod("PUT", string3, null, map2, byArray, null, jSONObject, string2);
    }

    public byte[] fetchIfModified(String object, Map object2) {
        JSONObject jSONObject = new JSONObject();
        object = this.doGet((String)object, (Map)object2, null, jSONObject, null);
        int n3 = ((cl2_2)object).d;
        int n4 = 200;
        if (n3 == n4) {
            object2 = new JuspayHttpsResponse((cl2_2)object);
            return ((JuspayHttpsResponse)object2).responsePayload;
        }
        return null;
    }

    public String generateQueryString(Map object) {
        StringBuilder stringBuilder = new StringBuilder();
        if (object != null) {
            boolean bl2;
            object = object.entrySet().iterator();
            while (bl2 = object.hasNext()) {
                Object object2 = (Map.Entry)object.next();
                int n3 = stringBuilder.length();
                if (n3 > 0) {
                    n3 = 38;
                    stringBuilder.append((char)n3);
                }
                String string2 = (String)object2.getKey();
                String string3 = "UTF-8";
                string2 = URLEncoder.encode(string2, string3);
                stringBuilder.append(string2);
                n3 = 61;
                stringBuilder.append((char)n3);
                object2 = URLEncoder.encode((String)object2.getValue(), string3);
                stringBuilder.append((String)object2);
            }
        }
        return stringBuilder.toString();
    }

    public Map getDefaultSDKHeaders() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string2 = USER_AGENT;
        hashMap.put("User-Agent", string2);
        hashMap.put("Accept-Language", "en-US,en;q=0.5");
        hashMap.put("X-Powered-By", "Juspay EC SDK for Android");
        string2 = godelAppName;
        hashMap.put("X-App-Name", string2);
        string2 = packageName;
        hashMap.put("Referer", string2);
        string2 = String.valueOf(JuspayCoreLib.isMultiClientIntegration());
        hashMap.put("x-multiclient-integration", string2);
        return hashMap;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public cl2_2 postForm(URL uRL, Map map2, JSONObject jSONObject) {
        byte[] byArray = this.generateQueryString(map2).getBytes();
        return this.doPost(uRL, byArray, "application/x-www-form-urlencoded", null, jSONObject, null);
    }

    public cl2_2 postJson(URL uRL, Object object, JSONObject jSONObject) {
        byte[] byArray = object.toString().getBytes();
        return this.doPost(uRL, byArray, "application/json", null, jSONObject, null);
    }

    public void postMetrics(String string2, String object, String string3, boolean bl2) {
        object = this.networkSummarizer.publishSummary((String)object, string3, bl2);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        object = ((NetworkSummarizer$Summary)object).toJSON().toString();
        hashMap.put("summary", object);
        this.doMethod("GET", string2, hashMap, null, null, null, null, null).close();
    }

    public cl2_2 postUrl(URL uRL, Map map2, String string2, JSONObject jSONObject, String string3) {
        byte[] byArray = string2.getBytes();
        return this.doPost(uRL, byArray, "application/x-www-form-urlencoded", map2, jSONObject, string3);
    }

    public cl2_2 postUrl(URL uRL, Map map2, Map map3, JSONObject jSONObject, String string2) {
        byte[] byArray = this.generateQueryString(map3).getBytes();
        return this.doPost(uRL, byArray, "application/json", map2, jSONObject, string2);
    }

    public cl2_2 postUrl(URL uRL, Map map2, JSONObject jSONObject) {
        byte[] byArray = this.generateQueryString(map2).getBytes();
        return this.doPost(uRL, byArray, "application/x-www-form-urlencoded", null, jSONObject, null);
    }

    public cl2_2 postUrl(URL uRL, JSONObject jSONObject) {
        return this.doPost(uRL, null, "application/x-www-form-urlencoded", null, jSONObject, null);
    }

    public void setConnectionTimeout(int n3) {
        this.connectionTimeout = n3;
    }

    public void setReadTimeout(int n3) {
        this.readTimeout = n3;
    }

    public void setSessionId(String string2) {
        this.sessionId = string2;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTrackMetrics(boolean bl2) {
        this.trackMetrics = bl2;
    }
}

