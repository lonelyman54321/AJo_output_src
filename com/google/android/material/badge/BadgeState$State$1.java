/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.badge.BadgeState$State;

class BadgeState$State$1
implements Parcelable.Creator {
    public BadgeState$State createFromParcel(Parcel parcel) {
        BadgeState$State badgeState$State = new BadgeState$State(parcel);
        return badgeState$State;
    }

    public BadgeState$State[] newArray(int n3) {
        return new BadgeState$State[n3];
    }
}

