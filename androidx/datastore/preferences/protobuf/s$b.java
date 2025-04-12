/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p$c;
import androidx.datastore.preferences.protobuf.s;
import java.util.List;

public final class s$b
extends s {
    public final void a(Object object, long l2) {
        ((p$c)nw3.d.i(object, l2)).makeImmutable();
    }

    public final void b(Object object, Object object2, long l2) {
        nw3$e nw3$e = nw3.d;
        p$c p$c = (p$c)nw3$e.i(object, l2);
        object2 = (p$c)nw3$e.i(object2, l2);
        int n3 = p$c.size();
        int n4 = object2.size();
        if (n3 > 0 && n4 > 0) {
            boolean bl2 = p$c.isModifiable();
            if (!bl2) {
                p$c = p$c.mutableCopyWithCapacity(n4 += n3);
            }
            p$c.addAll(object2);
        }
        if (n3 > 0) {
            object2 = p$c;
        }
        nw3.r(object, l2, object2);
    }

    public final List c(Object object, long l2) {
        p$c p$c = (p$c)nw3.d.i(object, l2);
        int n3 = p$c.isModifiable();
        if (n3 == 0) {
            n3 = p$c.size();
            n3 = n3 == 0 ? 10 : (n3 *= 2);
            p$c = p$c.mutableCopyWithCapacity(n3);
            nw3.r(object, l2, p$c);
        }
        return p$c;
    }
}

