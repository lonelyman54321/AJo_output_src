/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

class FirebaseInstallations$1
implements ThreadFactory {
    private final AtomicInteger mCount;

    public FirebaseInstallations$1() {
        AtomicInteger atomicInteger;
        this.mCount = atomicInteger = new AtomicInteger(1);
    }

    public Thread newThread(Runnable runnable2) {
        Object object = this.mCount.getAndIncrement();
        Object[] objectArray = new Object[]{object};
        object = String.format("firebase-installations-executor-%d", objectArray);
        Thread thread2 = new Thread(runnable2, (String)object);
        return thread2;
    }
}

