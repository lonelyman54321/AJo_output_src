/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.c;
import androidx.datastore.preferences.protobuf.p$c;
import java.util.Arrays;
import java.util.RandomAccess;

/*
 * Renamed from androidx.datastore.preferences.protobuf.C
 */
public final class c_0
extends c
implements RandomAccess {
    public static final c_0 d;
    public Object[] b;
    public int c;

    static {
        c_0 c_02;
        Object[] objectArray = new Object[]{};
        d = c_02 = new c_0(objectArray, 0);
        c_02.a = false;
    }

    public c_0(Object[] objectArray, int n3) {
        this.b = objectArray;
        this.c = n3;
    }

    public final void add(int n3, Object object) {
        int n4;
        this.a();
        if (n3 >= 0 && n3 <= (n4 = this.c)) {
            Object[] objectArray = this.b;
            int n7 = objectArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(objectArray, n3, objectArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                Object[] objectArray2 = new Object[n4];
                System.arraycopy(objectArray, 0, objectArray2, 0, n3);
                objectArray = this.b;
                n7 = n3 + 1;
                int n10 = this.c - n3;
                System.arraycopy(objectArray, n3, objectArray2, n7, n10);
                this.b = objectArray2;
            }
            this.b[n3] = object;
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
        int n3;
        Object[] objectArray;
        this.a();
        int n4 = this.c;
        Object[] objectArray2 = this.b;
        int n7 = objectArray2.length;
        int n8 = 1;
        if (n4 == n7) {
            n4 = n4 * 3 / 2 + n8;
            this.b = objectArray = Arrays.copyOf(objectArray2, n4);
        }
        objectArray = this.b;
        int n10 = this.c;
        this.c = n7 = n10 + 1;
        objectArray[n10] = object;
        this.modCount = n3 = this.modCount + n8;
        return n8 != 0;
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

    public final Object get(int n3) {
        this.c(n3);
        return this.b[n3];
    }

    public final p$c mutableCopyWithCapacity(int n3) {
        int n4 = this.c;
        if (n3 >= n4) {
            Object[] objectArray = Arrays.copyOf(this.b, n3);
            int n7 = this.c;
            c_0 c_02 = new c_0(objectArray, n7);
            return c_02;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final Object remove(int n3) {
        this.a();
        this.c(n3);
        Object[] objectArray = this.b;
        Object object = objectArray[n3];
        int n4 = this.c;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(objectArray, n7, objectArray, n3, n4);
        }
        this.c = n3 = this.c + -1;
        this.modCount = n3 = this.modCount + 1;
        return object;
    }

    public final Object set(int n3, Object object) {
        this.a();
        this.c(n3);
        Object[] objectArray = this.b;
        Object object2 = objectArray[n3];
        objectArray[n3] = object;
        this.modCount = n3 = this.modCount + 1;
        return object2;
    }

    public final int size() {
        return this.c;
    }
}

