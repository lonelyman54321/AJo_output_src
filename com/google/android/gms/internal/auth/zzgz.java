/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzfy;
import java.util.Arrays;

public final class zzgz {
    private static final zzgz zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    static {
        zzgz zzgz2;
        int[] nArray = new int[]{};
        Object[] objectArray = new Object[]{};
        zza = zzgz2 = new zzgz(0, nArray, objectArray, false);
    }

    private zzgz() {
        int n3 = 8;
        int[] nArray = new int[n3];
        Object[] objectArray = new Object[n3];
        this(0, nArray, objectArray, true);
    }

    private zzgz(int n3, int[] nArray, Object[] objectArray, boolean bl2) {
        this.zzb = n3;
        this.zzc = nArray;
        this.zzd = objectArray;
        this.zze = bl2;
    }

    public static zzgz zza() {
        return zza;
    }

    public static zzgz zzb(zzgz zzgz2, zzgz zzgz3) {
        int n3 = zzgz2.zzb;
        int n4 = zzgz3.zzb;
        int[] nArray = Arrays.copyOf(zzgz2.zzc, n3 += n4);
        Object[] objectArray = zzgz3.zzc;
        int n7 = zzgz2.zzb;
        int n8 = zzgz3.zzb;
        System.arraycopy(objectArray, 0, nArray, n7, n8);
        objectArray = Arrays.copyOf(zzgz2.zzd, n3);
        Object[] objectArray2 = zzgz3.zzd;
        int n10 = zzgz2.zzb;
        int n14 = zzgz3.zzb;
        System.arraycopy(objectArray2, 0, objectArray, n10, n14);
        zzgz2 = new zzgz(n3, nArray, objectArray, true);
        return zzgz2;
    }

    public static zzgz zzc() {
        int n3 = 8;
        int[] nArray = new int[n3];
        Object[] objectArray = new Object[n3];
        zzgz zzgz2 = new zzgz(0, nArray, objectArray, true);
        return zzgz2;
    }

    public final boolean equals(Object objectArray) {
        block8: {
            boolean bl2 = true;
            if (this == objectArray) {
                return bl2;
            }
            if (objectArray == null) {
                return false;
            }
            int n3 = objectArray instanceof zzgz;
            if (n3 == 0) {
                return false;
            }
            objectArray = (zzgz)objectArray;
            n3 = this.zzb;
            int n4 = objectArray.zzb;
            if (n3 == n4) {
                int n7;
                int[] nArray = this.zzc;
                int[] nArray2 = objectArray.zzc;
                Object object = null;
                for (n7 = 0; n7 < n3; ++n7) {
                    int n8 = nArray[n7];
                    int n10 = nArray2[n7];
                    if (n8 == n10) {
                        continue;
                    }
                    break block8;
                }
                Object[] objectArray2 = this.zzd;
                objectArray = objectArray.zzd;
                n4 = this.zzb;
                nArray2 = null;
                for (int i3 = 0; i3 < n4; ++i3) {
                    object = objectArray2[i3];
                    Object object2 = objectArray[i3];
                    n7 = (int)(object.equals(object2) ? 1 : 0);
                    if (n7 != 0) {
                        continue;
                    }
                    break block8;
                }
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.zzb;
        int n7 = (n4 + 527) * 31;
        int[] nArray = this.zzc;
        int n8 = 17;
        int n10 = 0;
        Object object = null;
        int n14 = 17;
        for (n3 = 0; n3 < n4; ++n3) {
            n14 *= 31;
            int n15 = nArray[n3];
            n14 += n15;
        }
        n7 = (n7 + n14) * 31;
        Object[] objectArray = this.zzd;
        int n16 = this.zzb;
        while (n10 < n16) {
            n8 *= 31;
            object = objectArray[n10];
            n3 = object.hashCode();
            n8 += n3;
            ++n10;
        }
        return n7 + n8;
    }

    public final void zzd() {
        this.zze = false;
    }

    public final void zze(StringBuilder stringBuilder, int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = this.zzb); ++i3) {
            n4 = this.zzc[i3] >>> 3;
            String string2 = String.valueOf(n4);
            Object object = this.zzd[i3];
            zzfy.zzb(stringBuilder, n3, string2, object);
        }
    }

    public final void zzf(int n3, Object object) {
        int n4 = this.zze;
        if (n4 != 0) {
            int[] nArray;
            n4 = this.zzb;
            Object[] objectArray = this.zzc;
            int n7 = objectArray.length;
            if (n4 == n7) {
                n7 = 4;
                n7 = n4 < n7 ? 8 : n4 >> 1;
                this.zzc = objectArray = Arrays.copyOf(objectArray, n4 += n7);
                objectArray = this.zzd;
                nArray = Arrays.copyOf(objectArray, n4);
                this.zzd = nArray;
            }
            nArray = this.zzc;
            int n8 = this.zzb;
            nArray[n8] = n3;
            this.zzd[n8] = object;
            this.zzb = ++n8;
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

