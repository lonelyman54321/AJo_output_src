/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import androidx.media.AudioAttributesImplBase;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        int n3;
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        int n4 = audioAttributesImplBase.a;
        audioAttributesImplBase.a = n4 = versionedParcel.j(n4, 1);
        n4 = audioAttributesImplBase.b;
        audioAttributesImplBase.b = n4 = versionedParcel.j(n4, 2);
        n4 = audioAttributesImplBase.c;
        audioAttributesImplBase.c = n4 = versionedParcel.j(n4, 3);
        n4 = audioAttributesImplBase.d;
        audioAttributesImplBase.d = n3 = versionedParcel.j(n4, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        int n3 = audioAttributesImplBase.a;
        versionedParcel.s(n3, 1);
        n3 = audioAttributesImplBase.b;
        versionedParcel.s(n3, 2);
        n3 = audioAttributesImplBase.c;
        versionedParcel.s(n3, 3);
        int n4 = audioAttributesImplBase.d;
        versionedParcel.s(n4, 4);
    }
}

