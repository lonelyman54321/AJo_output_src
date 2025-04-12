/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbzp;

public final class zzbzo
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;

    static {
        zzbzp zzbzp2 = new zzbzp();
        CREATOR = zzbzp2;
    }

    public zzbzo(ServerSideVerificationOptions object) {
        String string2 = ((ServerSideVerificationOptions)object).getUserId();
        object = ((ServerSideVerificationOptions)object).getCustomData();
        this(string2, (String)object);
    }

    public zzbzo(String string2, String string3) {
        this.zza = string2;
        this.zzb = string3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        String string3 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

