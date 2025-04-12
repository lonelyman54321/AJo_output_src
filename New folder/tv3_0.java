/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from Tv3
 */
public final class tv3_0
extends et0_1 {
    public static final /* synthetic */ int l;
    public final ab3_2 b;
    public final AtomicReference c;
    public final boolean d;
    public volatile boolean e;
    public Throwable f;
    public final AtomicReference g;
    public volatile boolean h;
    public final Tv3$a i;
    public final AtomicLong j;
    public boolean k;

    public tv3_0(Runnable serializable) {
        x03_0.c(0, "capacityHint");
        AtomicReference<Runnable> atomicReference = new AtomicReference<Runnable>(0);
        this.b = atomicReference;
        this.c = atomicReference = new AtomicReference<Runnable>((Runnable)((Object)serializable));
        this.d = true;
        this.g = serializable = new Serializable();
        new AtomicBoolean();
        super(this);
        this.i = serializable;
        super();
        this.j = serializable;
    }

    public final void a(ef3_2 ef3_22) {
        boolean bl2 = this.e;
        if (!bl2 && !(bl2 = this.h)) {
            long l2 = Long.MAX_VALUE;
            ef3_22.request(l2);
        } else {
            ef3_22.cancel();
        }
    }

    public final void b(Object object) {
        Object object2 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources.";
        x03_0.b(object, (String)object2);
        boolean bl2 = this.e;
        if (!bl2 && !(bl2 = this.h)) {
            object2 = this.b;
            ((ab3_2)object2).offer(object);
            this.d();
        }
    }

    public final boolean c(boolean bl2, boolean bl3, boolean bl4, df3_2 df3_22, ab3_2 ab3_22) {
        boolean bl5 = this.h;
        boolean bl6 = true;
        if (bl5) {
            ab3_22.clear();
            this.g.lazySet(null);
            return bl6;
        }
        if (bl3) {
            Throwable throwable;
            if (bl2 && (throwable = this.f) != null) {
                ab3_22.clear();
                this.g.lazySet(null);
                throwable = this.f;
                df3_22.onError(throwable);
                return bl6;
            }
            if (bl4) {
                throwable = this.f;
                AtomicReference atomicReference = this.g;
                atomicReference.lazySet(null);
                if (throwable != null) {
                    df3_22.onError(throwable);
                } else {
                    df3_22.onComplete();
                }
                return bl6;
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void d() {
        tv3_0 tv3_02 = this;
        Object object = this.i;
        int n3 = ((AtomicInteger)object).getAndIncrement();
        if (n3 != 0) {
            return;
        }
        object = (df3_2)this.g.get();
        int n4 = 1;
        Object object2 = object;
        n3 = 1;
        while (true) {
            if (object2 != null) {
                n3 = (int)(tv3_02.k ? 1 : 0);
                if (n3 != 0) {
                    int n7;
                    Tv3$a tv3$a;
                    object = tv3_02.b;
                    boolean bl2 = tv3_02.d ^ n4;
                    do {
                        boolean bl3 = tv3_02.h;
                        n7 = 0;
                        Object var9_14 = null;
                        if (bl3) {
                            object = tv3_02.g;
                            ((AtomicReference)object).lazySet(null);
                            return;
                        } else {
                            Throwable throwable;
                            bl3 = tv3_02.e;
                            if (bl2 && bl3 && (throwable = tv3_02.f) != null) {
                                ((ab3_2)object).clear();
                                tv3_02.g.lazySet(null);
                                object = tv3_02.f;
                                object2.onError((Throwable)object);
                                return;
                            } else {
                                object2.b(null);
                                if (!bl3) continue;
                                tv3_02.g.lazySet(null);
                                object = tv3_02.f;
                                if (object != null) {
                                    object2.onError((Throwable)object);
                                    return;
                                } else {
                                    object2.onComplete();
                                }
                            }
                        }
                        return;
                    } while ((n4 = (tv3$a = tv3_02.i).addAndGet(n7 = -n4)) != 0);
                    return;
                }
                ab3_2 ab3_22 = tv3_02.b;
                n3 = (int)(tv3_02.d ? 1 : 0);
                boolean bl4 = n3 ^ 1;
                int n8 = 1;
                while (true) {
                    long l2;
                    long l3;
                    long l4;
                    Object object3;
                    long l7;
                    boolean bl5;
                    boolean bl6;
                    boolean bl7;
                    long l8;
                    long l12;
                    block23: {
                        object = tv3_02.j;
                        l12 = ((AtomicLong)object).get();
                        long l14 = 0L;
                        while ((l8 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1)) != false) {
                            boolean bl8;
                            bl7 = tv3_02.e;
                            Object object4 = ab3_22.poll();
                            if (object4 == null) {
                                bl8 = true;
                            } else {
                                n3 = 0;
                                object = null;
                                bl8 = false;
                            }
                            object = this;
                            bl6 = bl4;
                            bl5 = bl8;
                            l7 = l14;
                            object3 = object2;
                            n3 = (int)(this.c(bl4, bl7, bl8, (df3_2)object2, ab3_22) ? 1 : 0);
                            if (n3 != 0) return;
                            if (!bl8) {
                                object2.b(object4);
                                l4 = 1L;
                                l14 += l4;
                                n4 = 1;
                                continue;
                            }
                            break block23;
                        }
                        l7 = l14;
                    }
                    if (l8 == false) {
                        bl7 = tv3_02.e;
                        bl5 = ab3_22.isEmpty();
                        object = this;
                        bl6 = bl4;
                        object3 = object2;
                        n3 = (int)(this.c(bl4, bl7, bl5, (df3_2)object2, ab3_22) ? 1 : 0);
                        if (n3 != 0) return;
                    }
                    if ((bl7 = (l3 = l7 - (l4 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) && (bl7 = (l2 = l12 - (l4 = Long.MAX_VALUE)) == 0L ? 0 : (l2 < 0L ? -1 : 1))) {
                        object = tv3_02.j;
                        long l15 = -l7;
                        ((AtomicLong)object).addAndGet(l15);
                    }
                    if ((n8 = ((AtomicInteger)(object = tv3_02.i)).addAndGet((int)((bl6 = -n8) ? 1 : 0))) == 0) {
                        return;
                    }
                    n4 = 1;
                }
            }
            Tv3$a tv3$a = tv3_02.i;
            n3 = -n3;
            if ((n3 = tv3$a.addAndGet(n3)) == 0) {
                return;
            }
            Object v4 = tv3_02.g.get();
            object2 = v4;
            object2 = (df3_2)v4;
            n4 = 1;
        }
    }

    public final void onComplete() {
        boolean bl2 = this.e;
        if (!bl2 && !(bl2 = this.h)) {
            this.e = bl2 = true;
            Runnable runnable2 = this.c.getAndSet(null);
            if (runnable2 != null) {
                runnable2.run();
            }
            this.d();
        }
    }

    public final void onError(Throwable object) {
        String string2 = "onError called with null. Null values are generally not allowed in 2.x operators and sources.";
        x03_0.b(object, string2);
        boolean bl2 = this.e;
        if (!bl2 && !(bl2 = this.h)) {
            boolean bl3;
            this.f = object;
            this.e = bl3 = true;
            object = this.c;
            bl2 = false;
            string2 = null;
            if ((object = (Runnable)((AtomicReference)object).getAndSet(null)) != null) {
                object.run();
            }
            this.d();
            return;
        }
        dr2_2.b((Throwable)object);
    }
}

