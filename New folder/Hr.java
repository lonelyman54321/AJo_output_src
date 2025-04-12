/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.audio.AudioSink$a;
import androidx.media3.exoplayer.audio.b$a;

public final class Hr
implements Runnable {
    public final /* synthetic */ b$a a;
    public final /* synthetic */ AudioSink$a b;

    public /* synthetic */ Hr(b$a b$a, AudioSink$a audioSink$a) {
        this.a = b$a;
        this.b = audioSink$a;
    }

    public final void run() {
        Object object = this.a;
        object.getClass();
        object = ((b$a)object).b;
        AudioSink$a audioSink$a = this.b;
        object.g(audioSink$a);
    }
}

