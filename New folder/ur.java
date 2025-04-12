/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioFocusRequest$Builder
 *  android.media.AudioManager$OnAudioFocusChangeListener
 */
import android.media.AudioFocusRequest;
import android.media.AudioManager;

public final class ur {
    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder a(AudioFocusRequest.Builder builder, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        return builder.setOnAudioFocusChangeListener(onAudioFocusChangeListener);
    }
}

