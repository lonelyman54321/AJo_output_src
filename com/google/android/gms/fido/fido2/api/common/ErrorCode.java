/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import com.google.android.gms.fido.fido2.api.common.zzw;

public final class ErrorCode
extends Enum
implements Parcelable {
    public static final /* enum */ ErrorCode ABORT_ERR;
    public static final /* enum */ ErrorCode ATTESTATION_NOT_PRIVATE_ERR;
    public static final /* enum */ ErrorCode CONSTRAINT_ERR;
    public static final Parcelable.Creator CREATOR;
    public static final /* enum */ ErrorCode DATA_ERR;
    public static final /* enum */ ErrorCode ENCODING_ERR;
    public static final /* enum */ ErrorCode INVALID_STATE_ERR;
    public static final /* enum */ ErrorCode NETWORK_ERR;
    public static final /* enum */ ErrorCode NOT_ALLOWED_ERR;
    public static final /* enum */ ErrorCode NOT_SUPPORTED_ERR;
    public static final /* enum */ ErrorCode SECURITY_ERR;
    public static final /* enum */ ErrorCode TIMEOUT_ERR;
    public static final /* enum */ ErrorCode UNKNOWN_ERR;
    private static final /* synthetic */ ErrorCode[] zza;
    private final int zzb;

    static {
        ErrorCode errorCode;
        ErrorCode errorCode2;
        ErrorCode errorCode3;
        ErrorCode errorCode4;
        ErrorCode errorCode5;
        ErrorCode errorCode6;
        ErrorCode errorCode7;
        ErrorCode errorCode8;
        ErrorCode errorCode9;
        ErrorCode errorCode10;
        ErrorCode errorCode11;
        Object object;
        int n3 = 9;
        NOT_SUPPORTED_ERR = object = new ErrorCode("NOT_SUPPORTED_ERR", 0, n3);
        int n4 = 11;
        INVALID_STATE_ERR = errorCode11 = new ErrorCode("INVALID_STATE_ERR", 1, n4);
        SECURITY_ERR = errorCode10 = new ErrorCode("SECURITY_ERR", 2, 18);
        NETWORK_ERR = errorCode9 = new ErrorCode("NETWORK_ERR", 3, 19);
        ABORT_ERR = errorCode8 = new ErrorCode("ABORT_ERR", 4, 20);
        TIMEOUT_ERR = errorCode7 = new ErrorCode("TIMEOUT_ERR", 5, 23);
        ENCODING_ERR = errorCode6 = new ErrorCode("ENCODING_ERR", 6, 27);
        UNKNOWN_ERR = errorCode5 = new ErrorCode("UNKNOWN_ERR", 7, 28);
        CONSTRAINT_ERR = errorCode4 = new ErrorCode("CONSTRAINT_ERR", 8, 29);
        DATA_ERR = errorCode3 = new ErrorCode("DATA_ERR", n3, 30);
        NOT_ALLOWED_ERR = errorCode2 = new ErrorCode("NOT_ALLOWED_ERR", 10, 35);
        ATTESTATION_NOT_PRIVATE_ERR = errorCode = new ErrorCode("ATTESTATION_NOT_PRIVATE_ERR", n4, 36);
        ErrorCode[] errorCodeArray = new ErrorCode[12];
        errorCodeArray[0] = object;
        errorCodeArray[1] = errorCode11;
        errorCodeArray[2] = errorCode10;
        errorCodeArray[3] = errorCode9;
        errorCodeArray[4] = errorCode8;
        errorCodeArray[5] = errorCode7;
        errorCodeArray[6] = errorCode6;
        errorCodeArray[7] = errorCode5;
        errorCodeArray[8] = errorCode4;
        errorCodeArray[9] = errorCode3;
        errorCodeArray[10] = errorCode2;
        errorCodeArray[n4] = errorCode;
        zza = errorCodeArray;
        object = new zzw();
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
        this.zzb = var3_2;
    }

    public static ErrorCode toErrorCode(int n3) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            int n4 = errorCode.zzb;
            if (n3 != n4) continue;
            return errorCode;
        }
        ErrorCode$UnsupportedErrorCodeException errorCode$UnsupportedErrorCodeException = new ErrorCode$UnsupportedErrorCodeException(n3);
        throw errorCode$UnsupportedErrorCodeException;
    }

    public static ErrorCode valueOf(String string2) {
        return Enum.valueOf(ErrorCode.class, string2);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[])zza.clone();
    }

    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zzb;
        parcel.writeInt(n3);
    }
}

