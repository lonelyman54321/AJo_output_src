/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.appevents.a;
import com.facebook.appevents.d;
import com.facebook.appevents.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qn
 */
public final class qn_0 {
    static {
        new qn_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(a a2, s03_0 object) {
        Class<qn_0> clazz = qn_0.class;
        synchronized (clazz) {
            Object object2 = qn_0.class;
            int n3 = td0.b(object2);
            if (n3 != 0) {
                return;
            }
            object2 = "accessTokenAppIdPair";
            try {
                Intrinsics.checkNotNullParameter(a2, (String)object2);
                object2 = "appEvents";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                n3 = tn_0.a;
                object2 = e.a();
                object = ((s03_0)object).d();
                ((pq2_0)object2).a(a2, (List)object);
                e.b((pq2_0)object2);
                return;
            }
            catch (Throwable throwable) {
                object = qn_0.class;
                td0.a(object, throwable);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(d object) {
        Class<qn_0> clazz = qn_0.class;
        synchronized (clazz) {
            Object object2 = qn_0.class;
            int n3 = td0.b(object2);
            if (n3 != 0) {
                return;
            }
            object2 = "eventsToPersist";
            try {
                Intrinsics.checkNotNullParameter(object, (String)object2);
                n3 = tn_0.a;
                object2 = e.a();
                Object object3 = ((d)object).e();
                object3 = object3.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object3.hasNext())) {
                        e.b((pq2_0)object2);
                        return;
                    }
                    Object object4 = object3.next();
                    Object object5 = ((d)object).b((a)(object4 = (a)object4));
                    if (object5 == null) {
                        object = "Required value was null.";
                        object = object.toString();
                        object2 = new IllegalStateException((String)object);
                        throw object2;
                    }
                    object5 = ((s03_0)object5).d();
                    ((pq2_0)object2).a((a)object4, (List)object5);
                }
            }
            catch (Throwable throwable) {}
            object2 = qn_0.class;
            td0.a(object2, throwable);
            return;
        }
    }
}

