/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.os.Handler
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import com.google.android.gms.internal.consent_sdk.zzaa;
import com.google.android.gms.internal.consent_sdk.zzab;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.gms.internal.consent_sdk.zzdn;
import com.google.android.gms.internal.consent_sdk.zzdp;
import com.google.android.gms.internal.consent_sdk.zzdr;
import com.google.android.gms.internal.consent_sdk.zze;
import com.google.android.gms.internal.consent_sdk.zzl;
import com.google.android.gms.internal.consent_sdk.zzo;
import com.google.android.gms.internal.consent_sdk.zzu;
import com.google.android.gms.internal.consent_sdk.zzx;
import java.util.concurrent.Executor;

public final class zzv
implements zzdn {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;
    private final zzdr zzh;
    private final zzdr zzi;

    public zzv(zzdr zzdr2, zzdr zzdr3, zzdr zzdr4, zzdr zzdr5, zzdr zzdr6, zzdr zzdr7, zzdr zzdr8, zzdr zzdr9, zzdr zzdr10) {
        this.zza = zzdr2;
        this.zzb = zzdr3;
        this.zzc = zzdr4;
        this.zzd = zzdr5;
        this.zze = zzdr6;
        this.zzf = zzdr7;
        this.zzg = zzdr8;
        this.zzh = zzdr9;
        this.zzi = zzdr10;
    }

    public final zzu zzb() {
        Object object;
        Object object2 = object = this.zza.zza();
        object2 = (Application)object;
        Object object3 = object = this.zzb.zza();
        object3 = (zzab)object;
        Handler handler = zzcr.zza;
        zzdp.zza(handler);
        Executor executor = zzcr.zzb;
        zzdp.zza(executor);
        Object object4 = object = this.zze.zza();
        object4 = (zzap)object;
        Object object5 = object = this.zzf.zza();
        object5 = (zzbn)object;
        zzl zzl2 = ((zzo)this.zzg).zzb();
        zzx zzx2 = ((zzaa)this.zzh).zzb();
        Object object6 = object = this.zzi.zza();
        object6 = (zze)object;
        object = new zzu((Application)object2, (zzab)object3, handler, executor, (zzap)object4, (zzbn)object5, zzl2, zzx2, (zze)object6);
        return object;
    }
}

