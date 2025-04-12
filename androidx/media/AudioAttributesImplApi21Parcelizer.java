/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.os.Parcelable
 */
package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.media.AudioAttributesImplApi21;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        int n3;
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        boolean bl2 = versionedParcel.h(1);
        if (bl2) {
            audioAttributes = versionedParcel.k();
        }
        audioAttributesImplApi21.a = audioAttributes;
        int n4 = audioAttributesImplApi21.b;
        audioAttributesImplApi21.b = n3 = versionedParcel.j(n4, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        versionedParcel.n(1);
        versionedParcel.t((Parcelable)audioAttributes);
        int n3 = audioAttributesImplApi21.b;
        versionedParcel.s(n3, 2);
    }
}

