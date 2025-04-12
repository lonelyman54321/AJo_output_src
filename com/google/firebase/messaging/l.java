/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.firebase.messaging.SharedPreferencesQueue;

public final class l
implements Runnable {
    public final /* synthetic */ SharedPreferencesQueue a;

    public /* synthetic */ l(SharedPreferencesQueue sharedPreferencesQueue) {
        this.a = sharedPreferencesQueue;
    }

    public final void run() {
        SharedPreferencesQueue.a(this.a);
    }
}

