/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

/*
 * Renamed from yw1
 */
public class yw1_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Class<yw1_2> clazz = yw1_2.class;
        Class<Object> clazz2 = Object.class;
        a = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_next$volatile");
        b = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_prev$volatile");
        c = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_removedRef$volatile");
    }

    public yw1_2() {
        this._next$volatile = this;
        this._prev$volatile = this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean c(yw1_2 yw1_22, int n3) {
        while (true) {
            Object v4;
            boolean bl2;
            yw1_2 yw1_23 = this.d();
            Object object = b;
            if (yw1_23 == null) {
                yw1_23 = (yw1_2)((AtomicReferenceFieldUpdater)object).get(this);
                while (bl2 = yw1_23.g()) {
                    yw1_23 = (yw1_2)((AtomicReferenceFieldUpdater)object).get(yw1_23);
                }
            }
            bl2 = yw1_23 instanceof yu1_2;
            boolean bl3 = true;
            if (bl2) {
                object = yw1_23;
                object = (yu1_2)yw1_23;
                int n4 = ((yu1_2)object).d & n3;
                if (n4 != 0) return false;
                boolean bl4 = yw1_23.c(yw1_22, n3);
                if (!bl4) return false;
                return bl3;
            }
            ((AtomicReferenceFieldUpdater)object).set(yw1_22, yw1_23);
            object = a;
            ((AtomicReferenceFieldUpdater)object).set(yw1_22, this);
            do {
                if (!(bl2 = ((AtomicReferenceFieldUpdater)object).compareAndSet(yw1_23, this, yw1_22))) continue;
                yw1_22.e(this);
                return bl3;
            } while ((v4 = ((AtomicReferenceFieldUpdater)object).get(yw1_23)) == this);
        }
    }

    public final yw1_2 d() {
        block0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            yw1_2 yw1_22 = (yw1_2)atomicReferenceFieldUpdater.get(this);
            boolean bl2 = false;
            Object var4_4 = null;
            yw1_2 yw1_23 = yw1_22;
            block1: while (true) {
                yw1_2 yw1_24 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
                    Object object;
                    if ((object = (atomicReferenceFieldUpdater2 = a).get(yw1_23)) == this) {
                        if (yw1_22 == yw1_23) {
                            return yw1_23;
                        }
                        do {
                            if (!(bl2 = atomicReferenceFieldUpdater.compareAndSet(this, yw1_22, yw1_23))) continue;
                            return yw1_23;
                        } while ((var4_4 = atomicReferenceFieldUpdater.get(this)) == yw1_22);
                        continue block0;
                    }
                    boolean bl3 = this.g();
                    if (bl3) {
                        return null;
                    }
                    bl3 = object instanceof ri2_2;
                    if (bl3) {
                        if (yw1_24 != null) {
                            Object v4;
                            object = ((ri2_2)object).a;
                            do {
                                if (!(bl3 = atomicReferenceFieldUpdater2.compareAndSet(yw1_24, yw1_23, object))) continue;
                                yw1_23 = yw1_24;
                                continue block1;
                            } while ((v4 = atomicReferenceFieldUpdater2.get(yw1_24)) == yw1_23);
                            continue block0;
                        }
                        yw1_23 = (yw1_2)atomicReferenceFieldUpdater.get(yw1_23);
                        continue;
                    }
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    yw1_24 = (yw1_2)object;
                    yw1_2 yw1_25 = (yw1_2)object;
                    yw1_24 = yw1_23;
                    yw1_23 = yw1_25;
                }
                break;
            }
            break;
        }
    }

    public final void e(yw1_2 yw1_22) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            yw1_2 yw1_23 = (yw1_2)atomicReferenceFieldUpdater.get(yw1_22);
            Object v4 = a.get(this);
            if (v4 != yw1_22) {
                return;
            }
            do {
                boolean bl2;
                if (!(bl2 = atomicReferenceFieldUpdater.compareAndSet(yw1_22, yw1_23, this))) continue;
                boolean bl3 = this.g();
                if (bl3) {
                    yw1_22.d();
                }
                return;
            } while ((v4 = atomicReferenceFieldUpdater.get(yw1_22)) == yw1_23);
        }
    }

    public final yw1_2 f() {
        Object object;
        Object v4 = a.get(this);
        boolean bl2 = v4 instanceof ri2_2;
        if (bl2) {
            object = v4;
            object = (ri2_2)v4;
        } else {
            bl2 = false;
            object = null;
        }
        if (object == null || (object = ((ri2_2)object).a) == null) {
            Intrinsics.checkNotNull(v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            object = v4;
            object = (yw1_2)v4;
        }
        return object;
    }

    public boolean g() {
        return a.get(this) instanceof ri2_2;
    }

    public String toString() {
        yw1$a yw1$a;
        StringBuilder stringBuilder = new StringBuilder();
        Object object = yw1$a;
        yw1$a = new PropertyReference0Impl((Object)this, si0_2.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        stringBuilder.append(yw1$a);
        stringBuilder.append('@');
        object = si0_2.d(this);
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

