/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.source.j$b;

public final class Tv0
implements Runnable {
    public final /* synthetic */ b$a a;
    public final /* synthetic */ b b;

    public /* synthetic */ Tv0(b$a b$a, b b2) {
        this.a = b$a;
        this.b = b2;
    }

    public final void run() {
        Object object = this.a;
        int n3 = ((b$a)object).a;
        object = ((b$a)object).b;
        this.b.l0(n3, (j$b)object);
    }
}

