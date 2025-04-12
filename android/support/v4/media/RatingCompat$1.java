/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;

class RatingCompat$1
implements Parcelable.Creator {
    public RatingCompat createFromParcel(Parcel parcel) {
        int n3 = parcel.readInt();
        float f5 = parcel.readFloat();
        RatingCompat ratingCompat = new RatingCompat(n3, f5);
        return ratingCompat;
    }

    public RatingCompat[] newArray(int n3) {
        return new RatingCompat[n3];
    }
}

