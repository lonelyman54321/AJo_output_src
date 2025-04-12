/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;
import kotlinx.coroutines.d;

public final class OH3 {
    public static final long a;
    public static final /* synthetic */ int b;

    static {
        Intrinsics.checkNotNullExpressionValue(qx1.b("WorkConstraintsTracker"), "tagWithPrefix(\"WorkConstraintsTracker\")");
        a = 1000L;
    }

    public static final xl1_2 a(MH3 mH3, EI3 eI3, c object, t82 t822) {
        Intrinsics.checkNotNullParameter(mH3, "<this>");
        Intrinsics.checkNotNullParameter(eI3, "spec");
        Intrinsics.checkNotNullParameter(object, "dispatcher");
        Intrinsics.checkNotNullParameter(t822, "listener");
        xl1_2 xl1_22 = mm0.a();
        object = d.a(((a)object).plus(xl1_22));
        nh3_2 nh3_22 = new nh3_2(mH3, eI3, t822, null);
        Ae3.d((i90_0)object, null, null, nh3_22, 3);
        return xl1_22;
    }
}

