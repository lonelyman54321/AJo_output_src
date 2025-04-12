/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class zzac
extends zzb
implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    return false;
                }
                n3 = parcel.readInt();
                IBinder iBinder = parcel.readStrongBinder();
                Object object = zzk.CREATOR;
                object = (zzk)zzc.zza(parcel, object);
                zzc.zzb(parcel);
                this.zzc(n3, iBinder, (zzk)object);
            } else {
                n3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzc.zza(parcel, creator);
                zzc.zzb(parcel);
                this.zzb(n3, (Bundle)creator);
            }
        } else {
            n3 = parcel.readInt();
            IBinder iBinder = parcel.readStrongBinder();
            Parcelable.Creator creator = Bundle.CREATOR;
            creator = (Bundle)zzc.zza(parcel, creator);
            zzc.zzb(parcel);
            this.onPostInitComplete(n3, iBinder, (Bundle)creator);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

