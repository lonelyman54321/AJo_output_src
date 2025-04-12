/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from R50
 */
public final class r50_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ConstraintTrackingWorker b;
    public final /* synthetic */ c c;
    public final /* synthetic */ MH3 d;
    public final /* synthetic */ EI3 e;

    public r50_0(ConstraintTrackingWorker constraintTrackingWorker, c c2, MH3 mH3, EI3 eI3, f80_0 f80_02) {
        this.b = constraintTrackingWorker;
        this.c = c2;
        this.d = mH3;
        this.e = eI3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        MH3 mH3 = this.d;
        EI3 eI3 = this.e;
        ConstraintTrackingWorker constraintTrackingWorker = this.b;
        c c2 = this.c;
        object = new r50_0(constraintTrackingWorker, c2, mH3, eI3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (r50_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((r50_0)object).invokeSuspend(object2);
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
            object = this.b;
            c c2 = this.c;
            MH3 mH3 = this.d;
            EI3 eI3 = this.e;
            object = ConstraintTrackingWorker.c((ConstraintTrackingWorker)object, c2, mH3, eI3, this);
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

