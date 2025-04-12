/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.session;

import com.affise.attribution.internal.InternalEvent;
import com.affise.attribution.internal.predefined.SessionStartInternalEvent;
import com.affise.attribution.session.SessionManagerImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class SessionManagerImpl$sessionStart$1
extends Lambda
implements Function0 {
    final /* synthetic */ SessionManagerImpl this$0;

    public SessionManagerImpl$sessionStart$1(SessionManagerImpl sessionManagerImpl) {
        this.this$0 = sessionManagerImpl;
        super(0);
    }

    public final void invoke() {
        long l2;
        Object object = this.this$0;
        long l3 = SessionManagerImpl.access$sessionTime((SessionManagerImpl)object);
        long l4 = l3 - (l2 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            return;
        }
        long l7 = this.this$0.getSessionCount();
        long l8 = this.this$0.getLifetimeSessionTime();
        object = new SessionStartInternalEvent(l7, l8);
        ((InternalEvent)object).send();
    }
}

