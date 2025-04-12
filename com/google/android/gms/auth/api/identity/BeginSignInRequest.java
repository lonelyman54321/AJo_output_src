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
import com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions;
import com.google.android.gms.auth.api.identity.zbf;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class BeginSignInRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final BeginSignInRequest$PasswordRequestOptions zba;
    private final BeginSignInRequest$GoogleIdTokenRequestOptions zbb;
    private final String zbc;
    private final boolean zbd;
    private final int zbe;
    private final BeginSignInRequest$PasskeysRequestOptions zbf;
    private final BeginSignInRequest$PasskeyJsonRequestOptions zbg;

    static {
        zbf zbf2 = new zbf();
        CREATOR = zbf2;
    }

    public BeginSignInRequest(BeginSignInRequest$PasswordRequestOptions abstractSafeParcelable, BeginSignInRequest$GoogleIdTokenRequestOptions object, String string2, boolean bl2, int n3, BeginSignInRequest$PasskeysRequestOptions beginSignInRequest$PasskeysRequestOptions, BeginSignInRequest$PasskeyJsonRequestOptions beginSignInRequest$PasskeyJsonRequestOptions) {
        this.zba = abstractSafeParcelable = (BeginSignInRequest$PasswordRequestOptions)Preconditions.checkNotNull(abstractSafeParcelable);
        abstractSafeParcelable = (BeginSignInRequest$GoogleIdTokenRequestOptions)Preconditions.checkNotNull(object);
        this.zbb = abstractSafeParcelable;
        this.zbc = string2;
        this.zbd = bl2;
        this.zbe = n3;
        abstractSafeParcelable = null;
        if (beginSignInRequest$PasskeysRequestOptions == null) {
            object = BeginSignInRequest$PasskeysRequestOptions.builder();
            ((BeginSignInRequest$PasskeysRequestOptions$Builder)object).setSupported(false);
            beginSignInRequest$PasskeysRequestOptions = ((BeginSignInRequest$PasskeysRequestOptions$Builder)object).build();
        }
        this.zbf = beginSignInRequest$PasskeysRequestOptions;
        if (beginSignInRequest$PasskeyJsonRequestOptions == null) {
            object = BeginSignInRequest$PasskeyJsonRequestOptions.builder();
            ((BeginSignInRequest$PasskeyJsonRequestOptions$Builder)object).setSupported(false);
            beginSignInRequest$PasskeyJsonRequestOptions = ((BeginSignInRequest$PasskeyJsonRequestOptions$Builder)object).build();
        }
        this.zbg = beginSignInRequest$PasskeyJsonRequestOptions;
    }

    public static BeginSignInRequest$Builder builder() {
        BeginSignInRequest$Builder beginSignInRequest$Builder = new BeginSignInRequest$Builder();
        return beginSignInRequest$Builder;
    }

    public static BeginSignInRequest$Builder zba(BeginSignInRequest object) {
        Preconditions.checkNotNull(object);
        BeginSignInRequest$Builder beginSignInRequest$Builder = BeginSignInRequest.builder();
        AbstractSafeParcelable abstractSafeParcelable = ((BeginSignInRequest)object).getGoogleIdTokenRequestOptions();
        beginSignInRequest$Builder.setGoogleIdTokenRequestOptions((BeginSignInRequest$GoogleIdTokenRequestOptions)abstractSafeParcelable);
        abstractSafeParcelable = ((BeginSignInRequest)object).getPasswordRequestOptions();
        beginSignInRequest$Builder.setPasswordRequestOptions((BeginSignInRequest$PasswordRequestOptions)abstractSafeParcelable);
        abstractSafeParcelable = ((BeginSignInRequest)object).getPasskeysRequestOptions();
        beginSignInRequest$Builder.setPasskeysSignInRequestOptions((BeginSignInRequest$PasskeysRequestOptions)abstractSafeParcelable);
        abstractSafeParcelable = ((BeginSignInRequest)object).getPasskeyJsonRequestOptions();
        beginSignInRequest$Builder.setPasskeyJsonSignInRequestOptions((BeginSignInRequest$PasskeyJsonRequestOptions)abstractSafeParcelable);
        int n3 = ((BeginSignInRequest)object).zbd;
        beginSignInRequest$Builder.setAutoSelectEnabled(n3 != 0);
        n3 = ((BeginSignInRequest)object).zbe;
        beginSignInRequest$Builder.zbb(n3);
        object = ((BeginSignInRequest)object).zbc;
        if (object != null) {
            beginSignInRequest$Builder.zba((String)object);
        }
        return beginSignInRequest$Builder;
    }

    public boolean equals(Object object) {
        int n3;
        int n4;
        int n7 = object instanceof BeginSignInRequest;
        if (n7 == 0) {
            return false;
        }
        object = (BeginSignInRequest)object;
        Object object2 = this.zba;
        Object object3 = ((BeginSignInRequest)object).zba;
        n7 = Objects.equal(object2, object3);
        return n7 != 0 && (n7 = Objects.equal(object2 = this.zbb, object3 = ((BeginSignInRequest)object).zbb)) != 0 && (n7 = Objects.equal(object2 = this.zbf, object3 = ((BeginSignInRequest)object).zbf)) != 0 && (n7 = Objects.equal(object2 = this.zbg, object3 = ((BeginSignInRequest)object).zbg)) != 0 && (n7 = Objects.equal(object2 = this.zbc, object3 = ((BeginSignInRequest)object).zbc)) != 0 && (n7 = this.zbd) == (n4 = ((BeginSignInRequest)object).zbd) && (n7 = this.zbe) == (n3 = ((BeginSignInRequest)object).zbe);
    }

    public BeginSignInRequest$GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zbb;
    }

    public BeginSignInRequest$PasskeyJsonRequestOptions getPasskeyJsonRequestOptions() {
        return this.zbg;
    }

    public BeginSignInRequest$PasskeysRequestOptions getPasskeysRequestOptions() {
        return this.zbf;
    }

    public BeginSignInRequest$PasswordRequestOptions getPasswordRequestOptions() {
        return this.zba;
    }

    public int hashCode() {
        BeginSignInRequest$PasswordRequestOptions beginSignInRequest$PasswordRequestOptions = this.zba;
        BeginSignInRequest$GoogleIdTokenRequestOptions beginSignInRequest$GoogleIdTokenRequestOptions = this.zbb;
        BeginSignInRequest$PasskeysRequestOptions beginSignInRequest$PasskeysRequestOptions = this.zbf;
        BeginSignInRequest$PasskeyJsonRequestOptions beginSignInRequest$PasskeyJsonRequestOptions = this.zbg;
        String string2 = this.zbc;
        Boolean bl2 = this.zbd;
        Object[] objectArray = new Object[]{beginSignInRequest$PasswordRequestOptions, beginSignInRequest$GoogleIdTokenRequestOptions, beginSignInRequest$PasskeysRequestOptions, beginSignInRequest$PasskeyJsonRequestOptions, string2, bl2};
        return Objects.hashCode(objectArray);
    }

    public boolean isAutoSelectEnabled() {
        return this.zbd;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        BeginSignInRequest$PasswordRequestOptions beginSignInRequest$PasswordRequestOptions = this.getPasswordRequestOptions();
        SafeParcelWriter.writeParcelable(parcel, 1, beginSignInRequest$PasswordRequestOptions, n3, false);
        Object object = this.getGoogleIdTokenRequestOptions();
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)object, n3, false);
        object = this.zbc;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        int n7 = this.isAutoSelectEnabled();
        SafeParcelWriter.writeBoolean(parcel, 4, n7 != 0);
        n7 = this.zbe;
        SafeParcelWriter.writeInt(parcel, 5, n7);
        object = this.getPasskeysRequestOptions();
        SafeParcelWriter.writeParcelable(parcel, 6, (Parcelable)object, n3, false);
        object = this.getPasskeyJsonRequestOptions();
        SafeParcelWriter.writeParcelable(parcel, 7, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

