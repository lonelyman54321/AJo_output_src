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
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbnf;

public abstract class zzbne
extends zzbae
implements zzbnf {
    public zzbne() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    public final boolean zzdF(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 == n7) {
            Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
            creator = (ParcelFileDescriptor)zzbaf.zza(parcel, creator);
            zzbaf.zzc(parcel);
            this.zzb((ParcelFileDescriptor)creator);
            return n7;
        }
        return false;
    }
}

