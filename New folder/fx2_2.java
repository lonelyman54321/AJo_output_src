/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.b;

/*
 * Renamed from FX2
 */
public final class fx2_2
implements b,
gx2_2,
me3_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    public final CoroutineContext a;
    public ArrayList b;
    public Object c;
    public int d;
    public Object e;
    private volatile /* synthetic */ Object state$volatile;

    static {
        f = AtomicReferenceFieldUpdater.newUpdater(fx2_2.class, Object.class, "state$volatile");
    }

    public fx2_2(CoroutineContext object) {
        this.a = object;
        this.state$volatile = object = hx2_2.a;
        object = new ArrayList(2);
        this.b = object;
        this.d = -1;
        this.e = object = hx2_2.d;
    }

    public final void a(wx2_2 wx2_22, int n3) {
        this.c = wx2_22;
        this.d = n3;
    }

    public final void b(Throwable object) {
        gh3_2 gh3_22;
        Object object2;
        while ((object2 = ((AtomicReferenceFieldUpdater)(object = f)).get(this)) != (gh3_22 = hx2_2.b)) {
            Object v4;
            gh3_22 = hx2_2.c;
            do {
                boolean bl2;
                boolean bl3;
                if (!(bl3 = ((AtomicReferenceFieldUpdater)object).compareAndSet(this, object2, gh3_22))) continue;
                object = this.b;
                if (object == null) {
                    return;
                }
                object = object.iterator();
                while (bl2 = object.hasNext()) {
                    object2 = (FX2$a)object.next();
                    ((FX2$a)object2).a();
                }
                this.e = object = hx2_2.d;
                this.b = null;
                return;
            } while ((v4 = ((AtomicReferenceFieldUpdater)object).get(this)) == object2);
        }
        return;
    }

    public final void c(Object object) {
        this.e = object;
    }

    public final boolean d(Object object, Object object2) {
        int n3 = this.j(object, object2);
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public final Object e(f80_0 f80_02) {
        Object object = f;
        Object object2 = ((AtomicReferenceFieldUpdater)object).get(this);
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        object2 = (FX2$a)object2;
        Object object3 = this.e;
        Object object4 = this.b;
        if (object4 != null) {
            boolean bl2;
            object4 = ((ArrayList)object4).iterator();
            while (bl2 = object4.hasNext()) {
                FX2$a fX2$a = (FX2$a)object4.next();
                if (fX2$a == object2) continue;
                fX2$a.a();
            }
            object4 = hx2_2.b;
            ((AtomicReferenceFieldUpdater)object).set(this, object4);
            this.e = object = hx2_2.d;
            object = null;
            this.b = null;
        }
        object = ((FX2$a)object2).a;
        object4 = ((FX2$a)object2).d;
        object = ((FX2$a)object2).c.invoke(object, object4, object3);
        return ((FX2$a)object2).b(f80_02, object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object f(f80_0 var1_1) {
        block21: {
            block19: {
                block20: {
                    block15: {
                        block16: {
                            block17: {
                                block18: {
                                    var2_2 = var1_1 instanceof FX2$b;
                                    if (!var2_2) ** GOTO lbl-1000
                                    var3_3 = var1_1;
                                    var3_3 = (FX2$b)var1_1;
                                    var4_4 = var3_3.d;
                                    var5_5 = -1 << -1;
                                    var6_6 = var4_4 & var5_5;
                                    if (var6_6 != 0) {
                                        var3_3.d = var4_4 -= var5_5;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var3_3 = new FX2$b(this, (f80_0)var1_1);
                                    }
                                    var1_1 = var3_3.b;
                                    var7_7 = j90_0.COROUTINE_SUSPENDED;
                                    var5_5 = var3_3.d;
                                    var6_6 = 0;
                                    var8_8 = 2;
                                    var9_9 = 1;
                                    if (var5_5 == 0) break block16;
                                    if (var5_5 == var9_9) break block17;
                                    if (var5_5 != var8_8) break block18;
                                    vl2_2.b(var1_1);
                                    break block19;
                                }
                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var1_1;
                            }
                            var10_10 = var3_3.a;
                            vl2_2.b(var1_1);
                            break block20;
                        }
                        vl2_2.b(var1_1);
                        var3_3.a = this;
                        var3_3.d = var9_9;
                        var10_10 = zj1_2.b((f80_0)var3_3);
                        var1_1 = new CancellableContinuationImpl(var9_9, (f80_0)var10_10);
                        var1_1.r();
                        block0: while (true) {
                            if ((var11_11 /* !! */  = (var10_10 = fx2_2.f).get(this)) == (var12_12 = hx2_2.a)) {
                                do {
                                    if ((var13_13 = var10_10.compareAndSet(this, var11_11 /* !! */ , var1_1)) == 0) continue;
                                    dl_2.b((bl_2)var1_1, this);
                                    break block15;
                                } while ((var12_12 = var10_10.get(this)) == var11_11 /* !! */ );
                                continue;
                            }
                            var14_14 = var11_11 /* !! */  instanceof List;
                            if (!var14_14) break;
                            do {
                                if (!(var14_14 = var10_10.compareAndSet(this, var11_11 /* !! */ , var12_12))) continue;
                                var11_11 /* !! */  = (Iterable)var11_11 /* !! */ ;
                                var10_10 = var11_11 /* !! */ .iterator();
                                while (true) {
                                    if (!(var15_15 = var10_10.hasNext())) continue block0;
                                    var11_11 /* !! */  = var10_10.next();
                                    var11_11 /* !! */  = this.g(var11_11 /* !! */ );
                                    Intrinsics.checkNotNull(var11_11 /* !! */ );
                                    var11_11 /* !! */ .g = null;
                                    var11_11 /* !! */ .h = var13_13 = -1;
                                    this.i((FX2$a)var11_11 /* !! */ , (boolean)var9_9);
                                }
                            } while ((var16_16 = var10_10.get(this)) == var11_11 /* !! */ );
                        }
                        var5_5 = var11_11 /* !! */  instanceof FX2$a;
                        if (var5_5 == 0) break block21;
                        var10_10 = Unit.a;
                        var11_11 /* !! */  = (FX2$a)var11_11 /* !! */ ;
                        var17_17 = this.e;
                        var12_12 = var11_11 /* !! */ .f;
                        if (var12_12 != null) {
                            var11_11 /* !! */  = var11_11 /* !! */ .d;
                            var17_17 = (gx0_2)var12_12.invoke(this, var11_11 /* !! */ , var17_17);
                        } else {
                            var9_9 = 0;
                            var17_17 = null;
                        }
                        var1_1.F(var10_10, (gx0_2)var17_17);
                    }
                    var1_1 = var1_1.q();
                    var10_10 = j90_0.COROUTINE_SUSPENDED;
                    if (var1_1 == var10_10) {
                        var17_17 = "frame";
                        Intrinsics.checkNotNullParameter(var3_3, (String)var17_17);
                    }
                    if (var1_1 != var10_10) {
                        var1_1 = Unit.a;
                    }
                    if (var1_1 == var7_7) {
                        return var7_7;
                    }
                    var10_10 = this;
                }
                var3_3.a = null;
                var3_3.d = var8_8;
                var1_1 = var10_10.e((f80_0)var3_3);
                if (var1_1 == var7_7) {
                    return var7_7;
                }
            }
            return var1_1;
        }
        var3_3 = new StringBuilder("unexpected state: ");
        var3_3.append(var11_11 /* !! */ );
        var3_3 = var3_3.toString().toString();
        var1_1 = new IllegalStateException((String)var3_3);
        throw var1_1;
    }

    public final FX2$a g(Object object) {
        boolean bl2;
        Object object2 = this.b;
        Object object3 = null;
        if (object2 == null) {
            return null;
        }
        object2 = object2.iterator();
        while (bl2 = object2.hasNext()) {
            Object e2;
            Object object4 = e2 = object2.next();
            object4 = ((FX2$a)e2).a;
            if (object4 != object) continue;
            object3 = e2;
            break;
        }
        if ((object3 = (FX2$a)object3) != null) {
            return object3;
        }
        object3 = new StringBuilder("Clause with object ");
        ((StringBuilder)object3).append(object);
        ((StringBuilder)object3).append(" is not found");
        object = ((StringBuilder)object3).toString().toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public final CoroutineContext getContext() {
        return this.a;
    }

    public final void h(ex2_2 ex2_22, TS0$b tS0$b) {
        Object object = ex2_22.a();
        gx0_2 gx0_22 = ex2_22.d();
        gx0_2 gx0_23 = ex2_22.c();
        gx0_2 gx0_24 = ex2_22.b();
        FX2$a fX2$a = new FX2$a(this, object, gx0_22, gx0_23, null, tS0$b, gx0_24);
        this.i(fX2$a, false);
    }

    public final void i(FX2$a object, boolean bl2) {
        Object object2;
        Object object3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Object object4 = atomicReferenceFieldUpdater.get(this);
        boolean bl3 = object4 instanceof FX2$a;
        if (bl3) {
            return;
        }
        object4 = ((FX2$a)object).a;
        if (!bl2) {
            object3 = this.b;
            Intrinsics.checkNotNull(object3);
            boolean bl4 = object3 instanceof Collection;
            if (!bl4 || !(bl4 = ((Collection)object3).isEmpty())) {
                object3 = ((Iterable)object3).iterator();
                while (bl4 = object3.hasNext()) {
                    object2 = ((FX2$a)object3.next()).a;
                    if (object2 != object4) continue;
                    object = jk0_0.a(object4, "Cannot use select clauses on the same object: ");
                    object = object.toString();
                    IllegalStateException object5 = new IllegalStateException((String)object);
                    throw object5;
                }
            }
        }
        object3 = ((FX2$a)object).d;
        object2 = ((FX2$a)object).b;
        object2.invoke(object4, this, object3);
        object4 = this.e;
        object3 = hx2_2.d;
        if (object4 == object3) {
            int n3;
            int n4;
            Object object5;
            if (!bl2) {
                object5 = this.b;
                Intrinsics.checkNotNull(object5);
                object5.add(object);
            }
            ((FX2$a)object).g = object5 = this.c;
            ((FX2$a)object).h = n4 = this.d;
            object = null;
            this.c = null;
            this.d = n3 = -1;
        } else {
            atomicReferenceFieldUpdater.set(this, object);
        }
    }

    public final int j(Object object, Object object2) {
        block10: {
            Object object3;
            while (true) {
                boolean bl2;
                gx0_2 gx0_22;
                Object object4;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                object3 = atomicReferenceFieldUpdater.get(this);
                boolean bl3 = object3 instanceof bl_2;
                int n3 = 2;
                if (bl3) {
                    Object object5;
                    object4 = this.g(object);
                    if (object4 == null) continue;
                    gx0_22 = ((FX2$a)object4).f;
                    if (gx0_22 != null) {
                        object5 = ((FX2$a)object4).d;
                        gx0_22 = (gx0_2)gx0_22.invoke(this, object5, object2);
                    } else {
                        bl2 = false;
                        gx0_22 = null;
                    }
                    do {
                        boolean bl4;
                        if (!(bl4 = atomicReferenceFieldUpdater.compareAndSet(this, object3, object4))) continue;
                        object3 = (bl_2)object3;
                        this.e = object2;
                        object = Unit.a;
                        if ((object = object3.v(object, gx0_22)) == null) {
                            this.e = object = hx2_2.d;
                            return n3;
                        }
                        object3.J(object);
                        return 0;
                    } while ((object5 = atomicReferenceFieldUpdater.get(this)) == object3);
                    continue;
                }
                object4 = hx2_2.b;
                bl3 = Intrinsics.areEqual(object3, object4);
                if (bl3 || (bl3 = object3 instanceof FX2$a)) break block10;
                object4 = hx2_2.c;
                bl3 = Intrinsics.areEqual(object3, object4);
                if (bl3) {
                    return n3;
                }
                object4 = hx2_2.a;
                bl3 = Intrinsics.areEqual(object3, object4);
                n3 = 1;
                if (bl3) {
                    object4 = kotlin.collections.a.b(object);
                    do {
                        if (!(bl2 = atomicReferenceFieldUpdater.compareAndSet(this, object3, object4))) continue;
                        return n3;
                    } while ((gx0_22 = atomicReferenceFieldUpdater.get(this)) == object3);
                    continue;
                }
                bl3 = object3 instanceof List;
                if (!bl3) break;
                object4 = object3;
                object4 = CollectionsKt.X((Collection)object3, object);
                do {
                    if (!(bl2 = atomicReferenceFieldUpdater.compareAndSet(this, object3, object4))) continue;
                    return n3;
                } while ((gx0_22 = atomicReferenceFieldUpdater.get(this)) == object3);
            }
            object2 = new StringBuilder("Unexpected state: ");
            ((StringBuilder)object2).append(object3);
            object2 = ((StringBuilder)object2).toString().toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        return 3;
    }
}

