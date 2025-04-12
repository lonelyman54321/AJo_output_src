/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Map;

class ImmutableMap$SerializedForm
implements Serializable {
    private static final boolean USE_LEGACY_SERIALIZATION = true;
    private static final long serialVersionUID;
    private final Object keys;
    private final Object values;

    public ImmutableMap$SerializedForm(ImmutableMap object) {
        boolean bl2;
        int n3 = object.size();
        Object[] objectArray = new Object[n3];
        int n4 = object.size();
        Object[] objectArray2 = new Object[n4];
        object = ((ImmutableMap)object).entrySet().iterator();
        int n7 = 0;
        while (bl2 = object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            Object k2 = entry.getKey();
            objectArray[n7] = k2;
            entry = entry.getValue();
            objectArray2[n7] = entry;
            ++n7;
        }
        this.keys = objectArray;
        this.values = objectArray2;
    }

    public final Object legacyReadResolve() {
        int n3;
        Object[] objectArray = (Object[])this.keys;
        Object[] objectArray2 = (Object[])this.values;
        int n4 = objectArray.length;
        ImmutableMap$Builder immutableMap$Builder = this.makeBuilder(n4);
        for (int i3 = 0; i3 < (n3 = objectArray.length); ++i3) {
            Object object = objectArray[i3];
            Object object2 = objectArray2[i3];
            immutableMap$Builder.put(object, object2);
        }
        return immutableMap$Builder.buildOrThrow();
    }

    public ImmutableMap$Builder makeBuilder(int n3) {
        ImmutableMap$Builder immutableMap$Builder = new ImmutableMap$Builder(n3);
        return immutableMap$Builder;
    }

    public final Object readResolve() {
        boolean bl2;
        Object object = this.keys;
        boolean bl3 = object instanceof ImmutableSet;
        if (!bl3) {
            return this.legacyReadResolve();
        }
        object = (ImmutableSet)object;
        Object object2 = (ImmutableCollection)this.values;
        int n3 = ((AbstractCollection)object).size();
        ImmutableMap$Builder immutableMap$Builder = this.makeBuilder(n3);
        object = ((ImmutableSet)object).iterator();
        object2 = ((ImmutableCollection)object2).iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            Object e5 = object2.next();
            immutableMap$Builder.put(e2, e5);
        }
        return immutableMap$Builder.buildOrThrow();
    }
}

