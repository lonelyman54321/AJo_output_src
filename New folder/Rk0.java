/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.os.Handler
 */
import android.media.AudioTrack;
import android.os.Handler;
import androidx.media3.exoplayer.audio.AudioSink$a;
import androidx.media3.exoplayer.audio.AudioSink$b;
import androidx.media3.exoplayer.audio.DefaultAudioSink;

public final class Rk0
implements Runnable {
    public final /* synthetic */ AudioTrack a;
    public final /* synthetic */ AudioSink$b b;
    public final /* synthetic */ Handler c;
    public final /* synthetic */ AudioSink$a d;

    public /* synthetic */ Rk0(AudioTrack audioTrack, AudioSink$b b2, Handler handler, AudioSink$a audioSink$a) {
        this.a = audioTrack;
        this.b = b2;
        this.c = handler;
        this.d = audioSink$a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        Object object2;
        block11: {
            object2 = this.a;
            object = this.b;
            Object object3 = this.c;
            AudioSink$a audioSink$a = this.d;
            try {
                object2.flush();
                object2.release();
                if (object == null) break block11;
            }
            catch (Throwable throwable) {
                Runnable runnable2;
                boolean bl2;
                if (object != null && (bl2 = (runnable2 = object3.getLooper().getThread()).isAlive())) {
                    runnable2 = new Uk0((AudioSink$b)object, audioSink$a);
                    object3.post(runnable2);
                }
                object = DefaultAudioSink.k0;
                synchronized (object) {
                    Throwable throwable22;
                    block15: {
                        block12: {
                            try {
                                int n3;
                                DefaultAudioSink.m0 = n3 = DefaultAudioSink.m0 + -1;
                                if (n3 != 0) break block12;
                                object3 = DefaultAudioSink.l0;
                                object3.shutdown();
                                DefaultAudioSink.l0 = null;
                            }
                            catch (Throwable throwable22) {
                                break block15;
                            }
                        }
                        throw throwable;
                    }
                    throw throwable22;
                }
            }
            object2 = object3.getLooper().getThread();
            boolean bl3 = ((Thread)object2).isAlive();
            if (bl3) {
                object2 = new Uk0((AudioSink$b)object, audioSink$a);
                object3.post((Runnable)object2);
            }
        }
        object2 = DefaultAudioSink.k0;
        synchronized (object2) {
            Throwable throwable3;
            block14: {
                block13: {
                    try {
                        int n4;
                        DefaultAudioSink.m0 = n4 = DefaultAudioSink.m0 + -1;
                        if (n4 != 0) break block13;
                        object = DefaultAudioSink.l0;
                        object.shutdown();
                        DefaultAudioSink.l0 = null;
                    }
                    catch (Throwable throwable3) {
                        break block14;
                    }
                }
                return;
            }
            throw throwable3;
        }
    }
}

