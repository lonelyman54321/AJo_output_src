/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zau;

public final class zat
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    private final Account zab;
    private final int zac;
    private final GoogleSignInAccount zad;

    static {
        zau zau2 = new zau();
        CREATOR = zau2;
    }

    public zat(int n3, Account account, int n4, GoogleSignInAccount googleSignInAccount) {
        this.zaa = n3;
        this.zab = account;
        this.zac = n4;
        this.zad = googleSignInAccount;
    }

    public zat(Account account, int n3, GoogleSignInAccount googleSignInAccount) {
        this(2, account, n3, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zaa;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        Account account = this.zab;
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)account, n3, false);
        int n8 = this.zac;
        SafeParcelWriter.writeInt(parcel, 3, n8);
        GoogleSignInAccount googleSignInAccount = this.zad;
        SafeParcelWriter.writeParcelable(parcel, 4, googleSignInAccount, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

