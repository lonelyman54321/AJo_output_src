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
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;

public final class SpliceNullCommand$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        object = new Object();
        return object;
    }

    public final Object[] newArray(int n3) {
        return new SpliceNullCommand[n3];
    }
}

