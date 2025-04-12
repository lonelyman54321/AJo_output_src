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
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import com.google.android.gms.fido.fido2.api.common.zzaq;

public final class PublicKeyCredentialType
extends Enum
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final /* enum */ PublicKeyCredentialType PUBLIC_KEY;
    private static final /* synthetic */ PublicKeyCredentialType[] zza;
    private final String zzb;

    static {
        Object object;
        PUBLIC_KEY = object = new PublicKeyCredentialType("PUBLIC_KEY", 0, "public-key");
        PublicKeyCredentialType[] publicKeyCredentialTypeArray = new PublicKeyCredentialType[]{object};
        zza = publicKeyCredentialTypeArray;
        object = new zzaq();
        CREATOR = object;
    }

    private PublicKeyCredentialType() {
        this.zzb = "public-key";
    }

    public static PublicKeyCredentialType fromString(String string2) {
        for (PublicKeyCredentialType publicKeyCredentialType : PublicKeyCredentialType.values()) {
            String string3 = publicKeyCredentialType.zzb;
            boolean bl2 = string2.equals(string3);
            if (!bl2) continue;
            return publicKeyCredentialType;
        }
        string2 = cP.a("PublicKeyCredentialType ", string2, " not supported");
        PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException publicKeyCredentialType$UnsupportedPublicKeyCredTypeException = new PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException(string2);
        throw publicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
    }

    public static PublicKeyCredentialType valueOf(String string2) {
        return Enum.valueOf(PublicKeyCredentialType.class, string2);
    }

    public static PublicKeyCredentialType[] values() {
        return (PublicKeyCredentialType[])zza.clone();
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

