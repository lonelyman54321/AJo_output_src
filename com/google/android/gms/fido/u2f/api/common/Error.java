/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.fido.u2f.api.common;

import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class Error {
    public static final String JSON_ERROR_CODE = "errorCode";
    public static final String JSON_ERROR_MESSAGE = "errorMessage";
    private final ErrorCode zza;
    private final String zzb;

    public Error(ErrorCode errorCode) {
        this.zza = errorCode;
        this.zzb = null;
    }

    public Error(ErrorCode errorCode, String string2) {
        this.zza = errorCode;
        this.zzb = string2;
    }

    public ErrorCode getErrorCode() {
        return this.zza;
    }

    public String getErrorMessage() {
        return this.zzb;
    }

    public JSONObject toJsonObject() {
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
        Object object = this.zzb;
        String string2 = "}";
        String string3 = "{errorCode: ";
        if (object == null) {
            object = Locale.ENGLISH;
            return Gj0.b(this.zza.getCode(), string3, string2);
        }
        object = Locale.ENGLISH;
        int n3 = this.zza.getCode();
        String string4 = this.zzb;
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append(n3);
        stringBuilder.append(", errorMessage: ");
        stringBuilder.append(string4);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

