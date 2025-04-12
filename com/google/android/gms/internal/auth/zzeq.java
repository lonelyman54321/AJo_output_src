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

final class zzeq
extends zzdq
implements RandomAccess,
zzey,
zzgd {
    private static final zzeq zza;
    private float[] zzb;
    private int zzc;

    static {
        zzeq zzeq2;
        float[] fArray = new float[]{};
        zza = zzeq2 = new zzeq(fArray, 0);
        zzeq2.zzb();
    }

    public zzeq() {
        float[] fArray = new float[10];
        this(fArray, 0);
    }

    private zzeq(float[] fArray, int n3) {
        this.zzb = fArray;
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
        object = (Float)object;
        float f5 = ((Float)object).floatValue();
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            float[] fArray = this.zzb;
            int n7 = fArray.length;
            int n8 = 1;
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(fArray, n3, fArray, n7, n4 -= n3);
            } else {
                n4 = zy_2.a(n4, 3, 2, n8);
                float[] fArray2 = new float[n4];
                System.arraycopy(fArray, 0, fArray2, 0, n3);
                fArray = this.zzb;
                n7 = n3 + 1;
                int n10 = this.zzc - n3;
                System.arraycopy(fArray, n3, fArray2, n7, n10);
                this.zzb = fArray2;
            }
            this.zzb[n3] = f5;
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
        int n3 = object instanceof zzeq;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzeq)object;
        n3 = ((zzeq)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            float[] fArray = this.zzb;
            n7 = fArray.length;
            if ((n4 += n3) > n7) {
                this.zzb = fArray = Arrays.copyOf(fArray, n4);
            }
            fArray = ((zzeq)object).zzb;
            float[] fArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzeq)object).zzc;
            System.arraycopy(fArray, 0, fArray2, n8, n10);
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
        int n3 = object instanceof zzeq;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzeq)object;
        n3 = this.zzc;
        int n4 = ((zzeq)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzeq)object).zzb;
        for (n3 = 0; n3 < (n4 = this.zzc); ++n3) {
            Object object2;
            int n7;
            float[] fArray = this.zzb;
            float f5 = fArray[n3];
            n4 = Float.floatToIntBits(f5);
            if (n4 == (n7 = Float.floatToIntBits((float)(object2 = object[n3])))) continue;
            return false;
        }
        return bl2;
    }

    public final /* synthetic */ Object get(int n3) {
        this.zzg(n3);
        return Float.valueOf(this.zzb[n3]);
    }

    public final int hashCode() {
        int n3;
        int n4 = 1;
        for (int i3 = 0; i3 < (n3 = this.zzc); ++i3) {
            n4 *= 31;
            float[] fArray = this.zzb;
            float f5 = fArray[i3];
            n3 = Float.floatToIntBits(f5);
            n4 += n3;
        }
        return n4;
    }

    public final int indexOf(Object object) {
        int n3 = object instanceof Float;
        int n4 = -1;
        if (n3 == 0) {
            return n4;
        }
        object = (Float)object;
        float f5 = ((Float)object).floatValue();
        n3 = this.zzc;
        for (int i3 = 0; i3 < n3; ++i3) {
            float[] fArray = this.zzb;
            float f6 = fArray[i3];
            float f7 = f6 - f5;
            Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object2 != false) continue;
            return i3;
        }
        return n4;
    }

    public final void removeRange(int n3, int n4) {
        this.zza();
        if (n4 >= n3) {
            float[] fArray = this.zzb;
            int n7 = this.zzc - n4;
            System.arraycopy(fArray, n4, fArray, n3, n7);
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

    public final void zze(float f5) {
        this.zza();
        int n3 = this.zzc;
        float[] fArray = this.zzb;
        int n4 = fArray.length;
        if (n3 == n4) {
            int n7 = 1;
            n4 = zy_2.a(n3, 3, 2, n7);
            float[] fArray2 = new float[n4];
            System.arraycopy(fArray, 0, fArray2, 0, n3);
            this.zzb = fArray2;
        }
        float[] fArray3 = this.zzb;
        int n8 = this.zzc;
        this.zzc = n4 = n8 + 1;
        fArray3[n8] = f5;
    }
}

