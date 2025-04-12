/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.account.zzb;
import com.google.android.gms.internal.auth.zzc;

public abstract class zza
extends com.google.android.gms.internal.auth.zzb
implements zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        int n7 = 1;
        if (n3 != n7) {
            n4 = 2;
            if (n3 != n4) {
                return false;
            }
            n3 = (int)(zzc.zzf(parcel) ? 1 : 0);
            zzc.zzb(parcel);
            this.zzc(n3 != 0);
        } else {
            Parcelable.Creator creator = Account.CREATOR;
            creator = (Account)zzc.zza(parcel, creator);
            zzc.zzb(parcel);
            this.zzb((Account)creator);
        }
        return n7;
    }
}

