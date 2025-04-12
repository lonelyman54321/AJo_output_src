/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigAutoFetch$1;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchResponse;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigAutoFetch {
    private static final int MAXIMUM_FETCH_ATTEMPTS = 3;
    private static final String REALTIME_DISABLED_KEY = "featureDisabled";
    private static final String TEMPLATE_VERSION_KEY = "latestTemplateVersionNumber";
    private final ConfigCacheClient activatedCache;
    private final ConfigFetchHandler configFetchHandler;
    private final Set eventListeners;
    private final HttpURLConnection httpURLConnection;
    private final Random random;
    private final ConfigUpdateListener retryCallback;
    private final ScheduledExecutorService scheduledExecutorService;

    public ConfigAutoFetch(HttpURLConnection object, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Set set, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService) {
        this.httpURLConnection = object;
        this.configFetchHandler = configFetchHandler;
        this.activatedCache = configCacheClient;
        this.eventListeners = set;
        this.retryCallback = configUpdateListener;
        this.scheduledExecutorService = scheduledExecutorService;
        this.random = object = new Random();
    }

    public static /* synthetic */ Task a(ConfigAutoFetch configAutoFetch, Task task2, Task task3, long l2, int n3, Task task4) {
        return configAutoFetch.lambda$fetchLatestConfig$0(task2, task3, l2, n3, task4);
    }

    private void autoFetch(int n3, long l2) {
        if (n3 == 0) {
            FirebaseRemoteConfigException$Code firebaseRemoteConfigException$Code = FirebaseRemoteConfigException$Code.CONFIG_UPDATE_NOT_FETCHED;
            FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", firebaseRemoteConfigException$Code);
            this.propagateErrors(firebaseRemoteConfigServerException);
            return;
        }
        int n4 = this.random.nextInt(4);
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
        ConfigAutoFetch$1 configAutoFetch$1 = new ConfigAutoFetch$1(this, n3, l2);
        long l3 = n4;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        scheduledExecutorService.schedule(configAutoFetch$1, l3, timeUnit);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void executeAllListenerCallbacks(ConfigUpdate configUpdate) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    Object object = this.eventListeners;
                    object = object.iterator();
                    while (bl2 = object.hasNext()) {
                        Object object2 = object.next();
                        object2 = (ConfigUpdateListener)object2;
                        object2.onUpdate(configUpdate);
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

    private static Boolean fetchResponseIsUpToDate(ConfigFetchHandler$FetchResponse object, long l2) {
        ConfigContainer configContainer = ((ConfigFetchHandler$FetchResponse)object).getFetchedConfigs();
        boolean bl2 = false;
        int n3 = 1;
        if (configContainer != null) {
            long l3 = ((ConfigContainer)(object = ((ConfigFetchHandler$FetchResponse)object).getFetchedConfigs())).getTemplateVersionNumber();
            long l4 = l3 - l2;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 >= 0) {
                bl2 = true;
            }
            return bl2;
        }
        int n4 = ((ConfigFetchHandler$FetchResponse)object).getStatus();
        if (n4 == n3) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void handleNotifications(InputStream inputStream) {
        String string2 = TEMPLATE_VERSION_KEY;
        String string3 = REALTIME_DISABLED_KEY;
        Object object = "utf-8";
        Object object2 = new InputStreamReader(inputStream, (String)object);
        BufferedReader bufferedReader = new BufferedReader((Reader)object2);
        object2 = "";
        block2: while (true) {
            Object object3;
            object = object2;
            while ((object3 = bufferedReader.readLine()) != null) {
                JSONException jSONException2;
                Object object4;
                Object object5;
                block5: {
                    boolean bl2;
                    object = Ft2.a((String)object, (String)object3);
                    object5 = "}";
                    boolean bl3 = ((String)object3).contains((CharSequence)object5);
                    if (!bl3 || (bl3 = ((String)(object = this.parseAndValidateConfigUpdateMessage((String)object))).isEmpty())) continue;
                    try {
                        object3 = new JSONObject((String)object);
                        bl2 = object3.has(string3);
                        if (bl2 && (bl2 = object3.getBoolean(string3))) {
                            object = this.retryCallback;
                            object5 = "The server is temporarily unavailable. Try again in a few minutes.";
                            object4 = FirebaseRemoteConfigException$Code.CONFIG_UPDATE_UNAVAILABLE;
                            object3 = new FirebaseRemoteConfigServerException((String)object5, (FirebaseRemoteConfigException$Code)((Object)object4));
                            object.onError((FirebaseRemoteConfigException)object3);
                            break block2;
                        }
                    }
                    catch (JSONException jSONException2) {
                        break block5;
                    }
                    bl2 = this.isEventListenersEmpty();
                    if (bl2) break block2;
                    bl2 = object3.has(string2);
                    if (!bl2) continue block2;
                    object = this.configFetchHandler;
                    long l2 = ((ConfigFetchHandler)object).getTemplateVersionNumber();
                    long l3 = object3.getLong(string2);
                    long l4 = l3 - l2;
                    Object object6 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object6 <= 0) continue block2;
                    int n3 = 3;
                    this.autoFetch(n3, l3);
                    continue block2;
                }
                object = jSONException2.getCause();
                object5 = FirebaseRemoteConfigException$Code.CONFIG_UPDATE_MESSAGE_INVALID;
                object4 = "Unable to parse config update message.";
                object3 = new FirebaseRemoteConfigClientException((String)object4, (Throwable)object, (FirebaseRemoteConfigException$Code)((Object)object5));
                this.propagateErrors((FirebaseRemoteConfigException)object3);
                continue block2;
            }
            break;
        }
        bufferedReader.close();
        inputStream.close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean isEventListenersEmpty() {
        synchronized (this) {
            Set set = this.eventListeners;
            return set.isEmpty();
        }
    }

    private /* synthetic */ Task lambda$fetchLatestConfig$0(Task object, Task object2, long l2, int n3, Task object3) {
        boolean bl2 = ((Task)object).isSuccessful();
        if (!bl2) {
            object = ((Task)object).getException();
            object2 = new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", (Throwable)object);
            return Tasks.forException((Exception)object2);
        }
        bl2 = ((Task)object2).isSuccessful();
        if (!bl2) {
            object2 = ((Task)object2).getException();
            object = new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", (Throwable)object2);
            return Tasks.forException((Exception)object);
        }
        object = (ConfigFetchHandler$FetchResponse)((Task)object).getResult();
        object2 = (ConfigContainer)((Task)object2).getResult();
        object3 = ConfigAutoFetch.fetchResponseIsUpToDate((ConfigFetchHandler$FetchResponse)object, l2);
        bl2 = (Boolean)object3;
        if (!bl2) {
            this.autoFetch(n3, l2);
            return Tasks.forResult(null);
        }
        ConfigContainer configContainer = ((ConfigFetchHandler$FetchResponse)object).getFetchedConfigs();
        if (configContainer == null) {
            return Tasks.forResult(null);
        }
        if (object2 == null) {
            object2 = ConfigContainer.newBuilder().build();
        }
        object = ((ConfigFetchHandler$FetchResponse)object).getFetchedConfigs();
        boolean bl3 = (object = ((ConfigContainer)object2).getChangedParams((ConfigContainer)object)).isEmpty();
        if (bl3) {
            return Tasks.forResult(null);
        }
        object = ConfigUpdate.create((Set)object);
        this.executeAllListenerCallbacks((ConfigUpdate)object);
        return Tasks.forResult(null);
    }

    private String parseAndValidateConfigUpdateMessage(String string2) {
        int n3 = string2.indexOf(123);
        int n4 = string2.lastIndexOf(125);
        String string3 = "";
        if (n3 >= 0 && n4 >= 0 && n3 < n4) {
            string3 = string2.substring(n3, ++n4);
        }
        return string3;
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
                    Object object = this.eventListeners;
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
    public Task fetchLatestConfig(int n3, long l2) {
        int n4 = 1;
        synchronized (this) {
            j40_0 j40_02;
            int n7 = n3 + -1;
            n3 = 3 - n7;
            Object object = this.configFetchHandler;
            Object object2 = ConfigFetchHandler$FetchType.REALTIME;
            Task task2 = ((ConfigFetchHandler)object).fetchNowWithTypeAndAttemptNumber((ConfigFetchHandler$FetchType)((Object)object2), n3);
            Object object3 = this.activatedCache;
            Task task3 = ((ConfigCacheClient)object3).get();
            n3 = 2;
            object3 = new Task[n3];
            object = null;
            object3[0] = task2;
            object3[n4] = task3;
            object3 = Tasks.whenAllComplete((Task[])object3);
            ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
            object = j40_02;
            object2 = this;
            j40_02 = new j40_0(this, task2, task3, l2, n7);
            return ((Task)object3).continueWithTask(scheduledExecutorService, j40_02);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void listenForNotifications() {
        Object object = this.httpURLConnection;
        if (object == null) {
            return;
        }
        try {
            object = ((URLConnection)object).getInputStream();
            this.handleNotifications((InputStream)object);
            ((InputStream)object).close();
        }
        catch (Throwable throwable) {
            this.httpURLConnection.disconnect();
            throw throwable;
        }
        catch (IOException iOException) {}
        object = this.httpURLConnection;
        ((HttpURLConnection)object).disconnect();
    }
}

