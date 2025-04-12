/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;
import java.util.concurrent.atomic.AtomicInteger;

final class s
extends p {
    final /* synthetic */ TaskCompletionSource a;
    final /* synthetic */ p b;
    final /* synthetic */ z c;

    public s(z z5, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, p p2) {
        this.a = taskCompletionSource2;
        this.b = p2;
        this.c = z5;
        super(taskCompletionSource);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = z.g(this.c);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                Object object3;
                block3: {
                    try {
                        object3 = this.c;
                        object2 = this.a;
                        z.o((z)object3, (TaskCompletionSource)object2);
                        object3 = this.c;
                        object3 = z.i((z)object3);
                        int n3 = ((AtomicInteger)object3).getAndIncrement();
                        if (n3 <= 0) break block3;
                        object3 = this.c;
                        object3 = z.f((z)object3);
                        object2 = "Already connected to the service.";
                        Object[] objectArray = null;
                        objectArray = new Object[]{};
                        ((o)object3).d((String)object2, objectArray);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object3 = this.c;
                object2 = this.b;
                z.q((z)object3, (p)object2);
                return;
            }
            throw throwable2;
        }
    }
}

