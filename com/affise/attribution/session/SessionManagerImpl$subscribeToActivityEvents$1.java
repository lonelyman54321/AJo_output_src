/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.session;

import com.affise.attribution.session.SessionManagerImpl;
import com.affise.attribution.utils.TimestampKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class SessionManagerImpl$subscribeToActivityEvents$1
extends Lambda
implements Function1 {
    final /* synthetic */ SessionManagerImpl this$0;

    public SessionManagerImpl$subscribeToActivityEvents$1(SessionManagerImpl sessionManagerImpl) {
        this.this$0 = sessionManagerImpl;
        super(1);
    }

    public final void invoke(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            SessionManagerImpl sessionManagerImpl = this.this$0;
            sessionManagerImpl.sessionStart();
        } else {
            SessionManagerImpl.access$checkSessionToStart(this.this$0);
            SessionManagerImpl sessionManagerImpl = this.this$0;
            l3 = TimestampKt.timestamp();
            Long l7 = l3;
            SessionManagerImpl.access$setCloseAppDateTime$p(sessionManagerImpl, l7);
            SessionManagerImpl.access$setOpenApp$p(this.this$0, false);
            SessionManagerImpl.access$setSessionActive$p(this.this$0, false);
            SessionManagerImpl.access$saveSessionTime(this.this$0);
            sessionManagerImpl = this.this$0;
            l7 = null;
            SessionManagerImpl.access$setOpenAppTime$p(sessionManagerImpl, null);
        }
    }
}

