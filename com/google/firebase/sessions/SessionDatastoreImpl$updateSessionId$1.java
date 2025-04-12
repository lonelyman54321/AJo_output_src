/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.SessionDatastoreImpl;
import com.google.firebase.sessions.SessionDatastoreImpl$Companion;
import com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class SessionDatastoreImpl$updateSessionId$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ SessionDatastoreImpl this$0;

    public SessionDatastoreImpl$updateSessionId$1(SessionDatastoreImpl sessionDatastoreImpl, String string2, f80_0 f80_02) {
        this.this$0 = sessionDatastoreImpl;
        this.$sessionId = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SessionDatastoreImpl sessionDatastoreImpl = this.this$0;
        String string2 = this.$sessionId;
        object = new SessionDatastoreImpl$updateSessionId$1(sessionDatastoreImpl, string2, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (SessionDatastoreImpl$updateSessionId$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SessionDatastoreImpl$updateSessionId$1)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        IOException iOException2;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            try {
                vl2_2.b(object);
                return Unit.a;
            }
            catch (IOException iOException2) {}
        } else {
            vl2_2.b(object);
            {
                object = SessionDatastoreImpl.access$getCompanion$p();
                Object object2 = this.this$0;
                object2 = SessionDatastoreImpl.access$getContext$p((SessionDatastoreImpl)object2);
                object = SessionDatastoreImpl$Companion.access$getDataStore((SessionDatastoreImpl$Companion)object, (Context)object2);
                String string2 = this.$sessionId;
                object2 = new SessionDatastoreImpl$updateSessionId$1$1(string2, null);
                this.label = n4;
                ny2_2 ny2_22 = new ny2_2((Function2)object2, null);
                object = object.a(ny2_22, this);
                if (object != j90_02) return Unit.a;
                return j90_02;
            }
        }
        ((Object)iOException2).toString();
        return Unit.a;
    }
}

