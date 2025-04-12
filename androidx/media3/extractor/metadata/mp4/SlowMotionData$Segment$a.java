/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment;

public final class SlowMotionData$Segment$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        long l2 = object.readLong();
        long l3 = object.readLong();
        int n3 = object.readInt();
        object = new SlowMotionData$Segment(l2, l3, n3);
        return object;
    }

    public final Object[] newArray(int n3) {
        return new SlowMotionData$Segment[n3];
    }
}

