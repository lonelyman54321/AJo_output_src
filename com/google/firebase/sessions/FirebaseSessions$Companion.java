/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.sessions.FirebaseSessions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FirebaseSessions$Companion {
    private FirebaseSessions$Companion() {
    }

    public /* synthetic */ FirebaseSessions$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final FirebaseSessions getInstance() {
        Object object = FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessions.class);
        Intrinsics.checkNotNullExpressionValue(object, "Firebase.app[FirebaseSessions::class.java]");
        return (FirebaseSessions)object;
    }
}

