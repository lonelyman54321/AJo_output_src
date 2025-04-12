/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzav;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcn;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzch
extends zzav
implements zzcn,
RandomAccess {
    private static final zzch zzkr;
    private int size;
    private int[] zzks;

    static {
        zzch zzch2;
        zzkr = zzch2 = new zzch();
        zzch2.zzv();
    }

    public zzch() {
        int[] nArray = new int[10];
        this(nArray, 0);
    }

    private zzch(int[] nArray, int n3) {
        this.zzks = nArray;
        this.size = n3;
    }

    public static zzch zzbk() {
        return zzkr;
    }

    private final void zzg(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.size)) {
            return;
        }
        String string2 = this.zzh(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    private final String zzh(int n3) {
        int n4 = this.size;
        return C12.a(35, n3, n4, "Index:", ", Size:");
    }

    private final void zzo(int n3, int n4) {
        int n7;
        this.zzw();
        if (n3 >= 0 && n3 <= (n7 = this.size)) {
            int[] nArray = this.zzks;
            int n8 = nArray.length;
            int n10 = 1;
            if (n7 < n8) {
                n8 = n3 + 1;
                System.arraycopy(nArray, n3, nArray, n8, n7 -= n3);
            } else {
                n7 = zy_2.a(n7, 3, 2, n10);
                int[] nArray2 = new int[n7];
                System.arraycopy(nArray, 0, nArray2, 0, n3);
                nArray = this.zzks;
                n8 = n3 + 1;
                int n14 = this.size - n3;
                System.arraycopy(nArray, n3, nArray2, n8, n14);
                this.zzks = nArray2;
            }
            this.zzks[n3] = n4;
            this.size = n3 = this.size + n10;
            this.modCount = n3 = this.modCount + n10;
            return;
        }
        String string2 = this.zzh(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4 = (Integer)object;
        this.zzo(n3, n4);
    }

    public final boolean addAll(Collection object) {
        this.zzw();
        zzci.checkNotNull(object);
        int n3 = object instanceof zzch;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzch)object;
        n3 = ((zzch)object).size;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.size;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            int[] nArray = this.zzks;
            n7 = nArray.length;
            if ((n4 += n3) > n7) {
                this.zzks = nArray = Arrays.copyOf(nArray, n4);
            }
            nArray = ((zzch)object).zzks;
            int[] nArray2 = this.zzks;
            int n8 = this.size;
            int n10 = ((zzch)object).size;
            System.arraycopy(nArray, 0, nArray2, n8, n10);
            this.size = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zzch;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzch)object;
        n3 = this.size;
        int n4 = ((zzch)object).size;
        if (n3 != n4) {
            return false;
        }
        object = ((zzch)object).zzks;
        for (n3 = 0; n3 < (n4 = this.size); ++n3) {
            int[] nArray = this.zzks;
            n4 = nArray[n3];
            Object object2 = object[n3];
            if (n4 == object2) continue;
            return false;
        }
        return bl2;
    }

    public final /* synthetic */ Object get(int n3) {
        return this.getInt(n3);
    }

    public final int getInt(int n3) {
        this.zzg(n3);
        return this.zzks[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            n4 *= 31;
            int[] nArray = this.zzks;
            n3 = nArray[i3];
            n4 += n3;
        }
        return n4;
    }

    public final /* synthetic */ Object remove(int n3) {
        this.zzw();
        this.zzg(n3);
        int[] nArray = this.zzks;
        int n4 = nArray[n3];
        int n7 = this.size;
        int n8 = n7 + -1;
        if (n3 < n8) {
            n8 = n3 + 1;
            System.arraycopy(nArray, n8, nArray, n3, n7 -= n3);
        }
        this.size = n3 = this.size + -1;
        this.modCount = n3 = this.modCount + 1;
        return n4;
    }

    public final boolean remove(Object object) {
        int n3;
        this.zzw();
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            Integer n7 = this.zzks[i3];
            n3 = (int)(object.equals(n7) ? 1 : 0);
            if (n3 == 0) continue;
            object = this.zzks;
            n4 = i3 + 1;
            n3 = this.size - i3;
            System.arraycopy(object, n4, object, i3, n3);
            int n8 = this.size;
            n4 = 1;
            this.size = n8 -= n4;
            this.modCount = n8 = this.modCount + n4;
            return n4 != 0;
        }
        return false;
    }

    public final void removeRange(int n3, int n4) {
        this.zzw();
        if (n4 >= n3) {
            int[] nArray = this.zzks;
            int n7 = this.size - n4;
            System.arraycopy(nArray, n4, nArray, n3, n7);
            int n8 = this.size;
            this.size = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ Object set(int n3, Object object) {
        int n4 = (Integer)object;
        this.zzw();
        this.zzg(n3);
        int[] nArray = this.zzks;
        int n7 = nArray[n3];
        nArray[n3] = n4;
        return n7;
    }

    public final int size() {
        return this.size;
    }

    public final void zzac(int n3) {
        int n4 = this.size;
        this.zzo(n4, n3);
    }

    public final /* synthetic */ zzcn zzi(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            int[] nArray = Arrays.copyOf(this.zzks, n3);
            int n7 = this.size;
            zzch zzch2 = new zzch(nArray, n7);
            return zzch2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }
}

