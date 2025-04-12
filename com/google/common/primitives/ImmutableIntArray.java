/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.ImmutableIntArray$1;
import com.google.common.primitives.ImmutableIntArray$AsList;
import com.google.common.primitives.ImmutableIntArray$Builder;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class ImmutableIntArray
implements Serializable {
    private static final ImmutableIntArray EMPTY;
    private final int[] array;
    private final int end;
    private final transient int start;

    static {
        ImmutableIntArray immutableIntArray;
        int[] nArray = new int[]{};
        EMPTY = immutableIntArray = new ImmutableIntArray(nArray);
    }

    private ImmutableIntArray(int[] nArray) {
        int n3 = nArray.length;
        this(nArray, 0, n3);
    }

    private ImmutableIntArray(int[] nArray, int n3, int n4) {
        this.array = nArray;
        this.start = n3;
        this.end = n4;
    }

    public /* synthetic */ ImmutableIntArray(int[] nArray, int n3, int n4, ImmutableIntArray$1 immutableIntArray$1) {
        this(nArray, n3, n4);
    }

    public static /* synthetic */ int[] access$000(ImmutableIntArray immutableIntArray) {
        return immutableIntArray.array;
    }

    public static /* synthetic */ int access$100(ImmutableIntArray immutableIntArray) {
        return immutableIntArray.start;
    }

    public static /* synthetic */ ImmutableIntArray access$200() {
        return EMPTY;
    }

    public static ImmutableIntArray$Builder builder() {
        ImmutableIntArray$Builder immutableIntArray$Builder = new ImmutableIntArray$Builder(10);
        return immutableIntArray$Builder;
    }

    public static ImmutableIntArray$Builder builder(int n3) {
        ImmutableIntArray$Builder immutableIntArray$Builder;
        boolean bl2;
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            immutableIntArray$Builder = null;
        }
        Preconditions.checkArgument(bl2, "Invalid initialCapacity: %s", n3);
        immutableIntArray$Builder = new ImmutableIntArray$Builder(n3);
        return immutableIntArray$Builder;
    }

    public static ImmutableIntArray copyOf(Iterable iterable) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            return ImmutableIntArray.copyOf((Collection)iterable);
        }
        return ImmutableIntArray.builder().addAll(iterable).build();
    }

    public static ImmutableIntArray copyOf(Collection object) {
        boolean bl2 = object.isEmpty();
        if (bl2) {
            object = EMPTY;
        } else {
            object = Ints.toArray((Collection)object);
            ImmutableIntArray immutableIntArray = new ImmutableIntArray((int[])object);
            object = immutableIntArray;
        }
        return object;
    }

    public static ImmutableIntArray copyOf(int[] object) {
        int n3 = ((int[])object).length;
        if (n3 == 0) {
            object = EMPTY;
        } else {
            int n4 = ((int[])object).length;
            object = Arrays.copyOf(object, n4);
            ImmutableIntArray immutableIntArray = new ImmutableIntArray((int[])object);
            object = immutableIntArray;
        }
        return object;
    }

    private boolean isPartialView() {
        int[] nArray;
        int n3;
        int n4 = this.start;
        n4 = n4 <= 0 && (n4 = this.end) >= (n3 = (nArray = this.array).length) ? 0 : 1;
        return n4 != 0;
    }

    public static ImmutableIntArray of() {
        return EMPTY;
    }

    public static ImmutableIntArray of(int n3) {
        int[] nArray = new int[]{n3};
        ImmutableIntArray immutableIntArray = new ImmutableIntArray(nArray);
        return immutableIntArray;
    }

    public static ImmutableIntArray of(int n3, int n4) {
        int[] nArray = new int[]{n3, n4};
        ImmutableIntArray immutableIntArray = new ImmutableIntArray(nArray);
        return immutableIntArray;
    }

    public static ImmutableIntArray of(int n3, int n4, int n7) {
        int[] nArray = new int[]{n3, n4, n7};
        ImmutableIntArray immutableIntArray = new ImmutableIntArray(nArray);
        return immutableIntArray;
    }

    public static ImmutableIntArray of(int n3, int n4, int n7, int n8) {
        int[] nArray = new int[]{n3, n4, n7, n8};
        ImmutableIntArray immutableIntArray = new ImmutableIntArray(nArray);
        return immutableIntArray;
    }

    public static ImmutableIntArray of(int n3, int n4, int n7, int n8, int n10) {
        int[] nArray = new int[]{n3, n4, n7, n8, n10};
        ImmutableIntArray immutableIntArray = new ImmutableIntArray(nArray);
        return immutableIntArray;
    }

    public static ImmutableIntArray of(int n3, int n4, int n7, int n8, int n10, int n14) {
        int[] nArray = new int[]{n3, n4, n7, n8, n10, n14};
        ImmutableIntArray immutableIntArray = new ImmutableIntArray(nArray);
        return immutableIntArray;
    }

    public static ImmutableIntArray of(int n3, int ... nArray) {
        int[] nArray2;
        boolean bl2 = nArray.length;
        boolean bl3 = 2147483646 != 0;
        int n4 = 1;
        if (bl2 <= bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            nArray2 = null;
        }
        Preconditions.checkArgument(bl2, "the total number of elements must fit in an int");
        nArray2 = new int[nArray.length + n4];
        nArray2[0] = n3;
        n3 = nArray.length;
        System.arraycopy(nArray, 0, nArray2, n4, n3);
        ImmutableIntArray immutableIntArray = new ImmutableIntArray(nArray2);
        return immutableIntArray;
    }

    public List asList() {
        ImmutableIntArray$AsList immutableIntArray$AsList = new ImmutableIntArray$AsList(this, null);
        return immutableIntArray$AsList;
    }

    public boolean contains(int n3) {
        n3 = (n3 = this.indexOf(n3)) >= 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof ImmutableIntArray;
        if (n4 == 0) {
            return false;
        }
        object = (ImmutableIntArray)object;
        n4 = this.length();
        if (n4 != (n3 = ((ImmutableIntArray)object).length())) {
            return false;
        }
        for (n4 = 0; n4 < (n3 = this.length()); ++n4) {
            int n7;
            n3 = this.get(n4);
            if (n3 == (n7 = ((ImmutableIntArray)object).get(n4))) continue;
            return false;
        }
        return bl2;
    }

    public int get(int n3) {
        int n4 = this.length();
        Preconditions.checkElementIndex(n3, n4);
        int[] nArray = this.array;
        int n7 = this.start + n3;
        return nArray[n7];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            n4 *= 31;
            int[] nArray = this.array;
            n3 = Ints.hashCode(nArray[i3]);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(int n3) {
        int n4;
        for (int i3 = this.start; i3 < (n4 = this.end); ++i3) {
            int[] nArray = this.array;
            n4 = nArray[i3];
            if (n4 != n3) continue;
            n3 = this.start;
            return i3 - n3;
        }
        return -1;
    }

    public boolean isEmpty() {
        int n3 = this.end;
        int n4 = this.start;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public int lastIndexOf(int n3) {
        int n4;
        for (int i3 = this.end + -1; i3 >= (n4 = this.start); i3 += -1) {
            int[] nArray = this.array;
            int n7 = nArray[i3];
            if (n7 != n3) continue;
            return i3 - n4;
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
        ImmutableIntArray immutableIntArray = bl2 ? EMPTY : this;
        return immutableIntArray;
    }

    public ImmutableIntArray subArray(int n3, int n4) {
        ImmutableIntArray immutableIntArray;
        int n7 = this.length();
        Preconditions.checkPositionIndexes(n3, n4, n7);
        if (n3 == n4) {
            immutableIntArray = EMPTY;
        } else {
            ImmutableIntArray immutableIntArray2;
            int[] nArray = this.array;
            int n8 = this.start;
            n3 += n8;
            immutableIntArray = immutableIntArray2 = new ImmutableIntArray(nArray, n3, n8 += n4);
        }
        return immutableIntArray;
    }

    public int[] toArray() {
        int[] nArray = this.array;
        int n3 = this.start;
        int n4 = this.end;
        return Arrays.copyOfRange(nArray, n3, n4);
    }

    public String toString() {
        boolean bl2 = this.isEmpty();
        if (bl2) {
            return "[]";
        }
        int n3 = this.length() * 5;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('[');
        int[] nArray = this.array;
        int n4 = this.start;
        n3 = nArray[n4];
        stringBuilder.append(n3);
        n3 = this.start;
        while (++n3 < (n4 = this.end)) {
            stringBuilder.append(", ");
            int[] nArray2 = this.array;
            n4 = nArray2[n3];
            stringBuilder.append(n4);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public ImmutableIntArray trimmed() {
        ImmutableIntArray immutableIntArray;
        boolean bl2 = this.isPartialView();
        if (bl2) {
            int[] nArray = this.toArray();
            immutableIntArray = new ImmutableIntArray(nArray);
        } else {
            immutableIntArray = this;
        }
        return immutableIntArray;
    }

    public Object writeReplace() {
        return this.trimmed();
    }
}

