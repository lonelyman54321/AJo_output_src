/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class AccountChangeEventsRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    int zzb;
    String zzc;
    Account zzd;

    static {
        zzb zzb2 = new zzb();
        CREATOR = zzb2;
    }

    public AccountChangeEventsRequest() {
        this.zza = 1;
    }

    public AccountChangeEventsRequest(int n3, int n4, String string2, Account account) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = string2;
        if (account == null && (n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0)) == 0) {
            Account account2;
            this.zzd = account2 = new Account(string2, "com.google");
            return;
        }
        this.zzd = account;
    }

    public Account getAccount() {
        return this.zzd;
    }

    public String getAccountName() {
        return this.zzc;
    }

    public int getEventIndex() {
        return this.zzb;
    }

    public AccountChangeEventsRequest setAccount(Account account) {
        this.zzd = account;
        return this;
    }

    public AccountChangeEventsRequest setAccountName(String string2) {
        this.zzc = string2;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int n3) {
        this.zzb = n3;
        return this;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n7);
        n7 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        String string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        Account account = this.zzd;
        SafeParcelWriter.writeParcelable(parcel, 4, (Parcelable)account, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

