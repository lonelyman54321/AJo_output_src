/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.concurrent.atomic.AtomicReference;

class RemoteConfigComponent$GlobalBackgroundListener
implements BackgroundDetector$BackgroundStateChangeListener {
    private static final AtomicReference INSTANCE;

    static {
        AtomicReference atomicReference;
        INSTANCE = atomicReference = new AtomicReference();
    }

    private RemoteConfigComponent$GlobalBackgroundListener() {
    }

    public static /* synthetic */ void access$000(Context context) {
        RemoteConfigComponent$GlobalBackgroundListener.ensureBackgroundListenerIsRegistered(context);
    }

    private static void ensureBackgroundListenerIsRegistered(Context object) {
        object = (Application)object.getApplicationContext();
        AtomicReference atomicReference = INSTANCE;
        Object object2 = atomicReference.get();
        if (object2 == null) {
            Object var3_3;
            object2 = new Object();
            do {
                var3_3 = null;
                boolean bl2 = atomicReference.compareAndSet(null, object2);
                if (!bl2) continue;
                BackgroundDetector.initialize((Application)object);
                object = BackgroundDetector.getInstance();
                ((BackgroundDetector)object).addListener((BackgroundDetector$BackgroundStateChangeListener)object2);
                break;
            } while ((var3_3 = atomicReference.get()) == null);
        }
    }

    public void onBackgroundStateChanged(boolean bl2) {
        RemoteConfigComponent.access$100(bl2);
    }
}

