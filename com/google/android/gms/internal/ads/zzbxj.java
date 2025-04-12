/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbxk;

public abstract class zzbxj
extends zzbae
implements zzbxk {
    public zzbxj() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                return false;
            }
            Object object = zzbb.CREATOR;
            object = (zzbb)zzbaf.zza(parcel, object);
            zzbaf.zzc(parcel);
            this.zze((zzbb)object);
        } else {
            Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
            creator = (ParcelFileDescriptor)zzbaf.zza(parcel, creator);
            zzbaf.zzc(parcel);
            this.zzf((ParcelFileDescriptor)creator);
        }
        parcel2.writeNoException();
        return n4 != 0;
    }
}

