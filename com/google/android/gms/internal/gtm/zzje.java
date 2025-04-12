/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import java.util.concurrent.ThreadFactory;

final class zzje
implements ThreadFactory {
    public final Thread newThread(Runnable runnable2) {
        Thread thread2 = new Thread(runnable2, "google-tag-manager-scheduler-thread");
        return thread2;
    }
}

