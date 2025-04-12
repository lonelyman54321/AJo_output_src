/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.zzl;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import com.google.android.gms.internal.fido.zzbf;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class SignResponseData
extends ResponseData {
    public static final Parcelable.Creator CREATOR;
    public static final String JSON_RESPONSE_DATA_CLIENT_DATA = "clientData";
    public static final String JSON_RESPONSE_DATA_KEY_HANDLE = "keyHandle";
    public static final String JSON_RESPONSE_DATA_SIGNATURE_DATA = "signatureData";
    private final byte[] zza;
    private final String zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    static {
        zzl zzl2 = new zzl();
        CREATOR = zzl2;
    }

    public SignResponseData(byte[] byArray, String string2, byte[] byArray2) {
        byte[] byArray3 = new byte[]{};
        this(byArray, string2, byArray2, byArray3);
    }

    public SignResponseData(byte[] object, String string2, byte[] byArray, byte[] byArray2) {
        object = (byte[])Preconditions.checkNotNull(object);
        this.zza = object;
        object = (String)Preconditions.checkNotNull(string2);
        this.zzb = object;
        object = (byte[])Preconditions.checkNotNull(byArray);
        this.zzc = object;
        object = (byte[])Preconditions.checkNotNull(byArray2);
        this.zzd = object;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof SignResponseData;
        if (!bl3) {
            return false;
        }
        object = (SignResponseData)object;
        Object object2 = this.zza;
        Object object3 = ((SignResponseData)object).zza;
        bl3 = Arrays.equals(object2, object3);
        return bl3 && (bl3 = Objects.equal(object2 = (Object)this.zzb, object3 = (Object)((SignResponseData)object).zzb)) && (bl3 = Arrays.equals(object2 = this.zzc, object3 = ((SignResponseData)object).zzc)) && (bl2 = Arrays.equals(object2 = this.zzd, (byte[])(object = (Object)((SignResponseData)object).zzd)));
    }

    public String getClientDataString() {
        return this.zzb;
    }

    public byte[] getKeyHandle() {
        return this.zza;
    }

    public byte[] getSignatureData() {
        return this.zzc;
    }

    public int hashCode() {
        Integer n3 = Arrays.hashCode(this.zza);
        String string2 = this.zzb;
        Integer n4 = Arrays.hashCode(this.zzc);
        Integer n7 = Arrays.hashCode(this.zzd);
        Object[] objectArray = new Object[]{n3, string2, n4, n7};
        return Objects.hashCode(objectArray);
    }

    public JSONObject toJsonObject() {
        Object object;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            object = JSON_RESPONSE_DATA_KEY_HANDLE;
        }
        catch (JSONException jSONException) {
            object = new RuntimeException(jSONException);
            throw object;
        }
        Object object2 = this.zza;
        int n3 = 11;
        object2 = Base64.encodeToString((byte[])object2, (int)n3);
        jSONObject.put((String)object, object2);
        object = JSON_RESPONSE_DATA_CLIENT_DATA;
        object2 = this.zzb;
        object2 = object2.getBytes();
        object2 = Base64.encodeToString((byte[])object2, (int)n3);
        jSONObject.put((String)object, object2);
        object = JSON_RESPONSE_DATA_SIGNATURE_DATA;
        object2 = this.zzc;
        object2 = Base64.encodeToString((byte[])object2, (int)n3);
        jSONObject.put((String)object, object2);
        return jSONObject;
    }

    public String toString() {
        zzaj zzaj2 = zzak.zza(this);
        Object object = zzbf.zzd();
        Object object2 = this.zza;
        int n3 = ((byte[])object2).length;
        object = ((zzbf)object).zze((byte[])object2, 0, n3);
        zzaj2.zzb(JSON_RESPONSE_DATA_KEY_HANDLE, object);
        object2 = this.zzb;
        zzaj2.zzb("clientDataString", object2);
        object = zzbf.zzd();
        object2 = this.zzc;
        n3 = ((byte[])object2).length;
        object = ((zzbf)object).zze((byte[])object2, 0, n3);
        zzaj2.zzb(JSON_RESPONSE_DATA_SIGNATURE_DATA, object);
        object = zzbf.zzd();
        object2 = this.zzd;
        n3 = ((byte[])object2).length;
        object = ((zzbf)object).zze((byte[])object2, 0, n3);
        zzaj2.zzb("application", object);
        return zzaj2.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        byte[] byArray = this.getKeyHandle();
        SafeParcelWriter.writeByteArray(parcel, 2, byArray, false);
        Object object = this.getClientDataString();
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        object = this.getSignatureData();
        SafeParcelWriter.writeByteArray(parcel, 4, (byte[])object, false);
        object = this.zzd;
        SafeParcelWriter.writeByteArray(parcel, 5, (byte[])object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

