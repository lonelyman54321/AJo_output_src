/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from Uv3
 */
public final class uv3_0
extends zf3_2 {
    public final ab3_2 a;
    public final AtomicReference b;
    public final AtomicReference c;
    public final boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public Throwable g;
    public final AtomicBoolean h;
    public final Uv3$a i;
    public boolean j;

    public uv3_0() {
        x03_0.c(0, "capacityHint");
        Serializable serializable = new Serializable(0);
        this.a = serializable;
        this.c = serializable = new Serializable();
        this.d = true;
        this.b = serializable = new Serializable();
        this.h = serializable;
        super(this);
        this.i = serializable;
    }

    public uv3_0(Runnable serializable) {
        x03_0.c(0, "capacityHint");
        AtomicReference<Runnable> atomicReference = new AtomicReference<Runnable>(0);
        this.a = atomicReference;
        x03_0.b(serializable, "onTerminate");
        this.c = atomicReference = new AtomicReference<Runnable>((Runnable)((Object)serializable));
        this.d = true;
        this.b = serializable = new Serializable();
        this.h = serializable;
        super(this);
        this.i = serializable;
    }

    public final void a(yr0_2 yr0_22) {
        boolean bl2 = this.f;
        if (bl2 || (bl2 = this.e)) {
            yr0_22.dispose();
        }
    }

    public final void b(Object object) {
        Object object2 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources.";
        x03_0.b(object, (String)object2);
        boolean bl2 = this.f;
        if (!bl2 && !(bl2 = this.e)) {
            object2 = this.a;
            ((ab3_2)object2).offer(object);
            this.i();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f(e62_0 e62_02) {
        String string2;
        Serializable serializable = this.h;
        boolean bl2 = ((AtomicBoolean)serializable).get();
        if (!bl2) {
            serializable = this.h;
            string2 = null;
            boolean bl3 = true;
            bl2 = ((AtomicBoolean)serializable).compareAndSet(false, bl3);
            if (bl2) {
                serializable = this.i;
                e62_02.a((yr0_2)((Object)serializable));
                serializable = this.b;
                ((AtomicReference)serializable).lazySet(e62_02);
                boolean bl4 = this.e;
                if (bl4) {
                    this.b.lazySet(null);
                    return;
                }
                this.i();
                return;
            }
        }
        string2 = "Only a single observer allowed.";
        serializable = new IllegalStateException(string2);
        iz0_2.error((Throwable)serializable, e62_02);
    }

    public final void h() {
        AtomicReference atomicReference = this.c;
        Runnable runnable2 = (Runnable)atomicReference.get();
        if (runnable2 != null) {
            Object var3_3;
            do {
                var3_3 = null;
                boolean bl2 = atomicReference.compareAndSet(runnable2, null);
                if (!bl2) continue;
                runnable2.run();
                break;
            } while ((var3_3 = atomicReference.get()) == runnable2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void i() {
        Object object = this.i;
        int n3 = ((AtomicInteger)object).getAndIncrement();
        if (n3 != 0) {
            return;
        }
        object = (e62_0)this.b.get();
        int n4 = 1;
        int n7 = 1;
        while (true) {
            block19: {
                if (object == null) break block19;
                n7 = this.j;
                if (n7 != 0) {
                    Uv3$a uv3$a;
                    ab3_2 ab3_22 = this.a;
                    boolean bl2 = this.d ^ n4;
                    do {
                        Throwable throwable;
                        boolean bl3;
                        if (bl3 = this.e) {
                            object = this.b;
                            ((AtomicReference)object).lazySet(null);
                            return;
                        }
                        bl3 = this.f;
                        if (bl2 && bl3 && (throwable = this.g) != null) {
                            AtomicReference atomicReference = this.b;
                            atomicReference.lazySet(null);
                            ab3_22.clear();
                            object.onError(throwable);
                            return;
                        }
                        object.b(null);
                        if (bl3) {
                            this.b.lazySet(null);
                            Throwable throwable2 = this.g;
                            if (throwable2 != null) {
                                object.onError(throwable2);
                                return;
                            } else {
                                object.onComplete();
                            }
                            return;
                        }
                        uv3$a = this.i;
                        n4 = -n4;
                    } while ((n4 = uv3$a.addAndGet(n4)) != 0);
                    return;
                }
                ab3_2 ab3_23 = this.a;
                boolean bl4 = this.d ^ true;
                n7 = 1;
                int n8 = 1;
                while (true) {
                    Object object2;
                    block20: {
                        boolean bl5;
                        if (bl5 = this.e) {
                            object = this.b;
                            ((AtomicReference)object).lazySet(null);
                            ab3_23.clear();
                            return;
                        }
                        bl5 = this.f;
                        object2 = this.a.poll();
                        boolean bl6 = object2 == null;
                        if (bl5) {
                            if (bl4 && n7 != 0) {
                                Throwable throwable = this.g;
                                if (throwable != null) {
                                    AtomicReference atomicReference = this.b;
                                    atomicReference.lazySet(null);
                                    ab3_23.clear();
                                    object.onError(throwable);
                                    return;
                                }
                                n7 = 0;
                                throwable = null;
                            }
                            if (bl6) {
                                this.b.lazySet(null);
                                Throwable throwable = this.g;
                                if (throwable != null) {
                                    object.onError(throwable);
                                    return;
                                } else {
                                    object.onComplete();
                                }
                                return;
                            }
                        }
                        if (bl6) {
                            Uv3$a uv3$a = this.i;
                            n8 = -n8;
                            if ((n8 = uv3$a.addAndGet(n8)) != 0) continue;
                        }
                        break block20;
                        return;
                    }
                    object.b(object2);
                }
            }
            object = this.i;
            n7 = -n7;
            if ((n7 = ((AtomicInteger)object).addAndGet(n7)) == 0) {
                return;
            }
            object = (e62_0)this.b.get();
        }
    }

    public final void onComplete() {
        boolean bl2 = this.f;
        if (!bl2 && !(bl2 = this.e)) {
            this.f = bl2 = true;
            this.h();
            this.i();
        }
    }

    public final void onError(Throwable throwable) {
        String string2 = "onError called with null. Null values are generally not allowed in 2.x operators and sources.";
        x03_0.b(throwable, string2);
        boolean bl2 = this.f;
        if (!bl2 && !(bl2 = this.e)) {
            this.g = throwable;
            this.f = true;
            this.h();
            this.i();
            return;
        }
        dr2_2.b(throwable);
    }
}

