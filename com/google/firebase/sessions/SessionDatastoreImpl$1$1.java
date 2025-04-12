/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.FirebaseSessionsData;
import com.google.firebase.sessions.SessionDatastoreImpl;
import kotlin.Unit;

final class SessionDatastoreImpl$1$1
implements fs0_2 {
    final /* synthetic */ SessionDatastoreImpl this$0;

    public SessionDatastoreImpl$1$1(SessionDatastoreImpl sessionDatastoreImpl) {
        this.this$0 = sessionDatastoreImpl;
    }

    public final Object emit(FirebaseSessionsData firebaseSessionsData, f80_0 f80_02) {
        SessionDatastoreImpl.access$getCurrentSessionFromDatastore$p(this.this$0).set(firebaseSessionsData);
        return Unit.a;
    }
}

