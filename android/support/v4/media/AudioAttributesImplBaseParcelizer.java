/*
 * Decompiled with CFR 0.152.
 */
package android.support.v4.media;

import androidx.media.AudioAttributesImplBase;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer
extends androidx.media.AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(versionedParcel);
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase, versionedParcel);
    }
}

