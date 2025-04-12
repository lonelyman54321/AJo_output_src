/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.search.zza;

public class GoogleNowAuthState
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    String zza;
    String zzb;
    long zzc;

    static {
        zza zza2 = new zza();
        CREATOR = zza2;
    }

    public GoogleNowAuthState(String string2, String string3, long l2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = l2;
    }

    public String getAccessToken() {
        return this.zzb;
    }

    public String getAuthCode() {
        return this.zza;
    }

    public long getNextAllowedTimeMillis() {
        return this.zzc;
    }

    public String toString() {
        String string2 = this.zza;
        String string3 = this.zzb;
        long l2 = this.zzc;
        int n3 = String.valueOf(string2).length();
        int n4 = String.valueOf(string3).length();
        n3 = n3 + 74 + n4;
        StringBuilder stringBuilder = new StringBuilder(n3);
        X50.a(stringBuilder, "mAuthCode = ", string2, "\nmAccessToken = ", string3);
        stringBuilder.append("\nmNextAllowedTimeMillis = ");
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.getAuthCode();
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        String string3 = this.getAccessToken();
        SafeParcelWriter.writeString(parcel, 2, string3, false);
        long l2 = this.getNextAllowedTimeMillis();
        SafeParcelWriter.writeLong(parcel, 3, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

