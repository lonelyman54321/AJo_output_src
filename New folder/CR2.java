/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class CR2
implements Iterable {
    public CR2$c a;
    public CR2$c b;
    public final WeakHashMap c;
    public int d;

    public CR2() {
        WeakHashMap weakHashMap;
        this.c = weakHashMap = new WeakHashMap();
        this.d = 0;
    }

    public CR2$c a(Object object) {
        Object object2;
        boolean bl2;
        CR2$c cR2$c = this.a;
        while (cR2$c != null && !(bl2 = (object2 = cR2$c.a).equals(object))) {
            cR2$c = cR2$c.c;
        }
        return cR2$c;
    }

    public Object c(Object object, Object object2) {
        int n3;
        CR2$c cR2$c = this.a(object);
        if (cR2$c != null) {
            return cR2$c.b;
        }
        cR2$c = new CR2$c(object, object2);
        this.d = n3 = this.d + 1;
        object = this.b;
        if (object == null) {
            this.a = cR2$c;
            this.b = cR2$c;
        } else {
            ((CR2$c)object).c = cR2$c;
            cR2$c.d = object;
            this.b = cR2$c;
        }
        return null;
    }

    public Object d(Object object) {
        Object object2;
        int n3;
        if ((object = this.a(object)) == null) {
            return null;
        }
        this.d = n3 = this.d + -1;
        Object object3 = this.c;
        boolean bl2 = ((WeakHashMap)object3).isEmpty();
        if (!bl2) {
            object3 = ((WeakHashMap)object3).keySet().iterator();
            while (bl2 = object3.hasNext()) {
                object2 = (CR2$f)object3.next();
                ((CR2$f)object2).a((CR2$c)object);
            }
        }
        if ((object3 = ((CR2$c)object).d) != null) {
            object2 = ((CR2$c)object).c;
            ((CR2$c)object3).c = object2;
        } else {
            object2 = ((CR2$c)object).c;
            this.a = object2;
        }
        object2 = ((CR2$c)object).c;
        if (object2 != null) {
            ((CR2$c)object2).d = object3;
        } else {
            this.b = object3;
        }
        ((CR2$c)object).c = null;
        ((CR2$c)object).d = null;
        return ((CR2$c)object).b;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Object object2;
        int n3;
        boolean bl3;
        block5: {
            Object object3;
            bl3 = true;
            if (object == this) {
                return bl3;
            }
            n3 = object instanceof CR2;
            if (n3 == 0) {
                return false;
            }
            object = (CR2)object;
            n3 = this.d;
            int n4 = ((CR2)object).d;
            if (n3 != n4) {
                return false;
            }
            Iterator iterator = this.iterator();
            object = ((CR2)object).iterator();
            do {
                object2 = iterator;
                object2 = (CR2$e)iterator;
                boolean bl4 = ((CR2$e)object2).hasNext();
                if (!bl4) break block5;
                object3 = object;
                object3 = (CR2$e)object;
                boolean bl5 = ((CR2$e)object3).hasNext();
                if (!bl5) break block5;
                object2 = (Map.Entry)((CR2$e)object2).next();
                object3 = ((CR2$e)object3).next();
            } while ((object2 != null || object3 == null) && (object2 == null || (n4 = (int)(object2.equals(object3) ? 1 : 0)) != 0));
            return false;
        }
        if ((n3 = (int)(((CR2$e)object2).hasNext() ? 1 : 0)) != 0 || (bl2 = ((CR2$e)(object = (CR2$e)object)).hasNext())) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        Iterator iterator = this.iterator();
        int n3 = 0;
        while (true) {
            Object object = iterator;
            object = (CR2$e)iterator;
            boolean bl2 = ((CR2$e)object).hasNext();
            if (!bl2) break;
            object = (Map.Entry)((CR2$e)object).next();
            int n4 = object.hashCode();
            n3 += n4;
        }
        return n3;
    }

    public final Iterator iterator() {
        Object object = this.a;
        Object object2 = this.b;
        CR2$a cR2$a = new CR2$e((CR2$c)object, (CR2$c)object2);
        object = this.c;
        object2 = Boolean.FALSE;
        ((WeakHashMap)object).put(cR2$a, object2);
        return cR2$a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Iterator iterator = this.iterator();
        while (true) {
            Object object = iterator;
            object = (CR2$e)iterator;
            boolean bl2 = ((CR2$e)object).hasNext();
            if (!bl2) break;
            String string2 = ((Map.Entry)((CR2$e)object).next()).toString();
            stringBuilder.append(string2);
            boolean bl3 = ((CR2$e)object).hasNext();
            if (!bl3) continue;
            object = ", ";
            stringBuilder.append((String)object);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

