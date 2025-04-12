/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.ImmutableLongArray;
import com.google.common.primitives.ImmutableLongArray$1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

class ImmutableLongArray$AsList
extends AbstractList
implements RandomAccess,
Serializable {
    private final ImmutableLongArray parent;

    private ImmutableLongArray$AsList(ImmutableLongArray immutableLongArray) {
        this.parent = immutableLongArray;
    }

    public /* synthetic */ ImmutableLongArray$AsList(ImmutableLongArray immutableLongArray, ImmutableLongArray$1 immutableLongArray$1) {
        this(immutableLongArray);
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
        int n4 = iterator instanceof ImmutableLongArray$AsList;
        if (n4 != 0) {
            iterator = (ImmutableLongArray$AsList)((Object)iterator);
            ImmutableLongArray immutableLongArray = this.parent;
            iterator = ((ImmutableLongArray$AsList)((Object)iterator)).parent;
            return immutableLongArray.equals(iterator);
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
        ImmutableLongArray immutableLongArray = this.parent;
        n4 = ImmutableLongArray.access$100(immutableLongArray);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object = iterator.next();
            boolean bl2 = object instanceof Long;
            if (bl2) {
                long[] lArray = ImmutableLongArray.access$000(this.parent);
                int n7 = n4 + 1;
                long l2 = lArray[n4];
                long l3 = (Long)(object = (Long)object);
                long l4 = l2 - l3;
                if ((n4 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0) {
                    n4 = n7;
                    continue;
                }
            }
            return false;
        }
        return true;
    }

    public Long get(int n3) {
        return this.parent.get(n3);
    }

    public int hashCode() {
        return this.parent.hashCode();
    }

    public int indexOf(Object object) {
        int n3;
        boolean bl2 = object instanceof Long;
        if (bl2) {
            ImmutableLongArray immutableLongArray = this.parent;
            object = (Long)object;
            long l2 = (Long)object;
            n3 = immutableLongArray.indexOf(l2);
        } else {
            n3 = -1;
        }
        return n3;
    }

    public int lastIndexOf(Object object) {
        int n3;
        boolean bl2 = object instanceof Long;
        if (bl2) {
            ImmutableLongArray immutableLongArray = this.parent;
            object = (Long)object;
            long l2 = (Long)object;
            n3 = immutableLongArray.lastIndexOf(l2);
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

