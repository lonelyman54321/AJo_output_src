/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.ImmutableDoubleArray;
import com.google.common.primitives.ImmutableDoubleArray$1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

class ImmutableDoubleArray$AsList
extends AbstractList
implements RandomAccess,
Serializable {
    private final ImmutableDoubleArray parent;

    private ImmutableDoubleArray$AsList(ImmutableDoubleArray immutableDoubleArray) {
        this.parent = immutableDoubleArray;
    }

    public /* synthetic */ ImmutableDoubleArray$AsList(ImmutableDoubleArray immutableDoubleArray, ImmutableDoubleArray$1 immutableDoubleArray$1) {
        this(immutableDoubleArray);
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
        int n4 = iterator instanceof ImmutableDoubleArray$AsList;
        if (n4 != 0) {
            iterator = (ImmutableDoubleArray$AsList)((Object)iterator);
            ImmutableDoubleArray immutableDoubleArray = this.parent;
            iterator = ((ImmutableDoubleArray$AsList)((Object)iterator)).parent;
            return immutableDoubleArray.equals(iterator);
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
        ImmutableDoubleArray immutableDoubleArray = this.parent;
        n4 = ImmutableDoubleArray.access$100(immutableDoubleArray);
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object = iterator.next();
            boolean bl2 = object instanceof Double;
            if (bl2) {
                double[] dArray = ImmutableDoubleArray.access$000(this.parent);
                int n7 = n4 + 1;
                double d2 = dArray[n4];
                double d5 = (Double)(object = (Double)object);
                if ((n4 = (int)(ImmutableDoubleArray.access$500(d2, d5) ? 1 : 0)) != 0) {
                    n4 = n7;
                    continue;
                }
            }
            return false;
        }
        return true;
    }

    public Double get(int n3) {
        return this.parent.get(n3);
    }

    public int hashCode() {
        return this.parent.hashCode();
    }

    public int indexOf(Object object) {
        int n3;
        boolean bl2 = object instanceof Double;
        if (bl2) {
            ImmutableDoubleArray immutableDoubleArray = this.parent;
            object = (Double)object;
            double d2 = (Double)object;
            n3 = immutableDoubleArray.indexOf(d2);
        } else {
            n3 = -1;
        }
        return n3;
    }

    public int lastIndexOf(Object object) {
        int n3;
        boolean bl2 = object instanceof Double;
        if (bl2) {
            ImmutableDoubleArray immutableDoubleArray = this.parent;
            object = (Double)object;
            double d2 = (Double)object;
            n3 = immutableDoubleArray.lastIndexOf(d2);
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

