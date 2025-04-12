/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import kotlinx.coroutines.scheduling.CoroutineScheduler$b;
import kotlinx.coroutines.scheduling.Task;

public final class CoroutineScheduler$Worker
extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i;
    public final bi3_1 a;
    public final Ref$ObjectRef b;
    public CoroutineScheduler$b c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ CoroutineScheduler h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    static {
        i = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler$Worker.class, "workerCtl$volatile");
    }

    public CoroutineScheduler$Worker() {
        throw null;
    }

    public CoroutineScheduler$Worker(CoroutineScheduler object, int n3) {
        this.h = object;
        boolean bl2 = true;
        this.setDaemon(bl2);
        object = object.getClass().getClassLoader();
        this.setContextClassLoader((ClassLoader)object);
        this.a = object = new bi3_1();
        this.b = object = new Ref$ObjectRef();
        object = CoroutineScheduler$b.DORMANT;
        this.c = object;
        this.nextParkedWorker = object = CoroutineScheduler.k;
        long l2 = System.nanoTime();
        int n4 = (int)l2;
        if (n4 == 0) {
            n4 = 42;
        }
        this.f = n4;
        this.f(n3);
    }

    public final Task a(boolean n3) {
        Task task2;
        block15: {
            block16: {
                block14: {
                    Object object = this.c;
                    Object object2 = CoroutineScheduler$b.CPU_ACQUIRED;
                    Object object3 = null;
                    bi3_1 bi3_12 = this.a;
                    int n4 = 1;
                    CoroutineScheduler coroutineScheduler = this.h;
                    if (object != object2) {
                        long l2;
                        long l3;
                        CoroutineScheduler coroutineScheduler2;
                        AtomicLongFieldUpdater atomicLongFieldUpdater;
                        int n7;
                        object = CoroutineScheduler.i;
                        do {
                            Object object4;
                            block13: {
                                if ((n7 = (int)(l2 = (0x7FFFFC0000000000L & (l3 = ((AtomicLongFieldUpdater)object).get(coroutineScheduler2 = this.h))) >> 42)) != 0) continue;
                                bi3_12.getClass();
                                while ((object = (Task)((AtomicReferenceFieldUpdater)(object4 = bi3_1.b)).get(bi3_12)) != null && (n7 = (int)(((Task)object).b ? 1 : 0)) == n4) {
                                    do {
                                        if ((n7 = (int)(((AtomicReferenceFieldUpdater)object4).compareAndSet(bi3_12, object, null) ? 1 : 0)) == 0) continue;
                                        object3 = object;
                                        break block13;
                                    } while ((object2 = ((AtomicReferenceFieldUpdater)object4).get(bi3_12)) == object);
                                }
                                object4 = bi3_1.d;
                                n3 = ((AtomicIntegerFieldUpdater)object4).get(bi3_12);
                                object = bi3_1.c;
                                int n8 = ((AtomicIntegerFieldUpdater)object).get(bi3_12);
                                while (n3 != n8 && (n7 = ((AtomicIntegerFieldUpdater)(object2 = bi3_1.e)).get(bi3_12)) != 0) {
                                    object2 = bi3_12.c(n8 += -1, n4 != 0);
                                    if (object2 == null) continue;
                                    object3 = object2;
                                    break;
                                }
                            }
                            if (object3 == null) {
                                object3 = object4 = coroutineScheduler.f.d();
                                object3 = (Task)object4;
                                if (object3 == null) {
                                    object3 = this.i(n4);
                                }
                            }
                            return object3;
                        } while ((n7 = (int)((atomicLongFieldUpdater = CoroutineScheduler.i).compareAndSet(coroutineScheduler2, l3, l2 = l3 - 0x40000000000L) ? 1 : 0)) == 0);
                        object = CoroutineScheduler$b.CPU_ACQUIRED;
                        this.c = object;
                    }
                    if (n3 == 0) break block14;
                    n3 = coroutineScheduler.a * 2;
                    if ((n3 = this.d(n3)) != 0) {
                        n4 = 0;
                    }
                    if (n4 != 0 && (task2 = this.e()) != null) break block15;
                    bi3_12.getClass();
                    task2 = bi3_1.b.getAndSet(bi3_12, null);
                    if (task2 == null) {
                        task2 = bi3_12.b();
                    }
                    if (task2 == null && (n4 != 0 || (task2 = this.e()) == null)) break block16;
                    break block15;
                }
                task2 = this.e();
                if (task2 != null) break block15;
            }
            n3 = 3;
            task2 = this.i(n3);
        }
        return task2;
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int n3) {
        int n4 = this.f;
        int n7 = n4 << 13;
        n4 ^= n7;
        n7 = n4 >> 17;
        n4 ^= n7;
        n7 = n4 << 5;
        this.f = n4 ^= n7;
        n7 = n3 + -1;
        int n8 = n7 & n3;
        if (n8 == 0) {
            return n4 & n7;
        }
        return (n4 & -1 >>> 1) % n3;
    }

    public final Task e() {
        int n3 = this.d(2);
        CoroutineScheduler coroutineScheduler = this.h;
        if (n3 == 0) {
            Task task2 = (Task)coroutineScheduler.e.d();
            if (task2 != null) {
                return task2;
            }
            return (Task)coroutineScheduler.f.d();
        }
        Task task3 = (Task)coroutineScheduler.f.d();
        if (task3 != null) {
            return task3;
        }
        return (Task)coroutineScheduler.e.d();
    }

    public final void f(int n3) {
        CharSequence charSequence = new StringBuilder();
        String string2 = this.h.d;
        charSequence.append(string2);
        string2 = "-worker-";
        charSequence.append(string2);
        string2 = n3 == 0 ? "TERMINATED" : String.valueOf(n3);
        charSequence.append(string2);
        charSequence = charSequence.toString();
        this.setName((String)charSequence);
        this.indexInArray = n3;
    }

    public final void g(Object object) {
        this.nextParkedWorker = object;
    }

    public final boolean h(CoroutineScheduler$b coroutineScheduler$b) {
        boolean bl2;
        CoroutineScheduler$b coroutineScheduler$b2 = this.c;
        CoroutineScheduler$b coroutineScheduler$b3 = CoroutineScheduler$b.CPU_ACQUIRED;
        if (coroutineScheduler$b2 == coroutineScheduler$b3) {
            bl2 = true;
        } else {
            bl2 = false;
            coroutineScheduler$b3 = null;
        }
        if (bl2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.i;
            long l2 = 0x40000000000L;
            CoroutineScheduler coroutineScheduler = this.h;
            atomicLongFieldUpdater.addAndGet(coroutineScheduler, l2);
        }
        if (coroutineScheduler$b2 != coroutineScheduler$b) {
            this.c = coroutineScheduler$b;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Task i(int var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = CoroutineScheduler.i;
        var5_5 = this.h;
        var6_6 = var4_4.get(var5_5);
        var8_7 = 0x1FFFFFL;
        var10_8 = (int)(var6_6 &= var8_7);
        var11_9 = 2;
        if (var10_8 < var11_9) {
            return null;
        }
        var12_10 = this.d(var10_8);
        var14_12 = 0x7FFFFFFFFFFFFFFFL;
        for (var13_11 = 0; var13_11 < var10_8; ++var13_11) {
            block18: {
                block17: {
                    block16: {
                        var16_13 = 1;
                        if ((var12_10 += var16_13) > var10_8) {
                            var12_10 = 1;
                        }
                        if ((var17_14 = (CoroutineScheduler$Worker)var5_5.g.b(var12_10)) == null || var17_14 == var2_2) break block18;
                        var18_15 = 3;
                        var17_14 = var17_14.a;
                        if (var3_3 == var18_15) {
                            var19_16 = var17_14.b();
                        } else {
                            var17_14.getClass();
                            var19_16 = bi3_1.d;
                            var18_15 = var19_16.get(var17_14);
                            var20_17 /* !! */  = bi3_1.c;
                            var21_18 = var20_17 /* !! */ .get(var17_14);
                            var22_19 = var3_3 == var16_13;
                            while (true) {
                                if (var18_15 == var21_18 || var22_19 && (var16_13 = (var23_20 = bi3_1.e).get(var17_14)) == 0) {
                                    var18_15 = 0;
                                    var19_16 = null;
                                    break;
                                }
                                var16_13 = var18_15 + 1;
                                var19_16 = var17_14.c(var18_15, var22_19);
                                if (var19_16 != null) break;
                                var18_15 = var16_13;
                                var16_13 = 1;
                            }
                        }
                        var23_20 = var2_2.b;
                        if (var19_16 != null) {
                            var23_20.element = var19_16;
                            var24_21 = -1;
lbl45:
                            // 2 sources

                            while (true) {
                                var26_22 = -1;
                                break block16;
                                break;
                            }
                        }
lbl48:
                        // 3 sources

                        while (true) {
                            block19: {
                                var19_16 = bi3_1.b;
                                var29_24 /* !! */  = var28_23 = var19_16.get(var17_14);
                                var29_24 /* !! */  = (Task)var28_23;
                                var26_22 = -2;
                                if (var29_24 /* !! */  == null) ** GOTO lbl74
                                var30_25 = var29_24 /* !! */ .b;
                                var30_25 = var30_25 != 0 ? 1 : 2;
                                if ((var30_25 &= var3_3) == 0) ** GOTO lbl74
                                var31_26 = xi3_2.f;
                                var31_26.getClass();
                                var26_22 = System.nanoTime();
                                var24_21 = var29_24 /* !! */ .a;
                                var26_22 -= var24_21;
                                var24_21 = xi3_2.b;
                                var30_25 = (int)(var26_22 == var24_21 ? 0 : (var26_22 < var24_21 ? -1 : 1));
                                if (var30_25 >= 0) break block19;
                                var26_22 = var24_21 - var26_22;
                                ** GOTO lbl74
                            }
                            while (true) {
                                var21_18 = (int)var19_16.compareAndSet(var17_14, var29_24 /* !! */ , null);
                                if (var21_18 == 0) break block17;
                                var23_20.element = var29_24 /* !! */ ;
                                var26_22 = -1;
lbl74:
                                // 4 sources

                                var24_21 = var26_22;
                                ** continue;
                                break;
                            }
                            break;
                        }
                    }
                    var11_9 = (int)(var24_21 == var26_22 ? 0 : (var24_21 < var26_22 ? -1 : 1));
                    if (var11_9 == 0) {
                        var32_28 = (Task)var23_20.element;
                        var23_20.element = null;
                        return var32_28;
                    }
                    var33_27 = 0L;
                    cfr_temp_0 = var24_21 - var33_27;
                    var11_9 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var11_9 > 0) {
                        var14_12 = Math.min(var14_12, var24_21);
                    }
                    break block18;
                }
                var33_27 = 0L;
                var26_22 = -1;
                if ((var20_17 /* !! */  = var19_16.get(var17_14)) == var29_24 /* !! */ ) ** continue;
                ** continue;
            }
            var11_9 = 2;
        }
        var8_7 = 0x7FFFFFFFFFFFFFFFL;
        var33_27 = 0L;
        var3_3 = (int)(var14_12 == var8_7 ? 0 : (var14_12 < var8_7 ? -1 : 1));
        if (var3_3 == 0) {
            var14_12 = var33_27;
        }
        var2_2.e = var14_12;
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block32: {
            var1_1 = this;
            var2_2 = null;
            block12: while (true) {
                var3_3 = false;
                var4_4 /* !! */  = null;
                block13: while (true) {
                    var5_6 = var1_1.h;
                    var5_6.getClass();
                    var6_9 /* !! */  = CoroutineScheduler.j;
                    var7_10 /* !! */  = var6_9 /* !! */ .get(var5_6);
                    var8_11 = 1;
                    if (var7_10 /* !! */  == var8_11 || (var5_6 = var1_1.c) == (var9_12 /* !! */  = CoroutineScheduler$b.TERMINATED)) break block32;
                    var7_10 /* !! */  = (int)var1_1.g;
                    var5_6 = var1_1.a((boolean)var7_10 /* !! */ );
                    var10_13 = 0xFFE00000L;
                    var12_14 = 0L;
                    if (var5_6 != null) {
                        var1_1.e = var12_14;
                        var1_1.d = var12_14;
                        var4_4 /* !! */  = var1_1.c;
                        var6_9 /* !! */  = CoroutineScheduler$b.PARKING;
                        if (var4_4 /* !! */  == var6_9 /* !! */ ) {
                            var1_1.c = var4_4 /* !! */  = CoroutineScheduler$b.BLOCKING;
                        }
                        var3_3 = var5_6.b;
                        var6_9 /* !! */  = var1_1.h;
                        if (var3_3) {
                            var4_4 /* !! */  = CoroutineScheduler$b.BLOCKING;
                            var3_3 = var1_1.h(var4_4 /* !! */ );
                            if (var3_3 && !(var3_3 = var6_9 /* !! */ .n()) && !(var3_3 = var6_9 /* !! */ .k(var12_14 = (var4_4 /* !! */  = CoroutineScheduler.i).get(var6_9 /* !! */ )))) {
                                var6_9 /* !! */ .n();
                            }
                            var6_9 /* !! */ .getClass();
                            try {
                                var5_6.run();
                            }
                            catch (Throwable var5_7) {
                                var4_4 /* !! */  = Thread.currentThread();
                                var14_15 = var4_4 /* !! */ .getUncaughtExceptionHandler();
                                var14_15.uncaughtException((Thread)var4_4 /* !! */ , var5_7);
                            }
                            CoroutineScheduler.i.addAndGet(var6_9 /* !! */ , var10_13);
                            var4_4 /* !! */  = var1_1.c;
                            if (var4_4 /* !! */  == var9_12 /* !! */ ) continue block12;
                            var1_1.c = var4_4 /* !! */  = CoroutineScheduler$b.DORMANT;
                            continue block12;
                        }
                        var6_9 /* !! */ .getClass();
                        try {
                            var5_6.run();
                        }
                        catch (Throwable var5_8) {
                            var4_4 /* !! */  = Thread.currentThread();
                            var6_9 /* !! */  = var4_4 /* !! */ .getUncaughtExceptionHandler();
                            var6_9 /* !! */ .uncaughtException((Thread)var4_4 /* !! */ , var5_8);
                        }
                        continue block12;
                    }
                    var1_1.g = false;
                    var15_16 = var1_1.e;
                    cfr_temp_0 = var15_16 - var12_14;
                    var7_10 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var7_10 /* !! */  != 0) {
                        if (!var3_3) {
                            var3_3 = true;
                            continue;
                        }
                        var4_4 /* !! */  = CoroutineScheduler$b.PARKING;
                        var1_1.h(var4_4 /* !! */ );
                        Thread.interrupted();
                        var17_17 = var1_1.e;
                        LockSupport.parkNanos(var17_17);
                        var1_1.e = var12_14;
                        continue block12;
                    }
                    var5_6 = var1_1.nextParkedWorker;
                    var9_12 /* !! */  = CoroutineScheduler.k;
                    if (var5_6 != var9_12 /* !! */ ) {
                        var7_10 /* !! */  = 1;
                    } else {
                        var7_10 /* !! */  = 0;
                        var5_6 = null;
                    }
                    var15_16 = 0x1FFFFFL;
                    if (var7_10 /* !! */  != 0) break block12;
                    var5_6 = var1_1.h;
                    var5_6.getClass();
                    var6_9 /* !! */  = var1_1.nextParkedWorker;
                    if (var6_9 /* !! */  == var9_12 /* !! */ ) {
                        do {
                            var19_18 = CoroutineScheduler.h;
                            var20_19 = var19_18.get(var5_6);
                            var22_20 = (int)(var20_19 & var15_16);
                            var12_14 = 0x200000L + var20_19 & var10_13;
                            var8_11 = var1_1.indexInArray;
                            var9_12 /* !! */  = var5_6.g.b(var22_20);
                            var1_1.nextParkedWorker = var9_12 /* !! */ ;
                        } while ((var8_11 = (int)var19_18.compareAndSet(var5_6, var20_19, var25_22 = var12_14 | (var23_21 = (long)var8_11))) == 0);
                    }
lbl98:
                    // 5 sources

                    while (true) {
                        var27_23 = 0;
                        var2_2 = null;
                        continue block13;
                        break;
                    }
                    break;
                }
                break;
            }
            var5_6 = CoroutineScheduler$Worker.i;
            var22_20 = -1;
            var5_6.set(var1_1, var22_20);
            while (true) {
                block36: {
                    block35: {
                        if ((var5_6 = var1_1.nextParkedWorker) == (var28_24 = CoroutineScheduler.k) || (var29_25 = (var5_6 = CoroutineScheduler$Worker.i).get(var1_1)) != var22_20) ** GOTO lbl98
                        var28_24 = var1_1.h;
                        var28_24.getClass();
                        var30_26 = CoroutineScheduler.j;
                        var29_25 = var30_26.get(var28_24);
                        if (var29_25 != var8_11 && (var28_24 = var1_1.c) != (var19_18 = CoroutineScheduler$b.TERMINATED)) ** break;
                        ** continue;
                        var28_24 = CoroutineScheduler$b.PARKING;
                        var1_1.h((CoroutineScheduler$b)var28_24);
                        Thread.interrupted();
                        var31_27 = var1_1.d;
                        var29_25 = (int)(var31_27 == var12_14 ? 0 : (var31_27 < var12_14 ? -1 : 1));
                        if (var29_25 == 0) {
                            var31_27 = System.nanoTime();
                            var28_24 = var1_1.h;
                            var33_28 = var5_6;
                            var34_29 = var28_24.c;
                            var1_1.d = var31_27 += var34_29;
                        } else {
                            var33_28 = var5_6;
                        }
                        var2_2 = var1_1.h;
                        LockSupport.parkNanos(var2_2.c);
                        var34_29 = System.nanoTime();
                        var31_27 = var1_1.d;
                        cfr_temp_1 = (var34_29 -= var31_27) - var12_14;
                        var29_25 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                        if (var29_25 < 0) break block35;
                        var1_1.d = var12_14;
                        var2_2 = var1_1.h;
                        var5_6 = var2_2.g;
                        synchronized (var5_6) {
                            block34: {
                                try {
                                    var29_25 = var30_26.get(var2_2);
                                    if (var29_25 == var8_11) {
                                        var29_25 = 1;
                                    } else {
                                        var29_25 = 0;
                                        var28_24 = null;
                                    }
                                    if (var29_25 != 0) {
                                    }
                                }
                                catch (Throwable var4_5) {
                                    ** break block33
                                }
                                {
                                    var28_24 = CoroutineScheduler.i;
                                    var31_27 = var28_24.get(var2_2) & var15_16;
                                    var36_30 = (int)var31_27;
                                    if (var36_30 > (var27_23 = var2_2.a)) break block34;
                                }
                                break block35;
                            }
                            var30_26 = var33_28;
                            {
                                var36_30 = (int)var33_28.compareAndSet(var1_1, var22_20, var8_11);
                                if (var36_30 != 0) ** GOTO lbl-1000
                            }
                            break block35;
lbl-1000:
                            // 1 sources

                            {
                                var36_30 = var1_1.indexInArray;
                                var27_23 = 0;
                                var1_1.f(0);
                                var2_2.d(var1_1, var36_30, 0);
                                var20_19 = var28_24.getAndDecrement(var2_2) & var15_16;
                            }
                            var29_25 = (int)var20_19;
                            if (var29_25 != var36_30) {
                                var37_31 = var2_2.g;
                                var37_31 = var37_31.b(var29_25);
                                Intrinsics.checkNotNull(var37_31);
                                var37_31 = (CoroutineScheduler$Worker)var37_31;
                                var38_32 = var2_2.g;
                                var38_32.c(var36_30, (CoroutineScheduler$Worker)var37_31);
                                var37_31.f(var36_30);
                                var2_2.d((CoroutineScheduler$Worker)var37_31, var29_25, var36_30);
                            }
                            var2_2 = var2_2.g;
                            var36_30 = 0;
                            var30_26 = null;
                            var2_2.c(var29_25, null);
                            var2_2 = Unit.a;
                        }
                        var1_1.c = var19_18;
                        break block36;
lbl-1000:
                        // 1 sources

                        {
                            throw var4_5;
                        }
                    }
                    var27_23 = 0;
                }
                var2_2 = null;
            }
        }
        var4_4 /* !! */  = CoroutineScheduler$b.TERMINATED;
        var1_1.h(var4_4 /* !! */ );
    }
}

