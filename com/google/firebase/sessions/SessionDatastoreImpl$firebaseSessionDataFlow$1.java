/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import kotlin.Unit;

final class SessionDatastoreImpl$firebaseSessionDataFlow$1
extends qg3_2
implements gx0_2 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SessionDatastoreImpl$firebaseSessionDataFlow$1(f80_0 f80_02) {
        super(3, f80_02);
    }

    public final Object invoke(fs0_2 object, Throwable throwable, f80_0 f80_02) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(f80_02);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$0 = object;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$1 = throwable;
        object = Unit.a;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.invokeSuspend(object);
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
            object = (fs0_2)this.L$0;
            Object object2 = (Throwable)this.L$1;
            object2 = new kr1_1(n4 != 0, n4);
            this.L$0 = null;
            this.label = n4;
            object = object.emit(object2, this);
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

