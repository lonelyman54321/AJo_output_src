/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Du
 */
public final class du_0
extends i0_0 {
    public sp1_0 a;

    public final boolean F(OP1 oP1) {
        boolean bl2;
        LB2 lB2 = this.a.getKey();
        if (oP1 == lB2) {
            bl2 = true;
        } else {
            bl2 = false;
            oP1 = null;
        }
        return bl2;
    }

    public final Object J(OP1 oP1) {
        boolean bl2;
        LB2 lB2 = this.a.getKey();
        if (oP1 == lB2) {
            bl2 = true;
        } else {
            bl2 = false;
            oP1 = null;
        }
        if (bl2) {
            return this.a.getValue();
        }
        bh1_1.c("Check failed.");
        throw null;
    }
}

