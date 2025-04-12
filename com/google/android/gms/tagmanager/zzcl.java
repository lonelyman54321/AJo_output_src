/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.gtm.zzar;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzck;
import com.google.android.gms.tagmanager.zzcn;

public final class zzcl
extends zzar
implements zzcn {
    public zzcl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerApi");
    }

    public final void initialize(IObjectWrapper iObjectWrapper, zzck zzck2, zzcb zzcb2) {
        Parcel parcel = this.zza();
        zzat.zze(parcel, iObjectWrapper);
        zzat.zze(parcel, zzck2);
        zzat.zze(parcel, zzcb2);
        this.zzl(1, parcel);
    }

    public final void preview(Intent intent, IObjectWrapper iObjectWrapper) {
        throw null;
    }

    public final void previewIntent(Intent intent, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, zzck zzck2, zzcb zzcb2) {
        Parcel parcel = this.zza();
        zzat.zzd(parcel, (Parcelable)intent);
        zzat.zze(parcel, iObjectWrapper);
        zzat.zze(parcel, iObjectWrapper2);
        zzat.zze(parcel, zzck2);
        zzat.zze(parcel, zzcb2);
        this.zzl(3, parcel);
    }
}

