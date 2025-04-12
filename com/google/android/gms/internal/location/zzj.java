/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.location.zzh;
import com.google.android.gms.internal.location.zzk;
import com.google.android.gms.internal.location.zzr;
import com.google.android.gms.location.zzs;
import com.google.android.gms.location.zzt;

public final class zzj
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    final zzh zzb;
    final zzt zzc;
    final zzr zzd;

    static {
        zzk zzk2 = new zzk();
        CREATOR = zzk2;
    }

    public zzj(int n3, zzh object, IBinder iBinder, IBinder iBinder2) {
        boolean bl2;
        this.zza = n3;
        this.zzb = object;
        n3 = 0;
        IInterface iInterface = null;
        if (iBinder == null) {
            bl2 = false;
            object = null;
        } else {
            object = zzs.zzb(iBinder);
        }
        this.zzc = object;
        if (iBinder2 != null) {
            iInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            bl2 = iInterface instanceof zzr;
            if (bl2) {
                iInterface = (zzr)iInterface;
            } else {
                super(iBinder2);
            }
        }
        this.zzd = iInterface;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n7);
        zzh zzh2 = this.zzb;
        n7 = 2;
        SafeParcelWriter.writeParcelable(parcel, n7, zzh2, n3, false);
        Object object = this.zzc;
        zzh2 = null;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            object = object.asBinder();
        }
        n7 = 3;
        SafeParcelWriter.writeIBinder(parcel, n7, (IBinder)object, false);
        object = this.zzd;
        if (object != null) {
            zzh2 = object.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 4, (IBinder)zzh2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

