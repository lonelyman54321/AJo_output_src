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
import android.support.v4.media.session.MediaSessionCompat$Token;

class MediaSessionCompat$Token$1
implements Parcelable.Creator {
    public MediaSessionCompat$Token createFromParcel(Parcel parcel) {
        parcel = parcel.readParcelable(null);
        MediaSessionCompat$Token mediaSessionCompat$Token = new MediaSessionCompat$Token(parcel);
        return mediaSessionCompat$Token;
    }

    public MediaSessionCompat$Token[] newArray(int n3) {
        return new MediaSessionCompat$Token[n3];
    }
}

