/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzgau;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbg;
import com.google.android.gms.internal.ads.zzgcm;
import com.google.android.gms.internal.ads.zzgcu;
import com.google.android.gms.internal.ads.zzgde;
import com.google.android.gms.internal.ads.zzgdf;
import com.google.android.gms.internal.ads.zzgdi;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

public abstract class zzgbh
extends zzgax
implements Set {
    private transient zzgbc zza;

    public static int zzh(int n3) {
        int n4;
        if ((n3 = Math.max(n3, 2)) < (n4 = 0x2CCCCCCC)) {
            double d2;
            double d5;
            double d7;
            double d9;
            n4 = Integer.highestOneBit(n3 + -1);
            while ((d9 = (d7 = (d5 = (double)(n4 += n4) * 0.7) - (d2 = (double)n3)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) < 0) {
            }
            return n4;
        }
        n4 = 0x40000000;
        n3 = n3 < n4 ? 1 : 0;
        zzfyg.zzf(n3 != 0, "collection too large");
        return n4;
    }

    public static zzgbg zzj(int n3) {
        zzgbg zzgbg2 = new zzgbg(n3);
        return zzgbg2;
    }

    public static /* bridge */ /* synthetic */ zzgbh zzk(int n3, Object[] objectArray) {
        return zzgbh.zzv(n3, objectArray);
    }

    public static zzgbh zzl(Collection objectArray) {
        boolean bl2 = objectArray instanceof zzgbh;
        if (bl2 && !(bl2 = objectArray instanceof SortedSet)) {
            Object object = objectArray;
            object = (zzgbh)objectArray;
            boolean bl3 = ((zzgax)object).zzf();
            if (!bl3) {
                return object;
            }
        }
        objectArray = objectArray.toArray();
        return zzgbh.zzv(objectArray.length, objectArray);
    }

    public static zzgbh zzm(Object[] objectArray) {
        int n3 = objectArray.length;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                objectArray = (Object[])objectArray.clone();
                return zzgbh.zzv(n3, objectArray);
            }
            objectArray = objectArray[0];
            zzgdf zzgdf2 = new zzgdf(objectArray);
            return zzgdf2;
        }
        return zzgcu.zza;
    }

    public static zzgbh zzn() {
        return zzgcu.zza;
    }

    public static zzgbh zzo(Object object) {
        zzgdf zzgdf2 = new zzgdf(object);
        return zzgdf2;
    }

    public static zzgbh zzp(Object object, Object object2) {
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        return zzgbh.zzv(n3, objectArray);
    }

    public static zzgbh zzq(Object object, Object object2, Object object3) {
        int n3 = 3;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        return zzgbh.zzv(n3, objectArray);
    }

    public static zzgbh zzr(Object object, Object object2, Object object3, Object object4, Object object5) {
        int n3 = 5;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        objectArray[4] = object5;
        return zzgbh.zzv(n3, objectArray);
    }

    public static zzgbh zzs(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object ... objectArray) {
        int n3 = 12;
        Object[] objectArray2 = new Object[n3];
        objectArray2[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        int n4 = 6;
        System.arraycopy(objectArray, 0, objectArray2, n4, n4);
        return zzgbh.zzv(n3, objectArray2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(int n3, int n4) {
        return zzgbh.zzw(n3, n4);
    }

    private static zzgbh zzv(int n3, Object ... objectArray) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                Object[] objectArray2;
                int n7;
                int n8 = zzgbh.zzh(n3);
                Object[] objectArray3 = new Object[n8];
                int n10 = n8 + -1;
                int n14 = 0;
                int n15 = 0;
                block0: for (n7 = 0; n7 < n3; ++n7) {
                    objectArray2 = objectArray[n7];
                    zzgcm.zza(objectArray2, n7);
                    int n16 = objectArray2.hashCode();
                    int n17 = zzgau.zza(n16);
                    while (true) {
                        int n18;
                        Object object;
                        if ((object = objectArray3[n18 = n17 & n10]) == null) {
                            n17 = n15 + 1;
                            objectArray[n15] = objectArray2;
                            objectArray3[n18] = objectArray2;
                            n14 += n16;
                            n15 = n17;
                            continue block0;
                        }
                        n18 = (int)(object.equals(objectArray2) ? 1 : 0);
                        if (n18 != 0) continue block0;
                        ++n17;
                    }
                }
                n7 = 0;
                Arrays.fill(objectArray, n15, n3, null);
                if (n15 == n4) {
                    Object object = objectArray[0];
                    Objects.requireNonNull(object);
                    objectArray = new zzgdf(object);
                    return objectArray;
                }
                n3 = zzgbh.zzh(n15);
                if (n3 < (n8 /= 2)) {
                    return zzgbh.zzv(n15, objectArray);
                }
                n3 = objectArray.length;
                if ((n3 = (int)(zzgbh.zzw(n15, n3) ? 1 : 0)) != 0) {
                    objectArray = Arrays.copyOf(objectArray, n15);
                }
                objectArray2 = objectArray;
                zzgcu zzgcu2 = new zzgcu(objectArray, n14, objectArray3, n10, n15);
                return zzgcu2;
            }
            Object object = objectArray[0];
            Objects.requireNonNull(object);
            objectArray = new zzgdf(object);
            return objectArray;
        }
        return zzgcu.zza;
    }

    private static boolean zzw(int n3, int n4) {
        int n7 = n4 >> 1;
        return n3 < (n7 += (n4 >>= 2));
    }

    public final boolean equals(Object object) {
        boolean bl2;
        if (object == this) {
            return true;
        }
        boolean n3 = object instanceof zzgbh;
        if (n3 && (bl2 = this.zzu())) {
            int n4;
            int n7;
            Object object2 = object;
            object2 = (zzgbh)object;
            boolean bl3 = ((zzgbh)object2).zzu();
            if (bl3 && (n7 = this.hashCode()) != (n4 = object.hashCode())) {
                return false;
            }
        }
        return zzgde.zzd(this, object);
    }

    public int hashCode() {
        return zzgde.zza(this);
    }

    public zzgbc zzd() {
        zzgbc zzgbc2 = this.zza;
        if (zzgbc2 == null) {
            this.zza = zzgbc2 = this.zzi();
        }
        return zzgbc2;
    }

    public abstract zzgdi zze();

    public zzgbc zzi() {
        Object[] objectArray = this.toArray();
        int n3 = zzgbc.zzd;
        n3 = objectArray.length;
        return zzgbc.zzj(objectArray, n3);
    }

    public boolean zzu() {
        return false;
    }
}

