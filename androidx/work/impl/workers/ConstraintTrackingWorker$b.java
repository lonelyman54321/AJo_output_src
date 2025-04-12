/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.workers;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class ConstraintTrackingWorker$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ConstraintTrackingWorker b;

    public ConstraintTrackingWorker$b(ConstraintTrackingWorker constraintTrackingWorker, f80_0 f80_02) {
        this.b = constraintTrackingWorker;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ConstraintTrackingWorker constraintTrackingWorker = this.b;
        object = new ConstraintTrackingWorker$b(constraintTrackingWorker, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ConstraintTrackingWorker$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ConstraintTrackingWorker$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            this.a = n4;
            object = ConstraintTrackingWorker.d(this.b, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

