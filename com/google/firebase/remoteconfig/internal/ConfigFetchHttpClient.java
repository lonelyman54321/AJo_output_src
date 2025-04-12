/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build$VERSION
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchResponse;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {
    private static final String API_KEY_HEADER = "X-Goog-Api-Key";
    private static final String ETAG_HEADER = "ETag";
    private static final Pattern GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private static final String IF_NONE_MATCH_HEADER = "If-None-Match";
    private static final String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static final String ISO_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    private final String apiKey;
    private final String appId;
    private final long connectTimeoutInSeconds;
    private final Context context;
    private final String namespace;
    private final String projectNumber;
    private final long readTimeoutInSeconds;

    public ConfigFetchHttpClient(Context object, String string2, String string3, String string4, long l2, long l3) {
        this.context = object;
        this.appId = string2;
        this.apiKey = string3;
        object = ConfigFetchHttpClient.extractProjectNumberFromAppId(string2);
        this.projectNumber = object;
        this.namespace = string4;
        this.connectTimeoutInSeconds = l2;
        this.readTimeoutInSeconds = l3;
    }

    private boolean backendHasUpdates(JSONObject object) {
        boolean bl2 = true;
        String string2 = "state";
        try {
            object = object.get(string2);
            string2 = "NO_CHANGE";
        }
        catch (JSONException jSONException) {
            return bl2;
        }
        return object.equals(string2) ^ bl2;
    }

    private String convertToISOString(long l2) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_DATE_PATTERN, locale);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        simpleDateFormat.setTimeZone(timeZone);
        Long l3 = l2;
        return simpleDateFormat.format(l3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject createFetchRequestBody(String set, String string2, Map map2, Long l2, Map map3) {
        int n3;
        long l3;
        HashMap<String, Object> hashMap;
        block7: {
            hashMap = new HashMap<String, Object>();
            if (set == null) {
                set = new Set("Fetch failed: Firebase installation id is null.");
                throw set;
            }
            hashMap.put("appInstanceId", set);
            hashMap.put("appInstanceIdToken", string2);
            string2 = this.appId;
            hashMap.put("appId", string2);
            set = this.context.getResources().getConfiguration().locale;
            string2 = ((Locale)((Object)set)).getCountry();
            hashMap.put("countryCode", string2);
            int n4 = Build.VERSION.SDK_INT;
            set = ((Locale)((Object)set)).toLanguageTag();
            hashMap.put("languageCode", set);
            String string3 = Integer.toString(n4);
            hashMap.put("platformVersion", string3);
            set = TimeZone.getDefault().getID();
            string3 = "timeZone";
            hashMap.put(string3, set);
            try {
                set = this.context;
                set = set.getPackageManager();
                string3 = this.context;
                string3 = string3.getPackageName();
                int n7 = 0;
                String string4 = null;
                set = set.getPackageInfo(string3, 0);
                if (set == null) break block7;
                string3 = "appVersion";
                string4 = ((PackageInfo)set).versionName;
                hashMap.put(string3, string4);
                string3 = "appBuild";
                n7 = 28;
                if (n4 >= n7) {
                    l3 = ck2_1.a((PackageInfo)set);
                } else {
                    n3 = ((PackageInfo)set).versionCode;
                    l3 = n3;
                }
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                break block7;
            }
            set = Long.toString(l3);
            hashMap.put(string3, set);
        }
        set = this.context.getPackageName();
        hashMap.put("packageName", set);
        hashMap.put("sdkVersion", "22.1.0");
        set = new Set(map2);
        string2 = "analyticsUserProperties";
        hashMap.put(string2, set);
        n3 = map3.isEmpty();
        if (n3 == 0) {
            set = new Set(map3);
            string2 = "customSignals";
            hashMap.put(string2, set);
            set = map3.keySet();
            Objects.toString(set);
        }
        if (l2 == null) return new Set(hashMap);
        l3 = l2;
        set = this.convertToISOString(l3);
        string2 = "firstOpenTime";
        hashMap.put(string2, set);
        return new Set(hashMap);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ConfigContainer extractConfigs(JSONObject var0, Date var1_2) {
        var2_3 = "templateVersion";
        try {
            var3_4 = ConfigContainer.newBuilder();
            var1_2 = var3_4.withFetchTime((Date)var1_2);
            var3_4 = null;
            var4_5 = "entries";
        }
        catch (JSONException var0_1) {}
        try {
            var4_5 = var0.getJSONObject(var4_5);
        }
        catch (JSONException v0) {
            var5_6 = false;
            var4_5 = null;
        }
        if (var4_5 != null) {
            var1_2 = var1_2.replaceConfigsWith((JSONObject)var4_5);
        }
        var4_5 = "experimentDescriptions";
        try {
            var4_5 = var0.getJSONArray(var4_5);
        }
        catch (JSONException v1) {
            var5_6 = false;
            var4_5 = null;
        }
        if (var4_5 != null) {
            var1_2 = var1_2.withAbtExperiments((JSONArray)var4_5);
        }
        var4_5 = "personalizationMetadata";
        try {
            var4_5 = var0.getJSONObject(var4_5);
        }
        catch (JSONException v2) {
            var5_6 = false;
            var4_5 = null;
        }
        if (var4_5 == null) ** GOTO lbl37
        var1_2 = var1_2.withPersonalizationMetadata((JSONObject)var4_5);
lbl37:
        // 2 sources

        if ((var2_3 = (var5_6 = var0.has(var2_3)) != false ? var0.getString(var2_3) : null) != null) {
            var6_7 = Long.parseLong(var2_3);
            var1_2.withTemplateVersionNumber(var6_7);
        }
        var2_3 = "rolloutMetadata";
        try {
            var3_4 = var0.getJSONArray(var2_3);
        }
        catch (JSONException v3) {}
        if (var3_4 == null) return var1_2.build();
        var1_2 = var1_2.withRolloutMetadata((JSONArray)var3_4);
        return var1_2.build();
        var1_2 = new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", var0_1);
        throw var1_2;
    }

    private static String extractProjectNumberFromAppId(String object) {
        Pattern pattern = GMP_APP_ID_PATTERN;
        int n3 = (int)(((Matcher)(object = pattern.matcher((CharSequence)object))).matches() ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
            object = ((Matcher)object).group(n3);
        } else {
            object = null;
        }
        return object;
    }

    private JSONObject getFetchResponseBody(URLConnection object) {
        char c2;
        char c3;
        object = ((URLConnection)object).getInputStream();
        String string2 = "utf-8";
        InputStreamReader inputStreamReader = new InputStreamReader((InputStream)object, string2);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        object = new StringBuilder();
        while ((c3 = bufferedReader.read()) != (c2 = '\uffffffff')) {
            c3 = c3;
            ((StringBuilder)object).append(c3);
        }
        object = ((StringBuilder)object).toString();
        bufferedReader = new JSONObject((String)object);
        return bufferedReader;
    }

    private String getFetchUrl(String string2, String string3) {
        return uc0_0.a("https://firebaseremoteconfig.googleapis.com/v1/projects/", string2, "/namespaces/", string3, ":fetch");
    }

    private String getFingerprintHashForPackage() {
        String string2;
        Object object;
        block7: {
            try {
                object = this.context;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                this.context.getPackageName();
                return null;
            }
            string2 = object.getPackageName();
            object = AndroidUtilsLight.getPackageCertificateHashBytes(object, string2);
            if (object != null) break block7;
            object = this.context;
            object.getPackageName();
            return null;
        }
        string2 = null;
        return Hex.bytesToStringUppercase((byte[])object, false);
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String string2) {
        String string3 = this.apiKey;
        httpURLConnection.setRequestProperty(API_KEY_HEADER, string3);
        String string4 = this.context.getPackageName();
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, string4);
        string3 = this.getFingerprintHashForPackage();
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, string3);
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, "yes");
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, string2);
        string4 = "application/json";
        httpURLConnection.setRequestProperty("Content-Type", string4);
        httpURLConnection.setRequestProperty("Accept", string4);
    }

    private void setCustomRequestHeaders(HttpURLConnection httpURLConnection, Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            httpURLConnection.setRequestProperty(string2, (String)object2);
        }
    }

    private void setFetchRequestBody(HttpURLConnection object, byte[] byArray) {
        int n3 = byArray.length;
        ((HttpURLConnection)object).setFixedLengthStreamingMode(n3);
        object = ((URLConnection)object).getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((OutputStream)object);
        ((OutputStream)bufferedOutputStream).write(byArray);
        ((OutputStream)bufferedOutputStream).flush();
        ((OutputStream)bufferedOutputStream).close();
    }

    private void setUpUrlConnection(HttpURLConnection httpURLConnection, String string2, String string3, Map map2) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long l2 = this.connectTimeoutInSeconds;
        int n3 = (int)timeUnit.toMillis(l2);
        httpURLConnection.setConnectTimeout(n3);
        l2 = this.readTimeoutInSeconds;
        int n4 = (int)timeUnit.toMillis(l2);
        httpURLConnection.setReadTimeout(n4);
        httpURLConnection.setRequestProperty(IF_NONE_MATCH_HEADER, string2);
        this.setCommonRequestHeaders(httpURLConnection, string3);
        this.setCustomRequestHeaders(httpURLConnection, map2);
    }

    public HttpURLConnection createHttpURLConnection() {
        Object object;
        try {
            object = this.projectNumber;
        }
        catch (IOException iOException) {
            String string2 = iOException.getMessage();
            object = new FirebaseRemoteConfigException(string2);
            throw object;
        }
        String string3 = this.namespace;
        object = this.getFetchUrl((String)object, string3);
        Object object2 = new URL((String)object);
        object2 = ((URL)object2).openConnection();
        return (HttpURLConnection)object2;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ConfigFetchHandler$FetchResponse fetch(HttpURLConnection object, String object2, String object3, Map object4, String string2, Map map2, Long l2, Date date, Map map3) {
        Throwable throwable222;
        block11: {
            void var2_6;
            block12: {
                int n3;
                block10: {
                    this.setUpUrlConnection((HttpURLConnection)object, string2, (String)object3, map2);
                    object2 = this.createFetchRequestBody((String)object2, (String)object3, (Map)object4, l2, map3);
                    object2 = object2.toString();
                    object3 = "utf-8";
                    object2 = ((String)object2).getBytes((String)object3);
                    this.setFetchRequestBody((HttpURLConnection)object, (byte[])object2);
                    ((URLConnection)object).connect();
                    n3 = ((HttpURLConnection)object).getResponseCode();
                    int n4 = 200;
                    if (n3 != n4) break block10;
                    object2 = ETAG_HEADER;
                    object2 = ((URLConnection)object).getHeaderField((String)object2);
                    object3 = this.getFetchResponseBody((URLConnection)object);
                    ((HttpURLConnection)object).disconnect();
                    try {
                        object = ((URLConnection)object).getInputStream();
                        ((InputStream)object).close();
                    }
                    catch (IOException iOException) {}
                    object = ConfigFetchHttpClient.extractConfigs((JSONObject)object3, date);
                    n4 = (int)(this.backendHasUpdates((JSONObject)object3) ? 1 : 0);
                    if (n4 != 0) return ConfigFetchHandler$FetchResponse.forBackendUpdatesFetched((ConfigContainer)object, (String)object2);
                    return ConfigFetchHandler$FetchResponse.forBackendHasNoUpdates(date, (ConfigContainer)object);
                }
                try {
                    object4 = ((HttpURLConnection)object).getResponseMessage();
                    object3 = new FirebaseRemoteConfigServerException(n3, (String)object4);
                    throw object3;
                }
                catch (Throwable throwable222) {
                    break block11;
                }
                catch (JSONException jSONException) {
                    break block12;
                }
                catch (IOException iOException) {}
            }
            object4 = "The client had an error while calling the backend!";
            object3 = new FirebaseRemoteConfigClientException((String)object4, (Throwable)var2_6);
            throw object3;
        }
        ((HttpURLConnection)object).disconnect();
        try {
            object = ((URLConnection)object).getInputStream();
            ((InputStream)object).close();
        }
        catch (IOException iOException) {
            throw throwable222;
        }
        throw throwable222;
    }

    public long getConnectTimeoutInSeconds() {
        return this.connectTimeoutInSeconds;
    }

    public long getReadTimeoutInSeconds() {
        return this.readTimeoutInSeconds;
    }
}

