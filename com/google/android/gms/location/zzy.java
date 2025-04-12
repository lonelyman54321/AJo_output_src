/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.location.zzx;
import com.google.android.gms.location.zzz;

public abstract class zzy
extends zzb
implements zzz {
    public zzy() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static zzz zzb(IBinder iBinder) {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        boolean bl2 = iInterface instanceof zzz;
        if (bl2) {
            return (zzz)iInterface;
        }
        iInterface = new zzx(iBinder);
        return iInterface;
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            int n8 = 2;
            if (n3 != n8) {
                return false;
            }
            this.zze();
        } else {
            Parcelable.Creator creator = Location.CREATOR;
            creator = (Location)zzc.zza(parcel, creator);
            zzc.zzd(parcel);
            this.zzd((Location)creator);
        }
        return n7;
    }
}

