/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.UUID;

/*
 * Renamed from zI3
 */
public final class zi3_1
implements ub2_0 {
    public final WorkDatabase a;
    public final Si3 b;

    static {
        qx1.b("WorkProgressUpdater");
    }

    public zi3_1(WorkDatabase workDatabase, Si3 si3) {
        this.a = workDatabase;
        this.b = si3;
    }

    public final eK$d a(UUID uUID, b b2) {
        SerialExecutorImpl serialExecutorImpl = this.b.c();
        yi3_1 yi3_12 = new yi3_1(this, uUID, b2);
        return rv1_1.a(serialExecutorImpl, "updateProgress", yi3_12);
    }
}

