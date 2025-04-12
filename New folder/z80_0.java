/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from z80
 */
public final class z80_0 {
    public static final z80_0 a;

    static {
        z80_0 z80_02;
        a = z80_02 = new Object();
    }

    public static final cc3_2 c(Function1 function1, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(function1, "factory");
        cc3_2 cc3_22 = new cc3_2(function1, fragment);
        return cc3_22;
    }

    public mz0_2 a(ob1_1 ob1_12) {
        Intrinsics.checkNotNullParameter(ob1_12, "url");
        return mz0_2.a;
    }

    public void b(ob1_1 ob1_12, List list) {
        Intrinsics.checkNotNullParameter(ob1_12, "url");
        Intrinsics.checkNotNullParameter(list, "cookies");
    }
}

