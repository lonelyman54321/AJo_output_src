/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.G;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class G$e
implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ G d;

    public G$e(G g3) {
        this.d = g3;
    }

    public final Iterator a() {
        Iterator iterator = this.c;
        if (iterator == null) {
            this.c = iterator = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    public final boolean hasNext() {
        Object object;
        int n3 = this.a;
        int n4 = 1;
        G g3 = this.d;
        List list = g3.b;
        int n7 = list.size();
        if ((n3 += n4) >= n7 && ((n3 = (int)((object = g3.c).isEmpty() ? 1 : 0)) != 0 || (n3 = (int)((object = this.a()).hasNext() ? 1 : 0)) == 0)) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public final Object next() {
        int n3;
        int n4 = 1;
        this.b = n4;
        this.a = n3 = this.a + n4;
        Object object = this.d;
        List list = ((G)object).b;
        int n7 = list.size();
        if (n3 < n7) {
            object = ((G)object).b;
            n3 = this.a;
            object = (Map.Entry)object.get(n3);
        } else {
            object = (Map.Entry)this.a().next();
        }
        return object;
    }

    public final void remove() {
        int n3 = this.b;
        if (n3 != 0) {
            this.b = false;
            n3 = G.h;
            Object object = this.d;
            ((G)object).c();
            int n4 = this.a;
            List list = ((G)object).b;
            int n7 = list.size();
            if (n4 < n7) {
                n4 = this.a;
                this.a = n7 = n4 + -1;
                ((G)object).j(n4);
            } else {
                object = this.a();
                object.remove();
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("remove() was called before next()");
        throw illegalStateException;
    }
}

