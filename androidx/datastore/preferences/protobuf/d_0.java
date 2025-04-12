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
 * Renamed from androidx.datastore.preferences.protobuf.d
 */
public final class d_0
extends c
implements RandomAccess,
xz2 {
    public boolean[] b;
    public int c;

    static {
        boolean[] blArray = new boolean[]{};
        d_0 d_02 = new d_0(blArray, 0);
        d_02.a = false;
    }

    public d_0() {
        boolean[] blArray = new boolean[10];
        this(blArray, 0);
    }

    public d_0(boolean[] blArray, int n3) {
        this.b = blArray;
        this.c = n3;
    }

    public final void add(int n3, Object object) {
        int n4;
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        this.a();
        if (n3 >= 0 && n3 <= (n4 = this.c)) {
            boolean[] blArray = this.b;
            int n7 = blArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(blArray, n3, blArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                boolean[] blArray2 = new boolean[n4];
                System.arraycopy(blArray, 0, blArray2, 0, n3);
                blArray = this.b;
                n7 = n3 + 1;
                int n10 = this.c - n3;
                System.arraycopy(blArray, n3, blArray2, n7, n10);
                this.b = blArray2;
            }
            this.b[n3] = bl2;
            this.c = n3 = this.c + n8;
            this.modCount = n3 = this.modCount + n8;
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
        boolean bl2 = (Boolean)object;
        this.addBoolean(bl2);
        return true;
    }

    public final boolean addAll(Collection object) {
        this.a();
        Object object2 = p.a;
        object.getClass();
        int n3 = object instanceof d_0;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (d_0)object;
        n3 = ((d_0)object).c;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.c;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            object2 = this.b;
            n7 = ((Object)object2).length;
            if ((n4 += n3) > n7) {
                object2 = Arrays.copyOf((boolean[])object2, n4);
                this.b = (boolean[])object2;
            }
            object2 = ((d_0)object).b;
            boolean[] blArray = this.b;
            int n8 = this.c;
            int n10 = ((d_0)object).c;
            System.arraycopy(object2, 0, blArray, n8, n10);
            this.c = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public final void addBoolean(boolean bl2) {
        this.a();
        int n3 = this.c;
        boolean[] blArray = this.b;
        int n4 = blArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            boolean[] blArray2 = new boolean[n4];
            System.arraycopy(blArray, 0, blArray2, 0, n3);
            this.b = blArray2;
        }
        boolean[] blArray3 = this.b;
        int n8 = this.c;
        this.c = n4 = n8 + 1;
        blArray3[n8] = bl2;
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
        int n3 = object instanceof d_0;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (d_0)object;
        n3 = this.c;
        int n4 = ((d_0)object).c;
        if (n3 != n4) {
            return false;
        }
        object = ((d_0)object).b;
        for (n3 = 0; n3 < (n4 = this.c); ++n3) {
            boolean[] blArray = this.b;
            n4 = blArray[n3];
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
        int n7 = 1;
        for (int i3 = 0; i3 < (n3 = this.c); i3 += n4) {
            n7 *= 31;
            boolean[] blArray = this.b;
            n3 = blArray[i3];
            n3 = n3 != 0 ? 1231 : 1237;
            n7 += n3;
        }
        return n7;
    }

    public final p$c mutableCopyWithCapacity(int n3) {
        int n4 = this.c;
        if (n3 >= n4) {
            boolean[] blArray = Arrays.copyOf(this.b, n3);
            int n7 = this.c;
            d_0 d_02 = new d_0(blArray, n7);
            return d_02;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final Object remove(int n3) {
        this.a();
        this.c(n3);
        boolean[] blArray = this.b;
        boolean bl2 = blArray[n3];
        int n4 = this.c;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(blArray, n7, blArray, n3, n4);
        }
        this.c = n3 = this.c + -1;
        this.modCount = n3 = this.modCount + 1;
        return bl2;
    }

    public final boolean remove(Object object) {
        int n3;
        this.a();
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.c); ++i3) {
            int n7;
            Boolean bl2 = this.b[i3];
            n3 = (int)(object.equals(bl2) ? 1 : 0);
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
            boolean[] blArray = this.b;
            int n7 = this.c - n4;
            System.arraycopy(blArray, n4, blArray, n3, n7);
            int n8 = this.c;
            this.c = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final Object set(int n3, Object object) {
        boolean bl2 = (Boolean)object;
        this.a();
        this.c(n3);
        boolean[] blArray = this.b;
        boolean bl3 = blArray[n3];
        blArray[n3] = bl2;
        return bl3;
    }

    public final int size() {
        return this.c;
    }
}

