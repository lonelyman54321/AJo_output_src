/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cF2
 */
public final class cf2_2
implements lv_2 {
    public static final cf2_2 a;

    static {
        cf2_2 cf2_22;
        a = cf2_22 = new Object();
    }

    public final void a(da1_2 object, qg3_2 fx0_22) {
        fx0_22 = (gx0_2)fx0_22;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        object = ((da1_2)object).g;
        ks2_2 ks2_22 = nb1_2.f;
        df2_2 df2_22 = new df2_2((gx0_2)fx0_22, null);
        ((hs2_2)object).g(ks2_22, df2_22);
    }
}

