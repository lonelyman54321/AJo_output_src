/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzhbv;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhdn;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzhbf
extends zzgzl
implements RandomAccess,
zzhbv,
zzhdn {
    private static final zzhbf zza;
    private float[] zzb;
    private int zzc;

    static {
        zzhbf zzhbf2;
        float[] fArray = new float[]{};
        zza = zzhbf2 = new zzhbf(fArray, 0, false);
    }

    public zzhbf() {
        float[] fArray = new float[10];
        this(fArray, 0, true);
    }

    private zzhbf(float[] fArray, int n3, boolean bl2) {
        super(bl2);
        this.zzb = fArray;
        this.zzc = n3;
    }

    public static zzhbf zze() {
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
        object = (Float)object;
        float f5 = ((Float)object).floatValue();
        this.zzdJ();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            int n7 = n3 + 1;
            float[] fArray = this.zzb;
            int n8 = fArray.length;
            int n10 = 1;
            if (n4 < n8) {
                System.arraycopy(fArray, n3, fArray, n7, n4 -= n3);
            } else {
                int n14 = 2;
                n4 = zy_2.a(n4, 3, n14, n10);
                float[] fArray2 = new float[n4];
                System.arraycopy(fArray, 0, fArray2, 0, n3);
                fArray = this.zzb;
                n8 = this.zzc - n3;
                System.arraycopy(fArray, n3, fArray2, n7, n8);
                this.zzb = fArray2;
            }
            this.zzb[n3] = f5;
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
        int n3 = object instanceof zzhbf;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzhbf)object;
        n3 = ((zzhbf)object).zzc;
        if (n3 == 0) {
            return false;
        }
        int n4 = this.zzc;
        int n7 = (-1 >>> 1) - n4;
        if (n7 >= n3) {
            objectArray = this.zzb;
            n7 = objectArray.length;
            if ((n4 += n3) > n7) {
                objectArray = Arrays.copyOf((float[])objectArray, n4);
                this.zzb = objectArray;
            }
            objectArray = ((zzhbf)object).zzb;
            float[] fArray = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzhbf)object).zzc;
            System.arraycopy(objectArray, 0, fArray, n8, n10);
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
        int n3 = object instanceof zzhbf;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzhbf)object;
        n3 = this.zzc;
        int n4 = ((zzhbf)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzhbf)object).zzb;
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
        this.zzj(n3);
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
        this.zzdJ();
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

    public final float zzd(int n3) {
        this.zzj(n3);
        return this.zzb[n3];
    }

    public final zzhbv zzg(int n3) {
        int n4 = this.zzc;
        if (n3 >= n4) {
            float[] fArray = Arrays.copyOf(this.zzb, n3);
            int n7 = this.zzc;
            zzhbf zzhbf2 = new zzhbf(fArray, n7, true);
            return zzhbf2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zzh(float f5) {
        this.zzdJ();
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

