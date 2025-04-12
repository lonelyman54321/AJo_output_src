/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jr2
 */
public final class jr2_1
extends o1_0
implements lr2 {
    public static final jr2_1 e;
    public final Object b;
    public final Object c;
    public final Sq2 d;

    static {
        jr2_1 jr2_12;
        rj_0 rj_02 = rj_0.e;
        Sq2 sq2 = Sq2.f;
        Intrinsics.checkNotNull(sq2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        e = jr2_12 = new jr2_1(rj_02, rj_02, sq2);
    }

    public jr2_1(Object object, Object object2, Sq2 sq2) {
        this.b = object;
        this.c = object2;
        this.d = sq2;
    }

    public final int a() {
        return this.d.g();
    }

    public final jr2_1 add(Object object) {
        Sq2 sq2 = this.d;
        boolean bl2 = sq2.containsKey(object);
        if (bl2) {
            return this;
        }
        bl2 = this.isEmpty();
        if (bl2) {
            Object object2 = new Su1();
            sq2 = sq2.j(object, (Su1)object2);
            object2 = new jr2_1(object, object, sq2);
            return object2;
        }
        Object object3 = this.c;
        Object object4 = sq2.get(object3);
        Intrinsics.checkNotNull(object4);
        object4 = (Su1)object4;
        object4 = ((Su1)object4).a;
        Object object5 = new Su1(object4, object);
        sq2 = sq2.j(object3, (Su1)object5);
        object5 = rj_0.e;
        object4 = new Su1(object3, object5);
        sq2 = sq2.j(object, (Su1)object4);
        object4 = this.b;
        object3 = new jr2_1(object4, object, sq2);
        return object3;
    }

    public final boolean contains(Object object) {
        return this.d.containsKey(object);
    }

    public final Iterator iterator() {
        Object object = this.b;
        Sq2 sq2 = this.d;
        kr2_0 kr2_02 = new kr2_0(object, sq2);
        return kr2_02;
    }

    public final jr2_1 remove(Object object) {
        Su1 su1;
        int n3;
        Object object2 = this.d;
        Object object3 = (Su1)((Sq2)object2).get(object);
        if (object3 == null) {
            return this;
        }
        boolean bl2 = false;
        Object object4 = null;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            su1 = null;
        }
        Object object5 = ((Sq2)object2).d;
        object = ((hs3_0)object5).v(n3, 0, object);
        n3 = 1;
        if (object5 != object) {
            if (object == null) {
                object2 = Sq2.f;
                object = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>";
                Intrinsics.checkNotNull(object2, (String)object);
            } else {
                int n4 = ((Sq2)object2).e - n3;
                object2 = object5 = new Sq2((hs3_0)object, n4);
            }
        }
        if ((object5 = ((Su1)object3).a) != (object = rj_0.e)) {
            bl2 = true;
        }
        object3 = ((Su1)object3).b;
        if (bl2) {
            object4 = object2.get(object5);
            Intrinsics.checkNotNull(object4);
            object4 = (Su1)object4;
            object4 = ((Su1)object4).a;
            su1 = new Su1(object4, object3);
            object2 = ((Sq2)object2).j(object5, su1);
        }
        if (object3 != object) {
            object4 = object2.get(object3);
            Intrinsics.checkNotNull(object4);
            object4 = (Su1)object4;
            object4 = ((Su1)object4).b;
            su1 = new Su1(object5, object4);
            object2 = ((Sq2)object2).j(object3, su1);
        }
        object4 = object5 != object ? this.b : object3;
        if (object3 != object) {
            object5 = this.c;
        }
        object = new jr2_1(object4, object5, (Sq2)object2);
        return object;
    }
}

