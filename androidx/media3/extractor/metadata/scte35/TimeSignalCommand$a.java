/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;

public final class TimeSignalCommand$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        long l2 = parcel.readLong();
        long l3 = parcel.readLong();
        TimeSignalCommand timeSignalCommand = new TimeSignalCommand(l2, l3);
        return timeSignalCommand;
    }

    public final Object[] newArray(int n3) {
        return new TimeSignalCommand[n3];
    }
}

