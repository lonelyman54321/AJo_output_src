/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class Xj
implements fk_0 {
    public final oj_1 a;
    public final oj_1 b;

    public Xj(oj_1 oj_12, oj_1 oj_13) {
        this.a = oj_12;
        this.b = oj_13;
    }

    public final iw_0 a() {
        es0_0 es0_02 = this.a.d();
        es0_0 es0_03 = this.b.d();
        va3_1 va3_12 = new va3_1(es0_02, es0_03);
        return va3_12;
    }

    public final List b() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
        throw unsupportedOperationException;
    }

    public final boolean c() {
        oj_1 oj_12 = this.a;
        boolean bl2 = oj_12.c();
        if (bl2 && (bl2 = (oj_12 = this.b).c())) {
            bl2 = true;
        } else {
            bl2 = false;
            oj_12 = null;
        }
        return bl2;
    }
}

