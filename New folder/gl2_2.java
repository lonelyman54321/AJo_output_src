/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gL2
 */
public final class gl2_2
implements lv_2 {
    public static final gl2_2 a;

    static {
        gl2_2 gl2_22;
        a = gl2_22 = new Object();
    }

    public final void a(da1_2 da1_22, qg3_2 fx0_22) {
        fx0_22 = (gx0_2)fx0_22;
        Intrinsics.checkNotNullParameter(da1_22, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        ks2_2 ks2_22 = new ks2_2("AfterState");
        Object object = da1_22.i;
        ks2_2 ks2_23 = xa1_2.g;
        ((hs2_2)object).f(ks2_23, ks2_22);
        object = new hl2_2((gx0_2)fx0_22, null);
        da1_22.i.g(ks2_22, (gx0_2)object);
    }
}

