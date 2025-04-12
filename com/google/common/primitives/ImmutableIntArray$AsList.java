/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.ImmutableIntArray;
import com.google.common.primitives.ImmutableIntArray$1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

class ImmutableIntArray$AsList
extends AbstractList
implements RandomAccess,
Serializable {
    private final ImmutableIntArray parent;

    private ImmutableIntArray$AsList(ImmutableIntArray immutableIntArray) {
        this.parent = immutableIntArray;
    }

    public /* synthetic */ ImmutableIntArray$AsList(ImmutableIntArray immutableIntArray, ImmutableIntArray$1 immutableIntArray$1) {
        this(immutableIntArray);
    }

    public boolean contains(Object object) {
        int n3 = this.indexOf(object);
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public boolean equals(Object iterator) {
        int n3;
        int n4 = iterator instanceof ImmutableIntArray$AsList;
        if (n4 != 0) {
            iterator = (ImmutableIntArray$AsList)((Object)iterator);
            ImmutableIntArray immutableIntArray = this.parent;
            iterator = ((ImmutableIntArray$AsList)((Object)iterator)).parent;
            return immutableIntArray.equals(iterator);
        }
        n4 = iterator instanceof List;
        if (n4 == 0) {
            return false;
        }
        iterator = (List)((Object)iterator);
        n4 = this.size();
        if (n4 != (n3 = iterator.size())) {
            return false;
        }
        ImmutableIntArray immutableIntArray = this.parent;
        n4 = ImmutableIntArray.access$100(immutableIntArray);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object = iterator.next();
            boolean bl2 = object instanceof Integer;
            if (bl2) {
                int[] nArray = ImmutableIntArray.access$000(this.parent);
                int n7 = n4 + 1;
                n3 = (Integer)(object = (Integer)object);
                if ((n4 = nArray[n4]) == n3) {
                    n4 = n7;
                    continue;
                }
            }
            return false;
        }
        return true;
    }

    public Integer get(int n3) {
        return this.parent.get(n3);
    }

    public int hashCode() {
        return this.parent.hashCode();
    }

    public int indexOf(Object object) {
        int n3;
        boolean bl2 = object instanceof Integer;
        if (bl2) {
            ImmutableIntArray immutableIntArray = this.parent;
            object = (Integer)object;
            n3 = (Integer)object;
            n3 = immutableIntArray.indexOf(n3);
        } else {
            n3 = -1;
        }
        return n3;
    }

    public int lastIndexOf(Object object) {
        int n3;
        boolean bl2 = object instanceof Integer;
        if (bl2) {
            ImmutableIntArray immutableIntArray = this.parent;
            object = (Integer)object;
            n3 = (Integer)object;
            n3 = immutableIntArray.lastIndexOf(n3);
        } else {
            n3 = -1;
        }
        return n3;
    }

    public int size() {
        return this.parent.length();
    }

    public List subList(int n3, int n4) {
        return this.parent.subArray(n3, n4).asList();
    }

    public String toString() {
        return this.parent.toString();
    }
}

