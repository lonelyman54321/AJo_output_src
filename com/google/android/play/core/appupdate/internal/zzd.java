/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.appupdate.internal.zza;
import com.google.android.play.core.appupdate.internal.zzc;
import com.google.android.play.core.appupdate.internal.zzf;
import com.google.android.play.core.appupdate.internal.zzh;

public final class zzd
extends zza
implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    public final void zzc(String string2, Bundle bundle, zzh zzh2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        zzc.zzc(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)zzh2);
        this.zzb(3, parcel);
    }

    public final void zzd(String string2, Bundle bundle, zzh zzh2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        zzc.zzc(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)zzh2);
        this.zzb(2, parcel);
    }
}

