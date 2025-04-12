/*
 * Decompiled with CFR 0.152.
 */
public final class iu2
implements Runnable {
    public final /* synthetic */ mu2 a;

    public /* synthetic */ iu2(mu2 mu22) {
        this.a = mu22;
    }

    public final void run() {
        mu2 mu22 = this.a;
        mu22.l.start();
        hu2_0 hu2_02 = mu22.u;
        mu22.e(2000L, hu2_02);
    }
}

