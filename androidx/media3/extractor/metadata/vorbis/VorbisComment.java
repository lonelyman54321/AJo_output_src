/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.vorbis;

import android.os.Parcelable;
import androidx.media3.extractor.metadata.vorbis.VorbisComment$a;

public final class VorbisComment
extends androidx.media3.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator CREATOR;

    static {
        VorbisComment$a vorbisComment$a = new Object();
        CREATOR = vorbisComment$a;
    }
}

