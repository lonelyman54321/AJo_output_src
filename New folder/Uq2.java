/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public class Uq2
extends f1_0 {
    public Sq2 a;
    public be3_1 b;
    public hs3_0 c;
    public Object d;
    public int e;
    public int f;

    public Uq2() {
        throw null;
    }

    public final Set a() {
        wq2_0 wq2_02 = new wq2_0(this);
        return wq2_02;
    }

    public final Set c() {
        yq2_0 yq2_02 = new yq2_0(this);
        return yq2_02;
    }

    public final void clear() {
        hs3_0 hs3_02 = hs3_0.e;
        Intrinsics.checkNotNull(hs3_02, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.c = hs3_02;
        this.h(0);
    }

    public boolean containsKey(Object object) {
        hs3_0 hs3_02 = this.c;
        int n3 = object != null ? object.hashCode() : 0;
        return hs3_02.d(n3, 0, object);
    }

    public final int e() {
        return this.f;
    }

    public final Collection f() {
        ar2 ar22 = new ar2(this);
        return ar22;
    }

    public Sq2 g() {
        Object object = this.c;
        Sq2 sq2 = this.a;
        hs3_0 hs3_02 = sq2.d;
        if (object != hs3_02) {
            this.b = object = new Object();
            object = this.c;
            int n3 = this.e();
            sq2 = new Sq2((hs3_0)object, n3);
        }
        this.a = sq2;
        return sq2;
    }

    public Object get(Object object) {
        hs3_0 hs3_02 = this.c;
        int n3 = object != null ? object.hashCode() : 0;
        return hs3_02.g(n3, 0, object);
    }

    public final void h(int n3) {
        this.f = n3;
        this.e = n3 = this.e + 1;
    }

    public final Object put(Object object, Object object2) {
        int n3;
        int n4 = 0;
        this.d = null;
        hs3_0 hs3_02 = this.c;
        if (object != null) {
            n3 = n4 = object.hashCode();
        } else {
            n4 = 0;
            n3 = 0;
        }
        this.c = object = hs3_02.l(n3, object, object2, 0, this);
        return this.d;
    }

    public final void putAll(Map object) {
        Object object2;
        int n3 = object instanceof Sq2;
        Map map2 = null;
        if (n3 != 0) {
            object2 = object;
            object2 = (Sq2)object;
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 == null) {
            n3 = object instanceof Uq2;
            if (n3 != 0) {
                object2 = object;
                object2 = (Uq2)object;
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null) {
                map2 = ((Uq2)object2).g();
            }
        } else {
            map2 = object2;
        }
        if (map2 != null) {
            object = new To0(0);
            int n4 = this.f;
            hs3_0 hs3_02 = this.c;
            hs3_0 hs3_03 = ((Sq2)map2).d;
            String string2 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>";
            Intrinsics.checkNotNull(hs3_03, string2);
            this.c = object2 = hs3_02.m(hs3_03, 0, (To0)object, this);
            n3 = ((Sq2)map2).e + n4;
            int n7 = ((To0)object).a;
            if (n4 != (n3 -= n7)) {
                this.h(n3);
            }
        } else {
            super.putAll((Map)object);
        }
    }

    public Object remove(Object object) {
        this.d = null;
        Object object2 = this.c;
        int n3 = object != null ? object.hashCode() : 0;
        if ((object = ((hs3_0)object2).n(n3, object, 0, this)) == null) {
            object = hs3_0.e;
            object2 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>";
            Intrinsics.checkNotNull(object, (String)object2);
        }
        this.c = object;
        return this.d;
    }

    public final boolean remove(Object object, Object object2) {
        int n3 = this.e();
        hs3_0 hs3_02 = this.c;
        boolean bl2 = false;
        int n4 = object != null ? object.hashCode() : 0;
        if ((object = hs3_02.o(n4, object, object2, 0, this)) == null) {
            object = hs3_0.e;
            object2 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>";
            Intrinsics.checkNotNull(object, (String)object2);
        }
        this.c = object;
        int n7 = this.e();
        if (n3 != n7) {
            bl2 = true;
        }
        return bl2;
    }
}

