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

public final class m
extends c
implements RandomAccess,
xz2 {
    public float[] b;
    public int c;

    static {
        float[] fArray = new float[]{};
        m m2 = new m(fArray, 0);
        m2.a = false;
    }

    public m() {
        float[] fArray = new float[10];
        this(fArray, 0);
    }

    public m(float[] fArray, int n3) {
        this.b = fArray;
        this.c = n3;
    }

    public final void add(int n3, Object object) {
        int n4;
        object = (Float)object;
        float f5 = ((Float)object).floatValue();
        this.a();
        if (n3 >= 0 && n3 <= (n4 = this.c)) {
            float[] fArray = this.b;
            int n7 = fArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(fArray, n3, fArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                float[] fArray2 = new float[n4];
                System.arraycopy(fArray, 0, fArray2, 0, n3);
                fArray = this.b;
                n7 = n3 + 1;
                int n10 = this.c - n3;
                System.arraycopy(fArray, n3, fArray2, n7, n10);
                this.b = fArray2;
            }
            this.b[n3] = f5;
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
        float f5 = ((Float)object).floatValue();
        this.addFloat(f5);
        return true;
    }

    public final boolean addAll(Collection object) {
        this.a();
        Object object2 = p.a;
        object.getClass();
        int n3 = object instanceof m;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (m)object;
        n3 = ((m)object).c;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.c;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            object2 = this.b;
            n7 = ((Object)object2).length;
            if ((n4 += n3) > n7) {
                object2 = Arrays.copyOf((float[])object2, n4);
                this.b = (float[])object2;
            }
            object2 = ((m)object).b;
            float[] fArray = this.b;
            int n8 = this.c;
            int n10 = ((m)object).c;
            System.arraycopy(object2, 0, fArray, n8, n10);
            this.c = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public final void addFloat(float f5) {
        this.a();
        int n3 = this.c;
        float[] fArray = this.b;
        int n4 = fArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            float[] fArray2 = new float[n4];
            System.arraycopy(fArray, 0, fArray2, 0, n3);
            this.b = fArray2;
        }
        float[] fArray3 = this.b;
        int n8 = this.c;
        this.c = n4 = n8 + 1;
        fArray3[n8] = f5;
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
        int n3 = object instanceof m;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (m)object;
        n3 = this.c;
        int n4 = ((m)object).c;
        if (n3 != n4) {
            return false;
        }
        object = ((m)object).b;
        for (n3 = 0; n3 < (n4 = this.c); ++n3) {
            Object object2;
            int n7;
            float[] fArray = this.b;
            float f5 = fArray[n3];
            n4 = Float.floatToIntBits(f5);
            if (n4 == (n7 = Float.floatToIntBits((float)(object2 = object[n3])))) continue;
            return false;
        }
        return bl2;
    }

    public final Object get(int n3) {
        this.c(n3);
        return Float.valueOf(this.b[n3]);
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.c); ++i3) {
            n4 *= 31;
            float[] fArray = this.b;
            float f5 = fArray[i3];
            n3 = Float.floatToIntBits(f5);
            n4 += n3;
        }
        return n4;
    }

    public final p$c mutableCopyWithCapacity(int n3) {
        int n4 = this.c;
        if (n3 >= n4) {
            float[] fArray = Arrays.copyOf(this.b, n3);
            int n7 = this.c;
            m m2 = new m(fArray, n7);
            return m2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final Object remove(int n3) {
        this.a();
        this.c(n3);
        float[] fArray = this.b;
        float f5 = fArray[n3];
        int n4 = this.c;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(fArray, n7, fArray, n3, n4);
        }
        this.c = n3 = this.c + -1;
        this.modCount = n3 = this.modCount + 1;
        return Float.valueOf(f5);
    }

    public final boolean remove(Object object) {
        int n3;
        this.a();
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.c); ++i3) {
            int n7;
            float f5 = this.b[i3];
            Float f6 = Float.valueOf(f5);
            n3 = (int)(object.equals(f6) ? 1 : 0);
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
            float[] fArray = this.b;
            int n7 = this.c - n4;
            System.arraycopy(fArray, n4, fArray, n3, n7);
            int n8 = this.c;
            this.c = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final Object set(int n3, Object object) {
        float f5 = ((Float)object).floatValue();
        this.a();
        this.c(n3);
        float[] fArray = this.b;
        float f6 = fArray[n3];
        fArray[n3] = f5;
        return Float.valueOf(f6);
    }

    public final int size() {
        return this.c;
    }
}

