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
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;

public final class SpliceScheduleCommand$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        SpliceScheduleCommand spliceScheduleCommand = new SpliceScheduleCommand(parcel);
        return spliceScheduleCommand;
    }

    public final Object[] newArray(int n3) {
        return new SpliceScheduleCommand[n3];
    }
}

