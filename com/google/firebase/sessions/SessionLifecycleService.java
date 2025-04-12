/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Messenger
 */
package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.firebase.sessions.SessionLifecycleService$Companion;
import com.google.firebase.sessions.SessionLifecycleService$MessageHandler;
import kotlin.jvm.internal.Intrinsics;

public final class SessionLifecycleService
extends Service {
    public static final int BACKGROUNDED = 2;
    private static final int CLIENT_BOUND = 4;
    public static final String CLIENT_CALLBACK_MESSENGER = "ClientCallbackMessenger";
    public static final SessionLifecycleService$Companion Companion;
    public static final int FOREGROUNDED = 1;
    public static final int SESSION_UPDATED = 3;
    public static final String SESSION_UPDATE_EXTRA = "SessionUpdateExtra";
    public static final String TAG = "SessionLifecycleService";
    private final HandlerThread handlerThread;
    private SessionLifecycleService$MessageHandler messageHandler;
    private Messenger messenger;

    static {
        SessionLifecycleService$Companion sessionLifecycleService$Companion;
        Companion = sessionLifecycleService$Companion = new SessionLifecycleService$Companion(null);
    }

    public SessionLifecycleService() {
        HandlerThread handlerThread;
        this.handlerThread = handlerThread = new HandlerThread("FirebaseSessions_HandlerThread");
    }

    private final Messenger getClientCallback(Intent intent) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            intent = (Messenger)u03.a(intent);
        } else {
            String string2 = CLIENT_CALLBACK_MESSENGER;
            intent = (Messenger)intent.getParcelableExtra(string2);
        }
        return intent;
    }

    public final HandlerThread getHandlerThread$com_google_firebase_firebase_sessions() {
        return this.handlerThread;
    }

    public IBinder onBind(Intent object) {
        IBinder iBinder = null;
        if (object != null) {
            object.getAction();
            object = this.getClientCallback((Intent)object);
            if (object != null) {
                int n3 = 4;
                Message message = Message.obtain(null, (int)n3, (int)0, (int)0);
                message.replyTo = object;
                object = this.messageHandler;
                if (object != null) {
                    object.sendMessage(message);
                }
            }
            if ((object = this.messenger) != null) {
                iBinder = object.getBinder();
            }
        }
        return iBinder;
    }

    public void onCreate() {
        SessionLifecycleService$MessageHandler sessionLifecycleService$MessageHandler;
        super.onCreate();
        this.handlerThread.start();
        Object object = this.handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(object, "handlerThread.looper");
        this.messageHandler = sessionLifecycleService$MessageHandler = new SessionLifecycleService$MessageHandler((Looper)object);
        object = this.messageHandler;
        sessionLifecycleService$MessageHandler = new Messenger((Handler)object);
        this.messenger = sessionLifecycleService$MessageHandler;
    }

    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }
}

