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
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder;
import com.google.android.gms.auth.api.identity.zbk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class GetSignInIntentRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final String zbd;
    private final boolean zbe;
    private final int zbf;

    static {
        zbk zbk2 = new zbk();
        CREATOR = zbk2;
    }

    public GetSignInIntentRequest(String string2, String string3, String string4, String string5, boolean bl2, int n3) {
        Preconditions.checkNotNull(string2);
        this.zba = string2;
        this.zbb = string3;
        this.zbc = string4;
        this.zbd = string5;
        this.zbe = bl2;
        this.zbf = n3;
    }

    public static GetSignInIntentRequest$Builder builder() {
        GetSignInIntentRequest$Builder getSignInIntentRequest$Builder = new GetSignInIntentRequest$Builder();
        return getSignInIntentRequest$Builder;
    }

    public static GetSignInIntentRequest$Builder zba(GetSignInIntentRequest object) {
        Preconditions.checkNotNull(object);
        GetSignInIntentRequest$Builder getSignInIntentRequest$Builder = GetSignInIntentRequest.builder();
        String string2 = ((GetSignInIntentRequest)object).getServerClientId();
        getSignInIntentRequest$Builder.setServerClientId(string2);
        string2 = ((GetSignInIntentRequest)object).getNonce();
        getSignInIntentRequest$Builder.setNonce(string2);
        string2 = ((GetSignInIntentRequest)object).getHostedDomainFilter();
        getSignInIntentRequest$Builder.filterByHostedDomain(string2);
        int n3 = ((GetSignInIntentRequest)object).zbe;
        getSignInIntentRequest$Builder.setRequestVerifiedPhoneNumber(n3 != 0);
        n3 = ((GetSignInIntentRequest)object).zbf;
        getSignInIntentRequest$Builder.zbb(n3);
        object = ((GetSignInIntentRequest)object).zbc;
        if (object != null) {
            getSignInIntentRequest$Builder.zba((String)object);
        }
        return getSignInIntentRequest$Builder;
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2;
        int n4 = object instanceof GetSignInIntentRequest;
        if (n4 == 0) {
            return false;
        }
        object = (GetSignInIntentRequest)object;
        Object object2 = this.zba;
        Object object3 = ((GetSignInIntentRequest)object).zba;
        n4 = Objects.equal(object2, object3);
        return n4 != 0 && (n4 = Objects.equal(object2 = this.zbd, object3 = ((GetSignInIntentRequest)object).zbd)) != 0 && (n4 = Objects.equal(object2 = this.zbb, object3 = ((GetSignInIntentRequest)object).zbb)) != 0 && (n4 = Objects.equal(object2 = Boolean.valueOf(this.zbe), object3 = Boolean.valueOf(bl2 = ((GetSignInIntentRequest)object).zbe))) != 0 && (n4 = this.zbf) == (n3 = ((GetSignInIntentRequest)object).zbf);
    }

    public String getHostedDomainFilter() {
        return this.zbb;
    }

    public String getNonce() {
        return this.zbd;
    }

    public String getServerClientId() {
        return this.zba;
    }

    public int hashCode() {
        String string2 = this.zba;
        String string3 = this.zbb;
        String string4 = this.zbd;
        Boolean bl2 = this.zbe;
        Integer n3 = this.zbf;
        Object[] objectArray = new Object[]{string2, string3, string4, bl2, n3};
        return Objects.hashCode(objectArray);
    }

    public boolean requestVerifiedPhoneNumber() {
        return this.zbe;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getServerClientId();
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        String string3 = this.getHostedDomainFilter();
        SafeParcelWriter.writeString(parcel, 2, string3, false);
        string3 = this.zbc;
        SafeParcelWriter.writeString(parcel, 3, string3, false);
        string3 = this.getNonce();
        SafeParcelWriter.writeString(parcel, 4, string3, false);
        int n4 = this.requestVerifiedPhoneNumber();
        SafeParcelWriter.writeBoolean(parcel, 5, n4 != 0);
        n4 = this.zbf;
        SafeParcelWriter.writeInt(parcel, 6, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

