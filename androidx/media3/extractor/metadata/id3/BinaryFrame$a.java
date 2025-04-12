/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.id3.BinaryFrame;

public final class BinaryFrame$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        BinaryFrame binaryFrame = new BinaryFrame(parcel);
        return binaryFrame;
    }

    public final Object[] newArray(int n3) {
        return new BinaryFrame[n3];
    }
}

