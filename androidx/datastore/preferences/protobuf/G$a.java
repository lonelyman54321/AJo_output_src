/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.G;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class G$a
implements Iterator {
    public int a;
    public Iterator b;
    public final /* synthetic */ G c;

    public G$a(G g3) {
        int n3;
        this.c = g3;
        this.a = n3 = g3.b.size();
    }

    public final Iterator a() {
        Iterator iterator = this.b;
        if (iterator == null) {
            this.b = iterator = this.c.f.entrySet().iterator();
        }
        return this.b;
    }

    public final boolean hasNext() {
        Iterator iterator;
        List list;
        int n3;
        int n4 = this.a;
        if (n4 > 0 && n4 <= (n3 = (list = this.c.b).size()) || (n4 = (int)((iterator = this.a()).hasNext() ? 1 : 0)) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            iterator = null;
        }
        return n4 != 0;
    }

    public final Object next() {
        Object object = this.a();
        boolean bl2 = object.hasNext();
        if (bl2) {
            object = (Map.Entry)this.a().next();
        } else {
            int n3;
            object = this.c.b;
            this.a = n3 = this.a + -1;
            object = (Map.Entry)object.get(n3);
        }
        return object;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

