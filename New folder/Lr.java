/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.audio.b$a;

public final class Lr
implements Runnable {
    public final /* synthetic */ b$a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ Lr(b$a b$a, String string2, long l2, long l3) {
        this.a = b$a;
        this.b = string2;
        this.c = l2;
        this.d = l3;
    }

    public final void run() {
        b$a b$a = this.a;
        b$a.getClass();
        b b2 = b$a.b;
        String string2 = this.b;
        long l2 = this.c;
        long l3 = this.d;
        b2.v(l2, string2, l3);
    }
}

