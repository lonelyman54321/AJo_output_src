/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.G$e;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class G$f
extends AbstractSet {
    public final /* synthetic */ G a;

    public G$f(G g3) {
        this.a = g3;
    }

    public final boolean add(Object object) {
        boolean bl2;
        boolean bl3 = this.contains(object = (Map.Entry)object);
        if (!bl3) {
            Comparable comparable = (Comparable)object.getKey();
            object = object.getValue();
            G g3 = this.a;
            g3.i(comparable, object);
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object object) {
        boolean bl2;
        object = (Map.Entry)object;
        Object object2 = object.getKey();
        G g3 = this.a;
        if (!((object2 = g3.get(object2)) == (object = object.getValue()) || object2 != null && (bl2 = object2.equals(object)))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Iterator iterator() {
        G g3 = this.a;
        G$e g$e = new G$e(g3);
        return g$e;
    }

    public final boolean remove(Object object) {
        boolean bl2 = this.contains(object = (Map.Entry)object);
        if (bl2) {
            G g3 = this.a;
            object = object.getKey();
            g3.remove(object);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.a.size();
    }
}

