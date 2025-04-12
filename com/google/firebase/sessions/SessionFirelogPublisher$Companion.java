/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.sessions.SessionFirelogPublisher;
import kotlin.jvm.internal.Intrinsics;

public final class SessionFirelogPublisher$Companion {
    static final /* synthetic */ SessionFirelogPublisher$Companion $$INSTANCE;

    static {
        SessionFirelogPublisher$Companion sessionFirelogPublisher$Companion;
        $$INSTANCE = sessionFirelogPublisher$Companion = new SessionFirelogPublisher$Companion();
    }

    private SessionFirelogPublisher$Companion() {
    }

    public final SessionFirelogPublisher getInstance() {
        Object object = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionFirelogPublisher.class);
        Intrinsics.checkNotNullExpressionValue(object, "Firebase.app[SessionFirelogPublisher::class.java]");
        return (SessionFirelogPublisher)object;
    }
}

