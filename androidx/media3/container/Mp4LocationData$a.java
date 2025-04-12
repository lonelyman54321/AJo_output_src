/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.container.Mp4LocationData;

public final class Mp4LocationData$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Mp4LocationData mp4LocationData = new Mp4LocationData(parcel);
        return mp4LocationData;
    }

    public final Object[] newArray(int n3) {
        return new Mp4LocationData[n3];
    }
}

