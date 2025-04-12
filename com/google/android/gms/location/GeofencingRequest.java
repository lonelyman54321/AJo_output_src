/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzp;
import java.util.ArrayList;
import java.util.List;

public class GeofencingRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final List zza;
    private final int zzb;
    private final String zzc;

    static {
        zzp zzp2 = new zzp();
        CREATOR = zzp2;
    }

    public GeofencingRequest(List list, int n3, String string2) {
        this.zza = list;
        this.zzb = n3;
        this.zzc = string2;
    }

    public List getGeofences() {
        List list = this.zza;
        ArrayList arrayList = new ArrayList(list);
        return arrayList;
    }

    public int getInitialTrigger() {
        return this.zzb;
    }

    public String toString() {
        String string2 = String.valueOf(this.zza);
        int n3 = string2.length();
        int n4 = this.zzb;
        int n7 = String.valueOf(n4).length();
        n3 = n3 + 45 + n7;
        StringBuilder stringBuilder = new StringBuilder(++n3);
        stringBuilder.append("GeofencingRequest[geofences=");
        stringBuilder.append(string2);
        stringBuilder.append(", initialTrigger=");
        stringBuilder.append(n4);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        List list = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        int n7 = this.getInitialTrigger();
        SafeParcelWriter.writeInt(parcel, 2, n7);
        String string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 4, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

