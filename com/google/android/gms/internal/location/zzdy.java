/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzdr;
import com.google.android.gms.internal.location.zzdw;
import com.google.android.gms.internal.location.zzdx;
import com.google.android.gms.location.zzy;

final class zzdy
extends zzy {
    private final zzdr zza;

    public zzdy(zzdr zzdr2) {
        this.zza = zzdr2;
    }

    public final zzdy zzc(ListenerHolder listenerHolder) {
        this.zza.zzb(listenerHolder);
        return this;
    }

    public final void zzd(Location location) {
        ListenerHolder listenerHolder = this.zza.zza();
        zzdw zzdw2 = new zzdw(this, location);
        listenerHolder.notifyListener(zzdw2);
    }

    public final void zze() {
        ListenerHolder listenerHolder = this.zza.zza();
        zzdx zzdx2 = new zzdx(this);
        listenerHolder.notifyListener(zzdx2);
    }

    public final void zzf() {
        this.zza.zza().clear();
    }

    public final /* synthetic */ zzdr zzg() {
        return this.zza;
    }
}

