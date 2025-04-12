/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.internal.fido.zza;
import com.google.android.gms.internal.fido.zzc;
import com.google.android.gms.internal.fido.zze;
import com.google.android.gms.internal.fido.zzg;
import com.google.android.gms.internal.fido.zzm;

public final class zzn
extends zza
implements IInterface {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    public final void zzc(zzg zzg2, String string2) {
        Parcel parcel = this.zza();
        parcel.writeStrongBinder((IBinder)zzg2);
        parcel.writeString(string2);
        this.zzb(4, parcel);
    }

    public final void zzd(zzm zzm2, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) {
        Parcel parcel = this.zza();
        parcel.writeStrongBinder((IBinder)zzm2);
        zzc.zzd(parcel, browserPublicKeyCredentialCreationOptions);
        this.zzb(1, parcel);
    }

    public final void zze(zzm zzm2, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) {
        Parcel parcel = this.zza();
        parcel.writeStrongBinder((IBinder)zzm2);
        zzc.zzd(parcel, browserPublicKeyCredentialRequestOptions);
        this.zzb(2, parcel);
    }

    public final void zzf(zze zze2) {
        Parcel parcel = this.zza();
        parcel.writeStrongBinder((IBinder)zze2);
        this.zzb(3, parcel);
    }
}

