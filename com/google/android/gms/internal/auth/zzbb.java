/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.auth.zzbc;

public final class zzbb
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    static {
        zzbc zzbc2 = new zzbc();
        CREATOR = zzbc2;
    }

    public zzbb(int n3, String string2, PendingIntent pendingIntent) {
        String string3;
        this.zza = 1;
        this.zzb = string3 = (String)Preconditions.checkNotNull(string2);
        string3 = (PendingIntent)Preconditions.checkNotNull(pendingIntent);
        this.zzc = string3;
    }

    public zzbb(String string2, PendingIntent pendingIntent) {
        this(1, string2, pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n7);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        PendingIntent pendingIntent = this.zzc;
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)pendingIntent, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

