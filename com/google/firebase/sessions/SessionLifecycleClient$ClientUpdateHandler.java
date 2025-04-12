/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.firebase.sessions;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class SessionLifecycleClient$ClientUpdateHandler
extends Handler {
    private final CoroutineContext backgroundDispatcher;

    public SessionLifecycleClient$ClientUpdateHandler(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "backgroundDispatcher");
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.backgroundDispatcher = coroutineContext;
    }

    private final void handleSessionUpdate(String string2) {
        c80 c802 = d.a(this.backgroundDispatcher);
        SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1 sessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1 = new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(string2, null);
        Ae3.d(c802, null, null, sessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1, 3);
    }

    public void handleMessage(Message object) {
        String string2 = "msg";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.what;
        int n4 = 3;
        if (n3 == n4) {
            if ((object = object.getData()) == null || (object = object.getString(string2 = "SessionUpdateExtra")) == null) {
                object = "";
            }
            this.handleSessionUpdate((String)object);
        } else {
            object.toString();
            super.handleMessage(object);
        }
    }
}

