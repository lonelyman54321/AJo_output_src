/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Ordering$IncomparableValueException;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

final class ExplicitOrdering
extends Ordering
implements Serializable {
    private static final long serialVersionUID;
    final ImmutableMap rankMap;

    public ExplicitOrdering(ImmutableMap immutableMap) {
        this.rankMap = immutableMap;
    }

    public ExplicitOrdering(List object) {
        object = Maps.indexMap((Collection)object);
        this((ImmutableMap)object);
    }

    private int rank(Object object) {
        Serializable serializable = (Integer)this.rankMap.get(object);
        if (serializable != null) {
            return serializable;
        }
        serializable = new Ordering$IncomparableValueException(object);
        throw serializable;
    }

    public int compare(Object object, Object object2) {
        int n3 = this.rank(object);
        int n4 = this.rank(object2);
        return n3 - n4;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof ExplicitOrdering;
        if (bl2) {
            object = (ExplicitOrdering)object;
            ImmutableMap immutableMap = this.rankMap;
            object = ((ExplicitOrdering)object).rankMap;
            return immutableMap.equals(object);
        }
        return false;
    }

    public int hashCode() {
        return this.rankMap.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Ordering.explicit(");
        ImmutableSet immutableSet = this.rankMap.keySet();
        stringBuilder.append(immutableSet);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

