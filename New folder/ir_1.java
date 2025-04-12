/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 */
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/*
 * Renamed from ir
 */
public final class ir_1 {
    public static /* bridge */ /* synthetic */ AudioDeviceInfo[] a(AudioManager audioManager) {
        return audioManager.getDevices(2);
    }
}

