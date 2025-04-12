/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.format.DateUtils
 */
package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchResponse;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchType;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient$BackoffMetadata;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class ConfigFetchHandler {
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES;
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = 0L;
    static final String FIRST_OPEN_TIME_KEY = "_fot";
    static final int HTTP_TOO_MANY_REQUESTS = 429;
    private static final String X_FIREBASE_RC_FETCH_TYPE = "X-Firebase-RC-Fetch-Type";
    private final Provider analyticsConnector;
    private final Clock clock;
    private final Map customHttpHeaders;
    private final Executor executor;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigFetchHttpClient frcBackendApiClient;
    private final ConfigSharedPrefsClient frcSharedPrefs;
    private final Random randomGenerator;

    static {
        int[] nArray;
        DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = TimeUnit.HOURS.toSeconds(12);
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
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigSharedPrefsClient configSharedPrefsClient, Map map2) {
        this.firebaseInstallations = firebaseInstallationsApi;
        this.analyticsConnector = provider;
        this.executor = executor;
        this.clock = clock;
        this.randomGenerator = random;
        this.fetchedConfigsCache = configCacheClient;
        this.frcBackendApiClient = configFetchHttpClient;
        this.frcSharedPrefs = configSharedPrefsClient;
        this.customHttpHeaders = map2;
    }

    public static /* synthetic */ Task a(ConfigFetchHandler configFetchHandler, Task task2, Task task3, Date date, Map map2, Task task4) {
        return configFetchHandler.lambda$fetchIfCacheExpiredAndNotThrottled$2(task2, task3, date, map2, task4);
    }

    private boolean areCachedFetchConfigsValid(long l2, Date date) {
        Date date2;
        Date date3 = this.frcSharedPrefs.getLastSuccessfulFetchTime();
        boolean bl2 = date3.equals(date2 = ConfigSharedPrefsClient.LAST_FETCH_TIME_NO_FETCH_YET);
        if (bl2) {
            return false;
        }
        long l3 = date3.getTime();
        l2 = TimeUnit.SECONDS.toMillis(l2) + l3;
        date2 = new Date(l2);
        return date.before(date2);
    }

    public static /* synthetic */ Task b(ConfigFetchHandler$FetchResponse configFetchHandler$FetchResponse, ConfigContainer configContainer) {
        return ConfigFetchHandler.lambda$fetchFromBackendAndCacheResponse$4(configFetchHandler$FetchResponse, configContainer);
    }

    public static /* synthetic */ Task c(ConfigFetchHandler configFetchHandler, Date date, Task task2) {
        return configFetchHandler.lambda$fetchIfCacheExpiredAndNotThrottled$3(date, task2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private FirebaseRemoteConfigServerException createExceptionWithGenericMessage(FirebaseRemoteConfigServerException firebaseRemoteConfigException) {
        String string2;
        block8: {
            block9: {
                int n3;
                int n4 = ((FirebaseRemoteConfigServerException)firebaseRemoteConfigException).getHttpStatusCode();
                if (n4 == (n3 = 401)) break block9;
                n3 = 403;
                if (n4 != n3) {
                    n3 = 429;
                    if (n4 == n3) {
                        FirebaseRemoteConfigClientException firebaseRemoteConfigClientException = new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                        throw firebaseRemoteConfigClientException;
                    }
                    n3 = 500;
                    if (n4 != n3) {
                        switch (n4) {
                            default: {
                                string2 = "The server returned an unexpected error.";
                                break;
                            }
                            case 502: 
                            case 503: 
                            case 504: {
                                string2 = "The server is unavailable. Please try again later.";
                                break;
                            }
                        }
                        break block8;
                    } else {
                        string2 = "There was an internal server error.";
                    }
                    break block8;
                } else {
                    string2 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                }
                break block8;
            }
            string2 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        int n7 = ((FirebaseRemoteConfigServerException)firebaseRemoteConfigException).getHttpStatusCode();
        string2 = "Fetch failed: ".concat(string2);
        return new FirebaseRemoteConfigServerException(n7, string2, firebaseRemoteConfigException);
    }

    private String createThrottledMessage(long l2) {
        String string2 = DateUtils.formatElapsedTime((long)TimeUnit.MILLISECONDS.toSeconds(l2));
        return kp1_0.c("Fetch is throttled. Please wait before calling fetch again: ", string2);
    }

    public static /* synthetic */ Task d(ConfigFetchHandler configFetchHandler, HashMap hashMap, Task task2) {
        return configFetchHandler.lambda$fetchNowWithTypeAndAttemptNumber$1(hashMap, task2);
    }

    public static /* synthetic */ Task e(ConfigFetchHandler configFetchHandler, long l2, HashMap hashMap, Task task2) {
        return configFetchHandler.lambda$fetch$0(l2, hashMap, task2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ConfigFetchHandler$FetchResponse fetchFromBackend(String object, String object2, Date date, Map object3) {
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException2;
        block5: {
            block4: {
                try {
                    Object object4 = this.frcBackendApiClient;
                    HttpURLConnection httpURLConnection = ((ConfigFetchHttpClient)object4).createHttpURLConnection();
                    ConfigFetchHttpClient configFetchHttpClient = this.frcBackendApiClient;
                    Map map2 = this.getUserProperties();
                    object4 = this.frcSharedPrefs;
                    String string2 = ((ConfigSharedPrefsClient)object4).getLastFetchETag();
                    Long l2 = this.getFirstOpenTime();
                    object4 = this.frcSharedPrefs;
                    Map map3 = ((ConfigSharedPrefsClient)object4).getCustomSignals();
                    object = configFetchHttpClient.fetch(httpURLConnection, (String)object, (String)object2, map2, string2, (Map)object3, l2, date, map3);
                    object2 = ((ConfigFetchHandler$FetchResponse)object).getFetchedConfigs();
                    if (object2 == null) break block4;
                    object2 = this.frcSharedPrefs;
                    object3 = ((ConfigFetchHandler$FetchResponse)object).getFetchedConfigs();
                    long l3 = ((ConfigContainer)object3).getTemplateVersionNumber();
                    ((ConfigSharedPrefsClient)object2).setLastTemplateVersion(l3);
                }
                catch (FirebaseRemoteConfigServerException firebaseRemoteConfigServerException2) {
                    break block5;
                }
            }
            if ((object2 = ((ConfigFetchHandler$FetchResponse)object).getLastFetchETag()) != null) {
                object2 = this.frcSharedPrefs;
                object3 = ((ConfigFetchHandler$FetchResponse)object).getLastFetchETag();
                ((ConfigSharedPrefsClient)object2).setLastFetchETag((String)object3);
            }
            object2 = this.frcSharedPrefs;
            ((ConfigSharedPrefsClient)object2).resetBackoff();
            return object;
        }
        int n3 = firebaseRemoteConfigServerException2.getHttpStatusCode();
        object2 = this.updateAndReturnBackoffMetadata(n3, date);
        int n4 = firebaseRemoteConfigServerException2.getHttpStatusCode();
        n4 = (int)(this.shouldThrottle((ConfigSharedPrefsClient$BackoffMetadata)object2, n4) ? 1 : 0);
        if (n4 != 0) {
            long l4 = ((ConfigSharedPrefsClient$BackoffMetadata)object2).getBackoffEndTime().getTime();
            FirebaseRemoteConfigFetchThrottledException firebaseRemoteConfigFetchThrottledException = new FirebaseRemoteConfigFetchThrottledException(l4);
            throw firebaseRemoteConfigFetchThrottledException;
        }
        throw this.createExceptionWithGenericMessage(firebaseRemoteConfigServerException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Task fetchFromBackendAndCacheResponse(String object, String object2, Date object3, Map object4) {
        try {
            object = this.fetchFromBackend((String)object, (String)object2, (Date)object3, (Map)object4);
            int n3 = ((ConfigFetchHandler$FetchResponse)object).getStatus();
            if (n3 != 0) {
                return Tasks.forResult(object);
            }
        }
        catch (FirebaseRemoteConfigException firebaseRemoteConfigException) {
            return Tasks.forException(firebaseRemoteConfigException);
        }
        object2 = this.fetchedConfigsCache;
        object3 = ((ConfigFetchHandler$FetchResponse)object).getFetchedConfigs();
        object2 = ((ConfigCacheClient)object2).put((ConfigContainer)object3);
        object3 = this.executor;
        object4 = new g7_0(object);
        return ((Task)object2).onSuccessTask((Executor)object3, (SuccessContinuation)object4);
    }

    private Task fetchIfCacheExpiredAndNotThrottled(Task object, long l2, Map map2) {
        Object object2;
        Object object3;
        boolean bl2;
        Object object4 = this.clock;
        long l3 = object4.currentTimeMillis();
        Date date = new Date(l3);
        boolean n3 = ((Task)object).isSuccessful();
        if (n3 && (bl2 = this.areCachedFetchConfigsValid(l2, date))) {
            return Tasks.forResult(ConfigFetchHandler$FetchResponse.forLocalStorageUsed(date));
        }
        object = this.getBackoffEndTimeInMillis(date);
        if (object != null) {
            long l4 = ((Date)object).getTime();
            long l7 = date.getTime();
            object3 = this.createThrottledMessage(l4 -= l7);
            l7 = ((Date)object).getTime();
            object2 = new FirebaseRemoteConfigFetchThrottledException((String)object3, l7);
            object = Tasks.forException((Exception)object2);
        } else {
            Task task2 = this.firebaseInstallations.getId();
            Task task3 = this.firebaseInstallations.getToken(false);
            int n4 = 2;
            object = new Task[n4];
            object[0] = task2;
            int n7 = 1;
            object[n7] = task3;
            object = Tasks.whenAllComplete((Task[])object);
            object2 = this.executor;
            object4 = object3;
            object3 = new v40(this, task2, task3, date, map2);
            object = ((Task)object).continueWithTask((Executor)object2, (Continuation)object3);
        }
        object2 = this.executor;
        object3 = new w40(this, date);
        return ((Task)object).continueWithTask((Executor)object2, (Continuation)object3);
    }

    private Date getBackoffEndTimeInMillis(Date date) {
        Date date2 = this.frcSharedPrefs.getBackoffMetadata().getBackoffEndTime();
        boolean bl2 = date.before(date2);
        if (bl2) {
            return date2;
        }
        return null;
    }

    private Long getFirstOpenTime() {
        AnalyticsConnector analyticsConnector = (AnalyticsConnector)this.analyticsConnector.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (Long)analyticsConnector.getUserProperties(true).get(FIRST_OPEN_TIME_KEY);
    }

    private long getRandomizedBackoffDurationInMillis(int n3) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] nArray = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        int n4 = nArray.length;
        n3 = Math.min(n3, n4) + -1;
        long l2 = nArray[n3];
        long l3 = timeUnit.toMillis(l2);
        long l4 = l3 / (long)2;
        Random random = this.randomGenerator;
        int n7 = (int)l3;
        l3 = random.nextInt(n7);
        return l4 + l3;
    }

    private Map getUserProperties() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Object object = (AnalyticsConnector)this.analyticsConnector.get();
        if (object == null) {
            return hashMap;
        }
        boolean bl2 = false;
        Object object2 = null;
        object = object.getUserProperties(false).entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = object2.getValue().toString();
            hashMap.put(string2, object2);
        }
        return hashMap;
    }

    private boolean isThrottleableServerError(int n3) {
        int n4 = 429;
        n3 = n3 != n4 && n3 != (n4 = 502) && n3 != (n4 = 503) && n3 != (n4 = 504) ? 0 : 1;
        return n3 != 0;
    }

    private /* synthetic */ Task lambda$fetch$0(long l2, Map map2, Task task2) {
        return this.fetchIfCacheExpiredAndNotThrottled(task2, l2, map2);
    }

    private static /* synthetic */ Task lambda$fetchFromBackendAndCacheResponse$4(ConfigFetchHandler$FetchResponse configFetchHandler$FetchResponse, ConfigContainer configContainer) {
        return Tasks.forResult(configFetchHandler$FetchResponse);
    }

    private /* synthetic */ Task lambda$fetchIfCacheExpiredAndNotThrottled$2(Task object, Task object2, Date date, Map map2, Task task2) {
        boolean bl2 = ((Task)object).isSuccessful();
        if (!bl2) {
            object = ((Task)object).getException();
            object2 = new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", (Throwable)object);
            return Tasks.forException((Exception)object2);
        }
        bl2 = ((Task)object2).isSuccessful();
        if (!bl2) {
            object2 = ((Task)object2).getException();
            object = new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", (Throwable)object2);
            return Tasks.forException((Exception)object);
        }
        object = (String)((Task)object).getResult();
        object2 = ((InstallationTokenResult)((Task)object2).getResult()).getToken();
        return this.fetchFromBackendAndCacheResponse((String)object, (String)object2, date, map2);
    }

    private /* synthetic */ Task lambda$fetchIfCacheExpiredAndNotThrottled$3(Date date, Task task2) {
        this.updateLastFetchStatusAndTime(task2, date);
        return task2;
    }

    private /* synthetic */ Task lambda$fetchNowWithTypeAndAttemptNumber$1(Map map2, Task task2) {
        return this.fetchIfCacheExpiredAndNotThrottled(task2, 0L, map2);
    }

    private boolean shouldThrottle(ConfigSharedPrefsClient$BackoffMetadata configSharedPrefsClient$BackoffMetadata, int n3) {
        int n4;
        int n7 = configSharedPrefsClient$BackoffMetadata.getNumFailedFetches();
        if (n7 <= (n4 = 1) && n3 != (n7 = 429)) {
            n4 = 0;
        }
        return n4 != 0;
    }

    private ConfigSharedPrefsClient$BackoffMetadata updateAndReturnBackoffMetadata(int n3, Date date) {
        if ((n3 = (int)(this.isThrottleableServerError(n3) ? 1 : 0)) != 0) {
            this.updateBackoffMetadataWithLastFailedFetchTime(date);
        }
        return this.frcSharedPrefs.getBackoffMetadata();
    }

    private void updateBackoffMetadataWithLastFailedFetchTime(Date date) {
        int n3 = this.frcSharedPrefs.getBackoffMetadata().getNumFailedFetches() + 1;
        long l2 = this.getRandomizedBackoffDurationInMillis(n3);
        long l3 = date.getTime() + l2;
        Date date2 = new Date(l3);
        this.frcSharedPrefs.setBackoffMetadata(n3, date2);
    }

    private void updateLastFetchStatusAndTime(Task object, Date date) {
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            this.frcSharedPrefs.updateLastFetchAsSuccessfulAt(date);
            return;
        }
        if ((object = ((Task)object).getException()) == null) {
            return;
        }
        boolean bl3 = object instanceof FirebaseRemoteConfigFetchThrottledException;
        if (bl3) {
            object = this.frcSharedPrefs;
            ((ConfigSharedPrefsClient)object).updateLastFetchAsThrottled();
        } else {
            object = this.frcSharedPrefs;
            ((ConfigSharedPrefsClient)object).updateLastFetchAsFailed();
        }
    }

    public Task fetch() {
        long l2 = this.frcSharedPrefs.getMinimumFetchIntervalInSeconds();
        return this.fetch(l2);
    }

    public Task fetch(long l2) {
        Object object = this.customHttpHeaders;
        HashMap<String, Object> hashMap = new HashMap<String, Object>((Map<String, Object>)object);
        object = new StringBuilder();
        Object object2 = ConfigFetchHandler$FetchType.BASE.getValue();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append("/1");
        object = ((StringBuilder)object).toString();
        hashMap.put(X_FIREBASE_RC_FETCH_TYPE, object);
        object = this.fetchedConfigsCache.get();
        object2 = this.executor;
        u40 u402 = new u40(this, l2, hashMap);
        return ((Task)object).continueWithTask((Executor)object2, u402);
    }

    public Task fetchNowWithTypeAndAttemptNumber(ConfigFetchHandler$FetchType object, int n3) {
        Object object2 = this.customHttpHeaders;
        HashMap<String, ConfigFetchHandler$FetchType> hashMap = new HashMap<String, ConfigFetchHandler$FetchType>((Map<String, ConfigFetchHandler$FetchType>)object2);
        object2 = new StringBuilder();
        object = ((ConfigFetchHandler$FetchType)((Object)object)).getValue();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("/");
        ((StringBuilder)object2).append(n3);
        object = ((StringBuilder)object2).toString();
        hashMap.put(X_FIREBASE_RC_FETCH_TYPE, (ConfigFetchHandler$FetchType)((Object)object));
        object = this.fetchedConfigsCache.get();
        Executor executor = this.executor;
        object2 = new x40(this, hashMap);
        return ((Task)object).continueWithTask(executor, (Continuation)object2);
    }

    public Provider getAnalyticsConnector() {
        return this.analyticsConnector;
    }

    public long getTemplateVersionNumber() {
        return this.frcSharedPrefs.getLastTemplateVersion();
    }
}

