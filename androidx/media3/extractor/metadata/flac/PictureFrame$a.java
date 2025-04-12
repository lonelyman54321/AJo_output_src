/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.metadata.flac.PictureFrame;

public final class PictureFrame$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        PictureFrame pictureFrame = new PictureFrame(parcel);
        return pictureFrame;
    }

    public final Object[] newArray(int n3) {
        return new PictureFrame[n3];
    }
}

