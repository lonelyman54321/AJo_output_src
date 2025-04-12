/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhj;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjl;
import com.google.android.gms.internal.vision.zzkw;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzhr
extends zzhj
implements zzjl,
zzkw,
RandomAccess {
    private static final zzhr zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzhr zzhr2;
        boolean[] blArray = new boolean[]{};
        zza = zzhr2 = new zzhr(blArray, 0);
        zzhr2.zzb();
    }

    public zzhr() {
        boolean[] blArray = new boolean[10];
        this(blArray, 0);
    }

    private zzhr(boolean[] blArray, int n3) {
        this.zzb = blArray;
        this.zzc = n3;
    }

    private final void zzb(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zzc(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    private final String zzc(int n3) {
        int n4 = this.zzc;
        return C12.a(35, n3, n4, "Index:", ", Size:");
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4;
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        this.zzc();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            boolean[] blArray = this.zzb;
            int n7 = blArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(blArray, n3, blArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                boolean[] blArray2 = new boolean[n4];
                System.arraycopy(blArray, 0, blArray2, 0, n3);
                blArray = this.zzb;
                n7 = n3 + 1;
                int n10 = this.zzc - n3;
                System.arraycopy(blArray, n3, blArray2, n7, n10);
                this.zzb = blArray2;
            }
            this.zzb[n3] = bl2;
            this.zzc = n3 = this.zzc + n8;
            this.modCount = n3 = this.modCount + n8;
            return;
        }
        String string2 = this.zzc(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final /* synthetic */ boolean add(Object object) {
        boolean bl2 = (Boolean)object;
        this.zza(bl2);
        return true;
    }

    public final boolean addAll(Collection object) {
        this.zzc();
        zzjf.zza(object);
        int n3 = object instanceof zzhr;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzhr)object;
        n3 = ((zzhr)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            boolean[] blArray = this.zzb;
            n7 = blArray.length;
            if ((n4 += n3) > n7) {
                this.zzb = blArray = Arrays.copyOf(blArray, n4);
            }
            blArray = ((zzhr)object).zzb;
            boolean[] blArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzhr)object).zzc;
            System.arraycopy(blArray, 0, blArray2, n8, n10);
            this.zzc = n4;
            n10 = this.modCount;
            n3 = 1;
            this.modCount = n10 += n3;
            return n3 != 0;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public final boolean contains(Object object) {
        int n3;
        int n4 = this.indexOf(object);
        return n4 != (n3 = -1);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof zzhr;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzhr)object;
        n3 = this.zzc;
        int n4 = ((zzhr)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzhr)object).zzb;
        for (n3 = 0; n3 < (n4 = this.zzc); ++n3) {
            boolean[] blArray = this.zzb;
            n4 = blArray[n3];
            Object object2 = object[n3];
            if (n4 == object2) continue;
            return false;
        }
        return bl2;
    }

    public final /* synthetic */ Object get(int n3) {
        this.zzb(n3);
        return this.zzb[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            boolean[] blArray = this.zzb;
            n3 = zzjf.zza(blArray[i3]);
            n4 += n3;
        }
        return n4;
    }

    public final int indexOf(Object object) {
        int n3 = object instanceof Boolean;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean[] blArray = this.zzb;
            boolean bl3 = blArray[i3];
            if (bl3 != bl2) continue;
            return i3;
        }
        return n4;
    }

    public final /* synthetic */ Object remove(int n3) {
        this.zzc();
        this.zzb(n3);
        boolean[] blArray = this.zzb;
        boolean bl2 = blArray[n3];
        int n4 = this.zzc;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(blArray, n7, blArray, n3, n4);
        }
        this.zzc = n3 = this.zzc + -1;
        this.modCount = n3 = this.modCount + 1;
        return bl2;
    }

    public final void removeRange(int n3, int n4) {
        this.zzc();
        if (n4 >= n3) {
            boolean[] blArray = this.zzb;
            int n7 = this.zzc - n4;
            System.arraycopy(blArray, n4, blArray, n3, n7);
            int n8 = this.zzc;
            this.zzc = n8 -= (n4 -= n3);
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("toIndex < fromIndex");
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ Object set(int n3, Object object) {
        boolean bl2 = (Boolean)object;
        this.zzc();
        this.zzb(n3);
        boolean[] blArray = this.zzb;
        boolean bl3 = blArray[n3];
        blArray[n3] = bl2;
        return bl3;
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzjl zza(int n3) {
        int n4 = this.zzc;
        if (n3 >= n4) {
            boolean[] blArray = Arrays.copyOf(this.zzb, n3);
            int n7 = this.zzc;
            zzhr zzhr2 = new zzhr(blArray, n7);
            return zzhr2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zza(boolean bl2) {
        this.zzc();
        int n3 = this.zzc;
        boolean[] blArray = this.zzb;
        int n4 = blArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            boolean[] blArray2 = new boolean[n4];
            System.arraycopy(blArray, 0, blArray2, 0, n3);
            this.zzb = blArray2;
        }
        boolean[] blArray3 = this.zzb;
        int n8 = this.zzc;
        this.zzc = n4 = n8 + 1;
        blArray3[n8] = bl2;
    }
}

