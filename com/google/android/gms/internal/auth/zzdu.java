/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdq;
import com.google.android.gms.internal.auth.zzey;
import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzgd;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzdu
extends zzdq
implements RandomAccess,
zzey,
zzgd {
    private static final zzdu zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzdu zzdu2;
        boolean[] blArray = new boolean[]{};
        zza = zzdu2 = new zzdu(blArray, 0);
        zzdu2.zzb();
    }

    public zzdu() {
        boolean[] blArray = new boolean[10];
        this(blArray, 0);
    }

    private zzdu(boolean[] blArray, int n3) {
        this.zzb = blArray;
        this.zzc = n3;
    }

    private final String zzf(int n3) {
        int n4 = this.zzc;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzg(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zzf(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4;
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        this.zza();
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
        String string2 = this.zzf(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean addAll(Collection object) {
        this.zza();
        zzez.zze(object);
        int n3 = object instanceof zzdu;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzdu)object;
        n3 = ((zzdu)object).zzc;
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
            blArray = ((zzdu)object).zzb;
            boolean[] blArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzdu)object).zzc;
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
        int n3 = object instanceof zzdu;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzdu)object;
        n3 = this.zzc;
        int n4 = ((zzdu)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzdu)object).zzb;
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
        this.zzg(n3);
        return this.zzb[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            boolean[] blArray = this.zzb;
            n3 = zzez.zza(blArray[i3]);
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
        n3 = this.zzc;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean[] blArray = this.zzb;
            boolean bl3 = blArray[i3];
            if (bl3 != bl2) continue;
            return i3;
        }
        return n4;
    }

    public final void removeRange(int n3, int n4) {
        this.zza();
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

    public final int size() {
        return this.zzc;
    }

    public final void zze(boolean bl2) {
        this.zza();
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

