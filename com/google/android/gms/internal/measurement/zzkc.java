/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzly;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzkc
extends zzis
implements zzkm,
zzly,
RandomAccess {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArray = new float[]{};
        zza = fArray;
        new zzkc(fArray, 0, false);
    }

    public zzkc() {
        float[] fArray = zza;
        this(fArray, 0, true);
    }

    private zzkc(float[] fArray, int n3, boolean bl2) {
        super(bl2);
        this.zzb = fArray;
        this.zzc = n3;
    }

    private static int zzd(int n3) {
        return Math.max(n3 * 3 / 2 + 1, 10);
    }

    private final String zze(int n3) {
        int n4 = this.zzc;
        return D70.b(n3, n4, "Index:", ", Size:");
    }

    private final void zzf(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.zzc)) {
            return;
        }
        String string2 = this.zze(n3);
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
            if (n4 < n7) {
                n7 = n3 + 1;
                System.arraycopy(fArray, n3, fArray, n7, n4 -= n3);
            } else {
                n4 = zzkc.zzd(fArray.length);
                float[] fArray2 = new float[n4];
                System.arraycopy(this.zzb, 0, fArray2, 0, n3);
                fArray = this.zzb;
                n7 = n3 + 1;
                int n8 = this.zzc - n3;
                System.arraycopy(fArray, n3, fArray2, n7, n8);
                this.zzb = fArray2;
            }
            this.zzb[n3] = f5;
            this.zzc = n3 = this.zzc + 1;
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        String string2 = this.zze(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final /* synthetic */ boolean add(Object object) {
        float f5 = ((Float)object).floatValue();
        this.zza(f5);
        return true;
    }

    public final boolean addAll(Collection object) {
        this.zza();
        zzkj.zza(object);
        int n3 = object instanceof zzkc;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzkc)object;
        n3 = ((zzkc)object).zzc;
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
            fArray = ((zzkc)object).zzb;
            float[] fArray2 = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzkc)object).zzc;
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
        int n3 = object instanceof zzkc;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzkc)object;
        n3 = this.zzc;
        int n4 = ((zzkc)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzkc)object).zzb;
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
        return Float.valueOf(this.zzb(n3));
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
        n3 = this.size();
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

    public final /* synthetic */ Object remove(int n3) {
        this.zza();
        this.zzf(n3);
        float[] fArray = this.zzb;
        float f5 = fArray[n3];
        int n4 = this.zzc;
        int n7 = n4 + -1;
        if (n3 < n7) {
            n7 = n3 + 1;
            n4 = n4 - n3 + -1;
            System.arraycopy(fArray, n7, fArray, n3, n4);
        }
        this.zzc = n3 = this.zzc + -1;
        this.modCount = n3 = this.modCount + 1;
        return Float.valueOf(f5);
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

    public final /* synthetic */ Object set(int n3, Object object) {
        float f5 = ((Float)object).floatValue();
        this.zza();
        this.zzf(n3);
        float[] fArray = this.zzb;
        float f6 = fArray[n3];
        fArray[n3] = f5;
        return Float.valueOf(f6);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzkm zza(int n3) {
        int n4 = this.zzc;
        if (n3 >= n4) {
            Object object;
            float[] fArray;
            if (n3 == 0) {
                fArray = zza;
            } else {
                object = this.zzb;
                fArray = Arrays.copyOf(object, n3);
            }
            object = new zzkc;
            int n7 = this.zzc;
            object(fArray, n7, true);
            return object;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void zza(float f5) {
        float[] fArray;
        this.zza();
        int n3 = this.zzc;
        float[] fArray2 = this.zzb;
        int n4 = fArray2.length;
        if (n3 == n4) {
            n3 = zzkc.zzd(fArray2.length);
            fArray = new float[n3];
            fArray2 = this.zzb;
            n4 = this.zzc;
            System.arraycopy(fArray2, 0, fArray, 0, n4);
            this.zzb = fArray;
        }
        fArray = this.zzb;
        int n7 = this.zzc;
        this.zzc = n4 = n7 + 1;
        fArray[n7] = f5;
    }

    public final float zzb(int n3) {
        this.zzf(n3);
        return this.zzb[n3];
    }

    public final void zzc(int n3) {
        float[] fArray = this.zzb;
        int n4 = fArray.length;
        if (n3 <= n4) {
            return;
        }
        n4 = fArray.length;
        if (n4 == 0) {
            float[] fArray2 = new float[Math.max(n3, 10)];
            this.zzb = fArray2;
            return;
        }
        int n7 = fArray.length;
        while (n7 < n3) {
            n7 = zzkc.zzd(n7);
        }
        float[] fArray3 = Arrays.copyOf(this.zzb, n7);
        this.zzb = fArray3;
    }
}

