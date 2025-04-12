/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.network;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class HttpGetRequest {
    private static final int DEFAULT_TIMEOUT_MS = 10000;
    private static final String METHOD_GET = "GET";
    private static final int READ_BUFFER_SIZE = 8192;
    private final Map headers;
    private final Map queryParams;
    private final String url;

    public HttpGetRequest(String hashMap, Map map2) {
        this.url = hashMap;
        this.queryParams = map2;
        this.headers = hashMap = new HashMap();
    }

    private String createParamsString(Map object) {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder();
        object = object.entrySet().iterator();
        Object object2 = (Map.Entry)object.next();
        String string2 = (String)object2.getKey();
        stringBuilder.append(string2);
        string2 = "=";
        stringBuilder.append(string2);
        Object object3 = object2.getValue();
        String string3 = "";
        String string4 = "UTF-8";
        object2 = object3 != null ? URLEncoder.encode((String)object2.getValue(), string4) : string3;
        stringBuilder.append((String)object2);
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            stringBuilder.append("&");
            object3 = (String)object2.getKey();
            stringBuilder.append((String)object3);
            stringBuilder.append(string2);
            object3 = object2.getValue();
            object2 = object3 != null ? URLEncoder.encode((String)object2.getValue(), string4) : string3;
            stringBuilder.append((String)object2);
        }
        return stringBuilder.toString();
    }

    private String createUrlWithParams(String string2, Map object) {
        boolean bl2 = ((String)(object = this.createParamsString((Map)object))).isEmpty();
        if (bl2) {
            return string2;
        }
        String string3 = "?";
        boolean bl3 = string2.contains(string3);
        if (bl3) {
            string3 = "&";
            bl3 = string2.endsWith(string3);
            if (!bl3) {
                object = string3.concat((String)object);
            }
            return Ft2.a(string2, (String)object);
        }
        return n1.a(string2, string3, (String)object);
    }

    private String readStream(InputStream object) {
        int n3;
        int n4;
        String string2 = "UTF-8";
        Object object2 = new InputStreamReader((InputStream)object, string2);
        BufferedReader bufferedReader = new BufferedReader((Reader)object2);
        int n7 = 8192;
        object = new char[n7];
        object2 = new StringBuilder();
        while ((n4 = bufferedReader.read((char[])object)) != (n3 = -1)) {
            n3 = 0;
            ((StringBuilder)object2).append((char[])object, 0, n4);
        }
        return ((StringBuilder)object2).toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public HttpResponse execute() {
        void var3_7;
        Object object;
        Object object2;
        block10: {
            int n3;
            CharSequence charSequence;
            Object object3;
            Object object4;
            object2 = "GET Request URL: ";
            CrashlyticsWorkers.checkBlockingThread();
            object = null;
            try {
                object4 = this.url;
                object3 = this.queryParams;
                object4 = this.createUrlWithParams((String)object4, (Map)object3);
                object3 = Logger.getLogger();
                charSequence = new StringBuilder((String)object2);
                charSequence.append((String)object4);
                object2 = charSequence.toString();
                ((Logger)object3).v((String)object2);
                object2 = new URL((String)object4);
                object2 = ((URL)object2).openConnection();
                object2 = (HttpsURLConnection)object2;
                n3 = 10000;
            }
            catch (Throwable throwable) {
                object2 = null;
                break block10;
            }
            try {
                boolean bl2;
                ((URLConnection)object2).setReadTimeout(n3);
                ((URLConnection)object2).setConnectTimeout(n3);
                object4 = METHOD_GET;
                ((HttpURLConnection)object2).setRequestMethod((String)object4);
                object4 = this.headers;
                object4 = object4.entrySet();
                object4 = object4.iterator();
                while (bl2 = object4.hasNext()) {
                    object3 = object4.next();
                    object3 = (Map.Entry)object3;
                    charSequence = object3.getKey();
                    charSequence = (String)charSequence;
                    object3 = object3.getValue();
                    object3 = (String)object3;
                    ((URLConnection)object2).addRequestProperty((String)charSequence, (String)object3);
                }
            }
            catch (Throwable throwable) {
                break block10;
            }
            ((URLConnection)object2).connect();
            n3 = ((HttpURLConnection)object2).getResponseCode();
            object3 = ((URLConnection)object2).getInputStream();
            if (object3 != null) {
                try {
                    object = this.readStream((InputStream)object3);
                }
                catch (Throwable throwable) {
                    object = object3;
                    break block10;
                }
            }
            if (object3 != null) {
                ((InputStream)object3).close();
            }
            ((HttpURLConnection)object2).disconnect();
            return new HttpResponse(n3, (String)object);
        }
        if (object != null) {
            ((InputStream)object).close();
        }
        if (object2 == null) throw var3_7;
        ((HttpURLConnection)object2).disconnect();
        throw var3_7;
    }

    public HttpGetRequest header(String string2, String string3) {
        this.headers.put(string2, string3);
        return this;
    }

    public HttpGetRequest header(Map.Entry object) {
        String string2 = (String)object.getKey();
        object = (String)object.getValue();
        return this.header(string2, (String)object);
    }
}

