/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.UUID;

/*
 * Renamed from fI3
 */
public final class fi3_0
implements CV0 {
    public final Si3 a;
    public final BV0 b;
    public final FI3 c;

    static {
        qx1.b("WMFgUpdater");
    }

    public fi3_0(WorkDatabase object, BV0 bV0, Si3 si3) {
        this.b = bV0;
        this.a = si3;
        this.c = object = ((WorkDatabase)object).f();
    }

    public final eK$d a(Context context, UUID uUID, AV0 aV0) {
        SerialExecutorImpl serialExecutorImpl = this.a.c();
        ei3_0 ei3_02 = new ei3_0(this, uUID, aV0, context);
        return rv1_1.a(serialExecutorImpl, "setForegroundAsync", ei3_02);
    }
}

