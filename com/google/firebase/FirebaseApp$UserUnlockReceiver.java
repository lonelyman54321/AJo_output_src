/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.atomic.AtomicReference;

class FirebaseApp$UserUnlockReceiver
extends BroadcastReceiver {
    private static AtomicReference INSTANCE;
    private final Context applicationContext;

    static {
        AtomicReference atomicReference;
        INSTANCE = atomicReference = new AtomicReference();
    }

    public FirebaseApp$UserUnlockReceiver(Context context) {
        this.applicationContext = context;
    }

    public static /* synthetic */ void access$100(Context context) {
        FirebaseApp$UserUnlockReceiver.ensureReceiverRegistered(context);
    }

    private static void ensureReceiverRegistered(Context context) {
        Object object = INSTANCE.get();
        if (object == null) {
            String string2;
            object = new Object(context);
            AtomicReference atomicReference = INSTANCE;
            do {
                string2 = null;
                boolean bl2 = atomicReference.compareAndSet(null, object);
                if (!bl2) continue;
                string2 = "android.intent.action.USER_UNLOCKED";
                atomicReference = new IntentFilter(string2);
                context.registerReceiver(object, (IntentFilter)atomicReference);
                break;
            } while ((string2 = (String)atomicReference.get()) == null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onReceive(Context object, Intent object2) {
        object = FirebaseApp.access$200();
        synchronized (object) {
            try {
                object2 = FirebaseApp.INSTANCES;
                object2 = object2.values();
                object2 = object2.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object2.hasNext())) {
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 4, 5] lbl9 : MonitorExitStatement: MONITOREXIT : var1_1 /* !! */ 
                        this.unregister();
                        return;
                    }
                    Object object3 = object2.next();
                    object3 = (FirebaseApp)object3;
                    FirebaseApp.access$300(object3);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void unregister() {
        this.applicationContext.unregisterReceiver((BroadcastReceiver)this);
    }
}

