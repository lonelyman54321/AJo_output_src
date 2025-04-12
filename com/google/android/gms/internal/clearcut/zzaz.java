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

final class zzaz
extends zzav
implements zzcn,
RandomAccess {
    private static final zzaz zzfg;
    private int size;
    private boolean[] zzfh;

    static {
        zzaz zzaz2;
        zzfg = zzaz2 = new zzaz();
        zzaz2.zzv();
    }

    public zzaz() {
        boolean[] blArray = new boolean[10];
        this(blArray, 0);
    }

    private zzaz(boolean[] blArray, int n3) {
        this.zzfh = blArray;
        this.size = n3;
    }

    private final void zza(int n3, boolean bl2) {
        int n4;
        this.zzw();
        if (n3 >= 0 && n3 <= (n4 = this.size)) {
            boolean[] blArray = this.zzfh;
            int n7 = blArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(blArray, n3, blArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                boolean[] blArray2 = new boolean[n4];
                System.arraycopy(blArray, 0, blArray2, 0, n3);
                blArray = this.zzfh;
                n7 = n3 + 1;
                int n10 = this.size - n3;
                System.arraycopy(blArray, n3, blArray2, n7, n10);
                this.zzfh = blArray2;
            }
            this.zzfh[n3] = bl2;
            this.size = n3 = this.size + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        String string2 = this.zzh(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
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

    public final /* synthetic */ void add(int n3, Object object) {
        boolean bl2 = (Boolean)object;
        this.zza(n3, bl2);
    }

    public final boolean addAll(Collection object) {
        this.zzw();
        zzci.checkNotNull(object);
        int n3 = object instanceof zzaz;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzaz)object;
        n3 = ((zzaz)object).size;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.size;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            boolean[] blArray = this.zzfh;
            n7 = blArray.length;
            if ((n4 += n3) > n7) {
                this.zzfh = blArray = Arrays.copyOf(blArray, n4);
            }
            blArray = ((zzaz)object).zzfh;
            boolean[] blArray2 = this.zzfh;
            int n8 = this.size;
            int n10 = ((zzaz)object).size;
            System.arraycopy(blArray, 0, blArray2, n8, n10);
            this.size = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public final void addBoolean(boolean bl2) {
        int n3 = this.size;
        this.zza(n3, bl2);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zzaz;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzaz)object;
        n3 = this.size;
        int n4 = ((zzaz)object).size;
        if (n3 != n4) {
            return false;
        }
        object = ((zzaz)object).zzfh;
        for (n3 = 0; n3 < (n4 = this.size); ++n3) {
            boolean[] blArray = this.zzfh;
            n4 = blArray[n3];
            Object object2 = object[n3];
            if (n4 == object2) continue;
            return false;
        }
        return bl2;
    }

    public final /* synthetic */ Object get(int n3) {
        this.zzg(n3);
        return this.zzfh[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            n4 *= 31;
            boolean[] blArray = this.zzfh;
            n3 = zzci.zzc(blArray[i3]);
            n4 += n3;
        }
        return n4;
    }

    public final /* synthetic */ Object remove(int n3) {
        this.zzw();
        this.zzg(n3);
        boolean[] blArray = this.zzfh;
        boolean bl2 = blArray[n3];
        int n4 = this.size;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            System.arraycopy(blArray, n7, blArray, n3, n4 -= n3);
        }
        this.size = n3 = this.size + -1;
        this.modCount = n3 = this.modCount + 1;
        return bl2;
    }

    public final boolean remove(Object object) {
        int n3;
        this.zzw();
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = this.size); ++i3) {
            Boolean bl2 = this.zzfh[i3];
            n3 = (int)(object.equals(bl2) ? 1 : 0);
            if (n3 == 0) continue;
            object = this.zzfh;
            n4 = i3 + 1;
            n3 = this.size - i3;
            System.arraycopy(object, n4, object, i3, n3);
            int n7 = this.size;
            n4 = 1;
            this.size = n7 -= n4;
            this.modCount = n7 = this.modCount + n4;
            return n4 != 0;
        }
        return false;
    }

    public final void removeRange(int n3, int n4) {
        this.zzw();
        if (n4 >= n3) {
            boolean[] blArray = this.zzfh;
            int n7 = this.size - n4;
            System.arraycopy(blArray, n4, blArray, n3, n7);
            int n8 = this.size;
            this.size = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ Object set(int n3, Object object) {
        boolean bl2 = (Boolean)object;
        this.zzw();
        this.zzg(n3);
        boolean[] blArray = this.zzfh;
        boolean bl3 = blArray[n3];
        blArray[n3] = bl2;
        return bl3;
    }

    public final int size() {
        return this.size;
    }

    public final /* synthetic */ zzcn zzi(int n3) {
        int n4 = this.size;
        if (n3 >= n4) {
            boolean[] blArray = Arrays.copyOf(this.zzfh, n3);
            int n7 = this.size;
            zzaz zzaz2 = new zzaz(blArray, n7);
            return zzaz2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }
}

