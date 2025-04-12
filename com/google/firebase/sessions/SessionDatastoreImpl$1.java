/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.SessionDatastoreImpl;
import com.google.firebase.sessions.SessionDatastoreImpl$1$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class SessionDatastoreImpl$1
extends qg3_2
implements Function2 {
    int label;
    final /* synthetic */ SessionDatastoreImpl this$0;

    public SessionDatastoreImpl$1(SessionDatastoreImpl sessionDatastoreImpl, f80_0 f80_02) {
        this.this$0 = sessionDatastoreImpl;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SessionDatastoreImpl sessionDatastoreImpl = this.this$0;
        object = new SessionDatastoreImpl$1(sessionDatastoreImpl, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (SessionDatastoreImpl$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SessionDatastoreImpl$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = SessionDatastoreImpl.access$getFirebaseSessionDataFlow$p(this.this$0);
            SessionDatastoreImpl sessionDatastoreImpl = this.this$0;
            SessionDatastoreImpl$1$1 sessionDatastoreImpl$1$1 = new SessionDatastoreImpl$1$1(sessionDatastoreImpl);
            this.label = n4;
            object = object.collect(sessionDatastoreImpl$1$1, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

