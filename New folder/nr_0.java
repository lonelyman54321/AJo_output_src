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
 * Renamed from nr
 */
public final class nr_0 {
    public static /* bridge */ /* synthetic */ List a(AudioManager audioManager, AudioAttributes audioAttributes) {
        return audioManager.getDirectProfilesForAttributes(audioAttributes);
    }
}

