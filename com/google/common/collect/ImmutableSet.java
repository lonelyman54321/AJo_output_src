/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.Hashing;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet$Builder;
import com.google.common.collect.ImmutableSet$SerializedForm;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.SingletonImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

public abstract class ImmutableSet
extends ImmutableCollection
implements Set {
    private static final int CUTOFF = 0x2CCCCCCC;
    private static final double DESIRED_LOAD_FACTOR = 0.7;
    static final int MAX_TABLE_SIZE = 0x40000000;
    private transient ImmutableList asList;

    public static /* synthetic */ boolean access$000(int n3, int n4) {
        return ImmutableSet.shouldTrim(n3, n4);
    }

    public static /* synthetic */ ImmutableSet access$100(int n3, Object[] objectArray) {
        return ImmutableSet.construct(n3, objectArray);
    }

    public static ImmutableSet$Builder builder() {
        ImmutableSet$Builder immutableSet$Builder = new ImmutableSet$Builder();
        return immutableSet$Builder;
    }

    public static ImmutableSet$Builder builderWithExpectedSize(int n3) {
        CollectPreconditions.checkNonnegative(n3, "expectedSize");
        ImmutableSet$Builder immutableSet$Builder = new ImmutableSet$Builder(n3);
        return immutableSet$Builder;
    }

    public static int chooseTableSize(int n3) {
        n3 = Math.max(n3, 2);
        int n4 = 0x2CCCCCCC;
        int n7 = 1;
        if (n3 < n4) {
            double d2;
            double d5;
            double d7;
            double d9;
            n4 = Integer.highestOneBit(n3 + -1) << n7;
            while ((d9 = (d7 = (d5 = (double)n4 * 0.7) - (d2 = (double)n3)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) < 0) {
                n4 <<= 1;
            }
            return n4;
        }
        n4 = 0x40000000;
        if (n3 >= n4) {
            n7 = 0;
        }
        Preconditions.checkArgument(n7 != 0, "collection too large");
        return n4;
    }

    private static ImmutableSet construct(int n3, Object ... objectArray) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                Object[] objectArray2;
                int n7;
                int n8 = ImmutableSet.chooseTableSize(n3);
                Object[] objectArray3 = new Object[n8];
                int n10 = n8 + -1;
                int n14 = 0;
                int n15 = 0;
                block0: for (n7 = 0; n7 < n3; ++n7) {
                    objectArray2 = ObjectArrays.checkElementNotNull(objectArray[n7], n7);
                    int n16 = objectArray2.hashCode();
                    int n17 = Hashing.smear(n16);
                    while (true) {
                        int n18;
                        Object object;
                        if ((object = objectArray3[n18 = n17 & n10]) == null) {
                            n17 = n15 + 1;
                            objectArray[n15] = objectArray2;
                            objectArray3[n18] = objectArray2;
                            n14 += n16;
                            n15 = n17;
                            continue block0;
                        }
                        n18 = (int)(object.equals(objectArray2) ? 1 : 0);
                        if (n18 != 0) {
                            continue block0;
                        }
                        ++n17;
                    }
                }
                n7 = 0;
                Arrays.fill(objectArray, n15, n3, null);
                if (n15 == n4) {
                    Object object = objectArray[0];
                    Objects.requireNonNull(object);
                    objectArray = new SingletonImmutableSet(object);
                    return objectArray;
                }
                n3 = ImmutableSet.chooseTableSize(n15);
                if (n3 < (n8 /= 2)) {
                    return ImmutableSet.construct(n15, objectArray);
                }
                n3 = objectArray.length;
                if ((n3 = (int)(ImmutableSet.shouldTrim(n15, n3) ? 1 : 0)) != 0) {
                    objectArray = Arrays.copyOf(objectArray, n15);
                }
                objectArray2 = objectArray;
                RegularImmutableSet regularImmutableSet = new RegularImmutableSet(objectArray, n14, objectArray3, n10, n15);
                return regularImmutableSet;
            }
            Object object = objectArray[0];
            Objects.requireNonNull(object);
            return ImmutableSet.of(object);
        }
        return ImmutableSet.of();
    }

    public static ImmutableSet copyOf(Iterable iterable) {
        boolean bl2 = iterable instanceof Collection;
        iterable = bl2 ? ImmutableSet.copyOf((Collection)iterable) : ImmutableSet.copyOf(iterable.iterator());
        return iterable;
    }

    public static ImmutableSet copyOf(Collection objectArray) {
        boolean bl2 = objectArray instanceof ImmutableSet;
        if (bl2 && !(bl2 = objectArray instanceof SortedSet)) {
            Object object = objectArray;
            object = (ImmutableSet)objectArray;
            boolean bl3 = ((ImmutableCollection)object).isPartialView();
            if (!bl3) {
                return object;
            }
        }
        objectArray = objectArray.toArray();
        return ImmutableSet.construct(objectArray.length, objectArray);
    }

    public static ImmutableSet copyOf(Iterator iterator) {
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            return ImmutableSet.of();
        }
        Object e2 = iterator.next();
        boolean bl3 = iterator.hasNext();
        if (!bl3) {
            return ImmutableSet.of(e2);
        }
        ImmutableSet$Builder immutableSet$Builder = new ImmutableSet$Builder();
        return ((ImmutableSet$Builder)((ImmutableSet$Builder)immutableSet$Builder.add(e2)).addAll(iterator)).build();
    }

    public static ImmutableSet copyOf(Object[] objectArray) {
        int n3 = objectArray.length;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n3 = objectArray.length;
                objectArray = (Object[])objectArray.clone();
                return ImmutableSet.construct(n3, objectArray);
            }
            return ImmutableSet.of(objectArray[0]);
        }
        return ImmutableSet.of();
    }

    public static ImmutableSet of() {
        return RegularImmutableSet.EMPTY;
    }

    public static ImmutableSet of(Object object) {
        SingletonImmutableSet singletonImmutableSet = new SingletonImmutableSet(object);
        return singletonImmutableSet;
    }

    public static ImmutableSet of(Object object, Object object2) {
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        return ImmutableSet.construct(n3, objectArray);
    }

    public static ImmutableSet of(Object object, Object object2, Object object3) {
        int n3 = 3;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        return ImmutableSet.construct(n3, objectArray);
    }

    public static ImmutableSet of(Object object, Object object2, Object object3, Object object4) {
        int n3 = 4;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        return ImmutableSet.construct(n3, objectArray);
    }

    public static ImmutableSet of(Object object, Object object2, Object object3, Object object4, Object object5) {
        int n3 = 5;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        return ImmutableSet.construct(n3, objectArray);
    }

    public static ImmutableSet of(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object ... objectArray) {
        int n3 = objectArray.length;
        int n4 = 0x7FFFFFF9;
        int n7 = 1;
        n3 = n3 <= n4 ? 1 : 0;
        Preconditions.checkArgument(n3 != 0, "the total number of elements must fit in an int");
        n3 = objectArray.length;
        n4 = 6;
        Object[] objectArray2 = new Object[n3 += n4];
        objectArray2[0] = object;
        objectArray2[n7] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        int n8 = objectArray.length;
        System.arraycopy(objectArray, 0, objectArray2, n4, n8);
        return ImmutableSet.construct(n3, objectArray2);
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("Use SerializedForm");
        throw object;
    }

    private static boolean shouldTrim(int n3, int n4) {
        int n7 = n4 >> 1;
        n3 = n3 < (n7 += (n4 >>= 2)) ? 1 : 0;
        return n3 != 0;
    }

    public ImmutableList asList() {
        ImmutableList immutableList = this.asList;
        if (immutableList == null) {
            this.asList = immutableList = this.createAsList();
        }
        return immutableList;
    }

    public ImmutableList createAsList() {
        return ImmutableList.asImmutableList(this.toArray());
    }

    public boolean equals(Object object) {
        boolean bl2;
        if (object == this) {
            return true;
        }
        boolean n3 = object instanceof ImmutableSet;
        if (n3 && (bl2 = this.isHashCodeFast())) {
            int n4;
            int n7;
            Object object2 = object;
            object2 = (ImmutableSet)object;
            boolean bl3 = ((ImmutableSet)object2).isHashCodeFast();
            if (bl3 && (n7 = this.hashCode()) != (n4 = object.hashCode())) {
                return false;
            }
        }
        return Sets.equalsImpl(this, object);
    }

    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract UnmodifiableIterator iterator();

    public Object writeReplace() {
        Object[] objectArray = this.toArray();
        ImmutableSet$SerializedForm immutableSet$SerializedForm = new ImmutableSet$SerializedForm(objectArray);
        return immutableSet$SerializedForm;
    }
}

