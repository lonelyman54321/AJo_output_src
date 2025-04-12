/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzdme;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzepn;
import com.google.android.gms.internal.ads.zzepp;
import com.google.android.gms.internal.ads.zzeps;
import com.google.android.gms.internal.ads.zzepz;
import com.google.android.gms.internal.ads.zzfhm;

public final class zzeog
extends zzbm {
    private final zzepn zza;

    public zzeog(Context object, zzcjd object2, zzfhm zzfhm2, zzdme object3, zzbh zzbh2) {
        zzdvc zzdvc2 = ((zzcjd)object2).zzj();
        zzepp zzepp2 = new zzepp((zzdme)object3, zzdvc2);
        zzepp2.zze(zzbh2);
        object3 = new zzepz((zzcjd)object2, (Context)object, zzepp2, zzfhm2);
        object2 = zzfhm2.zzL();
        super((zzeps)object3, (String)object2);
        this.zza = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zze() {
        synchronized (this) {
            zzepn zzepn2 = this.zza;
            return zzepn2.zza();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzf() {
        synchronized (this) {
            zzepn zzepn2 = this.zza;
            return zzepn2.zzb();
        }
    }

    public final void zzg(zzl zzl2) {
        this.zza.zzd(zzl2, 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(zzl zzl2, int n3) {
        synchronized (this) {
            zzepn zzepn2 = this.zza;
            zzepn2.zzd(zzl2, n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzi() {
        synchronized (this) {
            zzepn zzepn2 = this.zza;
            return zzepn2.zze();
        }
    }
}

