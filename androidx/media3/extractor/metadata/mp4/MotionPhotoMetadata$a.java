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
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;

public final class MotionPhotoMetadata$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        MotionPhotoMetadata motionPhotoMetadata = new MotionPhotoMetadata(parcel);
        return motionPhotoMetadata;
    }

    public final Object[] newArray(int n3) {
        return new MotionPhotoMetadata[n3];
    }
}

