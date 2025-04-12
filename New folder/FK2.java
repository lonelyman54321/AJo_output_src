/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class FK2 {
    public final ArrayList a;

    public FK2() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ek2_0 a(Class object) {
        synchronized (this) {
            try {
                ArrayList arrayList = this.a;
                int n3 = arrayList.size();
                int n4 = 0;
                while (n4 < n3) {
                    Object object2 = this.a;
                    object2 = ((ArrayList)object2).get(n4);
                    object2 = (FK2$a)object2;
                    Class clazz = ((FK2$a)object2).a;
                    boolean bl2 = clazz.isAssignableFrom((Class<?>)object);
                    if (bl2) {
                        return ((FK2$a)object2).b;
                    }
                    ++n4;
                }
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

