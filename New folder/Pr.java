/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.audio.b$a;

public final class Pr
implements Runnable {
    public final /* synthetic */ b$a a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ Pr(b$a b$a, int n3, long l2, long l3) {
        this.a = b$a;
        this.b = n3;
        this.c = l2;
        this.d = l3;
    }

    public final void run() {
        b$a b$a = this.a;
        b$a.getClass();
        b b2 = b$a.b;
        int n3 = this.b;
        long l2 = this.c;
        long l3 = this.d;
        b2.y(n3, l2, l3);
    }
}

