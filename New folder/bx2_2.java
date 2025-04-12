/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from BX2
 */
public final class bx2_2 {
    public static final ux2_2 a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final AtomicReferenceArray f;
    public static final AtomicReferenceArray g;

    static {
        ux2_2 ux2_22;
        int n3 = 0;
        AtomicReferenceArray atomicReferenceArray = null;
        Object object = new byte[]{};
        Intrinsics.checkNotNullParameter(object, "data");
        Object object2 = null;
        a = ux2_22 = new ux2_2((byte[])object, 0, 0, null);
        object = Runtime.getRuntime();
        int n4 = object.availableProcessors() * 2;
        int n7 = 1;
        b = n4 = Integer.highestOneBit(n4 - n7);
        int n8 = n4 / 2;
        if (n8 >= n7) {
            n7 = n8;
        }
        c = n7;
        object2 = System.getProperty("java.vm.name");
        String string2 = "Dalvik";
        n8 = (int)(Intrinsics.areEqual(object2, string2) ? 1 : 0);
        object2 = n8 != 0 ? "0" : "4194304";
        object2 = System.getProperty("kotlinx.io.pool.size.bytes", (String)object2);
        string2 = "getProperty(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = StringsKt.toIntOrNull((String)object2);
        if (object2 != null && (n8 = ((Integer)object2).intValue()) >= 0) {
            n3 = n8;
        }
        d = n3;
        n8 = 8192;
        if ((n3 /= n7) < n8) {
            n3 = 8192;
        }
        e = n3;
        f = atomicReferenceArray = new AtomicReferenceArray(n4);
        g = atomicReferenceArray = new AtomicReferenceArray(n7);
    }

    public static final void a(ux2_2 object) {
        Intrinsics.checkNotNullParameter(object, "segment");
        Object object2 = ((ux2_2)object).f;
        if (object2 == null && (object2 = ((ux2_2)object).g) == null) {
            int n3;
            object2 = ((ux2_2)object).d;
            int n4 = 1;
            if (object2 != null && (n3 = ((tf_0)object2).c()) == n4) {
                return;
            }
            object2 = f;
            long l2 = b;
            long l3 = 1L;
            l2 -= l3;
            Object object3 = Thread.currentThread();
            long l4 = ((Thread)object3).getId();
            int n7 = (int)(l2 &= l4);
            ((ux2_2)object).b = 0;
            ((ux2_2)object).e = n4;
            while (true) {
                int n8;
                ux2_2 ux2_22;
                if ((object3 = (ux2_2)((AtomicReferenceArray)object2).get(n7)) == (ux2_22 = a)) {
                    continue;
                }
                int n10 = object3 != null ? ((ux2_2)object3).c : 0;
                if (n10 >= (n8 = 65536)) {
                    n3 = d;
                    if (n3 > 0) {
                        ((ux2_2)object).b = 0;
                        ((ux2_2)object).e = n4;
                        n3 = c;
                        long l7 = (long)n3 - l3;
                        Thread thread2 = Thread.currentThread();
                        long l8 = thread2.getId() & l7;
                        n4 = (int)l8;
                        AtomicReferenceArray atomicReferenceArray = g;
                        int n14 = 0;
                        block1: while (true) {
                            int n15;
                            ux2_2 ux2_23;
                            if ((ux2_23 = (ux2_2)atomicReferenceArray.get(n4)) == ux2_22) {
                                continue;
                            }
                            if (ux2_23 != null) {
                                n15 = ux2_23.c;
                            } else {
                                n15 = 0;
                                object3 = null;
                            }
                            n10 = e;
                            if ((n15 += 8192) > n10) {
                                if (n14 >= n3) break;
                                ++n14;
                                ++n4;
                                int n16 = n3 + -1;
                                n4 &= n16;
                                continue;
                            }
                            ((ux2_2)object).f = ux2_23;
                            ((ux2_2)object).c = n15;
                            while ((n15 = (int)(atomicReferenceArray.compareAndSet(n4, ux2_23, object) ? 1 : 0)) == 0) {
                                object3 = atomicReferenceArray.get(n4);
                                if (object3 == ux2_23) continue;
                                continue block1;
                            }
                            break;
                        }
                    }
                    return;
                }
                ((ux2_2)object).f = object3;
                ((ux2_2)object).c = n10 += 8192;
                do {
                    boolean bl2;
                    if (!(bl2 = ((AtomicReferenceArray)object2).compareAndSet(n7, object3, object))) continue;
                    return;
                } while ((ux2_22 = ((AtomicReferenceArray)object2).get(n7)) == object3);
            }
        }
        object2 = "Failed requirement.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static final ux2_2 b() {
        ux2_2 ux2_22;
        int n3;
        Object object;
        Object object2;
        block4: {
            block5: {
                block6: {
                    int n4;
                    block3: {
                        boolean bl2;
                        object2 = f;
                        int n7 = b;
                        long l2 = n7;
                        long l3 = 1L;
                        l2 -= l3;
                        object = Thread.currentThread();
                        long l4 = ((Thread)object).getId();
                        n3 = (int)(l2 &= l4);
                        while (bl2 = Intrinsics.areEqual(object = ((AtomicReferenceArray)object2).getAndSet(n3, ux2_22 = a), ux2_22)) {
                        }
                        bl2 = false;
                        if (object != null) break block4;
                        ((AtomicReferenceArray)object2).set(n3, null);
                        int n8 = d;
                        if (n8 <= 0) break block5;
                        object2 = g;
                        n3 = c;
                        long l7 = (long)n3 - l3;
                        l3 = Thread.currentThread().getId() & l7;
                        n4 = (int)l3;
                        int n10 = 0;
                        while (true) {
                            boolean bl3;
                            if (bl3 = Intrinsics.areEqual(object = ((AtomicReferenceArray)object2).getAndSet(n4, ux2_22), ux2_22)) {
                                continue;
                            }
                            if (object != null) break block3;
                            ((AtomicReferenceArray)object2).set(n4, null);
                            if (n10 >= n3) break;
                            ++n4;
                            int n14 = n3 + -1;
                            n4 &= n14;
                            ++n10;
                        }
                        object = new ux2_2();
                        break block6;
                    }
                    ux2_22 = ((ux2_2)object).f;
                    ((AtomicReferenceArray)object2).set(n4, ux2_22);
                    ((ux2_2)object).f = null;
                    ((ux2_2)object).c = 0;
                }
                return object;
            }
            object2 = new ux2_2();
            return object2;
        }
        ux2_22 = ((ux2_2)object).f;
        ((AtomicReferenceArray)object2).set(n3, ux2_22);
        ((ux2_2)object).f = null;
        ((ux2_2)object).c = 0;
        return object;
    }
}

