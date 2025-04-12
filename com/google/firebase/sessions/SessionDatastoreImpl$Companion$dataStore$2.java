/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import androidx.datastore.core.CorruptionException;
import com.google.firebase.sessions.ProcessDetailsProvider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class SessionDatastoreImpl$Companion$dataStore$2
extends Lambda
implements Function1 {
    public static final SessionDatastoreImpl$Companion$dataStore$2 INSTANCE;

    static {
        SessionDatastoreImpl$Companion$dataStore$2 sessionDatastoreImpl$Companion$dataStore$2;
        INSTANCE = sessionDatastoreImpl$Companion$dataStore$2 = new SessionDatastoreImpl$Companion$dataStore$2();
    }

    public SessionDatastoreImpl$Companion$dataStore$2() {
        super(1);
    }

    public final my2_0 invoke(CorruptionException object) {
        Intrinsics.checkNotNullParameter(object, "ex");
        ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions();
        int n3 = 1;
        object = new kr1_1(n3 != 0, n3);
        return object;
    }
}

