/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eA3
 */
public final class ea3_1 {
    public static final Object b;
    public ArrayList a;

    static {
        Object object;
        b = object = new Object();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final da3_1 a() {
        Object object = b;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2 = null;
                try {
                    Object object3 = this.a;
                    boolean bl2 = ((ArrayList)object3).isEmpty();
                    if (bl2) return object2;
                    object3 = this.a;
                    object3 = ((ArrayList)object3).remove(0);
                    return object3 = (da3_1)object3;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                catch (Exception exception) {}
                return object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(da3_1 da3_12) {
        Object object = b;
        // MONITORENTER : object
        try {
            ArrayList arrayList = this.a;
            int n3 = arrayList.size();
            int n4 = 50;
            if (n3 <= n4) {
                arrayList = this.a;
                arrayList.add(da3_12);
                // MONITOREXIT : object
                return;
            }
            ArrayList<Object> arrayList2 = new ArrayList<Object>();
            int i3 = 10;
            while (true) {
                if (i3 >= n3) {
                    arrayList2.add(da3_12);
                    this.a = arrayList2;
                    return;
                }
                Object object2 = this.a;
                object2 = ((ArrayList)object2).get(i3);
                object2 = (da3_1)object2;
                arrayList2.add(object2);
                ++i3;
            }
        }
        catch (Throwable throwable2) {
            throw throwable2;
        }
        catch (Exception exception) {
            return;
        }
    }
}

