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
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.internal.fido.zza;
import com.google.android.gms.internal.fido.zzc;
import com.google.android.gms.internal.fido.zzv;

public final class zzw
extends zza
implements IInterface {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    public final void zzc(zzv zzv2, RegisterRequestParams registerRequestParams) {
        Parcel parcel = this.zza();
        parcel.writeStrongBinder((IBinder)zzv2);
        zzc.zzd(parcel, registerRequestParams);
        this.zzb(1, parcel);
    }

    public final void zzd(zzv zzv2, SignRequestParams signRequestParams) {
        Parcel parcel = this.zza();
        parcel.writeStrongBinder((IBinder)zzv2);
        zzc.zzd(parcel, signRequestParams);
        this.zzb(2, parcel);
    }
}

