/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.Process
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceBinder$IntentHandler;
import com.google.firebase.messaging.WithinAppServiceConnection$BindRequest;
import com.google.firebase.messaging.o;
import java.util.concurrent.Executor;

class WithinAppServiceBinder
extends Binder {
    private final WithinAppServiceBinder$IntentHandler intentHandler;

    public WithinAppServiceBinder(WithinAppServiceBinder$IntentHandler withinAppServiceBinder$IntentHandler) {
        this.intentHandler = withinAppServiceBinder$IntentHandler;
    }

    public static /* synthetic */ void a(WithinAppServiceConnection$BindRequest bindRequest, Task task2) {
        bindRequest.finish();
    }

    public void send(WithinAppServiceConnection$BindRequest object) {
        int n3;
        int n4 = Binder.getCallingUid();
        if (n4 == (n3 = Process.myUid())) {
            Log.isLoggable((String)"FirebaseMessaging", (int)3);
            Object object2 = this.intentHandler;
            Object object3 = ((WithinAppServiceConnection$BindRequest)object).intent;
            object2 = object2.handle((Intent)object3);
            object3 = new Object();
            o o3 = new o((WithinAppServiceConnection$BindRequest)object);
            ((Task)object2).addOnCompleteListener((Executor)object3, (OnCompleteListener)o3);
            return;
        }
        object = new SecurityException("Binding only allowed within app");
        throw object;
    }
}

