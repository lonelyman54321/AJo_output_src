/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 */
package com.google.firebase.sessions;

import android.app.Application;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.FirebaseSessions$1;
import com.google.firebase.sessions.FirebaseSessions$Companion;
import com.google.firebase.sessions.SessionLifecycleServiceBinder;
import com.google.firebase.sessions.SessionsActivityLifecycleCallbacks;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class FirebaseSessions {
    public static final FirebaseSessions$Companion Companion;
    private static final String TAG = "FirebaseSessions";
    private final FirebaseApp firebaseApp;
    private final SessionsSettings settings;

    static {
        FirebaseSessions$Companion firebaseSessions$Companion;
        Companion = firebaseSessions$Companion = new FirebaseSessions$Companion(null);
    }

    public FirebaseSessions(FirebaseApp object, SessionsSettings object2, CoroutineContext coroutineContext, SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(object, "firebaseApp");
        Intrinsics.checkNotNullParameter(object2, "settings");
        Intrinsics.checkNotNullParameter(coroutineContext, "backgroundDispatcher");
        String string2 = "lifecycleServiceBinder";
        Intrinsics.checkNotNullParameter(sessionLifecycleServiceBinder, string2);
        this.firebaseApp = object;
        this.settings = object2;
        object = ((FirebaseApp)object).getApplicationContext().getApplicationContext();
        boolean bl2 = object instanceof Application;
        if (bl2) {
            object = (Application)object;
            object2 = SessionsActivityLifecycleCallbacks.INSTANCE;
            object.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object2);
            object = d.a(coroutineContext);
            string2 = null;
            object2 = new FirebaseSessions$1(this, coroutineContext, sessionLifecycleServiceBinder, null);
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
        } else {
            object = object.getClass();
            object.toString();
        }
    }

    public static final /* synthetic */ FirebaseApp access$getFirebaseApp$p(FirebaseSessions firebaseSessions) {
        return firebaseSessions.firebaseApp;
    }

    public static final /* synthetic */ SessionsSettings access$getSettings$p(FirebaseSessions firebaseSessions) {
        return firebaseSessions.settings;
    }
}

