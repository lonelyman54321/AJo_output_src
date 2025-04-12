/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q;
import java.util.Map;

public final class q$a
implements Map.Entry {
    public Map.Entry a;

    public final Object getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        q q2 = (q)this.a.getValue();
        if (q2 == null) {
            return null;
        }
        return q2.a(null);
    }

    public final Object setValue(Object object) {
        boolean bl2 = object instanceof wo1_1;
        if (bl2) {
            q q2 = (q)this.a.getValue();
            object = (wo1_1)object;
            wo1_1 wo1_12 = q2.a;
            q2.b = null;
            q2.a = object;
            return wo1_12;
        }
        object = new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        throw object;
    }
}

