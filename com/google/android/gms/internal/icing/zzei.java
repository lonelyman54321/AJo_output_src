/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcn;
import com.google.android.gms.internal.icing.zzcq;
import com.google.android.gms.internal.icing.zzee;
import com.google.android.gms.internal.icing.zzep;
import com.google.android.gms.internal.icing.zzer;
import com.google.android.gms.internal.icing.zzfd;

final class zzei
implements zzep {
    private final zzee zza;
    private final zzfd zzb;
    private final boolean zzc;
    private final zzcq zzd;

    private zzei(zzfd zzfd2, zzcq zzcq2, zzee zzee2) {
        boolean bl2;
        this.zzb = zzfd2;
        this.zzc = bl2 = zzcq2.zza(zzee2);
        this.zzd = zzcq2;
        this.zza = zzee2;
    }

    public static zzei zzg(zzfd zzfd2, zzcq zzcq2, zzee zzee2) {
        zzei zzei2 = new zzei(zzfd2, zzcq2, zzee2);
        return zzei2;
    }

    public final boolean zza(Object object, Object object2) {
        Object object3;
        Object object4 = this.zzb.zzb(object);
        boolean bl2 = object4.equals(object3 = this.zzb.zzb(object2));
        if (!bl2) {
            return false;
        }
        bl2 = this.zzc;
        if (!bl2) {
            return true;
        }
        this.zzd.zzb(object);
        this.zzd.zzb(object2);
        throw null;
    }

    public final int zzb(Object object) {
        Object object2 = this.zzb.zzb(object);
        int n3 = object2.hashCode();
        boolean bl2 = this.zzc;
        if (!bl2) {
            return n3;
        }
        this.zzd.zzb(object);
        throw null;
    }

    public final void zzc(Object object, Object object2) {
        Object object3 = this.zzb;
        zzer.zzF((zzfd)object3, object, object2);
        boolean bl2 = this.zzc;
        if (bl2) {
            object3 = this.zzd;
            zzer.zzE((zzcq)object3, object, object2);
        }
    }

    public final int zzd(Object object) {
        zzfd zzfd2 = this.zzb;
        Object object2 = zzfd2.zzb(object);
        int n3 = zzfd2.zze(object2);
        boolean bl2 = this.zzc;
        if (!bl2) {
            return n3;
        }
        this.zzd.zzb(object);
        throw null;
    }

    public final void zze(Object object) {
        this.zzb.zzc(object);
        this.zzd.zzc(object);
    }

    public final boolean zzf(Object object) {
        this.zzd.zzb(object);
        throw null;
    }

    public final void zzi(Object object, zzcn zzcn2) {
        this.zzd.zzb(object);
        throw null;
    }
}

