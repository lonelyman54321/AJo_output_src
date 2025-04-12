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
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;
import com.google.android.gms.fido.fido2.api.common.zzb;

public final class AttestationConveyancePreference
extends Enum
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final /* enum */ AttestationConveyancePreference DIRECT;
    public static final /* enum */ AttestationConveyancePreference INDIRECT;
    public static final /* enum */ AttestationConveyancePreference NONE;
    private static final /* synthetic */ AttestationConveyancePreference[] zza;
    private final String zzb;

    static {
        AttestationConveyancePreference attestationConveyancePreference;
        AttestationConveyancePreference attestationConveyancePreference2;
        Object object;
        NONE = object = new AttestationConveyancePreference("NONE", 0, "none");
        int n3 = 1;
        INDIRECT = attestationConveyancePreference2 = new AttestationConveyancePreference("INDIRECT", n3, "indirect");
        int n4 = 2;
        DIRECT = attestationConveyancePreference = new AttestationConveyancePreference("DIRECT", n4, "direct");
        AttestationConveyancePreference[] attestationConveyancePreferenceArray = new AttestationConveyancePreference[3];
        attestationConveyancePreferenceArray[0] = object;
        attestationConveyancePreferenceArray[n3] = attestationConveyancePreference2;
        attestationConveyancePreferenceArray[n4] = attestationConveyancePreference;
        zza = attestationConveyancePreferenceArray;
        object = new zzb();
        CREATOR = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AttestationConveyancePreference() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static AttestationConveyancePreference fromString(String string2) {
        for (AttestationConveyancePreference attestationConveyancePreference : AttestationConveyancePreference.values()) {
            String string3 = attestationConveyancePreference.zzb;
            boolean bl2 = string2.equals(string3);
            if (!bl2) continue;
            return attestationConveyancePreference;
        }
        AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException attestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException = new AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException(string2);
        throw attestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;
    }

    public static AttestationConveyancePreference valueOf(String string2) {
        return Enum.valueOf(AttestationConveyancePreference.class, string2);
    }

    public static AttestationConveyancePreference[] values() {
        return (AttestationConveyancePreference[])zza.clone();
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

