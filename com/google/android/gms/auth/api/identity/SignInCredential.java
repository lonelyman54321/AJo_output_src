/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.zbt;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

public final class SignInCredential
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final String zbd;
    private final Uri zbe;
    private final String zbf;
    private final String zbg;
    private final String zbh;
    private final PublicKeyCredential zbi;

    static {
        zbt zbt2 = new zbt();
        CREATOR = zbt2;
    }

    public SignInCredential(String string2, String string3, String string4, String string5, Uri uri, String string6, String string7, String string8, PublicKeyCredential publicKeyCredential) {
        this.zba = string2 = Preconditions.checkNotEmpty(string2);
        this.zbb = string3;
        this.zbc = string4;
        this.zbd = string5;
        this.zbe = uri;
        this.zbf = string6;
        this.zbg = string7;
        this.zbh = string8;
        this.zbi = publicKeyCredential;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof SignInCredential;
        if (!bl3) {
            return false;
        }
        object = (SignInCredential)object;
        Object object2 = this.zba;
        String string2 = ((SignInCredential)object).zba;
        bl3 = Objects.equal(object2, string2);
        return bl3 && (bl3 = Objects.equal(object2 = this.zbb, string2 = ((SignInCredential)object).zbb)) && (bl3 = Objects.equal(object2 = this.zbc, string2 = ((SignInCredential)object).zbc)) && (bl3 = Objects.equal(object2 = this.zbd, string2 = ((SignInCredential)object).zbd)) && (bl3 = Objects.equal(object2 = this.zbe, string2 = ((SignInCredential)object).zbe)) && (bl3 = Objects.equal(object2 = this.zbf, string2 = ((SignInCredential)object).zbf)) && (bl3 = Objects.equal(object2 = this.zbg, string2 = ((SignInCredential)object).zbg)) && (bl3 = Objects.equal(object2 = this.zbh, string2 = ((SignInCredential)object).zbh)) && (bl2 = Objects.equal(object2 = this.zbi, object = ((SignInCredential)object).zbi));
    }

    public String getDisplayName() {
        return this.zbb;
    }

    public String getFamilyName() {
        return this.zbd;
    }

    public String getGivenName() {
        return this.zbc;
    }

    public String getGoogleIdToken() {
        return this.zbg;
    }

    public String getId() {
        return this.zba;
    }

    public String getPassword() {
        return this.zbf;
    }

    public String getPhoneNumber() {
        return this.zbh;
    }

    public Uri getProfilePictureUri() {
        return this.zbe;
    }

    public PublicKeyCredential getPublicKeyCredential() {
        return this.zbi;
    }

    public int hashCode() {
        String string2 = this.zba;
        String string3 = this.zbb;
        String string4 = this.zbc;
        String string5 = this.zbd;
        Uri uri = this.zbe;
        String string6 = this.zbf;
        String string7 = this.zbg;
        String string8 = this.zbh;
        PublicKeyCredential publicKeyCredential = this.zbi;
        Object[] objectArray = new Object[]{string2, string3, string4, string5, uri, string6, string7, string8, publicKeyCredential};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getId();
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        Object object = this.getDisplayName();
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        object = this.getGivenName();
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        object = this.getFamilyName();
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        object = this.getProfilePictureUri();
        SafeParcelWriter.writeParcelable(parcel, 5, (Parcelable)object, n3, false);
        object = this.getPassword();
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        object = this.getGoogleIdToken();
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        object = this.getPhoneNumber();
        SafeParcelWriter.writeString(parcel, 8, (String)object, false);
        object = this.getPublicKeyCredential();
        SafeParcelWriter.writeParcelable(parcel, 9, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

