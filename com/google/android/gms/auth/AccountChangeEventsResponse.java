/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.zzc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public class AccountChangeEventsResponse
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    final List zzb;

    static {
        zzc zzc2 = new zzc();
        CREATOR = zzc2;
    }

    public AccountChangeEventsResponse(int n3, List list) {
        List list2;
        this.zza = n3;
        this.zzb = list2 = (List)Preconditions.checkNotNull(list);
    }

    public AccountChangeEventsResponse(List list) {
        this.zza = 1;
        this.zzb = list = (List)Preconditions.checkNotNull(list);
    }

    public List getEvents() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        List list = this.zzb;
        SafeParcelWriter.writeTypedList(parcel, 2, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

