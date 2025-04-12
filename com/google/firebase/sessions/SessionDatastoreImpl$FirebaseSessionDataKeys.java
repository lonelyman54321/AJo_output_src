/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;

final class SessionDatastoreImpl$FirebaseSessionDataKeys {
    public static final SessionDatastoreImpl$FirebaseSessionDataKeys INSTANCE;
    private static final my2$a SESSION_ID;

    static {
        Object object = new SessionDatastoreImpl$FirebaseSessionDataKeys();
        INSTANCE = object;
        String string2 = "session_id";
        Intrinsics.checkNotNullParameter(string2, "name");
        SESSION_ID = object = new my2$a(string2);
    }

    private SessionDatastoreImpl$FirebaseSessionDataKeys() {
    }

    public final my2$a getSESSION_ID() {
        return SESSION_ID;
    }
}

