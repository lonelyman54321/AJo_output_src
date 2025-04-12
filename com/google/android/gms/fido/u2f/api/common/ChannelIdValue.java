/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue$UnsupportedChannelIdValueTypeException;
import com.google.android.gms.fido.u2f.api.common.zzb;
import org.json.JSONException;
import org.json.JSONObject;

public class ChannelIdValue
extends AbstractSafeParcelable {
    public static final ChannelIdValue ABSENT;
    public static final Parcelable.Creator CREATOR;
    public static final ChannelIdValue UNAVAILABLE;
    public static final ChannelIdValue UNUSED;
    private final ChannelIdValue$ChannelIdValueType zza;
    private final String zzb;
    private final String zzc;

    static {
        Object object = new zzb();
        CREATOR = object;
        ABSENT = object = new ChannelIdValue();
        UNAVAILABLE = object = new ChannelIdValue("unavailable");
        UNUSED = object = new ChannelIdValue("unused");
    }

    private ChannelIdValue() {
        ChannelIdValue$ChannelIdValueType channelIdValue$ChannelIdValueType;
        this.zza = channelIdValue$ChannelIdValueType = ChannelIdValue$ChannelIdValueType.ABSENT;
        this.zzc = null;
        this.zzb = null;
    }

    public ChannelIdValue(int n3, String object, String string2) {
        ChannelIdValue$ChannelIdValueType channelIdValue$ChannelIdValueType;
        try {
            channelIdValue$ChannelIdValueType = ChannelIdValue.toChannelIdValueType(n3);
        }
        catch (ChannelIdValue$UnsupportedChannelIdValueTypeException channelIdValue$UnsupportedChannelIdValueTypeException) {
            object = new IllegalArgumentException(channelIdValue$UnsupportedChannelIdValueTypeException);
            throw object;
        }
        this.zza = channelIdValue$ChannelIdValueType;
        this.zzb = object;
        this.zzc = string2;
    }

    private ChannelIdValue(String object) {
        this.zzb = object = (String)Preconditions.checkNotNull(object);
        object = ChannelIdValue$ChannelIdValueType.STRING;
        this.zza = object;
        this.zzc = null;
    }

    public ChannelIdValue(JSONObject object) {
        object = (String)Preconditions.checkNotNull(object.toString());
        this.zzc = object;
        object = ChannelIdValue$ChannelIdValueType.OBJECT;
        this.zza = object;
        this.zzb = null;
    }

    public static ChannelIdValue$ChannelIdValueType toChannelIdValueType(int n3) {
        for (ChannelIdValue$ChannelIdValueType channelIdValue$ChannelIdValueType : ChannelIdValue$ChannelIdValueType.values()) {
            int n4 = ChannelIdValue$ChannelIdValueType.zza(channelIdValue$ChannelIdValueType);
            if (n3 != n4) continue;
            return channelIdValue$ChannelIdValueType;
        }
        ChannelIdValue$UnsupportedChannelIdValueTypeException channelIdValue$UnsupportedChannelIdValueTypeException = new ChannelIdValue$UnsupportedChannelIdValueTypeException(n3);
        throw channelIdValue$UnsupportedChannelIdValueTypeException;
    }

    public boolean equals(Object object) {
        int n3 = 1;
        if (this == object) {
            return n3 != 0;
        }
        boolean n4 = object instanceof ChannelIdValue;
        if (!n4) {
            return false;
        }
        object = (ChannelIdValue)object;
        ChannelIdValue$ChannelIdValueType channelIdValue$ChannelIdValueType = this.zza;
        ChannelIdValue$ChannelIdValueType channelIdValue$ChannelIdValueType2 = ((ChannelIdValue)object).zza;
        boolean bl2 = ((Object)((Object)channelIdValue$ChannelIdValueType)).equals((Object)channelIdValue$ChannelIdValueType2);
        if (!bl2) {
            return false;
        }
        channelIdValue$ChannelIdValueType = this.zza;
        int n7 = channelIdValue$ChannelIdValueType.ordinal();
        if (n7 != 0) {
            if (n7 != n3) {
                n3 = 2;
                if (n7 != n3) {
                    return false;
                }
                String string2 = this.zzc;
                object = ((ChannelIdValue)object).zzc;
                return string2.equals(object);
            }
            String string3 = this.zzb;
            object = ((ChannelIdValue)object).zzb;
            return string3.equals(object);
        }
        return n3 != 0;
    }

    public JSONObject getObjectValue() {
        Object object;
        String string2 = this.zzc;
        if (string2 == null) {
            return null;
        }
        try {
            object = this.zzc;
        }
        catch (JSONException jSONException) {
            object = new RuntimeException(jSONException);
            throw object;
        }
        string2 = new JSONObject((String)object);
        return string2;
    }

    public String getObjectValueAsString() {
        return this.zzc;
    }

    public String getStringValue() {
        return this.zzb;
    }

    public ChannelIdValue$ChannelIdValueType getType() {
        return this.zza;
    }

    public int getTypeAsInt() {
        return ChannelIdValue$ChannelIdValueType.zza(this.zza);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int hashCode() {
        int n3;
        ChannelIdValue$ChannelIdValueType channelIdValue$ChannelIdValueType = this.zza;
        int n4 = ((Object)((Object)channelIdValue$ChannelIdValueType)).hashCode() + 31;
        ChannelIdValue$ChannelIdValueType channelIdValue$ChannelIdValueType2 = this.zza;
        int n7 = channelIdValue$ChannelIdValueType2.ordinal();
        if (n7 != (n3 = 1)) {
            n3 = 2;
            if (n7 != n3) {
                return n4;
            }
            n4 *= 31;
            String string2 = this.zzc;
            n7 = string2.hashCode();
            return n7 + n4;
        }
        n4 *= 31;
        String string3 = this.zzb;
        n7 = string3.hashCode();
        return n7 + n4;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.getTypeAsInt();
        SafeParcelWriter.writeInt(parcel, 2, n4);
        String string2 = this.getStringValue();
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        String string3 = this.getObjectValueAsString();
        SafeParcelWriter.writeString(parcel, 4, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

