/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import com.google.firebase.remoteconfig.CustomSignals;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigContainer$Builder;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler$FetchResponse;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0;
    public static final long DEFAULT_VALUE_FOR_LONG = 0L;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = 255;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC;
    private final ConfigCacheClient activatedConfigsCache;
    private final ConfigRealtimeHandler configRealtimeHandler;
    private final Context context;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final ConfigFetchHandler fetchHandler;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigSharedPrefsClient frcSharedPrefs;
    private final ConfigGetParameterHandler getHandler;
    private final RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigSharedPrefsClient configSharedPrefsClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.context = context;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.executor = executor;
        this.fetchedConfigsCache = configCacheClient;
        this.activatedConfigsCache = configCacheClient2;
        this.defaultConfigsCache = configCacheClient3;
        this.fetchHandler = configFetchHandler;
        this.getHandler = configGetParameterHandler;
        this.frcSharedPrefs = configSharedPrefsClient;
        this.configRealtimeHandler = configRealtimeHandler;
        this.rolloutsStateSubscriptionsHandler = rolloutsStateSubscriptionsHandler;
    }

    public static /* synthetic */ Void a(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return firebaseRemoteConfig.lambda$setConfigSettingsAsync$5(firebaseRemoteConfigSettings);
    }

    public static /* synthetic */ boolean b(FirebaseRemoteConfig firebaseRemoteConfig, Task task2) {
        return firebaseRemoteConfig.processActivatePutTask(task2);
    }

    public static /* synthetic */ Void c(FirebaseRemoteConfig firebaseRemoteConfig, CustomSignals customSignals) {
        return firebaseRemoteConfig.lambda$setCustomSignals$8(customSignals);
    }

    public static /* synthetic */ Task d(ConfigContainer configContainer) {
        return FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7(configContainer);
    }

    public static /* synthetic */ FirebaseRemoteConfigInfo e(Task task2, Task task3) {
        return FirebaseRemoteConfig.lambda$ensureInitialized$0(task2, task3);
    }

    public static /* synthetic */ Task f(ConfigFetchHandler$FetchResponse configFetchHandler$FetchResponse) {
        return FirebaseRemoteConfig.lambda$fetch$4(configFetchHandler$FetchResponse);
    }

    public static /* synthetic */ Task g(ConfigFetchHandler$FetchResponse configFetchHandler$FetchResponse) {
        return FirebaseRemoteConfig.lambda$fetch$3(configFetchHandler$FetchResponse);
    }

    public static FirebaseRemoteConfig getInstance() {
        return FirebaseRemoteConfig.getInstance(FirebaseApp.getInstance());
    }

    public static FirebaseRemoteConfig getInstance(FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent)firebaseApp.get(RemoteConfigComponent.class)).getDefault();
    }

    public static /* synthetic */ Task h(FirebaseRemoteConfig firebaseRemoteConfig, Void void_) {
        return firebaseRemoteConfig.lambda$fetchAndActivate$1(void_);
    }

    public static /* synthetic */ Task i(FirebaseRemoteConfig firebaseRemoteConfig, Task task2, Task task3, Task task4) {
        return firebaseRemoteConfig.lambda$activate$2(task2, task3, task4);
    }

    private static boolean isFetchedFresh(ConfigContainer object, ConfigContainer object2) {
        boolean bl2;
        if (object2 != null && (bl2 = ((Date)(object = ((ConfigContainer)object).getFetchTime())).equals(object2 = ((ConfigContainer)object2).getFetchTime()))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static /* synthetic */ Void j(FirebaseRemoteConfig firebaseRemoteConfig) {
        return firebaseRemoteConfig.lambda$reset$6();
    }

    private /* synthetic */ Task lambda$activate$2(Task object, Task object2, Task object3) {
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2 && (object3 = ((Task)object).getResult()) != null) {
            boolean bl3;
            object = (ConfigContainer)((Task)object).getResult();
            bl2 = ((Task)object2).isSuccessful();
            if (bl2 && !(bl3 = FirebaseRemoteConfig.isFetchedFresh((ConfigContainer)object, (ConfigContainer)(object2 = (ConfigContainer)((Task)object2).getResult())))) {
                return Tasks.forResult(Boolean.FALSE);
            }
            object = this.activatedConfigsCache.put((ConfigContainer)object);
            object2 = this.executor;
            object3 = new wn0_0(this);
            return ((Task)object).continueWith((Executor)object2, (Continuation)object3);
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    private static /* synthetic */ FirebaseRemoteConfigInfo lambda$ensureInitialized$0(Task task2, Task task3) {
        return (FirebaseRemoteConfigInfo)task2.getResult();
    }

    private static /* synthetic */ Task lambda$fetch$3(ConfigFetchHandler$FetchResponse configFetchHandler$FetchResponse) {
        return Tasks.forResult(null);
    }

    private static /* synthetic */ Task lambda$fetch$4(ConfigFetchHandler$FetchResponse configFetchHandler$FetchResponse) {
        return Tasks.forResult(null);
    }

    private /* synthetic */ Task lambda$fetchAndActivate$1(Void void_) {
        return this.activate();
    }

    private /* synthetic */ Void lambda$reset$6() {
        this.activatedConfigsCache.clear();
        this.fetchedConfigsCache.clear();
        this.defaultConfigsCache.clear();
        this.frcSharedPrefs.clear();
        return null;
    }

    private /* synthetic */ Void lambda$setConfigSettingsAsync$5(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.frcSharedPrefs.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    private /* synthetic */ Void lambda$setCustomSignals$8(CustomSignals object) {
        ConfigSharedPrefsClient configSharedPrefsClient = this.frcSharedPrefs;
        object = ((CustomSignals)object).customSignals;
        configSharedPrefsClient.setCustomSignals((Map)object);
        return null;
    }

    private static /* synthetic */ Task lambda$setDefaultsWithStringsMapAsync$7(ConfigContainer configContainer) {
        return Tasks.forResult(null);
    }

    private boolean processActivatePutTask(Task object) {
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            Object object2 = this.fetchedConfigsCache;
            ((ConfigCacheClient)object2).clear();
            object = (ConfigContainer)((Task)object).getResult();
            if (object != null) {
                object2 = ((ConfigContainer)object).getAbtExperiments();
                this.updateAbtWithActivatedExperiments((JSONArray)object2);
                object2 = this.rolloutsStateSubscriptionsHandler;
                ((RolloutsStateSubscriptionsHandler)object2).publishActiveRolloutsState((ConfigContainer)object);
            }
            return true;
        }
        return false;
    }

    private Task setDefaultsWithStringsMapAsync(Map object) {
        Object object2;
        try {
            object2 = ConfigContainer.newBuilder();
        }
        catch (JSONException jSONException) {
            return Tasks.forResult(null);
        }
        object = ((ConfigContainer$Builder)object2).replaceConfigsWith((Map)object);
        object = ((ConfigContainer$Builder)object).build();
        object = this.defaultConfigsCache.put((ConfigContainer)object);
        object2 = FirebaseExecutors.directExecutor();
        vn0_0 vn0_02 = new Object();
        return ((Task)object).onSuccessTask((Executor)object2, vn0_02);
    }

    public static List toExperimentInfoMaps(JSONArray jSONArray) {
        int n3;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            boolean bl2;
            HashMap<String, String> hashMap = new HashMap<String, String>();
            JSONObject jSONObject = jSONArray.getJSONObject(i3);
            Iterator iterator = jSONObject.keys();
            while (bl2 = iterator.hasNext()) {
                String string2 = (String)iterator.next();
                String string3 = jSONObject.getString(string2);
                hashMap.put(string2, string3);
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public Task activate() {
        Task task2 = this.fetchedConfigsCache.get();
        Task task3 = this.activatedConfigsCache.get();
        Object object = new Task[]{task2, task3};
        object = Tasks.whenAllComplete((Task[])object);
        Executor executor = this.executor;
        tn0_2 tn0_22 = new tn0_2(this, task2, task3);
        return ((Task)object).continueWithTask(executor, tn0_22);
    }

    public ConfigUpdateListenerRegistration addOnConfigUpdateListener(ConfigUpdateListener configUpdateListener) {
        return this.configRealtimeHandler.addRealtimeConfigUpdateListener(configUpdateListener);
    }

    public Task ensureInitialized() {
        Task task2 = this.activatedConfigsCache.get();
        Object object = this.defaultConfigsCache.get();
        Object object2 = this.fetchedConfigsCache.get();
        Object object3 = this.executor;
        int n3 = 1;
        Object object4 = new wl0_2(this, n3);
        object3 = Tasks.call((Executor)object3, (Callable)object4);
        object4 = this.firebaseInstallations.getId();
        Task task3 = this.firebaseInstallations.getToken(false);
        Task[] taskArray = new Task[6];
        taskArray[0] = task2;
        taskArray[n3] = object;
        taskArray[2] = object2;
        taskArray[3] = object3;
        taskArray[4] = object4;
        taskArray[5] = task3;
        task2 = Tasks.whenAllComplete(taskArray);
        object = this.executor;
        object2 = new zn0_0(object3);
        return task2.continueWith((Executor)object, (Continuation)object2);
    }

    public Task fetch() {
        Task task2 = this.fetchHandler.fetch();
        Executor executor = FirebaseExecutors.directExecutor();
        un0_2 un0_22 = new Object();
        return task2.onSuccessTask(executor, un0_22);
    }

    public Task fetch(long l2) {
        Task task2 = this.fetchHandler.fetch(l2);
        Executor executor = FirebaseExecutors.directExecutor();
        kl0_0 kl0_02 = new Object();
        return task2.onSuccessTask(executor, kl0_02);
    }

    public Task fetchAndActivate() {
        Task task2 = this.fetch();
        Executor executor = this.executor;
        gq_2 gq_22 = new gq_2(this, 2);
        return task2.onSuccessTask(executor, gq_22);
    }

    public Map getAll() {
        return this.getHandler.getAll();
    }

    public boolean getBoolean(String string2) {
        return this.getHandler.getBoolean(string2);
    }

    public double getDouble(String string2) {
        return this.getHandler.getDouble(string2);
    }

    public FirebaseRemoteConfigInfo getInfo() {
        return this.frcSharedPrefs.getInfo();
    }

    public Set getKeysByPrefix(String string2) {
        return this.getHandler.getKeysByPrefix(string2);
    }

    public long getLong(String string2) {
        return this.getHandler.getLong(string2);
    }

    public RolloutsStateSubscriptionsHandler getRolloutsStateSubscriptionsHandler() {
        return this.rolloutsStateSubscriptionsHandler;
    }

    public String getString(String string2) {
        return this.getHandler.getString(string2);
    }

    public FirebaseRemoteConfigValue getValue(String string2) {
        return this.getHandler.getValue(string2);
    }

    public Task reset() {
        Executor executor = this.executor;
        ul0_0 ul0_02 = new ul0_0(this, 1);
        return Tasks.call(executor, ul0_02);
    }

    public void schedule(Runnable runnable2) {
        this.executor.execute(runnable2);
    }

    public Task setConfigSettingsAsync(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        Executor executor = this.executor;
        yn0_1 yn0_12 = new yn0_1(this, firebaseRemoteConfigSettings);
        return Tasks.call(executor, yn0_12);
    }

    public void setConfigUpdateBackgroundState(boolean bl2) {
        this.configRealtimeHandler.setBackgroundState(bl2);
    }

    public Task setCustomSignals(CustomSignals customSignals) {
        Executor executor = this.executor;
        xn0_0 xn0_02 = new xn0_0(this, customSignals);
        return Tasks.call(executor, xn0_02);
    }

    public Task setDefaultsAsync(int n3) {
        Map map2 = DefaultsXmlParser.getDefaultsFromXml(this.context, n3);
        return this.setDefaultsWithStringsMapAsync(map2);
    }

    public Task setDefaultsAsync(Map object) {
        boolean bl2;
        HashMap<Object, String> hashMap = new HashMap<Object, String>();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            Object object3 = object2.getValue();
            boolean bl3 = object3 instanceof byte[];
            if (bl3) {
                object2 = (String)object2.getKey();
                object3 = (byte[])object3;
                String string2 = new String((byte[])object3);
                hashMap.put(object2, string2);
                continue;
            }
            object2 = (String)object2.getKey();
            object3 = object3.toString();
            hashMap.put(object2, (String)object3);
        }
        return this.setDefaultsWithStringsMapAsync(hashMap);
    }

    public void startLoadingConfigsFromDisk() {
        this.activatedConfigsCache.get();
        this.defaultConfigsCache.get();
        this.fetchedConfigsCache.get();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void updateAbtWithActivatedExperiments(JSONArray object) {
        FirebaseABTesting firebaseABTesting = this.firebaseAbt;
        if (firebaseABTesting == null) {
            return;
        }
        List list = FirebaseRemoteConfig.toExperimentInfoMaps(object);
        firebaseABTesting = this.firebaseAbt;
        try {
            firebaseABTesting.replaceAllExperiments(list);
            return;
        }
        catch (AbtException | JSONException throwable) {
            return;
        }
    }
}

