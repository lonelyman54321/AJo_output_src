/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.i_0;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.l$b;
import androidx.datastore.preferences.protobuf.l_0;
import androidx.datastore.preferences.protobuf.n$e;
import java.io.IOException;
import java.util.Map;

public final class A
implements st2_0 {
    public final wo1_1 a;
    public final H b;
    public final boolean c;
    public final j d;

    public A(H h3, j j3, wo1_1 wo1_12) {
        boolean bl2;
        this.b = h3;
        this.c = bl2 = j3.e(wo1_12);
        this.d = j3;
        this.a = wo1_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Object object, D d2, i_0 i_02) {
        H h3 = this.b;
        I i3 = h3.f(object);
        j j3 = this.d;
        l_0 l_02 = j3.d(object);
        try {
            int n3;
            int n4;
            while ((n4 = d2.getFieldNumber()) != (n3 = -1 >>> 1) && (n4 = (int)(this.c(d2, i_02, j3, l_02, h3, i3) ? 1 : 0)) != 0) {
            }
            h3.n(object, i3);
            return;
        }
        catch (Throwable throwable) {
            h3.n(object, i3);
            throw throwable;
        }
    }

    public final void b(Object object, L l2) {
        Object object2 = this.d.c(object).i();
        boolean bl2 = object2.hasNext();
        if (!bl2) {
            object2 = this.b;
            object = ((H)object2).g(object);
            ((H)object2).q(object, l2);
            return;
        }
        ((l$b)((Map.Entry)object2.next()).getKey()).getLiteJavaType();
        throw null;
    }

    public final boolean c(D object, i_0 object2, j j3, l_0 l_02, H h3, Object object3) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10 = object.getTag();
        int n14 = 11;
        wo1_1 wo1_12 = this.a;
        if (n10 != n14) {
            n14 = n10 & 7;
            int n15 = 2;
            if (n14 == n15) {
                if ((object2 = j3.b((i_0)object2, wo1_12, n10 >>>= 3)) == null) {
                    return h3.l(object3, (D)object);
                }
                j3.h(object2);
                throw null;
            }
            return object.skipField();
        }
        n10 = 0;
        n14 = 0;
        n$e n$e = null;
        boolean bl2 = false;
        DF dF = null;
        while ((n8 = object.getFieldNumber()) != (n7 = -1 >>> 1)) {
            n8 = object.getTag();
            if (n8 == (n7 = 16)) {
                n10 = object.readUInt32();
                n$e = j3.b((i_0)object2, wo1_12, n10);
                continue;
            }
            n7 = 26;
            if (n8 == n7) {
                if (n$e == null) {
                    dF = object.readBytes();
                    continue;
                }
                j3.h(n$e);
                throw null;
            }
            n8 = (int)(object.skipField() ? 1 : 0);
            if (n8 != 0) continue;
        }
        if ((n4 = object.getTag()) == (n3 = 12)) {
            if (dF != null) {
                if (n$e == null) {
                    h3.d(object3, n10, dF);
                } else {
                    j3.i(n$e);
                    throw null;
                }
            }
            return true;
        }
        object = new IOException("Protocol message end-group tag did not match expected tag.");
        throw object;
    }

    public final boolean equals(Object object, Object object2) {
        Object object3 = this.b;
        I i3 = ((H)object3).g(object);
        boolean bl2 = i3.equals(object3 = ((H)object3).g(object2));
        if (!bl2) {
            return false;
        }
        bl2 = this.c;
        if (bl2) {
            object3 = this.d;
            object = ((j)object3).c(object);
            object2 = ((j)object3).c(object2);
            return ((l_0)object).equals(object2);
        }
        return true;
    }

    public final int getSerializedSize(Object iterator) {
        H h3 = this.b;
        Object object = h3.g(iterator);
        int n3 = h3.i(object);
        int n4 = this.c;
        if (n4 != 0) {
            iterator = this.d.c((Object)iterator).a;
            object = ((G)((Object)iterator)).b;
            n4 = object.size();
            if (n4 <= 0) {
                n4 = (int)((iterator = ((G)((Object)iterator)).f().iterator()).hasNext() ? 1 : 0);
                if (n4 != 0) {
                    l_0.d((Map.Entry)iterator.next());
                    throw null;
                }
            } else {
                l_0.d(((G)((Object)iterator)).e(0));
                throw null;
            }
        }
        return n3;
    }

    public final int hashCode(Object object) {
        I i3 = this.b.g(object);
        int n3 = i3.hashCode();
        boolean bl2 = this.c;
        if (bl2) {
            j j3 = this.d;
            object = j3.c(object);
            n3 *= 53;
            object = ((l_0)object).a;
            int n4 = ((G)object).hashCode();
            n3 += n4;
        }
        return n3;
    }

    public final boolean isInitialized(Object object) {
        return this.d.c(object).g();
    }

    public final void makeImmutable(Object object) {
        this.b.j(object);
        this.d.f(object);
    }

    public final void mergeFrom(Object object, Object object2) {
        Object object3 = E.a;
        object3 = this.b;
        I i3 = ((H)object3).g(object);
        I i8 = ((H)object3).g(object2);
        i3 = ((H)object3).k(i3, i8);
        ((H)object3).o(object, i3);
        boolean bl2 = this.c;
        if (bl2) {
            object3 = this.d;
            E.B((j)object3, object, object2);
        }
    }

    public final Object newInstance() {
        return this.a.newBuilderForType().f();
    }
}

