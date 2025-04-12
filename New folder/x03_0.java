/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from X03
 */
public final class x03_0
implements lv_2 {
    public static final x03_0 a;

    static {
        x03_0 x03_02;
        a = x03_02 = new Object();
    }

    public static void b(Object object, String string2) {
        if (object != null) {
            return;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static void c(int n3, String string2) {
        if (n3 > 0) {
            return;
        }
        String string3 = LO1.a(n3, string2, " > 0 required but it was ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public void a(da1_2 object, qg3_2 fx0_22) {
        fx0_22 = (Function2)fx0_22;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(fx0_22, "handler");
        object = ((da1_2)object).f;
        ks2_2 ks2_22 = ib1_2.f;
        w03_0 w03_02 = new w03_0((Function2)fx0_22, null);
        ((hs2_2)object).g(ks2_22, w03_02);
    }
}

