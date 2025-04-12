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
import com.google.android.gms.auth.api.identity.zbg;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class BeginSignInResult
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final PendingIntent zba;

    static {
        zbg zbg2 = new zbg();
        CREATOR = zbg2;
    }

    public BeginSignInResult(PendingIntent pendingIntent) {
        this.zba = pendingIntent = (PendingIntent)Preconditions.checkNotNull(pendingIntent);
    }

    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        PendingIntent pendingIntent = this.getPendingIntent();
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)pendingIntent, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

