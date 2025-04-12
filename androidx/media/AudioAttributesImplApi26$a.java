/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 */
package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi21$a;
import androidx.media.AudioAttributesImplApi26;

public final class AudioAttributesImplApi26$a
extends AudioAttributesImplApi21$a {
    public final AudioAttributesImpl build() {
        AudioAttributes audioAttributes = this.a.build();
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi21(audioAttributes);
        return audioAttributesImplApi26;
    }
}

