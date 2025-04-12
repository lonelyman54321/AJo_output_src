/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yr1
 */
public class yr1_2 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static rq1_2 a(et1_2 object, Function0 object2) {
        void var0_5;
        rt3_0 rt3_02;
        Intrinsics.checkNotNullParameter(object, "mode");
        String string2 = "initializer";
        Intrinsics.checkNotNullParameter(rt3_02, string2);
        int[] nArray = yr1$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        int n7 = 2;
        if (n3 == n4) {
            string2 = null;
            hh3_2 hh3_22 = new hh3_2((Function0)((Object)rt3_02), null, n7, null);
            return var0_5;
        }
        if (n3 == n7) {
            Intrinsics.checkNotNullParameter(rt3_02, string2);
            er2_2 er2_22 = new Object();
            er2_22.a = rt3_02;
            rt3_02 = rt3_0.a;
            er2_22.b = rt3_02;
            return var0_5;
        }
        n4 = 3;
        if (n3 == n4) {
            Intrinsics.checkNotNullParameter(rt3_02, string2);
            mw3_0 mw3_02 = new Object();
            mw3_02.a = rt3_02;
            rt3_02 = rt3_0.a;
            mw3_02.b = rt3_02;
            return var0_5;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }

    public static hh3_2 b(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "initializer");
        hh3_2 hh3_22 = new hh3_2(function0, null, 2, null);
        return hh3_22;
    }
}

