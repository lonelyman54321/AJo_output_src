/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class LottieTask {
    public static final ExecutorService e;
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final Handler c;
    public volatile HC1 d;

    static {
        JC1 jC1 = new JC1();
        e = Executors.newCachedThreadPool(jC1);
    }

    public LottieTask() {
        throw null;
    }

    public LottieTask(QB1 qB1) {
        Object object;
        int n3 = 1;
        this.a = object = new LinkedHashSet(n3);
        this.b = object = new LinkedHashSet(n3);
        Looper looper = Looper.getMainLooper();
        this.c = object = new Handler(looper);
        this.d = null;
        super(qB1);
        this.f((HC1)object);
    }

    public LottieTask(Callable object, boolean bl2) {
        Object object2;
        int n3 = 1;
        this.a = object2 = new LinkedHashSet(n3);
        this.b = object2 = new LinkedHashSet(n3);
        Looper looper = Looper.getMainLooper();
        this.c = object2 = new Handler(looper);
        object2 = null;
        this.d = null;
        if (bl2) {
            object = object.call();
            object = (HC1)object;
            try {
                this.f((HC1)object);
            }
            catch (Throwable throwable) {
                HC1 hC1 = new HC1(throwable);
                this.f(hC1);
            }
        } else {
            ExecutorService executorService = e;
            super(object);
            object2.a = this;
            executorService.execute((Runnable)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(EC1 eC1) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                block3: {
                    try {
                        object = this.d;
                        if (object == null || (object = ((HC1)object).b) == null) break block3;
                        eC1.onResult(object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = this.b;
                object.add(eC1);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(EC1 eC1) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                block3: {
                    try {
                        object = this.d;
                        if (object == null || (object = ((HC1)object).a) == null) break block3;
                        eC1.onResult(object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = this.a;
                object.add(eC1);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Throwable throwable) {
        synchronized (this) {
            Throwable throwable22;
            block6: {
                boolean bl2;
                Iterator iterator;
                Object object;
                try {
                    object = this.b;
                    iterator = new Iterator(object);
                    bl2 = ((ArrayList)((Object)iterator)).isEmpty();
                    if (bl2) {
                        iterator = "Lottie encountered an error but no failure listener was added:";
                        rx1.c(iterator, throwable);
                        return;
                    }
                }
                catch (Throwable throwable22) {
                    break block6;
                }
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while (true) {
                    if (!(bl2 = iterator.hasNext())) {
                        return;
                    }
                    object = iterator.next();
                    object = (EC1)object;
                    object.onResult(throwable);
                }
            }
            throw throwable22;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        Object object = this.d;
        if (object == null) {
            return;
        }
        Object object2 = ((HC1)object).a;
        if (object2 == null) {
            object = ((HC1)object).b;
            this.c((Throwable)object);
            return;
        }
        synchronized (this) {
            try {
                boolean bl2;
                Object object3 = this.a;
                object = new ArrayList(object3);
                object = ((ArrayList)object).iterator();
                while (bl2 = object.hasNext()) {
                    object3 = object.next();
                    object3 = (EC1)object3;
                    object3.onResult(object2);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(EC1 eC1) {
        synchronized (this) {
            LinkedHashSet linkedHashSet = this.b;
            linkedHashSet.remove(eC1);
            return;
        }
    }

    public final void f(HC1 object) {
        HC1 hC1 = this.d;
        if (hC1 == null) {
            this.d = object;
            object = Looper.myLooper();
            if (object == (hC1 = Looper.getMainLooper())) {
                this.d();
            } else {
                int n3 = 1;
                object = new J41(this, n3);
                hC1 = this.c;
                hC1.post((Runnable)object);
            }
            return;
        }
        object = new IllegalStateException("A task may only be set once.");
        throw object;
    }
}

