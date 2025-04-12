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
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.internal.fido.zza;
import com.google.android.gms.internal.fido.zzc;
import com.google.android.gms.internal.fido.zze;
import com.google.android.gms.internal.fido.zzr;

public final class zzs
extends zza
implements IInterface {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    public final void zzc(zzr zzr2, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        Parcel parcel = this.zza();
        parcel.writeStrongBinder((IBinder)zzr2);
        zzc.zzd(parcel, publicKeyCredentialCreationOptions);
        this.zzb(1, parcel);
    }

    public final void zzd(zzr zzr2, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        Parcel parcel = this.zza();
        parcel.writeStrongBinder((IBinder)zzr2);
        zzc.zzd(parcel, publicKeyCredentialRequestOptions);
        this.zzb(2, parcel);
    }

    public final void zze(zze zze2) {
        Parcel parcel = this.zza();
        parcel.writeStrongBinder((IBinder)zze2);
        this.zzb(3, parcel);
    }
}

