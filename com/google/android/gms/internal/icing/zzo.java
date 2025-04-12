/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.icing.zzp;
import java.util.List;

public final class zzo
extends AbstractSafeParcelable
implements Result {
    public static final Parcelable.Creator CREATOR;
    public Status zza;
    public List zzb;
    public String[] zzc;

    static {
        zzp zzp2 = new zzp();
        CREATOR = zzp2;
    }

    public zzo() {
    }

    public zzo(Status status, List list, String[] stringArray) {
        this.zza = status;
        this.zzb = list;
        this.zzc = stringArray;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String[] stringArray = this.zza;
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)stringArray, n3, false);
        stringArray = this.zzb;
        SafeParcelWriter.writeTypedList(parcel, 2, (List)stringArray, false);
        stringArray = this.zzc;
        SafeParcelWriter.writeStringArray(parcel, 3, stringArray, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

