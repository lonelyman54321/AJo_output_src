/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.zza;
import com.google.android.play.core.review.zzb;

public abstract class ReviewInfo
implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        zzb zzb2 = new zzb();
        CREATOR = zzb2;
    }

    public static ReviewInfo zzc(PendingIntent pendingIntent, boolean bl2) {
        zza zza2 = new zza(pendingIntent, false);
        return zza2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        PendingIntent pendingIntent = this.zza();
        parcel.writeParcelable((Parcelable)pendingIntent, 0);
        n3 = (int)(this.zzb() ? 1 : 0);
        parcel.writeInt(n3);
    }

    public abstract PendingIntent zza();

    public abstract boolean zzb();
}

