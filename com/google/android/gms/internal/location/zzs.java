/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;
import com.google.android.gms.internal.location.zzt;

public abstract class zzs
extends zzb
implements zzt {
    public zzs() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    return false;
                }
                n3 = parcel.readInt();
                Parcelable.Creator creator = PendingIntent.CREATOR;
                creator = (PendingIntent)zzc.zza(parcel, creator);
                zzc.zzd(parcel);
                this.zzd(n3, (PendingIntent)creator);
            } else {
                n3 = parcel.readInt();
                String[] stringArray = parcel.createStringArray();
                zzc.zzd(parcel);
                this.zzc(n3, stringArray);
            }
        } else {
            n3 = parcel.readInt();
            String[] stringArray = parcel.createStringArray();
            zzc.zzd(parcel);
            this.zzb(n3, stringArray);
        }
        return n7;
    }
}

