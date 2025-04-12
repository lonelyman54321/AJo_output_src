/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.google.firebase.crashlytics.internal.settings.SettingsRequest;
import com.google.firebase.crashlytics.internal.settings.SettingsSpiCall;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class DefaultSettingsSpiCall
implements SettingsSpiCall {
    static final String ACCEPT_JSON_VALUE = "application/json";
    static final String ANDROID_CLIENT_TYPE = "android";
    static final String BUILD_VERSION_PARAM = "build_version";
    static final String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
    static final String DISPLAY_VERSION_PARAM = "display_version";
    static final String HEADER_ACCEPT = "Accept";
    static final String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
    static final String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
    static final String HEADER_DEVICE_MODEL = "X-CRASHLYTICS-DEVICE-MODEL";
    static final String HEADER_GOOGLE_APP_ID = "X-CRASHLYTICS-GOOGLE-APP-ID";
    static final String HEADER_INSTALLATION_ID = "X-CRASHLYTICS-INSTALLATION-ID";
    static final String HEADER_OS_BUILD_VERSION = "X-CRASHLYTICS-OS-BUILD-VERSION";
    static final String HEADER_OS_DISPLAY_VERSION = "X-CRASHLYTICS-OS-DISPLAY-VERSION";
    static final String HEADER_USER_AGENT = "User-Agent";
    static final String INSTANCE_PARAM = "instance";
    static final String SOURCE_PARAM = "source";
    private final Logger logger;
    private final HttpRequestFactory requestFactory;
    private final String url;

    public DefaultSettingsSpiCall(String string2, HttpRequestFactory httpRequestFactory) {
        Logger logger = Logger.getLogger();
        this(string2, httpRequestFactory, logger);
    }

    public DefaultSettingsSpiCall(String object, HttpRequestFactory httpRequestFactory, Logger logger) {
        if (object != null) {
            this.logger = logger;
            this.requestFactory = httpRequestFactory;
            this.url = object;
            return;
        }
        object = new IllegalArgumentException("url must not be null.");
        throw object;
    }

    private HttpGetRequest applyHeadersTo(HttpGetRequest httpGetRequest, SettingsRequest object) {
        String string2 = ((SettingsRequest)object).googleAppId;
        this.applyNonNullHeader(httpGetRequest, HEADER_GOOGLE_APP_ID, string2);
        this.applyNonNullHeader(httpGetRequest, HEADER_CLIENT_TYPE, ANDROID_CLIENT_TYPE);
        String string3 = CrashlyticsCore.getVersion();
        this.applyNonNullHeader(httpGetRequest, HEADER_CLIENT_VERSION, string3);
        this.applyNonNullHeader(httpGetRequest, HEADER_ACCEPT, ACCEPT_JSON_VALUE);
        string3 = ((SettingsRequest)object).deviceModel;
        this.applyNonNullHeader(httpGetRequest, HEADER_DEVICE_MODEL, string3);
        string3 = ((SettingsRequest)object).osBuildVersion;
        this.applyNonNullHeader(httpGetRequest, HEADER_OS_BUILD_VERSION, string3);
        string3 = ((SettingsRequest)object).osDisplayVersion;
        this.applyNonNullHeader(httpGetRequest, HEADER_OS_DISPLAY_VERSION, string3);
        object = ((SettingsRequest)object).installIdProvider.getInstallIds().getCrashlyticsInstallId();
        this.applyNonNullHeader(httpGetRequest, HEADER_INSTALLATION_ID, (String)object);
        return httpGetRequest;
    }

    private void applyNonNullHeader(HttpGetRequest httpGetRequest, String string2, String string3) {
        if (string3 != null) {
            httpGetRequest.header(string2, string3);
        }
    }

    private JSONObject getJsonObjectFrom(String string2) {
        try {
            JSONObject jSONObject = new JSONObject(string2);
            return jSONObject;
        }
        catch (Exception exception) {
            Object object = this.logger;
            CharSequence charSequence = new StringBuilder("Failed to parse settings JSON from ");
            String string3 = this.url;
            charSequence.append(string3);
            charSequence = charSequence.toString();
            ((Logger)object).w((String)charSequence, exception);
            Logger logger = this.logger;
            object = new StringBuilder("Settings response ");
            ((StringBuilder)object).append(string2);
            string2 = ((StringBuilder)object).toString();
            logger.w(string2);
            return null;
        }
    }

    private Map getQueryParamsFor(SettingsRequest object) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        String string2 = ((SettingsRequest)object).buildVersion;
        hashMap.put(BUILD_VERSION_PARAM, string2);
        String string3 = ((SettingsRequest)object).displayVersion;
        hashMap.put(DISPLAY_VERSION_PARAM, string3);
        string2 = Integer.toString(((SettingsRequest)object).source);
        string3 = SOURCE_PARAM;
        hashMap.put(string3, string2);
        object = ((SettingsRequest)object).instanceId;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            string2 = INSTANCE_PARAM;
            hashMap.put(string2, object);
        }
        return hashMap;
    }

    public HttpGetRequest createHttpGetRequest(Map object) {
        Object object2 = this.requestFactory;
        String string2 = this.url;
        object = ((HttpRequestFactory)object2).buildHttpGetRequest(string2, (Map)object);
        object2 = new StringBuilder(CRASHLYTICS_USER_AGENT);
        string2 = CrashlyticsCore.getVersion();
        ((StringBuilder)object2).append(string2);
        object2 = ((StringBuilder)object2).toString();
        return ((HttpGetRequest)object).header(HEADER_USER_AGENT, (String)object2).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public JSONObject handleResponse(HttpResponse object) {
        int n3 = ((HttpResponse)object).code();
        Object object2 = this.logger;
        String string2 = "Settings response code was: ";
        CharSequence charSequence = new StringBuilder(string2);
        charSequence.append(n3);
        charSequence = charSequence.toString();
        ((Logger)object2).v((String)charSequence);
        boolean bl2 = this.requestWasSuccessful(n3);
        if (bl2) {
            object = ((HttpResponse)object).body();
            object = this.getJsonObjectFrom((String)object);
        } else {
            object = this.logger;
            charSequence = ") from ";
            CharSequence charSequence2 = wk0_0.a(n3, "Settings request failed; (status: ", (String)charSequence);
            object2 = this.url;
            charSequence2.append((String)object2);
            charSequence2 = charSequence2.toString();
            ((Logger)object).e((String)charSequence2);
            object = null;
        }
        return object;
    }

    public JSONObject invoke(SettingsRequest object, boolean bl2) {
        String string2 = "Settings query params were: ";
        Object object2 = "Requesting settings from ";
        CrashlyticsWorkers.checkBlockingThread();
        if (bl2) {
            Object object3 = this.getQueryParamsFor((SettingsRequest)object);
            Object object4 = this.createHttpGetRequest((Map)object3);
            object = this.applyHeadersTo((HttpGetRequest)object4, (SettingsRequest)object);
            object4 = this.logger;
            StringBuilder stringBuilder = new StringBuilder((String)object2);
            object2 = this.url;
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            ((Logger)object4).d((String)object2);
            object2 = this.logger;
            object4 = new StringBuilder(string2);
            ((StringBuilder)object4).append(object3);
            object3 = ((StringBuilder)object4).toString();
            ((Logger)object2).v((String)object3);
            object = ((HttpGetRequest)object).execute();
            try {
                object = this.handleResponse((HttpResponse)object);
            }
            catch (IOException iOException) {
                object3 = this.logger;
                string2 = "Settings request failed.";
                ((Logger)object3).e(string2, iOException);
                object = null;
            }
            return object;
        }
        object = new RuntimeException("An invalid data collection token was used.");
        throw object;
    }

    public boolean requestWasSuccessful(int n3) {
        int n4 = 200;
        n3 = n3 != n4 && n3 != (n4 = 201) && n3 != (n4 = 202) && n3 != (n4 = 203) ? 0 : 1;
        return n3 != 0;
    }
}

