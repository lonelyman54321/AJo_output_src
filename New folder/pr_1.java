/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceCallback
 *  android.media.AudioManager
 */
import android.media.AudioDeviceCallback;
import android.media.AudioManager;

/*
 * Renamed from pr
 */
public final class pr_1 {
    public static /* bridge */ /* synthetic */ void a(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback) {
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}

