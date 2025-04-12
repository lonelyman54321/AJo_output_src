/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.media3.exoplayer.ExoPlayer;

public final class cC3$c
implements Cr0 {
    public final /* synthetic */ ExoPlayer a;
    public final /* synthetic */ mu1_1 b;
    public final /* synthetic */ n c;

    public cC3$c(ExoPlayer exoPlayer, mu1_1 mu1_12, tb3_2 tb3_22) {
        this.a = exoPlayer;
        this.b = mu1_12;
        this.c = tb3_22;
    }

    public final void dispose() {
        Object object = this.a;
        object.stop();
        object.release();
        object = this.b.getLifecycle();
        n n3 = this.c;
        ((i)object).c(n3);
    }
}

