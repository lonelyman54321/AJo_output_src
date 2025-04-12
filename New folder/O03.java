/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public class O03 {
    public static k03_0 a(k03_0 k03_02) {
        Intrinsics.checkNotNullParameter(k03_02, "builder");
        ng1_2 ng1_22 = k03_02.a;
        ng1_22.c();
        int n3 = ng1_22.i;
        if (n3 <= 0) {
            k03_02 = k03_0.b;
        }
        return k03_02;
    }

    public static Set b(Object set) {
        set = Collections.singleton(set);
        Intrinsics.checkNotNullExpressionValue(set, "singleton(...)");
        return set;
    }
}

