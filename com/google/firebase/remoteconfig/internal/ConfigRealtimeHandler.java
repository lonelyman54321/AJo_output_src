/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler$ConfigUpdateListenerRegistrationInternal;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class ConfigRealtimeHandler {
    private final ConfigCacheClient activatedCacheClient;
    private final ConfigFetchHandler configFetchHandler;
    private final ConfigRealtimeHttpClient configRealtimeHttpClient;
    private final Context context;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Set listeners;
    private final String namespace;
    private final ScheduledExecutorService scheduledExecutorService;
    private final ConfigSharedPrefsClient sharedPrefsClient;

    public ConfigRealtimeHandler(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String string2, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        ConfigRealtimeHttpClient configRealtimeHttpClient;
        LinkedHashSet linkedHashSet;
        this.listeners = linkedHashSet = new LinkedHashSet();
        this.configRealtimeHttpClient = configRealtimeHttpClient = new ConfigRealtimeHttpClient(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, string2, linkedHashSet, configSharedPrefsClient, scheduledExecutorService);
        this.firebaseApp = firebaseApp;
        this.configFetchHandler = configFetchHandler;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCacheClient = configCacheClient;
        this.context = context;
        this.namespace = string2;
        this.sharedPrefsClient = configSharedPrefsClient;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    public static /* synthetic */ void access$000(ConfigRealtimeHandler configRealtimeHandler, ConfigUpdateListener configUpdateListener) {
        configRealtimeHandler.removeRealtimeConfigUpdateListener(configUpdateListener);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void beginRealtime() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = this.listeners;
                        boolean bl2 = object.isEmpty();
                        if (bl2) break block4;
                        object = this.configRealtimeHttpClient;
                        ((ConfigRealtimeHttpClient)object).startHttpConnection();
                    }
                    catch (Throwable throwable2) {
                        break block5;
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
    private void removeRealtimeConfigUpdateListener(ConfigUpdateListener configUpdateListener) {
        synchronized (this) {
            Set set = this.listeners;
            set.remove(configUpdateListener);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ConfigUpdateListenerRegistration addRealtimeConfigUpdateListener(ConfigUpdateListener configUpdateListener) {
        synchronized (this) {
            Set set = this.listeners;
            set.add(configUpdateListener);
            this.beginRealtime();
            return new ConfigRealtimeHandler$ConfigUpdateListenerRegistrationInternal(this, configUpdateListener);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setBackgroundState(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        ConfigRealtimeHttpClient configRealtimeHttpClient = this.configRealtimeHttpClient;
                        configRealtimeHttpClient.setRealtimeBackgroundState(bl2);
                        if (bl2) break block4;
                        this.beginRealtime();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

