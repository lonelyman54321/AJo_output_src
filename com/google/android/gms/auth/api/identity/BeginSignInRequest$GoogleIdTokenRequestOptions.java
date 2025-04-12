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
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder;
import com.google.android.gms.auth.api.identity.zbl;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BeginSignInRequest$GoogleIdTokenRequestOptions
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zba;
    private final String zbb;
    private final String zbc;
    private final boolean zbd;
    private final String zbe;
    private final List zbf;
    private final boolean zbg;

    static {
        zbl zbl2 = new zbl();
        CREATOR = zbl2;
    }

    public BeginSignInRequest$GoogleIdTokenRequestOptions(boolean bl2, String string2, String string3, boolean bl3, String string4, List list, boolean bl4) {
        boolean bl5;
        ArrayList arrayList;
        boolean bl6 = true;
        if (bl3 && bl4) {
            bl6 = false;
        }
        String string5 = "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.";
        Preconditions.checkArgument(bl6, string5);
        this.zba = bl2;
        if (bl2) {
            arrayList = "serverClientId must be provided if Google ID tokens are requested";
            Preconditions.checkNotNull(string2, arrayList);
        }
        this.zbb = string2;
        this.zbc = string3;
        this.zbd = bl3;
        arrayList = BeginSignInRequest.CREATOR;
        bl2 = false;
        arrayList = null;
        if (list != null && !(bl5 = list.isEmpty())) {
            arrayList = new ArrayList(list);
            Collections.sort(arrayList);
        }
        this.zbf = arrayList;
        this.zbe = string4;
        this.zbg = bl4;
    }

    public static BeginSignInRequest$GoogleIdTokenRequestOptions$Builder builder() {
        BeginSignInRequest$GoogleIdTokenRequestOptions$Builder beginSignInRequest$GoogleIdTokenRequestOptions$Builder = new BeginSignInRequest$GoogleIdTokenRequestOptions$Builder();
        return beginSignInRequest$GoogleIdTokenRequestOptions$Builder;
    }

    public boolean equals(Object object) {
        boolean bl2;
        Object object2;
        Object object3;
        boolean bl3 = object instanceof BeginSignInRequest$GoogleIdTokenRequestOptions;
        if (!bl3) {
            return false;
        }
        object = (BeginSignInRequest$GoogleIdTokenRequestOptions)object;
        bl3 = this.zba;
        boolean bl4 = ((BeginSignInRequest$GoogleIdTokenRequestOptions)object).zba;
        return bl3 == bl4 && (bl3 = Objects.equal(object3 = this.zbb, object2 = ((BeginSignInRequest$GoogleIdTokenRequestOptions)object).zbb)) && (bl3 = Objects.equal(object3 = this.zbc, object2 = ((BeginSignInRequest$GoogleIdTokenRequestOptions)object).zbc)) && (bl3 = this.zbd) == (bl4 = ((BeginSignInRequest$GoogleIdTokenRequestOptions)object).zbd) && (bl3 = Objects.equal(object3 = this.zbe, object2 = ((BeginSignInRequest$GoogleIdTokenRequestOptions)object).zbe)) && (bl3 = Objects.equal(object3 = this.zbf, object2 = ((BeginSignInRequest$GoogleIdTokenRequestOptions)object).zbf)) && (bl3 = this.zbg) == (bl2 = ((BeginSignInRequest$GoogleIdTokenRequestOptions)object).zbg);
    }

    public boolean filterByAuthorizedAccounts() {
        return this.zbd;
    }

    public List getIdTokenDepositionScopes() {
        return this.zbf;
    }

    public String getLinkedServiceId() {
        return this.zbe;
    }

    public String getNonce() {
        return this.zbc;
    }

    public String getServerClientId() {
        return this.zbb;
    }

    public int hashCode() {
        Boolean bl2 = this.zba;
        String string2 = this.zbb;
        String string3 = this.zbc;
        Boolean bl3 = this.zbd;
        String string4 = this.zbe;
        List list = this.zbf;
        Boolean bl4 = this.zbg;
        Object[] objectArray = new Object[]{bl2, string2, string3, bl3, string4, list, bl4};
        return Objects.hashCode(objectArray);
    }

    public boolean isSupported() {
        return this.zba;
    }

    public boolean requestVerifiedPhoneNumber() {
        return this.zbg;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        boolean bl2 = this.isSupported();
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        String string2 = this.getServerClientId();
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        Object object = this.getNonce();
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        bl2 = this.filterByAuthorizedAccounts();
        SafeParcelWriter.writeBoolean(parcel, 4, bl2);
        object = this.getLinkedServiceId();
        SafeParcelWriter.writeString(parcel, 5, (String)object, false);
        object = this.getIdTokenDepositionScopes();
        SafeParcelWriter.writeStringList(parcel, 6, (List)object, false);
        bl2 = this.requestVerifiedPhoneNumber();
        SafeParcelWriter.writeBoolean(parcel, 7, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

