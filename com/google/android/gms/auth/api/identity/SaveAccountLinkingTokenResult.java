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
import com.google.android.gms.auth.api.identity.zbq;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class SaveAccountLinkingTokenResult
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final PendingIntent zba;

    static {
        zbq zbq2 = new zbq();
        CREATOR = zbq2;
    }

    public SaveAccountLinkingTokenResult(PendingIntent pendingIntent) {
        this.zba = pendingIntent;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof SaveAccountLinkingTokenResult;
        if (!bl2) {
            return false;
        }
        object = (SaveAccountLinkingTokenResult)object;
        PendingIntent pendingIntent = this.zba;
        object = ((SaveAccountLinkingTokenResult)object).zba;
        return Objects.equal(pendingIntent, object);
    }

    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    public boolean hasResolution() {
        PendingIntent pendingIntent = this.zba;
        return pendingIntent != null;
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

