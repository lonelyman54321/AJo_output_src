/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xr1
 */
public final class xr1_0
implements yf3_1 {
    public final Tr1 a;
    public final LinkedHashMap b;

    public xr1_0(Tr1 linkedHashMap) {
        this.a = linkedHashMap;
        this.b = linkedHashMap = new LinkedHashMap();
    }

    public final void a(yf3$a object) {
        boolean bl2;
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.clear();
        object = ((yf3$a)object).a.iterator();
        while (bl2 = object.hasNext()) {
            int n3;
            Object object2 = object.next();
            Integer n4 = (Integer)linkedHashMap.get(object2 = this.a.b(object2));
            if (n4 != null) {
                n3 = n4;
            } else {
                n3 = 0;
                n4 = null;
            }
            int n7 = 7;
            if (n3 == n7) {
                object.remove();
                continue;
            }
            n4 = ++n3;
            linkedHashMap.put(object2, n4);
        }
    }

    public final boolean b(Object object, Object object2) {
        Tr1 tr1 = this.a;
        object = tr1.b(object);
        object2 = tr1.b(object2);
        return Intrinsics.areEqual(object, object2);
    }
}

