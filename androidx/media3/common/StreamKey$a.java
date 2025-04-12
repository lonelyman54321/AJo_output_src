/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;

public final class StreamKey$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        StreamKey streamKey = new StreamKey(parcel);
        return streamKey;
    }

    public final Object[] newArray(int n3) {
        return new StreamKey[n3];
    }
}

