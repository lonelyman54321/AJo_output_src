/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.Executor;

/*
 * Renamed from oT2
 */
public final class ot2_2
implements fe0_0 {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ List b;
    public final /* synthetic */ a c;
    public final /* synthetic */ WorkDatabase d;

    public /* synthetic */ ot2_2(VZ2 vZ2, List list, a a2, WorkDatabase workDatabase) {
        this.a = vZ2;
        this.b = list;
        this.c = a2;
        this.d = workDatabase;
    }

    public final void a(gI3 gI32, boolean bl2) {
        a a2 = this.c;
        WorkDatabase workDatabase = this.d;
        List list = this.b;
        pt2_0 pt2_02 = new pt2_0(list, gI32, a2, workDatabase);
        this.a.execute(pt2_02);
    }
}

