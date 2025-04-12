/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Vt0
 */
public final class vt0_0
implements wr3 {
    public final int a;
    public wt0_0 b;

    public vt0_0(int n3) {
        this.a = n3;
    }

    public final qr3 a(pi0_0 object, boolean bl2) {
        pi0_0 pi0_02 = pi0_0.MEMORY_CACHE;
        if (object == pi0_02) {
            object = Q32.a;
        } else {
            object = this.b;
            if (object == null) {
                int n3 = this.a;
                this.b = object = new wt0_0(n3);
            }
            object = this.b;
        }
        return object;
    }
}

