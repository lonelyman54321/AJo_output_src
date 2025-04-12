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
import androidx.media3.extractor.metadata.id3.ChapterFrame;

public final class ChapterFrame$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        ChapterFrame chapterFrame = new ChapterFrame(parcel);
        return chapterFrame;
    }

    public final Object[] newArray(int n3) {
        return new ChapterFrame[n3];
    }
}

