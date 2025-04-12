/*
 * Decompiled with CFR 0.152.
 */
public final class RI$b$a
extends ov0_2 {
    public final /* synthetic */ ri_2 b;
    public final /* synthetic */ RI$b c;

    public RI$b$a(ri_2 ri_22, RI$b rI$b, y63_0 y63_02) {
        this.b = ri_22;
        this.c = rI$b;
        super(y63_02);
    }

    public final void close() {
        ri_2 ri_22 = this.b;
        RI$b rI$b = this.c;
        synchronized (ri_22) {
            boolean bl2;
            block4: {
                bl2 = rI$b.d;
                if (!bl2) break block4;
                return;
            }
            bl2 = true;
            rI$b.d = bl2;
            // MONITOREXIT @DISABLED, blocks:[1, 2] lbl12 : MonitorExitStatement: MONITOREXIT : var1_1
            super.close();
            this.c.a.b();
            return;
        }
    }
}

