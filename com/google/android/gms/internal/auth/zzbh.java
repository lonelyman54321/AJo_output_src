/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzbg;
import com.google.android.gms.internal.auth.zzc;

public final class zzbh
extends zza
implements IInterface {
    public zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbg2) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, zzbg2);
        this.zzc(3, parcel);
    }

    public final void zze(zzbg zzbg2, ProxyRequest proxyRequest) {
        Parcel parcel = this.zza();
        zzc.zze(parcel, zzbg2);
        zzc.zzd(parcel, proxyRequest);
        this.zzc(1, parcel);
    }
}

