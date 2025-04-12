/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.q$a;
import java.util.Iterator;
import java.util.Map;

public final class q$b
implements Iterator {
    public final Iterator a;

    public q$b(Iterator iterator) {
        this.a = iterator;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry)this.a.next();
        Object object = entry.getValue();
        boolean bl2 = object instanceof q;
        if (bl2) {
            object = new Object();
            ((q$a)object).a = entry;
            entry = object;
        }
        return entry;
    }

    public final void remove() {
        this.a.remove();
    }
}

