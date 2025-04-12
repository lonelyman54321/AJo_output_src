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

public final class t
extends c
implements RandomAccess,
xz2 {
    public long[] b;
    public int c;

    static {
        long[] lArray = new long[]{};
        t t3 = new t(lArray, 0);
        t3.a = false;
    }

    public t() {
        long[] lArray = new long[10];
        this(lArray, 0);
    }

    public t(long[] lArray, int n3) {
        this.b = lArray;
        this.c = n3;
    }

    public final void add(int n3, Object object) {
        int n4;
        object = (Long)object;
        long l2 = (Long)object;
        this.a();
        if (n3 >= 0 && n3 <= (n4 = this.c)) {
            long[] lArray = this.b;
            int n7 = lArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(lArray, n3, lArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                object = new long[n4];
                System.arraycopy(lArray, 0, object, 0, n3);
                lArray = this.b;
                n7 = n3 + 1;
                int n10 = this.c - n3;
                System.arraycopy(lArray, n3, object, n7, n10);
                this.b = (long[])object;
            }
            this.b[n3] = l2;
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
        long l2 = (Long)object;
        this.addLong(l2);
        return true;
    }

    public final boolean addAll(Collection object) {
        this.a();
        Object object2 = p.a;
        object.getClass();
        int n3 = object instanceof t;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (t)object;
        n3 = ((t)object).c;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.c;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            object2 = this.b;
            n7 = ((Object)object2).length;
            if ((n4 += n3) > n7) {
                object2 = Arrays.copyOf((long[])object2, n4);
                this.b = (long[])object2;
            }
            object2 = ((t)object).b;
            long[] lArray = this.b;
            int n8 = this.c;
            int n10 = ((t)object).c;
            System.arraycopy(object2, 0, lArray, n8, n10);
            this.c = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public final void addLong(long l2) {
        this.a();
        int n3 = this.c;
        long[] lArray = this.b;
        int n4 = lArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            long[] lArray2 = new long[n4];
            System.arraycopy(lArray, 0, lArray2, 0, n3);
            this.b = lArray2;
        }
        long[] lArray3 = this.b;
        int n8 = this.c;
        this.c = n4 = n8 + 1;
        lArray3[n8] = l2;
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
        int n3 = object instanceof t;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (t)object;
        n3 = this.c;
        int n4 = ((t)object).c;
        if (n3 != n4) {
            return false;
        }
        object = ((t)object).b;
        for (n3 = 0; n3 < (n4 = this.c); ++n3) {
            long[] lArray = this.b;
            long l2 = lArray[n3];
            Object object2 = object[n3];
            long l3 = l2 - object2;
            n4 = (int)(l3 == 0L ? 0 : (l3 < 0L ? -1 : 1));
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
            n4 *= 31;
            long[] lArray = this.b;
            long l2 = lArray[i3];
            n3 = p.b(l2);
            n4 += n3;
        }
        return n4;
    }

    public final p$c mutableCopyWithCapacity(int n3) {
        int n4 = this.c;
        if (n3 >= n4) {
            long[] lArray = Arrays.copyOf(this.b, n3);
            int n7 = this.c;
            t t3 = new t(lArray, n7);
            return t3;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final Object remove(int n3) {
        this.a();
        this.c(n3);
        long[] lArray = this.b;
        long l2 = lArray[n3];
        int n4 = this.c;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(lArray, n7, lArray, n3, n4);
        }
        this.c = n3 = this.c + -1;
        this.modCount = n3 = this.modCount + 1;
        return l2;
    }

    public final boolean remove(Object object) {
        int n3;
        this.a();
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.c); ++i3) {
            int n7;
            long l2 = this.b[i3];
            Long l3 = l2;
            n3 = (int)(object.equals(l3) ? 1 : 0);
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
            long[] lArray = this.b;
            int n7 = this.c - n4;
            System.arraycopy(lArray, n4, lArray, n3, n7);
            int n8 = this.c;
            this.c = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final Object set(int n3, Object object) {
        long l2 = (Long)object;
        this.a();
        this.c(n3);
        object = this.b;
        Object object2 = object[n3];
        object[n3] = l2;
        return (long)object2;
    }

    public final int size() {
        return this.c;
    }
}

