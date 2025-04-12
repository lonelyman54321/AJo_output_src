/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONArray
 */
package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.fido.common.Transport$UnsupportedTransportException;
import com.google.android.gms.fido.common.zza;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

public final class Transport
extends Enum
implements ReflectedParcelable {
    public static final /* enum */ Transport BLUETOOTH_CLASSIC;
    public static final /* enum */ Transport BLUETOOTH_LOW_ENERGY;
    public static final Parcelable.Creator CREATOR;
    public static final /* enum */ Transport HYBRID;
    public static final /* enum */ Transport INTERNAL;
    public static final /* enum */ Transport NFC;
    public static final /* enum */ Transport USB;
    private static final /* synthetic */ Transport[] zza;
    private final String zzb;

    static {
        Transport transport;
        Transport transport2;
        Transport transport3;
        Transport transport4;
        Transport transport5;
        Object object = new Transport("BLUETOOTH_CLASSIC", 0, "bt");
        BLUETOOTH_CLASSIC = object;
        int n3 = 1;
        BLUETOOTH_LOW_ENERGY = transport5 = new Transport("BLUETOOTH_LOW_ENERGY", n3, "ble");
        int n4 = 2;
        NFC = transport4 = new Transport("NFC", n4, "nfc");
        int n7 = 3;
        USB = transport3 = new Transport("USB", n7, "usb");
        int n8 = 4;
        INTERNAL = transport2 = new Transport("INTERNAL", n8, "internal");
        int n10 = 5;
        HYBRID = transport = new Transport("HYBRID", n10, "cable");
        Transport[] transportArray = new Transport[6];
        transportArray[0] = object;
        transportArray[n3] = transport5;
        transportArray[n4] = transport4;
        transportArray[n7] = transport3;
        transportArray[n8] = transport2;
        transportArray[n10] = transport;
        zza = transportArray;
        object = new zza();
        CREATOR = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Transport() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static Transport fromString(String string2) {
        for (Transport transport : Transport.values()) {
            String string3 = transport.zzb;
            boolean bl2 = string2.equals(string3);
            if (!bl2) continue;
            return transport;
        }
        String string4 = "hybrid";
        boolean bl3 = string2.equals(string4);
        if (bl3) {
            return HYBRID;
        }
        string2 = cP.a("Transport ", string2, " not supported");
        Transport$UnsupportedTransportException transport$UnsupportedTransportException = new Transport$UnsupportedTransportException(string2);
        throw transport$UnsupportedTransportException;
    }

    public static List parseTransports(JSONArray object) {
        int n3;
        if (object == null) {
            return null;
        }
        int n4 = object.length();
        HashSet<Object> hashSet = new HashSet<Object>(n4);
        for (n4 = 0; n4 < (n3 = object.length()); ++n4) {
            boolean bl2;
            String string2 = object.getString(n4);
            if (string2 == null || (bl2 = string2.isEmpty())) continue;
            Object object2 = Transport.fromString(string2);
            try {
                hashSet.add(object2);
                continue;
            }
            catch (Transport$UnsupportedTransportException transport$UnsupportedTransportException) {
                object2 = "Ignoring unrecognized transport ";
                ((String)object2).concat(string2);
            }
        }
        object = new ArrayList(hashSet);
        return object;
    }

    public static Transport valueOf(String string2) {
        return Enum.valueOf(Transport.class, string2);
    }

    public static Transport[] values() {
        return (Transport[])zza.clone();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zzb;
        parcel.writeString(string2);
    }
}

