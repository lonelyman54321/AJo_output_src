/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets$ImprovedAbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class Maps$EntrySet
extends Sets$ImprovedAbstractSet {
    public void clear() {
        this.map().clear();
    }

    public boolean contains(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        boolean bl3 = false;
        if (bl2) {
            object = (Map.Entry)object;
            Object k2 = object.getKey();
            Object object2 = Maps.safeGet(this.map(), k2);
            boolean bl4 = Objects.equal(object2, object = object.getValue());
            if (bl4 && (object2 != null || (bl4 = (object = this.map()).containsKey(k2)))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public boolean isEmpty() {
        return this.map().isEmpty();
    }

    public abstract Map map();

    public boolean remove(Object object) {
        boolean bl2 = this.contains(object);
        if (bl2 && (bl2 = object instanceof Map.Entry)) {
            object = (Map.Entry)object;
            Set set = this.map().keySet();
            object = object.getKey();
            return set.remove(object);
        }
        return false;
    }

    public boolean removeAll(Collection object) {
        Object object2;
        try {
            object2 = Preconditions.checkNotNull(object);
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            object = object.iterator();
            return Sets.removeAllImpl((Set)this, (Iterator)object);
        }
        object2 = (Collection)object2;
        return super.removeAll((Collection)object2);
    }

    public boolean retainAll(Collection object) {
        Object object2;
        try {
            object2 = Preconditions.checkNotNull(object);
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            boolean bl2;
            int n3 = object.size();
            object2 = Sets.newHashSetWithExpectedSize(n3);
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Object object3 = object.next();
                boolean bl3 = this.contains(object3);
                if (!bl3 || !(bl3 = object3 instanceof Map.Entry)) continue;
                object3 = ((Map.Entry)object3).getKey();
                object2.add(object3);
            }
            return this.map().keySet().retainAll((Collection<?>)object2);
        }
        object2 = (Collection)object2;
        return super.retainAll((Collection)object2);
    }

    public int size() {
        return this.map().size();
    }
}

