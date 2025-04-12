/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.JSONObject;

public final class zzs
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final long zzd;

    static {
        zzt zzt2 = new zzt();
        CREATOR = zzt2;
    }

    public zzs(int n3, int n4, String string2, long l2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = string2;
        this.zzd = l2;
    }

    public static zzs zza(JSONObject object) {
        int n3 = object.getInt("type_num");
        int n4 = object.getInt("precision_num");
        String string2 = object.getString("currency");
        long l2 = object.getLong("value");
        object = new zzs(n3, n4, string2, l2);
        return object;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        int n7 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        String string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        long l2 = this.zzd;
        SafeParcelWriter.writeLong(parcel, 4, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

