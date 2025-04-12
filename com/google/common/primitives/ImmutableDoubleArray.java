/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.ImmutableDoubleArray$1;
import com.google.common.primitives.ImmutableDoubleArray$AsList;
import com.google.common.primitives.ImmutableDoubleArray$Builder;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class ImmutableDoubleArray
implements Serializable {
    private static final ImmutableDoubleArray EMPTY;
    private final double[] array;
    private final int end;
    private final transient int start;

    static {
        ImmutableDoubleArray immutableDoubleArray;
        double[] dArray = new double[]{};
        EMPTY = immutableDoubleArray = new ImmutableDoubleArray(dArray);
    }

    private ImmutableDoubleArray(double[] dArray) {
        int n3 = dArray.length;
        this(dArray, 0, n3);
    }

    private ImmutableDoubleArray(double[] dArray, int n3, int n4) {
        this.array = dArray;
        this.start = n3;
        this.end = n4;
    }

    public /* synthetic */ ImmutableDoubleArray(double[] dArray, int n3, int n4, ImmutableDoubleArray$1 immutableDoubleArray$1) {
        this(dArray, n3, n4);
    }

    public static /* synthetic */ double[] access$000(ImmutableDoubleArray immutableDoubleArray) {
        return immutableDoubleArray.array;
    }

    public static /* synthetic */ int access$100(ImmutableDoubleArray immutableDoubleArray) {
        return immutableDoubleArray.start;
    }

    public static /* synthetic */ ImmutableDoubleArray access$200() {
        return EMPTY;
    }

    public static /* synthetic */ boolean access$500(double d2, double d5) {
        return ImmutableDoubleArray.areEqual(d2, d5);
    }

    private static boolean areEqual(double d2, double d5) {
        long l2;
        long l3 = Double.doubleToLongBits(d2);
        long l4 = l3 - (l2 = Double.doubleToLongBits(d5));
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public static ImmutableDoubleArray$Builder builder() {
        ImmutableDoubleArray$Builder immutableDoubleArray$Builder = new ImmutableDoubleArray$Builder(10);
        return immutableDoubleArray$Builder;
    }

    public static ImmutableDoubleArray$Builder builder(int n3) {
        ImmutableDoubleArray$Builder immutableDoubleArray$Builder;
        boolean bl2;
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            immutableDoubleArray$Builder = null;
        }
        Preconditions.checkArgument(bl2, "Invalid initialCapacity: %s", n3);
        immutableDoubleArray$Builder = new ImmutableDoubleArray$Builder(n3);
        return immutableDoubleArray$Builder;
    }

    public static ImmutableDoubleArray copyOf(Iterable iterable) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            return ImmutableDoubleArray.copyOf((Collection)iterable);
        }
        return ImmutableDoubleArray.builder().addAll(iterable).build();
    }

    public static ImmutableDoubleArray copyOf(Collection object) {
        boolean bl2 = object.isEmpty();
        if (bl2) {
            object = EMPTY;
        } else {
            object = Doubles.toArray((Collection)object);
            ImmutableDoubleArray immutableDoubleArray = new ImmutableDoubleArray((double[])object);
            object = immutableDoubleArray;
        }
        return object;
    }

    public static ImmutableDoubleArray copyOf(double[] object) {
        int n3 = ((double[])object).length;
        if (n3 == 0) {
            object = EMPTY;
        } else {
            int n4 = ((double[])object).length;
            object = Arrays.copyOf(object, n4);
            ImmutableDoubleArray immutableDoubleArray = new ImmutableDoubleArray((double[])object);
            object = immutableDoubleArray;
        }
        return object;
    }

    private boolean isPartialView() {
        double[] dArray;
        int n3;
        int n4 = this.start;
        n4 = n4 <= 0 && (n4 = this.end) >= (n3 = (dArray = this.array).length) ? 0 : 1;
        return n4 != 0;
    }

    public static ImmutableDoubleArray of() {
        return EMPTY;
    }

    public static ImmutableDoubleArray of(double d2) {
        double[] dArray = new double[]{d2};
        ImmutableDoubleArray immutableDoubleArray = new ImmutableDoubleArray(dArray);
        return immutableDoubleArray;
    }

    public static ImmutableDoubleArray of(double d2, double d5) {
        double[] dArray = new double[]{d2, d5};
        ImmutableDoubleArray immutableDoubleArray = new ImmutableDoubleArray(dArray);
        return immutableDoubleArray;
    }

    public static ImmutableDoubleArray of(double d2, double d5, double d7) {
        double[] dArray = new double[]{d2, d5, d7};
        ImmutableDoubleArray immutableDoubleArray = new ImmutableDoubleArray(dArray);
        return immutableDoubleArray;
    }

    public static ImmutableDoubleArray of(double d2, double d5, double d7, double d9) {
        double[] dArray = new double[]{d2, d5, d7, d9};
        ImmutableDoubleArray immutableDoubleArray = new ImmutableDoubleArray(dArray);
        return immutableDoubleArray;
    }

    public static ImmutableDoubleArray of(double d2, double d5, double d7, double d9, double d12) {
        double[] dArray = new double[]{d2, d5, d7, d9, d12};
        ImmutableDoubleArray immutableDoubleArray = new ImmutableDoubleArray(dArray);
        return immutableDoubleArray;
    }

    public static ImmutableDoubleArray of(double d2, double d5, double d7, double d9, double d12, double d13) {
        double[] dArray = new double[]{d2, d5, d7, d9, d12, d13};
        ImmutableDoubleArray immutableDoubleArray = new ImmutableDoubleArray(dArray);
        return immutableDoubleArray;
    }

    public static ImmutableDoubleArray of(double d2, double ... dArray) {
        double[] dArray2;
        boolean bl2 = dArray.length;
        boolean bl3 = 2147483646 != 0;
        int n3 = 1;
        if (bl2 <= bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            dArray2 = null;
        }
        Preconditions.checkArgument(bl2, "the total number of elements must fit in an int");
        dArray2 = new double[dArray.length + n3];
        dArray2[0] = d2;
        int n4 = dArray.length;
        System.arraycopy(dArray, 0, dArray2, n3, n4);
        ImmutableDoubleArray immutableDoubleArray = new ImmutableDoubleArray(dArray2);
        return immutableDoubleArray;
    }

    public List asList() {
        ImmutableDoubleArray$AsList immutableDoubleArray$AsList = new ImmutableDoubleArray$AsList(this, null);
        return immutableDoubleArray$AsList;
    }

    public boolean contains(double d2) {
        int n3 = this.indexOf(d2);
        n3 = n3 >= 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof ImmutableDoubleArray;
        if (n4 == 0) {
            return false;
        }
        object = (ImmutableDoubleArray)object;
        n4 = this.length();
        if (n4 != (n3 = ((ImmutableDoubleArray)object).length())) {
            return false;
        }
        for (n4 = 0; n4 < (n3 = this.length()); ++n4) {
            double d2;
            double d5 = this.get(n4);
            n3 = (int)(ImmutableDoubleArray.areEqual(d5, d2 = ((ImmutableDoubleArray)object).get(n4)) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return bl2;
    }

    public double get(int n3) {
        int n4 = this.length();
        Preconditions.checkElementIndex(n3, n4);
        double[] dArray = this.array;
        int n7 = this.start + n3;
        return dArray[n7];
    }

    public int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            n4 *= 31;
            double[] dArray = this.array;
            double d2 = dArray[i3];
            n3 = Doubles.hashCode(d2);
            n4 += n3;
        }
        return n4;
    }

    public int indexOf(double d2) {
        int n3;
        for (int i3 = this.start; i3 < (n3 = this.end); ++i3) {
            double[] dArray = this.array;
            double d5 = dArray[i3];
            n3 = (int)(ImmutableDoubleArray.areEqual(d5, d2) ? 1 : 0);
            if (n3 == 0) continue;
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

    public int lastIndexOf(double d2) {
        int n3;
        for (int i3 = this.end + -1; i3 >= (n3 = this.start); i3 += -1) {
            double[] dArray = this.array;
            double d5 = dArray[i3];
            n3 = (int)(ImmutableDoubleArray.areEqual(d5, d2) ? 1 : 0);
            if (n3 == 0) continue;
            int n4 = this.start;
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
        ImmutableDoubleArray immutableDoubleArray = bl2 ? EMPTY : this;
        return immutableDoubleArray;
    }

    public ImmutableDoubleArray subArray(int n3, int n4) {
        ImmutableDoubleArray immutableDoubleArray;
        int n7 = this.length();
        Preconditions.checkPositionIndexes(n3, n4, n7);
        if (n3 == n4) {
            immutableDoubleArray = EMPTY;
        } else {
            ImmutableDoubleArray immutableDoubleArray2;
            double[] dArray = this.array;
            int n8 = this.start;
            n3 += n8;
            immutableDoubleArray = immutableDoubleArray2 = new ImmutableDoubleArray(dArray, n3, n8 += n4);
        }
        return immutableDoubleArray;
    }

    public double[] toArray() {
        double[] dArray = this.array;
        int n3 = this.start;
        int n4 = this.end;
        return Arrays.copyOfRange(dArray, n3, n4);
    }

    public String toString() {
        boolean bl2 = this.isEmpty();
        if (bl2) {
            return "[]";
        }
        int n3 = this.length() * 5;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('[');
        double[] dArray = this.array;
        int n4 = this.start;
        double d2 = dArray[n4];
        stringBuilder.append(d2);
        n3 = this.start;
        while (++n3 < (n4 = this.end)) {
            stringBuilder.append(", ");
            double[] dArray2 = this.array;
            double d5 = dArray2[n3];
            stringBuilder.append(d5);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public ImmutableDoubleArray trimmed() {
        ImmutableDoubleArray immutableDoubleArray;
        boolean bl2 = this.isPartialView();
        if (bl2) {
            double[] dArray = this.toArray();
            immutableDoubleArray = new ImmutableDoubleArray(dArray);
        } else {
            immutableDoubleArray = this;
        }
        return immutableDoubleArray;
    }

    public Object writeReplace() {
        return this.trimmed();
    }
}

