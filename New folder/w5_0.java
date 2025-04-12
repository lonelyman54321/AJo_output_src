/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from w5
 */
public final class w5_0
implements lv_2 {
    public static final w5_0 a;

    static {
        w5_0 w5_02;
        a = w5_02 = new Object();
    }

    public final void a(da1_2 object, qg3_2 fx0_22) {
        fx0_22 = (gx0_2)fx0_22;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        object = ((da1_2)object).i;
        ks2_2 ks2_22 = xa1_2.h;
        u5_0 u5_02 = new u5_0((gx0_2)fx0_22, null);
        ((hs2_2)object).g(ks2_22, u5_02);
    }
}

