/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/*
 * Renamed from pT2
 */
public final class pt2_0
implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ gI3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ WorkDatabase d;

    public /* synthetic */ pt2_0(List list, gI3 gI32, a a2, WorkDatabase workDatabase) {
        this.a = list;
        this.b = gI32;
        this.c = a2;
        this.d = workDatabase;
    }

    public final void run() {
        Object object;
        boolean bl2;
        List list = this.a;
        Object object2 = list.iterator();
        while (bl2 = object2.hasNext()) {
            object = (mt2_0)object2.next();
            String string2 = this.b.a;
            object.b(string2);
        }
        object2 = this.c;
        object = this.d;
        rt2_0.b((a)object2, (WorkDatabase)object, list);
    }
}

