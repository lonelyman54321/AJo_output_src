/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzdr;
import com.google.android.gms.internal.location.zzds;
import com.google.android.gms.internal.location.zzdt;
import com.google.android.gms.internal.location.zzdu;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzv;

final class zzdv
extends zzv {
    private final zzdr zza;

    public zzdv(zzdr zzdr2) {
        this.zza = zzdr2;
    }

    public final zzdv zzc(ListenerHolder listenerHolder) {
        this.zza.zzb(listenerHolder);
        return this;
    }

    public final void zzd(LocationResult locationResult) {
        ListenerHolder listenerHolder = this.zza.zza();
        zzds zzds2 = new zzds(this, locationResult);
        listenerHolder.notifyListener(zzds2);
    }

    public final void zze(LocationAvailability locationAvailability) {
        ListenerHolder listenerHolder = this.zza.zza();
        zzdt zzdt2 = new zzdt(this, locationAvailability);
        listenerHolder.notifyListener(zzdt2);
    }

    public final void zzf() {
        ListenerHolder listenerHolder = this.zza.zza();
        zzdu zzdu2 = new zzdu(this);
        listenerHolder.notifyListener(zzdu2);
    }

    public final void zzg() {
        this.zza.zza().clear();
    }

    public final /* synthetic */ zzdr zzh() {
        return this.zza;
    }
}

