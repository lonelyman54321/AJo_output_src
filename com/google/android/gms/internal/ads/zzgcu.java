/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgau;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgdi;
import java.util.Iterator;

final class zzgcu
extends zzgbh {
    static final zzgcu zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        zzgcu zzgcu2;
        Object[] objectArray = new Object[]{};
        zzd = objectArray;
        zza = zzgcu2 = new zzgcu(objectArray, 0, objectArray, 0, 0);
    }

    public zzgcu(Object[] objectArray, int n3, Object[] objectArray2, int n4, int n7) {
        this.zzb = objectArray;
        this.zze = n3;
        this.zzc = objectArray2;
        this.zzf = n4;
        this.zzg = n7;
    }

    public final boolean contains(Object object) {
        Object[] objectArray;
        int n3;
        if (object != null && (n3 = (objectArray = this.zzc).length) != 0) {
            n3 = zzgau.zzb(object);
            while (true) {
                int n4;
                Object object2;
                if ((object2 = objectArray[n3 &= (n4 = this.zzf)]) == null) {
                    return false;
                }
                n4 = (int)(object2.equals(object) ? 1 : 0);
                if (n4 != 0) {
                    return true;
                }
                ++n3;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zze;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzd().zzu(0);
    }

    public final int size() {
        return this.zzg;
    }

    public final int zza(Object[] objectArray, int n3) {
        Object[] objectArray2 = this.zzb;
        int n4 = this.zzg;
        System.arraycopy(objectArray2, 0, objectArray, n3, n4);
        int n7 = this.zzg;
        return n3 + n7;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final int zzc() {
        return 0;
    }

    public final zzgdi zze() {
        return this.zzd().zzu(0);
    }

    public final boolean zzf() {
        return false;
    }

    public final Object[] zzg() {
        return this.zzb;
    }

    public final zzgbc zzi() {
        Object[] objectArray = this.zzb;
        int n3 = this.zzg;
        return zzgbc.zzj(objectArray, n3);
    }

    public final boolean zzu() {
        return true;
    }
}

