/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;

class MediaSessionCompat$QueueItem$1
implements Parcelable.Creator {
    public MediaSessionCompat$QueueItem createFromParcel(Parcel parcel) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(parcel);
        return mediaSessionCompat$QueueItem;
    }

    public MediaSessionCompat$QueueItem[] newArray(int n3) {
        return new MediaSessionCompat$QueueItem[n3];
    }
}

