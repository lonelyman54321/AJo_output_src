/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.audio.AudioSink$a;
import androidx.media3.exoplayer.audio.b$a;

public final class Gr
implements Runnable {
    public final /* synthetic */ b$a a;
    public final /* synthetic */ AudioSink.a b;

    public /* synthetic */ Gr(b$a b$a, AudioSink.a a2) {
        this.a = b$a;
        this.b = a2;
    }

    public final void run() {
        Object object = this.a;
        object.getClass();
        object = ((b$a)object).b;
        AudioSink.a a2 = this.b;
        object.e(a2);
    }
}

