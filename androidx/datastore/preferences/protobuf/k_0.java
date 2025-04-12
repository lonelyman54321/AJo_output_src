/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.i$a;
import androidx.datastore.preferences.protobuf.i_0;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.k$a_0;
import androidx.datastore.preferences.protobuf.l_0;
import androidx.datastore.preferences.protobuf.n$c;
import androidx.datastore.preferences.protobuf.n$d;
import androidx.datastore.preferences.protobuf.n$e;
import java.util.Map;

/*
 * Renamed from androidx.datastore.preferences.protobuf.k
 */
public final class k_0
extends j {
    public final void a(Map.Entry entry) {
        ((n$d)entry.getKey()).getClass();
    }

    public final n$e b(i_0 i_02, wo1_1 wo1_12, int n3) {
        i_02.getClass();
        i$a i$a = new i$a(wo1_12, n3);
        return (n$e)i_02.a.get(i$a);
    }

    public final l_0 c(Object object) {
        return ((n$c)object).extensions;
    }

    public final l_0 d(Object object) {
        object = (n$c)object;
        l_0 l_02 = ((n$c)object).extensions;
        boolean bl2 = l_02.b;
        if (bl2) {
            ((n$c)object).extensions = l_02 = l_02.a();
        }
        return ((n$c)object).extensions;
    }

    public final boolean e(wo1_1 wo1_12) {
        return wo1_12 instanceof n$c;
    }

    public final void f(Object object) {
        object = ((n$c)object).extensions;
        boolean bl2 = ((l_0)object).b;
        if (!bl2) {
            G g3 = ((l_0)object).a;
            g3.h();
            ((l_0)object).b = bl2 = true;
        }
    }

    public final Object g(Object object) {
        object = (n$e)object;
        throw null;
    }

    public final void h(Object object) {
        object = (n$e)object;
        throw null;
    }

    public final void i(Object object) {
        object = (n$e)object;
        throw null;
    }

    public final void j(Map.Entry object) {
        ((n$d)object.getKey()).getClass();
        object = k$a_0.a;
        throw null;
    }
}

