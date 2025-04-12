/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigAutoFetch;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$1;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$2;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient$RealtimeBackoffMetadata;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class ConfigRealtimeHttpClient {
    private static final String API_KEY_HEADER = "X-Goog-Api-Key";
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES;
    private static final Pattern GMP_APP_ID_PATTERN;
    private static final String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static final String X_ACCEPT_RESPONSE_STREAMING = "X-Accept-Response-Streaming";
    private static final String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    private final int ORIGINAL_RETRIES;
    ConfigCacheClient activatedCache;
    private final Clock clock;
    private final ConfigFetchHandler configFetchHandler;
    private final Context context;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private int httpRetriesRemaining;
    private boolean isHttpConnectionRunning;
    private boolean isInBackground;
    private boolean isRealtimeDisabled;
    private final Set listeners;
    private final String namespace;
    private final Random random;
    private final ScheduledExecutorService scheduledExecutorService;
    private final ConfigSharedPrefsClient sharedPrefsClient;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[8];
        int[] nArray3 = nArray;
        nArray2[0] = 2;
        nArray3[1] = 4;
        nArray2[2] = 8;
        nArray3[3] = 16;
        nArray2[4] = 32;
        nArray3[5] = 64;
        nArray2[6] = 128;
        nArray3[7] = 256;
        BACKOFF_TIME_DURATIONS_IN_MINUTES = nArray;
        GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    }

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String string2, Set set, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService object) {
        int n3;
        this.ORIGINAL_RETRIES = n3 = 8;
        this.listeners = set;
        this.isHttpConnectionRunning = false;
        this.scheduledExecutorService = object;
        this.random = object = new Random();
        int n4 = configSharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams();
        this.httpRetriesRemaining = n4 = Math.max(n3 - n4, 1);
        this.clock = object = DefaultClock.getInstance();
        this.firebaseApp = firebaseApp;
        this.configFetchHandler = configFetchHandler;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCache = configCacheClient;
        this.context = context;
        this.namespace = string2;
        this.sharedPrefsClient = configSharedPrefsClient;
        this.isRealtimeDisabled = false;
        this.isInBackground = false;
    }

    public static /* synthetic */ Task a(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task2, Task task3) {
        return configRealtimeHttpClient.lambda$beginRealtimeHttpStream$1(task2, task3);
    }

    public static /* synthetic */ void access$000(ConfigRealtimeHttpClient configRealtimeHttpClient) {
        configRealtimeHttpClient.enableBackoff();
    }

    public static /* synthetic */ void access$100(ConfigRealtimeHttpClient configRealtimeHttpClient, FirebaseRemoteConfigException firebaseRemoteConfigException) {
        configRealtimeHttpClient.propagateErrors(firebaseRemoteConfigException);
    }

    public static /* synthetic */ Task b(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task2, Task task3, Task task4) {
        return configRealtimeHttpClient.lambda$createRealtimeConnection$0(task2, task3, task4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean canMakeHttpStreamConnection() {
        synchronized (this) {
            try {
                Set set = this.listeners;
                boolean bl2 = set.isEmpty();
                if (bl2) return false;
                bl2 = this.isHttpConnectionRunning;
                if (bl2) return false;
                bl2 = this.isRealtimeDisabled;
                if (bl2) return false;
                bl2 = this.isInBackground;
                if (bl2) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private JSONObject createRequestBody(String string2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string3 = ConfigRealtimeHttpClient.extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId());
        hashMap.put("project", string3);
        String string4 = this.namespace;
        hashMap.put("namespace", string4);
        string3 = Long.toString(this.configFetchHandler.getTemplateVersionNumber());
        hashMap.put("lastKnownVersionNumber", string3);
        string3 = this.firebaseApp.getOptions().getApplicationId();
        hashMap.put("appId", string3);
        hashMap.put("sdkVersion", "22.1.0");
        hashMap.put("appInstanceId", string2);
        string2 = new JSONObject(hashMap);
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void enableBackoff() {
        synchronized (this) {
            boolean bl2;
            this.isRealtimeDisabled = bl2 = true;
            return;
        }
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

    private long getRandomizedBackoffDurationInMillis(int n3) {
        int[] nArray = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        int n4 = nArray.length;
        if (n3 >= n4) {
            n3 = n4;
        }
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long l2 = nArray[n3 += -1];
        long l3 = timeUnit.toMillis(l2);
        l2 = l3 / (long)2;
        Random random = this.random;
        n4 = (int)l3;
        l3 = random.nextInt(n4);
        return l2 + l3;
    }

    private String getRealtimeURL(String string2) {
        String string3 = ConfigRealtimeHttpClient.extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId());
        return uc0_0.a("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", string3, "/namespaces/", string2, ":streamFetchInvalidations");
    }

    private URL getUrl() {
        URL uRL;
        String string2 = this.namespace;
        string2 = this.getRealtimeURL(string2);
        try {
            uRL = new URL(string2);
        }
        catch (MalformedURLException malformedURLException) {
            uRL = null;
        }
        return uRL;
    }

    private boolean isStatusCodeRetryable(int n3) {
        int n4 = 408;
        n3 = n3 != n4 && n3 != (n4 = 429) && n3 != (n4 = 502) && n3 != (n4 = 503) && n3 != (n4 = 504) ? 0 : 1;
        return n3 != 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Task lambda$beginRealtimeHttpStream$1(Task var1_1, Task var2_3) {
        block34: {
            block33: {
                block31: {
                    block30: {
                        block32: {
                            var2_3 = null;
                            var3_4 = 1;
                            var4_5 /* !! */  = "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d";
                            var5_6 = 403;
                            var6_7 = 200;
                            var7_8 = null;
                            try {
                                var8_10 = var1_1.isSuccessful();
                                if (var8_10 != 0) {
                                    this.setIsHttpConnectionRunning((boolean)var3_4);
                                    var1_1 = var1_1.getResult();
                                    var1_1 = (HttpURLConnection)var1_1;
                                }
                                ** GOTO lbl-1000
                            }
                            catch (Throwable var1_2) {
                                var9_11 = null;
                                var7_8 = var1_2;
                                var1_1 = null;
                                break block30;
                            }
                            catch (IOException v0) {
                                var1_1 = null;
                                var9_11 = null;
                                break block31;
                            }
                            try {
                                var8_10 = var1_1.getResponseCode();
                                var9_11 = var8_10;
                                if (var8_10 != var6_7) break block32;
                            }
                            catch (Throwable var17_24) {
                                var9_11 = null;
                                var7_8 = var17_24;
                                break block30;
                            }
                            catch (IOException v1) {
                                var9_11 = null;
                                break block31;
                            }
                            try {
                                this.resetRetryCount();
                                var10_12 = this.sharedPrefsClient;
                                var10_12.resetRealtimeBackoff();
                                var10_12 = this.startAutoFetch((HttpURLConnection)var1_1);
                                var10_12.listenForNotifications();
                            }
                            catch (Throwable var7_9) {
                                break block30;
                            }
                            catch (IOException v2) {
                                break block31;
                            }
                        }
                        this.closeRealtimeHttpStream((HttpURLConnection)var1_1);
                        this.setIsHttpConnectionRunning(false);
                        var11_15 = this.isStatusCodeRetryable(var8_10);
                        if (var11_15) {
                            var13_19 = this.clock;
                            var14_20 = var13_19.currentTimeMillis();
                            var12_16 = new Date(var14_20);
                            this.updateBackoffMetadataWithLastFailedStreamConnectionTime(var12_16);
                        }
                        if (!var11_15 && var8_10 != var6_7) {
                            var16_21 /* !! */  = new Object[var3_4];
                            var16_21 /* !! */ [0] = var9_11;
                            var2_3 = String.format(var4_5 /* !! */ , var16_21 /* !! */ );
                            if (var8_10 == var5_6) {
                                var1_1 = var1_1.getErrorStream();
                                var2_3 = this.parseForbiddenErrorResponseMessage((InputStream)var1_1);
                            }
                            var16_21 /* !! */  = FirebaseRemoteConfigException$Code.CONFIG_UPDATE_STREAM_ERROR;
                            var1_1 = new FirebaseRemoteConfigServerException(var8_10, (String)var2_3, (FirebaseRemoteConfigException$Code)var16_21 /* !! */ );
lbl65:
                            // 2 sources

                            while (true) {
                                this.propagateErrors((FirebaseRemoteConfigException)var1_1);
                                return Tasks.forResult(null);
                            }
                        }
                        break block33;
lbl-1000:
                        // 1 sources

                        {
                            var1_1 = var1_1.getException();
                            var17_25 = new IOException((Throwable)var1_1);
                            throw var17_25;
                        }
                    }
                    this.closeRealtimeHttpStream((HttpURLConnection)var1_1);
                    this.setIsHttpConnectionRunning(false);
                    if (var9_11 == null) ** GOTO lbl-1000
                    var8_10 = var9_11;
                    if ((var8_10 = (int)this.isStatusCodeRetryable(var8_10)) == 0) {
                        var8_10 = 0;
                        var17_26 = null;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var8_10 = 1;
                    }
                    if (var8_10 != 0) {
                        var12_17 = this.clock;
                        var18_28 = var12_17.currentTimeMillis();
                        var10_13 = new Date(var18_28);
                        this.updateBackoffMetadataWithLastFailedStreamConnectionTime(var10_13);
                    }
                    if (var8_10 == 0 && (var8_10 = var9_11.intValue()) != var6_7) {
                        var16_22 = new Object[var3_4];
                        var16_22[0] = var9_11;
                        var2_3 = String.format(var4_5 /* !! */ , var16_22);
                        var3_4 = var9_11;
                        if (var3_4 == var5_6) {
                            var1_1 = var1_1.getErrorStream();
                            var2_3 = this.parseForbiddenErrorResponseMessage((InputStream)var1_1);
                        }
                        var3_4 = var9_11;
                        var4_5 /* !! */  = FirebaseRemoteConfigException$Code.CONFIG_UPDATE_STREAM_ERROR;
                        var1_1 = new FirebaseRemoteConfigServerException(var3_4, (String)var2_3, (FirebaseRemoteConfigException$Code)var4_5 /* !! */ );
                        this.propagateErrors((FirebaseRemoteConfigException)var1_1);
                        throw var7_8;
                    }
                    this.retryHttpConnectionWhenBackoffEnds();
                    throw var7_8;
                }
                this.closeRealtimeHttpStream((HttpURLConnection)var1_1);
                this.setIsHttpConnectionRunning(false);
                if (var9_11 == null) ** GOTO lbl-1000
                var8_10 = var9_11;
                if ((var8_10 = (int)this.isStatusCodeRetryable(var8_10)) == 0) {
                    var8_10 = 0;
                    var17_27 = null;
                } else lbl-1000:
                // 2 sources

                {
                    var8_10 = 1;
                }
                if (var8_10 != 0) {
                    var12_18 = this.clock;
                    var18_29 = var12_18.currentTimeMillis();
                    var10_14 = new Date(var18_29);
                    this.updateBackoffMetadataWithLastFailedStreamConnectionTime(var10_14);
                }
                if (var8_10 == 0 && (var8_10 = var9_11.intValue()) != var6_7) break block34;
            }
            this.retryHttpConnectionWhenBackoffEnds();
            return Tasks.forResult(null);
        }
        var16_23 = new Object[var3_4];
        var16_23[0] = var9_11;
        var2_3 = String.format(var4_5 /* !! */ , var16_23);
        var3_4 = var9_11;
        if (var3_4 == var5_6) {
            var1_1 = var1_1.getErrorStream();
            var2_3 = this.parseForbiddenErrorResponseMessage((InputStream)var1_1);
        }
        var3_4 = var9_11;
        var4_5 /* !! */  = FirebaseRemoteConfigException$Code.CONFIG_UPDATE_STREAM_ERROR;
        var1_1 = new FirebaseRemoteConfigServerException(var3_4, (String)var2_3, (FirebaseRemoteConfigException$Code)var4_5 /* !! */ );
        ** while (true)
    }

    private /* synthetic */ Task lambda$createRealtimeConnection$0(Task object, Task object2, Task object3) {
        boolean bl2 = ((Task)object).isSuccessful();
        if (!bl2) {
            object = ((Task)object).getException();
            object2 = new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", (Throwable)object);
            return Tasks.forException((Exception)object2);
        }
        bl2 = ((Task)object2).isSuccessful();
        if (!bl2) {
            object2 = ((Task)object2).getException();
            object = new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", (Throwable)object2);
            return Tasks.forException((Exception)object);
        }
        try {
            object3 = this.getUrl();
        }
        catch (IOException iOException) {
            object2 = new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", iOException);
            return Tasks.forException((Exception)object2);
        }
        object3 = ((URL)object3).openConnection();
        object3 = (HttpURLConnection)object3;
        object = ((Task)object).getResult();
        object = (InstallationTokenResult)object;
        object = ((InstallationTokenResult)object).getToken();
        object2 = ((Task)object2).getResult();
        object2 = (String)object2;
        this.setRequestParams((HttpURLConnection)object3, (String)object2, (String)object);
        return Tasks.forResult(object3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void makeRealtimeHttpConnection(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                int n3;
                block7: {
                    try {
                        n3 = this.canMakeHttpStreamConnection();
                        if (n3 != 0) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    return;
                }
                n3 = this.httpRetriesRemaining;
                if (n3 > 0) {
                    this.httpRetriesRemaining = n3 += -1;
                    ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
                    ConfigRealtimeHttpClient$1 configRealtimeHttpClient$1 = new ConfigRealtimeHttpClient$1(this);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    scheduledExecutorService.schedule(configRealtimeHttpClient$1, l2, timeUnit);
                } else {
                    boolean bl2 = this.isInBackground;
                    if (!bl2) {
                        String string2 = "Unable to connect to the server. Check your connection and try again.";
                        FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code = FirebaseRemoteConfigException$Code.CONFIG_UPDATE_STREAM_ERROR;
                        FirebaseRemoteConfigClientException firebaseRemoteConfigClientException = new FirebaseRemoteConfigClientException(string2, firebaseRemoteConfigException$Code);
                        this.propagateErrors(firebaseRemoteConfigClientException);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String parseForbiddenErrorResponseMessage(InputStream object) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)object);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while ((object = bufferedReader.readLine()) != null) {
                stringBuilder.append((String)object);
            }
            return stringBuilder.toString();
        }
        catch (IOException iOException) {
            int n3 = stringBuilder.length();
            if (n3 != 0) return stringBuilder.toString();
            return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    Object object = this.listeners;
                    object = object.iterator();
                    while (bl2 = object.hasNext()) {
                        Object object2 = object.next();
                        object2 = (ConfigUpdateListener)object2;
                        object2.onError(firebaseRemoteConfigException);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void resetRetryCount() {
        synchronized (this) {
            int n3;
            this.httpRetriesRemaining = n3 = 8;
            return;
        }
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String string2) {
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, string2);
        string2 = this.firebaseApp.getOptions().getApiKey();
        httpURLConnection.setRequestProperty(API_KEY_HEADER, string2);
        string2 = this.context.getPackageName();
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, string2);
        String string3 = this.getFingerprintHashForPackage();
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, string3);
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, "yes");
        httpURLConnection.setRequestProperty(X_ACCEPT_RESPONSE_STREAMING, "true");
        string3 = "application/json";
        httpURLConnection.setRequestProperty("Content-Type", string3);
        httpURLConnection.setRequestProperty("Accept", string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void setIsHttpConnectionRunning(boolean bl2) {
        synchronized (this) {
            this.isHttpConnectionRunning = bl2;
            return;
        }
    }

    private void updateBackoffMetadataWithLastFailedStreamConnectionTime(Date date) {
        int n3 = this.sharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams() + 1;
        long l2 = this.getRandomizedBackoffDurationInMillis(n3);
        long l3 = date.getTime() + l2;
        Date date2 = new Date(l3);
        this.sharedPrefsClient.setRealtimeBackoffMetadata(n3, date2);
    }

    public void beginRealtimeHttpStream() {
        boolean bl2 = this.canMakeHttpStreamConnection();
        if (!bl2) {
            return;
        }
        Object object = this.sharedPrefsClient.getRealtimeBackoffMetadata();
        Object object2 = this.clock;
        long l2 = object2.currentTimeMillis();
        Object object3 = new Date(l2);
        bl2 = ((Date)object3).before((Date)(object = ((ConfigSharedPrefsClient$RealtimeBackoffMetadata)object).getBackoffEndTime()));
        if (bl2) {
            this.retryHttpConnectionWhenBackoffEnds();
            return;
        }
        object = this.createRealtimeConnection();
        object3 = new Task[]{object};
        object3 = Tasks.whenAllComplete((Task[])object3);
        object2 = this.scheduledExecutorService;
        D40 d40 = new D40(this, (Task)object);
        ((Task)object3).continueWith((Executor)object2, d40);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void closeRealtimeHttpStream(HttpURLConnection object) {
        if (object == null) return;
        ((HttpURLConnection)object).disconnect();
        try {
            InputStream inputStream = ((URLConnection)object).getInputStream();
            inputStream.close();
            inputStream = ((HttpURLConnection)object).getErrorStream();
            if (inputStream == null) return;
            object = ((HttpURLConnection)object).getErrorStream();
            ((InputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public Task createRealtimeConnection() {
        Task task2 = this.firebaseInstallations.getToken(false);
        Task task3 = this.firebaseInstallations.getId();
        Object object = new Task[]{task2, task3};
        Task task4 = Tasks.whenAllComplete(object);
        object = this.scheduledExecutorService;
        C40 c40 = new C40(this, task2, task3);
        return task4.continueWithTask((Executor)object, c40);
    }

    public Date getBackoffEndTime() {
        return this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime();
    }

    public int getNumberOfFailedStreams() {
        return this.sharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void retryHttpConnectionWhenBackoffEnds() {
        synchronized (this) {
            Object object = this.clock;
            long l2 = object.currentTimeMillis();
            Date date = new Date(l2);
            object = this.sharedPrefsClient;
            object = ((ConfigSharedPrefsClient)object).getRealtimeBackoffMetadata();
            object = ((ConfigSharedPrefsClient$RealtimeBackoffMetadata)object).getBackoffEndTime();
            l2 = ((Date)object).getTime();
            long l3 = date.getTime();
            l2 -= l3;
            l3 = 0L;
            long l4 = Math.max(l3, l2);
            this.makeRealtimeHttpConnection(l4);
            return;
        }
    }

    public void setRealtimeBackgroundState(boolean bl2) {
        this.isInBackground = bl2;
    }

    public void setRequestParams(HttpURLConnection object, String object2, String object3) {
        ((HttpURLConnection)object).setRequestMethod("POST");
        this.setCommonRequestHeaders((HttpURLConnection)object, (String)object3);
        object2 = this.createRequestBody((String)object2).toString().getBytes("utf-8");
        object = ((URLConnection)object).getOutputStream();
        object3 = new BufferedOutputStream((OutputStream)object);
        ((OutputStream)object3).write((byte[])object2);
        ((OutputStream)object3).flush();
        ((OutputStream)object3).close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ConfigAutoFetch startAutoFetch(HttpURLConnection httpURLConnection) {
        synchronized (this) {
            ConfigRealtimeHttpClient$2 configRealtimeHttpClient$2 = new ConfigRealtimeHttpClient$2(this);
            ConfigFetchHandler configFetchHandler = this.configFetchHandler;
            ConfigCacheClient configCacheClient = this.activatedCache;
            Set set = this.listeners;
            ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
            return new ConfigAutoFetch(httpURLConnection, configFetchHandler, configCacheClient, set, configRealtimeHttpClient$2, scheduledExecutorService);
        }
    }

    public void startHttpConnection() {
        this.makeRealtimeHttpConnection(0L);
    }
}

