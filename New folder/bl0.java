/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceInfo
 *  android.media.AudioRouting
 *  android.media.AudioRouting$OnRoutingChangedListener
 */
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import androidx.media3.exoplayer.audio.DefaultAudioSink$h;
import androidx.media3.exoplayer.audio.a;

public final class bl0
implements AudioRouting.OnRoutingChangedListener {
    public final /* synthetic */ DefaultAudioSink$h a;

    public /* synthetic */ bl0(DefaultAudioSink$h defaultAudioSink$h) {
        this.a = defaultAudioSink$h;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        Object object = this.a;
        bl0 bl02 = ((DefaultAudioSink$h)object).c;
        if (bl02 != null && (bl02 = al0.a(audioRouting)) != null) {
            object = ((DefaultAudioSink$h)object).b;
            audioRouting = al0.a(audioRouting);
            ((a)object).b((AudioDeviceInfo)audioRouting);
        }
    }
}

