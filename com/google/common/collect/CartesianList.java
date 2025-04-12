/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CartesianList$1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.math.IntMath;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

final class CartesianList
extends AbstractList
implements RandomAccess {
    private final transient ImmutableList axes;
    private final transient int[] axesSizeProduct;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CartesianList(ImmutableList serializable) {
        this.axes = serializable;
        int n3 = ((AbstractCollection)((Object)serializable)).size();
        int n4 = 1;
        int[] nArray = new int[n3 += n4];
        int n7 = ((AbstractCollection)((Object)serializable)).size();
        nArray[n7] = n4;
        try {
            n7 = ((AbstractCollection)((Object)serializable)).size() - n4;
        }
        catch (ArithmeticException arithmeticException) {
            super("Cartesian product too large; must have size at most Integer.MAX_VALUE");
            throw serializable;
        }
        while (true) {
            if (n7 < 0) {
                this.axesSizeProduct = nArray;
                return;
            }
            n4 = n7 + 1;
            {
                n4 = nArray[n4];
                Object object = serializable.get(n7);
                object = (List)object;
                int n8 = object.size();
                nArray[n7] = n4 = IntMath.checkedMultiply(n4, n8);
                n7 += -1;
                continue;
            }
            break;
        }
    }

    public static /* synthetic */ ImmutableList access$000(CartesianList cartesianList) {
        return cartesianList.axes;
    }

    public static /* synthetic */ int access$100(CartesianList cartesianList, int n3, int n4) {
        return cartesianList.getAxisIndexForProductIndex(n3, n4);
    }

    public static List create(List object) {
        int n3 = object.size();
        Object object2 = new ImmutableList$Builder(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            ImmutableList immutableList = ImmutableList.copyOf((Collection)((List)object.next()));
            boolean bl2 = immutableList.isEmpty();
            if (bl2) {
                return ImmutableList.of();
            }
            ((ImmutableList$Builder)object2).add(immutableList);
        }
        object2 = ((ImmutableList$Builder)object2).build();
        object = new CartesianList((ImmutableList)object2);
        return object;
    }

    private int getAxisIndexForProductIndex(int n3, int n4) {
        int[] nArray = this.axesSizeProduct;
        int n7 = n4 + 1;
        int n8 = nArray[n7];
        n4 = ((List)this.axes.get(n4)).size();
        return (n3 /= n8) % n4;
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
            List list = (List)this.axes.get(n4);
            n3 = (int)(list.contains(immutableList) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            ++n4;
        }
        return true;
    }

    public ImmutableList get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        CartesianList$1 cartesianList$1 = new CartesianList$1(this, n3);
        return cartesianList$1;
    }

    public int indexOf(Object listIterator) {
        ImmutableList immutableList;
        Object object;
        int n3 = listIterator instanceof List;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        n3 = (listIterator = (List)((Object)listIterator)).size();
        if (n3 != (object = (immutableList = this.axes).size())) {
            return n4;
        }
        listIterator = listIterator.listIterator();
        n3 = 0;
        while ((object = (Object)listIterator.hasNext()) != 0) {
            Object object2;
            object = listIterator.nextIndex();
            List list = (List)this.axes.get((int)object);
            int n7 = list.indexOf(object2 = listIterator.next());
            if (n7 == n4) {
                return n4;
            }
            object2 = this.axesSizeProduct;
            ++object;
            object = object2[object];
            n3 += (n7 *= object);
        }
        return n3;
    }

    public int lastIndexOf(Object listIterator) {
        ImmutableList immutableList;
        Object object;
        int n3 = listIterator instanceof List;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        n3 = (listIterator = (List)((Object)listIterator)).size();
        if (n3 != (object = (immutableList = this.axes).size())) {
            return n4;
        }
        listIterator = listIterator.listIterator();
        n3 = 0;
        while ((object = (Object)listIterator.hasNext()) != 0) {
            Object object2;
            object = listIterator.nextIndex();
            List list = (List)this.axes.get((int)object);
            int n7 = list.lastIndexOf(object2 = listIterator.next());
            if (n7 == n4) {
                return n4;
            }
            object2 = this.axesSizeProduct;
            ++object;
            object = object2[object];
            n3 += (n7 *= object);
        }
        return n3;
    }

    public int size() {
        return this.axesSizeProduct[0];
    }
}

