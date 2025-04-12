/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import java.util.concurrent.TimeUnit;

public final class Constants {
    public static final String FCM_WAKE_LOCK = "wake:com.google.firebase.messaging";
    public static final String IPC_BUNDLE_KEY_SEND_ERROR = "error";
    public static final String TAG = "FirebaseMessaging";
    public static final long WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = TimeUnit.MINUTES.toMillis(3);

    private Constants() {
    }
}

