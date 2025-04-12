/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzec;
import com.google.android.gms.internal.vision.zzee;
import com.google.android.gms.internal.vision.zzej;
import com.google.android.gms.internal.vision.zzfa;
import java.util.Iterator;

final class zzev
extends zzej {
    static final zzev zza;
    private final transient Object[] zzb;
    private final transient Object[] zzc;
    private final transient int zzd;
    private final transient int zze;
    private final transient int zzf;

    static {
        zzev zzev2;
        Object[] objectArray = new Object[]{};
        zza = zzev2 = new zzev(objectArray, 0, null, 0, 0);
    }

    public zzev(Object[] objectArray, int n3, Object[] objectArray2, int n4, int n7) {
        this.zzb = objectArray;
        this.zzc = objectArray2;
        this.zzd = n4;
        this.zze = n3;
        this.zzf = n7;
    }

    public final boolean contains(Object object) {
        Object[] objectArray = this.zzc;
        if (object != null && objectArray != null) {
            int n3 = zzec.zza(object);
            while (true) {
                int n4;
                Object object2;
                if ((object2 = objectArray[n3 &= (n4 = this.zzd)]) == null) {
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
        return this.zza();
    }

    public final int size() {
        return this.zzf;
    }

    public final int zza(Object[] objectArray, int n3) {
        Object[] objectArray2 = this.zzb;
        int n4 = this.zzf;
        System.arraycopy(objectArray2, 0, objectArray, n3, n4);
        int n7 = this.zzf;
        return n3 + n7;
    }

    public final zzfa zza() {
        return (zzfa)this.zze().iterator();
    }

    public final Object[] zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg() {
        return true;
    }

    public final zzee zzh() {
        Object[] objectArray = this.zzb;
        int n3 = this.zzf;
        return zzee.zzb(objectArray, n3);
    }
}

