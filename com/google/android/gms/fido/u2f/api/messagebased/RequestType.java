/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.u2f.api.messagebased;

import com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException;

public final class RequestType
extends Enum {
    public static final /* enum */ RequestType REGISTER;
    public static final /* enum */ RequestType SIGN;
    private static final /* synthetic */ RequestType[] zza;
    private final String zzb;

    static {
        RequestType requestType;
        RequestType requestType2;
        REGISTER = requestType2 = new RequestType("REGISTER", 0, "u2f_register_request");
        int n3 = 1;
        SIGN = requestType = new RequestType("SIGN", n3, "u2f_sign_request");
        RequestType[] requestTypeArray = new RequestType[2];
        requestTypeArray[0] = requestType2;
        requestTypeArray[n3] = requestType;
        zza = requestTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RequestType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static RequestType fromString(String string2) {
        for (RequestType requestType : RequestType.values()) {
            String string3 = requestType.zzb;
            boolean bl2 = string2.equals(string3);
            if (!bl2) continue;
            return requestType;
        }
        RequestType$UnsupportedRequestTypeException requestType$UnsupportedRequestTypeException = new RequestType$UnsupportedRequestTypeException(string2);
        throw requestType$UnsupportedRequestTypeException;
    }

    public static RequestType valueOf(String string2) {
        return Enum.valueOf(RequestType.class, string2);
    }

    public static RequestType[] values() {
        return (RequestType[])zza.clone();
    }

    public String toString() {
        return this.zzb;
    }
}

