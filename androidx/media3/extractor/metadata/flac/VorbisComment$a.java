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
import androidx.media3.extractor.metadata.flac.VorbisComment;

public final class VorbisComment$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        VorbisComment vorbisComment = new VorbisComment(parcel);
        return vorbisComment;
    }

    public final Object[] newArray(int n3) {
        return new VorbisComment[n3];
    }
}

