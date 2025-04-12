/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.video.VideoSink$a;
import androidx.media3.exoplayer.video.c$c;

/*
 * Renamed from mV1
 */
public final class mv1_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mv1_0(c$c c$c, VideoSink$a videoSink$a, wc3_0 wc3_02) {
        this.a = 1;
        this.b = c$c;
        this.c = videoSink$a;
    }

    public /* synthetic */ mv1_0(sV1 sV12, ml0_0 ml0_02) {
        this.a = 0;
        this.b = sV12;
        this.c = ml0_02;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                ((c$c)this.b).getClass();
                ((VideoSink$a)this.c).getClass();
                return;
            }
            case 0: 
        }
        n3 = ((sV1)this.b).c();
        ((sV1$a)this.c).a(n3);
    }
}

