/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.c;
import androidx.work.impl.workers.ConstraintTrackingWorker;

public final class Q50
extends h80_0 {
    public ConstraintTrackingWorker a;
    public c b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ConstraintTrackingWorker d;
    public int e;

    public Q50(ConstraintTrackingWorker constraintTrackingWorker, f80_0 f80_02) {
        this.d = constraintTrackingWorker;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.c = object;
        this.e = n3 = this.e | -1 << -1;
        return ConstraintTrackingWorker.d(this.d, this);
    }
}

