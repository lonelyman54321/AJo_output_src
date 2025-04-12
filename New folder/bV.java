/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class bV
extends FP2$b {
    public final TV a;

    public bV(TV tV) {
        Intrinsics.checkNotNullParameter(tV, "clock");
        this.a = tV;
    }

    public final void onOpen(xg3_1 xg3_12) {
        CharSequence charSequence = "db";
        Intrinsics.checkNotNullParameter(xg3_12, (String)charSequence);
        super.onOpen(xg3_12);
        xg3_12.i();
        Object object = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ";
        try {
            charSequence = new StringBuilder((String)object);
            object = this.a;
            long l2 = object.currentTimeMillis();
            long l3 = RH3.a;
            ((StringBuilder)charSequence).append(l2 -= l3);
            object = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
            xg3_12.o((String)charSequence);
            xg3_12.y();
            return;
        }
        finally {
            xg3_12.F();
        }
    }
}

