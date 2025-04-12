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
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.zzd;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import org.json.JSONException;
import org.json.JSONObject;

public class ErrorResponseData
extends ResponseData {
    public static final Parcelable.Creator CREATOR;
    public static final String JSON_ERROR_CODE = "errorCode";
    public static final String JSON_ERROR_MESSAGE = "errorMessage";
    private final ErrorCode zza;
    private final String zzb;

    static {
        zzd zzd2 = new zzd();
        CREATOR = zzd2;
    }

    public ErrorResponseData(int n3, String string2) {
        ErrorCode errorCode;
        this.zza = errorCode = ErrorCode.toErrorCode(n3);
        this.zzb = string2;
    }

    public ErrorResponseData(ErrorCode errorCode) {
        this.zza = errorCode = (ErrorCode)((Object)Preconditions.checkNotNull((Object)errorCode));
        this.zzb = null;
    }

    public ErrorResponseData(ErrorCode errorCode, String string2) {
        this.zza = errorCode = (ErrorCode)((Object)Preconditions.checkNotNull((Object)errorCode));
        this.zzb = string2;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof ErrorResponseData;
        if (!bl3) {
            return false;
        }
        object = (ErrorResponseData)object;
        Object object2 = this.zza;
        ErrorCode errorCode = ((ErrorResponseData)object).zza;
        bl3 = Objects.equal(object2, (Object)errorCode);
        return bl3 && (bl2 = Objects.equal(object2 = this.zzb, object = ((ErrorResponseData)object).zzb));
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
        Object[] objectArray = new Object[]{errorCode, string2};
        return Objects.hashCode(objectArray);
    }

    public final JSONObject toJsonObject() {
        JSONException jSONException2;
        Object object;
        block6: {
            JSONObject jSONObject;
            block5: {
                Object object2;
                jSONObject = new JSONObject();
                object = JSON_ERROR_CODE;
                try {
                    object2 = this.zza;
                }
                catch (JSONException jSONException2) {
                    break block6;
                }
                int n3 = object2.getCode();
                jSONObject.put((String)object, n3);
                object = this.zzb;
                if (object == null) break block5;
                object2 = JSON_ERROR_MESSAGE;
                jSONObject.put((String)object2, object);
            }
            return jSONObject;
        }
        object = new RuntimeException(jSONException2);
        throw object;
    }

    public String toString() {
        zzaj zzaj2 = zzak.zza(this);
        int n3 = this.zza.getCode();
        String string2 = JSON_ERROR_CODE;
        zzaj2.zza(string2, n3);
        String string3 = this.zzb;
        if (string3 != null) {
            string2 = JSON_ERROR_MESSAGE;
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
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

