/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class YK {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(ni3_1 object, String string2) {
        int n3;
        Object object2 = ((ni3_1)object).c;
        Intrinsics.checkNotNullExpressionValue(object2, "workManagerImpl.workDatabase");
        Object object3 = ((WorkDatabase)object2).f();
        object2 = ((WorkDatabase)object2).a();
        Object object4 = xx_2.j(string2);
        while (true) {
            hI3$b hI3$b;
            boolean bl2 = object4.isEmpty();
            n3 = 1;
            if (!(bl2 ^= n3)) break;
            Object object5 = (String)cx_2.y((List)object4);
            hI3$b hI3$b2 = object3.h((String)object5);
            if (hI3$b2 != (hI3$b = hI3$b.SUCCEEDED) && hI3$b2 != (hI3$b = hI3$b.FAILED)) {
                object3.k((String)object5);
            }
            object5 = object2.a((String)object5);
            object4.addAll(object5);
        }
        object2 = ((ni3_1)object).f;
        Intrinsics.checkNotNullExpressionValue(object2, "workManagerImpl.processor");
        object3 = ((kz2_0)object2).k;
        synchronized (object3) {
            object4 = qx1.a();
            object4.getClass();
            object4 = ((kz2_0)object2).i;
            ((HashSet)object4).add(string2);
            object2 = ((kz2_0)object2).b(string2);
        }
        kz2_0.e((WI3)object2, n3);
        object = ((ni3_1)object).e.iterator();
        boolean bl3;
        while (bl3 = object.hasNext()) {
            object2 = (mt2_0)object.next();
            object2.b(string2);
        }
        return;
    }
}

