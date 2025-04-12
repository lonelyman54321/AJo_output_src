/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.ImmutableLongArray$1;
import com.google.common.primitives.ImmutableLongArray$AsList;
import com.google.common.primitives.ImmutableLongArray$Builder;
import com.google.common.primitives.Longs;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class ImmutableLongArray
implements Serializable {
    private static final ImmutableLongArray EMPTY;
    private final long[] array;
    private final int end;
    private final transient int start;

    static {
        ImmutableLongArray immutableLongArray;
        long[] lArray = new long[]{};
        EMPTY = immutableLongArray = new ImmutableLongArray(lArray);
    }

    private ImmutableLongArray(long[] lArray) {
        int n3 = lArray.length;
        this(lArray, 0, n3);
    }

    private ImmutableLongArray(long[] lArray, int n3, int n4) {
        this.array = lArray;
        this.start = n3;
        this.end = n4;
    }

    public /* synthetic */ ImmutableLongArray(long[] lArray, int n3, int n4, ImmutableLongArray$1 immutableLongArray$1) {
        this(lArray, n3, n4);
    }

    public static /* synthetic */ long[] access$000(ImmutableLongArray immutableLongArray) {
        return immutableLongArray.array;
    }

    public static /* synthetic */ int access$100(ImmutableLongArray immutableLongArray) {
        return immutableLongArray.start;
    }

    public static /* synthetic */ ImmutableLongArray access$200() {
        return EMPTY;
    }

    public static ImmutableLongArray$Builder builder() {
        ImmutableLongArray$Builder immutableLongArray$Builder = new ImmutableLongArray$Builder(10);
        return immutableLongArray$Builder;
    }

    public static ImmutableLongArray$Builder builder(int n3) {
        ImmutableLongArray$Builder immutableLongArray$Builder;
        boolean bl2;
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            immutableLongArray$Builder = null;
        }
        Preconditions.checkArgument(bl2, "Invalid initialCapacity: %s", n3);
        immutableLongArray$Builder = new ImmutableLongArray$Builder(n3);
        return immutableLongArray$Builder;
    }

    public static ImmutableLongArray copyOf(Iterable iterable) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            return ImmutableLongArray.copyOf((Collection)iterable);
        }
        return ImmutableLongArray.builder().addAll(iterable).build();
    }

    public static ImmutableLongArray copyOf(Collection object) {
        boolean bl2 = object.isEmpty();
        if (bl2) {
            object = EMPTY;
        } else {
            object = Longs.toArray((Collection)object);
            ImmutableLongArray immutableLongArray = new ImmutableLongArray((long[])object);
            object = immutableLongArray;
        }
        return object;
    }

    public static ImmutableLongArray copyOf(long[] object) {
        int n3 = ((long[])object).length;
        if (n3 == 0) {
            object = EMPTY;
        } else {
            int n4 = ((long[])object).length;
            object = Arrays.copyOf(object, n4);
            ImmutableLongArray immutableLongArray = new ImmutableLongArray((long[])object);
            object = immutableLongArray;
        }
        return object;
    }

    private boolean isPartialView() {
        long[] lArray;
        int n3;
        int n4 = this.start;
        n4 = n4 <= 0 && (n4 = this.end) >= (n3 = (lArray = this.array).length) ? 0 : 1;
        return n4 != 0;
    }

    public static ImmutableLongArray of() {
        return EMPTY;
    }

    public static ImmutableLongArray of(long l2) {
        long[] lArray = new long[]{l2};
        ImmutableLongArray immutableLongArray = new ImmutableLongArray(lArray);
        return immutableLongArray;
    }

    public static ImmutableLongArray of(long l2, long l3) {
        long[] lArray = new long[]{l2, l3};
        ImmutableLongArray immutableLongArray = new ImmutableLongArray(lArray);
        return immutableLongArray;
    }

    public static ImmutableLongArray of(long l2, long l3, long l4) {
        long[] lArray = new long[]{l2, l3, l4};
        ImmutableLongArray immutableLongArray = new ImmutableLongArray(lArray);
        return immutableLongArray;
    }

    public static ImmutableLongArray of(long l2, long l3, long l4, long l7) {
        long[] lArray = new long[]{l2, l3, l4, l7};
        ImmutableLongArray immutableLongArray = new ImmutableLongArray(lArray);
        return immutableLongArray;
    }

    public static ImmutableLongArray of(long l2, long l3, long l4, long l7, long l8) {
        long[] lArray = new long[]{l2, l3, l4, l7, l8};
        ImmutableLongArray immutableLongArray = new ImmutableLongArray(lArray);
        return immutableLongArray;
    }

    public static ImmutableLongArray of(long l2, long l3, long l4, long l7, long l8, long l12) {
        long[] lArray = new long[]{l2, l3, l4, l7, l8, l12};
        ImmutableLongArray immutableLongArray = new ImmutableLongArray(lArray);
        return immutableLongArray;
    }

    public static ImmutableLongArray of(long l2, long ... lArray) {
        long[] lArray2;
        boolean bl2 = lArray.length;
        boolean bl3 = 2147483646 != 0;
        int n3 = 1;
        if (bl2 <= bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            lArray2 = null;
        }
        Preconditions.checkArgument(bl2, "the total number of elements must fit in an int");
        lArray2 = new long[lArray.length + n3];
        lArray2[0] = l2;
        int n4 = lArray.length;
        System.arraycopy(lArray, 0, lArray2, n3, n4);
        ImmutableLongArray immutableLongArray = new ImmutableLongArray(lArray2);
        return immutableLongArray;
    }

    public List asList() {
        ImmutableLongArray$AsList immutableLongArray$AsList = new ImmutableLongArray$AsList(this, null);
        return immutableLongArray$AsList;
    }

    public boolean contains(long l2) {
        int n3 = this.indexOf(l2);
        n3 = n3 >= 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof ImmutableLongArray;
        if (n4 == 0) {
            return false;
        }
        object = (ImmutableLongArray)object;
        n4 = this.length();
        if (n4 != (n3 = ((ImmutableLongArray)object).length())) {
            return false;
        }
        for (n4 = 0; n4 < (n3 = this.length()); ++n4) {
            long l2;
            long l3 = this.get(n4);
            long l4 = l3 - (l2 = ((ImmutableLongArray)object).get(n4));
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) continue;
            return false;
        }
        return bl2;
    }

    public long get(int n3) {
        int n4 = this.length();
        Preconditions.checkElementIndex(n3, n4);
        long[] lArray = this.array;
        int n7 = this.start + n3;
        return lArray[n7];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            n4 *= 31;
            long[] lArray = this.array;
            long l2 = lArray[i3];
            n3 = Longs.hashCode(l2);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(long l2) {
        int n3;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            long[] lArray = this.array;
            long l3 = lArray[i3];
            long l4 = l3 - l2;
            n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
            if (n3 != 0) continue;
            int n4 = this.start;
            return i3 - n4;
        }
        return -1;
    }

    public boolean isEmpty() {
        int n3 = this.end;
        int n4 = this.start;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public int lastIndexOf(long l2) {
        int n3;
        for (int i3 = this.end + -1; i3 >= (n3 = this.start); i3 += -1) {
            long[] lArray = this.array;
            long l3 = lArray[i3];
            long l4 = l3 - l2;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object != false) continue;
            return i3 - n3;
        }
        return -1;
    }

    public int length() {
        int n3 = this.end;
        int n4 = this.start;
        return n3 - n4;
    }

    public Object readResolve() {
        boolean bl2 = this.isEmpty();
        ImmutableLongArray immutableLongArray = bl2 ? EMPTY : this;
        return immutableLongArray;
    }

    public ImmutableLongArray subArray(int n3, int n4) {
        ImmutableLongArray immutableLongArray;
        int n7 = this.length();
        Preconditions.checkPositionIndexes(n3, n4, n7);
        if (n3 == n4) {
            immutableLongArray = EMPTY;
        } else {
            ImmutableLongArray immutableLongArray2;
            long[] lArray = this.array;
            int n8 = this.start;
            n3 += n8;
            immutableLongArray = immutableLongArray2 = new ImmutableLongArray(lArray, n3, n8 += n4);
        }
        return immutableLongArray;
    }

    public long[] toArray() {
        long[] lArray = this.array;
        int n3 = this.start;
        int n4 = this.end;
        return Arrays.copyOfRange(lArray, n3, n4);
    }

    public String toString() {
        boolean bl2 = this.isEmpty();
        if (bl2) {
            return "[]";
        }
        int n3 = this.length() * 5;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('[');
        long[] lArray = this.array;
        int n4 = this.start;
        long l2 = lArray[n4];
        stringBuilder.append(l2);
        n3 = this.start;
        while (++n3 < (n4 = this.end)) {
            stringBuilder.append(", ");
            long[] lArray2 = this.array;
            long l3 = lArray2[n3];
            stringBuilder.append(l3);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public ImmutableLongArray trimmed() {
        ImmutableLongArray immutableLongArray;
        boolean bl2 = this.isPartialView();
        if (bl2) {
            long[] lArray = this.toArray();
            immutableLongArray = new ImmutableLongArray(lArray);
        } else {
            immutableLongArray = this;
        }
        return immutableLongArray;
    }

    public Object writeReplace() {
        return this.trimmed();
    }
}

