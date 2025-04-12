/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioFocusRequest
 *  android.media.AudioManager
 */
import android.media.AudioFocusRequest;
import android.media.AudioManager;

public final class xr {
    public static /* bridge */ /* synthetic */ void a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }
}

