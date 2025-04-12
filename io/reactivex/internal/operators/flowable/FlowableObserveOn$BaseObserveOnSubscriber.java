/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.operators.flowable;

abstract class FlowableObserveOn$BaseObserveOnSubscriber
extends xw_2
implements df3_2,
Runnable {
    private static final long serialVersionUID = -8241002408341274697L;
    public ef3_2 a;
    public b53_0 b;
    public volatile boolean c;
    public volatile boolean d;
    public int e;
    public long f;
    public boolean g;

    public final void b(Object object) {
        int n3 = this.d;
        if (n3 != 0) {
            return;
        }
        n3 = this.e;
        int n4 = 2;
        if (n3 == n4) {
            int n7 = this.getAndIncrement();
            if (n7 != 0) {
                return;
            }
            throw null;
        }
        Object object2 = this.b;
        int n8 = object2.offer(object);
        if (n8 == 0) {
            this.a.cancel();
            object2 = "Queue is full?!";
            object = new RuntimeException((String)object2);
            n8 = 1;
            this.d = n8;
        }
        if ((n8 = this.getAndIncrement()) != 0) {
            return;
        }
        throw null;
    }

    public abstract void c();

    public final void cancel() {
        boolean bl2 = this.c;
        if (bl2) {
            return;
        }
        this.c = true;
        this.a.cancel();
        throw null;
    }

    public final void clear() {
        this.b.clear();
    }

    public abstract void d();

    public abstract void e();

    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    public final void onComplete() {
        int n3 = this.d;
        if (n3 == 0) {
            this.d = true;
            n3 = this.getAndIncrement();
            if (n3 == 0) {
                throw null;
            }
        }
    }

    public final void onError(Throwable throwable) {
        boolean bl2 = this.d;
        if (bl2) {
            dr2_2.b(throwable);
            return;
        }
        this.d = true;
        int n3 = this.getAndIncrement();
        if (n3 != 0) {
            return;
        }
        throw null;
    }

    public final void request(long l2) {
        boolean bl2 = gf3_2.validate(l2);
        if (!bl2) {
            return;
        }
        bu_2.a(null, l2);
        throw null;
    }

    public final int requestFusion(int n3) {
        this.g = true;
        return 2;
    }

    public final void run() {
        int n3 = this.g;
        if (n3 != 0) {
            this.d();
            return;
        }
        n3 = this.e;
        int n4 = 1;
        if (n3 == n4) {
            this.e();
            throw null;
        }
        this.c();
        throw null;
    }
}

