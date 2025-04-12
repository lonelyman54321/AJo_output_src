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
import androidx.media.AudioAttributesImplApi26;
import androidx.versionedparcelable.VersionedParcel;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        int n3;
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        AudioAttributes audioAttributes = audioAttributesImplApi26.a;
        boolean bl2 = versionedParcel.h(1);
        if (bl2) {
            audioAttributes = versionedParcel.k();
        }
        audioAttributesImplApi26.a = audioAttributes;
        int n4 = audioAttributesImplApi26.b;
        audioAttributesImplApi26.b = n3 = versionedParcel.j(n4, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.a;
        versionedParcel.n(1);
        versionedParcel.t((Parcelable)audioAttributes);
        int n3 = audioAttributesImplApi26.b;
        versionedParcel.s(n3, 2);
    }
}

