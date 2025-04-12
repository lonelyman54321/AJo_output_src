/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.ResultReceiver
 */
package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$1;

final class MediaSessionCompat$ResultReceiverWrapper
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    ResultReceiver mResultReceiver;

    static {
        MediaSessionCompat$ResultReceiverWrapper$1 mediaSessionCompat$ResultReceiverWrapper$1 = new MediaSessionCompat$ResultReceiverWrapper$1();
        CREATOR = mediaSessionCompat$ResultReceiverWrapper$1;
    }

    public MediaSessionCompat$ResultReceiverWrapper(Parcel parcel) {
        parcel = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
        this.mResultReceiver = parcel;
    }

    public MediaSessionCompat$ResultReceiverWrapper(ResultReceiver resultReceiver) {
        this.mResultReceiver = resultReceiver;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        this.mResultReceiver.writeToParcel(parcel, n3);
    }
}

