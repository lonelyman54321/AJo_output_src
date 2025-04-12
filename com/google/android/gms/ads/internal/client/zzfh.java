/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzfi;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzfh
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;

    static {
        zzfi zzfi2 = new zzfi();
        CREATOR = zzfi2;
    }

    public zzfh(SearchAdRequest object) {
        this.zza = object = ((SearchAdRequest)object).getQuery();
    }

    public zzfh(String string2) {
        this.zza = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 15, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

