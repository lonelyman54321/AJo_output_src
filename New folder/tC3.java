/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.exoplayer.video.f$a;

public final class tC3
implements Runnable {
    public final /* synthetic */ f$a a;
    public final /* synthetic */ d b;
    public final /* synthetic */ hj0 c;

    public /* synthetic */ tC3(f$a f$a, d d2, hj0 hj02) {
        this.a = f$a;
        this.b = d2;
        this.c = hj02;
    }

    public final void run() {
        Object object = this.a;
        object.getClass();
        object = ((f$a)object).b;
        d d2 = this.b;
        hj0 hj02 = this.c;
        object.c(d2, hj02);
    }
}

