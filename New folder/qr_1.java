/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceCallback
 *  android.media.AudioManager
 *  android.os.Handler
 */
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;

/*
 * Renamed from qr
 */
public final class qr_1 {
    public static /* bridge */ /* synthetic */ void a(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
    }
}

