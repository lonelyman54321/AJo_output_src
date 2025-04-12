/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.sessions.SessionGenerator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SessionGenerator$Companion {
    private SessionGenerator$Companion() {
    }

    public /* synthetic */ SessionGenerator$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final SessionGenerator getInstance() {
        Object object = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionGenerator.class);
        Intrinsics.checkNotNullExpressionValue(object, "Firebase.app[SessionGenerator::class.java]");
        return (SessionGenerator)object;
    }
}

