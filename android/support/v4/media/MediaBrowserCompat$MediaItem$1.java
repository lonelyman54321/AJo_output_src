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
import android.support.v4.media.MediaBrowserCompat$MediaItem;

class MediaBrowserCompat$MediaItem$1
implements Parcelable.Creator {
    public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = new MediaBrowserCompat$MediaItem(parcel);
        return mediaBrowserCompat$MediaItem;
    }

    public MediaBrowserCompat$MediaItem[] newArray(int n3) {
        return new MediaBrowserCompat$MediaItem[n3];
    }
}

