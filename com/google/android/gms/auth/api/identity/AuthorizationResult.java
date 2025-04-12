/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.zbe;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public final class AuthorizationResult
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final List zbd;
    private final GoogleSignInAccount zbe;
    private final PendingIntent zbf;

    static {
        zbe zbe2 = new zbe();
        CREATOR = zbe2;
    }

    public AuthorizationResult(String object, String string2, String string3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.zba = object;
        this.zbb = string2;
        this.zbc = string3;
        this.zbd = object = (List)Preconditions.checkNotNull(list);
        this.zbf = pendingIntent;
        this.zbe = googleSignInAccount;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof AuthorizationResult;
        if (!bl3) {
            return false;
        }
        object = (AuthorizationResult)object;
        Object object2 = this.zba;
        Object object3 = ((AuthorizationResult)object).zba;
        bl3 = Objects.equal(object2, object3);
        return bl3 && (bl3 = Objects.equal(object2 = this.zbb, object3 = ((AuthorizationResult)object).zbb)) && (bl3 = Objects.equal(object2 = this.zbc, object3 = ((AuthorizationResult)object).zbc)) && (bl3 = Objects.equal(object2 = this.zbd, object3 = ((AuthorizationResult)object).zbd)) && (bl3 = Objects.equal(object2 = this.zbf, object3 = ((AuthorizationResult)object).zbf)) && (bl2 = Objects.equal(object2 = this.zbe, object = ((AuthorizationResult)object).zbe));
    }

    public String getAccessToken() {
        return this.zbb;
    }

    public List getGrantedScopes() {
        return this.zbd;
    }

    public PendingIntent getPendingIntent() {
        return this.zbf;
    }

    public String getServerAuthCode() {
        return this.zba;
    }

    public boolean hasResolution() {
        PendingIntent pendingIntent = this.zbf;
        return pendingIntent != null;
    }

    public int hashCode() {
        String string2 = this.zba;
        String string3 = this.zbb;
        String string4 = this.zbc;
        List list = this.zbd;
        PendingIntent pendingIntent = this.zbf;
        GoogleSignInAccount googleSignInAccount = this.zbe;
        Object[] objectArray = new Object[]{string2, string3, string4, list, pendingIntent, googleSignInAccount};
        return Objects.hashCode(objectArray);
    }

    public GoogleSignInAccount toGoogleSignInAccount() {
        return this.zbe;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getServerAuthCode();
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        Object object = this.getAccessToken();
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        object = this.zbc;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        object = this.getGrantedScopes();
        SafeParcelWriter.writeStringList(parcel, 4, (List)object, false);
        object = this.toGoogleSignInAccount();
        SafeParcelWriter.writeParcelable(parcel, 5, (Parcelable)object, n3, false);
        object = this.getPendingIntent();
        SafeParcelWriter.writeParcelable(parcel, 6, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

