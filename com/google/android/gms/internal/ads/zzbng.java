/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnf;

public final class zzbng
extends zzbad
implements IInterface {
    public zzbng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbna zzbna2, zzbnf zzbnf2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzbna2);
        zzbaf.zzf(parcel, zzbnf2);
        this.zzdd(2, parcel);
    }
}

