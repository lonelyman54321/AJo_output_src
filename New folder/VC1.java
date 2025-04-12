/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class VC1 {
    public final LinkedHashMap a;
    public final long b;
    public long c;

    public VC1(long l2) {
        LinkedHashMap linkedHashMap;
        this.a = linkedHashMap = new LinkedHashMap(100, 0.75f, true);
        this.b = l2;
    }

    public final void b() {
        this.i(0L);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object e(Object object) {
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.a;
                object = linkedHashMap.get(object);
                object = (VC1$a)object;
                if (object == null) return null;
                return ((VC1$a)object).a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public int f(Object object) {
        return 1;
    }

    public void g(Object object, Object object2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object h(Object object, Object object2) {
        VC1$a vC1$a;
        Object object3;
        block9: {
            // MONITORENTER : this
            int n3 = this.f(object2);
            long l2 = n3;
            long l3 = this.b;
            object3 = null;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 >= 0) {
                this.g(object, object2);
                // MONITOREXIT : this
                return null;
            }
            if (object2 != null) {
                this.c = l3 = this.c + l2;
            }
            Object object4 = this.a;
            VC1$a vC1$a2 = object2 == null ? null : new VC1$a(object2, n3);
            vC1$a = object4.put(object, vC1$a2);
            if (vC1$a == null) break block9;
            l2 = this.c;
            int n4 = vC1$a.b;
            l3 = n4;
            l2 -= l3;
            this.c = l2;
            object4 = vC1$a.a;
            boolean bl2 = object4.equals(object2);
            if (!bl2) {
                object2 = vC1$a.a;
                this.g(object, object2);
            }
        }
        long l7 = this.b;
        this.i(l7);
        if (vC1$a != null) {
            object3 = vC1$a.a;
        }
        // MONITOREXIT : this
        return object3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                while (true) {
                    int n3;
                    Object object;
                    Object object2;
                    Object object3;
                    try {
                        long l3 = this.c;
                        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                        if (l4 <= 0) break;
                        object3 = this.a;
                        object3 = ((LinkedHashMap)object3).entrySet();
                        object3 = object3.iterator();
                        object2 = object3.next();
                        object2 = (Map.Entry)object2;
                        object = object2.getValue();
                        object = (VC1$a)object;
                        long l7 = this.c;
                        n3 = ((VC1$a)object).b;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    long l8 = n3;
                    {
                        this.c = l7 -= l8;
                        object2 = object2.getKey();
                        object3.remove();
                        object3 = ((VC1$a)object).a;
                        this.g(object2, object3);
                        continue;
                    }
                    break;
                }
                return;
            }
            throw throwable2;
        }
    }
}

