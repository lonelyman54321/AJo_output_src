/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.audio.b$a;

public final class Jr
implements Runnable {
    public final /* synthetic */ b$a a;
    public final /* synthetic */ Exception b;

    public /* synthetic */ Jr(b$a b$a, Exception exception) {
        this.a = b$a;
        this.b = exception;
    }

    public final void run() {
        Object object = this.a;
        object.getClass();
        object = ((b$a)object).b;
        Exception exception = this.b;
        object.k(exception);
    }
}

