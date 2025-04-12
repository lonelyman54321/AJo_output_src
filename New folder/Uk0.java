/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import androidx.media3.exoplayer.audio.AudioSink$a;
import androidx.media3.exoplayer.audio.AudioSink$b;
import androidx.media3.exoplayer.audio.b$a;
import androidx.media3.exoplayer.audio.g$a;

public final class Uk0
implements Runnable {
    public final /* synthetic */ AudioSink$b a;
    public final /* synthetic */ AudioSink$a b;

    public /* synthetic */ Uk0(AudioSink$b audioSink$b, AudioSink$a audioSink$a) {
        this.a = audioSink$b;
        this.b = audioSink$a;
    }

    public final void run() {
        b$a b$a = ((g$a)this.a).a.U0;
        Handler handler = b$a.a;
        if (handler != null) {
            AudioSink$a audioSink$a = this.b;
            Hr hr = new Hr(b$a, audioSink$a);
            handler.post((Runnable)hr);
        }
    }
}

