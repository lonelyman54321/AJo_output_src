/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from zw1
 */
public class zw1_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    volatile /* synthetic */ Object _next;
    volatile /* synthetic */ Object _prev;
    private volatile /* synthetic */ Object removedRef;

    static {
        Class<zw1_2> clazz = zw1_2.class;
        Class<Object> clazz2 = Object.class;
        a = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_next");
        b = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_prev");
        c = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "removedRef");
    }

    public zw1_2() {
        this._next = this;
        this._prev = this;
        this.removedRef = null;
    }

    public final Object b() {
        Object object;
        boolean bl2;
        while (bl2 = (object = this._next) instanceof e92_0) {
            object = (e92_0)object;
            ((e92_0)object).a();
        }
        return object;
    }

    public final zw1_2 c() {
        Object object;
        boolean bl2;
        while (!(bl2 = (object = this._prev) instanceof si2_2)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            si2_2 si2_22;
            Object object2;
            if (object == this) {
                boolean bl3;
                object2 = this;
                while (!(bl3 = object2 instanceof ww1_2)) {
                    if ((object2 = xw1_2.a(((zw1_2)object2).b())) != this) continue;
                    object2 = "Cannot loop to this while looking for list head".toString();
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
            } else {
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                object2 = object;
                object2 = (zw1_2)object;
            }
            if ((si2_22 = (si2_2)((zw1_2)object2).removedRef) == null) {
                si2_22 = new si2_2((zw1_2)object2);
                atomicReferenceFieldUpdater = c;
                atomicReferenceFieldUpdater.lazySet(object2, si2_22);
            }
            object2 = b;
            do {
                boolean bl4;
                if (!(bl4 = ((AtomicReferenceFieldUpdater)object2).compareAndSet(this, object, si2_22))) continue;
                return (zw1_2)object;
            } while ((atomicReferenceFieldUpdater = ((AtomicReferenceFieldUpdater)object2).get(this)) == object);
        }
        return ((si2_2)object).a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean d() {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Object v4;
        Object object;
        Object object2;
        String string2;
        Object object3;
        Object object4;
        block0: while (true) {
            object4 = this.b();
            boolean bl5 = object4 instanceof si2_2;
            object3 = null;
            if (bl5) {
                return false;
            }
            if (object4 == this) {
                return false;
            }
            string2 = "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode";
            Intrinsics.checkNotNull(object4, string2);
            object3 = object4;
            object3 = (zw1_2)object4;
            object2 = (si2_2)((zw1_2)object3).removedRef;
            if (object2 == null) {
                object2 = new si2_2((zw1_2)object3);
                object = c;
                ((AtomicReferenceFieldUpdater)object).lazySet(object3, object2);
            }
            object = a;
            do {
                if (bl4 = ((AtomicReferenceFieldUpdater)object).compareAndSet(this, object4, object2)) break block0;
            } while ((v4 = ((AtomicReferenceFieldUpdater)object).get(this)) == object4);
        }
        object4 = this.c();
        object2 = this._next;
        object = "null cannot be cast to non-null type io.ktor.util.internal.Removed";
        Intrinsics.checkNotNull(object2, (String)object);
        object2 = ((si2_2)object2).a;
        bl4 = false;
        v4 = null;
        Object object5 = object4;
        Object object6 = object2;
        block2: while (true) {
            Object object7 = null;
            while (true) {
                block30: {
                    block28: {
                        block29: {
                            block26: {
                                block27: {
                                    if (bl3 = (object4 = ((zw1_2)object6).b()) instanceof si2_2) {
                                        ((zw1_2)object6).c();
                                        object4 = (si2_2)object4;
                                        object6 = ((si2_2)object4).a;
                                        continue;
                                    }
                                    object4 = ((zw1_2)object5).b();
                                    bl3 = object4 instanceof si2_2;
                                    if (!bl3) break block26;
                                    if (object7 == null) break block27;
                                    ((zw1_2)object5).c();
                                    object2 = a;
                                    object4 = ((si2_2)object4).a;
                                    break block28;
                                }
                                object4 = xw1_2.a(((zw1_2)object5)._prev);
                                break block29;
                            }
                            if (object4 == this) break block30;
                            Intrinsics.checkNotNull(object4, string2);
                            object4 = (zw1_2)object4;
                            if (object4 == object6) break block2;
                            object7 = object5;
                        }
                        object5 = object4;
                        continue;
                    }
                    while (!(bl2 = ((AtomicReferenceFieldUpdater)object2).compareAndSet(object7, object5, object4)) && (object = ((AtomicReferenceFieldUpdater)object2).get(object7)) == object5) {
                    }
                    object5 = object7;
                    continue block2;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                do {
                    boolean bl6;
                    if (!(bl6 = atomicReferenceFieldUpdater.compareAndSet(object5, this, object6))) continue;
                    break block2;
                } while ((object4 = atomicReferenceFieldUpdater.get(object5)) == this);
            }
            break;
        }
        object4 = xw1_2.a(this._prev);
        block6: while (true) {
            bl3 = false;
            object2 = null;
            block7: while (true) {
                Object object8;
                boolean bl7;
                block31: {
                    boolean bl8;
                    block25: {
                        if ((object = ((zw1_2)object4)._next) == null) {
                            return true;
                        }
                        bl7 = object instanceof e92_0;
                        if (bl7) {
                            object = (e92_0)object;
                            ((e92_0)object).a();
                            continue;
                        }
                        bl7 = object instanceof si2_2;
                        if (bl7) {
                            if (object2 != null) {
                                ((zw1_2)object4).c();
                                object5 = a;
                                object = ((si2_2)object).a;
                                break block25;
                            } else {
                                object4 = xw1_2.a(((zw1_2)object4)._prev);
                                continue;
                            }
                        }
                        object8 = ((zw1_2)object3)._prev;
                        bl7 = object8 instanceof si2_2;
                        if (bl7) {
                            return true;
                        }
                        if (object != object3) {
                            Intrinsics.checkNotNull(object, string2);
                            object2 = object;
                            zw1_2 zw1_22 = (zw1_2)object;
                            object2 = object4;
                            object4 = zw1_22;
                            continue;
                        }
                        if (object8 == object4) {
                            return true;
                        }
                        break block31;
                    }
                    while (!(bl8 = ((AtomicReferenceFieldUpdater)object5).compareAndSet(object2, object4, object)) && (object6 = ((AtomicReferenceFieldUpdater)object5).get(object2)) == object4) {
                    }
                    object4 = object2;
                    continue block6;
                }
                object = b;
                do {
                    if (!(bl7 = ((AtomicReferenceFieldUpdater)object).compareAndSet(object3, object8, object4))) continue;
                    object = ((zw1_2)object4)._prev;
                    bl2 = object instanceof si2_2;
                    if (bl2) continue block7;
                    return true;
                } while ((object5 = ((AtomicReferenceFieldUpdater)object).get(object3)) == object8);
            }
            break;
        }
    }

    public void dispose() {
        this.d();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        int n3 = this.hashCode();
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

