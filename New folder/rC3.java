/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.video.f$a;

public final class rC3
implements Runnable {
    public final /* synthetic */ f$a a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ rC3(int n3, long l2, f$a f$a) {
        this.a = f$a;
        this.b = l2;
        this.c = n3;
    }

    public final void run() {
        Object object = this.a;
        object.getClass();
        object = ((f$a)object).b;
        long l2 = this.b;
        int n3 = this.c;
        object.q(n3, l2);
    }
}

