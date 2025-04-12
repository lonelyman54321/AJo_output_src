/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.observable;

import io.reactivex.Scheduler$Worker;

final class ObservableObserveOn$ObserveOnObserver
extends ww_2
implements e62_0,
Runnable {
    private static final long serialVersionUID = 6576896619930983584L;
    public final e62_0 a;
    public final Scheduler$Worker b;
    public final boolean c;
    public final int d;
    public b53_0 e;
    public yr0_2 f;
    public Throwable g;
    public volatile boolean h;
    public volatile boolean i;
    public int j;
    public boolean k;

    public ObservableObserveOn$ObserveOnObserver(e62_0 e62_02, Scheduler$Worker scheduler$Worker, boolean bl2, int n3) {
        this.a = e62_02;
        this.b = scheduler$Worker;
        this.c = bl2;
        this.d = n3;
    }

    public final void a(yr0_2 object) {
        yr0_2 yr0_22 = this.f;
        int n3 = gr0_2.validate(yr0_22, (yr0_2)object);
        if (n3 != 0) {
            this.f = object;
            n3 = object instanceof uc2_2;
            if (n3 != 0) {
                int n4;
                n3 = (object = (uc2_2)object).requestFusion(7);
                if (n3 == (n4 = 1)) {
                    this.j = n3;
                    this.e = object;
                    this.h = n4;
                    object = this.a;
                    object.a(this);
                    int n7 = this.getAndIncrement();
                    if (n7 == 0) {
                        object = this.b;
                        ((Scheduler$Worker)object).b(this);
                    }
                    return;
                }
                n4 = 2;
                if (n3 == n4) {
                    this.j = n3;
                    this.e = object;
                    this.a.a(this);
                    return;
                }
            }
            n3 = this.d;
            this.e = object = new ab3_2(n3);
            object = this.a;
            object.a(this);
        }
    }

    public final void b(Object object) {
        int n3;
        int n4 = this.h;
        if (n4 != 0) {
            return;
        }
        n4 = this.j;
        int n7 = 2;
        if (n4 != n7) {
            b53_0 b53_02 = this.e;
            b53_02.offer(object);
        }
        if ((n3 = this.getAndIncrement()) == 0) {
            object = this.b;
            ((Scheduler$Worker)object).b(this);
        }
    }

    public final boolean c(boolean bl2, boolean bl3, e62_0 e62_02) {
        boolean bl4 = this.i;
        boolean bl5 = true;
        if (bl4) {
            this.e.clear();
            return bl5;
        }
        if (bl2) {
            Throwable throwable = this.g;
            bl4 = this.c;
            if (bl4) {
                if (bl3) {
                    this.i = bl5;
                    if (throwable != null) {
                        e62_02.onError(throwable);
                    } else {
                        e62_02.onComplete();
                    }
                    this.b.dispose();
                    return bl5;
                }
            } else {
                if (throwable != null) {
                    this.i = bl5;
                    this.e.clear();
                    e62_02.onError(throwable);
                    this.b.dispose();
                    return bl5;
                }
                if (bl3) {
                    this.i = bl5;
                    e62_02.onComplete();
                    this.b.dispose();
                    return bl5;
                }
            }
        }
        return false;
    }

    public final void clear() {
        this.e.clear();
    }

    public final void dispose() {
        int n3 = this.i;
        if (n3 == 0) {
            this.i = true;
            this.f.dispose();
            Object object = this.b;
            object.dispose();
            n3 = this.k;
            if (n3 == 0 && (n3 = this.getAndIncrement()) == 0) {
                object = this.e;
                object.clear();
            }
        }
    }

    public final boolean isDisposed() {
        return this.i;
    }

    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    public final void onComplete() {
        int n3 = this.h;
        if (n3 != 0) {
            return;
        }
        this.h = true;
        n3 = this.getAndIncrement();
        if (n3 == 0) {
            Scheduler$Worker scheduler$Worker = this.b;
            scheduler$Worker.b(this);
        }
    }

    public final void onError(Throwable object) {
        boolean bl2 = this.h;
        if (bl2) {
            dr2_2.b((Throwable)object);
            return;
        }
        this.g = object;
        this.h = true;
        int n3 = this.getAndIncrement();
        if (n3 == 0) {
            object = this.b;
            ((Scheduler$Worker)object).b(this);
        }
    }

    public final Object poll() {
        return this.e.poll();
    }

    public final int requestFusion(int n3) {
        this.k = true;
        return 2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        boolean n3 = this.k;
        boolean bl2 = true;
        if (n3) {
            int n4;
            boolean bl4 = true;
            do {
                boolean bl3;
                if (bl3 = this.i) {
                    return;
                }
                bl3 = this.h;
                Object object = this.g;
                boolean bl5 = this.c;
                if (!bl5 && bl3 && object != null) {
                    this.i = bl2;
                    Object object2 = this.a;
                    Throwable yr0_22 = this.g;
                    object2.onError(yr0_22);
                    object2 = this.b;
                    object2.dispose();
                    return;
                }
                object = this.a;
                bl5 = false;
                object.b(null);
                if (bl3) {
                    this.i = bl2;
                    Object object3 = this.g;
                    if (object3 != null) {
                        e62_0 e62_02 = this.a;
                        e62_02.onError((Throwable)object3);
                    } else {
                        object3 = this.a;
                        object3.onComplete();
                    }
                    object3 = this.b;
                    object3.dispose();
                    return;
                }
                n4 = -n4;
            } while ((n4 = this.addAndGet(n4)) != 0);
            return;
        }
        Object object = this.e;
        e62_0 e62_03 = this.a;
        int n7 = 1;
        block3: while (true) {
            boolean bl6 = this.h;
            boolean bl7 = object.isEmpty();
            if (bl6 = this.c(bl6, bl7, e62_03)) {
                return;
            }
            while (true) {
                Object object4;
                block13: {
                    bl6 = this.h;
                    try {
                        object4 = object.poll();
                        boolean bl8 = object4 == null;
                        bl6 = this.c(bl6, bl8, e62_03);
                        if (bl6) {
                            return;
                        }
                        if (!bl8) break block13;
                    }
                    catch (Throwable throwable) {
                        mm0.h(throwable);
                        this.i = bl2;
                        yr0_2 yr0_22 = this.f;
                        yr0_22.dispose();
                        object.clear();
                        e62_03.onError(throwable);
                        object = this.b;
                        object.dispose();
                        return;
                    }
                    n7 = -n7;
                    if ((n7 = this.addAndGet(n7)) != 0) continue block3;
                    return;
                }
                e62_03.b(object4);
            }
            break;
        }
    }
}

