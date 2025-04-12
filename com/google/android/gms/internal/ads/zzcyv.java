/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzcyn;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcyu;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfho;

public final class zzcyv {
    private final Context zza;
    private final zzfho zzb;
    private final Bundle zzc;
    private final zzfhg zzd;
    private final zzcyn zze;
    private final zzehq zzf;

    public /* synthetic */ zzcyv(zzcyt object, zzcyu object2) {
        object2 = zzcyt.zza((zzcyt)object);
        this.zza = object2;
        this.zzb = object2 = zzcyt.zzm((zzcyt)object);
        object2 = zzcyt.zzb((zzcyt)object);
        this.zzc = object2;
        this.zzd = object2 = zzcyt.zzl((zzcyt)object);
        this.zze = object2 = zzcyt.zzc((zzcyt)object);
        this.zzf = object = zzcyt.zzk((zzcyt)object);
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    public final Bundle zzb() {
        return this.zzc;
    }

    public final zzcyn zzc() {
        return this.zze;
    }

    public final zzcyt zzd() {
        zzcyt zzcyt2 = new zzcyt();
        Object object = this.zza;
        zzcyt2.zze((Context)object);
        object = this.zzb;
        zzcyt2.zzi((zzfho)object);
        object = this.zzc;
        zzcyt2.zzf((Bundle)object);
        object = this.zze;
        zzcyt2.zzg((zzcyn)object);
        object = this.zzf;
        zzcyt2.zzd((zzehq)object);
        return zzcyt2;
    }

    public final zzehq zze(String string2) {
        zzehq zzehq2 = this.zzf;
        if (zzehq2 != null) {
            return zzehq2;
        }
        zzehq2 = new zzehq(string2);
        return zzehq2;
    }

    public final zzfhg zzf() {
        return this.zzd;
    }

    public final zzfho zzg() {
        return this.zzb;
    }
}

