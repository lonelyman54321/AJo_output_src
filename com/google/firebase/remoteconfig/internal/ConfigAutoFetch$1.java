/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.internal.ConfigAutoFetch;

class ConfigAutoFetch$1
implements Runnable {
    final /* synthetic */ ConfigAutoFetch this$0;
    final /* synthetic */ int val$remainingAttempts;
    final /* synthetic */ long val$targetVersion;

    public ConfigAutoFetch$1(ConfigAutoFetch configAutoFetch, int n3, long l2) {
        this.this$0 = configAutoFetch;
        this.val$remainingAttempts = n3;
        this.val$targetVersion = l2;
    }

    public void run() {
        ConfigAutoFetch configAutoFetch = this.this$0;
        int n3 = this.val$remainingAttempts;
        long l2 = this.val$targetVersion;
        configAutoFetch.fetchLatestConfig(n3, l2);
    }
}

