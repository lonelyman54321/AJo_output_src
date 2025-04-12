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
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;

class MediaSessionCompat$ResultReceiverWrapper$1
implements Parcelable.Creator {
    public MediaSessionCompat$ResultReceiverWrapper createFromParcel(Parcel parcel) {
        MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper(parcel);
        return mediaSessionCompat$ResultReceiverWrapper;
    }

    public MediaSessionCompat$ResultReceiverWrapper[] newArray(int n3) {
        return new MediaSessionCompat$ResultReceiverWrapper[n3];
    }
}

