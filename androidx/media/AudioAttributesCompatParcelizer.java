/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        qB3 qB32 = audioAttributesCompat.a;
        boolean bl2 = versionedParcel.h(1);
        if (bl2) {
            qB32 = versionedParcel.m();
        }
        audioAttributesCompat.a = qB32;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat qB32, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        qB32 = qB32.a;
        versionedParcel.n(1);
        versionedParcel.v(qB32);
    }
}

