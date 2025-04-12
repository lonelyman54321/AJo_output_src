/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.u2f.api.messagebased;

import com.google.android.gms.fido.u2f.api.messagebased.RequestType;
import com.google.android.gms.fido.u2f.api.messagebased.RequestType$UnsupportedRequestTypeException;

public final class ResponseType
extends Enum {
    public static final /* enum */ ResponseType REGISTER;
    public static final /* enum */ ResponseType SIGN;
    private static final /* synthetic */ ResponseType[] zza;
    private final String zzb;

    static {
        ResponseType responseType;
        ResponseType responseType2;
        REGISTER = responseType2 = new ResponseType("REGISTER", 0, "u2f_register_response");
        int n3 = 1;
        SIGN = responseType = new ResponseType("SIGN", n3, "u2f_sign_response");
        ResponseType[] responseTypeArray = new ResponseType[2];
        responseTypeArray[0] = responseType2;
        responseTypeArray[n3] = responseType;
        zza = responseTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ResponseType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static ResponseType getResponseTypeForRequestType(RequestType object) {
        if (object != null) {
            int n3 = ((Enum)object).ordinal();
            if (n3 != 0) {
                int n4 = 1;
                if (n3 == n4) {
                    return SIGN;
                }
                object = ((RequestType)((Object)object)).toString();
                RequestType$UnsupportedRequestTypeException requestType$UnsupportedRequestTypeException = new RequestType$UnsupportedRequestTypeException((String)object);
                throw requestType$UnsupportedRequestTypeException;
            }
            return REGISTER;
        }
        object = new RequestType$UnsupportedRequestTypeException(null);
        throw object;
    }

    public static ResponseType valueOf(String string2) {
        return Enum.valueOf(ResponseType.class, string2);
    }

    public static ResponseType[] values() {
        return (ResponseType[])zza.clone();
    }

    public String toString() {
        return this.zzb;
    }
}

