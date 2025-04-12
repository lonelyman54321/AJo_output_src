/*
 * Decompiled with CFR 0.152.
 */
import com.google.accompanist.insets.WindowInsetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Ue3 {
    public static final void a(ob0_1 ob0_12, String string2, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        int n4 = 1109088792;
        object = object.g(n4);
        Function2 function2 = new xa0_1(string2, ob0_12);
        u10 u102 = v10.c(597389950, function2, (b30_0)object);
        int n7 = 384;
        int n8 = 3;
        WindowInsetsKt.ProvideWindowInsets(false, false, u102, (b30_0)object, n7, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            function2 = new ma0_0(ob0_12, string2, n3);
            ((CF2)object).d = function2;
        }
    }

    public static final boolean b(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }
}

