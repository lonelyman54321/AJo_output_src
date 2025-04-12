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
import androidx.media3.extractor.metadata.scte35.SpliceCommand;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand$a;

public final class SpliceNullCommand
extends SpliceCommand {
    public static final Parcelable.Creator CREATOR;

    static {
        SpliceNullCommand$a spliceNullCommand$a = new Object();
        CREATOR = spliceNullCommand$a;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
    }
}

