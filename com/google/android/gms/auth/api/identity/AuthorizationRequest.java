/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder;
import com.google.android.gms.auth.api.identity.zbd;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collection;
import java.util.List;

public class AuthorizationRequest
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    private final List zba;
    private final String zbb;
    private final boolean zbc;
    private final boolean zbd;
    private final Account zbe;
    private final String zbf;
    private final String zbg;
    private final boolean zbh;

    static {
        zbd zbd2 = new zbd();
        CREATOR = zbd2;
    }

    public AuthorizationRequest(List list, String string2, boolean bl2, boolean bl3, Account account, String string3, String string4, boolean bl4) {
        boolean bl5;
        boolean bl6 = false;
        if (list != null && !(bl5 = list.isEmpty())) {
            bl6 = true;
        }
        Preconditions.checkArgument(bl6, "requestedScopes cannot be null or empty");
        this.zba = list;
        this.zbb = string2;
        this.zbc = bl2;
        this.zbd = bl3;
        this.zbe = account;
        this.zbf = string3;
        this.zbg = string4;
        this.zbh = bl4;
    }

    public static AuthorizationRequest$Builder builder() {
        AuthorizationRequest$Builder authorizationRequest$Builder = new AuthorizationRequest$Builder();
        return authorizationRequest$Builder;
    }

    public static AuthorizationRequest$Builder zba(AuthorizationRequest authorizationRequest) {
        boolean bl2;
        boolean bl3;
        Preconditions.checkNotNull(authorizationRequest);
        AuthorizationRequest$Builder authorizationRequest$Builder = AuthorizationRequest.builder();
        List list = authorizationRequest.getRequestedScopes();
        authorizationRequest$Builder.setRequestedScopes(list);
        boolean bl4 = authorizationRequest.isForceCodeForRefreshToken();
        String string2 = authorizationRequest.zbg;
        String string3 = authorizationRequest.getHostedDomain();
        Account account = authorizationRequest.getAccount();
        String string4 = authorizationRequest.getServerClientId();
        if (string2 != null) {
            authorizationRequest$Builder.zbb(string2);
        }
        if (string3 != null) {
            authorizationRequest$Builder.filterByHostedDomain(string3);
        }
        if (account != null) {
            authorizationRequest$Builder.setAccount(account);
        }
        if ((bl3 = authorizationRequest.zbd) && string4 != null) {
            authorizationRequest$Builder.zba(string4);
        }
        if ((bl2 = authorizationRequest.isOfflineAccessRequested()) && string4 != null) {
            authorizationRequest$Builder.requestOfflineAccess(string4, bl4);
        }
        return authorizationRequest$Builder;
    }

    public boolean equals(Object object) {
        boolean bl2;
        Object object2;
        int n3;
        int n4 = object instanceof AuthorizationRequest;
        if (n4 == 0) {
            return false;
        }
        object = (AuthorizationRequest)object;
        Object object3 = this.zba;
        n4 = object3.size();
        return n4 == (n3 = (object2 = ((AuthorizationRequest)object).zba).size()) && (n4 = (int)((object3 = this.zba).containsAll((Collection<?>)(object2 = ((AuthorizationRequest)object).zba)) ? 1 : 0)) != 0 && (n4 = (int)(this.zbc ? 1 : 0)) == (n3 = (int)(((AuthorizationRequest)object).zbc ? 1 : 0)) && (n4 = (int)(this.zbh ? 1 : 0)) == (n3 = (int)(((AuthorizationRequest)object).zbh ? 1 : 0)) && (n4 = (int)(this.zbd ? 1 : 0)) == (n3 = (int)(((AuthorizationRequest)object).zbd ? 1 : 0)) && (n4 = (int)(Objects.equal(object3 = this.zbb, object2 = ((AuthorizationRequest)object).zbb) ? 1 : 0)) != 0 && (n4 = (int)(Objects.equal(object3 = this.zbe, object2 = ((AuthorizationRequest)object).zbe) ? 1 : 0)) != 0 && (n4 = (int)(Objects.equal(object3 = this.zbf, object2 = ((AuthorizationRequest)object).zbf) ? 1 : 0)) != 0 && (bl2 = Objects.equal(object3 = this.zbg, object = ((AuthorizationRequest)object).zbg));
    }

    public Account getAccount() {
        return this.zbe;
    }

    public String getHostedDomain() {
        return this.zbf;
    }

    public List getRequestedScopes() {
        return this.zba;
    }

    public String getServerClientId() {
        return this.zbb;
    }

    public int hashCode() {
        List list = this.zba;
        String string2 = this.zbb;
        Boolean bl2 = this.zbc;
        Boolean bl3 = this.zbh;
        Boolean bl4 = this.zbd;
        Account account = this.zbe;
        String string3 = this.zbf;
        String string4 = this.zbg;
        Object[] objectArray = new Object[]{list, string2, bl2, bl3, bl4, account, string3, string4};
        return Objects.hashCode(objectArray);
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zbh;
    }

    public boolean isOfflineAccessRequested() {
        return this.zbc;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getRequestedScopes();
        SafeParcelWriter.writeTypedList(parcel, 1, (List)object, false);
        String string2 = this.getServerClientId();
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        boolean bl2 = this.isOfflineAccessRequested();
        SafeParcelWriter.writeBoolean(parcel, 3, bl2);
        bl2 = this.zbd;
        SafeParcelWriter.writeBoolean(parcel, 4, bl2);
        string2 = this.getAccount();
        SafeParcelWriter.writeParcelable(parcel, 5, (Parcelable)string2, n3, false);
        object = this.getHostedDomain();
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        object = this.zbg;
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        boolean bl3 = this.isForceCodeForRefreshToken();
        SafeParcelWriter.writeBoolean(parcel, 8, bl3);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

