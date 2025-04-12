/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzcz;
import com.google.android.gms.internal.consent_sdk.zzdd;
import com.google.android.gms.internal.consent_sdk.zzde;
import com.google.android.gms.internal.consent_sdk.zzdj;
import java.util.Iterator;

final class zzdh
extends zzde {
    static final zzdh zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        zzdh zzdh2;
        Object[] objectArray = new Object[]{};
        zzd = objectArray;
        zza = zzdh2 = new zzdh(objectArray, 0, objectArray, 0, 0);
    }

    public zzdh(Object[] objectArray, int n3, Object[] objectArray2, int n4, int n7) {
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
            n3 = zzcz.zza(object.hashCode());
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
        return this.zzg().zzh(0);
    }

    public final int size() {
        return this.zzg;
    }

    public final int zza(Object[] objectArray, int n3) {
        Object[] objectArray2 = this.zzb;
        int n4 = this.zzg;
        System.arraycopy(objectArray2, 0, objectArray, 0, n4);
        return this.zzg;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final int zzc() {
        return 0;
    }

    public final zzdj zzd() {
        return this.zzg().zzh(0);
    }

    public final Object[] zze() {
        return this.zzb;
    }

    public final zzdd zzh() {
        Object[] objectArray = this.zzb;
        int n3 = this.zzg;
        return zzdd.zzg(objectArray, n3);
    }

    public final boolean zzk() {
        return true;
    }
}

