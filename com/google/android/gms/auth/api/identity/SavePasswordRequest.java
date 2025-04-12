/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.auth.api.identity.zbr;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class SavePasswordRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final SignInPassword zba;
    private final String zbb;
    private final int zbc;

    static {
        zbr zbr2 = new zbr();
        CREATOR = zbr2;
    }

    public SavePasswordRequest(SignInPassword signInPassword, String string2, int n3) {
        this.zba = signInPassword = (SignInPassword)Preconditions.checkNotNull(signInPassword);
        this.zbb = string2;
        this.zbc = n3;
    }

    public static SavePasswordRequest$Builder builder() {
        SavePasswordRequest$Builder savePasswordRequest$Builder = new SavePasswordRequest$Builder();
        return savePasswordRequest$Builder;
    }

    public static SavePasswordRequest$Builder zba(SavePasswordRequest object) {
        Preconditions.checkNotNull(object);
        SavePasswordRequest$Builder savePasswordRequest$Builder = SavePasswordRequest.builder();
        SignInPassword signInPassword = ((SavePasswordRequest)object).getSignInPassword();
        savePasswordRequest$Builder.setSignInPassword(signInPassword);
        int n3 = ((SavePasswordRequest)object).zbc;
        savePasswordRequest$Builder.zbb(n3);
        object = ((SavePasswordRequest)object).zbb;
        if (object != null) {
            savePasswordRequest$Builder.zba((String)object);
        }
        return savePasswordRequest$Builder;
    }

    public boolean equals(Object object) {
        int n3;
        int n4 = object instanceof SavePasswordRequest;
        if (n4 == 0) {
            return false;
        }
        object = (SavePasswordRequest)object;
        Object object2 = this.zba;
        Object object3 = ((SavePasswordRequest)object).zba;
        n4 = Objects.equal(object2, object3);
        return n4 != 0 && (n4 = Objects.equal(object2 = this.zbb, object3 = ((SavePasswordRequest)object).zbb)) != 0 && (n4 = this.zbc) == (n3 = ((SavePasswordRequest)object).zbc);
    }

    public SignInPassword getSignInPassword() {
        return this.zba;
    }

    public int hashCode() {
        SignInPassword signInPassword = this.zba;
        String string2 = this.zbb;
        Object[] objectArray = new Object[]{signInPassword, string2};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getSignInPassword();
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)object, n3, false);
        object = this.zbb;
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        int n7 = this.zbc;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

