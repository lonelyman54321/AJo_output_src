/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;

class ConfigRealtimeHttpClient$1
implements Runnable {
    final /* synthetic */ ConfigRealtimeHttpClient this$0;

    public ConfigRealtimeHttpClient$1(ConfigRealtimeHttpClient configRealtimeHttpClient) {
        this.this$0 = configRealtimeHttpClient;
    }

    public void run() {
        this.this$0.beginRealtimeHttpStream();
    }
}

