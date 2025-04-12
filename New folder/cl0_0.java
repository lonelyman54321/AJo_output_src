/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.media.AudioTrack$StreamEventCallback
 */
import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.DefaultAudioSink$k$a;
import java.util.concurrent.Executor;

/*
 * Renamed from cl0
 */
public final class cl0_0 {
    public static /* bridge */ /* synthetic */ void a(AudioTrack audioTrack, dl0_0 dl0_02, DefaultAudioSink$k$a defaultAudioSink$k$a) {
        audioTrack.registerStreamEventCallback((Executor)dl0_02, (AudioTrack.StreamEventCallback)defaultAudioSink$k$a);
    }
}

