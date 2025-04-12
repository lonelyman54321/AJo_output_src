/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CartesianList;
import com.google.common.collect.ForwardingCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets$CartesianSet$1;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Set;

final class Sets$CartesianSet
extends ForwardingCollection
implements Set {
    private final transient ImmutableList axes;
    private final transient CartesianList delegate;

    private Sets$CartesianSet(ImmutableList immutableList, CartesianList cartesianList) {
        this.axes = immutableList;
        this.delegate = cartesianList;
    }

    public static Set create(List object) {
        Set set;
        int n3 = object.size();
        Object object2 = new ImmutableList$Builder(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            set = ImmutableSet.copyOf((Collection)((Set)object.next()));
            boolean bl2 = set.isEmpty();
            if (bl2) {
                return ImmutableSet.of();
            }
            ((ImmutableList$Builder)object2).add(set);
        }
        object = ((ImmutableList$Builder)object2).build();
        object2 = new Sets$CartesianSet$1((ImmutableList)object);
        CartesianList cartesianList = new CartesianList((ImmutableList)object2);
        set = new Sets$CartesianSet((ImmutableList)object, cartesianList);
        return set;
    }

    public boolean contains(Object iterator) {
        ImmutableList immutableList;
        int n3;
        int n4 = iterator instanceof List;
        if (n4 == 0) {
            return false;
        }
        n4 = (iterator = (List)((Object)iterator)).size();
        if (n4 != (n3 = (immutableList = this.axes).size())) {
            return false;
        }
        iterator = iterator.iterator();
        n4 = 0;
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            immutableList = iterator.next();
            ImmutableSet immutableSet = (ImmutableSet)this.axes.get(n4);
            n3 = (int)(immutableSet.contains(immutableList) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            ++n4;
        }
        return true;
    }

    public Collection delegate() {
        return this.delegate;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof Sets$CartesianSet;
        if (bl2) {
            object = (Sets$CartesianSet)object;
            ImmutableList immutableList = this.axes;
            object = ((Sets$CartesianSet)object).axes;
            return immutableList.equals(object);
        }
        return super.equals(object);
    }

    public int hashCode() {
        Collection collection;
        int n3;
        int n4 = this.size();
        int n7 = 1;
        n4 -= n7;
        UnmodifiableIterator unmodifiableIterator = null;
        for (int i3 = 0; i3 < (n3 = ((AbstractCollection)(collection = this.axes)).size()); ++i3) {
            n4 = ~(~(n4 * 31));
        }
        unmodifiableIterator = this.axes.iterator();
        while ((n3 = (int)(unmodifiableIterator.hasNext() ? 1 : 0)) != 0) {
            collection = (Set)unmodifiableIterator.next();
            int n8 = this.size();
            int n10 = collection.size();
            n3 = collection.hashCode() * (n8 /= n10) + (n7 *= 31);
            n7 = ~(~n3);
        }
        return ~(~(n7 + n4));
    }
}

