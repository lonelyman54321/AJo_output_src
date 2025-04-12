/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/*
 * Renamed from Zc1
 */
public final class zc1_0
implements Callable {
    public final /* synthetic */ ad1_0 a;

    public /* synthetic */ zc1_0(ad1_0 ad1_02) {
        this.a = ad1_02;
    }

    public final Object call() {
        int n3;
        Object object = this.a.a;
        Object object2 = ((WorkDatabase)object).b();
        String string2 = "next_alarm_manager_id";
        object2 = object2.a(string2);
        int n4 = 0;
        Long l2 = null;
        if (object2 != null) {
            long l3 = (Long)object2;
            n3 = (int)l3;
        } else {
            n3 = 0;
            object2 = null;
        }
        int n7 = -1 >>> 1;
        if (n3 != n7) {
            n4 = n3 + 1;
        }
        object = ((WorkDatabase)object).b();
        l2 = n4;
        Wx2 wx2 = new Wx2(string2, l2);
        object.b(wx2);
        return n3;
    }
}

