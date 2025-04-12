/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/*
 * Renamed from Yc1
 */
public final class yc1_0
implements Callable {
    public final /* synthetic */ ad1_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ yc1_0(ad1_0 ad1_02, int n3) {
        this.a = ad1_02;
        this.b = 0;
        this.c = n3;
    }

    public final Object call() {
        int n3;
        long l2;
        Object object = this.a;
        Object object2 = ((ad1_0)object).a;
        Object object3 = ((WorkDatabase)object2).b();
        String string2 = "next_job_scheduler_id";
        object3 = object3.a(string2);
        int n4 = 0;
        Object object4 = null;
        if (object3 != null) {
            l2 = (Long)object3;
            n3 = (int)l2;
        } else {
            n3 = 0;
            object3 = null;
        }
        int n7 = -1 >>> 1;
        if (n3 != n7) {
            n4 = n3 + 1;
        }
        object2 = ((WorkDatabase)object2).b();
        long l3 = n4;
        object4 = l3;
        Wx2 wx2 = new Wx2(string2, (Long)object4);
        object2.b(wx2);
        int n8 = this.b;
        if (n8 > n3 || n3 > (n4 = this.c)) {
            n3 = n8 + 1;
            object = ((ad1_0)object).a.b();
            l2 = n3;
            object3 = l2;
            object4 = new Wx2(string2, (Long)object3);
            object.b((Wx2)object4);
            n3 = n8;
        }
        return n3;
    }
}

