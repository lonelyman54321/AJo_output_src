/*
 * Decompiled with CFR 0.152.
 */
package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesCompatParcelizer
extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        return androidx.media.AudioAttributesCompatParcelizer.read(versionedParcel);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, versionedParcel);
    }
}

