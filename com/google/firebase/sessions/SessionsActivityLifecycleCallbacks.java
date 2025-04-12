/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.firebase.sessions.SessionLifecycleClient;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class SessionsActivityLifecycleCallbacks
implements Application.ActivityLifecycleCallbacks {
    public static final SessionsActivityLifecycleCallbacks INSTANCE;
    private static boolean hasPendingForeground;
    private static SessionLifecycleClient lifecycleClient;

    static {
        SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks;
        INSTANCE = sessionsActivityLifecycleCallbacks = new SessionsActivityLifecycleCallbacks();
    }

    private SessionsActivityLifecycleCallbacks() {
    }

    public static /* synthetic */ void getHasPendingForeground$com_google_firebase_firebase_sessions$annotations() {
    }

    public final boolean getHasPendingForeground$com_google_firebase_firebase_sessions() {
        return hasPendingForeground;
    }

    public final SessionLifecycleClient getLifecycleClient() {
        return lifecycleClient;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivityPaused(Activity object) {
        String string2 = "activity";
        Intrinsics.checkNotNullParameter(object, string2);
        object = lifecycleClient;
        if (object != null) {
            ((SessionLifecycleClient)object).backgrounded();
        }
    }

    public void onActivityResumed(Activity object) {
        boolean bl2;
        String string2 = "activity";
        Intrinsics.checkNotNullParameter(object, string2);
        object = lifecycleClient;
        if (object != null) {
            ((SessionLifecycleClient)object).foregrounded();
            object = Unit.a;
        } else {
            bl2 = false;
            object = null;
        }
        if (object == null) {
            hasPendingForeground = bl2 = true;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void setHasPendingForeground$com_google_firebase_firebase_sessions(boolean bl2) {
        hasPendingForeground = bl2;
    }

    public final void setLifecycleClient(SessionLifecycleClient sessionLifecycleClient) {
        boolean bl2;
        lifecycleClient = sessionLifecycleClient;
        if (sessionLifecycleClient != null && (bl2 = hasPendingForeground)) {
            bl2 = false;
            hasPendingForeground = false;
            sessionLifecycleClient.foregrounded();
        }
    }
}

