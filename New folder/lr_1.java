/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioManager
 */
import android.media.AudioAttributes;
import android.media.AudioManager;
import java.util.List;

/*
 * Renamed from lr
 */
public final class lr_1 {
    public static /* bridge */ /* synthetic */ List a(AudioManager audioManager, AudioAttributes audioAttributes) {
        return audioManager.getAudioDevicesForAttributes(audioAttributes);
    }
}

