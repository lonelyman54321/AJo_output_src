/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.IBinder
 */
package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.ServiceLifecycleDispatcher;
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import kotlin.jvm.internal.Intrinsics;

public class LifecycleService
extends Service
implements mu1_1 {
    public final ServiceLifecycleDispatcher a;

    public LifecycleService() {
        ServiceLifecycleDispatcher serviceLifecycleDispatcher;
        this.a = serviceLifecycleDispatcher = new ServiceLifecycleDispatcher(this);
    }

    public final i getLifecycle() {
        return this.a.a;
    }

    public final IBinder onBind(Intent object) {
        Intrinsics.checkNotNullParameter(object, "intent");
        object = this.a;
        object.getClass();
        i$a i$a = i$a.ON_START;
        ((ServiceLifecycleDispatcher)object).a(i$a);
        return null;
    }

    public void onCreate() {
        ServiceLifecycleDispatcher serviceLifecycleDispatcher = this.a;
        serviceLifecycleDispatcher.getClass();
        i$a i$a = i$a.ON_CREATE;
        serviceLifecycleDispatcher.a(i$a);
        super.onCreate();
    }

    public void onDestroy() {
        ServiceLifecycleDispatcher serviceLifecycleDispatcher = this.a;
        serviceLifecycleDispatcher.getClass();
        i$a i$a = i$a.ON_STOP;
        serviceLifecycleDispatcher.a(i$a);
        i$a = i$a.ON_DESTROY;
        serviceLifecycleDispatcher.a(i$a);
        super.onDestroy();
    }

    public final void onStart(Intent intent, int n3) {
        ServiceLifecycleDispatcher serviceLifecycleDispatcher = this.a;
        serviceLifecycleDispatcher.getClass();
        i$a i$a = i$a.ON_START;
        serviceLifecycleDispatcher.a(i$a);
        super.onStart(intent, n3);
    }
}

