/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.InstallationId$Companion;
import com.google.firebase.sessions.SessionDetails;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionEvents;
import com.google.firebase.sessions.SessionFirelogPublisherImpl;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class SessionFirelogPublisherImpl$logSession$1
extends qg3_2
implements Function2 {
    final /* synthetic */ SessionDetails $sessionDetails;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    public SessionFirelogPublisherImpl$logSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionDetails sessionDetails, f80_0 f80_02) {
        this.this$0 = sessionFirelogPublisherImpl;
        this.$sessionDetails = sessionDetails;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl = this.this$0;
        SessionDetails sessionDetails = this.$sessionDetails;
        object = new SessionFirelogPublisherImpl$logSession$1(sessionFirelogPublisherImpl, sessionDetails, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (SessionFirelogPublisherImpl$logSession$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SessionFirelogPublisherImpl$logSession$1)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        void var9_13;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        block7: {
            int n3;
            block8: {
                int n4;
                block9: {
                    int n7;
                    block3: {
                        block4: {
                            block5: {
                                block6: {
                                    object8 = j90_0.COROUTINE_SUSPENDED;
                                    int n8 = this.label;
                                    n3 = 3;
                                    n4 = 2;
                                    n7 = 1;
                                    if (n8 == 0) break block3;
                                    if (n8 == n7) break block4;
                                    if (n8 == n4) break block5;
                                    if (n8 != n3) break block6;
                                    object8 = (SessionsSettings)this.L$5;
                                    object7 = (SessionDetails)this.L$4;
                                    object6 = (FirebaseApp)this.L$3;
                                    SessionEvents sessionEvents = (SessionEvents)this.L$2;
                                    object5 = (SessionFirelogPublisherImpl)this.L$1;
                                    object4 = (InstallationId)this.L$0;
                                    vl2_2.b(object);
                                    object3 = object5;
                                    SessionEvents sessionEvents2 = sessionEvents;
                                    Object object9 = object8;
                                    object8 = sessionEvents2;
                                    FirebaseApp firebaseApp = object6;
                                    object6 = object7;
                                    object7 = firebaseApp;
                                    break block7;
                                }
                                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw object;
                            }
                            vl2_2.b(object);
                            break block8;
                        }
                        vl2_2.b(object);
                        break block9;
                    }
                    vl2_2.b(object);
                    object = this.this$0;
                    this.label = n7;
                    object = SessionFirelogPublisherImpl.access$shouldLogSession((SessionFirelogPublisherImpl)object, this);
                    if (object == object8) {
                        return object8;
                    }
                }
                object = (Boolean)object;
                boolean bl2 = (Boolean)object;
                if (!bl2) return Unit.a;
                object = InstallationId.Companion;
                object7 = SessionFirelogPublisherImpl.access$getFirebaseInstallations$p(this.this$0);
                this.label = n4;
                if ((object = ((InstallationId$Companion)object).create((FirebaseInstallationsApi)object7, this)) == object8) {
                    return object8;
                }
            }
            object4 = object;
            object4 = (InstallationId)object;
            object5 = this.this$0;
            SessionEvents sessionEvents = SessionEvents.INSTANCE;
            object = SessionFirelogPublisherImpl.access$getFirebaseApp$p((SessionFirelogPublisherImpl)object5);
            object7 = this.$sessionDetails;
            object2 = SessionFirelogPublisherImpl.access$getSessionSettings$p(this.this$0);
            object3 = FirebaseSessionsDependencies.INSTANCE;
            this.L$0 = object4;
            this.L$1 = object5;
            this.L$2 = sessionEvents;
            this.L$3 = object;
            this.L$4 = object7;
            this.L$5 = object2;
            this.label = n3;
            object6 = ((FirebaseSessionsDependencies)object3).getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (object6 == object8) {
                return object8;
            }
            object8 = sessionEvents;
            object3 = object5;
            Object object10 = object2;
            Object object11 = object7;
            object7 = object;
            object = object6;
            object6 = object11;
        }
        object5 = object;
        object5 = (Map)object;
        object = ((InstallationId)object4).getFid();
        object2 = ((InstallationId)object4).getAuthToken();
        object4 = object;
        object = ((SessionEvents)object8).buildSession((FirebaseApp)object7, (SessionDetails)object6, (SessionsSettings)var9_13, (Map)object5, (String)object, (String)object2);
        SessionFirelogPublisherImpl.access$attemptLoggingSessionEvent((SessionFirelogPublisherImpl)object3, (SessionEvent)object);
        return Unit.a;
    }
}

