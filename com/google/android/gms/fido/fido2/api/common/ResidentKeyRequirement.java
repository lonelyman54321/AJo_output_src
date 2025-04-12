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
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;
import com.google.android.gms.fido.fido2.api.common.zzas;

public final class ResidentKeyRequirement
extends Enum
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final /* enum */ ResidentKeyRequirement RESIDENT_KEY_DISCOURAGED;
    public static final /* enum */ ResidentKeyRequirement RESIDENT_KEY_PREFERRED;
    public static final /* enum */ ResidentKeyRequirement RESIDENT_KEY_REQUIRED;
    private static final /* synthetic */ ResidentKeyRequirement[] zza;
    private final String zzb;

    static {
        ResidentKeyRequirement residentKeyRequirement;
        ResidentKeyRequirement residentKeyRequirement2;
        Object object;
        RESIDENT_KEY_DISCOURAGED = object = new ResidentKeyRequirement("RESIDENT_KEY_DISCOURAGED", 0, "discouraged");
        int n3 = 1;
        RESIDENT_KEY_PREFERRED = residentKeyRequirement2 = new ResidentKeyRequirement("RESIDENT_KEY_PREFERRED", n3, "preferred");
        int n4 = 2;
        RESIDENT_KEY_REQUIRED = residentKeyRequirement = new ResidentKeyRequirement("RESIDENT_KEY_REQUIRED", n4, "required");
        ResidentKeyRequirement[] residentKeyRequirementArray = new ResidentKeyRequirement[3];
        residentKeyRequirementArray[0] = object;
        residentKeyRequirementArray[n3] = residentKeyRequirement2;
        residentKeyRequirementArray[n4] = residentKeyRequirement;
        zza = residentKeyRequirementArray;
        object = new zzas();
        CREATOR = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ResidentKeyRequirement() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static ResidentKeyRequirement fromString(String string2) {
        for (ResidentKeyRequirement residentKeyRequirement : ResidentKeyRequirement.values()) {
            String string3 = residentKeyRequirement.zzb;
            boolean bl2 = string2.equals(string3);
            if (!bl2) continue;
            return residentKeyRequirement;
        }
        ResidentKeyRequirement$UnsupportedResidentKeyRequirementException residentKeyRequirement$UnsupportedResidentKeyRequirementException = new ResidentKeyRequirement$UnsupportedResidentKeyRequirementException(string2);
        throw residentKeyRequirement$UnsupportedResidentKeyRequirementException;
    }

    public static ResidentKeyRequirement valueOf(String string2) {
        return Enum.valueOf(ResidentKeyRequirement.class, string2);
    }

    public static ResidentKeyRequirement[] values() {
        return (ResidentKeyRequirement[])zza.clone();
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

