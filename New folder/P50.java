/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.workers.ConstraintTrackingWorker;

public final class P50
extends h80_0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ConstraintTrackingWorker b;
    public int c;

    public P50(ConstraintTrackingWorker constraintTrackingWorker, f80_0 f80_02) {
        this.b = constraintTrackingWorker;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.c = n3 = this.c | -1 << -1;
        return ConstraintTrackingWorker.c(this.b, null, null, null, this);
    }
}

