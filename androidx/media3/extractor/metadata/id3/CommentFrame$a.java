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
import androidx.media3.extractor.metadata.id3.CommentFrame;

public final class CommentFrame$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        CommentFrame commentFrame = new CommentFrame(parcel);
        return commentFrame;
    }

    public final Object[] newArray(int n3) {
        return new CommentFrame[n3];
    }
}

