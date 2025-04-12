/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzag;
import com.google.android.gms.internal.consent_sdk.zzal;
import com.google.android.gms.internal.consent_sdk.zzar;
import com.google.android.gms.internal.consent_sdk.zzat;
import com.google.android.gms.internal.consent_sdk.zzaw;
import com.google.android.gms.internal.consent_sdk.zzbb;
import com.google.android.gms.internal.consent_sdk.zzbc;
import com.google.android.gms.internal.consent_sdk.zzbp;
import com.google.android.gms.internal.consent_sdk.zzbx;
import com.google.android.gms.internal.consent_sdk.zzcb;
import com.google.android.gms.internal.consent_sdk.zzdl;
import com.google.android.gms.internal.consent_sdk.zzdm;
import com.google.android.gms.internal.consent_sdk.zzdn;
import com.google.android.gms.internal.consent_sdk.zzdo;
import com.google.android.gms.internal.consent_sdk.zzdq;
import com.google.android.gms.internal.consent_sdk.zzdr;

final class zzam
implements zzaw {
    private final zzag zza;
    private final zzam zzb = this;
    private final zzdq zzc;
    private final zzdq zzd;
    private final zzdq zze;
    private final zzdq zzf;
    private final zzdq zzg;

    public /* synthetic */ zzam(zzag object, zzbp object2, zzal object3) {
        zzcb zzcb2;
        this.zza = object;
        object3 = zzag.zze((zzag)object);
        zzdn zzdn2 = new zzbx((zzdr)object3);
        this.zzc = object3 = zzdm.zzb(zzdn2);
        this.zzd = object2 = zzdo.zzb(object2);
        this.zze = zzdn2;
        zzdq zzdq2 = zzag.zze((zzag)object);
        Object object4 = zzar.zza();
        zzdq zzdq3 = zzat.zza();
        Object object5 = zzag.zzf((zzag)object);
        zzdq zzdq4 = zzag.zzh((zzag)object);
        zzdq zzdq5 = zzag.zzi((zzag)object);
        Object object6 = zzcb2;
        Object object7 = object3;
        zzcb2 = new zzcb(zzdq2, (zzdr)object3, (zzdr)object4, zzdq3, (zzdr)object5, zzdq4, zzdn2, zzdq5);
        this.zzf = zzcb2;
        object6 = zzar.zza();
        super((zzdr)object3, (zzdr)object6, zzcb2);
        this.zzg = zzdq4;
        zzdq2 = zzag.zze((zzag)object);
        object7 = zzag.zzg((zzag)object);
        zzdq3 = zzag.zzi((zzag)object);
        object6 = object;
        object4 = object3;
        object5 = object2;
        object = new zzbc(zzdq2, (zzdr)object7, (zzdr)object3, zzdq3, (zzdr)object2, zzdq4);
        object = zzdm.zzb((zzdq)object);
        zzdl.zzb(zzdn2, (zzdq)object);
    }

    public final zzbb zza() {
        return (zzbb)this.zze.zza();
    }
}

