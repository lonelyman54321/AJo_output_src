/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.firebase.messaging;

import android.content.Intent;
import com.google.firebase.messaging.FcmLifecycleCallbacks;

public final class a
implements Runnable {
    public final /* synthetic */ FcmLifecycleCallbacks a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ a(FcmLifecycleCallbacks fcmLifecycleCallbacks, Intent intent) {
        this.a = fcmLifecycleCallbacks;
        this.b = intent;
    }

    public final void run() {
        FcmLifecycleCallbacks fcmLifecycleCallbacks = this.a;
        Intent intent = this.b;
        FcmLifecycleCallbacks.a(fcmLifecycleCallbacks, intent);
    }
}

