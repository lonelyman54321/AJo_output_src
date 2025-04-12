/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from Kb3
 */
public final class kb3_2
extends p1_0
implements ur1_2,
es0_2,
ox0_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    static {
        f = AtomicReferenceFieldUpdater.newUpdater(kb3_2.class, Object.class, "_state$volatile");
    }

    public kb3_2(Object object) {
        this._state$volatile = object;
    }

    public final boolean a(Object object) {
        this.setValue(object);
        return true;
    }

    public final List c() {
        return kotlin.collections.a.b(this.getValue());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object collect(fs0_2 var1_1, f80_0 var2_5) {
        block21: {
            block23: {
                block22: {
                    block24: {
                        var3_6 = var2_5 instanceof kb3$a_0;
                        if (!var3_6) ** GOTO lbl-1000
                        var4_7 = var2_5;
                        var4_7 = (kb3$a_0)var2_5;
                        var5_8 = var4_7.h;
                        var6_9 = -1 << -1;
                        var7_10 = var5_8 & var6_9;
                        if (var7_10 != 0) {
                            var4_7.h = var5_8 -= var6_9;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_7 = new kb3$a_0(this, (f80_0)var2_5);
                        }
                        var2_5 = var4_7.f;
                        var8_11 = j90_0.COROUTINE_SUSPENDED;
                        var6_9 = var4_7.h;
                        var7_10 = 0;
                        var9_12 = 3;
                        var10_13 = 2;
                        var11_14 = 1;
                        if (var6_9 == 0) break block24;
                        if (var6_9 != var11_14) {
                            if (var6_9 != var10_13) {
                                if (var6_9 != var9_12) {
                                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var1_1;
                                }
                                var1_1 = var4_7.e;
                                var12_15 = var4_7.d;
                                var13_16 = var4_7.c;
                                var14_17 = var4_7.b;
                                var15_18 = var4_7.a;
                                vl2_2.b(var2_5);
                                break block21;
                            }
                            var1_1 = var4_7.e;
                            var12_15 = var4_7.d;
                            var13_16 = var4_7.c;
                            var14_17 = var4_7.b;
                            var15_18 = var4_7.a;
                            vl2_2.b(var2_5);
                            ** GOTO lbl-1000
                        } else {
                            var13_16 = var4_7.c;
                            var1_1 = var4_7.b;
                            var15_18 = var4_7.a;
                            vl2_2.b(var2_5);
                            break block22;
                        }
                    }
                    vl2_2.b(var2_5);
                    var2_5 = (mb3_1)this.f();
                    var6_9 = var1_1 instanceof bf3_2;
                    if (var6_9 != 0) {
                        var12_15 = var1_1;
                        try {
                            var12_15 = (bf3_2)var1_1;
                            var4_7.a = this;
                            var4_7.b = (fs0_2)var1_1;
                            var4_7.c = var2_5;
                            var4_7.h = var11_14;
                            var12_15 = var12_15.c((f80_0)var4_7);
                            if (var12_15 == var8_11) {
                                return var8_11;
                            }
                        }
                        catch (Throwable var1_3) {
                            var15_18 = this;
                            var13_16 = var2_5;
                            break block23;
                        }
                    }
                    var15_18 = this;
                    var13_16 = var2_5;
                }
                try {
                    var2_5 = var4_7.getContext();
                    var12_15 = i$a.a;
                    var2_5 = var2_5.get((CoroutineContext$a)var12_15);
                    var2_5 = (i)var2_5;
                    var14_17 = var1_1;
                    var12_15 = var2_5;
                    var1_1 = null;
                    break block21;
                }
                catch (Throwable var1_2) {}
            }
            var15_18.i((r1_0)var13_16);
            throw var1_4;
        }
        while (true) {
            var2_5 = kb3_2.f;
            var2_5 = var2_5.get(var15_18);
            if (var12_15 != null && !(var16_19 = var12_15.isActive())) {
                var1_1 = var12_15.w();
                throw var1_1;
            }
            if (var1_1 != null && (var16_19 = Intrinsics.areEqual(var1_1, var2_5))) ** GOTO lbl-1000
            var1_1 = k52_0.a;
            var1_1 = var2_5 == var1_1 ? null : var2_5;
            {
                var4_7.a = var15_18;
                var4_7.b = (fs0_2)var14_17;
                var4_7.c = var13_16;
                var4_7.d = var12_15;
                var4_7.e = var2_5;
                var4_7.h = var10_13;
                if ((var1_1 = ((fs0_2)var14_17).emit(var1_1, (f80_0)var4_7)) == var8_11) {
                    return var8_11;
                }
                var1_1 = var2_5;
            }
lbl-1000:
            // 3 sources

            {
                var2_5 = var13_16.a;
                var17_20 = lb3_2.a;
                var2_5 = var2_5.getAndSet(var17_20);
                Intrinsics.checkNotNull(var2_5);
                var17_20 = lb3_2.b;
                if (var2_5 == var17_20) continue;
            }
            {
                var4_7.a = var15_18;
                var4_7.b = (fs0_2)var14_17;
                var4_7.c = var13_16;
                var4_7.d = var12_15;
                var4_7.e = var1_1;
                var4_7.h = var9_12;
                var2_5 = var13_16.c((kb3$a_0)var4_7);
                if (var2_5 == var8_11) return var8_11;
                continue;
            }
            break;
        }
    }

    public final void d() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
        throw unsupportedOperationException;
    }

    public final es0_2 e(CoroutineContext object, int n3, he_2 he_22) {
        he_2 he_23;
        int n4;
        object = (n3 >= 0 && n3 < (n4 = 2) || n3 == (n4 = -2)) && he_22 == (he_23 = he_2.DROP_OLDEST) ? this : k23_0.e(this, (CoroutineContext)object, n3, he_22);
        return object;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        this.setValue(object);
        return Unit.a;
    }

    public final r1_0 g() {
        mb3_1 mb3_12 = new mb3_1();
        return mb3_12;
    }

    public final Object getValue() {
        gh3_2 gh3_22 = k52_0.a;
        Object v4 = f.get(this);
        if (v4 == gh3_22) {
            v4 = null;
        }
        return v4;
    }

    public final r1_0[] h() {
        return new mb3_1[2];
    }

    public final boolean j(Object object, Object object2) {
        gh3_2 gh3_22 = k52_0.a;
        if (object == null) {
            object = gh3_22;
        }
        if (object2 == null) {
            object2 = gh3_22;
        }
        return this.k(object, object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean k(Object r1_0Array, Object r1_0Array2) {
        Throwable throwable3;
        int n3;
        int n4;
        Object v4;
        Object object;
        int n7;
        block20: {
            n7 = 1;
            synchronized (this) {
                Throwable throwable22;
                block19: {
                    block18: {
                        block17: {
                            try {
                                object = f;
                                v4 = ((AtomicReferenceFieldUpdater)object).get(this);
                                if (r1_0Array == null || (n4 = Intrinsics.areEqual(v4, r1_0Array)) != 0) break block17;
                            }
                            catch (Throwable throwable22) {}
                            return false;
                        }
                        n4 = Intrinsics.areEqual(v4, r1_0Array2);
                        if (n4 == 0) break block18;
                        return n7 != 0;
                    }
                    ((AtomicReferenceFieldUpdater)object).set(this, r1_0Array2);
                    n4 = this.e;
                    n3 = n4 & 1;
                    if (n3 != 0) break block19;
                    this.e = n4 += n7;
                    r1_0Array2 = this.a;
                    object = Unit.a;
                    break block20;
                }
                n4 += 2;
                this.e = n4;
                return n7 != 0;
                throw throwable22;
            }
        }
        while (true) {
            if ((r1_0Array2 = (mb3_1[])r1_0Array2) != null) {
                int n8 = r1_0Array2.length;
                v4 = null;
                block10: for (int i3 = 0; i3 < n8; i3 += n7) {
                    gh3_2 gh3_22;
                    Object object2;
                    Object object3 = r1_0Array2[i3];
                    if (object3 == null) continue;
                    object3 = ((mb3_1)object3).a;
                    block11: while ((object2 = ((AtomicReference)object3).get()) != null && object2 != (gh3_22 = lb3_2.b)) {
                        gh3_2 gh3_23 = lb3_2.a;
                        if (object2 == gh3_23) {
                            boolean bl2;
                            while (!(bl2 = ((AtomicReference)object3).compareAndSet(object2, gh3_22))) {
                                gh3_23 = ((AtomicReference)object3).get();
                                if (gh3_23 == object2) continue;
                                continue block11;
                            }
                            continue block10;
                        }
                        do {
                            boolean bl3;
                            if (!(bl3 = ((AtomicReference)object3).compareAndSet(object2, gh3_23))) continue;
                            object2 = (CancellableContinuationImpl)object2;
                            object3 = tl2_2.b;
                            object3 = Unit.a;
                            ((CancellableContinuationImpl)object2).resumeWith(object3);
                            continue block10;
                        } while ((gh3_22 = ((AtomicReference)object3).get()) == object2);
                    }
                }
            }
            synchronized (this) {
                try {
                    n3 = this.e;
                    if (n3 == n4) {
                        this.e = n4 += n7;
                        return n7 != 0;
                    }
                }
                catch (Throwable throwable3) {
                    break;
                }
                r1_0Array = this.a;
                object = Unit.a;
            }
            r1_0Array2 = r1_0Array;
            n4 = n3;
        }
        {
            throw throwable3;
        }
    }

    public final void setValue(Object object) {
        if (object == null) {
            object = k52_0.a;
        }
        this.k(null, object);
    }
}

