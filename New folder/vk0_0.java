/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceInfo
 *  android.media.AudioTrack
 */
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/*
 * Renamed from Vk0
 */
public final class vk0_0 {
    public static /* bridge */ /* synthetic */ void a(AudioTrack audioTrack, AudioDeviceInfo audioDeviceInfo) {
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}

