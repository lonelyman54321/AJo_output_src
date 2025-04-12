/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import com.google.firebase.sessions.api.SessionSubscriber$SessionDetails;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $sessionId;
    int label;

    public SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(String string2, f80_0 f80_02) {
        this.$sessionId = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.$sessionId;
        object = new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(string2, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object iterator) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                iterator = new Iterator("call to 'resume' before 'invoke' with coroutine");
                throw iterator;
            }
            vl2_2.b(iterator);
        } else {
            vl2_2.b(iterator);
            iterator = FirebaseSessionsDependencies.INSTANCE;
            this.label = n4;
            iterator = ((FirebaseSessionsDependencies)((Object)iterator)).getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (iterator == j90_02) {
                return j90_02;
            }
        }
        iterator = ((Map)((Object)iterator)).values();
        String string2 = this.$sessionId;
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            SessionSubscriber sessionSubscriber = (SessionSubscriber)iterator.next();
            SessionSubscriber$SessionDetails sessionSubscriber$SessionDetails = new SessionSubscriber$SessionDetails(string2);
            sessionSubscriber.onSessionChanged(sessionSubscriber$SessionDetails);
            SessionSubscriber$Name sessionSubscriber$Name = sessionSubscriber.getSessionSubscriberName();
            Objects.toString((Object)sessionSubscriber$Name);
        }
        return Unit.a;
    }
}

