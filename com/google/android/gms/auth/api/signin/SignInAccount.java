/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.zbc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class SignInAccount
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final String zba;
    final String zbb;
    private final GoogleSignInAccount zbc;

    static {
        zbc zbc2 = new zbc();
        CREATOR = zbc2;
    }

    public SignInAccount(String string2, GoogleSignInAccount googleSignInAccount, String string3) {
        this.zbc = googleSignInAccount;
        this.zba = string2 = Preconditions.checkNotEmpty(string2, "8.3 and 8.4 SDKs require non-null email");
        this.zbb = string2 = Preconditions.checkNotEmpty(string3, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zba;
        SafeParcelWriter.writeString(parcel, 4, string2, false);
        GoogleSignInAccount googleSignInAccount = this.zbc;
        SafeParcelWriter.writeParcelable(parcel, 7, googleSignInAccount, n3, false);
        string2 = this.zbb;
        SafeParcelWriter.writeString(parcel, 8, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final GoogleSignInAccount zba() {
        return this.zbc;
    }
}

