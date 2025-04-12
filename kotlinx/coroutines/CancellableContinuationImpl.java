/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.b;
import kotlinx.coroutines.b$a;
import kotlinx.coroutines.c;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;
import kotlinx.coroutines.internal.DispatchedContinuation;

public class CancellableContinuationImpl
extends DispatchedTask
implements bl_2,
k90_0,
me3_2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f;
    public static final /* synthetic */ AtomicReferenceFieldUpdater g;
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final f80_0 d;
    public final CoroutineContext e;

    static {
        Class<CancellableContinuationImpl> clazz = CancellableContinuationImpl.class;
        f = AtomicIntegerFieldUpdater.newUpdater(clazz, "_decisionAndIndex$volatile");
        Class<Object> clazz2 = Object.class;
        g = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_state$volatile");
        h = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_parentHandle$volatile");
    }

    public CancellableContinuationImpl(int n3, f80_0 f80_02) {
        super(n3);
        this.d = f80_02;
        Object object = f80_02.getContext();
        this.e = object;
        this._decisionAndIndex$volatile = -1 >>> 3;
        this._state$volatile = object = r2_0.a;
    }

    public static Object D(p42_0 p42_02, Object object, int n3, gx0_2 gx0_22) {
        boolean bl2 = object instanceof m00_0;
        if (!(bl2 || (n3 = (int)(er0_1.a(n3) ? 1 : 0)) == 0 || gx0_22 == null && (n3 = p42_02 instanceof b) == 0)) {
            bl2 = p42_02 instanceof b;
            p42_02 = bl2 ? (b)p42_02 : null;
            int n4 = 16;
            k00_0 k00_02 = new k00_0(object, (b)p42_02, gx0_22, null, n4);
            object = k00_02;
        }
        return object;
    }

    public static void w(Object object, Object object2) {
        StringBuilder stringBuilder = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
        stringBuilder.append(object);
        stringBuilder.append(", already has ");
        stringBuilder.append(object2);
        object = stringBuilder.toString().toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void A() {
        block5: {
            block6: {
                var1_1 = this.d;
                var2_2 = var1_1 instanceof DispatchedContinuation;
                var3_3 = null;
                var1_1 = var2_2 != false ? (DispatchedContinuation)var1_1 : null;
                if (var1_1 == null) break block5;
                block0: while ((var5_5 = (var4_4 = DispatchedContinuation.h).get(var1_1)) == (var6_6 /* !! */  = dr0_2.b)) {
                    while (!(var7_7 = var4_4.compareAndSet(var1_1, var6_6 /* !! */ , this))) {
                        var5_5 = var4_4.get(var1_1);
                        if (var5_5 == var6_6 /* !! */ ) continue;
                        continue block0;
                    }
                    ** GOTO lbl18
                }
                var8_8 = var5_5 instanceof Throwable;
                if (!var8_8) break block6;
                do {
                    if (!(var8_8 = var4_4.compareAndSet(var1_1, var5_5, null))) continue;
                    var3_3 = (Throwable)var5_5;
                    var3_3 = (Throwable)var5_5;
lbl18:
                    // 2 sources

                    if (var3_3 != null) {
                        this.l();
                        this.e(var3_3);
                        return;
                    }
                    break block5;
                } while ((var6_6 /* !! */  = var4_4.get(var1_1)) == var5_5);
                var4_4 = "Failed requirement.".toString();
                var1_1 = new IllegalArgumentException((String)var4_4);
                throw var1_1;
            }
            var4_4 = new StringBuilder("Inconsistent state ");
            var4_4.append(var5_5);
            var4_4 = var4_4.toString().toString();
            var1_1 = new IllegalStateException((String)var4_4);
            throw var1_1;
        }
    }

    public final void B(Function1 function1, Object object) {
        int n3 = this.c;
        cl_2 cl_22 = new cl_2(function1);
        this.C(object, n3, cl_22);
    }

    public final void C(Object object, int n3, gx0_2 object2) {
        Object object3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object object4;
        int n4;
        while ((n4 = (object4 = (atomicReferenceFieldUpdater = g).get(this)) instanceof p42_0) != 0) {
            Object v4;
            Object object5 = object4;
            object5 = CancellableContinuationImpl.D((p42_0)object4, object, n3, (gx0_2)object2);
            do {
                boolean bl2;
                if (!(bl2 = atomicReferenceFieldUpdater.compareAndSet(this, object4, object5))) continue;
                boolean bl3 = this.u();
                if (!bl3) {
                    this.l();
                }
                this.m(n3);
                return;
            } while ((v4 = atomicReferenceFieldUpdater.get(this)) == object4);
        }
        n3 = object4 instanceof gl_2;
        if (n3 != 0) {
            object4 = (gl_2)object4;
            object4.getClass();
            object3 = gl_2.c;
            atomicReferenceFieldUpdater = null;
            n4 = 1;
            n3 = (int)(((AtomicIntegerFieldUpdater)object3).compareAndSet(object4, 0, n4) ? 1 : 0);
            if (n3 != 0) {
                if (object2 != null) {
                    object3 = ((m00_0)object4).a;
                    this.j((gx0_2)object2, (Throwable)object3, object);
                }
                return;
            }
        }
        object2 = new StringBuilder("Already resumed, but proposed with update ");
        ((StringBuilder)object2).append(object);
        object = ((StringBuilder)object2).toString().toString();
        object3 = new IllegalStateException((String)object);
        throw object3;
    }

    public final void E(c c2, Object object) {
        Object object2 = this.d;
        boolean bl2 = object2 instanceof DispatchedContinuation;
        object2 = bl2 ? (DispatchedContinuation)object2 : null;
        object2 = object2 != null ? ((DispatchedContinuation)object2).d : null;
        int n3 = object2 == c2 ? 4 : this.c;
        this.C(object, n3, null);
    }

    public final void F(Object object, gx0_2 gx0_22) {
        int n3 = this.c;
        this.C(object, n3, gx0_22);
    }

    public final gh3_2 G(Object object, gx0_2 gx0_22) {
        Object v4;
        while (true) {
            Object v5;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            v4 = atomicReferenceFieldUpdater.get(this);
            boolean bl2 = v4 instanceof p42_0;
            gh3_2 gh3_22 = I70.a;
            if (!bl2) break;
            Object object2 = v4;
            object2 = (p42_0)v4;
            int n3 = this.c;
            object2 = CancellableContinuationImpl.D(object2, object, n3, gx0_22);
            do {
                if ((n3 = (int)(atomicReferenceFieldUpdater.compareAndSet(this, v4, object2) ? 1 : 0)) == 0) continue;
                boolean bl3 = this.u();
                if (!bl3) {
                    this.l();
                }
                return gh3_22;
            } while ((v5 = atomicReferenceFieldUpdater.get(this)) == v4);
        }
        boolean bl4 = v4 instanceof k00_0;
        return null;
    }

    public final void J(Object object) {
        int n3 = this.c;
        this.m(n3);
    }

    public final void a(wx2_2 object, int n3) {
        int n4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int n7;
        int n8;
        while ((n8 = (n7 = (atomicIntegerFieldUpdater = f).get(this)) & (n4 = -1 >>> 3)) == n4) {
            n4 = (n7 >> 29 << 29) + n3;
            boolean bl2 = atomicIntegerFieldUpdater.compareAndSet(this, n7, n4);
            if (!bl2) continue;
            this.t(object);
            return;
        }
        String string2 = "invokeOnCancellation should be called at most once".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final void b(CancellationException illegalStateException) {
        Object object;
        Object v4;
        boolean bl2;
        while (!(bl2 = (v4 = ((AtomicReferenceFieldUpdater)(object = g)).get(this)) instanceof p42_0)) {
            k00_0 k00_02;
            Object var9_9;
            int n3;
            Object object2;
            Object object3;
            bl2 = v4 instanceof m00_0;
            if (bl2) {
                return;
            }
            bl2 = v4 instanceof k00_0;
            if (bl2) {
                int n4;
                object3 = v4;
                object3 = (k00_0)v4;
                object2 = ((k00_0)object3).e;
                n3 = 1;
                if (object2 != null) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if ((n4 ^= n3) != 0) {
                    n4 = 15;
                    n3 = 0;
                    var9_9 = null;
                    object2 = k00_0.a(object3, null, illegalStateException, n4);
                    do {
                        if ((n3 = ((AtomicReferenceFieldUpdater)object).compareAndSet(this, v4, object2)) == 0) continue;
                        object = ((k00_0)object3).b;
                        if (object != null) {
                            this.i((b)object, illegalStateException);
                        }
                        if ((object = ((k00_0)object3).c) != null) {
                            object3 = ((k00_0)object3).a;
                            this.j((gx0_2)object, illegalStateException, object3);
                        }
                        return;
                    } while ((var9_9 = ((AtomicReferenceFieldUpdater)object).get(this)) == v4);
                    continue;
                }
                object = "Must be called at most once".toString();
                illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
            }
            n3 = 0;
            var9_9 = null;
            int n7 = 14;
            object3 = k00_02;
            object2 = v4;
            k00_02 = new k00_0(v4, null, null, (CancellationException)illegalStateException, n7);
            do {
                if (!(bl2 = ((AtomicReferenceFieldUpdater)object).compareAndSet(this, v4, k00_02))) continue;
                return;
            } while ((object3 = ((AtomicReferenceFieldUpdater)object).get(this)) == v4);
        }
        object = "Not completed".toString();
        illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final f80_0 c() {
        return this.d;
    }

    public final Throwable d(Object object) {
        if ((object = super.d(object)) == null) {
            object = null;
        }
        return object;
    }

    public final boolean e(Throwable throwable) {
        while (true) {
            Throwable throwable2;
            Object object = g;
            Object object2 = ((AtomicReferenceFieldUpdater)object).get(this);
            boolean bl2 = object2 instanceof p42_0;
            boolean bl3 = false;
            Object var6_6 = null;
            if (!bl2) {
                return false;
            }
            boolean bl4 = object2 instanceof b;
            boolean bl5 = true;
            if (bl4 || (bl4 = object2 instanceof wx2_2)) {
                bl3 = true;
            }
            if (throwable == null) {
                CharSequence charSequence = new StringBuilder("Continuation ");
                charSequence.append(this);
                String string2 = " was cancelled normally";
                charSequence.append(string2);
                charSequence = charSequence.toString();
                throwable2 = new CancellationException((String)charSequence);
            } else {
                throwable2 = throwable;
            }
            gl_2 gl_22 = new m00_0(throwable2, bl3);
            do {
                if (!(bl3 = ((AtomicReferenceFieldUpdater)object).compareAndSet(this, object2, gl_22))) continue;
                object = object2;
                object = (p42_0)object2;
                bl2 = object instanceof b;
                if (bl2) {
                    object2 = (b)object2;
                    this.i((b)object2, throwable);
                } else {
                    boolean bl6 = object instanceof wx2_2;
                    if (bl6) {
                        object2 = (wx2_2)object2;
                        this.k((wx2_2)object2, throwable);
                    }
                }
                int n3 = this.u();
                if (n3 == 0) {
                    this.l();
                }
                n3 = this.c;
                this.m(n3);
                return bl5;
            } while ((var6_6 = ((AtomicReferenceFieldUpdater)object).get(this)) == object2);
        }
    }

    public final Object f(Object object) {
        boolean bl2 = object instanceof k00_0;
        if (bl2) {
            object = ((k00_0)object).a;
        }
        return object;
    }

    public final k90_0 getCallerFrame() {
        Object object = this.d;
        boolean bl2 = object instanceof k90_0;
        object = bl2 ? (k90_0)object : null;
        return object;
    }

    public final CoroutineContext getContext() {
        return this.e;
    }

    public final Object h() {
        return g.get(this);
    }

    public final void i(b b2, Throwable throwable) {
        try {
            b2.b(throwable);
        }
        catch (Throwable throwable2) {
            String string2 = "Exception in invokeOnCancellation handler for ";
            CharSequence charSequence = new StringBuilder(string2);
            charSequence.append(this);
            charSequence = charSequence.toString();
            throwable = new RuntimeException((String)charSequence, throwable2);
            CoroutineContext coroutineContext = this.e;
            g90_0.a(coroutineContext, throwable);
        }
    }

    public final void j(gx0_2 gx0_22, Throwable throwable, Object object) {
        CoroutineContext coroutineContext = this.e;
        try {
            gx0_22.invoke(throwable, object, coroutineContext);
        }
        catch (Throwable throwable2) {
            String string2 = "Exception in resume onCancellation handler for ";
            object = new StringBuilder(string2);
            ((StringBuilder)object).append(this);
            object = ((StringBuilder)object).toString();
            throwable = new RuntimeException((String)object, throwable2);
            g90_0.a(coroutineContext, throwable);
        }
    }

    public final void k(wx2_2 object, Throwable object2) {
        object2 = this.e;
        Object object3 = f;
        int n3 = ((AtomicIntegerFieldUpdater)object3).get(this);
        int n4 = -1 >>> 3;
        if ((n3 &= n4) != n4) {
            try {
                ((wx2_2)object).h(n3, (CoroutineContext)object2);
            }
            catch (Throwable throwable) {
                String string2 = "Exception in invokeOnCancellation handler for ";
                CharSequence charSequence = new StringBuilder(string2);
                charSequence.append(this);
                charSequence = charSequence.toString();
                object3 = new RuntimeException((String)charSequence, throwable);
                g90_0.a((CoroutineContext)object2, (Throwable)object3);
            }
            return;
        }
        object2 = "The index for Segment.onCancellation(..) is broken".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        fr0_1 fr0_12 = (fr0_1)atomicReferenceFieldUpdater.get(this);
        if (fr0_12 == null) {
            return;
        }
        fr0_12.dispose();
        fr0_12 = l42_0.a;
        atomicReferenceFieldUpdater.set(this, fr0_12);
    }

    /*
     * WARNING - void declaration
     */
    public final void m(int n3) {
        int n4;
        int n7;
        int n8;
        Object object;
        int n10;
        do {
            if ((n4 = (n8 = ((AtomicIntegerFieldUpdater)(object = f)).get(this)) >> 29) == 0) continue;
            n10 = 1;
            if (n4 == n10) {
                void var3_7;
                c c2;
                int n14 = 4;
                if (n3 == n14) {
                    boolean bl2 = true;
                } else {
                    boolean bl3 = false;
                    c2 = null;
                }
                f80_0 f80_02 = this.d;
                if (var3_7 == false && (n7 = f80_02 instanceof DispatchedContinuation) != 0 && (n3 = (int)(er0_1.a(n3) ? 1 : 0)) == (n7 = (int)(er0_1.a(this.c) ? 1 : 0))) {
                    Object object2 = f80_02;
                    object2 = (DispatchedContinuation)f80_02;
                    c2 = ((DispatchedContinuation)object2).d;
                    object2 = ((DispatchedContinuation)object2).e.getContext();
                    n7 = (int)(dr0_2.c(c2, (CoroutineContext)object2) ? 1 : 0);
                    if (n7 != 0) {
                        dr0_2.b(c2, (CoroutineContext)object2, this);
                    } else {
                        object2 = cn3_0.a();
                        boolean bl4 = ((jb0_2)object2).Q0();
                        if (bl4) {
                            ((jb0_2)object2).O0(this);
                        } else {
                            ((jb0_2)object2).P0(n10 != 0);
                            try {
                                boolean bl5;
                                er0_1.b(this, f80_02, n10 != 0);
                                while (bl5 = ((jb0_2)object2).S0()) {
                                }
                            }
                            catch (Throwable throwable) {
                                try {
                                    this.g(throwable);
                                }
                                finally {
                                    ((jb0_2)object2).N0(n10 != 0);
                                }
                            }
                        }
                    }
                } else {
                    er0_1.b(this, f80_02, (boolean)var3_7);
                }
                return;
            }
            object = "Already resumed".toString();
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        } while ((n10 = (int)(((AtomicIntegerFieldUpdater)object).compareAndSet(this, n8, n7 = 0x40000000 + (n4 = -1 >>> 3 & n8)) ? 1 : 0)) == 0);
    }

    public final boolean n() {
        return g.get(this) instanceof p42_0 ^ true;
    }

    public Throwable o(JobSupport jobSupport) {
        return jobSupport.w();
    }

    public final boolean p() {
        return g.get(this) instanceof gl_2;
    }

    public final Object q() {
        int n3;
        int n4;
        int n7;
        Object object;
        int n8;
        boolean bl2 = this.u();
        do {
            if ((n3 = (n7 = ((AtomicIntegerFieldUpdater)(object = f)).get(this)) >> 29) == 0) continue;
            n8 = 2;
            if (n3 == n8) {
                Object object2;
                if (bl2) {
                    this.A();
                }
                if ((n8 = (object2 = g.get(this)) instanceof m00_0) == 0) {
                    n8 = (int)(er0_1.a(this.c) ? 1 : 0);
                    if (n8 != 0) {
                        object = i$a.a;
                        CoroutineContext coroutineContext = this.e;
                        if ((object = (i)coroutineContext.get((CoroutineContext$a)object)) != null && (n7 = (int)(object.isActive() ? 1 : 0)) == 0) {
                            object2 = object.w();
                            this.b((CancellationException)object2);
                            throw object2;
                        }
                    }
                    return this.f(object2);
                }
                throw ((m00_0)object2).a;
            }
            object = "Already suspended".toString();
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        } while ((n8 = (int)(((AtomicIntegerFieldUpdater)object).compareAndSet(this, n7, n4 = 0x20000000 + (n3 = -1 >>> 3 & n7)) ? 1 : 0)) == 0);
        object = (fr0_1)h.get(this);
        if (object == null) {
            this.s();
        }
        if (bl2) {
            this.A();
        }
        return j90_0.COROUTINE_SUSPENDED;
    }

    public final void r() {
        fr0_1 fr0_12 = this.s();
        if (fr0_12 == null) {
            return;
        }
        boolean bl2 = this.n();
        if (bl2) {
            fr0_12.dispose();
            fr0_12 = l42_0.a;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            atomicReferenceFieldUpdater.set(this, fr0_12);
        }
    }

    public final void resumeWith(Object object) {
        Throwable throwable = tl2_2.a(object);
        if (throwable != null) {
            object = new m00_0(throwable, false);
        }
        int n3 = this.c;
        this.C(object, n3, null);
    }

    public final fr0_1 s() {
        boolean bl2;
        Object object = i$a.a;
        if ((object = (i)this.e.get((CoroutineContext$a)object)) == null) {
            return null;
        }
        Object object2 = new iu_2(this);
        object = mm0.f((i)object, (cl1_2)object2);
        while (!(bl2 = ((AtomicReferenceFieldUpdater)(object2 = h)).compareAndSet(this, null, object)) && (object2 = ((AtomicReferenceFieldUpdater)object2).get(this)) == null) {
        }
        return object;
    }

    public final void t(Object object) {
        Object v4;
        while (true) {
            k00_0 k00_02;
            Object object2;
            int n3;
            Object object3;
            Object object4;
            Object object5;
            boolean bl2;
            if (bl2 = (v4 = ((AtomicReferenceFieldUpdater)(object5 = g)).get(this)) instanceof r2_0) {
                do {
                    if (!(bl2 = ((AtomicReferenceFieldUpdater)object5).compareAndSet(this, v4, object))) continue;
                    return;
                } while ((object4 = ((AtomicReferenceFieldUpdater)object5).get(this)) == v4);
                continue;
            }
            bl2 = v4 instanceof b;
            boolean bl3 = false;
            Throwable throwable = null;
            if (bl2 || (bl2 = v4 instanceof wx2_2)) break;
            bl2 = v4 instanceof m00_0;
            if (bl2) {
                object5 = v4;
                object5 = (m00_0)v4;
                object5.getClass();
                object3 = m00_0.b;
                n3 = 0;
                object2 = null;
                bl2 = ((AtomicIntegerFieldUpdater)object3).compareAndSet(object5, 0, 1);
                if (bl2) {
                    bl2 = v4 instanceof gl_2;
                    if (bl2) {
                        boolean bl4;
                        bl2 = v4 instanceof m00_0;
                        if (!bl2) {
                            bl4 = false;
                            object5 = null;
                        }
                        if (object5 != null) {
                            throwable = ((m00_0)object5).a;
                        }
                        if (bl4 = object instanceof b) {
                            object = (b)object;
                            this.i((b)object, throwable);
                        } else {
                            object5 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>";
                            Intrinsics.checkNotNull(object, (String)object5);
                            object = (wx2_2)object;
                            this.k((wx2_2)object, throwable);
                        }
                    }
                    return;
                }
                CancellableContinuationImpl.w(object, v4);
                throw null;
            }
            bl2 = v4 instanceof k00_0;
            object3 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler";
            if (bl2) {
                object4 = v4;
                object4 = (k00_0)v4;
                object2 = ((k00_0)object4).b;
                if (object2 == null) {
                    n3 = object instanceof wx2_2;
                    if (n3 != 0) {
                        return;
                    }
                    Intrinsics.checkNotNull(object, (String)object3);
                    object3 = object;
                    object3 = (b)object;
                    object2 = ((k00_0)object4).e;
                    if (object2 != null) {
                        this.i((b)object3, (Throwable)object2);
                        return;
                    }
                    n3 = 29;
                    object4 = k00_0.a(object4, (b)object3, null, n3);
                    do {
                        if (!(bl3 = ((AtomicReferenceFieldUpdater)object5).compareAndSet(this, v4, object4))) continue;
                        return;
                    } while ((throwable = ((AtomicReferenceFieldUpdater)object5).get(this)) == v4);
                    continue;
                }
                CancellableContinuationImpl.w(object, v4);
                throw null;
            }
            bl2 = object instanceof wx2_2;
            if (bl2) {
                return;
            }
            Intrinsics.checkNotNull(object, (String)object3);
            object3 = object;
            object3 = (b)object;
            n3 = 0;
            object2 = null;
            int n4 = 28;
            object4 = k00_02;
            throwable = (Throwable)v4;
            k00_02 = new k00_0(v4, (b)object3, null, null, n4);
            do {
                if (!(bl2 = ((AtomicReferenceFieldUpdater)object5).compareAndSet(this, v4, k00_02))) continue;
                return;
            } while ((object4 = ((AtomicReferenceFieldUpdater)object5).get(this)) == v4);
        }
        CancellableContinuationImpl.w(object, v4);
        throw null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.z();
        stringBuilder.append(string2);
        char c2 = '(';
        stringBuilder.append(c2);
        string2 = si0_2.h(this.d);
        stringBuilder.append(string2);
        stringBuilder.append("){");
        string2 = g.get(this);
        boolean bl2 = string2 instanceof p42_0;
        string2 = bl2 ? "Active" : ((c2 = string2 instanceof gl_2) != '\u0000' ? "Cancelled" : "Completed");
        stringBuilder.append(string2);
        stringBuilder.append("}@");
        string2 = si0_2.d(this);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean u() {
        int n3 = this.c;
        int n4 = 2;
        if (n3 != n4) return 0 != 0;
        f80_0 f80_02 = this.d;
        Intrinsics.checkNotNull(f80_02, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        f80_02 = (DispatchedContinuation)f80_02;
        f80_02.getClass();
        Object var4_4 = DispatchedContinuation.h.get(f80_02);
        if (var4_4 == null) return 0 != 0;
        return 1 != 0;
    }

    public final gh3_2 v(Object object, gx0_2 gx0_22) {
        return this.G(object, gx0_22);
    }

    public final void x(Function1 function1) {
        b$a b$a = new b$a(function1);
        dl_2.b(this, b$a);
    }

    public final gh3_2 y(Throwable throwable) {
        m00_0 m00_02 = new m00_0(throwable, false);
        return this.G(m00_02, null);
    }

    public String z() {
        return "CancellableContinuation";
    }
}

