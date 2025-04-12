/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lL2
 */
public final class ll2_2
implements lv_2 {
    public static final ll2_2 a;

    static {
        ll2_2 ll2_22;
        a = ll2_22 = new Object();
    }

    public final void a(da1_2 object, qg3_2 fx0_22) {
        fx0_22 = (gx0_2)fx0_22;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        object = ((da1_2)object).i;
        ks2_2 ks2_22 = xa1_2.g;
        ml2_2 ml2_22 = new ml2_2((gx0_2)fx0_22, null);
        ((hs2_2)object).g(ks2_22, ml2_22);
    }
}

