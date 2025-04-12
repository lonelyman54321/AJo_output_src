/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from YY2
 */
public class yy2_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final xy2_2 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Class<yy2_2> clazz = yy2_2.class;
        Class<Object> clazz2 = Object.class;
        c = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "head$volatile");
        d = AtomicLongFieldUpdater.newUpdater(clazz, "deqIdx$volatile");
        e = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "tail$volatile");
        f = AtomicLongFieldUpdater.newUpdater(clazz, "enqIdx$volatile");
        g = AtomicIntegerFieldUpdater.newUpdater(clazz, "_availablePermits$volatile");
    }

    public yy2_2(int n3, int n4) {
        this.a = n3;
        if (n3 > 0) {
            if (n4 >= 0 && n4 <= n3) {
                xy2_2 xy2_22;
                cz2_1 cz2_12 = new cz2_1(0L, null, 2);
                this.head$volatile = cz2_12;
                this.tail$volatile = cz2_12;
                this._availablePermits$volatile = n3 -= n4;
                this.b = xy2_22 = new xy2_2(this);
                return;
            }
            String string2 = hj0_0.a(n3, "The number of acquired permits should be in 0..");
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        String string3 = hj0_0.a(n3, "Semaphore should have at least 1 permit, but had ");
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(ay$c ay$c) {
        Throwable throwable2;
        Object object;
        block11: {
            Object object2;
            Object object3;
            block10: {
                int n3;
                int n4;
                while ((n4 = ((AtomicIntegerFieldUpdater)(object3 = g)).getAndDecrement(this)) > (n3 = this.a)) {
                }
                if (n4 > 0) {
                    return Unit.a;
                }
                object = dl_2.a(zj1_2.b(ay$c));
                try {
                    int n7 = this.e((me3_2)object);
                    if (n7 != 0) break block10;
                    while (true) {
                        if ((n7 = ((AtomicIntegerFieldUpdater)object3).getAndDecrement(this)) > n3) {
                            continue;
                        }
                        if (n7 > 0) {
                            object3 = Unit.a;
                            object2 = this.b;
                            ((CancellableContinuationImpl)object).F(object3, (gx0_2)object2);
                            break;
                        }
                        String string2 = "null cannot be cast to non-null type kotlinx.coroutines.Waiter";
                        Intrinsics.checkNotNull(object, string2);
                        n7 = (int)(this.e((me3_2)object) ? 1 : 0);
                        if (n7 != 0) break;
                    }
                }
                catch (Throwable throwable2) {
                    break block11;
                }
            }
            if ((object3 = ((CancellableContinuationImpl)object).q()) == (object = j90_0.COROUTINE_SUSPENDED)) {
                object2 = "frame";
                Intrinsics.checkNotNullParameter(ay$c, (String)object2);
            }
            if (object3 != object) {
                object3 = Unit.a;
            }
            if (object3 == object) {
                return object3;
            }
            return Unit.a;
        }
        ((CancellableContinuationImpl)object).A();
        throw throwable2;
    }

    public final boolean e(me3_2 me3_22) {
        boolean bl2;
        gh3_2 gh3_22;
        boolean bl3;
        Object object;
        boolean bl4;
        yy2_2 yy2_22 = this;
        Object object2 = me3_22;
        Object object3 = e;
        Object object4 = (cz2_1)((AtomicReferenceFieldUpdater)object3).get(this);
        Object object5 = f;
        long l2 = ((AtomicLongFieldUpdater)object5).getAndIncrement(this);
        YY2$a yY2$a = YY2$a.a;
        int n3 = bz2_1.f;
        long l3 = n3;
        l3 = l2 / l3;
        block0: while (!(bl4 = zx2_2.b(object = c40_0.a((wx2_2)object4, l3, yY2$a)))) {
            wx2_2 wx2_22 = zx2_2.a(object);
            while (true) {
                Object v4;
                wx2_2 wx2_23 = (wx2_2)((AtomicReferenceFieldUpdater)object3).get(yy2_22);
                long l4 = wx2_23.c;
                long l7 = wx2_22.c;
                long l8 = l4 - l7;
                Object object6 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object6 >= 0) break block0;
                boolean bl5 = wx2_22.j();
                if (!bl5) continue block0;
                do {
                    if (!(bl5 = ((AtomicReferenceFieldUpdater)object3).compareAndSet(yy2_22, wx2_23, wx2_22))) continue;
                    bl3 = wx2_23.f();
                    if (!bl3) break block0;
                    wx2_23.e();
                    break block0;
                } while ((v4 = ((AtomicReferenceFieldUpdater)object3).get(yy2_22)) == wx2_23);
                boolean bl6 = wx2_22.f();
                if (!bl6) continue;
                wx2_22.e();
            }
        }
        object3 = (cz2_1)zx2_2.a(object);
        long l12 = bz2_1.f;
        int n4 = (int)(l2 %= l12);
        object5 = ((cz2_1)object3).e;
        do {
            gh3_22 = null;
            boolean bl7 = ((AtomicReferenceArray)object5).compareAndSet(n4, null, object2);
            bl2 = true;
            if (!bl7) continue;
            object2.a((wx2_2)object3, n4);
            return bl2;
        } while ((gh3_22 = (gh3_2)((AtomicReferenceArray)object5).get(n4)) == null);
        gh3_22 = bz2_1.b;
        gh3_2 gh3_23 = bz2_1.c;
        do {
            if (!(bl3 = ((AtomicReferenceArray)object5).compareAndSet(n4, gh3_22, gh3_23))) continue;
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            object2 = (bl_2)object2;
            object3 = Unit.a;
            object4 = yy2_22.b;
            object2.F(object3, (gx0_2)object4);
            return bl2;
        } while ((object3 = ((AtomicReferenceArray)object5).get(n4)) == gh3_22);
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void release() {
        Object object;
        int n3;
        Object object2;
        int n4;
        while ((n4 = ((AtomicIntegerFieldUpdater)(object2 = g)).getAndIncrement(this)) < (n3 = this.a)) {
            Object object3;
            block17: {
                block14: {
                    boolean bl2;
                    block16: {
                        block15: {
                            Object object4;
                            int n7;
                            if (n4 >= 0) {
                                return;
                            }
                            object2 = c;
                            object = (cz2_1)((AtomicReferenceFieldUpdater)object2).get(this);
                            object3 = d;
                            long l2 = ((AtomicLongFieldUpdater)object3).getAndIncrement(this);
                            int n8 = bz2_1.f;
                            long l3 = n8;
                            l3 = l2 / l3;
                            Object object5 = zy2_2.a;
                            block1: while ((n7 = zx2_2.b(object4 = c40_0.a((wx2_2)object, l3, (Function2)object5))) == 0) {
                                wx2_2 wx2_22 = zx2_2.a(object4);
                                while (true) {
                                    Object v4;
                                    wx2_2 wx2_23 = (wx2_2)((AtomicReferenceFieldUpdater)object2).get(this);
                                    long l4 = wx2_23.c;
                                    long l7 = wx2_22.c;
                                    long l8 = l4 - l7;
                                    Object object6 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                                    if (object6 >= 0) break block1;
                                    boolean bl3 = wx2_22.j();
                                    if (!bl3) continue block1;
                                    do {
                                        if (!(bl3 = ((AtomicReferenceFieldUpdater)object2).compareAndSet(this, wx2_23, wx2_22))) continue;
                                        bl2 = wx2_23.f();
                                        if (!bl2) break block1;
                                        wx2_23.e();
                                        break block1;
                                    } while ((v4 = ((AtomicReferenceFieldUpdater)object2).get(this)) == wx2_23);
                                    boolean bl4 = wx2_22.f();
                                    if (!bl4) continue;
                                    wx2_22.e();
                                }
                            }
                            object2 = (cz2_1)zx2_2.a(object4);
                            ((d40_0)object2).a();
                            long l12 = ((wx2_2)object2).c;
                            n4 = 0;
                            object = null;
                            n7 = l12 == l3 ? 0 : (l12 < l3 ? -1 : 1);
                            if (n7 > 0) break block14;
                            l3 = bz2_1.f;
                            int n10 = (int)(l2 %= l3);
                            object3 = bz2_1.b;
                            object2 = ((cz2_1)object2).e;
                            object3 = ((AtomicReferenceArray)object2).getAndSet(n10, object3);
                            n8 = 1;
                            if (object3 != null) break block15;
                            n3 = bz2_1.a;
                            gh3_2 gh3_22 = null;
                            for (int i3 = 0; i3 < n3; ++i3) {
                                object5 = ((AtomicReferenceArray)object2).get(n10);
                                if (object5 != (object4 = bz2_1.c)) continue;
                                return;
                            }
                            gh3_22 = bz2_1.b;
                            object5 = bz2_1.d;
                            do {
                                if ((n3 = (int)(((AtomicReferenceArray)object2).compareAndSet(n10, gh3_22, object5) ? 1 : 0)) == 0) continue;
                                n4 = 1;
                                break;
                            } while ((object3 = ((AtomicReferenceArray)object2).get(n10)) == gh3_22);
                            n4 ^= n8;
                            break block14;
                        }
                        object2 = bz2_1.e;
                        if (object3 == object2) break block14;
                        bl2 = object3 instanceof bl_2;
                        if (!bl2) break block16;
                        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                        object3 = (bl_2)object3;
                        object2 = Unit.a;
                        xy2_2 xy2_22 = this.b;
                        object2 = object3.v(object2, xy2_22);
                        if (object2 != null) {
                            object3.J(object2);
                            return;
                        }
                        break block14;
                    }
                    bl2 = object3 instanceof gx2_2;
                    if (!bl2) break block17;
                    object3 = (gx2_2)object3;
                    object2 = Unit.a;
                    n4 = (int)(object3.d(this, object2) ? 1 : 0);
                }
                if (n4 == 0) continue;
                return;
            }
            object = new StringBuilder("unexpected: ");
            ((StringBuilder)object).append(object3);
            object = ((StringBuilder)object).toString().toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        while ((n4 = ((AtomicIntegerFieldUpdater)object2).get(this)) > n3 && (n4 = (int)(((AtomicIntegerFieldUpdater)object2).compareAndSet(this, n4, n3) ? 1 : 0)) == 0) {
        }
        object = new StringBuilder("The number of released permits cannot be greater than ");
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString().toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

