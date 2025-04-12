/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzu;
import com.google.android.gms.location.zzw;

public abstract class zzv
extends zzb
implements zzw {
    public zzv() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzw zzb(IBinder iBinder) {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        boolean bl2 = iInterface instanceof zzw;
        if (bl2) {
            return (zzw)iInterface;
        }
        iInterface = new zzu(iBinder);
        return iInterface;
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                int n8 = 3;
                if (n3 != n8) {
                    return false;
                }
                this.zzf();
            } else {
                Object object = LocationAvailability.CREATOR;
                object = (LocationAvailability)zzc.zza(parcel, object);
                zzc.zzd(parcel);
                this.zze((LocationAvailability)object);
            }
        } else {
            Object object = LocationResult.CREATOR;
            object = (LocationResult)zzc.zza(parcel, object);
            zzc.zzd(parcel);
            this.zzd((LocationResult)object);
        }
        return n7;
    }
}

