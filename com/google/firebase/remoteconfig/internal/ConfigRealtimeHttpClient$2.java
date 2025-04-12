/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;

class ConfigRealtimeHttpClient$2
implements ConfigUpdateListener {
    final /* synthetic */ ConfigRealtimeHttpClient this$0;

    public ConfigRealtimeHttpClient$2(ConfigRealtimeHttpClient configRealtimeHttpClient) {
        this.this$0 = configRealtimeHttpClient;
    }

    public void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        ConfigRealtimeHttpClient.access$000(this.this$0);
        ConfigRealtimeHttpClient.access$100(this.this$0, firebaseRemoteConfigException);
    }

    public void onUpdate(ConfigUpdate configUpdate) {
    }
}

