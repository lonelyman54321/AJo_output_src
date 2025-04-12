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
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import com.google.android.gms.fido.fido2.api.common.zzat;

public final class TokenBinding$TokenBindingStatus
extends Enum
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final /* enum */ TokenBinding$TokenBindingStatus NOT_SUPPORTED;
    public static final /* enum */ TokenBinding$TokenBindingStatus PRESENT;
    public static final /* enum */ TokenBinding$TokenBindingStatus SUPPORTED;
    private static final /* synthetic */ TokenBinding$TokenBindingStatus[] zza;
    private final String zzb;

    static {
        TokenBinding$TokenBindingStatus tokenBinding$TokenBindingStatus;
        TokenBinding$TokenBindingStatus tokenBinding$TokenBindingStatus2;
        Object object;
        PRESENT = object = new TokenBinding$TokenBindingStatus("PRESENT", 0, "present");
        int n3 = 1;
        SUPPORTED = tokenBinding$TokenBindingStatus2 = new TokenBinding$TokenBindingStatus("SUPPORTED", n3, "supported");
        int n4 = 2;
        NOT_SUPPORTED = tokenBinding$TokenBindingStatus = new TokenBinding$TokenBindingStatus("NOT_SUPPORTED", n4, "not-supported");
        TokenBinding$TokenBindingStatus[] tokenBinding$TokenBindingStatusArray = new TokenBinding$TokenBindingStatus[3];
        tokenBinding$TokenBindingStatusArray[0] = object;
        tokenBinding$TokenBindingStatusArray[n3] = tokenBinding$TokenBindingStatus2;
        tokenBinding$TokenBindingStatusArray[n4] = tokenBinding$TokenBindingStatus;
        zza = tokenBinding$TokenBindingStatusArray;
        object = new zzat();
        CREATOR = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private TokenBinding$TokenBindingStatus() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static TokenBinding$TokenBindingStatus fromString(String string2) {
        for (TokenBinding$TokenBindingStatus tokenBinding$TokenBindingStatus : TokenBinding$TokenBindingStatus.values()) {
            String string3 = tokenBinding$TokenBindingStatus.zzb;
            boolean bl2 = string2.equals(string3);
            if (!bl2) continue;
            return tokenBinding$TokenBindingStatus;
        }
        TokenBinding$UnsupportedTokenBindingStatusException tokenBinding$UnsupportedTokenBindingStatusException = new TokenBinding$UnsupportedTokenBindingStatusException(string2);
        throw tokenBinding$UnsupportedTokenBindingStatusException;
    }

    public static TokenBinding$TokenBindingStatus valueOf(String string2) {
        return Enum.valueOf(TokenBinding$TokenBindingStatus.class, string2);
    }

    public static TokenBinding$TokenBindingStatus[] values() {
        return (TokenBinding$TokenBindingStatus[])zza.clone();
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

