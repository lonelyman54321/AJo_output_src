/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$b;
import java.io.Serializable;
import java.util.HashMap;

public final class PrivateMaxEntriesMap$i
implements Serializable {
    static final long serialVersionUID = 1L;
    public final HashMap a;
    public final long b;

    public PrivateMaxEntriesMap$i(PrivateMaxEntriesMap privateMaxEntriesMap) {
        long l2;
        HashMap hashMap;
        int cfr_ignored_0 = privateMaxEntriesMap.b;
        this.a = hashMap = new HashMap(privateMaxEntriesMap);
        this.b = l2 = privateMaxEntriesMap.f.get();
    }

    public Object readResolve() {
        Object object = new PrivateMaxEntriesMap$b();
        boolean bl2 = false;
        PrivateMaxEntriesMap privateMaxEntriesMap = null;
        long l2 = this.b;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        object2 = object2 >= 0 ? (Object)1 : (Object)0;
        if (object2 != false) {
            ((PrivateMaxEntriesMap$b)object).c = l2;
            object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object2 >= 0) {
                bl2 = true;
            }
            if (bl2) {
                privateMaxEntriesMap = new PrivateMaxEntriesMap((PrivateMaxEntriesMap$b)object);
                object = this.a;
                privateMaxEntriesMap.putAll(object);
                return privateMaxEntriesMap;
            }
            object = new IllegalStateException();
            throw object;
        }
        object = new IllegalArgumentException();
        throw object;
    }
}

