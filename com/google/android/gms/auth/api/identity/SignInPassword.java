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
import com.google.android.gms.auth.api.identity.zbv;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class SignInPassword
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zba;
    private final String zbb;

    static {
        zbv zbv2 = new zbv();
        CREATOR = zbv2;
    }

    public SignInPassword(String string2, String string3) {
        this.zba = string2 = Preconditions.checkNotEmpty(((String)Preconditions.checkNotNull(string2, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.zbb = string2 = Preconditions.checkNotEmpty(string3);
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof SignInPassword;
        if (!bl3) {
            return false;
        }
        object = (SignInPassword)object;
        String string2 = this.zba;
        String string3 = ((SignInPassword)object).zba;
        bl3 = Objects.equal(string2, string3);
        return bl3 && (bl2 = Objects.equal(string2 = this.zbb, object = ((SignInPassword)object).zbb));
    }

    public String getId() {
        return this.zba;
    }

    public String getPassword() {
        return this.zbb;
    }

    public int hashCode() {
        String string2 = this.zba;
        String string3 = this.zbb;
        Object[] objectArray = new Object[]{string2, string3};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getId();
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        String string3 = this.getPassword();
        SafeParcelWriter.writeString(parcel, 2, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

