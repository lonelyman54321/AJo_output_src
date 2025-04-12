/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions$Builder;
import com.google.android.gms.auth.api.identity.zbo;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class BeginSignInRequest$PasswordRequestOptions
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zba;

    static {
        zbo zbo2 = new zbo();
        CREATOR = zbo2;
    }

    public BeginSignInRequest$PasswordRequestOptions(boolean bl2) {
        this.zba = bl2;
    }

    public static BeginSignInRequest$PasswordRequestOptions$Builder builder() {
        BeginSignInRequest$PasswordRequestOptions$Builder beginSignInRequest$PasswordRequestOptions$Builder = new BeginSignInRequest$PasswordRequestOptions$Builder();
        return beginSignInRequest$PasswordRequestOptions$Builder;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof BeginSignInRequest$PasswordRequestOptions;
        if (!bl2) {
            return false;
        }
        object = (BeginSignInRequest$PasswordRequestOptions)object;
        bl2 = this.zba;
        boolean bl3 = ((BeginSignInRequest$PasswordRequestOptions)object).zba;
        return bl2 == bl3;
    }

    public int hashCode() {
        Boolean bl2 = this.zba;
        Object[] objectArray = new Object[]{bl2};
        return Objects.hashCode(objectArray);
    }

    public boolean isSupported() {
        return this.zba;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.isSupported();
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

