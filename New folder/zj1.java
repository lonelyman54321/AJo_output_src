/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class zj1 {
    public final pb1_0 a;
    public final cw2_0 b;
    public boolean c;

    public zj1(pb1_0 pb1_02, cw2_0 cw2_02) {
        this.a = pb1_02;
        this.b = cw2_02;
    }

    public final boolean a(long l2) {
        dw2_1 dw2_12;
        boolean bl2;
        block3: {
            List list = this.b.a;
            int n3 = list.size();
            bl2 = false;
            for (int i3 = 0; i3 < n3; ++i3) {
                dw2_1 dw2_13 = dw2_12 = (dw2_1)list.get(i3);
                dw2_13 = dw2_12;
                long l3 = dw2_13.a;
                boolean bl3 = Yv2.a(l3, l2);
                if (!bl3) {
                    continue;
                }
                break block3;
            }
            dw2_12 = null;
        }
        dw2_12 = dw2_12;
        if (dw2_12 != null) {
            bl2 = dw2_12.h;
        }
        return bl2;
    }
}

