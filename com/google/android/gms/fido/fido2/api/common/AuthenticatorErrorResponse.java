/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import com.google.android.gms.fido.fido2.api.common.zzl;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;

public class AuthenticatorErrorResponse
extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR;
    private final ErrorCode zza;
    private final String zzb;
    private final int zzc;

    static {
        zzl zzl2 = new zzl();
        CREATOR = zzl2;
    }

    public AuthenticatorErrorResponse(int n3, String object, int n4) {
        ErrorCode errorCode;
        try {
            errorCode = ErrorCode.toErrorCode(n3);
        }
        catch (ErrorCode$UnsupportedErrorCodeException errorCode$UnsupportedErrorCodeException) {
            object = new IllegalArgumentException(errorCode$UnsupportedErrorCodeException);
            throw object;
        }
        this.zza = errorCode;
        this.zzb = object;
        this.zzc = n4;
    }

    public static AuthenticatorErrorResponse deserializeFromBytes(byte[] byArray) {
        Parcelable.Creator creator = CREATOR;
        return (AuthenticatorErrorResponse)SafeParcelableSerializer.deserializeFromBytes(byArray, creator);
    }

    public boolean equals(Object object) {
        boolean bl2;
        int n3 = object instanceof AuthenticatorErrorResponse;
        if (n3 == 0) {
            return false;
        }
        object = (AuthenticatorErrorResponse)object;
        Object object2 = this.zza;
        Object object3 = ((AuthenticatorErrorResponse)object).zza;
        n3 = Objects.equal(object2, object3);
        return n3 != 0 && (n3 = Objects.equal(object2 = this.zzb, object3 = ((AuthenticatorErrorResponse)object).zzb)) != 0 && (bl2 = Objects.equal(object2 = Integer.valueOf(n3 = this.zzc), object = Integer.valueOf(((AuthenticatorErrorResponse)object).zzc)));
    }

    public byte[] getClientDataJSON() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public ErrorCode getErrorCode() {
        return this.zza;
    }

    public int getErrorCodeAsInt() {
        return this.zza.getCode();
    }

    public String getErrorMessage() {
        return this.zzb;
    }

    public int hashCode() {
        ErrorCode errorCode = this.zza;
        String string2 = this.zzb;
        Integer n3 = this.zzc;
        Object[] objectArray = new Object[]{errorCode, string2, n3};
        return Objects.hashCode(objectArray);
    }

    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString() {
        zzaj zzaj2 = zzak.zza(this);
        int n3 = this.zza.getCode();
        String string2 = "errorCode";
        zzaj2.zza(string2, n3);
        String string3 = this.zzb;
        if (string3 != null) {
            string2 = "errorMessage";
            zzaj2.zzb(string2, string3);
        }
        return zzaj2.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.getErrorCodeAsInt();
        SafeParcelWriter.writeInt(parcel, 2, n4);
        String string2 = this.getErrorMessage();
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        n4 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

