/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  android.util.Base64
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Base64;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.JBridge;
import in.juspay.hypersdk.core.JsInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.utils.network.JuspayHttpsResponse;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JBridge$2
extends AsyncTask {
    final /* synthetic */ JBridge this$0;
    final /* synthetic */ String val$callback;
    final /* synthetic */ String val$data;
    final /* synthetic */ DynamicUI val$dynamicUI;
    final /* synthetic */ String val$headers;
    final /* synthetic */ JSONObject val$jsonOptions;
    final /* synthetic */ String val$method;
    final /* synthetic */ NetUtils val$netUtils;
    final /* synthetic */ SdkTracker val$sdkTracker;
    final /* synthetic */ boolean val$shouldEncodeToFormData;
    final /* synthetic */ long val$startTime;
    final /* synthetic */ String val$tag;
    final /* synthetic */ String val$url;

    public JBridge$2(JBridge jBridge, SdkTracker sdkTracker, String string2, String string3, long l2, String string4, String string5, JSONObject jSONObject, String string6, DynamicUI dynamicUI, String string7, boolean bl2, NetUtils netUtils) {
        this.this$0 = jBridge;
        this.val$sdkTracker = sdkTracker;
        this.val$url = string2;
        this.val$tag = string3;
        this.val$startTime = l2;
        this.val$data = string4;
        this.val$method = string5;
        this.val$jsonOptions = jSONObject;
        this.val$callback = string6;
        this.val$dynamicUI = dynamicUI;
        this.val$headers = string7;
        this.val$shouldEncodeToFormData = bl2;
        this.val$netUtils = netUtils;
    }

    private HashMap toMap(String object) {
        boolean bl2;
        JSONObject jSONObject;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        try {
            jSONObject = new JSONObject((String)object);
        }
        catch (JSONException jSONException) {
            this.this$0.juspayServices.sdkDebug("JBridge", "Not a json string. Passing as such");
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JuspayHttpsResponse doInBackground(Object[] objectArray) {
        SSLHandshakeException sSLHandshakeException;
        String string2;
        Object object;
        JBridge$2 jBridge$2;
        block16: {
            SocketTimeoutException socketTimeoutException;
            block15: {
                IOException iOException;
                int n3;
                block14: {
                    Exception exception2;
                    block13: {
                        Object object2;
                        boolean bl2;
                        HashMap hashMap;
                        Object object3;
                        block12: {
                            block11: {
                                jBridge$2 = this;
                                object = "rootLogFields";
                                string2 = "channels";
                                n3 = -1;
                                try {
                                    object3 = this.val$headers;
                                    hashMap = this.toMap((String)object3);
                                    bl2 = this.val$shouldEncodeToFormData;
                                    if (!bl2) break block11;
                                    object3 = this.val$data;
                                    object2 = object3 = this.toMap((String)object3);
                                    break block12;
                                }
                                catch (Exception exception2) {
                                    break block13;
                                }
                                catch (IOException iOException2) {
                                    iOException = iOException2;
                                    break block14;
                                }
                                catch (SocketTimeoutException socketTimeoutException2) {
                                    socketTimeoutException = socketTimeoutException2;
                                    break block15;
                                }
                                catch (SSLHandshakeException sSLHandshakeException2) {
                                    sSLHandshakeException = sSLHandshakeException2;
                                    break block16;
                                }
                            }
                            object2 = null;
                        }
                        object3 = "GET";
                        Object object4 = jBridge$2.val$method;
                        bl2 = ((String)object3).equals(object4);
                        if (bl2) {
                            object4 = jBridge$2.val$netUtils;
                            String string3 = jBridge$2.val$url;
                            Object object5 = jBridge$2.val$jsonOptions;
                            String string4 = jBridge$2.val$tag;
                            HashMap hashMap2 = hashMap;
                            hashMap = object5;
                            object5 = string4;
                            object4 = ((NetUtils)object4).doGet(string3, hashMap2, (Map)object2, (JSONObject)hashMap, string4);
                            return new JuspayHttpsResponse((cl2_2)object4);
                        }
                        object3 = "HEAD";
                        object4 = jBridge$2.val$method;
                        bl2 = ((String)object3).equals(object4);
                        if (bl2) {
                            object4 = jBridge$2.val$netUtils;
                            String string5 = jBridge$2.val$url;
                            Object object6 = jBridge$2.val$jsonOptions;
                            String string6 = jBridge$2.val$tag;
                            HashMap hashMap3 = hashMap;
                            hashMap = object6;
                            object6 = string6;
                            object4 = ((NetUtils)object4).doHead(string5, hashMap3, (Map)object2, (JSONObject)hashMap, string6);
                            return new JuspayHttpsResponse((cl2_2)object4);
                        }
                        object3 = "POST";
                        object4 = jBridge$2.val$method;
                        bl2 = ((String)object3).equals(object4);
                        if (bl2) {
                            if (object2 == null) {
                                object4 = jBridge$2.val$netUtils;
                                Object object7 = jBridge$2.val$url;
                                URL uRL = new URL((String)object7);
                                object2 = jBridge$2.val$data;
                                Object object8 = jBridge$2.val$jsonOptions;
                                String string7 = jBridge$2.val$tag;
                                object7 = hashMap;
                                hashMap = object8;
                                object8 = string7;
                                object4 = ((NetUtils)object4).postUrl(uRL, (Map)object7, (String)object2, (JSONObject)hashMap, string7);
                                return new JuspayHttpsResponse((cl2_2)object4);
                            }
                            object4 = jBridge$2.val$netUtils;
                            Object object9 = jBridge$2.val$url;
                            URL uRL = new URL((String)object9);
                            Object object10 = jBridge$2.val$jsonOptions;
                            String string8 = jBridge$2.val$tag;
                            object9 = hashMap;
                            hashMap = object10;
                            object10 = string8;
                            object4 = ((NetUtils)object4).postUrl(uRL, (Map)object9, (Map)object2, (JSONObject)hashMap, string8);
                            return new JuspayHttpsResponse((cl2_2)object4);
                        }
                        object3 = "DELETE";
                        object4 = jBridge$2.val$method;
                        bl2 = ((String)object3).equals(object4);
                        if (bl2) {
                            if (object2 == null) {
                                object4 = jBridge$2.val$netUtils;
                                Object object11 = jBridge$2.val$url;
                                URL uRL = new URL((String)object11);
                                object2 = jBridge$2.val$data;
                                Object object12 = jBridge$2.val$jsonOptions;
                                String string9 = jBridge$2.val$tag;
                                object11 = hashMap;
                                hashMap = object12;
                                object12 = string9;
                                object4 = ((NetUtils)object4).deleteUrl(uRL, (Map)object11, (String)object2, (JSONObject)hashMap, string9);
                                return new JuspayHttpsResponse((cl2_2)object4);
                            }
                            object4 = jBridge$2.val$netUtils;
                            Object object13 = jBridge$2.val$url;
                            URL uRL = new URL((String)object13);
                            Object object14 = jBridge$2.val$jsonOptions;
                            String string10 = jBridge$2.val$tag;
                            object13 = hashMap;
                            hashMap = object14;
                            object14 = string10;
                            object4 = ((NetUtils)object4).deleteUrl(uRL, (Map)object13, (Map)object2, (JSONObject)hashMap, string10);
                            return new JuspayHttpsResponse((cl2_2)object4);
                        }
                        object3 = "PUT";
                        object4 = jBridge$2.val$method;
                        bl2 = ((String)object3).equals(object4);
                        if (!bl2) return null;
                        object4 = jBridge$2.val$netUtils;
                        Object object15 = jBridge$2.this$0;
                        object15 = ((JsInterface)object15).juspayServices;
                        object15 = ((JuspayServices)object15).getContext();
                        object2 = jBridge$2.val$url;
                        URL uRL = new URL((String)object2);
                        object2 = jBridge$2.val$data;
                        object2 = ((String)object2).getBytes();
                        NetUtils netUtils = jBridge$2.val$netUtils;
                        JSONObject jSONObject = jBridge$2.val$jsonOptions;
                        String string11 = jBridge$2.val$tag;
                        object4 = ((NetUtils)object4).doPut((Context)object15, uRL, (byte[])object2, hashMap, netUtils, jSONObject, string11);
                        return new JuspayHttpsResponse((cl2_2)object4);
                    }
                    SdkTracker sdkTracker = jBridge$2.val$sdkTracker;
                    Long l2 = jBridge$2.val$startTime;
                    long l3 = System.currentTimeMillis();
                    Long l4 = l3;
                    String string12 = jBridge$2.val$data;
                    String string13 = jBridge$2.val$url;
                    String string14 = jBridge$2.val$method;
                    JSONArray jSONArray = jBridge$2.val$jsonOptions.optJSONArray(string2);
                    JSONObject jSONObject = jBridge$2.val$jsonOptions.optJSONObject((String)object);
                    String string15 = "network_call";
                    String string16 = "Exception while calling api";
                    String string17 = "JBridge";
                    String string18 = "api_call";
                    String string19 = "network";
                    Exception exception3 = exception2;
                    sdkTracker.trackAndLogApiException(string17, string18, string19, string15, l2, l4, string12, string13, string14, string16, exception2, jSONArray, jSONObject);
                    object = new byte[0];
                    string2 = exception2.getLocalizedMessage();
                    if (string2 == null) return new JuspayHttpsResponse(n3, (byte[])object, null);
                    String string20 = exception2.getLocalizedMessage();
                    object = string20.getBytes();
                    return new JuspayHttpsResponse(n3, (byte[])object, null);
                }
                SdkTracker sdkTracker = jBridge$2.val$sdkTracker;
                Long l7 = jBridge$2.val$startTime;
                Long l8 = System.currentTimeMillis();
                String string21 = jBridge$2.val$data;
                String string22 = jBridge$2.val$url;
                String string23 = jBridge$2.val$method;
                JSONArray jSONArray = jBridge$2.val$jsonOptions.optJSONArray(string2);
                JSONObject jSONObject = jBridge$2.val$jsonOptions.optJSONObject((String)object);
                sdkTracker.trackAndLogApiException("JBridge", "api_call", "network", "network_call", l7, l8, string21, string22, string23, "IOException while calling api", iOException, jSONArray, jSONObject);
                object = "Network Error".getBytes();
                return new JuspayHttpsResponse(n3, (byte[])object, null);
            }
            SdkTracker sdkTracker = jBridge$2.val$sdkTracker;
            Long l12 = jBridge$2.val$startTime;
            Long l14 = System.currentTimeMillis();
            String string24 = jBridge$2.val$data;
            String string25 = jBridge$2.val$url;
            String string26 = jBridge$2.val$method;
            JSONArray jSONArray = jBridge$2.val$jsonOptions.optJSONArray(string2);
            JSONObject jSONObject = jBridge$2.val$jsonOptions.optJSONObject((String)object);
            sdkTracker.trackAndLogApiException("JBridge", "api_call", "network", "network_call", l12, l14, string24, string25, string26, "SocketTimeoutException while calling api", socketTimeoutException, jSONArray, jSONObject);
            object = "Socket Timeout".getBytes();
            return new JuspayHttpsResponse(-3, (byte[])object, null);
        }
        SdkTracker sdkTracker = jBridge$2.val$sdkTracker;
        Long l15 = jBridge$2.val$startTime;
        Long l16 = System.currentTimeMillis();
        String string27 = jBridge$2.val$data;
        String string28 = jBridge$2.val$url;
        String string29 = jBridge$2.val$method;
        JSONArray jSONArray = jBridge$2.val$jsonOptions.optJSONArray(string2);
        JSONObject jSONObject = jBridge$2.val$jsonOptions.optJSONObject((String)object);
        sdkTracker.trackAndLogApiException("JBridge", "api_call", "network", "network_call", l15, l16, string27, string28, string29, "SSLHandshakeException while calling api", sSLHandshakeException, jSONArray, jSONObject);
        object = "SSL Handshake Failed".getBytes();
        return new JuspayHttpsResponse(-2, (byte[])object, null);
    }

    public void onPostExecute(Object object) {
        JBridge$2 jBridge$2 = this;
        Object object2 = "','', '";
        Object object3 = "{}";
        String string2 = "rootLogFields";
        Object object4 = "channels";
        String string3 = "','failure','";
        String string4 = "window.callUICallback('";
        if (object != null) {
            int n3;
            Object object5;
            Object object6;
            String string5;
            Object object7;
            int n4;
            Object object8;
            Object object9 = object;
            object9 = (JuspayHttpsResponse)object;
            byte[] byArray = ((JuspayHttpsResponse)object9).responsePayload;
            if (byArray != null) {
                object8 = this.val$sdkTracker;
                n4 = ((JuspayHttpsResponse)object9).responseCode;
                object7 = n4;
                String string6 = this.val$url;
                String string7 = this.val$tag;
                long l2 = this.val$startTime;
                Long l3 = System.currentTimeMillis();
                string5 = this.val$data;
                byte[] byArray2 = ((JuspayHttpsResponse)object9).responsePayload;
                object6 = new String(byArray2);
                object5 = this.val$method;
                JSONArray jSONArray = this.val$jsonOptions.optJSONArray((String)object4);
                JSONObject jSONObject = this.val$jsonOptions.optJSONObject(string2);
                object4 = "network_call";
                String string8 = "network";
                String string9 = object5;
                object5 = "info";
                string2 = string7;
                String string10 = object4;
                Object object10 = object6;
                ((SdkTracker)object8).trackApiCalls(string8, (String)object5, (String)object4, (Integer)object7, string6, string2, l2, l3, string5, object6, string9, jSONArray, jSONObject);
            } else {
                object6 = this.val$sdkTracker;
                n3 = ((JuspayHttpsResponse)object9).responseCode;
                Integer n7 = n3;
                string5 = this.val$url;
                String string11 = this.val$tag;
                long l4 = this.val$startTime;
                long l7 = System.currentTimeMillis();
                Long l8 = l7;
                object5 = this.val$data;
                String string12 = this.val$method;
                object7 = this.val$jsonOptions;
                JSONArray jSONArray = object7.optJSONArray((String)object4);
                object4 = this.val$jsonOptions;
                JSONObject jSONObject = object4.optJSONObject(string2);
                String string13 = "network_call";
                String string14 = "network";
                String string15 = "info";
                ((SdkTracker)object6).trackApiCalls(string14, string15, string13, n7, string5, string11, l4, l8, object5, null, string12, jSONArray, jSONObject);
            }
            int n8 = ((JuspayHttpsResponse)object9).responseCode;
            string2 = "');";
            object4 = "%20";
            string5 = "+";
            String string16 = "UTF-8";
            object8 = "','";
            int n10 = -1;
            if (n8 != n10 && n8 != (n10 = -2) && n8 != (n10 = -3)) {
                object2 = ((JuspayHttpsResponse)object9).responsePayload;
                object3 = "This happened: ";
                object6 = "JBridge";
                string3 = "";
                if (object2 == null) {
                    object4 = string3;
                    object5 = string3;
                } else {
                    String string17 = new String((byte[])object2);
                    object2 = new JSONObject(string17);
                    object2 = object2.toString();
                    object5 = jBridge$2.this$0;
                    object5 = ((JsInterface)object5).juspayServices;
                    String string18 = "message";
                    ((JuspayServices)object5).sdkDebug(string18, (String)object2);
                    object5 = ((String)object2).getBytes();
                    int n14 = 2;
                    object5 = Base64.encodeToString((byte[])object5, (int)n14);
                    object2 = URLEncoder.encode((String)object2, string16);
                    try {
                        object4 = object2 = ((String)object2).replace(string5, (CharSequence)object4);
                    }
                    catch (Exception exception) {
                        object5 = string17.getBytes();
                        n14 = 2;
                        object5 = Base64.encodeToString((byte[])object5, (int)n14);
                        String string19 = URLEncoder.encode(string17, string16);
                        try {
                            object4 = string19.replace(string5, (CharSequence)object4);
                        }
                        catch (Exception exception2) {
                            object4 = string3;
                        }
                        JuspayLogger.e((String)object6, (String)object3, exception);
                    }
                }
                object2 = jBridge$2.this$0.juspayServices;
                string5 = " ";
                StringBuilder stringBuilder = nn_2.a((String)object5, string5);
                n10 = ((JuspayHttpsResponse)object9).responseCode;
                stringBuilder.append(n10);
                String string20 = stringBuilder.toString();
                String string21 = "Response inserted: ";
                ((JuspayServices)object2).sdkDebug(string21, string20);
                object2 = ((JuspayHttpsResponse)object9).headers;
                if (object2 != null) {
                    object2 = new JSONObject();
                    Iterator iterator = ((JuspayHttpsResponse)object9).headers.entrySet().iterator();
                    while ((n10 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        Object k2;
                        Map.Entry entry = iterator.next();
                        try {
                            k2 = entry.getKey();
                        }
                        catch (Exception exception) {}
                        String string22 = (String)k2;
                        Object v4 = entry.getValue();
                        Collection collection = (Collection)v4;
                        object7 = new JSONArray(collection);
                        object2.put(string22, object7);
                    }
                    JBridge jBridge = jBridge$2.this$0;
                    JuspayServices juspayServices = jBridge.juspayServices;
                    String string23 = "headers";
                    String string24 = object2.toString();
                    juspayServices.sdkDebug(string23, string24);
                    object2 = object2.toString();
                    object2 = ((String)object2).getBytes();
                    n4 = 2;
                    try {
                        string3 = Base64.encodeToString((byte[])object2, (int)n4);
                    }
                    catch (Exception exception) {
                        JuspayLogger.e((String)object6, (String)object3, exception);
                    }
                }
                object2 = jBridge$2.this$0.juspayServices;
                object3 = nn_2.a(string3, string5);
                n8 = ((JuspayHttpsResponse)object9).responseCode;
                ((StringBuilder)object3).append(n8);
                object3 = ((StringBuilder)object3).toString();
                object6 = "Headers inserted: ";
                ((JuspayServices)object2).sdkDebug((String)object6, (String)object3);
                object2 = jBridge$2.val$callback;
                if (object2 != null) {
                    int n15 = ((JuspayHttpsResponse)object9).responseCode;
                    object6 = jBridge$2.val$url.getBytes();
                    n3 = 2;
                    object6 = Base64.encodeToString((byte[])object6, (int)n3);
                    string5 = "','success','";
                    object2 = og_1.a(string4, (String)object2, string5, (String)object5, (String)object8);
                    h30_0.b((StringBuilder)object2, n15, (String)object8, (String)object6, (String)object8);
                    object2 = ko_0.a((StringBuilder)object2, string3, "', '", (String)object4, string2);
                    object3 = jBridge$2.this$0.juspayServices;
                    object6 = "Js inserted: ";
                    ((JuspayServices)object3).sdkDebug((String)object6, (String)object2);
                    object3 = jBridge$2.val$dynamicUI;
                    ((DynamicUI)object3).addJsToWebView((String)object2);
                }
            } else {
                object3 = ((String)object3).getBytes();
                n8 = 2;
                String string25 = Base64.encodeToString((byte[])object3, (int)n8);
                object5 = jBridge$2.val$callback;
                if (object5 != null) {
                    int n16 = ((JuspayHttpsResponse)object9).responseCode;
                    object7 = jBridge$2.val$url;
                    object7 = ((String)object7).getBytes();
                    object7 = Base64.encodeToString((byte[])object7, (int)n8);
                    object3 = Arrays.toString((byte[])object3);
                    object3 = URLEncoder.encode((String)object3, string16);
                    object3 = ((String)object3).replace(string5, (CharSequence)object4);
                    object6 = new StringBuilder(string4);
                    ((StringBuilder)object6).append((String)object5);
                    ((StringBuilder)object6).append(string3);
                    ((StringBuilder)object6).append(string25);
                    ((StringBuilder)object6).append((String)object8);
                    ((StringBuilder)object6).append(n16);
                    ((StringBuilder)object6).append((String)object8);
                    ((StringBuilder)object6).append((String)object7);
                    ((StringBuilder)object6).append((String)object2);
                    ((StringBuilder)object6).append((String)object3);
                    try {
                        ((StringBuilder)object6).append(string2);
                        object2 = ((StringBuilder)object6).toString();
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException) {
                        object2 = jBridge$2.val$callback;
                        int n17 = ((JuspayHttpsResponse)object9).responseCode;
                        object6 = jBridge$2.val$url.getBytes();
                        int n18 = 2;
                        object6 = Base64.encodeToString((byte[])object6, (int)n18);
                        object2 = og_1.a(string4, (String)object2, string3, string25, (String)object8);
                        ((StringBuilder)object2).append(n17);
                        ((StringBuilder)object2).append((String)object8);
                        ((StringBuilder)object2).append((String)object6);
                        ((StringBuilder)object2).append(string2);
                        object2 = ((StringBuilder)object2).toString();
                    }
                    object3 = jBridge$2.val$dynamicUI;
                    ((DynamicUI)object3).addJsToWebView((String)object2);
                }
            }
        } else {
            SdkTracker sdkTracker = this.val$sdkTracker;
            int n19 = -1;
            Integer n20 = n19;
            String string26 = this.val$url;
            String string27 = this.val$tag;
            long l12 = this.val$startTime;
            Long l14 = System.currentTimeMillis();
            object2 = this.val$data;
            String string28 = this.val$method;
            JSONObject jSONObject = this.val$jsonOptions;
            JSONArray jSONArray = jSONObject.optJSONArray((String)object4);
            JSONObject jSONObject2 = this.val$jsonOptions.optJSONObject(string2);
            string2 = "network_call";
            String string29 = "failure";
            String string30 = "network";
            object4 = "info";
            String string31 = object4;
            String string32 = string2;
            sdkTracker.trackApiCalls(string30, (String)object4, string2, n20, string26, string27, l12, l14, object2, string29, string28, jSONArray, jSONObject2);
            object2 = this.val$callback;
            if (object2 != null) {
                object2 = ((String)object3).getBytes();
                int n21 = 2;
                object2 = Base64.encodeToString((byte[])object2, (int)n21);
                string28 = this.val$callback;
                object3 = Base64.encodeToString((byte[])this.val$url.getBytes(), (int)n21);
                string2 = "','-1','";
                object2 = og_1.a(string4, string28, string3, (String)object2, string2);
                string28 = "','%7B%7D');";
                object2 = h30_0.a((StringBuilder)object2, (String)object3, string28);
                object3 = this.val$dynamicUI;
                ((DynamicUI)object3).addJsToWebView((String)object2);
            }
        }
    }
}

