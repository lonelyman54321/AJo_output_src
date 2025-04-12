/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sq3
 */
public final class sq3_0
implements lv_2 {
    public static final sq3_0 a;

    static {
        sq3_0 sq3_02;
        a = sq3_02 = new Object();
    }

    public final void a(da1_2 object, qg3_2 fx0_22) {
        fx0_22 = (ix0_2)fx0_22;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        object = ((da1_2)object).f;
        ks2_2 ks2_22 = ib1_2.h;
        rq3_0 rq3_02 = new rq3_0((ix0_2)fx0_22, null);
        ((hs2_2)object).g(ks2_22, rq3_02);
    }
}

