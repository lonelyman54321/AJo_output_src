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
import com.google.android.gms.fido.u2f.api.common.zzc;

public final class ErrorCode
extends Enum
implements Parcelable {
    public static final /* enum */ ErrorCode BAD_REQUEST;
    public static final /* enum */ ErrorCode CONFIGURATION_UNSUPPORTED;
    public static final Parcelable.Creator CREATOR;
    public static final /* enum */ ErrorCode DEVICE_INELIGIBLE;
    public static final /* enum */ ErrorCode OK;
    public static final /* enum */ ErrorCode OTHER_ERROR;
    public static final /* enum */ ErrorCode TIMEOUT;
    private static final String zza;
    private static final /* synthetic */ ErrorCode[] zzb;
    private final int zzc;

    static {
        ErrorCode errorCode;
        ErrorCode errorCode2;
        ErrorCode errorCode3;
        ErrorCode errorCode4;
        ErrorCode errorCode5;
        Object object;
        OK = object = new ErrorCode("OK", 0, 0);
        int n3 = 1;
        OTHER_ERROR = errorCode5 = new ErrorCode("OTHER_ERROR", n3, n3);
        int n4 = 2;
        BAD_REQUEST = errorCode4 = new ErrorCode("BAD_REQUEST", n4, n4);
        int n7 = 3;
        CONFIGURATION_UNSUPPORTED = errorCode3 = new ErrorCode("CONFIGURATION_UNSUPPORTED", n7, n7);
        int n8 = 4;
        DEVICE_INELIGIBLE = errorCode2 = new ErrorCode("DEVICE_INELIGIBLE", n8, n8);
        int n10 = 5;
        TIMEOUT = errorCode = new ErrorCode("TIMEOUT", n10, n10);
        ErrorCode[] errorCodeArray = new ErrorCode[6];
        errorCodeArray[0] = object;
        errorCodeArray[n3] = errorCode5;
        errorCodeArray[n4] = errorCode4;
        errorCodeArray[n7] = errorCode3;
        errorCodeArray[n8] = errorCode2;
        errorCodeArray[n10] = errorCode;
        zzb = errorCodeArray;
        zza = "ErrorCode";
        object = new zzc();
        CREATOR = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ErrorCode() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzc = var3_2;
    }

    public static ErrorCode toErrorCode(int n3) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            int n4 = errorCode.zzc;
            if (n3 != n4) continue;
            return errorCode;
        }
        return OTHER_ERROR;
    }

    public static ErrorCode valueOf(String string2) {
        return Enum.valueOf(ErrorCode.class, string2);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[])zzb.clone();
    }

    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.zzc;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zzc;
        parcel.writeInt(n3);
    }
}

