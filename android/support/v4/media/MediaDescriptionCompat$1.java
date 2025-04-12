/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDescription
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package android.support.v4.media;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

class MediaDescriptionCompat$1
implements Parcelable.Creator {
    public MediaDescriptionCompat createFromParcel(Parcel parcel) {
        return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    public MediaDescriptionCompat[] newArray(int n3) {
        return new MediaDescriptionCompat[n3];
    }
}

