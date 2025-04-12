/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from MJ$a
 */
public final class mj$a_2
implements yr0_2 {
    public final jj_2 a;
    public volatile boolean b;

    public mj$a_2(jj_2 jj_22) {
        this.a = jj_22;
    }

    public final void dispose() {
        this.b = true;
        this.a.cancel();
    }

    public final boolean isDisposed() {
        return this.b;
    }
}

