/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from z5
 */
public final class z5_0
implements lv_2 {
    public static final z5_0 a;

    static {
        z5_0 z5_02;
        a = z5_02 = new Object();
    }

    public final void a(da1_2 da1_22, qg3_2 fx0_22) {
        fx0_22 = (gx0_2)fx0_22;
        Intrinsics.checkNotNullParameter(da1_22, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        ks2_2 ks2_22 = new ks2_2("ObservableContent");
        Object object = da1_22.f;
        ks2_2 ks2_23 = ib1_2.i;
        ((hs2_2)object).f(ks2_23, ks2_22);
        object = new y5_0((gx0_2)fx0_22, null);
        da1_22.f.g(ks2_22, (gx0_2)object);
    }
}

