/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.utils.io.ConcurrentIOException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from iF
 */
public final class if_1
implements uf_1,
gf_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g;
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    volatile /* synthetic */ Object _closedCause;
    public final boolean b;
    public final ee_2 c;
    public final Object d;
    public final ee_2 e;
    public final ee_2 f;
    private volatile int flushBufferSize;
    volatile /* synthetic */ Object suspensionSlot;

    static {
        Class<if_1> clazz = if_1.class;
        Class<Object> clazz2 = Object.class;
        g = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "suspensionSlot");
        h = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_closedCause");
    }

    public if_1() {
        this(false);
    }

    public if_1(boolean bl2) {
        this.b = bl2;
        Object object = new ee_2();
        this.c = object;
        this.d = object = new Object();
        this.suspensionSlot = object = iF$a$c.b;
        this.e = object = new ee_2();
        this.f = object = new ee_2();
        this._closedCause = null;
    }

    public final boolean a() {
        boolean bl2;
        Object object = this._closedCause;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final ee_2 b() {
        boolean bl2 = this.a();
        if (bl2) {
            Object object = (yv_2)this._closedCause;
            if (object != null) {
                jf_2 jf_22 = jf_2.a;
                String string2 = "wrap";
                Intrinsics.checkNotNullParameter(jf_22, string2);
                object = ((yv_2)object).a(jf_22);
                if (object != null) {
                    throw object;
                }
            }
            object = new IOException(null, null);
            throw object;
        }
        return this.f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(f80_0 var1_1) {
        block11: {
            block12: {
                var2_4 = var1_1 instanceof iF$d;
                if (!var2_4) ** GOTO lbl-1000
                var3_5 = var1_1;
                var3_5 = (iF$d)var1_1;
                var4_6 = var3_5.d;
                var5_7 = -1 << -1;
                var6_8 = var4_6 & var5_7;
                if (var6_8 != 0) {
                    var3_5.d = var4_6 -= var5_7;
                } else lbl-1000:
                // 2 sources

                {
                    var3_5 = new iF$d(this, (f80_0)var1_1);
                }
                var1_1 = var3_5.b;
                var7_9 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                var5_7 = var3_5.d;
                var6_8 = 1;
                if (var5_7 == 0) ** GOTO lbl26
                if (var5_7 != var6_8) {
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                var3_5 = var3_5.a;
                vl2_2.b(var1_1);
                break block12;
                finally {
                    break block11;
                }
lbl26:
                // 1 sources

                vl2_2.b(var1_1);
                try {
                    var1_1 = tl2_2.b;
                    var3_5.a = this;
                    var3_5.d = var6_8;
                    var1_1 = this.d((f80_0)var3_5);
                    if (var1_1 == var7_9 /* !! */ ) {
                        return var7_9 /* !! */ ;
                    }
                    var3_5 = this;
                }
                catch (Throwable var1_3) {
                    var3_5 = this;
                    break block11;
                }
            }
            var1_1 = Unit.a;
            var1_1 = tl2_2.b;
            return var1_1;
        }
        var7_9 /* !! */  = tl2_2.b;
        vl2_2.a((Throwable)var1_1);
        var1_1 = zv_2.a;
        do {
            var7_9 /* !! */  = if_1.h;
            var5_7 = 0;
            var6_8 = (int)var7_9 /* !! */ .compareAndSet(var3_5, null, var1_1);
            if (var6_8 == 0) continue;
            var3_5.k(null);
            return Unit.a;
        } while ((var7_9 /* !! */  = var7_9 /* !! */ .get(var3_5)) == null);
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     */
    public final Object d(f80_0 var1_1) {
        block17: {
            block16: {
                block14: {
                    block15: {
                        var2_2 = var1_1 instanceof iF$c;
                        if (!var2_2) ** GOTO lbl-1000
                        var3_3 = var1_1;
                        var3_3 = (iF$c)var1_1;
                        var4_4 = var3_3.e;
                        var5_5 = -1 << -1;
                        var6_6 = var4_4 & var5_5;
                        if (var6_6 != 0) {
                            var3_3.e = var4_4 -= var5_5;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var3_3 = new iF$c(this, (f80_0)var1_1);
                        }
                        var1_1 = var3_3.c;
                        var7_7 = j90_0.COROUTINE_SUSPENDED;
                        var5_5 = var3_3.e;
                        var6_6 = 0x100000;
                        var8_8 = 1;
                        if (var5_5 == 0) break block14;
                        if (var5_5 != var8_8) break block15;
                        var9_9 = var3_3.b;
                        var10_10 = var3_3.a;
                        vl2_2.b(var1_1);
                        break block16;
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var1_1);
                Intrinsics.checkNotNullParameter(this, "<this>");
                var1_1 = this.f();
                if (var1_1 != null) break block17;
                this.l();
                var11_11 = this.flushBufferSize;
                if (var11_11 < var6_6) {
                    return Unit.a;
                }
                var9_9 = this;
                var10_10 = this;
            }
            while ((var11_11 = var10_10.flushBufferSize) >= var6_6 && (var1_1 = var10_10._closedCause) == null) {
                block22: {
                    block13: {
                        block19: {
                            block21: {
                                block20: {
                                    block18: {
                                        var3_3.a = var10_10;
                                        var3_3.b = var9_9;
                                        var3_3.e = var8_8;
                                        var12_12 = zj1_2.b(var3_3);
                                        var1_1 = new CancellableContinuationImpl(var8_8, (f80_0)var12_12);
                                        var1_1.r();
                                        var12_12 = new iF$a$f((CancellableContinuationImpl)var1_1);
                                        var13_13 = (iF$a)var9_9.suspensionSlot;
                                        var14_14 = var13_13 instanceof iF$a$a;
                                        if (!var14_14) {
                                            var15_15 = if_1.g;
                                            while (!(var16_16 = var15_15.compareAndSet(var9_9, var13_13, var12_12))) {
                                                var17_17 = var15_15.get(var9_9);
                                                if (var17_17 == var13_13) continue;
                                                var12_12.resume();
                                                break block13;
                                            }
                                        }
                                        if (!(var18_18 = var13_13 instanceof iF$a$f)) break block18;
                                        var13_13 = (iF$a$e)var13_13;
                                        var19_19 = var13_13.b();
                                        var15_15 = "write";
                                        var12_12 = new ConcurrentIOException((String)var15_15, (Throwable)var19_19);
                                        var13_13.a((Throwable)var12_12);
                                        break block19;
                                    }
                                    var18_18 = var13_13 instanceof iF$a$e;
                                    if (!var18_18) break block20;
                                    var13_13 = (iF$a$e)var13_13;
                                    var13_13.resume();
                                    break block19;
                                }
                                if (!var14_14) break block21;
                                var13_13 = ((iF$a$a)var13_13).b;
                                var12_12.a((Throwable)var13_13);
                                break block13;
                            }
                            var12_12 = iF$a$c.b;
                            var20_20 = Intrinsics.areEqual(var13_13, var12_12);
                            if (var20_20 == 0) break block22;
                        }
                        var20_20 = var10_10.flushBufferSize;
                        if ((var20_20 < var6_6 || (var12_12 = var10_10._closedCause) != null) && (var21_21 = (var12_12 = (iF$a)var9_9.suspensionSlot) instanceof iF$a$f)) {
                            var13_13 = if_1.g;
                            var19_19 = iF$a$c.b;
                            do {
                                if (!(var18_18 = var13_13.compareAndSet(var9_9, var12_12, var19_19))) continue;
                                var12_12 = (iF$a$e)var12_12;
                                var12_12.resume();
                                break;
                            } while ((var15_15 = var13_13.get(var9_9)) == var12_12);
                        }
                    }
                    var1_1 = var1_1.q();
                    var12_12 = j90_0.COROUTINE_SUSPENDED;
                    if (var1_1 == var12_12) {
                        var12_12 = "frame";
                        Intrinsics.checkNotNullParameter(var3_3, (String)var12_12);
                    }
                    if (var1_1 != var7_7) continue;
                    return var7_7;
                }
                var1_1 = new NoWhenBranchMatchedException();
                throw var1_1;
            }
            return Unit.a;
        }
        throw var1_1;
    }

    public final void e(Throwable object) {
        Object var3_3;
        boolean bl2;
        Object object2 = this._closedCause;
        if (object2 != null) {
            return;
        }
        object2 = new yv_2((Throwable)object);
        object = h;
        do {
            var3_3 = null;
        } while (!(bl2 = ((AtomicReferenceFieldUpdater)object).compareAndSet(this, null, object2)) && (var3_3 = ((AtomicReferenceFieldUpdater)object).get(this)) == null);
        object = xv_2.a;
        object = ((yv_2)object2).a((Function1)object);
        this.k((Throwable)object);
    }

    public final Throwable f() {
        Object object = (yv_2)this._closedCause;
        if (object != null) {
            xv_2 xv_22 = xv_2.a;
            object = ((yv_2)object).a(xv_22);
        } else {
            object = null;
        }
        return object;
    }

    public final b93_0 g() {
        boolean bl2;
        Object object = (yv_2)this._closedCause;
        if (object != null) {
            iF$e iF$e = iF$e.a;
            String string2 = "wrap";
            Intrinsics.checkNotNullParameter(iF$e, string2);
            object = ((yv_2)object).a(iF$e);
            if (object != null) {
                throw object;
            }
        }
        if (bl2 = ((ee_2)(object = this.e)).g()) {
            this.m();
        }
        return this.e;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object h(int var1_1, f80_0 var2_2) {
        block18: {
            block12: {
                block14: {
                    block17: {
                        block15: {
                            block16: {
                                var3_3 /* !! */  = var2_2 instanceof iF$b;
                                if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
                                var4_4 = var2_2;
                                var4_4 = (iF$b)var2_2;
                                var5_5 = var4_4.f;
                                var6_6 = -1 << -1;
                                var7_7 = var5_5 & var6_6;
                                if (var7_7) {
                                    var4_4.f = var5_5 -= var6_6;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_4 = new iF$b(this, (f80_0)var2_2);
                                }
                                var2_2 = var4_4.d;
                                var8_8 = j90_0.COROUTINE_SUSPENDED;
                                var6_6 = var4_4.f;
                                var7_7 = 1;
                                if (var6_6 == 0) break block15;
                                if (var6_6 != var7_7) break block16;
                                var1_1 = var4_4.c;
                                var9_9 = var4_4.b;
                                var10_10 = var4_4.a;
                                vl2_2.b(var2_2);
                                break block17;
                            }
                            var11_11 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var11_11;
                        }
                        vl2_2.b(var2_2);
                        Intrinsics.checkNotNullParameter(this, "<this>");
                        var2_2 = this.f();
                        if (var2_2 != null) break block18;
                        var2_2 = this.e;
                        var12_14 = var2_2.c;
                        var14_15 = var1_1;
                        cfr_temp_0 = var12_14 - var14_15;
                        var16_16 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var16_16 /* !! */  >= 0) {
                            return Boolean.TRUE;
                        }
                        var9_9 = this;
                        var10_10 = this;
                    }
                    do {
                        block13: {
                            block20: {
                                block19: {
                                    var17_17 = var10_10.flushBufferSize;
                                    var2_2 = var10_10.e;
                                    var19_18 = var2_2.c;
                                    cfr_temp_1 = (var17_17 += var19_18) - (var19_18 = (long)var1_1);
                                    var16_16 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                    if (var16_16 /* !! */  >= 0 || (var2_2 = var10_10._closedCause) != null) break block12;
                                    var4_4.a = var10_10;
                                    var4_4.b = var9_9;
                                    var4_4.c = var1_1;
                                    var4_4.f = var7_7;
                                    var21_19 = zj1_2.b(var4_4);
                                    var2_2 = new CancellableContinuationImpl(var7_7, (f80_0)var21_19);
                                    var2_2.r();
                                    var21_19 = new iF$a$d((CancellableContinuationImpl)var2_2);
                                    var22_20 = (iF$a)var9_9.suspensionSlot;
                                    var23_21 = var22_20 instanceof iF$a$a;
                                    if (var23_21 == 0) {
                                        var24_22 = if_1.g;
                                        while (!(var25_23 = var24_22.compareAndSet(var9_9, var22_20, var21_19))) {
                                            var26_24 = var24_22.get(var9_9);
                                            if (var26_24 == var22_20) continue;
                                            var21_19.resume();
                                            break block13;
                                        }
                                    }
                                    if (!(var27_25 = var22_20 instanceof iF$a$d)) break block19;
                                    var22_20 = (iF$a$e)var22_20;
                                    var28_26 = var22_20.b();
                                    var24_22 = "read";
                                    var21_19 = new ConcurrentIOException((String)var24_22, (Throwable)var28_26);
                                    var22_20.a((Throwable)var21_19);
                                    ** GOTO lbl86
                                }
                                var27_25 = var22_20 instanceof iF$a$e;
                                if (!var27_25) break block20;
                                var22_20 = (iF$a$e)var22_20;
                                var22_20.resume();
                                ** GOTO lbl86
                            }
                            if (var23_21 != 0) {
                                var22_20 = ((iF$a$a)var22_20).b;
                                var21_19.a((Throwable)var22_20);
                            } else {
                                var21_19 = iF$a$c.b;
                                var29_27 = Intrinsics.areEqual(var22_20, var21_19);
                                if (var29_27 == 0) break block14;
lbl86:
                                // 3 sources

                                var29_27 = var10_10.flushBufferSize;
                                var17_17 = var29_27;
                                var28_26 = var10_10.e;
                                var30_28 = var28_26.c;
                                cfr_temp_2 = (var17_17 += var30_28) - var19_18;
                                var23_21 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                if ((var23_21 >= 0 || (var21_19 = var10_10._closedCause) != null) && (var32_29 = (var21_19 = (iF$a)var9_9.suspensionSlot) instanceof iF$a$d)) {
                                    var22_20 = if_1.g;
                                    var33_30 = iF$a$c.b;
                                    do {
                                        if (!(var34_31 = var22_20.compareAndSet(var9_9, var21_19, var33_30))) continue;
                                        var21_19 = (iF$a$e)var21_19;
                                        var21_19.resume();
                                        break;
                                    } while ((var35_32 = var22_20.get(var9_9)) == var21_19);
                                }
                            }
                        }
                        var2_2 = var2_2.q();
                        var21_19 = j90_0.COROUTINE_SUSPENDED;
                        if (var2_2 != var21_19) continue;
                        var21_19 = "frame";
                        Intrinsics.checkNotNullParameter(var4_4, (String)var21_19);
                    } while (var2_2 != var8_8);
                    return var8_8;
                }
                var11_12 = new NoWhenBranchMatchedException();
                throw var11_12;
            }
            var11_13 = var10_10.e;
            var36_33 = var11_13.c;
            var38_34 = 0x100000L;
            cfr_temp_3 = var36_33 - var38_34;
            var6_6 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
            if (var6_6 < 0) {
                var10_10.m();
            }
            var11_13 = var10_10.e;
            var36_33 = var11_13.c;
            cfr_temp_4 = var36_33 - var19_18;
            var3_3 /* !! */  = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
            if (var3_3 /* !! */  < 0) {
                var7_7 = 0;
            }
            return (boolean)var7_7;
        }
        throw var2_2;
    }

    public final boolean i() {
        int n3;
        Object object = this.f();
        if (object == null && ((n3 = this.a()) == 0 || (n3 = this.flushBufferSize) != 0 || (n3 = (int)(((ee_2)(object = this.e)).g() ? 1 : 0)) == 0)) {
            n3 = 0;
            object = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }

    public final void j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        this.l();
        yv_2 yv_22 = zv_2.a;
        do {
            boolean bl2;
            if (!(bl2 = (atomicReferenceFieldUpdater = h).compareAndSet(this, null, yv_22))) continue;
            this.k(null);
            return;
        } while ((atomicReferenceFieldUpdater = atomicReferenceFieldUpdater.get(this)) == null);
    }

    public final void k(Throwable throwable) {
        iF$a iF$a;
        if (throwable != null) {
            iF$a = new iF$a$a(throwable);
        } else {
            iF$a.a.getClass();
            iF$a = iF$a$b.b;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        iF$a = atomicReferenceFieldUpdater.getAndSet(this, iF$a);
        boolean bl2 = iF$a instanceof iF$a$e;
        if (!bl2) {
            return;
        }
        ((iF$a$e)iF$a).a(throwable);
    }

    public final void l() {
        Object object = this.f;
        boolean bl2 = ((ee_2)object).g();
        if (bl2) {
            return;
        }
        object = this.d;
        synchronized (object) {
            int n3;
            Object object2;
            Object object3 = this.f;
            long l2 = ((ee_2)object3).c;
            int n4 = (int)l2;
            try {
                object2 = this.c;
                ((ee_2)object2).J((we2_2)object3);
                this.flushBufferSize = n3 = this.flushBufferSize + n4;
                object3 = Unit.a;
                object = (iF$a)this.suspensionSlot;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            finally {
            }
            n3 = object instanceof iF$a$d;
            if (n3 != 0) {
                Object v4;
                object3 = g;
                object2 = iF$a$c.b;
                do {
                    if ((n4 = (int)(((AtomicReferenceFieldUpdater)object3).compareAndSet(this, object, object2) ? 1 : 0)) == 0) continue;
                    object = (iF$a$e)object;
                    object.resume();
                    break;
                } while ((v4 = ((AtomicReferenceFieldUpdater)object3).get(this)) == object);
            }
            return;
        }
    }

    public final void m() {
        Object object = this.d;
        synchronized (object) {
            Object object2 = this.c;
            Object object3 = this.e;
            ((ee_2)object2).A0((z63_0)object3);
            boolean bl2 = false;
            object2 = null;
            try {
                this.flushBufferSize = 0;
                object2 = Unit.a;
                object = (iF$a)this.suspensionSlot;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            finally {
            }
            bl2 = object instanceof iF$a$f;
            if (bl2) {
                Object v4;
                object2 = g;
                object3 = iF$a$c.b;
                do {
                    boolean bl3;
                    if (!(bl3 = ((AtomicReferenceFieldUpdater)object2).compareAndSet(this, object, object3))) continue;
                    object = (iF$a$e)object;
                    object.resume();
                    break;
                } while ((v4 = ((AtomicReferenceFieldUpdater)object2).get(this)) == object);
            }
            return;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ByteChannel[");
        int n3 = this.hashCode();
        stringBuilder.append(n3);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

