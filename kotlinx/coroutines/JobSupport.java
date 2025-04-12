/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport$AwaitContinuation;
import kotlinx.coroutines.JobSupport$a;
import kotlinx.coroutines.JobSupport$b;
import kotlinx.coroutines.JobSupport$c;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.b;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public class JobSupport
implements i,
mu_2,
um2_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Class<JobSupport> clazz = JobSupport.class;
        Class<Object> clazz2 = Object.class;
        a = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_state$volatile");
        b = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_parentHandle$volatile");
    }

    public JobSupport(boolean bl2) {
        yy0_2 yy0_22 = bl2 ? y61.g : y61.f;
        this._state$volatile = yy0_22;
    }

    public static ku_2 o0(yw1_2 yw1_22) {
        boolean bl2;
        while (bl2 = yw1_22.g()) {
            yw1_2 yw1_23 = yw1_22.d();
            if (yw1_23 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yw1_2.b;
                yw1_22 = (yw1_2)atomicReferenceFieldUpdater.get(yw1_22);
                while (bl2 = yw1_22.g()) {
                    yw1_22 = (yw1_2)atomicReferenceFieldUpdater.get(yw1_22);
                }
                continue;
            }
            yw1_22 = yw1_23;
        }
        while (true) {
            if (bl2 = (yw1_22 = yw1_22.f()).g()) {
                continue;
            }
            bl2 = yw1_22 instanceof ku_2;
            if (bl2) {
                return (ku_2)yw1_22;
            }
            bl2 = yw1_22 instanceof d42_0;
            if (bl2) break;
        }
        return null;
    }

    public static String x0(Object object) {
        boolean n3 = object instanceof JobSupport$b;
        String string2 = "Active";
        if (n3) {
            boolean bl2 = ((JobSupport$b)(object = (JobSupport$b)object)).d();
            if (bl2) {
                string2 = "Cancelling";
            } else {
                int n4;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = JobSupport$b.b;
                int n7 = atomicIntegerFieldUpdater.get(object);
                if (n7 == (n4 = 1)) {
                    string2 = "Completing";
                }
            }
        } else {
            boolean bl3 = object instanceof bg1_2;
            if (bl3) {
                boolean bl4 = (object = (bg1_2)object).isActive();
                if (!bl4) {
                    string2 = "New";
                }
            } else {
                boolean bl5 = object instanceof m00_0;
                string2 = bl5 ? "Cancelled" : "Completed";
            }
        }
        return string2;
    }

    public final ju_2 A(JobSupport object) {
        Throwable throwable;
        l42_0 l42_02;
        ku_2 ku_22;
        block13: {
            block14: {
                block12: {
                    Object object2;
                    boolean bl2;
                    ku_22 = new ku_2((JobSupport)object);
                    ku_22.d = this;
                    block0: while (true) {
                        Object object3;
                        if (bl2 = (object3 = ((AtomicReferenceFieldUpdater)(object = a)).get(this)) instanceof yy0_2) {
                            object2 = object3;
                            object2 = (yy0_2)object3;
                            boolean bl3 = ((yy0_2)object2).a;
                            if (bl3) {
                                while (!(bl2 = ((AtomicReferenceFieldUpdater)object).compareAndSet(this, object3, ku_22))) {
                                    object2 = ((AtomicReferenceFieldUpdater)object).get(this);
                                    if (object2 == object3) continue;
                                    continue block0;
                                }
                                break block12;
                            }
                            this.t0((yy0_2)object2);
                            continue;
                        }
                        bl2 = object3 instanceof bg1_2;
                        l42_02 = l42_0.a;
                        throwable = null;
                        if (!bl2) break block13;
                        object2 = object3;
                        object2 = ((bg1_2)object3).b();
                        if (object2 != null) break;
                        object = "null cannot be cast to non-null type kotlinx.coroutines.JobNode";
                        Intrinsics.checkNotNull(object3, (String)object);
                        object3 = (cl1_2)object3;
                        this.u0((cl1_2)object3);
                    }
                    boolean bl4 = ((yw1_2)object2).c(ku_22, 7);
                    if (bl4) break block12;
                    bl4 = ((yw1_2)object2).c(ku_22, 3);
                    bl2 = (object = ((AtomicReferenceFieldUpdater)object).get(this)) instanceof JobSupport$b;
                    if (bl2) {
                        object = (JobSupport$b)object;
                        throwable = ((JobSupport$b)object).c();
                    } else {
                        bl2 = object instanceof m00_0;
                        if ((object = bl2 ? (m00_0)object : null) != null) {
                            throwable = ((m00_0)object).a;
                        }
                    }
                    ku_22.j(throwable);
                    if (!bl4) break block14;
                }
                return ku_22;
            }
            return l42_02;
        }
        boolean bl5 = (object = ((AtomicReferenceFieldUpdater)object).get(this)) instanceof m00_0;
        if ((object = bl5 ? (m00_0)object : null) != null) {
            throwable = ((m00_0)object).a;
        }
        ku_22.j(throwable);
        return l42_02;
    }

    public final boolean A0(JobSupport$b jobSupport$b, ku_2 ku_22, Object object) {
        do {
            fr0_1 fr0_12 = new JobSupport$a(this, jobSupport$b, ku_22, object);
            Object object2 = ku_22.e;
            boolean bl2 = object2 instanceof JobSupport;
            if (bl2) {
                object2 = (JobSupport)object2;
                fr0_12 = ((JobSupport)object2).i0(false, (cl1_2)fr0_12);
            } else {
                bl1_2 bl1_22 = new bl1_2(fr0_12);
                fr0_12 = object2.u(false, false, bl1_22);
            }
            object2 = l42_0.a;
            if (fr0_12 == object2) continue;
            return true;
        } while ((ku_22 = JobSupport.o0(ku_22)) != null);
        return false;
    }

    public final Object D(f80_0 f80_02) {
        Object object;
        int n3;
        do {
            boolean bl2;
            if (bl2 = (object = a.get(this)) instanceof bg1_2) continue;
            boolean bl3 = object instanceof m00_0;
            if (!bl3) {
                return y61.b(object);
            }
            throw ((m00_0)object).a;
        } while ((n3 = this.w0(object)) < 0);
        Object object2 = zj1_2.b(f80_02);
        object = new JobSupport$AwaitContinuation((f80_0)object2, this);
        ((CancellableContinuationImpl)object).r();
        object2 = new um2_1((CancellableContinuationImpl)object);
        object2 = mm0.f(this, (cl1_2)object2);
        mr0_2 mr0_22 = new mr0_2((fr0_1)object2);
        dl_2.b((bl_2)object, mr0_22);
        object = ((CancellableContinuationImpl)object).q();
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            object2 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        }
        return object;
    }

    public final fr0_1 G(Function1 function1) {
        ok1_2 ok1_22 = new ok1_2(function1);
        return this.i0(true, ok1_22);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean H(Object var1_1) {
        block25: {
            block26: {
                var2_3 = y61.a;
                var3_4 = this.c0();
                var4_5 = false;
                var5_6 = 1;
                if (var3_4 != 0) {
                    block22: {
                        while ((var3_4 = (var2_3 = JobSupport.a.get(this)) instanceof bg1_2) != 0) {
                            var3_4 = var2_3 instanceof JobSupport$b;
                            if (var3_4 != 0) {
                                var6_7 = var2_3;
                                var6_7 = (JobSupport$b)var2_3;
                                var6_7.getClass();
                                var7_8 /* !! */  = JobSupport$b.b;
                                var3_4 = var7_8 /* !! */ .get((Object)var6_7);
                                if (var3_4 == var5_6) break;
                            }
                            var7_8 /* !! */  = this.X(var1_1);
                            var6_7 = new m00_0((Throwable)var7_8 /* !! */ , false);
                            if ((var2_3 = this.z0(var2_3, var6_7)) == (var6_7 = y61.c)) continue;
                            break block22;
                        }
                        var2_3 = y61.a;
                    }
                    var6_7 = y61.b;
                    if (var2_3 == var6_7) {
                        return (boolean)var5_6;
                    }
                }
                if (var2_3 != (var6_7 = y61.a)) break block25;
                var2_3 = null;
                var3_4 = 0;
                var6_7 = null;
                while (true) {
                    block28: {
                        block27: {
                            if ((var8_9 = (var7_8 /* !! */  = JobSupport.a.get(this)) instanceof JobSupport$b) == 0) break block27;
                            synchronized (var7_8 /* !! */ ) {
                                var9_10 = var7_8 /* !! */ ;
                                try {
                                    var9_10 = (JobSupport$b)var7_8 /* !! */ ;
                                    var9_10.getClass();
                                    var10_11 = JobSupport$b.d;
                                    var9_10 = var10_11.get(var9_10);
                                    var10_11 = y61.e;
                                    if (var9_10 == var10_11) {
                                        var8_9 = 1;
                                    } else {
                                        var8_9 = 0;
                                        var9_10 = null;
                                    }
                                    if (var8_9 == 0) ** break block23
                                }
                                catch (Throwable var1_2) {
                                    ** break block24
                                }
                                {
                                    var1_1 = y61.d;
                                }
                            }
lbl50:
                            // 4 sources

                            while (true) {
                                var2_3 = var1_1;
                                break block25;
                                break;
                            }
                            {
                                var9_10 = var7_8 /* !! */ ;
                                var9_10 = (JobSupport$b)var7_8 /* !! */ ;
                                var8_9 = var9_10.d();
                                if (var1_1 != null || var8_9 == 0) {
                                    if (var6_7 == null) {
                                        var6_7 = this.X(var1_1);
                                    }
                                    var1_1 = var7_8 /* !! */ ;
                                    var1_1 = (JobSupport$b)var7_8 /* !! */ ;
                                    var1_1.a((Throwable)var6_7);
                                }
                                var1_1 = var7_8 /* !! */ ;
                                var1_1 = (JobSupport$b)var7_8 /* !! */ ;
                                var1_1 = var1_1.c();
                                var3_4 = var8_9 ^ 1;
                                if (var3_4 != 0) {
                                    var2_3 = var1_1;
                                }
                                ** if (var2_3 == null) goto lbl73
                            }
lbl-1000:
                            // 1 sources

                            {
                                var7_8 /* !! */  = (JobSupport$b)var7_8 /* !! */ ;
                                var1_1 = var7_8 /* !! */ .a;
                                this.p0((d42_0)var1_1, (Throwable)var2_3);
                            }
lbl73:
                            // 2 sources

                            var1_1 = y61.a;
                            ** GOTO lbl50
lbl-1000:
                            // 1 sources

                            {
                                throw var1_2;
                            }
                        }
                        var8_9 = var7_8 /* !! */  instanceof bg1_2;
                        if (var8_9 == 0) break block26;
                        if (var6_7 == null) {
                            var6_7 = this.X(var1_1);
                        }
                        var9_10 = var7_8 /* !! */ ;
                        var9_10 = (bg1_2)var7_8 /* !! */ ;
                        var11_12 = var9_10.isActive();
                        if (!var11_12) break block28;
                        var10_11 = this.d0((bg1_2)var9_10);
                        if (var10_11 == null) continue;
                        var12_13 = new JobSupport$b((d42_0)var10_11, (Throwable)var6_7);
                        do {
                            if (!(var13_14 = (var7_8 /* !! */  = JobSupport.a).compareAndSet(this, var9_10, var12_13))) continue;
                            this.p0((d42_0)var10_11, (Throwable)var6_7);
                            var1_1 = y61.a;
                            ** GOTO lbl50
                        } while ((var7_8 /* !! */  = var7_8 /* !! */ .get(this)) == var9_10);
                        continue;
                    }
                    var9_10 = new m00_0((Throwable)var6_7, false);
                    if ((var9_10 = this.z0(var7_8 /* !! */ , var9_10)) == (var10_11 = y61.a)) {
                        var2_3 = new StringBuilder("Cannot happen in ");
                        var2_3.append(var7_8 /* !! */ );
                        var2_3 = var2_3.toString().toString();
                        var1_1 = new IllegalStateException((String)var2_3);
                        throw var1_1;
                    }
                    var7_8 /* !! */  = y61.c;
                    if (var9_10 != var7_8 /* !! */ ) break;
                }
                var2_3 = var9_10;
                break block25;
            }
            var1_1 = y61.d;
            ** while (true)
        }
        if (var2_3 == (var1_1 = y61.a)) return true;
        var1_1 = y61.b;
        if (var2_3 != var1_1) {
            var1_1 = y61.d;
            if (var2_3 == var1_1) {
                return var4_5;
            }
            this.s(var2_3);
        }
        return true;
    }

    public final Object I0(f80_0 f80_02) {
        Object object;
        int n3;
        do {
            boolean bl2;
            if (bl2 = (object = a.get(this)) instanceof bg1_2) continue;
            mm0.c(f80_02.getContext());
            return Unit.a;
        } while ((n3 = this.w0(object)) < 0);
        Object object2 = zj1_2.b(f80_02);
        int n4 = 1;
        object = new CancellableContinuationImpl(n4, (f80_0)object2);
        ((CancellableContinuationImpl)object).r();
        object2 = new vm2_2((CancellableContinuationImpl)object);
        object2 = mm0.f(this, (cl1_2)object2);
        Object object3 = new mr0_2((fr0_1)object2);
        dl_2.b((bl_2)object, (b)object3);
        object = ((CancellableContinuationImpl)object).q();
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            object3 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object3);
        }
        if (object != object2) {
            object = Unit.a;
        }
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }

    public void K(CancellationException cancellationException) {
        this.H(cancellationException);
    }

    public final boolean L(Throwable throwable) {
        l42_0 l42_02;
        boolean bl2 = this.j0();
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        bl2 = throwable instanceof CancellationException;
        ju_2 ju_22 = (ju_2)b.get(this);
        if (ju_22 != null && ju_22 != (l42_02 = l42_0.a)) {
            boolean bl4 = ju_22.a(throwable);
            if (!bl4 && !bl2) {
                bl3 = false;
            }
            return bl3;
        }
        return bl2;
    }

    public boolean M(Object object) {
        return this.l0(object);
    }

    public final CancellationException Q() {
        Serializable serializable;
        Object object;
        block8: {
            Object object2;
            block6: {
                boolean bl2;
                block7: {
                    block5: {
                        object = a.get(this);
                        bl2 = object instanceof JobSupport$b;
                        serializable = null;
                        if (!bl2) break block5;
                        object2 = object;
                        object2 = ((JobSupport$b)object).c();
                        break block6;
                    }
                    bl2 = object instanceof m00_0;
                    if (!bl2) break block7;
                    object2 = object;
                    object2 = ((m00_0)object).a;
                    break block6;
                }
                bl2 = object instanceof bg1_2;
                if (bl2) break block8;
                bl2 = false;
                object2 = null;
            }
            boolean bl3 = object2 instanceof CancellationException;
            if (bl3) {
                serializable = (Serializable)object2;
                serializable = (CancellationException)object2;
            }
            if (serializable == null) {
                object = JobSupport.x0(object);
                String string2 = "Parent job is ";
                object = string2.concat((String)object);
                serializable = new JobCancellationException((String)object, (Throwable)object2, this);
            }
            return serializable;
        }
        serializable = new StringBuilder("Cannot be cancelling child in this state: ");
        ((StringBuilder)serializable).append(object);
        object = ((StringBuilder)serializable).toString().toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public String S() {
        return "Job was cancelled";
    }

    public boolean T(Throwable throwable) {
        boolean bl2 = throwable instanceof CancellationException;
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        boolean bl4 = this.H(throwable);
        if (!bl4 || !(bl4 = this.b0())) {
            bl3 = false;
        }
        return bl3;
    }

    public final void U(JobSupport jobSupport) {
        this.H(jobSupport);
    }

    public final void V(bg1_2 object, Object object2) {
        Object object3 = b;
        Object object4 = (ju_2)((AtomicReferenceFieldUpdater)object3).get(this);
        if (object4 != null) {
            object4.dispose();
            object4 = l42_0.a;
            ((AtomicReferenceFieldUpdater)object3).set(this, object4);
        }
        boolean bl2 = object2 instanceof m00_0;
        object4 = null;
        object2 = bl2 ? (m00_0)object2 : null;
        object2 = object2 != null ? ((m00_0)object2).a : null;
        bl2 = object instanceof cl1_2;
        String string2 = " for ";
        String string3 = "Exception in completion handler ";
        if (bl2) {
            object3 = object;
            object3 = (cl1_2)object;
            try {
                ((cl1_2)object3).j((Throwable)object2);
            }
            catch (Throwable throwable) {
                object4 = new StringBuilder(string3);
                ((StringBuilder)object4).append(object);
                ((StringBuilder)object4).append(string2);
                ((StringBuilder)object4).append(this);
                object = ((StringBuilder)object4).toString();
                object3 = new RuntimeException((String)object, throwable);
                this.g0((CompletionHandlerException)object3);
            }
        } else if ((object = object.b()) != null) {
            int n3 = 1;
            object3 = new yu1_2(n3);
            ((yw1_2)object).c((yw1_2)object3, n3);
            object3 = yw1_2.a.get(object);
            Object object5 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode";
            Intrinsics.checkNotNull(object3, (String)object5);
            object3 = (yw1_2)object3;
            while ((n3 = (int)(Intrinsics.areEqual(object3, object) ? 1 : 0)) == 0) {
                block14: {
                    n3 = object3 instanceof cl1_2;
                    if (n3 != 0) {
                        object5 = object3;
                        object5 = (cl1_2)object3;
                        try {
                            ((cl1_2)object5).j((Throwable)object2);
                        }
                        catch (Throwable throwable) {
                            if (object4 != null) {
                                yc0_2.a((Throwable)object4, throwable);
                                break block14;
                            }
                            CharSequence charSequence = new StringBuilder(string3);
                            charSequence.append(object3);
                            charSequence.append(string2);
                            charSequence.append(this);
                            charSequence = charSequence.toString();
                            object4 = new RuntimeException((String)charSequence, throwable);
                            object5 = Unit.a;
                        }
                    }
                }
                object3 = ((yw1_2)object3).f();
            }
            if (object4 != null) {
                this.g0((CompletionHandlerException)object4);
            }
        }
    }

    public final Throwable X(Object object) {
        boolean bl2 = object == null ? true : object instanceof Throwable;
        if (bl2) {
            if ((object = (Throwable)object) == null) {
                String string2 = this.S();
                object = new JobCancellationException(string2, null, this);
            }
        } else {
            String string3 = "null cannot be cast to non-null type kotlinx.coroutines.ParentJob";
            Intrinsics.checkNotNull(object, string3);
            object = ((um2_2)object).Q();
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object Y(JobSupport$b jobSupport$b, Object object) {
        boolean bl2;
        int n3;
        Object object2;
        Iterator iterator;
        boolean bl3 = object instanceof m00_0;
        boolean bl4 = false;
        Object object3 = null;
        if (bl3) {
            iterator = object;
            iterator = (m00_0)object;
        } else {
            bl3 = false;
            iterator = null;
        }
        if (iterator != null) {
            object3 = ((m00_0)((Object)iterator)).a;
        }
        synchronized (jobSupport$b) {
            int n4;
            jobSupport$b.d();
            iterator = jobSupport$b.e((Throwable)object3);
            object2 = this.a0(jobSupport$b, (ArrayList)((Object)iterator));
            n3 = 1;
            if (object2 != null && (n4 = iterator.size()) > n3) {
                boolean bl5;
                n4 = iterator.size();
                Serializable serializable = new Serializable(n4);
                Set set = Collections.newSetFromMap(serializable);
                iterator = iterator.iterator();
                while (bl5 = iterator.hasNext()) {
                    boolean bl6;
                    serializable = iterator.next();
                    if ((serializable = (Throwable)serializable) == object2 || serializable == object2 || (bl6 = serializable instanceof CancellationException) || !(bl6 = set.add(serializable))) continue;
                    yc0_2.a((Throwable)object2, serializable);
                }
            }
        }
        bl3 = false;
        iterator = null;
        if (object2 != null && object2 != object3) {
            object = new m00_0((Throwable)object2, false);
        }
        if (object2 != null && ((bl4 = this.L((Throwable)object2)) || (bl4 = this.e0((Throwable)object2)))) {
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            object3 = object;
            object3 = (m00_0)object;
            object3.getClass();
            object2 = m00_0.b;
            ((AtomicIntegerFieldUpdater)object2).compareAndSet(object3, 0, n3);
        }
        this.r0(object);
        iterator = a;
        bl4 = object instanceof bg1_2;
        if (bl4) {
            object2 = object;
            object2 = (bg1_2)object;
            object3 = new cg1_2((bg1_2)object2);
        } else {
            object3 = object;
        }
        while (!(bl2 = ((AtomicReferenceFieldUpdater)((Object)iterator)).compareAndSet(this, jobSupport$b, object3)) && (object2 = ((AtomicReferenceFieldUpdater)((Object)iterator)).get(this)) == jobSupport$b) {
        }
        this.V(jobSupport$b, object);
        return object;
    }

    public final Object Z() {
        Object object = a.get(this);
        boolean bl2 = object instanceof bg1_2 ^ true;
        if (bl2) {
            bl2 = object instanceof m00_0;
            if (!bl2) {
                return y61.b(object);
            }
            throw ((m00_0)object).a;
        }
        String string2 = "This job has not completed yet".toString();
        object = new Object(string2);
        throw object;
    }

    public final Throwable a0(JobSupport$b object, ArrayList iterator) {
        boolean bl2;
        Object object2;
        Object object3;
        Throwable throwable;
        boolean bl3;
        block7: {
            bl3 = iterator.isEmpty();
            throwable = null;
            if (bl3) {
                boolean bl4 = ((JobSupport$b)object).d();
                if (bl4) {
                    iterator = this.S();
                    object = new JobCancellationException((String)((Object)iterator), null, this);
                    return object;
                }
                return null;
            }
            object = iterator.iterator();
            while (bl3 = object.hasNext()) {
                object2 = object3 = object.next();
                object2 = (Throwable)object3;
                bl2 = object2 instanceof CancellationException ^ true;
                if (!bl2) continue;
                break block7;
            }
            bl3 = false;
            object3 = null;
        }
        object3 = (Throwable)object3;
        if (object3 != null) {
            return object3;
        }
        boolean bl5 = false;
        object = (Throwable)iterator.get(0);
        bl3 = object instanceof TimeoutCancellationException;
        if (bl3) {
            iterator = iterator.iterator();
            while (bl3 = iterator.hasNext()) {
                object2 = object3 = iterator.next();
                object2 = (Throwable)object3;
                if (object2 == object || !(bl2 = object2 instanceof TimeoutCancellationException)) continue;
                throwable = object3;
                break;
            }
            if ((throwable = (Throwable)throwable) != null) {
                return throwable;
            }
        }
        return (Throwable)object;
    }

    public final Sequence b() {
        JobSupport$c jobSupport$c = new JobSupport$c(null, this);
        Intrinsics.checkNotNullParameter(jobSupport$c, "block");
        yz2_0 yz2_02 = new yz2_0(jobSupport$c);
        return yz2_02;
    }

    public boolean b0() {
        return true;
    }

    public boolean c0() {
        return this instanceof x00_0;
    }

    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            String string2 = this.S();
            cancellationException = new JobCancellationException(string2, null, this);
        }
        this.K(cancellationException);
    }

    public final d42_0 d0(bg1_2 object) {
        Object object2 = object.b();
        if (object2 == null) {
            boolean bl2 = object instanceof yy0_2;
            if (bl2) {
                object2 = new vw1_2();
            } else {
                bl2 = object instanceof cl1_2;
                if (bl2) {
                    object = (cl1_2)object;
                    this.u0((cl1_2)object);
                    bl2 = false;
                    object2 = null;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("State should have list: ");
                    stringBuilder.append(object);
                    object = stringBuilder.toString().toString();
                    object2 = new IllegalStateException((String)object);
                    throw object2;
                }
            }
        }
        return object2;
    }

    public boolean e0(Throwable throwable) {
        return false;
    }

    public final Object fold(Object object, Function2 function2) {
        return CoroutineContext$Element$a.a(this, object, function2);
    }

    public void g0(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final CoroutineContext$Element get(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.b(this, coroutineContext$a);
    }

    public final CoroutineContext$a getKey() {
        return i$a.a;
    }

    public final void h0(i object) {
        l42_0 l42_02 = l42_0.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        if (object == null) {
            atomicReferenceFieldUpdater.set(this, l42_02);
            return;
        }
        object.start();
        object = object.A(this);
        atomicReferenceFieldUpdater.set(this, object);
        boolean bl2 = this.n();
        if (bl2) {
            object.dispose();
            atomicReferenceFieldUpdater.set(this, l42_02);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final fr0_1 i0(boolean bl2, cl1_2 cl1_22) {
        Throwable throwable;
        int n3;
        l42_0 l42_02;
        Object object;
        cl1_22.d = this;
        block0: while (true) {
            object = a;
            Object v4 = ((AtomicReferenceFieldUpdater)object).get(this);
            boolean bl3 = v4 instanceof yy0_2;
            l42_02 = l42_0.a;
            n3 = 1;
            throwable = null;
            if (bl3) {
                Object v5 = v4;
                yy0_2 yy0_22 = (yy0_2)v4;
                boolean bl4 = yy0_22.a;
                if (!bl4) {
                    this.t0(yy0_22);
                    continue;
                }
            } else {
                bl3 = v4 instanceof bg1_2;
                if (bl3) {
                    boolean bl5;
                    block20: {
                        Object v7 = v4;
                        bg1_2 bg1_22 = (bg1_2)v4;
                        d42_0 d42_02 = bg1_22.b();
                        if (d42_02 == null) {
                            object = "null cannot be cast to non-null type kotlinx.coroutines.JobNode";
                            Intrinsics.checkNotNull(v4, (String)object);
                            cl1_2 cl1_23 = (cl1_2)v4;
                            this.u0(cl1_23);
                            continue;
                        }
                        bl5 = cl1_22.i();
                        if (bl5) {
                            void var4_9;
                            void var9_24;
                            bl5 = bg1_22 instanceof JobSupport$b;
                            if (bl5) {
                                JobSupport$b jobSupport$b = (JobSupport$b)bg1_22;
                            } else {
                                bl3 = false;
                                Object var9_23 = null;
                            }
                            if (var9_24 != null) {
                                Throwable throwable2 = var9_24.c();
                            } else {
                                bl5 = false;
                                Object var4_8 = null;
                            }
                            if (var4_9 == null) {
                                bl5 = d42_02.c(cl1_22, 5);
                                break block20;
                            } else {
                                if (bl2) {
                                    cl1_22.j((Throwable)var4_9);
                                }
                                return l42_02;
                            }
                        }
                        bl5 = d42_02.c(cl1_22, n3);
                    }
                    if (!bl5) continue;
                    break;
                }
                n3 = 0;
                break;
            }
            while (!(bl3 = ((AtomicReferenceFieldUpdater)object).compareAndSet(this, v4, cl1_22))) {
                Object v8 = ((AtomicReferenceFieldUpdater)object).get(this);
                if (v8 == v4) continue;
                continue block0;
            }
            break;
        }
        if (n3 != 0) {
            return cl1_22;
        }
        if (bl2) {
            void var13_32;
            Object v9 = ((AtomicReferenceFieldUpdater)object).get(this);
            boolean bl6 = v9 instanceof m00_0;
            if (bl6) {
                m00_0 m00_02 = (m00_0)v9;
            } else {
                bl2 = false;
                Object var13_31 = null;
            }
            if (var13_32 != null) {
                throwable = var13_32.a;
            }
            cl1_22.j(throwable);
        }
        return l42_02;
    }

    public boolean isActive() {
        boolean bl2;
        Object object = a.get(this);
        boolean bl3 = object instanceof bg1_2;
        if (bl3 && (bl2 = (object = (bg1_2)object).isActive())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean j0() {
        return this instanceof ky_2;
    }

    public Object k() {
        return this.Z();
    }

    public final boolean l0(Object object) {
        boolean bl2;
        gh3_2 gh3_22;
        Object object2;
        do {
            object2 = a.get(this);
            if ((object2 = this.z0(object2, object)) == (gh3_22 = y61.a)) {
                return false;
            }
            gh3_22 = y61.b;
            bl2 = true;
            if (object2 != gh3_22) continue;
            return bl2;
        } while (object2 == (gh3_22 = y61.c));
        this.s(object2);
        return bl2;
    }

    public final Object m0(Object object) {
        Object object2;
        Object object3;
        do {
            object3 = a.get(this);
            if ((object3 = this.z0(object3, object)) != (object2 = y61.a)) continue;
            object2 = new StringBuilder("Job ");
            ((StringBuilder)object2).append(this);
            String string2 = " is already complete or completing, but is being completed with ";
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(object);
            object2 = ((StringBuilder)object2).toString();
            boolean bl2 = object instanceof m00_0;
            Throwable throwable = null;
            object = bl2 ? (m00_0)object : null;
            if (object != null) {
                throwable = ((m00_0)object).a;
            }
            object3 = new Object((String)object2, throwable);
            throw object3;
        } while (object3 == (object2 = y61.c));
        return object3;
    }

    public final CoroutineContext minusKey(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.c(this, coroutineContext$a);
    }

    public final boolean n() {
        return a.get(this) instanceof bg1_2 ^ true;
    }

    public String n0() {
        return this.getClass().getSimpleName();
    }

    public final boolean p() {
        boolean bl2;
        Object object = a.get(this);
        boolean bl3 = object instanceof m00_0;
        if (!(bl3 || (bl3 = object instanceof JobSupport$b) && (bl2 = ((JobSupport$b)(object = (JobSupport$b)object)).d()))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final void p0(d42_0 d42_02, Throwable throwable) {
        boolean bl2;
        int n3 = 4;
        yw1_2 yw1_22 = new yu1_2(n3);
        d42_02.c(yw1_22, n3);
        yw1_22 = yw1_2.a.get(d42_02);
        Intrinsics.checkNotNull(yw1_22, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        yw1_22 = yw1_22;
        n3 = 0;
        CompletionHandlerException completionHandlerException = null;
        while (!(bl2 = Intrinsics.areEqual(yw1_22, d42_02))) {
            block8: {
                bl2 = yw1_22 instanceof cl1_2;
                if (bl2) {
                    Object object = yw1_22;
                    object = (cl1_2)yw1_22;
                    bl2 = ((cl1_2)object).i();
                    if (bl2) {
                        object = yw1_22;
                        object = (cl1_2)yw1_22;
                        try {
                            ((cl1_2)object).j(throwable);
                        }
                        catch (Throwable throwable2) {
                            if (completionHandlerException != null) {
                                yc0_2.a(completionHandlerException, throwable2);
                                break block8;
                            }
                            CharSequence charSequence = new StringBuilder("Exception in completion handler ");
                            charSequence.append(yw1_22);
                            String string2 = " for ";
                            charSequence.append(string2);
                            charSequence.append(this);
                            charSequence = charSequence.toString();
                            completionHandlerException = new RuntimeException((String)charSequence, throwable2);
                            object = Unit.a;
                        }
                    }
                }
            }
            yw1_22 = ((yw1_2)yw1_22).f();
        }
        if (completionHandlerException != null) {
            this.g0(completionHandlerException);
        }
        this.L(throwable);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext$Element$a.d(coroutineContext, this);
    }

    public void q0(Throwable throwable) {
    }

    public void r0(Object object) {
    }

    public void s(Object object) {
    }

    public void s0() {
    }

    public final boolean start() {
        Object v4;
        boolean bl2;
        while (bl2 = this.w0(v4 = a.get(this))) {
            boolean bl3 = true;
            if (bl2 != bl3) continue;
            return bl3;
        }
        return false;
    }

    public void t(Object object) {
        this.s(object);
    }

    public final void t0(yy0_2 yy0_22) {
        boolean bl2;
        Object object;
        Object object2 = new vw1_2();
        boolean bl3 = yy0_22.a;
        if (!bl3) {
            object2 = object = new wg1_2((d42_0)object2);
        }
        while (!(bl2 = ((AtomicReferenceFieldUpdater)(object = a)).compareAndSet(this, yy0_22, object2)) && (object = ((AtomicReferenceFieldUpdater)object).get(this)) == yy0_22) {
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = new StringBuilder();
        String string2 = this.n0();
        charSequence.append(string2);
        charSequence.append('{');
        string2 = JobSupport.x0(a.get(this));
        charSequence.append(string2);
        charSequence.append('}');
        charSequence = charSequence.toString();
        stringBuilder.append((String)charSequence);
        stringBuilder.append('@');
        charSequence = si0_2.d(this);
        stringBuilder.append((String)charSequence);
        return stringBuilder.toString();
    }

    public final fr0_1 u(boolean bl2, boolean bl3, Function1 function1) {
        cl1_2 cl1_22 = bl2 ? new nk1_2(function1) : new ok1_2(function1);
        return this.i0(bl3, cl1_22);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void u0(cl1_2 cl1_22) {
        Object object = new vw1_2();
        cl1_22.getClass();
        yw1_2.b.set(object, cl1_22);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yw1_2.a;
        atomicReferenceFieldUpdater.set(object, cl1_22);
        block0: while (true) {
            Object v4;
            Object v5;
            if ((v5 = atomicReferenceFieldUpdater.get(cl1_22)) != cl1_22) break;
            do {
                boolean bl2;
                if (!(bl2 = atomicReferenceFieldUpdater.compareAndSet(cl1_22, cl1_22, object))) continue;
                ((yw1_2)object).e(cl1_22);
                break block0;
            } while ((v4 = atomicReferenceFieldUpdater.get(cl1_22)) == cl1_22);
        }
        yw1_2 yw1_22 = cl1_22.f();
        do {
            boolean bl3;
            if (!(bl3 = ((AtomicReferenceFieldUpdater)(object = a)).compareAndSet(this, cl1_22, yw1_22))) continue;
            return;
        } while ((object = ((AtomicReferenceFieldUpdater)object).get(this)) == cl1_22);
    }

    public final CancellationException w() {
        String string2;
        Object object;
        block13: {
            Object object2;
            block12: {
                boolean bl2;
                block10: {
                    block11: {
                        object = a.get(this);
                        bl2 = object instanceof JobSupport$b;
                        object2 = null;
                        string2 = "Job is still new or active: ";
                        if (!bl2) break block10;
                        if ((object = ((JobSupport$b)object).c()) == null) break block11;
                        String string3 = this.getClass().getSimpleName();
                        string2 = " is cancelling";
                        string3 = string3.concat(string2);
                        boolean bl3 = object instanceof CancellationException;
                        if (bl3) {
                            object2 = object;
                            object2 = (CancellationException)object;
                        }
                        if (object2 == null) {
                            if (string3 == null) {
                                string3 = this.S();
                            }
                            object2 = new JobCancellationException(string3, (Throwable)object, this);
                        }
                        break block12;
                    }
                    CharSequence charSequence = new StringBuilder(string2);
                    charSequence.append(this);
                    charSequence = charSequence.toString().toString();
                    object = new Object((String)charSequence);
                    throw object;
                }
                bl2 = object instanceof bg1_2;
                if (bl2) break block13;
                bl2 = object instanceof m00_0;
                if (bl2) {
                    object = ((m00_0)object).a;
                    bl2 = object instanceof CancellationException;
                    if (bl2) {
                        object2 = object;
                        object2 = (CancellationException)object;
                    }
                    if (object2 == null) {
                        object2 = this.S();
                        JobCancellationException jobCancellationException = new JobCancellationException((String)object2, (Throwable)object, this);
                        object2 = jobCancellationException;
                    }
                } else {
                    String string4 = this.getClass().getSimpleName();
                    string2 = " has completed normally";
                    string4 = string4.concat(string2);
                    object = new Object(string4, null, this);
                    object2 = object;
                }
            }
            return object2;
        }
        CharSequence charSequence = new StringBuilder(string2);
        charSequence.append(this);
        charSequence = charSequence.toString().toString();
        object = new Object((String)charSequence);
        throw object;
    }

    public final int w0(Object object) {
        boolean bl2 = object instanceof yy0_2;
        int n3 = 1;
        int n4 = -1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        boolean bl3 = false;
        Object var7_7 = null;
        if (bl2) {
            Object object2 = object;
            object2 = (yy0_2)object;
            bl2 = ((yy0_2)object2).a;
            if (bl2) {
                return 0;
            }
            object2 = y61.g;
            do {
                if (!(bl3 = atomicReferenceFieldUpdater.compareAndSet(this, object, object2))) continue;
                this.s0();
                return n3;
            } while ((var7_7 = atomicReferenceFieldUpdater.get(this)) == object);
            return n4;
        }
        bl2 = object instanceof wg1_2;
        if (bl2) {
            Object object3 = object;
            object3 = ((wg1_2)object).a;
            do {
                if (!(bl3 = atomicReferenceFieldUpdater.compareAndSet(this, object, object3))) continue;
                this.s0();
                return n3;
            } while ((var7_7 = atomicReferenceFieldUpdater.get(this)) == object);
            return n4;
        }
        return 0;
    }

    /*
     * Exception decompiling
     */
    public final Object z0(Object var1_1, Object var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [10 : 396->401)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

