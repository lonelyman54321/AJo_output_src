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
import android.support.v4.media.session.PlaybackStateCompat$CustomAction;

class PlaybackStateCompat$CustomAction$1
implements Parcelable.Creator {
    public PlaybackStateCompat$CustomAction createFromParcel(Parcel parcel) {
        PlaybackStateCompat$CustomAction playbackStateCompat$CustomAction = new PlaybackStateCompat$CustomAction(parcel);
        return playbackStateCompat$CustomAction;
    }

    public PlaybackStateCompat$CustomAction[] newArray(int n3) {
        return new PlaybackStateCompat$CustomAction[n3];
    }
}

