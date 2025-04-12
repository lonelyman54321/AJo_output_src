/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzcbd;

public abstract class zzcbc
extends zzbae
implements zzcbd {
    public zzcbc() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    return false;
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbaf.zza(parcel, creator);
                zzbaf.zzc(parcel);
                this.zzc(string2, string3, (Bundle)creator);
            } else {
                String string4 = parcel.readString();
                zzbaf.zzc(parcel);
                this.zzb(string4);
            }
        } else {
            parcel.readString();
            parcel.readString();
            zzbaf.zzc(parcel);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

