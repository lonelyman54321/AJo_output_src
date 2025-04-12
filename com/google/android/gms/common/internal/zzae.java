/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzae
extends zza
implements zzag {
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final zzq zze(zzo zzo2) {
        Object object = this.zza();
        zzc.zzc(object, zzo2);
        zzo2 = this.zzB(6, (Parcel)object);
        object = zzq.CREATOR;
        object = (zzq)zzc.zza((Parcel)zzo2, (Parcelable.Creator)object);
        zzo2.recycle();
        return object;
    }

    public final zzq zzf(zzo zzo2) {
        Object object = this.zza();
        zzc.zzc(object, zzo2);
        zzo2 = this.zzB(8, (Parcel)object);
        object = zzq.CREATOR;
        object = (zzq)zzc.zza((Parcel)zzo2, (Parcelable.Creator)object);
        zzo2.recycle();
        return object;
    }

    public final boolean zzg() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzB(9, parcel);
        boolean bl2 = zzc.zzf(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzh(zzs zzs2, IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzc.zzc(parcel, zzs2);
        zzc.zze(parcel, iObjectWrapper);
        zzs2 = this.zzB(5, parcel);
        boolean bl2 = zzc.zzf((Parcel)zzs2);
        zzs2.recycle();
        return bl2;
    }

    public final boolean zzi() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzB(7, parcel);
        boolean bl2 = zzc.zzf(parcel2);
        parcel2.recycle();
        return bl2;
    }
}

