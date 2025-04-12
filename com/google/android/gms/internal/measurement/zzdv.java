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
import com.google.android.gms.internal.measurement.zzdw;

public abstract class zzdv
extends zzbx
implements zzdw {
    public zzdv() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                return false;
            }
            n3 = this.zza();
            parcel2.writeNoException();
            parcel2.writeInt(n3);
        } else {
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Parcelable.Creator creator2 = creator = zzbw.zza(parcel, creator);
            creator2 = (Bundle)creator;
            long l2 = parcel.readLong();
            zzbw.zzb(parcel);
            this.zza(string2, string3, (Bundle)creator2, l2);
            parcel2.writeNoException();
        }
        return n4 != 0;
    }
}

