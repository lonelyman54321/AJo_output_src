/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from x5
 */
public final class x5_0
implements lv_2 {
    public static final x5_0 a;

    static {
        x5_0 x5_02;
        a = x5_02 = new Object();
    }

    public void a(da1_2 object, qg3_2 fx0_22) {
        fx0_22 = (Function2)fx0_22;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        object = ((da1_2)object).i;
        ks2_2 ks2_22 = xa1_2.h;
        v5_0 v5_02 = new v5_0((Function2)fx0_22, null);
        ((hs2_2)object).g(ks2_22, v5_02);
    }
}

