/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.video.f$a;

public final class sC3
implements Runnable {
    public final /* synthetic */ f$a a;
    public final /* synthetic */ Exception b;

    public /* synthetic */ sC3(f$a f$a, Exception exception) {
        this.a = f$a;
        this.b = exception;
    }

    public final void run() {
        Object object = this.a;
        object.getClass();
        object = ((f$a)object).b;
        Exception exception = this.b;
        object.n(exception);
    }
}

