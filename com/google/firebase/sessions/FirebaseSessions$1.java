/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.SessionLifecycleClient;
import com.google.firebase.sessions.SessionLifecycleServiceBinder;
import com.google.firebase.sessions.SessionsActivityLifecycleCallbacks;
import com.google.firebase.sessions.a;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Collection;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

final class FirebaseSessions$1
extends qg3_2
implements Function2 {
    final /* synthetic */ CoroutineContext $backgroundDispatcher;
    final /* synthetic */ SessionLifecycleServiceBinder $lifecycleServiceBinder;
    int label;
    final /* synthetic */ FirebaseSessions this$0;

    public FirebaseSessions$1(FirebaseSessions firebaseSessions, CoroutineContext coroutineContext, SessionLifecycleServiceBinder sessionLifecycleServiceBinder, f80_0 f80_02) {
        this.this$0 = firebaseSessions;
        this.$backgroundDispatcher = coroutineContext;
        this.$lifecycleServiceBinder = sessionLifecycleServiceBinder;
        super(2, f80_02);
    }

    public static /* synthetic */ void c(String string2, FirebaseOptions firebaseOptions) {
        FirebaseSessions$1.invokeSuspend$lambda$1(string2, firebaseOptions);
    }

    private static final void invokeSuspend$lambda$1(String string2, FirebaseOptions firebaseOptions) {
        SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient(null);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        FirebaseSessions firebaseSessions = this.this$0;
        CoroutineContext coroutineContext = this.$backgroundDispatcher;
        SessionLifecycleServiceBinder sessionLifecycleServiceBinder = this.$lifecycleServiceBinder;
        object = new FirebaseSessions$1(firebaseSessions, coroutineContext, sessionLifecycleServiceBinder, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (FirebaseSessions$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((FirebaseSessions$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        block9: {
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block10: {
                int n7;
                block7: {
                    block8: {
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        n4 = this.label;
                        n3 = 2;
                        n7 = 1;
                        if (n4 == 0) break block7;
                        if (n4 == n7) break block8;
                        if (n4 != n3) {
                            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw object;
                        }
                        vl2_2.b(object);
                        break block9;
                    }
                    vl2_2.b(object);
                    break block10;
                }
                vl2_2.b(object);
                object = FirebaseSessionsDependencies.INSTANCE;
                this.label = n7;
                object = ((FirebaseSessionsDependencies)object).getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = ((Map)object).values();
            n4 = object instanceof Collection;
            if (n4 != 0) {
                object2 = object;
                object2 = (Collection)object;
                n4 = (int)(object2.isEmpty() ? 1 : 0);
                if (n4 != 0) {
                    return Unit.a;
                }
            }
            object = ((Iterable)object).iterator();
            do {
                if ((n4 = (int)(object.hasNext() ? 1 : 0)) == 0) return Unit.a;
            } while ((n4 = (int)((object2 = (SessionSubscriber)object.next()).isDataCollectionEnabled() ? 1 : 0)) == 0);
            object = FirebaseSessions.access$getSettings$p(this.this$0);
            this.label = n3;
            if ((object = ((SessionsSettings)object).updateSettings(this)) == j90_02) {
                return j90_02;
            }
        }
        object = FirebaseSessions.access$getSettings$p(this.this$0);
        boolean bl2 = ((SessionsSettings)object).getSessionsEnabled();
        if (!bl2) {
            return Unit.a;
        }
        CoroutineContext coroutineContext = this.$backgroundDispatcher;
        object = new SessionLifecycleClient(coroutineContext);
        SessionLifecycleServiceBinder sessionLifecycleServiceBinder = this.$lifecycleServiceBinder;
        ((SessionLifecycleClient)object).bindToService(sessionLifecycleServiceBinder);
        SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient((SessionLifecycleClient)object);
        object = FirebaseSessions.access$getFirebaseApp$p(this.this$0);
        a a2 = new Object();
        ((FirebaseApp)object).addLifecycleEventListener(a2);
        return Unit.a;
    }
}

