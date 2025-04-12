/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 */
package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImpl$a;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesImplApi21$a
implements AudioAttributesImpl$a {
    public final AudioAttributes.Builder a;

    public AudioAttributesImplApi21$a() {
        AudioAttributes.Builder builder;
        this.a = builder = new AudioAttributes.Builder();
    }

    public AudioAttributesImpl build() {
        AudioAttributes audioAttributes = this.a.build();
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21(audioAttributes);
        return audioAttributesImplApi21;
    }
}

