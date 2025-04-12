/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;

public class ConfigRealtimeHandler$ConfigUpdateListenerRegistrationInternal
implements ConfigUpdateListenerRegistration {
    private final ConfigUpdateListener listener;
    final /* synthetic */ ConfigRealtimeHandler this$0;

    public ConfigRealtimeHandler$ConfigUpdateListenerRegistrationInternal(ConfigRealtimeHandler configRealtimeHandler, ConfigUpdateListener configUpdateListener) {
        this.this$0 = configRealtimeHandler;
        this.listener = configUpdateListener;
    }

    public void remove() {
        ConfigRealtimeHandler configRealtimeHandler = this.this$0;
        ConfigUpdateListener configUpdateListener = this.listener;
        ConfigRealtimeHandler.access$000(configRealtimeHandler, configUpdateListener);
    }
}

