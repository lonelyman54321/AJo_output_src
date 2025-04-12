/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzn
implements Parcelable.Creator {
    public static void zza(GetServiceRequest object, Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int bl2 = ((GetServiceRequest)object).zzc;
        SafeParcelWriter.writeInt(parcel, 1, bl2);
        int n7 = ((GetServiceRequest)object).zzd;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        n7 = ((GetServiceRequest)object).zze;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        String string2 = ((GetServiceRequest)object).zzf;
        SafeParcelWriter.writeString(parcel, 4, string2, false);
        Parcelable[] parcelableArray = ((GetServiceRequest)object).zzg;
        SafeParcelWriter.writeIBinder(parcel, 5, (IBinder)parcelableArray, false);
        parcelableArray = ((GetServiceRequest)object).zzh;
        SafeParcelWriter.writeTypedArray(parcel, 6, parcelableArray, n3, false);
        parcelableArray = ((GetServiceRequest)object).zzi;
        SafeParcelWriter.writeBundle(parcel, 7, (Bundle)parcelableArray, false);
        parcelableArray = ((GetServiceRequest)object).zzj;
        SafeParcelWriter.writeParcelable(parcel, 8, (Parcelable)parcelableArray, n3, false);
        parcelableArray = ((GetServiceRequest)object).zzk;
        SafeParcelWriter.writeTypedArray(parcel, 10, parcelableArray, n3, false);
        parcelableArray = ((GetServiceRequest)object).zzl;
        SafeParcelWriter.writeTypedArray(parcel, 11, parcelableArray, n3, false);
        boolean bl3 = ((GetServiceRequest)object).zzm;
        SafeParcelWriter.writeBoolean(parcel, 12, bl3);
        int n8 = ((GetServiceRequest)object).zzn;
        SafeParcelWriter.writeInt(parcel, 13, n8);
        boolean bl4 = ((GetServiceRequest)object).zzo;
        SafeParcelWriter.writeBoolean(parcel, 14, bl4);
        object = ((GetServiceRequest)object).getAttributionTag();
        SafeParcelWriter.writeString(parcel, 15, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final /* synthetic */ Object[] newArray(int n3) {
        return new GetServiceRequest[n3];
    }
}

