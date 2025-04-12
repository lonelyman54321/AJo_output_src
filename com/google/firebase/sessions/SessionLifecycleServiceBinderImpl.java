/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Messenger
 *  android.os.Parcelable
 *  android.os.Process
 *  android.util.Log
 */
package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.SessionLifecycleService;
import com.google.firebase.sessions.SessionLifecycleServiceBinder;
import com.google.firebase.sessions.SessionLifecycleServiceBinderImpl$Companion;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class SessionLifecycleServiceBinderImpl
implements SessionLifecycleServiceBinder {
    private static final SessionLifecycleServiceBinderImpl$Companion Companion;
    public static final String TAG = "LifecycleServiceBinder";
    private final FirebaseApp firebaseApp;

    static {
        SessionLifecycleServiceBinderImpl$Companion sessionLifecycleServiceBinderImpl$Companion;
        Companion = sessionLifecycleServiceBinderImpl$Companion = new SessionLifecycleServiceBinderImpl$Companion(null);
    }

    public SessionLifecycleServiceBinderImpl(FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        this.firebaseApp = firebaseApp;
    }

    private final Object unbindServiceSafely(Context object, ServiceConnection object2) {
        try {
            object.unbindService(object2);
            object = Unit.a;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object2 = TAG;
            String string2 = "Session lifecycle service binding failed.";
            int n3 = Log.w((String)object2, (String)string2, (Throwable)illegalArgumentException);
            object = n3;
        }
        return object;
    }

    public void bindToService(Messenger object, ServiceConnection serviceConnection2) {
        Intrinsics.checkNotNullParameter(object, "callback");
        Intrinsics.checkNotNullParameter(serviceConnection2, "serviceConnection");
        Context context = this.firebaseApp.getApplicationContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(context, SessionLifecycleService.class);
        int n3 = Process.myPid();
        String string2 = String.valueOf(n3);
        intent.setAction(string2);
        string2 = "ClientCallbackMessenger";
        intent.putExtra(string2, (Parcelable)object);
        object = context.getPackageName();
        intent.setPackage((String)object);
        int n4 = 65;
        try {
            n4 = (int)(context.bindService(intent, serviceConnection2, n4) ? 1 : 0);
        }
        catch (SecurityException securityException) {
            n4 = 0;
            object = null;
        }
        if (n4 == 0) {
            this.unbindServiceSafely(context, serviceConnection2);
        }
    }
}

