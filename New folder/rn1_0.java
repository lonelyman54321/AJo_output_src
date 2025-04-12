/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.source.k;

/*
 * Renamed from rN1
 */
public final class rn1_0
implements Runnable {
    public final /* synthetic */ n60_0 a;
    public final /* synthetic */ k b;

    public /* synthetic */ rn1_0(n60_0 n60_02, k k2) {
        this.a = n60_02;
        this.b = k2;
    }

    public final void run() {
        n60_0 n60_02 = this.a;
        k k2 = this.b;
        n60_02.accept(k2);
    }
}

