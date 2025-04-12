/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.source.j$b;

public final class Rv0
implements Runnable {
    public final /* synthetic */ b$a a;
    public final /* synthetic */ b b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ Rv0(b$a b$a, b b2, Exception exception) {
        this.a = b$a;
        this.b = b2;
        this.c = exception;
    }

    public final void run() {
        Object object = this.a;
        int n3 = ((b$a)object).a;
        object = ((b$a)object).b;
        b b2 = this.b;
        Exception exception = this.c;
        b2.S(n3, (j$b)object, exception);
    }
}

