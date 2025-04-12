/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.d;

public final class AudioSink$ConfigurationException
extends Exception {
    public final d a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, d d2) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = d2;
    }

    public AudioSink$ConfigurationException(d d2, String string2) {
        super(string2);
        this.a = d2;
    }
}

