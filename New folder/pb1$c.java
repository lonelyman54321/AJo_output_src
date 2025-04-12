/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class pb1$c
implements mz2_1 {
    public final gx0_2 a;
    public final mz2_1 b;

    public pb1$c(gx0_2 gx0_22, mz2_1 mz2_12) {
        Intrinsics.checkNotNullParameter(gx0_22, "interceptor");
        Intrinsics.checkNotNullParameter(mz2_12, "nextSender");
        this.a = gx0_22;
        this.b = mz2_12;
    }

    public final Object a(db1_2 db1_22, f80_0 f80_02) {
        gx0_2 gx0_22 = this.a;
        mz2_1 mz2_12 = this.b;
        return gx0_22.invoke(mz2_12, db1_22, f80_02);
    }
}

