/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vq3
 */
public final class vq3_0
implements lv_2 {
    public static final vq3_0 a;

    static {
        vq3_0 vq3_02;
        a = vq3_02 = new Object();
    }

    public final void a(da1_2 object, qg3_2 fx0_22) {
        fx0_22 = (ix0_2)fx0_22;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        object = ((da1_2)object).g;
        ks2_2 ks2_22 = nb1_2.h;
        uq3_0 uq3_02 = new uq3_0((ix0_2)fx0_22, null);
        ((hs2_2)object).g(ks2_22, uq3_02);
    }
}

