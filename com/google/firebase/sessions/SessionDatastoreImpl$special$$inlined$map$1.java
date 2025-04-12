/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.SessionDatastoreImpl;
import com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2;
import kotlin.Unit;

public final class SessionDatastoreImpl$special$$inlined$map$1
implements es0_2 {
    final /* synthetic */ es0_2 $this_unsafeTransform$inlined;
    final /* synthetic */ SessionDatastoreImpl this$0;

    public SessionDatastoreImpl$special$$inlined$map$1(es0_2 es0_22, SessionDatastoreImpl sessionDatastoreImpl) {
        this.$this_unsafeTransform$inlined = es0_22;
        this.this$0 = sessionDatastoreImpl;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        es0_2 es0_22 = this.$this_unsafeTransform$inlined;
        SessionDatastoreImpl sessionDatastoreImpl = this.this$0;
        SessionDatastoreImpl$special$$inlined$map$1$2 sessionDatastoreImpl$special$$inlined$map$1$2 = new SessionDatastoreImpl$special$$inlined$map$1$2((fs0_2)object, sessionDatastoreImpl);
        if ((object = es0_22.collect(sessionDatastoreImpl$special$$inlined$map$1$2, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

