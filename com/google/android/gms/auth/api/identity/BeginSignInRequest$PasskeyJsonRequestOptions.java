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
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder;
import com.google.android.gms.auth.api.identity.zbm;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class BeginSignInRequest$PasskeyJsonRequestOptions
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zba;
    private final String zbb;

    static {
        zbm zbm2 = new zbm();
        CREATOR = zbm2;
    }

    public BeginSignInRequest$PasskeyJsonRequestOptions(boolean bl2, String string2) {
        if (bl2) {
            Preconditions.checkNotNull(string2);
        }
        this.zba = bl2;
        this.zbb = string2;
    }

    public static BeginSignInRequest$PasskeyJsonRequestOptions$Builder builder() {
        BeginSignInRequest$PasskeyJsonRequestOptions$Builder beginSignInRequest$PasskeyJsonRequestOptions$Builder = new BeginSignInRequest$PasskeyJsonRequestOptions$Builder();
        return beginSignInRequest$PasskeyJsonRequestOptions$Builder;
    }

    public boolean equals(Object object) {
        String string2;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof BeginSignInRequest$PasskeyJsonRequestOptions;
        if (!bl4) {
            return false;
        }
        object = (BeginSignInRequest$PasskeyJsonRequestOptions)object;
        bl4 = this.zba;
        boolean bl5 = ((BeginSignInRequest$PasskeyJsonRequestOptions)object).zba;
        if (bl4 == bl5 && (bl2 = Objects.equal(string2 = this.zbb, object = ((BeginSignInRequest$PasskeyJsonRequestOptions)object).zbb))) {
            return bl3;
        }
        return false;
    }

    public String getRequestJson() {
        return this.zbb;
    }

    public int hashCode() {
        Boolean bl2 = this.zba;
        String string2 = this.zbb;
        Object[] objectArray = new Object[]{bl2, string2};
        return Objects.hashCode(objectArray);
    }

    public boolean isSupported() {
        return this.zba;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.isSupported();
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        String string2 = this.getRequestJson();
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

