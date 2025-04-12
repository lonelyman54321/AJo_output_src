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
import androidx.media3.container.Mp4TimestampData;

public final class Mp4TimestampData$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Mp4TimestampData mp4TimestampData = new Mp4TimestampData(parcel);
        return mp4TimestampData;
    }

    public final Object[] newArray(int n3) {
        return new Mp4TimestampData[n3];
    }
}

