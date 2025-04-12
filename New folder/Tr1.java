/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Tr1 {
    public final bs2_1 a;
    public final Function0 b;
    public final LinkedHashMap c;

    public Tr1(bs2_1 linkedHashMap, bs1_2 bs1_22) {
        this.a = linkedHashMap;
        this.b = bs1_22;
        this.c = linkedHashMap = new LinkedHashMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Function2 a(int n3, Object object, Object object2) {
        Object object3;
        Object object4;
        int n4;
        LinkedHashMap linkedHashMap = this.c;
        Tr1$a tr1$a = (Tr1$a)linkedHashMap.get(object);
        boolean bl2 = true;
        int n7 = 1403994769;
        if (tr1$a != null && (n4 = tr1$a.c) == n3 && (n4 = (int)(Intrinsics.areEqual(object4 = tr1$a.b, object2) ? 1 : 0)) != 0) {
            object3 = tr1$a.d;
            if (object3 != null) return object3;
            object = tr1$a.e;
            object3 = new sr1_1((Tr1)object, tr1$a);
            tr1$a.d = object = new u10(n7, object3, bl2);
            return object;
        }
        tr1$a = new Tr1$a(this, n3, object, object2);
        linkedHashMap.put(object, tr1$a);
        object3 = tr1$a.d;
        if (object3 != null) return object3;
        object3 = new sr1_1(this, tr1$a);
        tr1$a.d = object = new u10(n7, object3, bl2);
        return object;
    }

    public final Object b(Object object) {
        Object object2 = null;
        if (object == null) {
            return null;
        }
        Object object3 = (Tr1$a)this.c.get(object);
        if (object3 != null) {
            object2 = ((Tr1$a)object3).b;
        } else {
            int n3;
            object3 = (wr1_0)this.b.invoke();
            int n4 = object3.b(object);
            if (n4 != (n3 = -1)) {
                object2 = object3.e(n4);
            }
        }
        return object2;
    }
}

