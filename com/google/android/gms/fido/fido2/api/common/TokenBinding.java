/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import com.google.android.gms.fido.fido2.api.common.zzau;
import com.google.android.gms.internal.fido.zzal;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class TokenBinding
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final TokenBinding NOT_SUPPORTED;
    public static final TokenBinding SUPPORTED;
    private final TokenBinding$TokenBindingStatus zza;
    private final String zzb;

    static {
        Object object = new zzau();
        CREATOR = object;
        String string2 = TokenBinding$TokenBindingStatus.SUPPORTED.toString();
        SUPPORTED = object = new TokenBinding(string2, null);
        string2 = TokenBinding$TokenBindingStatus.NOT_SUPPORTED.toString();
        NOT_SUPPORTED = object = new TokenBinding(string2, null);
    }

    public TokenBinding(String string2) {
        String string3 = TokenBinding$TokenBindingStatus.PRESENT.toString();
        string2 = (String)Preconditions.checkNotNull(string2);
        this(string3, string2);
    }

    public TokenBinding(String object, String object2) {
        Preconditions.checkNotNull(object);
        try {
            object = TokenBinding$TokenBindingStatus.fromString(object);
        }
        catch (TokenBinding$UnsupportedTokenBindingStatusException tokenBinding$UnsupportedTokenBindingStatusException) {
            object2 = new IllegalArgumentException(tokenBinding$UnsupportedTokenBindingStatusException);
            throw object2;
        }
        this.zza = object;
        this.zzb = object2;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof TokenBinding;
        if (!bl3) {
            return false;
        }
        object = (TokenBinding)object;
        Object object2 = this.zza;
        TokenBinding$TokenBindingStatus tokenBinding$TokenBindingStatus = ((TokenBinding)object).zza;
        bl3 = zzal.zza(object2, (Object)tokenBinding$TokenBindingStatus);
        return bl3 && (bl2 = zzal.zza(object2 = this.zzb, object = ((TokenBinding)object).zzb));
    }

    public String getTokenBindingId() {
        return this.zzb;
    }

    public String getTokenBindingStatusAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        TokenBinding$TokenBindingStatus tokenBinding$TokenBindingStatus = this.zza;
        String string2 = this.zzb;
        Object[] objectArray = new Object[]{tokenBinding$TokenBindingStatus, string2};
        return Arrays.hashCode(objectArray);
    }

    public JSONObject toJsonObject() {
        Object object;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            object = "status";
        }
        catch (JSONException jSONException) {
            object = new RuntimeException(jSONException);
            throw object;
        }
        Object object2 = this.zza;
        jSONObject = jSONObject.put((String)object, object2);
        object = "id";
        object2 = this.zzb;
        return jSONObject.put((String)object, object2);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getTokenBindingStatusAsString();
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        String string3 = this.getTokenBindingId();
        SafeParcelWriter.writeString(parcel, 3, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

