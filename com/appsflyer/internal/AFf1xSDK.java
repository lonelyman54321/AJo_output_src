/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.util.TimerTask;

public final class AFf1xSDK
extends TimerTask {
    private final Thread getMediationNetwork;

    public AFf1xSDK(Thread thread2) {
        this.getMediationNetwork = thread2;
    }

    public final void run() {
        this.getMediationNetwork.interrupt();
    }
}

