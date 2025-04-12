/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor$a;

public final class AudioProcessor$UnhandledAudioFormatException
extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(AudioProcessor$a object) {
        StringBuilder stringBuilder = new StringBuilder("Unhandled input format: ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        super((String)object);
    }
}

