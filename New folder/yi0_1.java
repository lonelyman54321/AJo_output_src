/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from YI0
 */
public final class yi0_1
extends CR2 {
    public final HashMap e;

    public yi0_1() {
        HashMap hashMap;
        this.e = hashMap = new HashMap();
    }

    public final CR2$c a(Object object) {
        return (CR2$c)this.e.get(object);
    }

    public final Object c(Object object, Object object2) {
        int n3;
        Object object3 = this.a(object);
        if (object3 != null) {
            return ((CR2$c)object3).b;
        }
        object3 = this.e;
        CR2$c cR2$c = new CR2$c(object, object2);
        this.d = n3 = this.d + 1;
        object2 = this.b;
        if (object2 == null) {
            this.a = cR2$c;
            this.b = cR2$c;
        } else {
            ((CR2$c)object2).c = cR2$c;
            cR2$c.d = object2;
            this.b = cR2$c;
        }
        ((HashMap)object3).put(object, cR2$c);
        return null;
    }

    public final Object d(Object object) {
        Object object2 = super.d(object);
        this.e.remove(object);
        return object2;
    }
}

