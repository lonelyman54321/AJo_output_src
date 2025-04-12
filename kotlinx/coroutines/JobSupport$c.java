/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;

public final class JobSupport$c
extends rl2_2
implements Function2 {
    public vw1_2 b;
    public ku_2 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ JobSupport f;

    public JobSupport$c(f80_0 f80_02, JobSupport jobSupport) {
        this.f = jobSupport;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        JobSupport jobSupport = this.f;
        JobSupport$c jobSupport$c = new JobSupport$c(f80_02, jobSupport);
        jobSupport$c.e = object;
        return jobSupport$c;
    }

    public final Object invoke(Object object, Object object2) {
        object = (xz2_2)object;
        object2 = (f80_0)object2;
        object = (JobSupport$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((JobSupport$c)object).invokeSuspend(object2);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Object object2;
        Object object3;
        Object object4;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.d;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            if (n3 == n7) {
                vl2_2.b(object);
                return Unit.a;
            }
            if (n3 != n4) {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw illegalStateException;
            }
            object4 = this.c;
            object3 = this.b;
            object2 = (xz2_2)this.e;
            vl2_2.b(object);
            object4 = ((yw1_2)object4).f();
        } else {
            vl2_2.b(object);
            xz2_2 xz2_22 = (xz2_2)this.e;
            object4 = this.f;
            object4.getClass();
            object2 = JobSupport.a;
            object4 = ((AtomicReferenceFieldUpdater)object2).get(object4);
            boolean bl3 = object4 instanceof ku_2;
            if (bl3) {
                object4 = ((ku_2)object4).e;
                this.d = n7;
                j90_0 j90_03 = xz2_22.a(this, object4);
                if (j90_03 != j90_02) return Unit.a;
                return j90_02;
            }
            n7 = object4 instanceof bg1_2;
            if (n7 == 0) return Unit.a;
            if ((object4 = ((bg1_2)object4).b()) == null) return Unit.a;
            object3 = yw1_2.a.get(object4);
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            object3 = (yw1_2)object3;
            object2 = xz2_22;
            yw1_2 yw1_22 = object3;
            object3 = object4;
            object4 = yw1_22;
        }
        while (!(bl2 = Intrinsics.areEqual(object4, object3))) {
            bl2 = object4 instanceof ku_2;
            if (bl2) {
                Object object5 = object4;
                mu_2 mu_22 = ((ku_2)object4).e;
                this.e = object2;
                this.b = object3;
                Object object6 = object4;
                this.c = object6 = (ku_2)object4;
                this.d = n4;
                j90_0 j90_04 = ((xz2_2)object2).a(this, mu_22);
                if (j90_04 == j90_02) {
                    return j90_02;
                }
            }
            object4 = ((yw1_2)object4).f();
        }
        return Unit.a;
    }
}

