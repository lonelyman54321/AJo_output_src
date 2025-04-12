/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.c;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.p$c;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/*
 * Renamed from androidx.datastore.preferences.protobuf.h
 */
public final class h_0
extends c
implements RandomAccess,
xz2 {
    public double[] b;
    public int c;

    static {
        double[] dArray = new double[]{};
        h_0 h_02 = new h_0(dArray, 0);
        h_02.a = false;
    }

    public h_0() {
        double[] dArray = new double[10];
        this(dArray, 0);
    }

    public h_0(double[] dArray, int n3) {
        this.b = dArray;
        this.c = n3;
    }

    public final void add(int n3, Object object) {
        int n4;
        object = (Double)object;
        double d2 = (Double)object;
        this.a();
        if (n3 >= 0 && n3 <= (n4 = this.c)) {
            double[] dArray = this.b;
            int n7 = dArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(dArray, n3, dArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                object = new double[n4];
                System.arraycopy(dArray, 0, object, 0, n3);
                dArray = this.b;
                n7 = n3 + 1;
                int n10 = this.c - n3;
                System.arraycopy(dArray, n3, object, n7, n10);
                this.b = (double[])object;
            }
            this.b[n3] = d2;
            this.c = n3 = this.c + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        CharSequence charSequence = wk0_0.a(n3, "Index:", ", Size:");
        int n14 = this.c;
        charSequence.append(n14);
        charSequence = charSequence.toString();
        object = new IndexOutOfBoundsException((String)charSequence);
        throw object;
    }

    public final boolean add(Object object) {
        double d2 = (Double)object;
        this.addDouble(d2);
        return true;
    }

    public final boolean addAll(Collection object) {
        this.a();
        Object object2 = p.a;
        object.getClass();
        int n3 = object instanceof h_0;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (h_0)object;
        n3 = ((h_0)object).c;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.c;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            object2 = this.b;
            n7 = ((Object)object2).length;
            if ((n4 += n3) > n7) {
                object2 = Arrays.copyOf((double[])object2, n4);
                this.b = (double[])object2;
            }
            object2 = ((h_0)object).b;
            double[] dArray = this.b;
            int n8 = this.c;
            int n10 = ((h_0)object).c;
            System.arraycopy(object2, 0, dArray, n8, n10);
            this.c = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public final void addDouble(double d2) {
        this.a();
        int n3 = this.c;
        double[] dArray = this.b;
        int n4 = dArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            double[] dArray2 = new double[n4];
            System.arraycopy(dArray, 0, dArray2, 0, n3);
            this.b = dArray2;
        }
        double[] dArray3 = this.b;
        int n8 = this.c;
        this.c = n4 = n8 + 1;
        dArray3[n8] = d2;
    }

    public final void c(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.c)) {
            return;
        }
        CharSequence charSequence = wk0_0.a(n3, "Index:", ", Size:");
        int n7 = this.c;
        charSequence.append(n7);
        charSequence = charSequence.toString();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)charSequence);
        throw indexOutOfBoundsException;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof h_0;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (h_0)object;
        n3 = this.c;
        int n4 = ((h_0)object).c;
        if (n3 != n4) {
            return false;
        }
        object = ((h_0)object).b;
        for (n3 = 0; n3 < (n4 = this.c); ++n3) {
            Object object2;
            long l2;
            double[] dArray = this.b;
            double d2 = dArray[n3];
            long l3 = Double.doubleToLongBits(d2);
            long l4 = l3 - (l2 = Double.doubleToLongBits((double)(object2 = object[n3])));
            n4 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
            if (n4 == 0) continue;
            return false;
        }
        return bl2;
    }

    public final Object get(int n3) {
        this.c(n3);
        return this.b[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.c); ++i3) {
            double[] dArray = this.b;
            double d2 = dArray[i3];
            long l2 = Double.doubleToLongBits(d2);
            n4 *= 31;
            n3 = p.b(l2);
            n4 += n3;
        }
        return n4;
    }

    public final p$c mutableCopyWithCapacity(int n3) {
        int n4 = this.c;
        if (n3 >= n4) {
            double[] dArray = Arrays.copyOf(this.b, n3);
            int n7 = this.c;
            h_0 h_02 = new h_0(dArray, n7);
            return h_02;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final Object remove(int n3) {
        this.a();
        this.c(n3);
        double[] dArray = this.b;
        double d2 = dArray[n3];
        int n4 = this.c;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(dArray, n7, dArray, n3, n4);
        }
        this.c = n3 = this.c + -1;
        this.modCount = n3 = this.modCount + 1;
        return d2;
    }

    public final boolean remove(Object object) {
        int n3;
        this.a();
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.c); ++i3) {
            int n7;
            double d2 = this.b[i3];
            Double d5 = d2;
            n3 = (int)(object.equals(d5) ? 1 : 0);
            if (n3 == 0) continue;
            object = this.b;
            n4 = i3 + 1;
            n3 = this.c - i3;
            int n8 = 1;
            System.arraycopy(object, n4, object, i3, n3 -= n8);
            this.c = n7 = this.c - n8;
            this.modCount = n7 = this.modCount + n8;
            return n8 != 0;
        }
        return false;
    }

    public final void removeRange(int n3, int n4) {
        this.a();
        if (n4 >= n3) {
            double[] dArray = this.b;
            int n7 = this.c - n4;
            System.arraycopy(dArray, n4, dArray, n3, n7);
            int n8 = this.c;
            this.c = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final Object set(int n3, Object object) {
        double d2 = (Double)object;
        this.a();
        this.c(n3);
        object = this.b;
        Object object2 = object[n3];
        object[n3] = d2;
        return (double)object2;
    }

    public final int size() {
        return this.c;
    }
}

