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
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException;
import com.google.android.gms.fido.u2f.api.common.zzf;
import java.io.UnsupportedEncodingException;

public final class ProtocolVersion
extends Enum
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final /* enum */ ProtocolVersion UNKNOWN;
    public static final /* enum */ ProtocolVersion V1;
    public static final /* enum */ ProtocolVersion V2;
    private static final /* synthetic */ ProtocolVersion[] zza;
    private final String zzb;

    static {
        ProtocolVersion protocolVersion;
        Object object;
        Object object2 = "UNKNOWN";
        UNKNOWN = object = new ProtocolVersion(object2, 0, object2);
        int n3 = 1;
        object2 = new ProtocolVersion("V1", n3, "U2F_V1");
        V1 = object2;
        int n4 = 2;
        V2 = protocolVersion = new ProtocolVersion("V2", n4, "U2F_V2");
        ProtocolVersion[] protocolVersionArray = new ProtocolVersion[3];
        protocolVersionArray[0] = object;
        protocolVersionArray[n3] = object2;
        protocolVersionArray[n4] = protocolVersion;
        zza = protocolVersionArray;
        object = new zzf();
        CREATOR = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ProtocolVersion() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static ProtocolVersion fromBytes(byte[] byArray) {
        Object object;
        String string2 = "UTF-8";
        try {
            object = new String(byArray, string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object = new RuntimeException(unsupportedEncodingException);
            throw object;
        }
        return ProtocolVersion.fromString((String)object);
    }

    public static ProtocolVersion fromString(String string2) {
        if (string2 == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : ProtocolVersion.values()) {
            String string3 = protocolVersion.zzb;
            boolean bl2 = string2.equals(string3);
            if (!bl2) continue;
            return protocolVersion;
        }
        ProtocolVersion$UnsupportedProtocolException protocolVersion$UnsupportedProtocolException = new ProtocolVersion$UnsupportedProtocolException(string2);
        throw protocolVersion$UnsupportedProtocolException;
    }

    public static ProtocolVersion valueOf(String string2) {
        return Enum.valueOf(ProtocolVersion.class, string2);
    }

    public static ProtocolVersion[] values() {
        return (ProtocolVersion[])zza.clone();
    }

    public int describeContents() {
        return 0;
    }

    public boolean isCompatible(ProtocolVersion protocolVersion) {
        boolean bl2;
        ProtocolVersion protocolVersion2 = UNKNOWN;
        boolean bl3 = ((Object)((Object)this)).equals((Object)protocolVersion2);
        if (!bl3 && !(bl2 = ((Object)((Object)protocolVersion)).equals((Object)protocolVersion2))) {
            return ((Object)((Object)this)).equals((Object)protocolVersion);
        }
        return true;
    }

    public String toString() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zzb;
        parcel.writeString(string2);
    }
}

