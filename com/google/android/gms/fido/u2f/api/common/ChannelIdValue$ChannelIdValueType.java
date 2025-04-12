/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.zza;

public final class ChannelIdValue$ChannelIdValueType
extends Enum
implements Parcelable {
    public static final /* enum */ ChannelIdValue$ChannelIdValueType ABSENT;
    public static final Parcelable.Creator CREATOR;
    public static final /* enum */ ChannelIdValue$ChannelIdValueType OBJECT;
    public static final /* enum */ ChannelIdValue$ChannelIdValueType STRING;
    private static final /* synthetic */ ChannelIdValue$ChannelIdValueType[] zza;
    private final int zzb;

    static {
        ChannelIdValue$ChannelIdValueType channelIdValue$ChannelIdValueType;
        ChannelIdValue$ChannelIdValueType channelIdValue$ChannelIdValueType2;
        Object object;
        ABSENT = object = new ChannelIdValue$ChannelIdValueType("ABSENT", 0, 0);
        int n3 = 1;
        STRING = channelIdValue$ChannelIdValueType2 = new ChannelIdValue$ChannelIdValueType("STRING", n3, n3);
        int n4 = 2;
        OBJECT = channelIdValue$ChannelIdValueType = new ChannelIdValue$ChannelIdValueType("OBJECT", n4, n4);
        ChannelIdValue$ChannelIdValueType[] channelIdValue$ChannelIdValueTypeArray = new ChannelIdValue$ChannelIdValueType[3];
        channelIdValue$ChannelIdValueTypeArray[0] = object;
        channelIdValue$ChannelIdValueTypeArray[n3] = channelIdValue$ChannelIdValueType2;
        channelIdValue$ChannelIdValueTypeArray[n4] = channelIdValue$ChannelIdValueType;
        zza = channelIdValue$ChannelIdValueTypeArray;
        object = new zza();
        CREATOR = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ChannelIdValue$ChannelIdValueType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static ChannelIdValue$ChannelIdValueType valueOf(String string2) {
        return Enum.valueOf(ChannelIdValue$ChannelIdValueType.class, string2);
    }

    public static ChannelIdValue$ChannelIdValueType[] values() {
        return (ChannelIdValue$ChannelIdValueType[])zza.clone();
    }

    public static /* bridge */ /* synthetic */ int zza(ChannelIdValue$ChannelIdValueType channelIdValue$ChannelIdValueType) {
        return channelIdValue$ChannelIdValueType.zzb;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zzb;
        parcel.writeInt(n3);
    }
}

