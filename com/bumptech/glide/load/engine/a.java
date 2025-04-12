/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.ActiveResources$2;
import com.bumptech.glide.load.engine.a$a;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.g$a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a {
    public final Executor a;
    public final HashMap b;
    public final ReferenceQueue c;
    public g$a d;

    public a() {
        ExecutorService executorService;
        executorService = Executors.newSingleThreadExecutor((ThreadFactory)((Object)executorService));
        Object object = new HashMap();
        this.b = object;
        object = new ReferenceQueue();
        this.c = object;
        this.a = executorService;
        object = new ActiveResources$2(this);
        executorService.execute((Runnable)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(qn1_0 object, g object2) {
        synchronized (this) {
            ReferenceQueue referenceQueue = this.c;
            a$a a$a = new a$a((qn1_0)object, (g)object2, referenceQueue);
            object2 = this.b;
            object = ((HashMap)object2).put(object, a$a);
            object = (a$a)object;
            if (object != null) {
                object2 = null;
                ((a$a)object).c = null;
                ((Reference)object).clear();
            }
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(a$a object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    wk2_0 wk2_02;
                    Object object2 = this.b;
                    Object object3 = ((a$a)object).a;
                    ((HashMap)object2).remove(object3);
                    boolean bl2 = ((a$a)object).b;
                    if (bl2 && (wk2_02 = ((a$a)object).c) != null) {
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 4] lbl9 : MonitorExitStatement: MONITOREXIT : this
                        qn1_0 qn1_02 = ((a$a)object).a;
                        g$a g$a = this.d;
                        object3 = object2;
                        object2 = new g(wk2_02, true, false, qn1_02, g$a);
                        object3 = this.d;
                        object = ((a$a)object).a;
                        object3.a((qn1_0)object, (g)object2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

