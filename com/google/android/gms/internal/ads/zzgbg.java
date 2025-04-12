/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgau;
import com.google.android.gms.internal.ads.zzgav;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgcu;
import com.google.android.gms.internal.ads.zzgdf;
import java.util.Arrays;
import java.util.Objects;

public final class zzgbg
extends zzgav {
    Object[] zzd;
    private int zze;

    public zzgbg() {
        super(4);
    }

    public zzgbg(int n3) {
        super(n3);
        Object[] objectArray = new Object[zzgbh.zzh(n3)];
        this.zzd = objectArray;
    }

    public final zzgbg zzf(Object object) {
        Object[] objectArray;
        int n3;
        int n4;
        object.getClass();
        Object[] objectArray2 = this.zzd;
        if (objectArray2 != null && (n4 = zzgbh.zzh(this.zzb)) <= (n3 = (objectArray = this.zzd).length)) {
            n4 = objectArray.length + -1;
            int n7 = object.hashCode();
            n3 = zzgau.zza(n7);
            while (true) {
                Object[] objectArray3;
                Object object2;
                if ((object2 = (objectArray3 = this.zzd)[n3 &= n4]) == null) {
                    objectArray3[n3] = object;
                    this.zze = n4 = this.zze + n7;
                    this.zza(object);
                    break;
                }
                boolean bl2 = object2.equals(object);
                if (bl2) break;
                ++n3;
            }
            return this;
        }
        this.zzd = null;
        this.zza(object);
        return this;
    }

    public final zzgbg zzg(Object ... objectArray) {
        Object[] objectArray2 = this.zzd;
        int n3 = 2;
        if (objectArray2 != null) {
            objectArray2 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object = objectArray[i3];
                this.zzf(object);
            }
        } else {
            this.zzd(objectArray, n3);
        }
        return this;
    }

    public final zzgbg zzh(Iterable object) {
        object.getClass();
        Object object2 = this.zzd;
        if (object2 != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                object2 = object.next();
                this.zzf(object2);
            }
        } else {
            this.zzc((Iterable)object);
        }
        return this;
    }

    public final zzgbh zzi() {
        int n3 = this.zzb;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                zzgbh zzgbh2;
                int n7;
                Object[] objectArray = this.zzd;
                if (objectArray != null && (n3 = zzgbh.zzh(n3)) == (n7 = (objectArray = this.zzd).length)) {
                    n3 = this.zzb;
                    objectArray = this.zza;
                    int n8 = objectArray.length;
                    if ((n8 = (int)(zzgbh.zzt(n3, n8) ? 1 : 0)) != 0) {
                        objectArray = Arrays.copyOf(objectArray, n3);
                    }
                    int n10 = this.zze;
                    Object[] objectArray2 = this.zzd;
                    n7 = objectArray2.length;
                    int n14 = n7 + -1;
                    int n15 = this.zzb;
                    zzgbh2 = new zzgcu(objectArray, n10, objectArray2, n14, n15);
                } else {
                    n3 = this.zzb;
                    objectArray = this.zza;
                    zzgbh2 = zzgbh.zzk(n3, objectArray);
                    this.zzb = n7 = zzgbh2.size();
                }
                this.zzc = n4;
                this.zzd = null;
                return zzgbh2;
            }
            Object object = this.zza[0];
            Objects.requireNonNull(object);
            zzgdf zzgdf2 = new zzgdf(object);
            return zzgdf2;
        }
        return zzgcu.zza;
    }
}

