/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.source.j$b;

public final class Vv0
implements Runnable {
    public final /* synthetic */ b$a a;
    public final /* synthetic */ b b;

    public /* synthetic */ Vv0(b$a b$a, b b2) {
        this.a = b$a;
        this.b = b2;
    }

    public final void run() {
        Object object = this.a;
        int n3 = ((b$a)object).a;
        object = ((b$a)object).b;
        this.b.b0(n3, (j$b)object);
    }
}

