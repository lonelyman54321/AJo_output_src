/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jZ2
 */
public final class jz2_1
implements lv_2 {
    public static final jz2_1 a;

    static {
        jz2_1 jz2_12;
        a = jz2_12 = new Object();
    }

    public final void a(da1_2 object, qg3_2 fx0_22) {
        fx0_22 = (gx0_2)fx0_22;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        object = ((da1_2)object).h;
        ks2_2 ks2_22 = rb1_2.h;
        kz2_2 kz2_22 = new kz2_2((gx0_2)fx0_22, null);
        ((hs2_2)object).g(ks2_22, kz2_22);
    }
}

