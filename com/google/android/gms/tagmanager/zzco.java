/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.gtm.zzar;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.internal.gtm.zzhf;
import com.google.android.gms.internal.gtm.zzhg;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzck;
import com.google.android.gms.tagmanager.zzcq;

public final class zzco
extends zzar
implements zzcq {
    public zzco(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    public final zzhg getService(IObjectWrapper iObjectWrapper, zzck object, zzcb zzcb2) {
        Parcel parcel = this.zza();
        zzat.zze(parcel, iObjectWrapper);
        zzat.zze(parcel, object);
        zzat.zze(parcel, zzcb2);
        iObjectWrapper = this.zzk(1, parcel);
        object = zzhf.zzb(iObjectWrapper.readStrongBinder());
        iObjectWrapper.recycle();
        return object;
    }
}

