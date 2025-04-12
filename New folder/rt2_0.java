/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from rT2
 */
public final class rt2_0 {
    public static final /* synthetic */ int a;

    static {
        qx1.b("Schedulers");
    }

    public static void a(FI3 fI3, TV object, List object2) {
        int n3 = object2.size();
        if (n3 > 0) {
            boolean bl2;
            long l2 = object.currentTimeMillis();
            object = object2.iterator();
            while (bl2 = object.hasNext()) {
                object2 = ((EI3)object.next()).a;
                fI3.b(l2, (String)object2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(a eI3Array, WorkDatabase object, List object2) {
        Throwable throwable2;
        block9: {
            boolean bl2;
            Object object3;
            Object object4;
            int n3;
            int n4;
            Object object5;
            int n7;
            block8: {
                block7: {
                    if (object2 == null) return;
                    n7 = object2.size();
                    if (n7 == 0) {
                        return;
                    }
                    object5 = ((WorkDatabase)object).f();
                    ((FP2)object).beginTransaction();
                    try {
                        n4 = Build.VERSION.SDK_INT;
                        n3 = 24;
                        if (n4 < n3) break block7;
                        object4 = object5.x();
                        object3 = eI3Array.d;
                        rt2_0.a((FI3)object5, (TV)object3, (List)object4);
                        break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                n4 = 0;
                object4 = null;
            }
            n3 = eI3Array.k;
            object3 = object5.r(n3);
            eI3Array = eI3Array.d;
            rt2_0.a((FI3)object5, (TV)eI3Array, (List)object3);
            if (object4 != null) {
                ((ArrayList)object3).addAll(object4);
            }
            eI3Array = object5.n();
            ((FP2)object).setTransactionSuccessful();
            ((FP2)object).endTransaction();
            int n8 = ((ArrayList)object3).size();
            if (n8 > 0) {
                n8 = ((ArrayList)object3).size();
                object = new EI3[n8];
                object = ((ArrayList)object3).toArray((T[])object);
                object5 = object2.iterator();
                while ((n4 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                    object4 = (mt2_0)object5.next();
                    n3 = (int)(object4.e() ? 1 : 0);
                    if (n3 == 0) continue;
                    object4.c((EI3[])object);
                }
            }
            if ((n8 = eI3Array.size()) <= 0) return;
            n8 = eI3Array.size();
            object = new EI3[n8];
            eI3Array = eI3Array.toArray((T[])object);
            object = object2.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (mt2_0)object.next();
                n7 = (int)(object2.e() ? 1 : 0);
                if (n7 != 0) continue;
                object2.c(eI3Array);
            }
            return;
        }
        ((FP2)object).endTransaction();
        throw throwable2;
    }
}

