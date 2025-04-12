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
import com.google.android.gms.auth.api.identity.zbs;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class SavePasswordResult
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final PendingIntent zba;

    static {
        zbs zbs2 = new zbs();
        CREATOR = zbs2;
    }

    public SavePasswordResult(PendingIntent pendingIntent) {
        this.zba = pendingIntent = (PendingIntent)Preconditions.checkNotNull(pendingIntent);
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof SavePasswordResult;
        if (!bl2) {
            return false;
        }
        object = (SavePasswordResult)object;
        PendingIntent pendingIntent = this.zba;
        object = ((SavePasswordResult)object).zba;
        return Objects.equal(pendingIntent, object);
    }

    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.zba;
        Object[] objectArray = new Object[]{pendingIntent};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        PendingIntent pendingIntent = this.getPendingIntent();
        SafeParcelWriter.writeParcelable(parcel, 1, (Parcelable)pendingIntent, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

