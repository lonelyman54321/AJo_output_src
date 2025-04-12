/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Cb2
 */
public final class cb2_1
implements Runnable {
    public final /* synthetic */ ou0_0 a;

    public /* synthetic */ cb2_1(ou0_0 ou0_02) {
        this.a = ou0_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        ou0_0 ou0_02 = this.a;
        try {
            ou0_02.b();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

