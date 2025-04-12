/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Base64
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.messaging.Metadata;
import com.google.firebase.messaging.h;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

class GmsRpc {
    static final String CMD_RST = "RST";
    static final String CMD_RST_FULL = "RST_FULL";
    static final String CMD_SYNC = "SYNC";
    static final String ERROR_INSTANCE_ID_RESET = "INSTANCE_ID_RESET";
    static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    static final String ERROR_INTERNAL_SERVER_ERROR_ALT = "InternalServerError";
    static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final String EXTRA_DELETE = "delete";
    private static final String EXTRA_ERROR = "error";
    private static final String EXTRA_IID_OPERATION = "iid-operation";
    private static final String EXTRA_REGISTRATION_ID = "registration_id";
    private static final String EXTRA_SCOPE = "scope";
    private static final String EXTRA_SENDER = "sender";
    private static final String EXTRA_SUBTYPE = "subtype";
    private static final String EXTRA_TOPIC = "gcm.topic";
    private static final String EXTRA_UNREGISTERED = "unregistered";
    static final String FIREBASE_IID_HEARTBEAT_TAG = "fire-iid";
    private static final String PARAM_APP_VER_CODE = "app_ver";
    private static final String PARAM_APP_VER_NAME = "app_ver_name";
    private static final String PARAM_CLIENT_VER = "cliv";
    private static final String PARAM_FIREBASE_APP_NAME_HASH = "firebase-app-name-hash";
    private static final String PARAM_FIS_AUTH_TOKEN = "Goog-Firebase-Installations-Auth";
    private static final String PARAM_GMP_APP_ID = "gmp_app_id";
    private static final String PARAM_GMS_VER = "gmsv";
    private static final String PARAM_HEARTBEAT_CODE = "Firebase-Client-Log-Type";
    private static final String PARAM_INSTANCE_ID = "appid";
    private static final String PARAM_OS_VER = "osv";
    private static final String PARAM_USER_AGENT = "Firebase-Client";
    private static final String SCOPE_ALL = "*";
    static final String TAG = "FirebaseMessaging";
    static final String TOO_MANY_SUBSCRIBERS = "TOO_MANY_SUBSCRIBERS";
    private static final String TOPIC_PREFIX = "/topics/";
    private final FirebaseApp app;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Provider heartbeatInfo;
    private final Metadata metadata;
    private final Rpc rpc;
    private final Provider userAgentPublisher;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Rpc rpc, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.app = firebaseApp;
        this.metadata = metadata;
        this.rpc = rpc;
        this.userAgentPublisher = provider;
        this.heartbeatInfo = provider2;
        this.firebaseInstallations = firebaseInstallationsApi;
    }

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        Object object = firebaseApp.getApplicationContext();
        Rpc rpc = new Rpc((Context)object);
        object = this;
        this(firebaseApp, metadata, rpc, provider, provider2, firebaseInstallationsApi);
    }

    public static /* synthetic */ String a(GmsRpc gmsRpc, Task task2) {
        return gmsRpc.lambda$extractResponseWhenComplete$0(task2);
    }

    private static String base64UrlSafe(byte[] byArray) {
        return Base64.encodeToString((byte[])byArray, (int)11);
    }

    private Task extractResponseWhenComplete(Task task2) {
        jl1_0 jl1_02 = new Object();
        h h3 = new h(this);
        return task2.continueWith(jl1_02, h3);
    }

    private String getHashedFirebaseAppName() {
        Object object = this.app.getName();
        Object object2 = "SHA-1";
        try {
            object2 = MessageDigest.getInstance((String)object2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return "[HASH-ERROR]";
        }
        object = ((String)object).getBytes();
        object = ((MessageDigest)object2).digest((byte[])object);
        return GmsRpc.base64UrlSafe((byte[])object);
    }

    private String handleResponse(Bundle object) {
        String string2 = ERROR_SERVICE_NOT_AVAILABLE;
        if (object != null) {
            String string3 = object.getString(EXTRA_REGISTRATION_ID);
            if (string3 != null) {
                return string3;
            }
            string3 = object.getString(EXTRA_UNREGISTERED);
            if (string3 != null) {
                return string3;
            }
            String string4 = CMD_RST;
            string3 = object.getString(EXTRA_ERROR);
            boolean bl2 = string4.equals(string3);
            if (!bl2) {
                if (string3 != null) {
                    object = new IOException(string3);
                    throw object;
                }
                object.toString();
                new Throwable();
                object = new IOException(string2);
                throw object;
            }
            object = new IOException(ERROR_INSTANCE_ID_RESET);
            throw object;
        }
        object = new IOException(string2);
        throw object;
    }

    public static boolean isErrorMessageForRetryableError(String string2) {
        boolean bl2;
        String string3 = ERROR_SERVICE_NOT_AVAILABLE;
        boolean bl3 = string3.equals(string2);
        if (!(bl3 || (bl3 = (string3 = ERROR_INTERNAL_SERVER_ERROR).equals(string2)) || (bl2 = (string3 = ERROR_INTERNAL_SERVER_ERROR_ALT).equals(string2)))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private /* synthetic */ String lambda$extractResponseWhenComplete$0(Task task2) {
        task2 = (Bundle)task2.getResult(IOException.class);
        return this.handleResponse((Bundle)task2);
    }

    private void setDefaultAttributesToBundle(String object, String object2, Bundle bundle) {
        int n3;
        Object object3;
        block9: {
            object3 = EXTRA_SCOPE;
            bundle.putString(object3, (String)object2);
            bundle.putString(EXTRA_SENDER, (String)object);
            bundle.putString(EXTRA_SUBTYPE, (String)object);
            object = this.app.getOptions().getApplicationId();
            bundle.putString(PARAM_GMP_APP_ID, (String)object);
            object = Integer.toString(this.metadata.getGmsVersionCode());
            bundle.putString(PARAM_GMS_VER, (String)object);
            n3 = Build.VERSION.SDK_INT;
            object = Integer.toString(n3);
            bundle.putString(PARAM_OS_VER, (String)object);
            object = this.metadata.getAppVersionCode();
            bundle.putString(PARAM_APP_VER_CODE, (String)object);
            object = this.metadata.getAppVersionName();
            bundle.putString(PARAM_APP_VER_NAME, (String)object);
            object = PARAM_FIREBASE_APP_NAME_HASH;
            object2 = this.getHashedFirebaseAppName();
            bundle.putString((String)object, (String)object2);
            object = this.firebaseInstallations;
            boolean bl2 = false;
            object2 = null;
            object = object.getToken(false);
            object = Tasks.await((Task)object);
            object = (InstallationTokenResult)object;
            object = ((InstallationTokenResult)object).getToken();
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) break block9;
            object2 = PARAM_FIS_AUTH_TOKEN;
            try {
                bundle.putString((String)object2, (String)object);
            }
            catch (InterruptedException | ExecutionException exception) {}
        }
        object = (String)Tasks.await(this.firebaseInstallations.getId());
        bundle.putString(PARAM_INSTANCE_ID, (String)object);
        bundle.putString(PARAM_CLIENT_VER, "fcm-24.1.0");
        object = (HeartBeatInfo)this.heartbeatInfo.get();
        object2 = (UserAgentPublisher)this.userAgentPublisher.get();
        if (object != null && object2 != null && (object = object.getHeartBeatCode(FIREBASE_IID_HEARTBEAT_TAG)) != (object3 = HeartBeatInfo$HeartBeat.NONE)) {
            n3 = ((HeartBeatInfo$HeartBeat)((Object)object)).getCode();
            object = Integer.toString(n3);
            object3 = PARAM_HEARTBEAT_CODE;
            bundle.putString(object3, (String)object);
            object = PARAM_USER_AGENT;
            object2 = object2.getUserAgent();
            bundle.putString((String)object, (String)object2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private Task startRpc(String string2, String string3, Bundle bundle) {
        void var1_4;
        try {
            this.setDefaultAttributesToBundle(string2, string3, bundle);
            return this.rpc.send(bundle);
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        return Tasks.forException((Exception)var1_4);
    }

    public Task deleteToken() {
        Object object = E1.a(EXTRA_DELETE, "1");
        String string2 = Metadata.getDefaultSenderId(this.app);
        object = this.startRpc(string2, SCOPE_ALL, (Bundle)object);
        return this.extractResponseWhenComplete((Task)object);
    }

    public Task getProxyNotificationData() {
        return this.rpc.getProxiedNotificationData();
    }

    public Task getToken() {
        Object object = Metadata.getDefaultSenderId(this.app);
        Bundle bundle = new Bundle();
        object = this.startRpc((String)object, SCOPE_ALL, bundle);
        return this.extractResponseWhenComplete((Task)object);
    }

    public Task setRetainProxiedNotifications(boolean bl2) {
        return this.rpc.setRetainProxiedNotifications(bl2);
    }

    public Task subscribeToTopic(String object, String string2) {
        Bundle bundle = new Bundle();
        String string3 = TOPIC_PREFIX;
        CharSequence charSequence = new StringBuilder(string3);
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        bundle.putString(EXTRA_TOPIC, (String)charSequence);
        charSequence = new StringBuilder(string3);
        ((StringBuilder)charSequence).append(string2);
        string2 = ((StringBuilder)charSequence).toString();
        object = this.startRpc((String)object, string2, bundle);
        return this.extractResponseWhenComplete((Task)object);
    }

    public Task unsubscribeFromTopic(String object, String string2) {
        Bundle bundle = new Bundle();
        String string3 = TOPIC_PREFIX;
        k01_0.a(string3, string2, bundle, EXTRA_TOPIC);
        bundle.putString(EXTRA_DELETE, "1");
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        object = this.startRpc((String)object, string2, bundle);
        return this.extractResponseWhenComplete((Task)object);
    }
}

