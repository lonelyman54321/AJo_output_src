/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzhbq;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhdn;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzgzp
extends zzgzl
implements RandomAccess,
zzhbq,
zzhdn {
    private static final zzgzp zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzgzp zzgzp2;
        boolean[] blArray = new boolean[]{};
        zza = zzgzp2 = new zzgzp(blArray, 0, false);
    }

    public zzgzp() {
        boolean[] blArray = new boolean[10];
        this(blArray, 0, true);
    }

    private zzgzp(boolean[] blArray, int n3, boolean bl2) {
        super(bl2);
        this.zzb = blArray;
        this.zzc = n3;
    }

    public static zzgzp zzd() {
        return zza;
    }

    private final String zzi(int n3) {
        int n4 = this.zzc;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzj(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zzi(n3);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public final /* synthetic */ void add(int n3, Object object) {
        int n4;
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        this.zzdJ();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            int n7 = n3 + 1;
            boolean[] blArray = this.zzb;
            int n8 = blArray.length;
            int n10 = 1;
            if (n4 < n8) {
                System.arraycopy(blArray, n3, blArray, n7, n4 -= n3);
            } else {
                int n14 = 2;
                n4 = zy_2.a(n4, 3, n14, n10);
                boolean[] blArray2 = new boolean[n4];
                System.arraycopy(blArray, 0, blArray2, 0, n3);
                blArray = this.zzb;
                n8 = this.zzc - n3;
                System.arraycopy(blArray, n3, blArray2, n7, n8);
                this.zzb = blArray2;
            }
            this.zzb[n3] = bl2;
            this.zzc = n3 = this.zzc + n10;
            this.modCount = n3 = this.modCount + n10;
            return;
        }
        String string2 = this.zzi(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean addAll(Collection object) {
        this.zzdJ();
        Object[] objectArray = zzhcb.zzd;
        object.getClass();
        int n3 = object instanceof zzgzp;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzgzp)object;
        n3 = ((zzgzp)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            objectArray = this.zzb;
            n7 = objectArray.length;
            if ((n4 += n3) > n7) {
                objectArray = Arrays.copyOf((boolean[])objectArray, n4);
                this.zzb = (boolean[])objectArray;
            }
            objectArray = ((zzgzp)object).zzb;
            boolean[] blArray = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzgzp)object).zzc;
            System.arraycopy(objectArray, 0, blArray, n8, n10);
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
        int n3 = object instanceof zzgzp;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzgzp)object;
        n3 = this.zzc;
        int n4 = ((zzgzp)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzgzp)object).zzb;
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
        this.zzj(n3);
        return this.zzb[n3];
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            boolean[] blArray = this.zzb;
            n3 = zzhcb.zza(blArray[i3]);
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
        this.zzdJ();
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

    public final zzhbq zze(int n3) {
        int n4 = this.zzc;
        if (n3 >= n4) {
            boolean[] blArray = Arrays.copyOf(this.zzb, n3);
            int n7 = this.zzc;
            zzgzp zzgzp2 = new zzgzp(blArray, n7, true);
            return zzgzp2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zzg(boolean bl2) {
        this.zzdJ();
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

    public final boolean zzh(int n3) {
        this.zzj(n3);
        return this.zzb[n3];
    }
}

