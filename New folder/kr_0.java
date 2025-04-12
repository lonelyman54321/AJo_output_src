/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioTrack
 */
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/*
 * Renamed from kr
 */
public final class kr_0 {
    public static /* bridge */ /* synthetic */ boolean a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioTrack.isDirectPlaybackSupported((AudioFormat)audioFormat, (AudioAttributes)audioAttributes);
    }
}

