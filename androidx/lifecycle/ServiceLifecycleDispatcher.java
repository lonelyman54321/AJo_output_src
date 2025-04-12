/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.ServiceLifecycleDispatcher$DispatchRunnable;
import androidx.lifecycle.i$a;
import androidx.lifecycle.o;
import kotlin.jvm.internal.Intrinsics;

public final class ServiceLifecycleDispatcher {
    public final o a;
    public final Handler b;
    public ServiceLifecycleDispatcher$DispatchRunnable c;

    public ServiceLifecycleDispatcher(mu1_1 mu1_12) {
        o o3;
        Intrinsics.checkNotNullParameter(mu1_12, "provider");
        this.a = o3 = new o(mu1_12);
        this.b = mu1_12;
    }

    public final void a(i$a i$a) {
        ServiceLifecycleDispatcher$DispatchRunnable serviceLifecycleDispatcher$DispatchRunnable = this.c;
        if (serviceLifecycleDispatcher$DispatchRunnable != null) {
            serviceLifecycleDispatcher$DispatchRunnable.run();
        }
        o o3 = this.a;
        this.c = serviceLifecycleDispatcher$DispatchRunnable = new ServiceLifecycleDispatcher$DispatchRunnable(o3, i$a);
        i$a = this.b;
        Intrinsics.checkNotNull(serviceLifecycleDispatcher$DispatchRunnable);
        i$a.postAtFrontOfQueue(serviceLifecycleDispatcher$DispatchRunnable);
    }
}

