/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i$a;
import androidx.lifecycle.o;
import kotlin.jvm.internal.Intrinsics;

public final class ServiceLifecycleDispatcher$DispatchRunnable
implements Runnable {
    public final o a;
    public final i$a b;
    public boolean c;

    public ServiceLifecycleDispatcher$DispatchRunnable(o o3, i$a i$a) {
        Intrinsics.checkNotNullParameter(o3, "registry");
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        this.a = o3;
        this.b = i$a;
    }

    public final void run() {
        boolean bl2 = this.c;
        if (!bl2) {
            o o3 = this.a;
            i$a i$a = this.b;
            o3.f(i$a);
            this.c = bl2 = true;
        }
    }
}

