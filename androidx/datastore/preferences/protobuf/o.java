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

public final class o
extends c
implements RandomAccess,
xz2 {
    public int[] b;
    public int c;

    static {
        int[] nArray = new int[]{};
        o o3 = new o(nArray, 0);
        o3.a = false;
    }

    public o() {
        int[] nArray = new int[10];
        this(nArray, 0);
    }

    public o(int[] nArray, int n3) {
        this.b = nArray;
        this.c = n3;
    }

    public final void add(int n3, Object object) {
        int n4;
        object = (Integer)object;
        int n7 = (Integer)object;
        this.a();
        if (n3 >= 0 && n3 <= (n4 = this.c)) {
            int[] nArray = this.b;
            int n8 = nArray.length;
            int n10 = 1;
            if (n4 < n8) {
                n8 = n3 + 1;
                System.arraycopy(nArray, n3, nArray, n8, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n10);
                int[] nArray2 = new int[n4];
                System.arraycopy(nArray, 0, nArray2, 0, n3);
                nArray = this.b;
                n8 = n3 + 1;
                int n14 = this.c - n3;
                System.arraycopy(nArray, n3, nArray2, n8, n14);
                this.b = nArray2;
            }
            this.b[n3] = n7;
            this.c = n3 = this.c + n10;
            this.modCount = n3 = this.modCount + n10;
            return;
        }
        CharSequence charSequence = wk0_0.a(n3, "Index:", ", Size:");
        n4 = this.c;
        charSequence.append(n4);
        charSequence = charSequence.toString();
        object = new IndexOutOfBoundsException((String)charSequence);
        throw object;
    }

    public final boolean add(Object object) {
        int n3 = (Integer)object;
        this.addInt(n3);
        return true;
    }

    public final boolean addAll(Collection object) {
        this.a();
        Object object2 = p.a;
        object.getClass();
        int n3 = object instanceof o;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (o)object;
        n3 = ((o)object).c;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.c;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            object2 = this.b;
            n7 = ((Object)object2).length;
            if ((n4 += n3) > n7) {
                object2 = Arrays.copyOf((int[])object2, n4);
                this.b = (int[])object2;
            }
            object2 = ((o)object).b;
            int[] nArray = this.b;
            int n8 = this.c;
            int n10 = ((o)object).c;
            System.arraycopy(object2, 0, nArray, n8, n10);
            this.c = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public final void addInt(int n3) {
        this.a();
        int n4 = this.c;
        int[] nArray = this.b;
        int n7 = nArray.length;
        if (n4 == n7) {
            int n8 = 1;
            n7 = zy_2.a(n4, 3, 2, n8);
            int[] nArray2 = new int[n7];
            System.arraycopy(nArray, 0, nArray2, 0, n4);
            this.b = nArray2;
        }
        int[] nArray3 = this.b;
        int n10 = this.c;
        this.c = n7 = n10 + 1;
        nArray3[n10] = n3;
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
        int n3 = object instanceof o;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (o)object;
        n3 = this.c;
        int n4 = ((o)object).c;
        if (n3 != n4) {
            return false;
        }
        object = ((o)object).b;
        for (n3 = 0; n3 < (n4 = this.c); ++n3) {
            int[] nArray = this.b;
            n4 = nArray[n3];
            Object object2 = object[n3];
            if (n4 == object2) continue;
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
            n4 *= 31;
            int[] nArray = this.b;
            n3 = nArray[i3];
            n4 += n3;
        }
        return n4;
    }

    public final p$c mutableCopyWithCapacity(int n3) {
        int n4 = this.c;
        if (n3 >= n4) {
            int[] nArray = Arrays.copyOf(this.b, n3);
            int n7 = this.c;
            o o3 = new o(nArray, n7);
            return o3;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final Object remove(int n3) {
        this.a();
        this.c(n3);
        int[] nArray = this.b;
        int n4 = nArray[n3];
        int n7 = this.c;
        int n8 = n7 + -1;
        if (n3 < n8) {
            n8 = n3 + 1;
            n7 = n7 - n3 + -1;
            System.arraycopy(nArray, n8, nArray, n3, n7);
        }
        this.c = n3 = this.c + -1;
        this.modCount = n3 = this.modCount + 1;
        return n4;
    }

    public final boolean remove(Object object) {
        int n3;
        this.a();
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.c); ++i3) {
            int n7;
            Integer n8 = this.b[i3];
            n3 = (int)(object.equals(n8) ? 1 : 0);
            if (n3 == 0) continue;
            object = this.b;
            n4 = i3 + 1;
            n3 = this.c - i3;
            int n10 = 1;
            System.arraycopy(object, n4, object, i3, n3 -= n10);
            this.c = n7 = this.c - n10;
            this.modCount = n7 = this.modCount + n10;
            return n10 != 0;
        }
        return false;
    }

    public final void removeRange(int n3, int n4) {
        this.a();
        if (n4 >= n3) {
            int[] nArray = this.b;
            int n7 = this.c - n4;
            System.arraycopy(nArray, n4, nArray, n3, n7);
            int n8 = this.c;
            this.c = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final Object set(int n3, Object object) {
        int n4 = (Integer)object;
        this.a();
        this.c(n3);
        int[] nArray = this.b;
        int n7 = nArray[n3];
        nArray[n3] = n4;
        return n7;
    }

    public final int size() {
        return this.c;
    }
}

