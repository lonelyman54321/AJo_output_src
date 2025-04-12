/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzoo;
import java.util.ArrayList;
import java.util.List;

public final class zzop
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List zza;

    static {
        zzoo zzoo2 = new zzoo();
        CREATOR = zzoo2;
    }

    public zzop(List list) {
        this.zza = list;
    }

    public static zzop zza(zzlu ... object) {
        int n3 = ((zzlu[])object).length;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(n3);
        n3 = ((zzlu[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = object[i3].zza();
            Integer n7 = n4;
            arrayList.add(n7);
        }
        object = new zzop(arrayList);
        return object;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        List list = this.zza;
        SafeParcelWriter.writeIntegerList(parcel, 1, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

