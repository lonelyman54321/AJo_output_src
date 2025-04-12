/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.FirebaseSessionsData;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import com.google.firebase.sessions.SessionDatastore;
import com.google.firebase.sessions.SessionDatastoreImpl$1;
import com.google.firebase.sessions.SessionDatastoreImpl$Companion;
import com.google.firebase.sessions.SessionDatastoreImpl$Companion$dataStore$2;
import com.google.firebase.sessions.SessionDatastoreImpl$FirebaseSessionDataKeys;
import com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class SessionDatastoreImpl
implements SessionDatastore {
    private static final SessionDatastoreImpl$Companion Companion;
    private static final String TAG = "FirebaseSessionsRepo";
    private static final be2_2 dataStore$delegate;
    private final CoroutineContext backgroundDispatcher;
    private final Context context;
    private final AtomicReference currentSessionFromDatastore;
    private final es0_2 firebaseSessionDataFlow;

    static {
        Object object = new SessionDatastoreImpl$Companion(null);
        Companion = object;
        object = SessionDataStoreConfigs.INSTANCE.getSESSIONS_CONFIG_NAME();
        SessionDatastoreImpl$Companion$dataStore$2 sessionDatastoreImpl$Companion$dataStore$2 = SessionDatastoreImpl$Companion$dataStore$2.INSTANCE;
        cj2_0 cj2_02 = new cj2_0(sessionDatastoreImpl$Companion$dataStore$2);
        dataStore$delegate = dy2.a((String)object, cj2_02);
    }

    public SessionDatastoreImpl(Context object, CoroutineContext object2) {
        Serializable serializable;
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "backgroundDispatcher");
        this.context = object;
        this.backgroundDispatcher = object2;
        this.currentSessionFromDatastore = serializable = new Serializable();
        object = SessionDatastoreImpl$Companion.access$getDataStore(Companion, object).getData();
        super(null);
        at0_1 at0_12 = new at0_1((es0_2)object, (gx0_2)((Object)serializable));
        super(at0_12, this);
        this.firebaseSessionDataFlow = object;
        object = d.a((CoroutineContext)object2);
        object2 = new SessionDatastoreImpl$1(this, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
    }

    public static final /* synthetic */ SessionDatastoreImpl$Companion access$getCompanion$p() {
        return Companion;
    }

    public static final /* synthetic */ Context access$getContext$p(SessionDatastoreImpl sessionDatastoreImpl) {
        return sessionDatastoreImpl.context;
    }

    public static final /* synthetic */ AtomicReference access$getCurrentSessionFromDatastore$p(SessionDatastoreImpl sessionDatastoreImpl) {
        return sessionDatastoreImpl.currentSessionFromDatastore;
    }

    public static final /* synthetic */ be2_2 access$getDataStore$delegate$cp() {
        return dataStore$delegate;
    }

    public static final /* synthetic */ es0_2 access$getFirebaseSessionDataFlow$p(SessionDatastoreImpl sessionDatastoreImpl) {
        return sessionDatastoreImpl.firebaseSessionDataFlow;
    }

    public static final /* synthetic */ FirebaseSessionsData access$mapSessionsData(SessionDatastoreImpl sessionDatastoreImpl, my2_0 my2_02) {
        return sessionDatastoreImpl.mapSessionsData(my2_02);
    }

    private final FirebaseSessionsData mapSessionsData(my2_0 object) {
        my2$a my2$a = SessionDatastoreImpl$FirebaseSessionDataKeys.INSTANCE.getSESSION_ID();
        object = (String)((my2_0)object).b(my2$a);
        FirebaseSessionsData firebaseSessionsData = new FirebaseSessionsData((String)object);
        return firebaseSessionsData;
    }

    public String getCurrentSessionId() {
        Object object = (FirebaseSessionsData)this.currentSessionFromDatastore.get();
        object = object != null ? ((FirebaseSessionsData)object).getSessionId() : null;
        return object;
    }

    public void updateSessionId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "sessionId");
        c80 c802 = d.a(this.backgroundDispatcher);
        SessionDatastoreImpl$updateSessionId$1 sessionDatastoreImpl$updateSessionId$1 = new SessionDatastoreImpl$updateSessionId$1(this, string2, null);
        Ae3.d(c802, null, null, sessionDatastoreImpl$updateSessionId$1, 3);
    }
}

