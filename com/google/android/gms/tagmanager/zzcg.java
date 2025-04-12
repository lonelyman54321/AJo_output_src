/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.gtm.zzas;
import com.google.android.gms.internal.gtm.zzat;
import com.google.android.gms.tagmanager.zzch;

public abstract class zzcg
extends zzas
implements zzch {
    public zzcg() {
        super("com.google.android.gms.tagmanager.IMeasurementInterceptor");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 2;
        if (n3 == n4) {
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Parcelable.Creator creator2 = creator = zzat.zza(parcel, creator);
            creator2 = (Bundle)creator;
            long l2 = parcel.readLong();
            zzat.zzc(parcel);
            this.zze(string2, string3, (Bundle)creator2, l2);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

