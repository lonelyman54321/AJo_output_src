/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.SessionDatastoreImpl$FirebaseSessionDataKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class SessionDatastoreImpl$updateSessionId$1$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $sessionId;
    /* synthetic */ Object L$0;
    int label;

    public SessionDatastoreImpl$updateSessionId$1$1(String string2, f80_0 f80_02) {
        this.$sessionId = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.$sessionId;
        SessionDatastoreImpl$updateSessionId$1$1 sessionDatastoreImpl$updateSessionId$1$1 = new SessionDatastoreImpl$updateSessionId$1$1(string2, f80_02);
        sessionDatastoreImpl$updateSessionId$1$1.L$0 = object;
        return sessionDatastoreImpl$updateSessionId$1$1;
    }

    public final Object invoke(kr1_1 object, f80_0 object2) {
        object = (SessionDatastoreImpl$updateSessionId$1$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SessionDatastoreImpl$updateSessionId$1$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        if (n3 == 0) {
            vl2_2.b(object);
            object = (kr1_1)this.L$0;
            object2 = SessionDatastoreImpl$FirebaseSessionDataKeys.INSTANCE.getSESSION_ID();
            String string2 = this.$sessionId;
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, "key");
            ((kr1_1)object).d((my2$a)object2, string2);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

