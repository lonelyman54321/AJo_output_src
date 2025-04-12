/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.sessions.SessionDatastore;
import kotlin.jvm.internal.Intrinsics;

public final class SessionDatastore$Companion {
    static final /* synthetic */ SessionDatastore$Companion $$INSTANCE;

    static {
        SessionDatastore$Companion sessionDatastore$Companion;
        $$INSTANCE = sessionDatastore$Companion = new SessionDatastore$Companion();
    }

    private SessionDatastore$Companion() {
    }

    public final SessionDatastore getInstance() {
        Object object = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionDatastore.class);
        Intrinsics.checkNotNullExpressionValue(object, "Firebase.app[SessionDatastore::class.java]");
        return (SessionDatastore)object;
    }
}

