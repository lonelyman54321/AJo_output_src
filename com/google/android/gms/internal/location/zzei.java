/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.location.zzeg;
import com.google.android.gms.internal.location.zzej;
import com.google.android.gms.internal.location.zzr;
import com.google.android.gms.location.zzv;
import com.google.android.gms.location.zzw;
import com.google.android.gms.location.zzy;
import com.google.android.gms.location.zzz;

public final class zzei
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zza;
    private final zzeg zzb;
    private final zzz zzc;
    private final zzw zzd;
    private final PendingIntent zze;
    private final zzr zzf;
    private final String zzg;

    static {
        zzej zzej2 = new zzej();
        CREATOR = zzej2;
    }

    public zzei(int n3, zzeg object, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String string2) {
        boolean bl2;
        this.zza = n3;
        this.zzb = object;
        n3 = 0;
        IInterface iInterface = null;
        if (iBinder != null) {
            object = zzy.zzb(iBinder);
        } else {
            bl2 = false;
            object = null;
        }
        this.zzc = object;
        this.zze = pendingIntent;
        if (iBinder2 != null) {
            object = zzv.zzb(iBinder2);
        } else {
            bl2 = false;
            object = null;
        }
        this.zzd = object;
        if (iBinder3 != null) {
            iInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            bl2 = iInterface instanceof zzr;
            if (bl2) {
                iInterface = (zzr)iInterface;
            } else {
                super(iBinder3);
            }
        }
        this.zzf = iInterface;
        this.zzg = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zza;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        Object object = this.zzb;
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)object, n3, false);
        object = this.zzc;
        IBinder iBinder = null;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            object = object.asBinder();
        }
        int n8 = 3;
        SafeParcelWriter.writeIBinder(parcel, n8, (IBinder)object, false);
        n4 = 4;
        PendingIntent pendingIntent = this.zze;
        SafeParcelWriter.writeParcelable(parcel, n4, (Parcelable)pendingIntent, n3, false);
        Object object2 = this.zzd;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = object2.asBinder();
        }
        n4 = 5;
        SafeParcelWriter.writeIBinder(parcel, n4, (IBinder)object2, false);
        object2 = this.zzf;
        if (object2 != null) {
            iBinder = object2.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinder, false);
        object = this.zzg;
        SafeParcelWriter.writeString(parcel, 8, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

