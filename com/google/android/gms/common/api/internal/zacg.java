/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 */
package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;

public final class zacg
implements Runnable {
    public final /* synthetic */ NonGmsServiceBrokerClient zaa;
    public final /* synthetic */ IBinder zab;

    public /* synthetic */ zacg(NonGmsServiceBrokerClient nonGmsServiceBrokerClient, IBinder iBinder) {
        this.zaa = nonGmsServiceBrokerClient;
        this.zab = iBinder;
    }

    public final void run() {
        NonGmsServiceBrokerClient nonGmsServiceBrokerClient = this.zaa;
        IBinder iBinder = this.zab;
        nonGmsServiceBrokerClient.zaa(iBinder);
    }
}

