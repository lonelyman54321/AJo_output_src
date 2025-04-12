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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.fido2.api.common.zze;

public class AuthenticationExtensionsCredPropsOutputs
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zza;

    static {
        zze zze2 = new zze();
        CREATOR = zze2;
    }

    public AuthenticationExtensionsCredPropsOutputs(boolean bl2) {
        this.zza = bl2;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof AuthenticationExtensionsCredPropsOutputs;
        if (!bl2) {
            return false;
        }
        object = (AuthenticationExtensionsCredPropsOutputs)object;
        bl2 = this.zza;
        boolean bl3 = ((AuthenticationExtensionsCredPropsOutputs)object).zza;
        return bl2 == bl3;
    }

    public boolean getIsDiscoverableCredential() {
        return this.zza;
    }

    public int hashCode() {
        Boolean bl2 = this.zza;
        Object[] objectArray = new Object[]{bl2};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.getIsDiscoverableCredential();
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

