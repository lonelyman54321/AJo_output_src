/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 */
package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;

public class AudioAttributesImplApi21
implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b;

    public AudioAttributesImplApi21() {
        this.b = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.a = audioAttributes;
        this.b = -1;
    }

    public final int a() {
        int n3 = this.b;
        int n4 = -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = this.a.getFlags();
        n4 = this.a.getUsage();
        return AudioAttributesCompat.b(n3, n4);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof AudioAttributesImplApi21;
        if (!bl2) {
            return false;
        }
        object = (AudioAttributesImplApi21)object;
        AudioAttributes audioAttributes = this.a;
        object = ((AudioAttributesImplApi21)object).a;
        return audioAttributes.equals(object);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioAttributesCompat: audioattributes=");
        AudioAttributes audioAttributes = this.a;
        stringBuilder.append(audioAttributes);
        return stringBuilder.toString();
    }
}

