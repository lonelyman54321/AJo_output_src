/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.internal.measurement.zzdq;

public abstract class zzdp
extends zzbx
implements zzdq {
    public zzdp() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 == n4) {
            Parcelable.Creator creator = Bundle.CREATOR;
            creator = (Bundle)zzbw.zza(parcel, creator);
            zzbw.zzb(parcel);
            this.zza((Bundle)creator);
            parcel2.writeNoException();
            return n4 != 0;
        }
        return false;
    }
}

