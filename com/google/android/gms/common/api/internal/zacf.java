/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;

public final class zacf
implements Runnable {
    public final /* synthetic */ NonGmsServiceBrokerClient zaa;

    public /* synthetic */ zacf(NonGmsServiceBrokerClient nonGmsServiceBrokerClient) {
        this.zaa = nonGmsServiceBrokerClient;
    }

    public final void run() {
        this.zaa.zab();
    }
}

