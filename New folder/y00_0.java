/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;

/*
 * Renamed from y00
 */
public final class y00_0
implements lv_2 {
    public static final y00_0 a;

    static {
        y00_0 y00_02;
        a = y00_02 = new Object();
    }

    public static x00_0 b() {
        x00_0 x00_02 = new JobSupport(true);
        x00_02.h0(null);
        return x00_02;
    }

    public void a(da1_2 object, qg3_2 fx0_22) {
        fx0_22 = (gx0_2)fx0_22;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        object = ((da1_2)object).f;
        ks2_2 ks2_22 = ib1_2.i;
        qj2_2 qj2_22 = new qj2_2((gx0_2)fx0_22, null);
        ((hs2_2)object).g(ks2_22, qj2_22);
    }
}

