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
import com.google.android.gms.internal.location.zzef;
import com.google.android.gms.internal.location.zzz;
import com.google.android.gms.location.zzw;

public final class zzee
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zza;
    private final IBinder zzb;
    private final IBinder zzc;
    private final PendingIntent zzd;
    private final String zze;

    static {
        zzef zzef2 = new zzef();
        CREATOR = zzef2;
    }

    public zzee(int n3, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String string2) {
        this.zza = n3;
        this.zzb = iBinder;
        this.zzc = iBinder2;
        this.zzd = pendingIntent;
        this.zze = string2;
    }

    public static zzee zza(IInterface iInterface, com.google.android.gms.location.zzz zzz2, String string2) {
        if (iInterface == null) {
            iInterface = null;
        }
        zzee zzee2 = new zzee(1, (IBinder)iInterface, (IBinder)zzz2, null, string2);
        return zzee2;
    }

    public static zzee zzb(IInterface iInterface, zzw zzw2, String string2) {
        if (iInterface == null) {
            iInterface = null;
        }
        zzee zzee2 = new zzee(2, (IBinder)iInterface, (IBinder)zzw2, null, string2);
        return zzee2;
    }

    public static zzee zzc(PendingIntent pendingIntent) {
        zzee zzee2 = new zzee(3, null, null, pendingIntent, null);
        return zzee2;
    }

    public static zzee zzd(zzz zzz2) {
        zzee zzee2 = new zzee(4, null, (IBinder)zzz2, null, null);
        return zzee2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zza;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        Object object = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, object, false);
        IBinder iBinder = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, iBinder, false);
        iBinder = this.zzd;
        SafeParcelWriter.writeParcelable(parcel, 4, (Parcelable)iBinder, n3, false);
        object = this.zze;
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

