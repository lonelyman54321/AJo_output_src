/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzyj;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzabx
extends zzyj
implements RandomAccess,
zzacn {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArray = new float[]{};
        zza = fArray;
        new zzabx(fArray, 0, false);
    }

    public zzabx() {
        float[] fArray = zza;
        this(fArray, 0, true);
    }

    private zzabx(float[] fArray, int n3, boolean bl2) {
        super(bl2);
        this.zzb = fArray;
        this.zzc = n3;
    }

    private static int zzh(int n3) {
        return Math.max(n3 * 3 / 2 + 1, 10);
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
        this.zza();
        if (n3 >= 0 && n3 <= (n4 = this.zzc)) {
            int n7 = n3 + 1;
            float[] fArray = this.zzb;
            int n8 = fArray.length;
            if (n4 < n8) {
                System.arraycopy(fArray, n3, fArray, n7, n4 -= n3);
            } else {
                n4 = zzabx.zzh(n8);
                float[] fArray2 = new float[n4];
                System.arraycopy(this.zzb, 0, fArray2, 0, n3);
                fArray = this.zzb;
                n8 = this.zzc - n3;
                System.arraycopy(fArray, n3, fArray2, n7, n8);
                this.zzb = fArray2;
            }
            this.zzb[n3] = f5;
            this.zzc = n3 = this.zzc + 1;
            this.modCount = n3 = this.modCount + 1;
            return;
        }
        String string2 = this.zzi(n3);
        object = new IndexOutOfBoundsException(string2);
        throw object;
    }

    public final boolean addAll(Collection object) {
        this.zza();
        Object[] objectArray = zzaco.zzb;
        object.getClass();
        int n3 = object instanceof zzabx;
        if (n3 == 0) {
            return super.addAll((Collection)object);
        }
        object = (zzabx)object;
        n3 = ((zzabx)object).zzc;
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
            objectArray = ((zzabx)object).zzb;
            float[] fArray = this.zzb;
            int n8 = this.zzc;
            int n10 = ((zzabx)object).zzc;
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
        int n3 = object instanceof zzabx;
        if (n3 == 0) {
            return super.equals(object);
        }
        object = (zzabx)object;
        n3 = this.zzc;
        int n4 = ((zzabx)object).zzc;
        if (n3 != n4) {
            return false;
        }
        object = ((zzabx)object).zzb;
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

    public final float zze(int n3) {
        this.zzj(n3);
        return this.zzb[n3];
    }

    public final void zzf(float f5) {
        int n3;
        float[] fArray;
        this.zza();
        int n4 = this.zzc;
        float[] fArray2 = this.zzb;
        int n7 = fArray2.length;
        if (n4 == n7) {
            n4 = zzabx.zzh(n7);
            fArray = new float[n4];
            fArray2 = this.zzb;
            n3 = this.zzc;
            System.arraycopy(fArray2, 0, fArray, 0, n3);
            this.zzb = fArray;
        }
        fArray = this.zzb;
        n7 = this.zzc;
        this.zzc = n3 = n7 + 1;
        fArray[n7] = f5;
    }

    public final void zzg(int n3) {
        float[] fArray = this.zzb;
        int n4 = fArray.length;
        if (n3 <= n4) {
            return;
        }
        if (n4 != 0) {
            while (n4 < n3) {
                n4 = zzabx.zzh(n4);
            }
            float[] fArray2 = Arrays.copyOf(this.zzb, n4);
            this.zzb = fArray2;
            return;
        }
        float[] fArray3 = new float[Math.max(n3, 10)];
        this.zzb = fArray3;
    }
}

